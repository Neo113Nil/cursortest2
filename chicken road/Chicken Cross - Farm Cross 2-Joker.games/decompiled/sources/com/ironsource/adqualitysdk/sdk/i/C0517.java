package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.т, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0517 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0516 f1172;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0575 f1173;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0902 f1174;

    public C0517(C0516 c0516, InterfaceC0902 interfaceC0902, C0575 c0575) {
        this.f1172 = c0516;
        this.f1174 = interfaceC0902;
        this.f1173 = c0575;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        boolean z;
        InterfaceC0902 interfaceC0902 = this.f1174;
        C0575 c0575 = this.f1173;
        C0455 c0455 = this.f1172.f1171;
        synchronized (c0455) {
            z = c0455.f846;
        }
        if (!z) {
            m5486(interfaceC0902, c0575);
            return;
        }
        try {
            C1138 m5540 = AbstractC0592.m5540(c0575.f1332, c0575.f1331, c0575.f1330, c0575.f1329, c0575.f1328);
            if (m5540 != null) {
                AbstractC0544.m5503(StringFog.decrypt("j+FrWo237Kqg6n5Kh7c=\n", "wYQfLeLFh+c=\n"), StringFog.decrypt("wlKcCRHxKqHmXo1aA/ErsfZNh0cDtHmy91KFCQO0K6LgT8heGaUx9OFcnEhK8Q==\n", "hT3oKXDRWdQ=\n") + m5540.f3275);
                AbstractC1145.m5891(new C0532(m5540, interfaceC0902));
            } else {
                AbstractC1145.m5891(new C0528(m5540, interfaceC0902));
            }
        } catch (Exception e) {
            interfaceC0902.mo5489(null, StringFog.decrypt("DChEmAwzl0E2ZlafDjKXViw1UZUNdsVQKDNAiRR2\n", "WUYl+mBWtzU=\n") + e.getLocalizedMessage());
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5486(InterfaceC0902 interfaceC0902, C0575 c0575) {
        C0455 c0455 = this.f1172.f1171;
        C0519 c0519 = new C0519(this, interfaceC0902, c0575);
        synchronized (c0455) {
            c0455.f845.add(c0519);
        }
    }
}
