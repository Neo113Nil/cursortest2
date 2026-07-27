package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0544bi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f7946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0802li f7947c;

    public RunnableC0544bi(C0802li c0802li, String str, byte[] bArr) {
        this.f7947c = c0802li;
        this.f7945a = str;
        this.f7946b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f7947c;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).setSessionExtra(this.f7945a, this.f7946b);
    }
}
