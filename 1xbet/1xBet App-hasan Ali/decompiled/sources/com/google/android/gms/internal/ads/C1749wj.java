package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1749wj implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16142a;

    /* renamed from: b, reason: collision with root package name */
    public final C0650Nf f16143b;

    public /* synthetic */ C1749wj(C0650Nf c0650Nf, int i) {
        this.f16142a = i;
        this.f16143b = c0650Nf;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f16142a) {
            case 0:
                return new BinderC1704vj(this.f16143b.a());
            default:
                return new Ok(this.f16143b.a());
        }
    }
}
