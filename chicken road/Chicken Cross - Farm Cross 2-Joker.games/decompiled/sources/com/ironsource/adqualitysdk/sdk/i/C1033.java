package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ỳ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1033 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f3063;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f3064;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f3065;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f3066 = StringFog.decrypt("diFh5JRCJcxHCmb5kEM9xnYhYeyYRg==\n", "NU4PivEhUaM=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f3067;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final List f3068;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final EnumC1034 f3069;

    static {
        StringFog.decrypt("p2I33g==\n", "0xtHu0Yk2BA=\n");
        StringFog.decrypt("IqE=\n", "VM9Op7QRl6U=\n");
        StringFog.decrypt("8yF2He/t\n", "gUQXboCDhkE=\n");
        f3065 = StringFog.decrypt("5kXX+h8=\n", "hye4jHp7+DA=\n");
        f3064 = StringFog.decrypt("CBpY0Wg=\n", "an80vh+t8ms=\n");
        f3063 = StringFog.decrypt("9dPWpsQ=\n", "kKu3xbC+C4U=\n");
    }

    public C1033(JSONObject jSONObject) {
        char c;
        String optString = jSONObject.optString(StringFog.decrypt("NUHEyA==\n", "QTi0rTsgZdk=\n"));
        int hashCode = optString.hashCode();
        if (hashCode == 92611485) {
            if (optString.equals(f3065)) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 93621297) {
            if (hashCode == 96946943 && optString.equals(f3063)) {
                c = 0;
            }
            c = 65535;
        } else {
            if (optString.equals(f3064)) {
                c = 2;
            }
            c = 65535;
        }
        this.f3069 = c != 0 ? c != 1 ? c != 2 ? EnumC1034.f3074 : EnumC1034.f3072 : EnumC1034.f3073 : EnumC1034.f3071;
        String optString2 = jSONObject.optString(StringFog.decrypt("hdw=\n", "87IRqY1P1d8=\n"));
        this.f3068 = TextUtils.isEmpty(optString2) ? new ArrayList() : Arrays.asList(optString2.split(StringFog.decrypt("NA==\n", "GOSIZ0oLlik=\n")));
        String optString3 = jSONObject.optString(StringFog.decrypt("UNj1Qu+P\n", "Ir2UMYDhULA=\n"));
        this.f3067 = (TextUtils.isEmpty(optString3) || optString3.equals(StringFog.decrypt("WxUhnQ==\n", "NWBN8d/fYIo=\n"))) ? null : optString3;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m5807(String str) {
        int ordinal;
        try {
            ordinal = this.f3069.ordinal();
        } catch (Exception e) {
            AbstractC0480.m5464(f3066, StringFog.decrypt("Em+mndubN+F3bryd3Nc6yz5utZDF3g==\n", "Vx3U8qm7Xo8=\n"), (Throwable) e, false);
        }
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return false;
                }
                return this.f3068.contains(str);
            }
            if (this.f3068.size() > 0) {
                return AbstractC1191.m5913(str, (String) this.f3068.get(0)) < 0;
            }
        }
        return this.f3068.size() > 0 && AbstractC1191.m5913(str, (String) this.f3068.get(0)) >= 0;
    }
}
