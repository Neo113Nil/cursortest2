package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public final class NetworkServiceLocator implements io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver {
    public static final io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator.Companion Companion = new io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator.Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static volatile io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator f7405b;

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.networktasks.internal.NetworkCore f7406a;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator getInstance() {
            io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator networkServiceLocator = io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator.f7405b;
            if (networkServiceLocator != null) {
                return networkServiceLocator;
            }
            kotlin.jvm.internal.i.i("instance");
            throw null;
        }

        public final void init(android.content.Context context, io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy iExecutionPolicy) {
            if (io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator.f7405b == null) {
                synchronized (io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator.class) {
                    if (io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator.f7405b == null) {
                        io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator.f7405b = new io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator(iExecutionPolicy);
                    }
                }
            }
            io.appmetrica.analytics.network.internal.NetworkClientServiceLocator.init(context);
        }

        private Companion() {
        }

        public final void init(io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator networkServiceLocator) {
            io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator.f7405b = networkServiceLocator;
        }
    }

    public NetworkServiceLocator(io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy iExecutionPolicy) {
        io.appmetrica.analytics.networktasks.internal.NetworkCore networkCore = new io.appmetrica.analytics.networktasks.internal.NetworkCore(iExecutionPolicy);
        networkCore.setName("IAA-NC");
        networkCore.start();
        this.f7406a = networkCore;
    }

    public static final io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator getInstance() {
        return Companion.getInstance();
    }

    public static final void init(android.content.Context context, io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy iExecutionPolicy) {
        Companion.init(context, iExecutionPolicy);
    }

    public final io.appmetrica.analytics.networktasks.internal.NetworkCore getNetworkCore() {
        return this.f7406a;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onCreate() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onDestroy() {
        this.f7406a.stopTasks();
    }

    public static final void init(io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator networkServiceLocator) {
        Companion.init(networkServiceLocator);
    }
}
