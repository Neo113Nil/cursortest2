package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class So implements Mp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11586a;

    /* renamed from: b, reason: collision with root package name */
    public final C0606Hd f11587b;

    /* renamed from: c, reason: collision with root package name */
    public final Wq f11588c;

    public /* synthetic */ So(C0606Hd c0606Hd, Wq wq, int i) {
        this.f11586a = i;
        this.f11587b = c0606Hd;
        this.f11588c = wq;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final int a() {
        switch (this.f11586a) {
            case 0:
                return 5;
            default:
                return 21;
        }
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final E3.a d() {
        switch (this.f11586a) {
            case 0:
                return this.f11587b.d(new S4(8, this));
            default:
                return this.f11587b.d(new S4(18, this));
        }
    }
}
