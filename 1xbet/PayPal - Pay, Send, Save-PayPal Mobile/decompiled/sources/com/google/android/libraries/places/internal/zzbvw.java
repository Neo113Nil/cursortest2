package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbvw extends com.google.android.libraries.places.internal.zzbly {
    private static final java.lang.reflect.Method zzt;
    final com.google.android.libraries.places.internal.zzbwo zzd;
    final com.google.android.libraries.places.internal.zzbwo zze;
    final com.google.android.libraries.places.internal.zzbnc zzf;
    final java.util.List zzg;
    final java.lang.String zzh;

    @javax.annotation.Nullable
    java.lang.String zzi;
    final java.lang.String zzj;
    final com.google.android.libraries.places.internal.zzbjy zzk;
    final com.google.android.libraries.places.internal.zzbjk zzl;
    final long zzm;
    final com.google.android.libraries.places.internal.zzbkn zzn;
    final java.util.List zzo;
    private final java.util.List zzu;
    private final com.google.android.libraries.places.internal.zzbvt zzv;
    private final com.google.android.libraries.places.internal.zzbvs zzw;
    private static final java.util.logging.Logger zzp = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbvw.class.getName());
    static final long zza = java.util.concurrent.TimeUnit.MINUTES.toMillis(30);
    static final long zzb = java.util.concurrent.TimeUnit.SECONDS.toMillis(1);
    private static final com.google.android.libraries.places.internal.zzbwo zzq = com.google.android.libraries.places.internal.zzbzz.zzc(com.google.android.libraries.places.internal.zzbsz.zzm);
    private static final com.google.android.libraries.places.internal.zzbjy zzr = com.google.android.libraries.places.internal.zzbjy.zza();
    private static final com.google.android.libraries.places.internal.zzbjk zzs = com.google.android.libraries.places.internal.zzbjk.zza();
    static final java.util.regex.Pattern zzc = java.util.regex.Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    static {
        java.lang.reflect.Method method;
        try {
            method = java.lang.Class.forName("com.google.android.libraries.places.internal.zzbob").getDeclaredMethod("getClientInterceptor", java.lang.Boolean.TYPE, java.lang.Boolean.TYPE, java.lang.Boolean.TYPE, java.lang.Boolean.TYPE);
        } catch (java.lang.ClassNotFoundException e) {
            zzp.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (java.lang.Throwable) e);
            method = null;
            zzt = method;
        } catch (java.lang.NoSuchMethodException e2) {
            zzp.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (java.lang.Throwable) e2);
            method = null;
            zzt = method;
        }
        zzt = method;
    }

    public zzbvw(java.lang.String str, @javax.annotation.Nullable com.google.android.libraries.places.internal.zzbiu zzbiuVar, @javax.annotation.Nullable com.google.android.libraries.places.internal.zzbip zzbipVar, com.google.android.libraries.places.internal.zzbvt zzbvtVar, @javax.annotation.Nullable com.google.android.libraries.places.internal.zzbvs zzbvsVar) {
        com.google.android.libraries.places.internal.zzbwo zzbwoVar = zzq;
        this.zzd = zzbwoVar;
        this.zze = zzbwoVar;
        this.zzu = new java.util.ArrayList();
        this.zzf = com.google.android.libraries.places.internal.zzbnc.zzc();
        this.zzg = new java.util.ArrayList();
        this.zzj = "pick_first";
        this.zzk = zzr;
        this.zzl = zzs;
        this.zzm = zza;
        this.zzn = com.google.android.libraries.places.internal.zzbkn.zza();
        this.zzo = new java.util.ArrayList();
        this.zzh = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET);
        this.zzv = (com.google.android.libraries.places.internal.zzbvt) com.google.common.base.Preconditions.checkNotNull(zzbvtVar, "clientTransportFactoryBuilder");
        this.zzw = zzbvsVar;
        com.google.android.libraries.places.internal.zzbkr.zza(this);
    }

    static com.google.android.libraries.places.internal.zzbvv zze(java.lang.String str, com.google.android.libraries.places.internal.zzbnc zzbncVar, java.util.Collection collection) {
        java.net.URI uri;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            uri = new java.net.URI(str);
        } catch (java.net.URISyntaxException e) {
            sb.append(e.getMessage());
            uri = null;
        }
        com.google.android.libraries.places.internal.zzbmz zzb2 = uri != null ? zzbncVar.zzb(uri.getScheme()) : null;
        java.lang.String str2 = "";
        if (zzb2 == null && !zzc.matcher(str).matches()) {
            try {
                java.lang.String zza2 = zzbncVar.zza();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1);
                sb2.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                sb2.append(str);
                java.net.URI uri2 = new java.net.URI(zza2, "", sb2.toString(), null);
                uri = uri2;
                zzb2 = zzbncVar.zzb(uri2.getScheme());
            } catch (java.net.URISyntaxException e2) {
                throw new java.lang.IllegalArgumentException(e2);
            }
        }
        if (zzb2 != null) {
            if (collection == null || collection.containsAll(zzb2.zze())) {
                return new com.google.android.libraries.places.internal.zzbvv(uri, zzb2);
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Address types of NameResolver '%s' for '%s' not supported by transport", uri.getScheme(), str));
        }
        if (sb.length() > 0) {
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(obj.length() + 3);
            sb3.append(" (");
            sb3.append(obj);
            sb3.append(")");
            str2 = sb3.toString();
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Could not find a NameResolverProvider for %s%s", str, str2));
    }

    public final com.google.android.libraries.places.internal.zzbvw zza(java.util.List list) {
        this.zzu.addAll(list);
        return this;
    }

    final int zzc() {
        this.zzw.zza();
        return 443;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:11|12|(9:33|34|(1:16)|17|18|19|(1:21)|22|23)|14|(0)|17|18|19|(0)|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e4, code lost:
    
        com.google.android.libraries.places.internal.zzbvw.zzp.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c2, code lost:
    
        com.google.android.libraries.places.internal.zzbvw.zzp.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
    
        com.google.android.libraries.places.internal.zzbvw.zzp.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        com.google.android.libraries.places.internal.zzbvw.zzp.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f5  */
    @Override // com.google.android.libraries.places.internal.zzbly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.libraries.places.internal.zzblw zzd() {
        com.google.android.libraries.places.internal.zzbiy zzbiyVar;
        com.google.android.libraries.places.internal.zzbpq zza2 = this.zzv.zza();
        com.google.android.libraries.places.internal.zzbvv zze = zze(this.zzh, this.zzf, java.util.Collections.singleton(java.net.InetSocketAddress.class));
        java.net.URI uri = zze.zza;
        com.google.android.libraries.places.internal.zzbmz zzbmzVar = zze.zzb;
        com.google.android.libraries.places.internal.zzbsg zzbsgVar = new com.google.android.libraries.places.internal.zzbsg();
        com.google.android.libraries.places.internal.zzbzz zzc2 = com.google.android.libraries.places.internal.zzbzz.zzc(com.google.android.libraries.places.internal.zzbsz.zzm);
        com.google.common.base.Supplier supplier = com.google.android.libraries.places.internal.zzbsz.zzo;
        java.util.List list = this.zzu;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (true) {
            com.google.android.libraries.places.internal.zzbiy zzbiyVar2 = null;
            if (!it.hasNext()) {
                com.google.android.libraries.places.internal.zzbkr.zzb();
                java.lang.reflect.Method method = zzt;
                if (method != null) {
                    try {
                        java.lang.Boolean bool = java.lang.Boolean.TRUE;
                        zzbiyVar = (com.google.android.libraries.places.internal.zzbiy) method.invoke(null, bool, bool, java.lang.Boolean.FALSE, bool);
                    } catch (java.lang.IllegalAccessException e) {
                        zzp.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) e);
                    } catch (java.lang.reflect.InvocationTargetException e2) {
                        zzp.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) e2);
                    }
                    if (zzbiyVar != null) {
                        arrayList.add(0, zzbiyVar);
                    }
                    zzbiyVar2 = (com.google.android.libraries.places.internal.zzbiy) java.lang.Class.forName("com.google.android.libraries.places.internal.zzboc").getDeclaredMethod("getClientInterceptor", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    if (zzbiyVar2 != null) {
                        arrayList.add(0, zzbiyVar2);
                    }
                    return new com.google.android.libraries.places.internal.zzbvy(new com.google.android.libraries.places.internal.zzbvr(this, zza2, uri, zzbmzVar, zzbsgVar, zzc2, supplier, arrayList, com.google.android.libraries.places.internal.zzcag.zza));
                }
                zzbiyVar = null;
                if (zzbiyVar != null) {
                }
                zzbiyVar2 = (com.google.android.libraries.places.internal.zzbiy) java.lang.Class.forName("com.google.android.libraries.places.internal.zzboc").getDeclaredMethod("getClientInterceptor", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                if (zzbiyVar2 != null) {
                }
                return new com.google.android.libraries.places.internal.zzbvy(new com.google.android.libraries.places.internal.zzbvr(this, zza2, uri, zzbmzVar, zzbsgVar, zzc2, supplier, arrayList, com.google.android.libraries.places.internal.zzcag.zza));
            }
            com.google.android.libraries.places.internal.zzbiy zzbiyVar3 = (com.google.android.libraries.places.internal.zzbiy) it.next();
            if (zzbiyVar3 instanceof com.google.android.libraries.places.internal.zzbvu) {
                com.google.android.libraries.places.internal.zzblx zzblxVar = ((com.google.android.libraries.places.internal.zzbvu) zzbiyVar3).zza;
                throw null;
            }
            arrayList.add(zzbiyVar3);
        }
    }

    public final com.google.android.libraries.places.internal.zzbvw zzb(@javax.annotation.Nullable java.lang.String str) {
        this.zzi = str;
        return this;
    }
}
