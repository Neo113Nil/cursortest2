package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0766q1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8105b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f8106c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f8107d;

    public RunnableC0766q1(C0817s1 c0817s1, String str, String str2, Throwable th) {
        this.f8107d = c0817s1;
        this.f8104a = str;
        this.f8105b = str2;
        this.f8106c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1.a(this.f8107d).reportError(this.f8104a, this.f8105b, this.f8106c);
    }
}
