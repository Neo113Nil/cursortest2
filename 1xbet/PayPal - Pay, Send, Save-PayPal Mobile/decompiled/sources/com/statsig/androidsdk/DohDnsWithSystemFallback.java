package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/statsig/androidsdk/DohDnsWithSystemFallback;", "Lokhttp3/Dns;", "Lokhttp3/dnsoverhttps/DnsOverHttps;", "doh", "systemDns", "<init>", "(Lokhttp3/dnsoverhttps/DnsOverHttps;Lokhttp3/Dns;)V", "", "hostname", "", "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "Lokhttp3/dnsoverhttps/DnsOverHttps;", "getDoh", "()Lokhttp3/dnsoverhttps/DnsOverHttps;", "Lokhttp3/Dns;", "getSystemDns", "()Lokhttp3/Dns;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DohDnsWithSystemFallback implements okhttp3.Dns {
    private final okhttp3.dnsoverhttps.DnsOverHttps doh;
    private final okhttp3.Dns systemDns;

    public DohDnsWithSystemFallback(okhttp3.dnsoverhttps.DnsOverHttps dnsOverHttps, okhttp3.Dns dns) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dnsOverHttps, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dns, "");
        this.doh = dnsOverHttps;
        this.systemDns = dns;
    }

    public /* synthetic */ DohDnsWithSystemFallback(okhttp3.dnsoverhttps.DnsOverHttps dnsOverHttps, okhttp3.Dns dns, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(dnsOverHttps, (i & 2) != 0 ? okhttp3.Dns.SYSTEM : dns);
    }

    public final okhttp3.dnsoverhttps.DnsOverHttps getDoh() {
        return this.doh;
    }

    public final okhttp3.Dns getSystemDns() {
        return this.systemDns;
    }

    @Override // okhttp3.Dns
    public final java.util.List<java.net.InetAddress> lookup(java.lang.String hostname) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "");
        try {
            return this.doh.lookup(hostname);
        } catch (java.io.IOException e) {
            e.getCause();
            return this.systemDns.lookup(hostname);
        }
    }
}
