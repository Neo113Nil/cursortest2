package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0773vg {
    public C0773vg(io.appmetrica.analytics.impl.Oa oa) {
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static io.appmetrica.analytics.impl.Oa a(android.content.Context context, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor) {
        io.appmetrica.analytics.impl.C0436ig c0436ig;
        if (io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c0436ig = new io.appmetrica.analytics.impl.C0436ig(context, iHandlerExecutor);
            } catch (java.lang.Throwable unused) {
            }
            return c0436ig != null ? new io.appmetrica.analytics.impl.C0747ug() : c0436ig;
        }
        c0436ig = null;
        if (c0436ig != null) {
        }
    }
}
