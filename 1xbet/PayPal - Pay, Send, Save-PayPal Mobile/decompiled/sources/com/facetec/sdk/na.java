package com.facetec.sdk;

/* loaded from: classes8.dex */
public enum na {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    private final java.lang.String g;

    na(java.lang.String str) {
        this.g = str;
    }

    public static com.facetec.sdk.na b(java.lang.String str) throws java.io.IOException {
        com.facetec.sdk.na naVar = HTTP_1_0;
        if (str.equals(naVar.g)) {
            return naVar;
        }
        com.facetec.sdk.na naVar2 = HTTP_1_1;
        if (str.equals(naVar2.g)) {
            return naVar2;
        }
        com.facetec.sdk.na naVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(naVar3.g)) {
            return naVar3;
        }
        com.facetec.sdk.na naVar4 = HTTP_2;
        if (str.equals(naVar4.g)) {
            return naVar4;
        }
        if (str.equals(SPDY_3.g)) {
            return SPDY_3;
        }
        if (str.equals(QUIC.g)) {
            return QUIC;
        }
        throw new java.io.IOException("Unexpected protocol: ".concat(java.lang.String.valueOf(str)));
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.g;
    }
}
