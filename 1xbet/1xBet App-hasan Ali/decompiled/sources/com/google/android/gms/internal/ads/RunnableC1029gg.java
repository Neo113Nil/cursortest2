package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1029gg implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13629k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1041gs f13630l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f13631m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ A0.J0 f13632n;

    public /* synthetic */ RunnableC1029gg(C1041gs c1041gs, String str, A0.J0 j02, int i) {
        this.f13629k = i;
        this.f13630l = c1041gs;
        this.f13631m = str;
        this.f13632n = j02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13629k) {
            case 0:
                this.f13630l.b(this.f13631m, this.f13632n, null);
                break;
            default:
                this.f13630l.a(this.f13631m, this.f13632n);
                break;
        }
    }
}
