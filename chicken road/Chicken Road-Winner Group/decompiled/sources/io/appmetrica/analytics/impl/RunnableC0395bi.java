package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0395bi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7059a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f7060b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0653li f7061c;

    public RunnableC0395bi(C0653li c0653li, String str, byte[] bArr) {
        this.f7061c = c0653li;
        this.f7059a = str;
        this.f7060b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f7061c;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).setSessionExtra(this.f7059a, this.f7060b);
    }
}
