package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.宀, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1127 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1050 f3260;

    public C1127(C1050 c1050) {
        this.f3260 = c1050;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C1124 c1124 = this.f3260.f3118;
        String decrypt = StringFog.decrypt("QK7vINCHSpNRsNQ=\n", "NN6wU7X0Ocw=\n");
        c1124.getClass();
        AbstractC1145.m5892(new C1126(c1124, decrypt));
        this.f3260.m5831(StringFog.decrypt("dCYcbgEQgb5lOCc=\n", "AFZDHWRj8uE=\n"), new JSONObject());
    }
}
