package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class No implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10815a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10816b;

    public /* synthetic */ No(int i, boolean z3) {
        this.f10815a = i;
        this.f10816b = z3;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* synthetic */ void k(Object obj) {
        switch (this.f10815a) {
            case 2:
                ((C0572Ch) obj).f8050b.putBoolean("is_gbid", this.f10816b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        switch (this.f10815a) {
            case 0:
                ((C0572Ch) obj).f8049a.putString("adid_p", true != this.f10816b ? "0" : "1");
                break;
            case 1:
                ((C0572Ch) obj).f8049a.putBoolean("ibrr", this.f10816b);
                break;
            case 2:
                ((C0572Ch) obj).f8049a.putBoolean("is_gbid", this.f10816b);
                break;
            default:
                C0572Ch c0572Ch = (C0572Ch) obj;
                if (this.f10816b) {
                    c0572Ch.f8049a.putBoolean("sdk_prefetch", true);
                    break;
                }
                break;
        }
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void b(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }
}
