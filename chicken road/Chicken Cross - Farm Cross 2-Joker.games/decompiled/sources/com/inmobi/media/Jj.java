package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Jj {

    /* renamed from: a, reason: collision with root package name */
    public Ej f6654a;
    public final long b;

    public Jj(Ej view, long j) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f6654a = view;
        this.b = j;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.inmobi.media.Jj$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Jj.a(Jj.this);
            }
        }, this.b);
    }

    public static final void a(Jj jj) {
        Ej ej = jj.f6654a;
        if (ej != null) {
            ej.k();
        }
        jj.f6654a = null;
    }
}
