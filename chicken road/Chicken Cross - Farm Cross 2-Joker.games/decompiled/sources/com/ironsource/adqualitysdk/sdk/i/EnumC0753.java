package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐩ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public enum EnumC0753 {
    f2092,
    f2091,
    f2090;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static EnumC0753 m5654(String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode == 3642) {
            if (str.equals(StringFog.decrypt("cHE=\n", "Ah3DKvcSk44=\n"))) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 96921) {
            if (hashCode == 109261 && str.equals(StringFog.decrypt("7u3T\n", "gIK9StgzCck=\n"))) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("j58w\n", "7utcey07S1w=\n"))) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return f2092;
        }
        if (c == 1) {
            return f2091;
        }
        if (c != 2) {
            return null;
        }
        return f2090;
    }
}
