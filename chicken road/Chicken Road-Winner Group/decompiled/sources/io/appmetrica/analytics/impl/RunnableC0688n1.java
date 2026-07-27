package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0688n1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f7906c;

    public RunnableC0688n1(C0817s1 c0817s1, String str, String str2) {
        this.f7906c = c0817s1;
        this.f7904a = str;
        this.f7905b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1.a(this.f7906c).reportEvent(this.f7904a, this.f7905b);
    }
}
