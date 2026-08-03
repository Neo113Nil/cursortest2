package androidx.room;

/* compiled from: MultiInstanceInvalidationClient.kt */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u00109\u001a\u00020:R\u0016\u0010\r\u001a\n \u000e*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0011\u0010/\u001a\u000200¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u00103\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b4\u0010(R\u0011\u00105\u001a\u000206¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Landroidx/room/MultiInstanceInvalidationClient;", "", "context", "Landroid/content/Context;", "name", "", "serviceIntent", "Landroid/content/Intent;", "invalidationTracker", "Landroidx/room/InvalidationTracker;", "executor", "Ljava/util/concurrent/Executor;", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroidx/room/InvalidationTracker;Ljava/util/concurrent/Executor;)V", "appContext", "kotlin.jvm.PlatformType", "callback", "Landroidx/room/IMultiInstanceInvalidationCallback;", "getCallback", "()Landroidx/room/IMultiInstanceInvalidationCallback;", "clientId", "", "getClientId", "()I", "setClientId", "(I)V", "getExecutor", "()Ljava/util/concurrent/Executor;", "getInvalidationTracker", "()Landroidx/room/InvalidationTracker;", "getName", "()Ljava/lang/String;", "observer", "Landroidx/room/InvalidationTracker$Observer;", "getObserver", "()Landroidx/room/InvalidationTracker$Observer;", "setObserver", "(Landroidx/room/InvalidationTracker$Observer;)V", "removeObserverRunnable", "Ljava/lang/Runnable;", "getRemoveObserverRunnable", "()Ljava/lang/Runnable;", androidx.core.app.NotificationCompat.CATEGORY_SERVICE, "Landroidx/room/IMultiInstanceInvalidationService;", "getService", "()Landroidx/room/IMultiInstanceInvalidationService;", "setService", "(Landroidx/room/IMultiInstanceInvalidationService;)V", "serviceConnection", "Landroid/content/ServiceConnection;", "getServiceConnection", "()Landroid/content/ServiceConnection;", "setUpRunnable", "getSetUpRunnable", com.ironsource.X3.i.h0, "Ljava/util/concurrent/atomic/AtomicBoolean;", "getStopped", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "stop", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationClient {
    private final android.content.Context appContext;
    private final androidx.room.IMultiInstanceInvalidationCallback callback;
    private int clientId;
    private final java.util.concurrent.Executor executor;
    private final androidx.room.InvalidationTracker invalidationTracker;
    private final java.lang.String name;
    public androidx.room.InvalidationTracker.Observer observer;
    private final java.lang.Runnable removeObserverRunnable;
    private androidx.room.IMultiInstanceInvalidationService service;
    private final android.content.ServiceConnection serviceConnection;
    private final java.lang.Runnable setUpRunnable;
    private final java.util.concurrent.atomic.AtomicBoolean stopped;

    public MultiInstanceInvalidationClient(android.content.Context context, java.lang.String name, android.content.Intent serviceIntent, androidx.room.InvalidationTracker invalidationTracker, java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        this.name = name;
        this.invalidationTracker = invalidationTracker;
        this.executor = executor;
        android.content.Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext;
        this.callback = new androidx.room.MultiInstanceInvalidationClient$callback$1(this);
        this.stopped = new java.util.concurrent.atomic.AtomicBoolean(false);
        android.content.ServiceConnection serviceConnection = new android.content.ServiceConnection() { // from class: androidx.room.MultiInstanceInvalidationClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(android.content.ComponentName name2, android.os.IBinder service) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "name");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(service, "service");
                androidx.room.MultiInstanceInvalidationClient.this.setService(androidx.room.IMultiInstanceInvalidationService.Stub.asInterface(service));
                androidx.room.MultiInstanceInvalidationClient.this.getExecutor().execute(androidx.room.MultiInstanceInvalidationClient.this.getSetUpRunnable());
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(android.content.ComponentName name2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "name");
                androidx.room.MultiInstanceInvalidationClient.this.getExecutor().execute(androidx.room.MultiInstanceInvalidationClient.this.getRemoveObserverRunnable());
                androidx.room.MultiInstanceInvalidationClient.this.setService(null);
            }
        };
        this.serviceConnection = serviceConnection;
        this.setUpRunnable = new java.lang.Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.MultiInstanceInvalidationClient.setUpRunnable$lambda$1(androidx.room.MultiInstanceInvalidationClient.this);
            }
        };
        this.removeObserverRunnable = new java.lang.Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.MultiInstanceInvalidationClient.removeObserverRunnable$lambda$2(androidx.room.MultiInstanceInvalidationClient.this);
            }
        };
        java.lang.Object[] array = invalidationTracker.getTableIdLookup$room_runtime_release().keySet().toArray(new java.lang.String[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        setObserver(new androidx.room.InvalidationTracker.Observer((java.lang.String[]) array) { // from class: androidx.room.MultiInstanceInvalidationClient.1
            @Override // androidx.room.InvalidationTracker.Observer
            public boolean isRemote$room_runtime_release() {
                return true;
            }

            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(java.util.Set<java.lang.String> tables) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tables, "tables");
                if (androidx.room.MultiInstanceInvalidationClient.this.getStopped().get()) {
                    return;
                }
                try {
                    androidx.room.IMultiInstanceInvalidationService service = androidx.room.MultiInstanceInvalidationClient.this.getService();
                    if (service != null) {
                        int clientId = androidx.room.MultiInstanceInvalidationClient.this.getClientId();
                        java.lang.Object[] array2 = tables.toArray(new java.lang.String[0]);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        service.broadcastInvalidation(clientId, (java.lang.String[]) array2);
                    }
                } catch (android.os.RemoteException e) {
                    android.util.Log.w(androidx.room.Room.LOG_TAG, "Cannot broadcast invalidation", e);
                }
            }
        });
        applicationContext.bindService(serviceIntent, serviceConnection, 1);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final androidx.room.InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public final java.util.concurrent.Executor getExecutor() {
        return this.executor;
    }

    public final int getClientId() {
        return this.clientId;
    }

    public final void setClientId(int i) {
        this.clientId = i;
    }

    public final androidx.room.InvalidationTracker.Observer getObserver() {
        androidx.room.InvalidationTracker.Observer observer = this.observer;
        if (observer != null) {
            return observer;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("observer");
        return null;
    }

    public final void setObserver(androidx.room.InvalidationTracker.Observer observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "<set-?>");
        this.observer = observer;
    }

    public final androidx.room.IMultiInstanceInvalidationService getService() {
        return this.service;
    }

    public final void setService(androidx.room.IMultiInstanceInvalidationService iMultiInstanceInvalidationService) {
        this.service = iMultiInstanceInvalidationService;
    }

    public final androidx.room.IMultiInstanceInvalidationCallback getCallback() {
        return this.callback;
    }

    public final java.util.concurrent.atomic.AtomicBoolean getStopped() {
        return this.stopped;
    }

    public final android.content.ServiceConnection getServiceConnection() {
        return this.serviceConnection;
    }

    public final java.lang.Runnable getSetUpRunnable() {
        return this.setUpRunnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpRunnable$lambda$1(androidx.room.MultiInstanceInvalidationClient this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            androidx.room.IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this$0.service;
            if (iMultiInstanceInvalidationService != null) {
                this$0.clientId = iMultiInstanceInvalidationService.registerCallback(this$0.callback, this$0.name);
                this$0.invalidationTracker.addObserver(this$0.getObserver());
            }
        } catch (android.os.RemoteException e) {
            android.util.Log.w(androidx.room.Room.LOG_TAG, "Cannot register multi-instance invalidation callback", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeObserverRunnable$lambda$2(androidx.room.MultiInstanceInvalidationClient this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.invalidationTracker.removeObserver(this$0.getObserver());
    }

    public final java.lang.Runnable getRemoveObserverRunnable() {
        return this.removeObserverRunnable;
    }

    public final void stop() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.removeObserver(getObserver());
            try {
                androidx.room.IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.service;
                if (iMultiInstanceInvalidationService != null) {
                    iMultiInstanceInvalidationService.unregisterCallback(this.callback, this.clientId);
                }
            } catch (android.os.RemoteException e) {
                android.util.Log.w(androidx.room.Room.LOG_TAG, "Cannot unregister multi-instance invalidation callback", e);
            }
            this.appContext.unbindService(this.serviceConnection);
        }
    }
}
