package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.vb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0905vb {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f8506a;

    /* renamed from: b, reason: collision with root package name */
    public final Q2 f8507b;

    /* renamed from: c, reason: collision with root package name */
    public final RunnableC0931wb f8508c;

    public C0905vb(Handler handler, Q2 q22) {
        this.f8506a = handler;
        this.f8507b = q22;
        this.f8508c = new RunnableC0931wb(handler, q22);
    }

    public static void a(Handler handler, Q2 q22, Runnable runnable) {
        handler.removeCallbacks(runnable, q22.f6442b.f6383b.getApiKey());
        handler.postAtTime(runnable, q22.f6442b.f6383b.getApiKey(), SystemClock.uptimeMillis() + (((Integer) WrapUtils.getOrDefault(q22.f6442b.f6383b.getSessionTimeout(), 10)).intValue() * 500));
    }
}
