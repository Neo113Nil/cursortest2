package okhttp3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lokhttp3/Protocol;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "protocol", "Ljava/lang/String;", "Companion", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "HTTP_3"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Protocol {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ okhttp3.Protocol[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.Protocol.Companion INSTANCE;
    public static final okhttp3.Protocol H2_PRIOR_KNOWLEDGE;
    public static final okhttp3.Protocol HTTP_1_0;
    public static final okhttp3.Protocol HTTP_1_1;
    public static final okhttp3.Protocol HTTP_2;
    public static final okhttp3.Protocol HTTP_3;
    public static final okhttp3.Protocol QUIC;

    @kotlin.Deprecated(message = "OkHttp has dropped support for SPDY. Prefer {@link #HTTP_2}.")
    public static final okhttp3.Protocol SPDY_3;
    private final java.lang.String protocol;

    private Protocol(java.lang.String str, int i, java.lang.String str2) {
        this.protocol = str2;
    }

    static {
        okhttp3.Protocol protocol = new okhttp3.Protocol("HTTP_1_0", 0, "http/1.0");
        HTTP_1_0 = protocol;
        okhttp3.Protocol protocol2 = new okhttp3.Protocol("HTTP_1_1", 1, "http/1.1");
        HTTP_1_1 = protocol2;
        okhttp3.Protocol protocol3 = new okhttp3.Protocol("SPDY_3", 2, "spdy/3.1");
        SPDY_3 = protocol3;
        okhttp3.Protocol protocol4 = new okhttp3.Protocol("HTTP_2", 3, "h2");
        HTTP_2 = protocol4;
        okhttp3.Protocol protocol5 = new okhttp3.Protocol("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        H2_PRIOR_KNOWLEDGE = protocol5;
        okhttp3.Protocol protocol6 = new okhttp3.Protocol("QUIC", 5, "quic");
        QUIC = protocol6;
        okhttp3.Protocol protocol7 = new okhttp3.Protocol("HTTP_3", 6, "h3");
        HTTP_3 = protocol7;
        okhttp3.Protocol[] protocolArr = {protocol, protocol2, protocol3, protocol4, protocol5, protocol6, protocol7};
        $VALUES = protocolArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(protocolArr);
        INSTANCE = new okhttp3.Protocol.Companion(null);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.protocol;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lokhttp3/Protocol$Companion;", "", "<init>", "()V", "", "protocol", "Lokhttp3/Protocol;", "get", "(Ljava/lang/String;)Lokhttp3/Protocol;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.Protocol get(java.lang.String protocol) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(protocol, okhttp3.Protocol.HTTP_1_0.protocol)) {
                return okhttp3.Protocol.HTTP_1_0;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(protocol, okhttp3.Protocol.HTTP_1_1.protocol)) {
                return okhttp3.Protocol.HTTP_1_1;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(protocol, okhttp3.Protocol.H2_PRIOR_KNOWLEDGE.protocol)) {
                return okhttp3.Protocol.H2_PRIOR_KNOWLEDGE;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(protocol, okhttp3.Protocol.HTTP_2.protocol)) {
                return okhttp3.Protocol.HTTP_2;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(protocol, okhttp3.Protocol.SPDY_3.protocol)) {
                return okhttp3.Protocol.SPDY_3;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(protocol, okhttp3.Protocol.QUIC.protocol)) {
                return okhttp3.Protocol.QUIC;
            }
            if (kotlin.text.StringsKt.startsWith$default(protocol, okhttp3.Protocol.HTTP_3.protocol, false, 2, (java.lang.Object) null)) {
                return okhttp3.Protocol.HTTP_3;
            }
            throw new java.io.IOException("Unexpected protocol: ".concat(java.lang.String.valueOf(protocol)));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static okhttp3.Protocol[] values() {
        return (okhttp3.Protocol[]) $VALUES.clone();
    }

    public static okhttp3.Protocol valueOf(java.lang.String str) {
        return (okhttp3.Protocol) java.lang.Enum.valueOf(okhttp3.Protocol.class, str);
    }

    public static kotlin.enums.EnumEntries<okhttp3.Protocol> getEntries() {
        return $ENTRIES;
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.Protocol get(java.lang.String str) throws java.io.IOException {
        return INSTANCE.get(str);
    }
}
