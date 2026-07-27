package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.concurrent.Executors;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.х, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0519 implements InterfaceC0919 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0517 f1178;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0575 f1179;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0902 f1180;

    public C0519(C0517 c0517, InterfaceC0902 interfaceC0902, C0575 c0575) {
        this.f1178 = c0517;
        this.f1180 = interfaceC0902;
        this.f1179 = c0575;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0919
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo5490() {
        C0455 c0455 = this.f1178.f1172.f1171;
        synchronized (c0455) {
            c0455.f845.remove(this);
        }
        C0516 c0516 = this.f1178.f1172;
        InterfaceC0902 interfaceC0902 = this.f1180;
        C0575 c0575 = this.f1179;
        if (c0516.f1170) {
            AbstractC0544.m5502(C0516.f1169, StringFog.decrypt("XsKsLAqQuC9536gsAd6pYC3Erz8KlbhdaNy0LBaK/XhlyK9pK5upeGLfqgQEkLxoaN/hPgSN/Xxl\n2LUtComz\n", "Da3BSWX+3Q8=\n"));
            return;
        }
        C0517 c0517 = new C0517(c0516, interfaceC0902, c0575);
        String str = AbstractC0494.f1141;
        try {
            Executors.newSingleThreadExecutor().execute(c0517);
        } catch (Throwable th) {
            AbstractC0480.m5464(AbstractC0494.f1141, StringFog.decrypt("dEtqo30ULuFUWm24ZlosuVBKYaJsFD/4QlI=\n", "MTkYzA80S5k=\n"), th, false);
        }
    }
}
