package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1227l implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14311k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0709Wb f14312l;

    public /* synthetic */ RunnableC1227l(int i, long j5, C0709Wb c0709Wb) {
        this.f14311k = 1;
        this.f14312l = c0709Wb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0709Wb c0709Wb = this.f14312l;
        int i = this.f14311k;
        c0709Wb.getClass();
        switch (i) {
            case 0:
                int i5 = AbstractC1260lo.f14419a;
                SE se = ((SurfaceHolderCallbackC0974fE) c0709Wb.f12041m).f13463k.f13883A;
                se.i(se.l(), 1016, new RE(2));
                break;
            case 1:
                int i6 = AbstractC1260lo.f14419a;
                SE se2 = ((SurfaceHolderCallbackC0974fE) c0709Wb.f12041m).f13463k.f13883A;
                se2.i(se2.j((C1603tG) se2.f11524d.f14582o), 1021, new QE(24));
                break;
            case 2:
                int i7 = AbstractC1260lo.f14419a;
                SE se3 = ((SurfaceHolderCallbackC0974fE) c0709Wb.f12041m).f13463k.f13883A;
                se3.i(se3.l(), 1030, new QE(11));
                break;
            case 3:
                int i8 = AbstractC1260lo.f14419a;
                SE se4 = ((SurfaceHolderCallbackC0974fE) c0709Wb.f12041m).f13463k.f13883A;
                se4.i(se4.l(), 1015, new RE(0));
                break;
            default:
                int i9 = AbstractC1260lo.f14419a;
                SE se5 = ((SurfaceHolderCallbackC0974fE) c0709Wb.f12041m).f13463k.f13883A;
                se5.i(se5.l(), 1019, new QE(19));
                break;
        }
    }

    public /* synthetic */ RunnableC1227l(C0709Wb c0709Wb, Object obj, int i) {
        this.f14311k = i;
        this.f14312l = c0709Wb;
    }

    public /* synthetic */ RunnableC1227l(C0709Wb c0709Wb, String str, long j5, long j6) {
        this.f14311k = 0;
        this.f14312l = c0709Wb;
    }
}
