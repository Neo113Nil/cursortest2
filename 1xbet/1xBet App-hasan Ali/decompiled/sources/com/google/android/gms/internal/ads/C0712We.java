package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.We, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0712We implements Cif {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12060k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1548s6 f12061l;

    public /* synthetic */ C0712We(C1548s6 c1548s6, int i) {
        this.f12060k = i;
        this.f12061l = c1548s6;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void n(String str, int i, String str2, boolean z3) {
        switch (this.f12060k) {
            case 0:
                this.f12061l.d();
                break;
            default:
                C1548s6 c1548s6 = this.f12061l;
                if (!z3) {
                    c1548s6.c(new C0858co("Image Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2, 1));
                    break;
                } else {
                    c1548s6.d();
                    break;
                }
        }
    }
}
