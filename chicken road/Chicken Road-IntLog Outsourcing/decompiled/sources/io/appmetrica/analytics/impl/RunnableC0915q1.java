package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0915q1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9043b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f9044c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f9045d;

    public RunnableC0915q1(C0966s1 c0966s1, String str, String str2, Throwable th) {
        this.f9045d = c0966s1;
        this.f9042a = str;
        this.f9043b = str2;
        this.f9044c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1.a(this.f9045d).reportError(this.f9042a, this.f9043b, this.f9044c);
    }
}
