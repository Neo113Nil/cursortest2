package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Yg implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker timePassedChecker = new io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker();
        io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider systemTimeProvider = new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider();
        io.appmetrica.analytics.impl.Ze y2 = io.appmetrica.analytics.impl.C0560na.f6484I.y();
        if (timePassedChecker.didTimePassMillis(y2.f(), java.util.concurrent.TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            kotlin.KotlinVersion kotlinVersion = kotlin.KotlinVersion.CURRENT;
            h1.C0172d c0172d = new h1.C0172d("major", java.lang.Integer.valueOf(kotlinVersion.getMajor()));
            h1.C0172d c0172d2 = new h1.C0172d("minor", java.lang.Integer.valueOf(kotlinVersion.getMinor()));
            h1.C0172d c0172d3 = new h1.C0172d("patch", java.lang.Integer.valueOf(kotlinVersion.getPatch()));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(kotlinVersion.getMajor());
            sb.append('.');
            sb.append(kotlinVersion.getMinor());
            sb.append('.');
            sb.append(kotlinVersion.getPatch());
            java.util.Map G = i1.AbstractC0202u.G(c0172d, c0172d2, c0172d3, new h1.C0172d("version", sb.toString()));
            io.appmetrica.analytics.impl.Qj qj = io.appmetrica.analytics.impl.AbstractC0595oj.f6598a;
            qj.getClass();
            qj.a(new io.appmetrica.analytics.impl.Pj("kotlin_version", G));
            y2.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}
