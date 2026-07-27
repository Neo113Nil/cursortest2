package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0837n1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f8834c;

    public RunnableC0837n1(C0966s1 c0966s1, String str, String str2) {
        this.f8834c = c0966s1;
        this.f8832a = str;
        this.f8833b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1.a(this.f8834c).reportEvent(this.f8832a, this.f8833b);
    }
}
