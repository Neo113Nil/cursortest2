package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ぃ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1097 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1087 f3217;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3218;

    public C1097(C1087 c1087, Activity activity) {
        this.f3217 = c1087;
        this.f3218 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C1124 c1124 = this.f3217.f3201.f3118;
        String decrypt = StringFog.decrypt("YR1KCgL0HOF0Bg==\n", "B3Ipf3GrcI4=\n");
        c1124.getClass();
        AbstractC1145.m5892(new C1126(c1124, decrypt));
        this.f3217.f3201.m5831(StringFog.decrypt("5xP4/0kb7bTyCA==\n", "gXybijpEgds=\n"), C1087.m5876(this.f3217, this.f3218));
    }
}
