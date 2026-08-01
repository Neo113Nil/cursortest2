package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ẓ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1025 extends AbstractRunnableC0730 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C1016 f3048;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C1107 f3049;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3050;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3051;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3052;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f3053;

    public C1025(C1016 c1016, String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z, C1107 c1107) {
        this.f3048 = c1016;
        this.f3053 = str;
        this.f3052 = jSONObject;
        this.f3051 = jSONObject2;
        this.f3050 = z;
        this.f3049 = c1107;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        if (this.f3053.equals(StringFog.decrypt("aCMcFPncD6VvJyIV6A==\n", "HFNDZ5yvfPo=\n"))) {
            this.f3048.f3027++;
        }
        C1016 c1016 = this.f3048;
        int i = c1016.f3026;
        c1016.f3026 = i + 1;
        JSONObject m5606 = AbstractC0647.m5606(this.f3052, false);
        m5606.put(StringFog.decrypt("4dnjWg==\n", "j7iOP6qena0=\n"), this.f3053);
        m5606.put(StringFog.decrypt("2Pw=\n", "vZLRfvzBRIw=\n"), i);
        String decrypt = StringFog.decrypt("X+7uTIwXOEpA\n", "K5yPL+l1WSk=\n");
        JSONObject jSONObject = this.f3051;
        if (jSONObject != null) {
            decrypt = jSONObject.optString(AbstractC0739.f2066);
            String str = AbstractC0739.f2020;
            m5606.put(str, this.f3051.optString(str, null));
        }
        if (TextUtils.isEmpty(decrypt)) {
            decrypt = StringFog.decrypt("zk9GGQ==\n", "oCAofGNdD40=\n");
        }
        m5606.put(AbstractC0739.f2065, decrypt);
        String str2 = AbstractC0739.f2064;
        if (!m5606.has(str2)) {
            m5606.put(str2, decrypt);
        }
        AbstractC1145.m5892(new C1032(this, this.f3048.mo5493(m5606, this.f3050, true, this.f3053.equals(StringFog.decrypt("EYhNGv51Ig==\n", "ZfgSc5AcVo8=\n")))));
    }
}
