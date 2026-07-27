package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.play_billing.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330f0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C0330f0 f5178d = new C0330f0();

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f5179a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5180b;

    /* renamed from: c, reason: collision with root package name */
    public C0330f0 f5181c;

    public C0330f0() {
        this.f5179a = null;
        this.f5180b = null;
    }

    public C0330f0(Runnable runnable, Executor executor) {
        this.f5179a = runnable;
        this.f5180b = executor;
    }
}
