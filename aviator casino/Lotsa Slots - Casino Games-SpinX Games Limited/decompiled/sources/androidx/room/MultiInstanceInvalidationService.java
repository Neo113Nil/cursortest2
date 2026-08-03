package androidx.room;

/* compiled from: MultiInstanceInvalidationService.kt */
@androidx.room.ExperimentalRoomApi
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "()V", "binder", "Landroidx/room/IMultiInstanceInvalidationService$Stub;", "callbackList", "Landroid/os/RemoteCallbackList;", "Landroidx/room/IMultiInstanceInvalidationCallback;", "getCallbackList$room_runtime_release", "()Landroid/os/RemoteCallbackList;", "clientNames", "", "", "", "getClientNames$room_runtime_release", "()Ljava/util/Map;", "maxClientId", "getMaxClientId$room_runtime_release", "()I", "setMaxClientId$room_runtime_release", "(I)V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationService extends android.app.Service {
    private int maxClientId;
    private final java.util.Map<java.lang.Integer, java.lang.String> clientNames = new java.util.LinkedHashMap();
    private final android.os.RemoteCallbackList<androidx.room.IMultiInstanceInvalidationCallback> callbackList = new android.os.RemoteCallbackList<androidx.room.IMultiInstanceInvalidationCallback>() { // from class: androidx.room.MultiInstanceInvalidationService$callbackList$1
        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(androidx.room.IMultiInstanceInvalidationCallback callback, java.lang.Object cookie) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookie, "cookie");
            androidx.room.MultiInstanceInvalidationService.this.getClientNames$room_runtime_release().remove((java.lang.Integer) cookie);
        }
    };
    private final androidx.room.IMultiInstanceInvalidationService.Stub binder = new androidx.room.IMultiInstanceInvalidationService.Stub() { // from class: androidx.room.MultiInstanceInvalidationService$binder$1
        @Override // androidx.room.IMultiInstanceInvalidationService
        public int registerCallback(androidx.room.IMultiInstanceInvalidationCallback callback, java.lang.String name) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            int i = 0;
            if (name == null) {
                return 0;
            }
            android.os.RemoteCallbackList<androidx.room.IMultiInstanceInvalidationCallback> callbackList$room_runtime_release = androidx.room.MultiInstanceInvalidationService.this.getCallbackList$room_runtime_release();
            androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService = androidx.room.MultiInstanceInvalidationService.this;
            synchronized (callbackList$room_runtime_release) {
                multiInstanceInvalidationService.setMaxClientId$room_runtime_release(multiInstanceInvalidationService.getMaxClientId() + 1);
                int maxClientId = multiInstanceInvalidationService.getMaxClientId();
                if (multiInstanceInvalidationService.getCallbackList$room_runtime_release().register(callback, java.lang.Integer.valueOf(maxClientId))) {
                    multiInstanceInvalidationService.getClientNames$room_runtime_release().put(java.lang.Integer.valueOf(maxClientId), name);
                    i = maxClientId;
                } else {
                    multiInstanceInvalidationService.setMaxClientId$room_runtime_release(multiInstanceInvalidationService.getMaxClientId() - 1);
                    multiInstanceInvalidationService.getMaxClientId();
                }
            }
            return i;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void unregisterCallback(androidx.room.IMultiInstanceInvalidationCallback callback, int clientId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            android.os.RemoteCallbackList<androidx.room.IMultiInstanceInvalidationCallback> callbackList$room_runtime_release = androidx.room.MultiInstanceInvalidationService.this.getCallbackList$room_runtime_release();
            androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService = androidx.room.MultiInstanceInvalidationService.this;
            synchronized (callbackList$room_runtime_release) {
                multiInstanceInvalidationService.getCallbackList$room_runtime_release().unregister(callback);
                multiInstanceInvalidationService.getClientNames$room_runtime_release().remove(java.lang.Integer.valueOf(clientId));
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void broadcastInvalidation(int clientId, java.lang.String[] tables) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tables, "tables");
            android.os.RemoteCallbackList<androidx.room.IMultiInstanceInvalidationCallback> callbackList$room_runtime_release = androidx.room.MultiInstanceInvalidationService.this.getCallbackList$room_runtime_release();
            androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService = androidx.room.MultiInstanceInvalidationService.this;
            synchronized (callbackList$room_runtime_release) {
                java.lang.String str = multiInstanceInvalidationService.getClientNames$room_runtime_release().get(java.lang.Integer.valueOf(clientId));
                if (str == null) {
                    android.util.Log.w(androidx.room.Room.LOG_TAG, "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.getCallbackList$room_runtime_release().beginBroadcast();
                for (int i = 0; i < beginBroadcast; i++) {
                    try {
                        java.lang.Object broadcastCookie = multiInstanceInvalidationService.getCallbackList$room_runtime_release().getBroadcastCookie(i);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        java.lang.Integer num = (java.lang.Integer) broadcastCookie;
                        int intValue = num.intValue();
                        java.lang.String str2 = multiInstanceInvalidationService.getClientNames$room_runtime_release().get(num);
                        if (clientId != intValue && kotlin.jvm.internal.Intrinsics.areEqual(str, str2)) {
                            try {
                                multiInstanceInvalidationService.getCallbackList$room_runtime_release().getBroadcastItem(i).onInvalidation(tables);
                            } catch (android.os.RemoteException e) {
                                android.util.Log.w(androidx.room.Room.LOG_TAG, "Error invoking a remote callback", e);
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        multiInstanceInvalidationService.getCallbackList$room_runtime_release().finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.getCallbackList$room_runtime_release().finishBroadcast();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    };

    /* renamed from: getMaxClientId$room_runtime_release, reason: from getter */
    public final int getMaxClientId() {
        return this.maxClientId;
    }

    public final void setMaxClientId$room_runtime_release(int i) {
        this.maxClientId = i;
    }

    public final java.util.Map<java.lang.Integer, java.lang.String> getClientNames$room_runtime_release() {
        return this.clientNames;
    }

    public final android.os.RemoteCallbackList<androidx.room.IMultiInstanceInvalidationCallback> getCallbackList$room_runtime_release() {
        return this.callbackList;
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        return this.binder;
    }
}
