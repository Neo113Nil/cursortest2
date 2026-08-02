package okhttp3;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lokhttp3/Dns;", "", "", "hostname", "", "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Dns {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.Dns.Companion INSTANCE = okhttp3.Dns.Companion.$$INSTANCE;
    public static final okhttp3.Dns SYSTEM = new okhttp3.Dns.Companion.DnsSystem();

    java.util.List<java.net.InetAddress> lookup(java.lang.String hostname) throws java.net.UnknownHostException;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001"}, d2 = {"Lokhttp3/Dns$Companion;", "", "<init>", "()V", "Lokhttp3/Dns;", "SYSTEM", "Lokhttp3/Dns;", "DnsSystem"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        static final /* synthetic */ okhttp3.Dns.Companion $$INSTANCE = new okhttp3.Dns.Companion();

        private Companion() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lokhttp3/Dns$Companion$DnsSystem;", "Lokhttp3/Dns;", "<init>", "()V", "", "p0", "", "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
        static final class DnsSystem implements okhttp3.Dns {
            @Override // okhttp3.Dns
            public final java.util.List<java.net.InetAddress> lookup(java.lang.String p0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                try {
                    java.net.InetAddress[] allByName = java.net.InetAddress.getAllByName(p0);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allByName, "");
                    return kotlin.collections.ArraysKt.toList(allByName);
                } catch (java.lang.NullPointerException e) {
                    java.net.UnknownHostException unknownHostException = new java.net.UnknownHostException("Broken system behaviour for dns lookup of ".concat(java.lang.String.valueOf(p0)));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }
    }
}
