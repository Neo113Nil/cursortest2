package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1794xj implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16320k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Cj f16321l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E5 f16322m;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC1794xj(Cj cj, InterfaceViewOnClickListenerC0810bk interfaceViewOnClickListenerC0810bk, int i) {
        this.f16320k = i;
        switch (i) {
            case 1:
                this.f16321l = cj;
                this.f16322m = (E5) interfaceViewOnClickListenerC0810bk;
                break;
            default:
                this.f16321l = cj;
                this.f16322m = (E5) interfaceViewOnClickListenerC0810bk;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16320k) {
            case 0:
                this.f16321l.v(this.f16322m);
                break;
            default:
                this.f16321l.w(this.f16322m);
                break;
        }
    }
}
