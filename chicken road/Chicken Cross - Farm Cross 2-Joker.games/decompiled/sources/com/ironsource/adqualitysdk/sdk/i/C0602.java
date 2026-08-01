package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.م, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0602 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0593 f1575;

    public C0602(C0593 c0593) {
        this.f1575 = c0593;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0563 c0563 = this.f1575.f1547;
        if (c0563.f1278) {
            C0682 c0682 = c0563.f1277;
            String decrypt = StringFog.decrypt("FZWJ6JpnLsEW3o7tnnIp7Q2Dme6WQSLY\n", "ePDtgfsTR64=\n");
            c0682.getClass();
            c0682.m5634(decrypt, new ArrayList());
            this.f1575.f1547.f1278 = false;
        }
    }
}
