package io.appmetrica.analytics.network.internal;

/* loaded from: classes.dex */
public class NetworkClientServiceLocator {

    /* renamed from: b, reason: collision with root package name */
    private static volatile io.appmetrica.analytics.network.internal.NetworkClientServiceLocator f7324b;

    /* renamed from: a, reason: collision with root package name */
    private final android.os.Bundle f7325a;

    public NetworkClientServiceLocator(android.os.Bundle bundle) {
        this.f7325a = bundle;
    }

    public static io.appmetrica.analytics.network.internal.NetworkClientServiceLocator getInstance() {
        return f7324b;
    }

    public static void init(android.content.Context context) {
        init(context, new io.appmetrica.analytics.coreutils.internal.services.SafePackageManager());
    }

    public android.os.Bundle getApplicationMetaData() {
        return this.f7325a;
    }

    public static void init(android.content.Context context, io.appmetrica.analytics.coreutils.internal.services.SafePackageManager safePackageManager) {
        if (f7324b == null) {
            synchronized (io.appmetrica.analytics.network.internal.NetworkClientServiceLocator.class) {
                try {
                    if (f7324b == null) {
                        f7324b = new io.appmetrica.analytics.network.internal.NetworkClientServiceLocator(safePackageManager.getApplicationMetaData(context));
                    }
                } finally {
                }
            }
        }
    }
}
