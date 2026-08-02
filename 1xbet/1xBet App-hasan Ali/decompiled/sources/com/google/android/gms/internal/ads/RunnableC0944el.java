package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.el, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0944el implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13330k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0989fl f13331l;

    public /* synthetic */ RunnableC0944el(C0989fl c0989fl, int i) {
        this.f13330k = i;
        this.f13331l = c0989fl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13330k) {
            case 0:
                this.f13331l.a();
                break;
            case 1:
                C0989fl c0989fl = this.f13331l;
                c0989fl.getClass();
                c0989fl.f13492c.execute(new RunnableC0944el(c0989fl, 2));
                break;
            default:
                this.f13331l.a();
                break;
        }
    }
}
