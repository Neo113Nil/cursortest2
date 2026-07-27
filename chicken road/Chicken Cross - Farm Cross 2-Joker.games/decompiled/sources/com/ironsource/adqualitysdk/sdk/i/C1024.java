package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ẏ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1024 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1018 f3046;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3047;

    public C1024(C1018 c1018, JSONObject jSONObject) {
        this.f3046 = c1018;
        this.f3047 = jSONObject;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        String m5770;
        JSONObject jSONObject;
        C1155 c1155 = this.f3046.f3032;
        JSONObject jSONObject2 = this.f3047;
        c1155.f3308.f3122.m5796(jSONObject2);
        C1050 c1050 = c1155.f3308;
        C0516 c0516 = c1050.f3132;
        C0965 c0965 = c1050.f3134;
        if (((C0470) AbstractC0398.m5397()).f879) {
            m5770 = c1050.m5828().m5770();
        } else {
            C0936 m5828 = c1050.m5828();
            synchronized (m5828) {
                jSONObject = m5828.f3224;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(StringFog.decrypt("ZvdQ\n", "E4U8ucSYcks=\n"));
            m5770 = optJSONObject != null ? optJSONObject.optString(StringFog.decrypt("Ew==\n", "Y0ayN28Nync=\n"), m5828.f2632) : m5828.f2632;
        }
        String str = c0965.f2802;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        StringBuilder append = sb.append(str).append(StringFog.decrypt("AA==\n", "L4Vj7OYCT54=\n"));
        if (m5770 == null) {
            m5770 = "";
        }
        String sb2 = append.append(m5770).toString();
        C1050 c10502 = c1155.f3308;
        C0439 c0439 = c10502.f3130.f1205;
        Context context = c10502.f3124;
        C0470 c0470 = (C0470) AbstractC0398.m5397();
        boolean z = c0470.m5455() && c0470.f880 != c0470.m5457();
        C1157 c1157 = new C1157(c1155);
        c0516.getClass();
        if (TextUtils.isEmpty(sb2)) {
            String str2 = C0516.f1169;
            AbstractC0544.m5505(str2, str2, StringFog.decrypt("rdK+fJQmv2GXnK9xize/do3Pq3GVY+1wicm6bYxj+nyM1Lps2BbNWdjTrT6KJuxll9Kse7Ai8XGU\n2a0+jybtcNjSsGrYM+16jtW7e5w=\n", "+LzfHvhDnxU=\n"), true);
            return;
        }
        C0575 c0575 = new C0575(jSONObject2, sb2, c0439, context, z);
        if (c0516.f1170) {
            AbstractC0544.m5502(C0516.f1169, StringFog.decrypt("XsKsLAqQuC9536gsAd6pYC3Erz8KlbhdaNy0LBaK/XhlyK9pK5upeGLfqgQEkLxoaN/hPgSN/Xxl\n2LUtComz\n", "Da3BSWX+3Q8=\n"));
            return;
        }
        C0517 c0517 = new C0517(c0516, c1157, c0575);
        String str3 = AbstractC0494.f1141;
        try {
            Executors.newSingleThreadExecutor().execute(c0517);
        } catch (Throwable th) {
            AbstractC0480.m5464(AbstractC0494.f1141, StringFog.decrypt("dEtqo30ULuFUWm24ZlosuVBKYaJsFD/4QlI=\n", "MTkYzA80S5k=\n"), th, false);
        }
    }
}
