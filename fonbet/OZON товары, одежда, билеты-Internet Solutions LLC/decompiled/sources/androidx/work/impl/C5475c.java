package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* renamed from: androidx.work.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5475c {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f45426a = androidx.core.os.h.a(Looper.getMainLooper());

    public final void a(@NonNull Runnable runnable) {
        this.f45426a.removeCallbacks(runnable);
    }

    public final void b(@NonNull Runnable runnable, long j11) {
        this.f45426a.postDelayed(runnable, j11);
    }
}
