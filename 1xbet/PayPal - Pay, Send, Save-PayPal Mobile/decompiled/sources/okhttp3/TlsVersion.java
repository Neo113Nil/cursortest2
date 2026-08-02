package okhttp3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lokhttp3/TlsVersion;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "-deprecated_javaName", "()Ljava/lang/String;", "javaName", "Ljava/lang/String;", "Companion", "TLS_1_3", "TLS_1_2", "TLS_1_1", "TLS_1_0", "SSL_3_0"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TlsVersion {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ okhttp3.TlsVersion[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.TlsVersion.Companion INSTANCE;
    public static final okhttp3.TlsVersion SSL_3_0;
    public static final okhttp3.TlsVersion TLS_1_0;
    public static final okhttp3.TlsVersion TLS_1_1;
    public static final okhttp3.TlsVersion TLS_1_2;
    public static final okhttp3.TlsVersion TLS_1_3;
    private final java.lang.String javaName;

    private TlsVersion(java.lang.String str, int i, java.lang.String str2) {
        this.javaName = str2;
    }

    public final java.lang.String javaName() {
        return this.javaName;
    }

    static {
        okhttp3.TlsVersion tlsVersion = new okhttp3.TlsVersion("TLS_1_3", 0, "TLSv1.3");
        TLS_1_3 = tlsVersion;
        okhttp3.TlsVersion tlsVersion2 = new okhttp3.TlsVersion("TLS_1_2", 1, "TLSv1.2");
        TLS_1_2 = tlsVersion2;
        okhttp3.TlsVersion tlsVersion3 = new okhttp3.TlsVersion("TLS_1_1", 2, "TLSv1.1");
        TLS_1_1 = tlsVersion3;
        okhttp3.TlsVersion tlsVersion4 = new okhttp3.TlsVersion("TLS_1_0", 3, "TLSv1");
        TLS_1_0 = tlsVersion4;
        okhttp3.TlsVersion tlsVersion5 = new okhttp3.TlsVersion("SSL_3_0", 4, "SSLv3");
        SSL_3_0 = tlsVersion5;
        okhttp3.TlsVersion[] tlsVersionArr = {tlsVersion, tlsVersion2, tlsVersion3, tlsVersion4, tlsVersion5};
        $VALUES = tlsVersionArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(tlsVersionArr);
        INSTANCE = new okhttp3.TlsVersion.Companion(null);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "javaName", imports = {}))
    /* renamed from: -deprecated_javaName, reason: not valid java name and from getter */
    public final java.lang.String getJavaName() {
        return this.javaName;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lokhttp3/TlsVersion$Companion;", "", "<init>", "()V", "", "javaName", "Lokhttp3/TlsVersion;", "forJavaName", "(Ljava/lang/String;)Lokhttp3/TlsVersion;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.TlsVersion forJavaName(java.lang.String javaName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaName, "");
            int hashCode = javaName.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return okhttp3.TlsVersion.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return okhttp3.TlsVersion.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return okhttp3.TlsVersion.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return okhttp3.TlsVersion.TLS_1_0;
                }
            } else if (javaName.equals("SSLv3")) {
                return okhttp3.TlsVersion.SSL_3_0;
            }
            throw new java.lang.IllegalArgumentException("Unexpected TLS version: ".concat(java.lang.String.valueOf(javaName)));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static okhttp3.TlsVersion[] values() {
        return (okhttp3.TlsVersion[]) $VALUES.clone();
    }

    public static okhttp3.TlsVersion valueOf(java.lang.String str) {
        return (okhttp3.TlsVersion) java.lang.Enum.valueOf(okhttp3.TlsVersion.class, str);
    }

    public static kotlin.enums.EnumEntries<okhttp3.TlsVersion> getEntries() {
        return $ENTRIES;
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.TlsVersion forJavaName(java.lang.String str) {
        return INSTANCE.forJavaName(str);
    }
}
