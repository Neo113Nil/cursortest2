package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵒ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0972 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f2877;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f2878;

    public C0972(String str, String str2) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException(StringFog.decrypt("PIcFi6K0XlcGrCCLuaRfUE+tId/0s0kEDa8vxb8=\n", "b8NOq9TRLCQ=\n"));
        }
        if (str2 == null || str2.trim().isEmpty()) {
            throw new IllegalArgumentException(StringFog.decrypt("u02flJ3lXB2bToeUudQPAdpTgMD0wxlVmFGO2r8=\n", "+j3vtNShfHU=\n"));
        }
        this.f2878 = str;
        this.f2877 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0972)) {
            return false;
        }
        C0972 c0972 = (C0972) obj;
        c0972.getClass();
        return this.f2878.equals(c0972.f2878) && this.f2877.equals(c0972.f2877);
    }

    public final int hashCode() {
        Long l = 300000L;
        return l.hashCode() + ((((((this.f2877.hashCode() + (this.f2878.hashCode() * 31)) * 31) + 2) * 31) + 2) * 31);
    }

    public final String toString() {
        return AbstractC0548.m5514("yG4yM8Hn646BPSsz1MPRiIE5EiGE\n", "5E5fUrmzguM=\n", new StringBuilder().append(StringFog.decrypt("Hs2oA3esicw0zbk1aqejxCrTuBJun6DfPsGkGDju\n", "TajLdgXJxa0=\n")).append(this.f2878).append('\'').append(StringFog.decrypt("bfAHgr5zMWkgow7P6Q==\n", "QdBm8s46VSE=\n")).append(this.f2877).append('\'').append(StringFog.decrypt("uyfDccnHKt/lao4=\n", "lwezHaizTLA=\n")).append(2).append(StringFog.decrypt("s8OQqwGxRp7skJqrApVNi/re\n", "n+PzxGzBNPs=\n")).append(2), "300000}");
    }
}
