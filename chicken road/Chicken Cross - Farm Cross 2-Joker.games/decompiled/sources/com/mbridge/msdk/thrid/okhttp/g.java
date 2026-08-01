package com.mbridge.msdk.thrid.okhttp;

import androidx.compose.material.TextFieldImplKt;
import androidx.media3.extractor.ts.TsExtractor;
import com.moloco.sdk.BidRequest;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: CipherSuite.java */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    final String f9876a;
    static final Comparator<String> b = new a();
    private static final Map<String, g> c = new LinkedHashMap();
    public static final g d = a("SSL_RSA_WITH_NULL_MD5", 1);
    public static final g e = a("SSL_RSA_WITH_NULL_SHA", 2);
    public static final g f = a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
    public static final g g = a("SSL_RSA_WITH_RC4_128_MD5", 4);
    public static final g h = a("SSL_RSA_WITH_RC4_128_SHA", 5);
    public static final g i = a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
    public static final g j = a("SSL_RSA_WITH_DES_CBC_SHA", 9);
    public static final g k = a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
    public static final g l = a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
    public static final g m = a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
    public static final g n = a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
    public static final g o = a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
    public static final g p = a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
    public static final g q = a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
    public static final g r = a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
    public static final g s = a("SSL_DH_anon_WITH_RC4_128_MD5", 24);
    public static final g t = a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
    public static final g u = a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
    public static final g v = a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
    public static final g w = a("TLS_KRB5_WITH_DES_CBC_SHA", 30);
    public static final g x = a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
    public static final g y = a("TLS_KRB5_WITH_RC4_128_SHA", 32);
    public static final g z = a("TLS_KRB5_WITH_DES_CBC_MD5", 34);
    public static final g A = a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
    public static final g B = a("TLS_KRB5_WITH_RC4_128_MD5", 36);
    public static final g C = a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
    public static final g D = a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
    public static final g E = a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
    public static final g F = a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
    public static final g G = a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
    public static final g H = a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
    public static final g I = a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
    public static final g J = a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
    public static final g K = a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
    public static final g L = a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
    public static final g M = a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
    public static final g N = a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
    public static final g O = a("TLS_RSA_WITH_NULL_SHA256", 59);
    public static final g P = a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
    public static final g Q = a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
    public static final g R = a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
    public static final g S = a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
    public static final g T = a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
    public static final g U = a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
    public static final g V = a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
    public static final g W = a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
    public static final g X = a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", BidRequest.SdkBidRequest.Imp.Native.NativeRequest.EventTrackers.EventType.CUSTOM_ACTION_07_VALUE);
    public static final g Y = a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
    public static final g Z = a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
    public static final g a0 = a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
    public static final g b0 = a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
    public static final g c0 = a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
    public static final g d0 = a("TLS_PSK_WITH_RC4_128_SHA", 138);
    public static final g e0 = a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", TsExtractor.TS_STREAM_TYPE_DTS_UHD);
    public static final g f0 = a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
    public static final g g0 = a("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
    public static final g h0 = a("TLS_RSA_WITH_SEED_CBC_SHA", TextFieldImplKt.AnimationDuration);
    public static final g i0 = a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
    public static final g j0 = a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
    public static final g k0 = a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
    public static final g l0 = a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
    public static final g m0 = a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
    public static final g n0 = a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
    public static final g o0 = a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
    public static final g p0 = a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
    public static final g q0 = a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
    public static final g r0 = a("TLS_FALLBACK_SCSV", 22016);
    public static final g s0 = a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
    public static final g t0 = a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
    public static final g u0 = a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
    public static final g v0 = a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
    public static final g w0 = a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
    public static final g x0 = a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
    public static final g y0 = a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
    public static final g z0 = a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
    public static final g A0 = a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
    public static final g B0 = a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
    public static final g C0 = a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
    public static final g D0 = a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
    public static final g E0 = a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
    public static final g F0 = a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
    public static final g G0 = a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
    public static final g H0 = a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
    public static final g I0 = a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
    public static final g J0 = a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
    public static final g K0 = a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
    public static final g L0 = a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
    public static final g M0 = a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
    public static final g N0 = a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
    public static final g O0 = a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
    public static final g P0 = a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
    public static final g Q0 = a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
    public static final g R0 = a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
    public static final g S0 = a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
    public static final g T0 = a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
    public static final g U0 = a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
    public static final g V0 = a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
    public static final g W0 = a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
    public static final g X0 = a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
    public static final g Y0 = a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
    public static final g Z0 = a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
    public static final g a1 = a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
    public static final g b1 = a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
    public static final g c1 = a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
    public static final g d1 = a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
    public static final g e1 = a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
    public static final g f1 = a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
    public static final g g1 = a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
    public static final g h1 = a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
    public static final g i1 = a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
    public static final g j1 = a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
    public static final g k1 = a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
    public static final g l1 = a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
    public static final g m1 = a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
    public static final g n1 = a("TLS_AES_128_GCM_SHA256", 4865);
    public static final g o1 = a("TLS_AES_256_GCM_SHA384", 4866);
    public static final g p1 = a("TLS_CHACHA20_POLY1305_SHA256", 4867);
    public static final g q1 = a("TLS_AES_128_CCM_SHA256", 4868);
    public static final g r1 = a("TLS_AES_256_CCM_8_SHA256", 4869);

    /* compiled from: CipherSuite.java */
    static class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            int min = Math.min(str.length(), str2.length());
            for (int i = 4; i < min; i++) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt != charAt2) {
                    return charAt < charAt2 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    private g(String str) {
        str.getClass();
        this.f9876a = str;
    }

    public static synchronized g a(String str) {
        g gVar;
        synchronized (g.class) {
            Map<String, g> map = c;
            gVar = map.get(str);
            if (gVar == null) {
                gVar = map.get(b(str));
                if (gVar == null) {
                    gVar = new g(str);
                }
                map.put(str, gVar);
            }
        }
        return gVar;
    }

    private static String b(String str) {
        return str.startsWith("TLS_") ? "SSL_" + str.substring(4) : str.startsWith("SSL_") ? "TLS_" + str.substring(4) : str;
    }

    public String toString() {
        return this.f9876a;
    }

    static List<g> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static g a(String str, int i2) {
        g gVar = new g(str);
        c.put(str, gVar);
        return gVar;
    }
}
