package io.appmetrica.analytics.impl;

import d2.C0274d;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;

/* renamed from: io.appmetrica.analytics.impl.dh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0446dh implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        C0469ef z3 = C0878ua.f8414H.z();
        if (timePassedChecker.didTimePassMillis(z3.f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            C0274d c0274d = new C0274d("major", Integer.valueOf(kotlinVersion.getMajor()));
            C0274d c0274d2 = new C0274d("minor", Integer.valueOf(kotlinVersion.getMinor()));
            C0274d c0274d3 = new C0274d("patch", Integer.valueOf(kotlinVersion.getPatch()));
            StringBuilder sb = new StringBuilder();
            sb.append(kotlinVersion.getMajor());
            sb.append('.');
            sb.append(kotlinVersion.getMinor());
            sb.append('.');
            sb.append(kotlinVersion.getPatch());
            Map m02 = e2.r.m0(c0274d, c0274d2, c0274d3, new C0274d("version", sb.toString()));
            Vj vj = AbstractC0861tj.f8372a;
            vj.getClass();
            vj.a(new Uj("kotlin_version", m02));
            z3.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}
