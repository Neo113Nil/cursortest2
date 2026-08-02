package okhttp3.dnsoverhttps;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lokhttp3/dnsoverhttps/BootstrapDns;", "Lokhttp3/Dns;", "", "dnsHostname", "", "Ljava/net/InetAddress;", "dnsServers", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "hostname", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BootstrapDns implements okhttp3.Dns {
    private final java.util.List<java.net.InetAddress> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public BootstrapDns(java.lang.String str, java.util.List<? extends java.net.InetAddress> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = list;
    }

    @Override // okhttp3.Dns
    public final java.util.List<java.net.InetAddress> lookup(java.lang.String hostname) throws java.net.UnknownHostException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, hostname)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BootstrapDns called for ");
            sb.append(hostname);
            sb.append(" instead of ");
            sb.append(this.Camera2StreamConfigurationMap);
            throw new java.net.UnknownHostException(sb.toString());
        }
        return this.getHighSpeedVideoFpsRanges;
    }
}
