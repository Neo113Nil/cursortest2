package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.د, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0597 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public boolean f1560 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f1561;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f1562;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f1563;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f1564;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f1559 = StringFog.decrypt("xVsQKQ==\n", "oDVmBiE6j/4=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f1558 = StringFog.decrypt("mQUe\n", "+Gt6S4SmQDI=\n");

    public AbstractC0597(String str, String str2, String str3, String str4) {
        this.f1564 = str;
        this.f1563 = str2;
        this.f1562 = str3;
        this.f1561 = str4;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m5549() {
        JSONObject jSONObject;
        String decrypt = StringFog.decrypt("aARVcdnezGE1\n", "GmE4Hq27qAM=\n");
        C0470 c0470 = (C0470) AbstractC0398.m5397();
        synchronized (c0470) {
            jSONObject = c0470.f3224;
        }
        String optString = jSONObject.optString(c0470.f910);
        return (!this.f1560 || TextUtils.isEmpty(optString)) ? decrypt : AbstractC1257.m5940("Hw==\n", "MEtOPSUXZYY=\n", new StringBuilder().append(decrypt).append(f1559).append(optString));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public String mo5550() {
        return m5549() + this.f1564 + StringFog.decrypt("+w==\n", "1MHTRhoJ/ZI=\n") + this.f1563 + StringFog.decrypt("Tw==\n", "YVnHuo8HD6c=\n") + f1558 + StringFog.decrypt("jg==\n", "oA9y2SZXCnA=\n") + this.f1562 + StringFog.decrypt("Hg==\n", "MDjAFopolmY=\n") + this.f1561;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m5551(String str) {
        StringBuilder append = new StringBuilder().append(m5549()).append(this.f1564).append(StringFog.decrypt("cw==\n", "XJRqoAue0/M=\n"));
        String str2 = f1558;
        return AbstractC1196.m5920("YQ==\n", "T33vF/i9gss=\n", AbstractC1196.m5920("VA==\n", "e44qPHv878c=\n", append.append(str2), str).append(StringFog.decrypt("+A==\n", "17z2gGzMD/4=\n")).append(this.f1563), str2).append(StringFog.decrypt("qA==\n", "hl8LfimBD1k=\n")).append(this.f1562).append(StringFog.decrypt("OQ==\n", "F/aWw9h9u9A=\n")).append(this.f1561).toString();
    }
}
