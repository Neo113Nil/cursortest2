package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f12187a = new Handler(Looper.getMainLooper());

    public final void a(Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f12187a.postAtTime(runnable, SystemClock.uptimeMillis() + j);
    }
}
