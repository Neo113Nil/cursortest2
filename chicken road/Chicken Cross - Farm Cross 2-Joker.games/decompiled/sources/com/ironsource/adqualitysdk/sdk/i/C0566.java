package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ב, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0566 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0523 f1283;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f1284;

    public C0566(C0523 c0523, String str) {
        this.f1283 = c0523;
        this.f1284 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0991 c0991 = this.f1283.f1189;
        boolean isEmpty = TextUtils.isEmpty(this.f1284);
        if (isEmpty) {
            C0482 c0482 = c0991.f2914.f2898.f2895.f2813.f2609;
            String decrypt = StringFog.decrypt("kBX3YDCNTQaFDcVie4U=\n", "9nmWBx7rJHQ=\n");
            String decrypt2 = StringFog.decrypt("LT0oJU8=\n", "S1xEViqDTrI=\n");
            c0482.getClass();
            C0482.m5466().post(new C0520(c0482, decrypt, decrypt2));
        }
        AbstractC1145.m5892(new C1021(c0991, isEmpty));
    }
}
