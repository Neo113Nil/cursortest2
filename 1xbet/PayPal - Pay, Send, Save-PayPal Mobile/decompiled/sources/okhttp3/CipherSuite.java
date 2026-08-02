package okhttp3;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007R\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u0007"}, d2 = {"Lokhttp3/CipherSuite;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "-deprecated_javaName", "()Ljava/lang/String;", "toString", "javaName", "Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CipherSuite {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.CipherSuite.Companion INSTANCE;
    private static final java.util.Map<java.lang.String, okhttp3.CipherSuite> INSTANCES;
    private static final java.util.Comparator<java.lang.String> ORDER_BY_NAME;
    public static final okhttp3.CipherSuite TLS_AES_128_CCM_8_SHA256;
    public static final okhttp3.CipherSuite TLS_AES_128_CCM_SHA256;
    public static final okhttp3.CipherSuite TLS_AES_128_GCM_SHA256;
    public static final okhttp3.CipherSuite TLS_AES_256_GCM_SHA384;
    public static final okhttp3.CipherSuite TLS_CHACHA20_POLY1305_SHA256;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA256;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_AES_128_GCM_SHA256;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA256;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_AES_256_GCM_SHA384;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_DES_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA256;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_AES_128_GCM_SHA256;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA256;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_AES_256_GCM_SHA384;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_DES_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DH_anon_EXPORT_WITH_RC4_40_MD5;
    public static final okhttp3.CipherSuite TLS_DH_anon_WITH_3DES_EDE_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA256;
    public static final okhttp3.CipherSuite TLS_DH_anon_WITH_AES_128_GCM_SHA256;
    public static final okhttp3.CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA256;
    public static final okhttp3.CipherSuite TLS_DH_anon_WITH_AES_256_GCM_SHA384;
    public static final okhttp3.CipherSuite TLS_DH_anon_WITH_DES_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_DH_anon_WITH_RC4_128_MD5;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_NULL_SHA;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_RC4_128_SHA;
    public static final okhttp3.CipherSuite TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_NULL_SHA;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_RC4_128_SHA;
    public static final okhttp3.CipherSuite TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256;
    public static final okhttp3.CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256;
    public static final okhttp3.CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384;
    public static final okhttp3.CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384;
    public static final okhttp3.CipherSuite TLS_ECDH_ECDSA_WITH_NULL_SHA;
    public static final okhttp3.CipherSuite TLS_ECDH_ECDSA_WITH_RC4_128_SHA;
    public static final okhttp3.CipherSuite TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256;
    public static final okhttp3.CipherSuite TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256;
    public static final okhttp3.CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384;
    public static final okhttp3.CipherSuite TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384;
    public static final okhttp3.CipherSuite TLS_ECDH_RSA_WITH_NULL_SHA;
    public static final okhttp3.CipherSuite TLS_ECDH_RSA_WITH_RC4_128_SHA;
    public static final okhttp3.CipherSuite TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_ECDH_anon_WITH_AES_128_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_ECDH_anon_WITH_AES_256_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_ECDH_anon_WITH_NULL_SHA;
    public static final okhttp3.CipherSuite TLS_ECDH_anon_WITH_RC4_128_SHA;
    public static final okhttp3.CipherSuite TLS_EMPTY_RENEGOTIATION_INFO_SCSV;
    public static final okhttp3.CipherSuite TLS_FALLBACK_SCSV;
    public static final okhttp3.CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5;
    public static final okhttp3.CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA;
    public static final okhttp3.CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_MD5;
    public static final okhttp3.CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_SHA;
    public static final okhttp3.CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_MD5;
    public static final okhttp3.CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_KRB5_WITH_DES_CBC_MD5;
    public static final okhttp3.CipherSuite TLS_KRB5_WITH_DES_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_KRB5_WITH_RC4_128_MD5;
    public static final okhttp3.CipherSuite TLS_KRB5_WITH_RC4_128_SHA;
    public static final okhttp3.CipherSuite TLS_PSK_WITH_3DES_EDE_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_PSK_WITH_AES_128_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_PSK_WITH_AES_256_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_PSK_WITH_RC4_128_SHA;
    public static final okhttp3.CipherSuite TLS_RSA_EXPORT_WITH_DES40_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_RSA_EXPORT_WITH_RC4_40_MD5;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA256;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_AES_128_GCM_SHA256;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA256;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_AES_256_GCM_SHA384;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_CAMELLIA_128_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_CAMELLIA_256_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_DES_CBC_SHA;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_NULL_MD5;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_NULL_SHA;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_NULL_SHA256;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_RC4_128_MD5;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_RC4_128_SHA;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_SEED_CBC_SHA;
    private final java.lang.String javaName;

    private CipherSuite(java.lang.String str) {
        this.javaName = str;
    }

    public final java.lang.String javaName() {
        return this.javaName;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "javaName", imports = {}))
    /* renamed from: -deprecated_javaName, reason: not valid java name and from getter */
    public final java.lang.String getJavaName() {
        return this.javaName;
    }

    public final java.lang.String toString() {
        return this.javaName;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\bz\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\tj\b\u0012\u0004\u0012\u00020\u0004`\n8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013R\u0014\u0010\u001e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013R\u0014\u0010 \u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0013R\u0014\u0010!\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0013R\u0014\u0010\"\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0013R\u0014\u0010#\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0013R\u0014\u0010$\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0013R\u0014\u0010%\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0013R\u0014\u0010&\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0013R\u0014\u0010'\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0013R\u0014\u0010(\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0013R\u0014\u0010)\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0013R\u0014\u0010*\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0013R\u0014\u0010+\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0013R\u0014\u0010,\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0013R\u0014\u0010-\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0013R\u0014\u0010.\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0013R\u0014\u0010/\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0013R\u0014\u00100\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0013R\u0014\u00101\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0013R\u0014\u00102\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0013R\u0014\u00103\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0013R\u0014\u00104\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0013R\u0014\u00105\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0013R\u0014\u00106\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0013R\u0014\u00107\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0013R\u0014\u00108\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0013R\u0014\u00109\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0013R\u0014\u0010:\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0013R\u0014\u0010;\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0013R\u0014\u0010<\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0013R\u0014\u0010=\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0013R\u0014\u0010>\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0013R\u0014\u0010?\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0013R\u0014\u0010@\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0013R\u0014\u0010A\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0013R\u0014\u0010B\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0013R\u0014\u0010C\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0013R\u0014\u0010D\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010\u0013R\u0014\u0010E\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0013R\u0014\u0010F\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0013R\u0014\u0010G\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0013R\u0014\u0010H\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0013R\u0014\u0010I\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010\u0013R\u0014\u0010J\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0013R\u0014\u0010K\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0013R\u0014\u0010L\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0013R\u0014\u0010M\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0013R\u0014\u0010N\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0013R\u0014\u0010O\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0013R\u0014\u0010P\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010\u0013R\u0014\u0010Q\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u0013R\u0014\u0010R\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010\u0013R\u0014\u0010S\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010\u0013R\u0014\u0010T\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010\u0013R\u0014\u0010U\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0013R\u0014\u0010V\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010\u0013R\u0014\u0010W\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010\u0013R\u0014\u0010X\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0013R\u0014\u0010Y\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010\u0013R\u0014\u0010Z\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010\u0013R\u0014\u0010[\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010\u0013R\u0014\u0010\\\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010\u0013R\u0014\u0010]\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010\u0013R\u0014\u0010^\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010\u0013R\u0014\u0010_\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b_\u0010\u0013R\u0014\u0010`\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010\u0013R\u0014\u0010a\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010\u0013R\u0014\u0010b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bb\u0010\u0013R\u0014\u0010c\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bc\u0010\u0013R\u0014\u0010d\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bd\u0010\u0013R\u0014\u0010e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\be\u0010\u0013R\u0014\u0010f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bf\u0010\u0013R\u0014\u0010g\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bg\u0010\u0013R\u0014\u0010h\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bh\u0010\u0013R\u0014\u0010i\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bi\u0010\u0013R\u0014\u0010j\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bj\u0010\u0013R\u0014\u0010k\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bk\u0010\u0013R\u0014\u0010l\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010\u0013R\u0014\u0010m\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bm\u0010\u0013R\u0014\u0010n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bn\u0010\u0013R\u0014\u0010o\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bo\u0010\u0013R\u0014\u0010p\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bp\u0010\u0013R\u0014\u0010q\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bq\u0010\u0013R\u0014\u0010r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\br\u0010\u0013R\u0014\u0010s\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bs\u0010\u0013R\u0014\u0010t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bt\u0010\u0013R\u0014\u0010u\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bu\u0010\u0013R\u0014\u0010v\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bv\u0010\u0013R\u0014\u0010w\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bw\u0010\u0013R\u0014\u0010x\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bx\u0010\u0013R\u0014\u0010y\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\by\u0010\u0013R\u0014\u0010z\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bz\u0010\u0013R\u0014\u0010{\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b{\u0010\u0013R\u0014\u0010|\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b|\u0010\u0013R\u0014\u0010}\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b}\u0010\u0013R\u0014\u0010~\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b~\u0010\u0013R\u0014\u0010\u007f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010\u0013R\u0016\u0010\u0080\u0001\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0013R\u0016\u0010\u0081\u0001\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u0013R\u0016\u0010\u0082\u0001\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u0013R\u0016\u0010\u0083\u0001\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u0013R\u0016\u0010\u0084\u0001\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u0013R\u0016\u0010\u0085\u0001\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010\u0013R\u0016\u0010\u0086\u0001\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u0013R\u0016\u0010\u0087\u0001\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u0013R\u0016\u0010\u0088\u0001\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010\u0013R\u0016\u0010\u0089\u0001\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010\u0013"}, d2 = {"Lokhttp3/CipherSuite$Companion;", "", "<init>", "()V", "", "javaName", "Lokhttp3/CipherSuite;", "forJavaName", "(Ljava/lang/String;)Lokhttp3/CipherSuite;", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "ORDER_BY_NAME", "Ljava/util/Comparator;", "getORDER_BY_NAME$okhttp", "()Ljava/util/Comparator;", "", "INSTANCES", "Ljava/util/Map;", "TLS_RSA_WITH_NULL_MD5", "Lokhttp3/CipherSuite;", "TLS_RSA_WITH_NULL_SHA", "TLS_RSA_EXPORT_WITH_RC4_40_MD5", "TLS_RSA_WITH_RC4_128_MD5", "TLS_RSA_WITH_RC4_128_SHA", "TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_RSA_WITH_DES_CBC_SHA", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_DSS_WITH_DES_CBC_SHA", "TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_RSA_WITH_DES_CBC_SHA", "TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", "TLS_DH_anon_WITH_RC4_128_MD5", "TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", "TLS_DH_anon_WITH_DES_CBC_SHA", "TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_KRB5_WITH_DES_CBC_SHA", "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", "TLS_KRB5_WITH_RC4_128_SHA", "TLS_KRB5_WITH_DES_CBC_MD5", "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", "TLS_KRB5_WITH_RC4_128_MD5", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_DH_anon_WITH_AES_256_CBC_SHA", "TLS_RSA_WITH_NULL_SHA256", "TLS_RSA_WITH_AES_128_CBC_SHA256", "TLS_RSA_WITH_AES_256_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", "TLS_DH_anon_WITH_AES_128_CBC_SHA256", "TLS_DH_anon_WITH_AES_256_CBC_SHA256", "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_PSK_WITH_RC4_128_SHA", "TLS_PSK_WITH_3DES_EDE_CBC_SHA", "TLS_PSK_WITH_AES_128_CBC_SHA", "TLS_PSK_WITH_AES_256_CBC_SHA", "TLS_RSA_WITH_SEED_CBC_SHA", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", "TLS_DH_anon_WITH_AES_128_GCM_SHA256", "TLS_DH_anon_WITH_AES_256_GCM_SHA384", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", "TLS_FALLBACK_SCSV", "TLS_ECDH_ECDSA_WITH_NULL_SHA", "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_NULL_SHA", "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_RSA_WITH_NULL_SHA", "TLS_ECDH_RSA_WITH_RC4_128_SHA", "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_NULL_SHA", "TLS_ECDHE_RSA_WITH_RC4_128_SHA", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_anon_WITH_NULL_SHA", "TLS_ECDH_anon_WITH_RC4_128_SHA", "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", "TLS_AES_128_GCM_SHA256", "TLS_AES_256_GCM_SHA384", "TLS_CHACHA20_POLY1305_SHA256", "TLS_AES_128_CCM_SHA256", "TLS_AES_128_CCM_8_SHA256"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.Comparator<java.lang.String> getORDER_BY_NAME$okhttp() {
            return okhttp3.CipherSuite.ORDER_BY_NAME;
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.CipherSuite forJavaName(java.lang.String javaName) {
            okhttp3.CipherSuite cipherSuite;
            java.lang.String str;
            synchronized (this) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaName, "");
                cipherSuite = (okhttp3.CipherSuite) okhttp3.CipherSuite.INSTANCES.get(javaName);
                if (cipherSuite == null) {
                    java.util.Map map = okhttp3.CipherSuite.INSTANCES;
                    kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
                    if (kotlin.text.StringsKt.startsWith$default(javaName, "TLS_", false, 2, (java.lang.Object) null)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("SSL_");
                        java.lang.String substring = javaName.substring(4);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                        sb.append(substring);
                        str = sb.toString();
                    } else if (kotlin.text.StringsKt.startsWith$default(javaName, "SSL_", false, 2, (java.lang.Object) null)) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("TLS_");
                        java.lang.String substring2 = javaName.substring(4);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                        sb2.append(substring2);
                        str = sb2.toString();
                    } else {
                        str = javaName;
                    }
                    cipherSuite = (okhttp3.CipherSuite) map.get(str);
                    if (cipherSuite == null) {
                        cipherSuite = new okhttp3.CipherSuite(javaName, defaultConstructorMarker);
                    }
                    okhttp3.CipherSuite.INSTANCES.put(javaName, cipherSuite);
                }
            }
            return cipherSuite;
        }

        public static final /* synthetic */ okhttp3.CipherSuite access$init(okhttp3.CipherSuite.Companion companion, java.lang.String str, int i) {
            okhttp3.CipherSuite cipherSuite = new okhttp3.CipherSuite(str, null);
            okhttp3.CipherSuite.INSTANCES.put(str, cipherSuite);
            return cipherSuite;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        okhttp3.CipherSuite.Companion companion = new okhttp3.CipherSuite.Companion(null);
        INSTANCE = companion;
        ORDER_BY_NAME = new java.util.Comparator<java.lang.String>() { // from class: okhttp3.CipherSuite$Companion$ORDER_BY_NAME$1
            @Override // java.util.Comparator
            public final int compare(java.lang.String a2, java.lang.String b) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "");
                int min = java.lang.Math.min(a2.length(), b.length());
                for (int i = 4; i < min; i++) {
                    char charAt = a2.charAt(i);
                    char charAt2 = b.charAt(i);
                    if (charAt != charAt2) {
                        return kotlin.jvm.internal.Intrinsics.compare((int) charAt, (int) charAt2) < 0 ? -1 : 1;
                    }
                }
                int length = a2.length();
                int length2 = b.length();
                if (length != length2) {
                    return length < length2 ? -1 : 1;
                }
                return 0;
            }
        };
        INSTANCES = new java.util.LinkedHashMap();
        TLS_RSA_WITH_NULL_MD5 = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_RSA_WITH_NULL_MD5", 1);
        TLS_RSA_WITH_NULL_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_RSA_WITH_NULL_SHA", 2);
        TLS_RSA_EXPORT_WITH_RC4_40_MD5 = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        TLS_RSA_WITH_RC4_128_MD5 = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_RSA_WITH_RC4_128_MD5", 4);
        TLS_RSA_WITH_RC4_128_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_RSA_WITH_RC4_128_SHA", 5);
        TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        TLS_RSA_WITH_DES_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_RSA_WITH_DES_CBC_SHA", 9);
        TLS_RSA_WITH_3DES_EDE_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        TLS_DHE_DSS_WITH_DES_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        TLS_DHE_RSA_WITH_DES_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        TLS_DH_anon_WITH_RC4_128_MD5 = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_DH_anon_WITH_RC4_128_MD5", 24);
        TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        TLS_DH_anon_WITH_DES_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        TLS_KRB5_WITH_DES_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_KRB5_WITH_DES_CBC_SHA", 30);
        TLS_KRB5_WITH_3DES_EDE_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        TLS_KRB5_WITH_RC4_128_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_KRB5_WITH_RC4_128_SHA", 32);
        TLS_KRB5_WITH_DES_CBC_MD5 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_KRB5_WITH_DES_CBC_MD5", 34);
        TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        TLS_KRB5_WITH_RC4_128_MD5 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_KRB5_WITH_RC4_128_MD5", 36);
        TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        TLS_KRB5_EXPORT_WITH_RC4_40_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        TLS_RSA_WITH_AES_128_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        TLS_DHE_DSS_WITH_AES_128_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        TLS_DHE_RSA_WITH_AES_128_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        TLS_DH_anon_WITH_AES_128_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        TLS_RSA_WITH_AES_256_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        TLS_DHE_DSS_WITH_AES_256_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        TLS_DHE_RSA_WITH_AES_256_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        TLS_DH_anon_WITH_AES_256_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        TLS_RSA_WITH_NULL_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_RSA_WITH_NULL_SHA256", 59);
        TLS_RSA_WITH_AES_128_CBC_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        TLS_RSA_WITH_AES_256_CBC_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        TLS_DH_anon_WITH_AES_128_CBC_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        TLS_DH_anon_WITH_AES_256_CBC_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        TLS_PSK_WITH_RC4_128_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_PSK_WITH_RC4_128_SHA", 138);
        TLS_PSK_WITH_3DES_EDE_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_PSK_WITH_3DES_EDE_CBC_SHA", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE);
        TLS_PSK_WITH_AES_128_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        TLS_PSK_WITH_AES_256_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        TLS_RSA_WITH_SEED_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_RSA_WITH_SEED_CBC_SHA", 150);
        TLS_RSA_WITH_AES_128_GCM_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        TLS_RSA_WITH_AES_256_GCM_SHA384 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE);
        TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE);
        TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        TLS_DH_anon_WITH_AES_128_GCM_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        TLS_DH_anon_WITH_AES_256_GCM_SHA384 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        TLS_EMPTY_RENEGOTIATION_INFO_SCSV = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        TLS_FALLBACK_SCSV = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_FALLBACK_SCSV", 22016);
        TLS_ECDH_ECDSA_WITH_NULL_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        TLS_ECDH_ECDSA_WITH_RC4_128_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        TLS_ECDHE_ECDSA_WITH_NULL_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        TLS_ECDH_RSA_WITH_NULL_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        TLS_ECDH_RSA_WITH_RC4_128_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        TLS_ECDHE_RSA_WITH_NULL_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        TLS_ECDHE_RSA_WITH_RC4_128_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        TLS_ECDH_anon_WITH_NULL_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        TLS_ECDH_anon_WITH_RC4_128_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        TLS_ECDH_anon_WITH_AES_128_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        TLS_ECDH_anon_WITH_AES_256_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        TLS_AES_128_GCM_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_AES_128_GCM_SHA256", 4865);
        TLS_AES_256_GCM_SHA384 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_AES_256_GCM_SHA384", 4866);
        TLS_CHACHA20_POLY1305_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_CHACHA20_POLY1305_SHA256", 4867);
        TLS_AES_128_CCM_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_AES_128_CCM_SHA256", 4868);
        TLS_AES_128_CCM_8_SHA256 = okhttp3.CipherSuite.Companion.access$init(companion, "TLS_AES_128_CCM_8_SHA256", 4869);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.CipherSuite forJavaName(java.lang.String str) {
        okhttp3.CipherSuite forJavaName;
        synchronized (okhttp3.CipherSuite.class) {
            forJavaName = INSTANCE.forJavaName(str);
        }
        return forJavaName;
    }

    public /* synthetic */ CipherSuite(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
