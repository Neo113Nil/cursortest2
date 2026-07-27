package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.nio.charset.Charset;
import java.util.Calendar;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓒ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0808 extends AbstractRunnableC0730 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0767 f2353;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0823 f2354;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f2355;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0597 f2356;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2357;

    public C0808(C0767 c0767, String str, AbstractC0597 abstractC0597, String str2, InterfaceC0823 interfaceC0823) {
        this.f2353 = c0767;
        this.f2357 = str;
        this.f2356 = abstractC0597;
        this.f2355 = str2;
        this.f2354 = interfaceC0823;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        boolean z;
        int i;
        String str = this.f2357;
        AbstractC0597 abstractC0597 = this.f2356;
        String str2 = this.f2355;
        InterfaceC0823 interfaceC0823 = this.f2354;
        C0455 c0455 = this.f2353.f2207.f1171;
        synchronized (c0455) {
            z = c0455.f846;
        }
        if (!z) {
            m5672(abstractC0597, interfaceC0823);
            return;
        }
        try {
            C1138 m5538 = AbstractC0592.m5538(str);
            if (m5538 != null && m5538.f3274.f3351 == 200) {
                String m5671 = m5671(m5538.f3275);
                if (!Charset.forName(StringFog.decrypt("MQ4kOsabBJ4=\n", "ZF0Je5XYTdc=\n")).newEncoder().canEncode(m5671)) {
                    AbstractC0480.m5464(StringFog.decrypt("zzj6H23PWpw=\n", "nV2XcBmqHt4=\n"), StringFog.decrypt("U6Oc4rWLOOJz5ozkvpIi4Degjf+h2w==\n", "F8b/kMz7TIc=\n") + str + StringFog.decrypt("XSgU+3U9r08OaxL7dz2qSBlrGP1gLrU=\n", "fUt7lQFcxiE=\n"), (Throwable) null, false);
                } else if (!TextUtils.isEmpty(m5671)) {
                    C0482 c0482 = this.f2353.f2208;
                    c0482.m5469(str2, m5671);
                    String str3 = str2 + StringFog.decrypt("kc0DQyELDebe1Qc=\n", "v6FiMFV+fYI=\n");
                    String str4 = AbstractC0494.f1141;
                    c0482.m5469(str3, Long.toString(Calendar.getInstance().getTimeInMillis()));
                    AbstractC1145.m5893(new C0910(interfaceC0823, str2, m5671));
                }
            } else if (!this.f2353.f2207.f1171.m5449()) {
                m5672(abstractC0597, interfaceC0823);
            } else if (m5538 != null && (((i = m5538.f3274.f3351) == 403 || i == 404) && str.contains(StringFog.decrypt("iHDc4A==\n", "7R6qz4LZnZw=\n")))) {
                abstractC0597.f1560 = false;
                this.f2353.m5657(abstractC0597, interfaceC0823);
            }
        } catch (Exception e) {
            if (this.f2353.f2207.f1171.m5449()) {
                AbstractC0480.m5464(StringFog.decrypt("XyNG346wxCw=\n", "DUYrsPrVgG4=\n"), AbstractC0548.m5514("4AeKUYAoHNPRAZFQlSgJ08gajFvSWw/EzBufHpR6FNuF\n", "pXX4PvIIe7Y=\n", new StringBuilder(), str), (Throwable) e, false);
            } else {
                m5672(abstractC0597, interfaceC0823);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5671(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString(StringFog.decrypt("Njek\n", "U1nHzB9HgMo=\n"));
        if (TextUtils.isEmpty(optString)) {
            return str;
        }
        return AbstractC0494.m5475(optString, C0767.f2204, jSONObject.optString(StringFog.decrypt("3dI=\n", "tKTZmOKIF0A=\n")), jSONObject.optString(StringFog.decrypt("Dz2Xng==\n", "fFz76noIRtg=\n")));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5672(AbstractC0597 abstractC0597, InterfaceC0823 interfaceC0823) {
        C0455 c0455 = this.f2353.f2207.f1171;
        C0875 c0875 = new C0875(this, abstractC0597, interfaceC0823);
        synchronized (c0455) {
            c0455.f845.add(c0875);
        }
    }
}
