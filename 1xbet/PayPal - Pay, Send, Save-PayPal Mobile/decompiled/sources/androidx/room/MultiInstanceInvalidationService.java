package androidx.room;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u00108\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "maxClientId", com.visa.cbp.getEncExpo.warmup, "getMaxClientId$room_runtime", "()I", "setMaxClientId$room_runtime", "(I)V", "", "", "clientNames", "Ljava/util/Map;", "getClientNames$room_runtime", "()Ljava/util/Map;", "Landroid/os/RemoteCallbackList;", "Landroidx/room/IMultiInstanceInvalidationCallback;", "callbackList", "Landroid/os/RemoteCallbackList;", "getCallbackList$room_runtime", "()Landroid/os/RemoteCallbackList;", "Landroidx/room/IMultiInstanceInvalidationService$Stub;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/room/IMultiInstanceInvalidationService$Stub;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends android.app.Service {
    private int maxClientId;
    private final java.util.Map<java.lang.Integer, java.lang.String> clientNames = new java.util.LinkedHashMap();
    private final android.os.RemoteCallbackList<androidx.room.IMultiInstanceInvalidationCallback> callbackList = new android.os.RemoteCallbackList<androidx.room.IMultiInstanceInvalidationCallback>() { // from class: androidx.room.MultiInstanceInvalidationService$callbackList$1
        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(androidx.room.IMultiInstanceInvalidationCallback callback, java.lang.Object cookie) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookie, "");
            androidx.room.MultiInstanceInvalidationService.this.getClientNames$room_runtime().remove((java.lang.Integer) cookie);
        }
    };
    private final androidx.room.IMultiInstanceInvalidationService.Stub getHighResolutionOutputSizeshNQ4ISI = new androidx.room.IMultiInstanceInvalidationService.Stub() { // from class: androidx.room.MultiInstanceInvalidationService$binder$1
        @Override // androidx.room.IMultiInstanceInvalidationService
        public final int registerCallback(androidx.room.IMultiInstanceInvalidationCallback callback, java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
            int i = 0;
            if (name2 == null) {
                return 0;
            }
            android.os.RemoteCallbackList<androidx.room.IMultiInstanceInvalidationCallback> callbackList$room_runtime = androidx.room.MultiInstanceInvalidationService.this.getCallbackList$room_runtime();
            androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService = androidx.room.MultiInstanceInvalidationService.this;
            synchronized (callbackList$room_runtime) {
                multiInstanceInvalidationService.setMaxClientId$room_runtime(multiInstanceInvalidationService.getMaxClientId() + 1);
                int maxClientId = multiInstanceInvalidationService.getMaxClientId();
                if (multiInstanceInvalidationService.getCallbackList$room_runtime().register(callback, java.lang.Integer.valueOf(maxClientId))) {
                    multiInstanceInvalidationService.getClientNames$room_runtime().put(java.lang.Integer.valueOf(maxClientId), name2);
                    i = maxClientId;
                } else {
                    multiInstanceInvalidationService.setMaxClientId$room_runtime(multiInstanceInvalidationService.getMaxClientId() - 1);
                    multiInstanceInvalidationService.getMaxClientId();
                }
            }
            return i;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public final void unregisterCallback(androidx.room.IMultiInstanceInvalidationCallback callback, int clientId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
            android.os.RemoteCallbackList<androidx.room.IMultiInstanceInvalidationCallback> callbackList$room_runtime = androidx.room.MultiInstanceInvalidationService.this.getCallbackList$room_runtime();
            androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService = androidx.room.MultiInstanceInvalidationService.this;
            synchronized (callbackList$room_runtime) {
                multiInstanceInvalidationService.getCallbackList$room_runtime().unregister(callback);
                multiInstanceInvalidationService.getClientNames$room_runtime().remove(java.lang.Integer.valueOf(clientId));
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public final void broadcastInvalidation(int clientId, java.lang.String[] tables) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tables, "");
            android.os.RemoteCallbackList<androidx.room.IMultiInstanceInvalidationCallback> callbackList$room_runtime = androidx.room.MultiInstanceInvalidationService.this.getCallbackList$room_runtime();
            androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService = androidx.room.MultiInstanceInvalidationService.this;
            synchronized (callbackList$room_runtime) {
                java.lang.String str = multiInstanceInvalidationService.getClientNames$room_runtime().get(java.lang.Integer.valueOf(clientId));
                if (str == null) {
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.getCallbackList$room_runtime().beginBroadcast();
                for (int i = 0; i < beginBroadcast; i++) {
                    try {
                        java.lang.Object broadcastCookie = multiInstanceInvalidationService.getCallbackList$room_runtime().getBroadcastCookie(i);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(broadcastCookie, "");
                        int intValue = ((java.lang.Integer) broadcastCookie).intValue();
                        java.lang.String str2 = multiInstanceInvalidationService.getClientNames$room_runtime().get(java.lang.Integer.valueOf(intValue));
                        if (clientId != intValue && kotlin.jvm.internal.Intrinsics.areEqual(str, str2)) {
                            try {
                                multiInstanceInvalidationService.getCallbackList$room_runtime().getBroadcastItem(i).onInvalidation(tables);
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            } catch (android.os.RemoteException e) {
                                android.os.RemoteException remoteException = e;
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        multiInstanceInvalidationService.getCallbackList$room_runtime().finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.getCallbackList$room_runtime().finishBroadcast();
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            }
        }
    };

    /* renamed from: getMaxClientId$room_runtime, reason: from getter */
    public final int getMaxClientId() {
        return this.maxClientId;
    }

    public final void setMaxClientId$room_runtime(int i) {
        this.maxClientId = i;
    }

    public final java.util.Map<java.lang.Integer, java.lang.String> getClientNames$room_runtime() {
        return this.clientNames;
    }

    public final android.os.RemoteCallbackList<androidx.room.IMultiInstanceInvalidationCallback> getCallbackList$room_runtime() {
        return this.callbackList;
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
