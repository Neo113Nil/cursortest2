package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Xg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721Xg implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12205a;

    /* renamed from: b, reason: collision with root package name */
    public final C0709Wb f12206b;

    public /* synthetic */ C0721Xg(C0709Wb c0709Wb, int i) {
        this.f12205a = i;
        this.f12206b = c0709Wb;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f12205a) {
            case 0:
                C1838yi c1838yi = (C1838yi) this.f12206b.f12041m;
                return c1838yi != null ? new Si(c1838yi, AbstractC0613Id.f9544g) : new Si(new C0714Wg(), AbstractC0613Id.f9544g);
            case 1:
                return (C1838yi) this.f12206b.f12041m;
            default:
                return (C1344ni) this.f12206b.f12040l;
        }
    }
}
