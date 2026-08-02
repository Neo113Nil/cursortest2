package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbse extends com.google.android.libraries.places.internal.zzbmy {
    static final boolean zzb;
    static final boolean zzc;
    protected static final boolean zzd;
    private static final java.util.logging.Logger zzh;
    private static final java.util.Set zzi;
    private static final java.lang.String zzj;
    private static final java.lang.String zzk;
    private static final java.lang.String zzl;
    private static final com.google.android.libraries.places.internal.zzbsd zzm;
    private static java.lang.String zzn;
    private boolean zzA;
    private com.google.android.libraries.places.internal.zzbmu zzB;
    final com.google.android.libraries.places.internal.zzbnh zze;
    protected boolean zzg;
    private final java.lang.String zzq;
    private final java.lang.String zzr;
    private final int zzs;
    private final com.google.android.libraries.places.internal.zzbwo zzt;
    private final long zzu;
    private final com.google.android.libraries.places.internal.zzbnx zzv;
    private final com.google.android.libraries.places.internal.zzbmx zzw;
    private final com.google.common.base.Stopwatch zzx;
    private boolean zzy;
    private java.util.concurrent.Executor zzz;
    private final java.util.Random zzo = new java.util.Random();
    protected volatile com.google.android.libraries.places.internal.zzbru zzf = com.google.android.libraries.places.internal.zzbrw.INSTANCE;
    private final java.util.concurrent.atomic.AtomicReference zzp = new java.util.concurrent.atomic.AtomicReference();

    static {
        com.google.android.libraries.places.internal.zzbsd zzbsdVar;
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbse.class.getName());
        zzh = logger;
        zzi = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        java.lang.String property = java.lang.System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        zzj = property;
        java.lang.String property2 = java.lang.System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        zzk = property2;
        java.lang.String property3 = java.lang.System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        zzl = property3;
        zzb = java.lang.Boolean.parseBoolean(property);
        zzc = java.lang.Boolean.parseBoolean(property2);
        zzd = java.lang.Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    zzbsdVar = (com.google.android.libraries.places.internal.zzbsd) java.lang.Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, com.google.android.libraries.places.internal.zzbse.class.getClassLoader()).asSubclass(com.google.android.libraries.places.internal.zzbsd.class).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                } catch (java.lang.Exception e) {
                    zzh.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (java.lang.Throwable) e);
                }
            } catch (java.lang.Exception e2) {
                zzh.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (java.lang.Throwable) e2);
            }
        } catch (java.lang.ClassCastException e3) {
            zzh.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (java.lang.Throwable) e3);
        } catch (java.lang.ClassNotFoundException e4) {
            zzh.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (java.lang.Throwable) e4);
        }
        if (zzbsdVar.zzb() != null) {
            logger.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", zzbsdVar.zzb());
            zzbsdVar = null;
        }
        zzm = zzbsdVar;
    }

    protected zzbse(@javax.annotation.Nullable java.lang.String str, java.lang.String str2, com.google.android.libraries.places.internal.zzbmr zzbmrVar, com.google.android.libraries.places.internal.zzbzx zzbzxVar, com.google.common.base.Stopwatch stopwatch, boolean z) {
        com.google.common.base.Preconditions.checkNotNull(zzbmrVar, "args");
        java.net.URI create = java.net.URI.create("//".concat(java.lang.String.valueOf((java.lang.String) com.google.common.base.Preconditions.checkNotNull(str2, "name"))));
        com.google.common.base.Preconditions.checkArgument(create.getHost() != null, "Invalid DNS name: %s", str2);
        this.zzq = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(create.getAuthority(), "nameUri (%s) doesn't have an authority", create);
        this.zzr = create.getHost();
        if (create.getPort() == -1) {
            this.zzs = zzbmrVar.zza();
        } else {
            this.zzs = create.getPort();
        }
        this.zze = (com.google.android.libraries.places.internal.zzbnh) com.google.common.base.Preconditions.checkNotNull(zzbmrVar.zzb(), "proxyDetector");
        java.util.concurrent.Executor zzf = zzbmrVar.zzf();
        if (zzf != null) {
            this.zzt = new com.google.android.libraries.places.internal.zzbsk(zzf);
        } else {
            this.zzt = com.google.android.libraries.places.internal.zzbzz.zzc(zzbzxVar);
        }
        long j = 0;
        if (!z) {
            java.lang.String property = java.lang.System.getProperty("networkaddress.cache.ttl");
            long j2 = 30;
            if (property != null) {
                try {
                    j2 = java.lang.Long.parseLong(property);
                } catch (java.lang.NumberFormatException unused) {
                    zzh.logp(java.util.logging.Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new java.lang.Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            j = j2 > 0 ? java.util.concurrent.TimeUnit.SECONDS.toNanos(j2) : j2;
        }
        this.zzu = j;
        this.zzx = (com.google.common.base.Stopwatch) com.google.common.base.Preconditions.checkNotNull(stopwatch, androidx.core.app.NotificationCompat.CATEGORY_STOPWATCH);
        this.zzv = (com.google.android.libraries.places.internal.zzbnx) com.google.common.base.Preconditions.checkNotNull(zzbmrVar.zzc(), "syncContext");
        this.zzw = (com.google.android.libraries.places.internal.zzbmx) com.google.common.base.Preconditions.checkNotNull(zzbmrVar.zze(), "serviceConfigParser");
    }

    private final void zzm() {
        if (this.zzA || this.zzy) {
            return;
        }
        if (this.zzg) {
            long j = this.zzu;
            if (j != 0 && (j <= 0 || this.zzx.elapsed(java.util.concurrent.TimeUnit.NANOSECONDS) <= j)) {
                return;
            }
        }
        this.zzA = true;
        this.zzz.execute(new com.google.android.libraries.places.internal.zzbsb(this, this.zzB));
    }

    private static java.lang.String zzn() {
        if (zzn == null) {
            try {
                zzn = java.net.InetAddress.getLocalHost().getHostName();
            } catch (java.net.UnknownHostException e) {
                throw new java.lang.RuntimeException(e);
            }
        }
        return zzn;
    }

    @Override // com.google.android.libraries.places.internal.zzbmy
    public final void zzb(com.google.android.libraries.places.internal.zzbmu zzbmuVar) {
        com.google.common.base.Preconditions.checkState(this.zzB == null, "already started");
        this.zzz = (java.util.concurrent.Executor) this.zzt.zza();
        this.zzB = (com.google.android.libraries.places.internal.zzbmu) com.google.common.base.Preconditions.checkNotNull(zzbmuVar, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        zzm();
    }

    @Override // com.google.android.libraries.places.internal.zzbmy
    public final void zzc() {
        if (this.zzy) {
            return;
        }
        this.zzy = true;
        java.util.concurrent.Executor executor = this.zzz;
        if (executor != null) {
            this.zzt.zzb(executor);
            this.zzz = null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbmy
    public final void zzd() {
        com.google.common.base.Preconditions.checkState(this.zzB != null, "not started");
        zzm();
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0093, code lost:
    
        if (r7 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (r7 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0095, code lost:
    
        r0 = (com.google.android.libraries.places.internal.zzbsc) r18.zzp.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
    
        if (r0 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        r6 = com.google.android.libraries.places.internal.zzbse.zzm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
    
        if (r6 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
    
        r0 = r6.zza();
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[LOOP:2: B:49:0x012b->B:84:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final com.google.android.libraries.places.internal.zzbrv zze(boolean z) {
        com.google.android.libraries.places.internal.zzbsc zzbscVar;
        com.google.android.libraries.places.internal.zzbms zzb2;
        java.lang.Exception exc = null;
        r4 = null;
        com.google.android.libraries.places.internal.zzbms zzbmsVar = null;
        exc = null;
        com.google.android.libraries.places.internal.zzbrv zzbrvVar = new com.google.android.libraries.places.internal.zzbrv(null);
        try {
            try {
                try {
                    java.util.List unmodifiableList = java.util.Collections.unmodifiableList(java.util.Arrays.asList(java.net.InetAddress.getAllByName(this.zzr)));
                    java.util.ArrayList arrayList = new java.util.ArrayList(unmodifiableList.size());
                    java.util.Iterator it = unmodifiableList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new com.google.android.libraries.places.internal.zzbka(java.util.Collections.singletonList(new java.net.InetSocketAddress((java.net.InetAddress) it.next(), this.zzs)), com.google.android.libraries.places.internal.zzbio.zza));
                    }
                    zzbrvVar.zzd(java.util.Collections.unmodifiableList(arrayList));
                    if (zzd) {
                        java.lang.String str = this.zzr;
                        java.util.List<java.lang.String> emptyList = java.util.Collections.emptyList();
                        boolean z2 = zzb;
                        boolean z3 = zzc;
                        if (z2) {
                            if (!com.datadog.trace.api.ConfigDefaults.DEFAULT_AGENT_HOST.equalsIgnoreCase(str)) {
                                if (!str.contains(io.ktor.sse.ServerSentEventKt.COLON)) {
                                    int i = 0;
                                    boolean z4 = true;
                                    while (i < str.length()) {
                                        char charAt = str.charAt(i);
                                        if (charAt != '.') {
                                            z4 = (z4 ? 1 : 0) & (charAt >= '0' && charAt <= '9');
                                        }
                                        i++;
                                        z4 = z4;
                                    }
                                }
                            }
                            if (zzbscVar != null) {
                                try {
                                    emptyList = zzbscVar.zza();
                                } catch (java.lang.Exception e) {
                                    zzh.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "ServiceConfig resolution failure", (java.lang.Throwable) e);
                                }
                            }
                            if (emptyList.isEmpty()) {
                                java.util.Random random = this.zzo;
                                java.lang.String zzn2 = zzn();
                                try {
                                    java.util.ArrayList<java.util.Map> arrayList2 = new java.util.ArrayList();
                                    for (java.lang.String str2 : emptyList) {
                                        if (str2.startsWith("grpc_config=")) {
                                            java.lang.Object zza = com.google.android.libraries.places.internal.zzbuc.zza(str2.substring(12));
                                            if (!(zza instanceof java.util.List)) {
                                                throw new java.lang.ClassCastException("wrong type ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zza))));
                                            }
                                            java.util.List list = (java.util.List) zza;
                                            com.google.android.libraries.places.internal.zzbud.zzj(list);
                                            arrayList2.addAll(list);
                                        } else {
                                            zzh.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "parseTxtResults", "Ignoring non service config {0}", new java.lang.Object[]{str2});
                                        }
                                    }
                                    java.util.Map map = null;
                                    for (java.util.Map map2 : arrayList2) {
                                        try {
                                            for (java.util.Map.Entry entry : map2.entrySet()) {
                                                com.google.common.base.Verify.verify(zzi.contains(entry.getKey()), "Bad key: %s", entry);
                                            }
                                            java.util.List zzc2 = com.google.android.libraries.places.internal.zzbud.zzc(map2, "clientLanguage");
                                            if (zzc2 != null && !zzc2.isEmpty()) {
                                                java.util.Iterator it2 = zzc2.iterator();
                                                while (it2.hasNext()) {
                                                    if ("java".equalsIgnoreCase((java.lang.String) it2.next())) {
                                                    }
                                                }
                                                map = null;
                                                if (map == null) {
                                                    break;
                                                }
                                            }
                                            java.lang.Double zze = com.google.android.libraries.places.internal.zzbud.zze(map2, "percentage");
                                            if (zze != null) {
                                                int intValue = zze.intValue();
                                                com.google.common.base.Verify.verify(intValue >= 0 && intValue <= 100, "Bad percentage: %s", zze);
                                                if (random.nextInt(100) >= intValue) {
                                                    map = null;
                                                    if (map == null) {
                                                    }
                                                }
                                            }
                                            java.util.List zzc3 = com.google.android.libraries.places.internal.zzbud.zzc(map2, "clientHostname");
                                            if (zzc3 != null && !zzc3.isEmpty()) {
                                                java.util.Iterator it3 = zzc3.iterator();
                                                while (it3.hasNext()) {
                                                    if (((java.lang.String) it3.next()).equals(zzn2)) {
                                                    }
                                                }
                                                map = null;
                                                if (map == null) {
                                                }
                                            }
                                            java.util.Map zzd2 = com.google.android.libraries.places.internal.zzbud.zzd(map2, "serviceConfig");
                                            if (zzd2 == null) {
                                                throw new com.google.common.base.VerifyException(java.lang.String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                            }
                                            map = zzd2;
                                            if (map == null) {
                                            }
                                        } catch (java.lang.RuntimeException e2) {
                                            zzb2 = com.google.android.libraries.places.internal.zzbms.zzb(com.google.android.libraries.places.internal.zzbnp.zzc.zze("failed to pick service config choice").zzd(e2));
                                        }
                                    }
                                    zzb2 = map == null ? null : com.google.android.libraries.places.internal.zzbms.zza(map);
                                } catch (java.io.IOException | java.lang.RuntimeException e3) {
                                    zzb2 = com.google.android.libraries.places.internal.zzbms.zzb(com.google.android.libraries.places.internal.zzbnp.zzc.zze("failed to parse TXT records").zzd(e3));
                                }
                                if (zzb2 != null) {
                                    zzbmsVar = zzb2.zzd() != null ? com.google.android.libraries.places.internal.zzbms.zzb(zzb2.zzd()) : this.zzw.zza((java.util.Map) zzb2.zzc());
                                }
                            } else {
                                zzh.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "No TXT records found for {0}", new java.lang.Object[]{this.zzr});
                            }
                            zzbrvVar.zzf(zzbmsVar);
                        }
                        zzbscVar = null;
                        if (zzbscVar != null) {
                        }
                        if (emptyList.isEmpty()) {
                        }
                        zzbrvVar.zzf(zzbmsVar);
                    }
                    return zzbrvVar;
                } catch (java.lang.Exception e4) {
                    exc = e4;
                    com.google.common.base.Throwables.throwIfUnchecked(exc);
                    throw new java.lang.RuntimeException(exc);
                }
            } catch (java.lang.Throwable th) {
                java.lang.Exception exc2 = exc;
                if (exc2 != null) {
                    zzh.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveAddresses", "Address resolution failure", (java.lang.Throwable) exc2);
                }
                throw th;
            }
        } catch (java.lang.Exception e5) {
            zzbrvVar.zzb(com.google.android.libraries.places.internal.zzbnp.zzi.zze("Unable to resolve host ".concat(java.lang.String.valueOf(this.zzr))).zzd(e5));
            return zzbrvVar;
        }
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbka zzf() {
        com.google.android.libraries.places.internal.zzbng zza = this.zze.zza(java.net.InetSocketAddress.createUnresolved(this.zzr, this.zzs));
        if (zza == null) {
            return null;
        }
        return new com.google.android.libraries.places.internal.zzbka(java.util.Collections.singletonList(zza), com.google.android.libraries.places.internal.zzbio.zza);
    }

    final /* synthetic */ void zzl(boolean z) {
        this.zzA = false;
    }

    final /* synthetic */ com.google.common.base.Stopwatch zzk() {
        return this.zzx;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbnx zzj() {
        return this.zzv;
    }

    final /* synthetic */ long zzi() {
        return this.zzu;
    }

    final /* synthetic */ java.lang.String zzh() {
        return this.zzr;
    }

    @Override // com.google.android.libraries.places.internal.zzbmy
    public final java.lang.String zza() {
        return this.zzq;
    }
}
