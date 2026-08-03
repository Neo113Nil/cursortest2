package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public class H3 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Bf f4367a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.internal.CounterConfiguration f4368b;

    public H3(io.appmetrica.analytics.impl.Bf bf, io.appmetrica.analytics.internal.CounterConfiguration counterConfiguration) {
        this.f4367a = bf;
        this.f4368b = counterConfiguration;
    }

    public static io.appmetrica.analytics.impl.H3 a(android.content.Context context, android.os.Bundle bundle) {
        io.appmetrica.analytics.impl.Bf bf;
        io.appmetrica.analytics.internal.CounterConfiguration fromBundle;
        java.lang.String str = io.appmetrica.analytics.impl.Bf.f4122c;
        if (bundle != null) {
            try {
                bf = (io.appmetrica.analytics.impl.Bf) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (java.lang.Throwable unused) {
            }
            fromBundle = io.appmetrica.analytics.internal.CounterConfiguration.fromBundle(bundle);
            if (fromBundle == null && bf != null && context.getPackageName().equals(bf.f4123a.getAsString("PROCESS_CFG_PACKAGE_NAME")) && bf.f4123a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() == io.appmetrica.analytics.AppMetrica.getLibraryApiLevel()) {
                return new io.appmetrica.analytics.impl.H3(bf, fromBundle);
            }
            return null;
        }
        bf = null;
        fromBundle = io.appmetrica.analytics.internal.CounterConfiguration.fromBundle(bundle);
        if (fromBundle == null) {
        }
        return null;
    }

    public final io.appmetrica.analytics.internal.CounterConfiguration b() {
        return this.f4368b;
    }

    public final java.lang.String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f4367a + ", mCounterConfiguration=" + this.f4368b + '}';
    }

    public final io.appmetrica.analytics.impl.Bf a() {
        return this.f4367a;
    }
}
