package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0889p1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f8974b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f8975c;

    public RunnableC0889p1(C0966s1 c0966s1, String str, Throwable th) {
        this.f8975c = c0966s1;
        this.f8973a = str;
        this.f8974b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1.a(this.f8975c).reportError(this.f8973a, this.f8974b);
    }
}
