package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0740p1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f8039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f8040c;

    public RunnableC0740p1(C0817s1 c0817s1, String str, Throwable th) {
        this.f8040c = c0817s1;
        this.f8038a = str;
        this.f8039b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1.a(this.f8040c).reportError(this.f8038a, this.f8039b);
    }
}
