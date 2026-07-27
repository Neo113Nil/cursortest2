package io.appmetrica.analytics.impl;

import f4.C0430g;
import g4.AbstractC0476u;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;

/* renamed from: io.appmetrica.analytics.impl.dh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0595dh implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        C0618ef z = C1027ua.f9366H.z();
        if (timePassedChecker.didTimePassMillis(z.f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            C0430g c0430g = new C0430g("major", Integer.valueOf(kotlinVersion.getMajor()));
            C0430g c0430g2 = new C0430g("minor", Integer.valueOf(kotlinVersion.getMinor()));
            C0430g c0430g3 = new C0430g("patch", Integer.valueOf(kotlinVersion.getPatch()));
            StringBuilder sb = new StringBuilder();
            sb.append(kotlinVersion.getMajor());
            sb.append('.');
            sb.append(kotlinVersion.getMinor());
            sb.append('.');
            sb.append(kotlinVersion.getPatch());
            Map Y5 = AbstractC0476u.Y(c0430g, c0430g2, c0430g3, new C0430g("version", sb.toString()));
            Vj vj = AbstractC1010tj.f9323a;
            vj.getClass();
            vj.a(new Uj("kotlin_version", Y5));
            z.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}
