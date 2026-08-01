package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵝ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0982 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0980 f2898;

    public C0982(C0980 c0980) {
        this.f2898 = c0980;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0482 c0482 = this.f2898.f2895.f2813.f2609;
        String decrypt = StringFog.decrypt("GLng7ssHnlYNodLsgA8=\n", "ftWBieVh9yQ=\n");
        C0991 c0991 = new C0991(this);
        c0482.getClass();
        C0482.m5466().post(new C0523(c0482, decrypt, c0991));
    }
}
