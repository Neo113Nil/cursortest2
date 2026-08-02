package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class mc {

    /* renamed from: a, reason: collision with root package name */
    public static final com.facetec.sdk.mc f3639a;
    public static final com.facetec.sdk.mc b;
    public static final com.facetec.sdk.mc c;
    public static final com.facetec.sdk.mc d;
    public static final com.facetec.sdk.mc f;
    public static final com.facetec.sdk.mc g;
    public static final com.facetec.sdk.mc h;
    public static final com.facetec.sdk.mc i;
    public static final com.facetec.sdk.mc j;
    public static final com.facetec.sdk.mc k;
    public static final com.facetec.sdk.mc l;
    public static final com.facetec.sdk.mc m;
    public static final com.facetec.sdk.mc n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.facetec.sdk.mc f3640o;
    public static final com.facetec.sdk.mc p;
    public static final com.facetec.sdk.mc q;
    public static final com.facetec.sdk.mc r;
    public static final com.facetec.sdk.mc s;
    final java.lang.String t;
    static final java.util.Comparator<java.lang.String> e = new java.util.Comparator<java.lang.String>() { // from class: com.facetec.sdk.mc.2
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(java.lang.String str, java.lang.String str2) {
            java.lang.String str3 = str;
            java.lang.String str4 = str2;
            int min = java.lang.Math.min(str3.length(), str4.length());
            for (int i2 = 4; i2 < min; i2++) {
                char charAt = str3.charAt(i2);
                char charAt2 = str4.charAt(i2);
                if (charAt != charAt2) {
                    return charAt < charAt2 ? -1 : 1;
                }
            }
            int length = str3.length();
            int length2 = str4.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    };
    private static final java.util.Map<java.lang.String, com.facetec.sdk.mc> u = new java.util.LinkedHashMap();

    static {
        a("SSL_RSA_WITH_NULL_MD5");
        a("SSL_RSA_WITH_NULL_SHA");
        a("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        a("SSL_RSA_WITH_RC4_128_MD5");
        a("SSL_RSA_WITH_RC4_128_SHA");
        a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        a("SSL_RSA_WITH_DES_CBC_SHA");
        c = a("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        a("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        a("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        a("SSL_DH_anon_WITH_RC4_128_MD5");
        a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        a("SSL_DH_anon_WITH_DES_CBC_SHA");
        a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        a("TLS_KRB5_WITH_DES_CBC_SHA");
        a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        a("TLS_KRB5_WITH_RC4_128_SHA");
        a("TLS_KRB5_WITH_DES_CBC_MD5");
        a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        a("TLS_KRB5_WITH_RC4_128_MD5");
        a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        b = a("TLS_RSA_WITH_AES_128_CBC_SHA");
        a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        a("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f3639a = a("TLS_RSA_WITH_AES_256_CBC_SHA");
        a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        a("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        a("TLS_RSA_WITH_NULL_SHA256");
        a("TLS_RSA_WITH_AES_128_CBC_SHA256");
        a("TLS_RSA_WITH_AES_256_CBC_SHA256");
        a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        a("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        a("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        a("TLS_PSK_WITH_RC4_128_SHA");
        a("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        a("TLS_PSK_WITH_AES_128_CBC_SHA");
        a("TLS_PSK_WITH_AES_256_CBC_SHA");
        a("TLS_RSA_WITH_SEED_CBC_SHA");
        d = a("TLS_RSA_WITH_AES_128_GCM_SHA256");
        i = a("TLS_RSA_WITH_AES_256_GCM_SHA384");
        a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        a("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        a("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        a("TLS_FALLBACK_SCSV");
        a("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        a("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        a("TLS_ECDH_RSA_WITH_NULL_SHA");
        a("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        a("TLS_ECDHE_RSA_WITH_NULL_SHA");
        a("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f = a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        j = a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        a("TLS_ECDH_anon_WITH_NULL_SHA");
        a("TLS_ECDH_anon_WITH_RC4_128_SHA");
        a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        h = a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        g = a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        k = a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        n = a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f3640o = a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        m = a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        l = a("TLS_AES_128_GCM_SHA256");
        p = a("TLS_AES_256_GCM_SHA384");
        q = a("TLS_CHACHA20_POLY1305_SHA256");
        r = a("TLS_AES_128_CCM_SHA256");
        s = a("TLS_AES_256_CCM_8_SHA256");
    }

    public static com.facetec.sdk.mc b(java.lang.String str) {
        com.facetec.sdk.mc mcVar;
        java.lang.String str2;
        synchronized (com.facetec.sdk.mc.class) {
            java.util.Map<java.lang.String, com.facetec.sdk.mc> map = u;
            mcVar = map.get(str);
            if (mcVar == null) {
                if (str.startsWith("TLS_")) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("SSL_");
                    sb.append(str.substring(4));
                    str2 = sb.toString();
                } else if (str.startsWith("SSL_")) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("TLS_");
                    sb2.append(str.substring(4));
                    str2 = sb2.toString();
                } else {
                    str2 = str;
                }
                mcVar = map.get(str2);
                if (mcVar == null) {
                    mcVar = new com.facetec.sdk.mc(str);
                }
                map.put(str, mcVar);
            }
        }
        return mcVar;
    }

    static java.util.List<com.facetec.sdk.mc> a(java.lang.String... strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(b(str));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    private mc(java.lang.String str) {
        str.getClass();
        this.t = str;
    }

    private static com.facetec.sdk.mc a(java.lang.String str) {
        com.facetec.sdk.mc mcVar = new com.facetec.sdk.mc(str);
        u.put(str, mcVar);
        return mcVar;
    }

    public final java.lang.String toString() {
        return this.t;
    }
}
