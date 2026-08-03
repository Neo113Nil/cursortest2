package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.o3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0579o3 implements io.appmetrica.analytics.impl.InterfaceC0867z6 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0867z6
    public final void a(android.content.Context context) {
        java.util.concurrent.CountDownLatch countDownLatch = io.appmetrica.analytics.impl.A5.f4032a;
        if (countDownLatch != null) {
            countDownLatch.await(1L, java.util.concurrent.TimeUnit.SECONDS);
            try {
                context.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(context, (java.lang.Class<?>) io.appmetrica.analytics.internal.PreloadInfoContentProvider.class), 2, 1);
                io.appmetrica.analytics.internal.PreloadInfoContentProvider preloadInfoContentProvider = io.appmetrica.analytics.impl.A5.f4033b;
                if (preloadInfoContentProvider != null) {
                    preloadInfoContentProvider.disable();
                }
            } catch (java.lang.Throwable unused) {
            }
            io.appmetrica.analytics.impl.A5.f4032a = null;
        }
    }
}
