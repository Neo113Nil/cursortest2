package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbxn implements com.google.android.libraries.places.internal.zzbnh {
    public static final /* synthetic */ int zza = 0;
    private final com.google.common.base.Supplier zzd;
    private static final java.util.logging.Logger zzb = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbxn.class.getName());
    private static final com.google.android.libraries.places.internal.zzbxl zze = new com.google.android.libraries.places.internal.zzbxl();
    private static final com.google.common.base.Supplier zzc = new com.google.android.libraries.places.internal.zzbxm();

    public zzbxn() {
        com.google.common.base.Supplier supplier = zzc;
        com.google.android.libraries.places.internal.zzbxl zzbxlVar = zze;
        this.zzd = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(supplier);
    }

    private final com.google.android.libraries.places.internal.zzbng zzc(java.net.InetSocketAddress inetSocketAddress) throws java.io.IOException {
        try {
            java.net.URI uri = new java.net.URI("https", null, inetSocketAddress.getHostString(), inetSocketAddress.getPort(), null, null, null);
            java.net.ProxySelector proxySelector = (java.net.ProxySelector) this.zzd.get();
            if (proxySelector == null) {
                zzb.logp(java.util.logging.Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                return null;
            }
            java.util.List<java.net.Proxy> select = proxySelector.select(uri);
            if (select.size() > 1) {
                zzb.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
            }
            java.net.Proxy proxy = select.get(0);
            if (proxy.type() == java.net.Proxy.Type.DIRECT) {
                return null;
            }
            java.net.InetSocketAddress inetSocketAddress2 = (java.net.InetSocketAddress) proxy.address();
            java.net.PasswordAuthentication zza2 = com.google.android.libraries.places.internal.zzbxl.zza(inetSocketAddress2.getHostString(), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", null);
            if (inetSocketAddress2.isUnresolved()) {
                inetSocketAddress2 = new java.net.InetSocketAddress(java.net.InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
            }
            com.google.android.libraries.places.internal.zzbkh zze2 = com.google.android.libraries.places.internal.zzbki.zze();
            zze2.zzb(inetSocketAddress);
            zze2.zza(inetSocketAddress2);
            if (zza2 == null) {
                return zze2.zze();
            }
            zze2.zzc(zza2.getUserName());
            zze2.zzd(zza2.getPassword() != null ? new java.lang.String(zza2.getPassword()) : null);
            return zze2.zze();
        } catch (java.net.URISyntaxException e) {
            zzb.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (java.lang.Throwable) e);
            return null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbnh
    @javax.annotation.Nullable
    public final com.google.android.libraries.places.internal.zzbng zza(java.net.SocketAddress socketAddress) throws java.io.IOException {
        if (socketAddress instanceof java.net.InetSocketAddress) {
            return zzc((java.net.InetSocketAddress) socketAddress);
        }
        return null;
    }
}
