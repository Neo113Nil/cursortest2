package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0455e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f7179c;

    public RunnableC0455e1(C0817s1 c0817s1, String str, String str2) {
        this.f7179c = c0817s1;
        this.f7177a = str;
        this.f7178b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0946x0 c0946x0 = this.f7179c.f8271a;
        String str = this.f7177a;
        String str2 = this.f7178b;
        c0946x0.getClass();
        C0920w0.c().putAppEnvironmentValue(str, str2);
    }
}
