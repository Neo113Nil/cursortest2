package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* loaded from: classes.dex */
public class P3 {

    /* renamed from: a, reason: collision with root package name */
    public final Gf f6382a;

    /* renamed from: b, reason: collision with root package name */
    public final CounterConfiguration f6383b;

    public P3(Gf gf, CounterConfiguration counterConfiguration) {
        this.f6382a = gf;
        this.f6383b = counterConfiguration;
    }

    public static P3 a(Context context, Bundle bundle) {
        Gf gf;
        CounterConfiguration fromBundle;
        String str = Gf.f5991c;
        if (bundle != null) {
            try {
                gf = (Gf) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
            fromBundle = CounterConfiguration.fromBundle(bundle);
            if (fromBundle == null && gf != null && context.getPackageName().equals(gf.f5992a.getAsString("PROCESS_CFG_PACKAGE_NAME")) && gf.f5992a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() == AppMetrica.getLibraryApiLevel()) {
                return new P3(gf, fromBundle);
            }
            return null;
        }
        gf = null;
        fromBundle = CounterConfiguration.fromBundle(bundle);
        if (fromBundle == null) {
        }
        return null;
    }

    public final CounterConfiguration b() {
        return this.f6383b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f6382a + ", mCounterConfiguration=" + this.f6383b + '}';
    }

    public final Gf a() {
        return this.f6382a;
    }
}
