package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0978fa implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13468k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1068ha f13469l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f13470m;

    public /* synthetic */ RunnableC0978fa(C1068ha c1068ha, String str, int i) {
        this.f13468k = i;
        this.f13469l = c1068ha;
        this.f13470m = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13468k) {
            case 0:
                this.f13469l.f13758k.loadUrl(this.f13470m);
                break;
            case 1:
                this.f13469l.f13758k.d(this.f13470m);
                break;
            case 2:
                this.f13469l.f13758k.loadData(this.f13470m, "text/html", "UTF-8");
                break;
            default:
                this.f13469l.f13758k.loadData(this.f13470m, "text/html", "UTF-8");
                break;
        }
    }
}
