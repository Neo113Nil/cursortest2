package com.lyft.kronos.internal.ntp;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/lyft/kronos/internal/ntp/DnsResolverImpl;", "Lcom/lyft/kronos/internal/ntp/DnsResolver;", "<init>", "()V", "", com.datadog.android.log.LogAttributes.HOST, "Ljava/net/InetAddress;", "resolve", "(Ljava/lang/String;)Ljava/net/InetAddress;"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class DnsResolverImpl implements com.lyft.kronos.internal.ntp.DnsResolver {
    @Override // com.lyft.kronos.internal.ntp.DnsResolver
    public final java.net.InetAddress resolve(java.lang.String host) throws java.net.UnknownHostException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "");
        java.net.InetAddress byName = java.net.InetAddress.getByName(host);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byName, "");
        return byName;
    }
}
