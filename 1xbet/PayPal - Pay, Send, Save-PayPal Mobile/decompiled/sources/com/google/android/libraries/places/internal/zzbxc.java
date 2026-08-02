package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbxc extends com.google.android.libraries.places.internal.zzblp {
    private static final java.util.logging.Logger zzf = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbxc.class.getName());
    private final boolean zzg;
    private final com.google.android.libraries.places.internal.zzblg zzh;
    private final java.util.Map zzi;
    private final com.google.android.libraries.places.internal.zzbwv zzj;
    private int zzk;
    private boolean zzl;

    @javax.annotation.Nullable
    private com.google.android.libraries.places.internal.zzbnw zzm;
    private com.google.android.libraries.places.internal.zzbjn zzn;
    private com.google.android.libraries.places.internal.zzbjn zzo;
    private boolean zzp;

    @javax.annotation.Nullable
    private com.google.android.libraries.places.internal.zzbnw zzq;
    private final boolean zzr;
    private com.google.android.libraries.places.internal.zzbsh zzs;

    zzbxc(com.google.android.libraries.places.internal.zzblg zzblgVar) {
        boolean z = !zze() && com.google.android.libraries.places.internal.zzbsz.zzj("GRPC_PF_USE_HAPPY_EYEBALLS", false);
        this.zzg = z;
        this.zzi = new java.util.HashMap();
        this.zzj = new com.google.android.libraries.places.internal.zzbwv(com.google.common.collect.ImmutableList.of(), z);
        this.zzk = 0;
        this.zzl = true;
        this.zzm = null;
        com.google.android.libraries.places.internal.zzbjn zzbjnVar = com.google.android.libraries.places.internal.zzbjn.IDLE;
        this.zzn = zzbjnVar;
        this.zzo = zzbjnVar;
        this.zzp = true;
        this.zzq = null;
        this.zzr = zze();
        this.zzh = (com.google.android.libraries.places.internal.zzblg) com.google.common.base.Preconditions.checkNotNull(zzblgVar, "helper");
    }

    static boolean zze() {
        return com.google.android.libraries.places.internal.zzbsz.zzj("GRPC_SERIALIZE_RETRIES", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean zzo(com.google.common.collect.ImmutableList immutableList) {
        java.util.Map map = this.zzi;
        java.util.HashSet<java.net.SocketAddress> hashSet = new java.util.HashSet(map.keySet());
        java.util.HashSet hashSet2 = new java.util.HashSet();
        int size = immutableList.size();
        for (int i = 0; i < size; i++) {
            hashSet2.addAll(((com.google.android.libraries.places.internal.zzbka) immutableList.get(i)).zza());
        }
        for (java.net.SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((com.google.android.libraries.places.internal.zzbxb) map.remove(socketAddress)).zza().zzb();
            }
        }
        return hashSet.isEmpty();
    }

    private final void zzp() {
        if (this.zzr && this.zzq == null) {
            if (this.zzs == null) {
                this.zzs = new com.google.android.libraries.places.internal.zzbsh();
            }
            long zza = this.zzs.zza();
            com.google.android.libraries.places.internal.zzblg zzblgVar = this.zzh;
            this.zzq = zzblgVar.zzd().zzd(new com.google.android.libraries.places.internal.zzbwr(this), zza, java.util.concurrent.TimeUnit.NANOSECONDS, zzblgVar.zze());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final void zzg(com.google.android.libraries.places.internal.zzbxb zzbxbVar) {
        com.google.android.libraries.places.internal.zzbjn zzg = zzbxbVar.zzg();
        com.google.android.libraries.places.internal.zzbjn zzbjnVar = com.google.android.libraries.places.internal.zzbjn.READY;
        if (zzg == zzbjnVar) {
            if (this.zzp || zzbxbVar.zze() == zzbjnVar) {
                zzr(zzbjnVar, new com.google.android.libraries.places.internal.zzblf(com.google.android.libraries.places.internal.zzbli.zza(zzbxbVar.zzf(), null)));
                return;
            }
            com.google.android.libraries.places.internal.zzbjn zze = zzbxbVar.zze();
            com.google.android.libraries.places.internal.zzbjn zzbjnVar2 = com.google.android.libraries.places.internal.zzbjn.TRANSIENT_FAILURE;
            if (zze == zzbjnVar2) {
                zzr(zzbjnVar2, new com.google.android.libraries.places.internal.zzbwy(com.google.android.libraries.places.internal.zzbli.zzb(zzbxbVar.zzh().zzd())));
            } else if (this.zzo != zzbjnVar2) {
                zzr(zzbxbVar.zze(), new com.google.android.libraries.places.internal.zzbwy(com.google.android.libraries.places.internal.zzbli.zzd()));
            }
        }
    }

    private final void zzr(com.google.android.libraries.places.internal.zzbjn zzbjnVar, com.google.android.libraries.places.internal.zzbln zzblnVar) {
        if (zzbjnVar == this.zzo && (zzbjnVar == com.google.android.libraries.places.internal.zzbjn.IDLE || zzbjnVar == com.google.android.libraries.places.internal.zzbjn.CONNECTING)) {
            return;
        }
        this.zzo = zzbjnVar;
        this.zzh.zzb(zzbjnVar, zzblnVar);
    }

    private final void zzs() {
        if (this.zzg) {
            com.google.android.libraries.places.internal.zzbnw zzbnwVar = this.zzm;
            if (zzbnwVar == null || !zzbnwVar.zzb()) {
                com.google.android.libraries.places.internal.zzblg zzblgVar = this.zzh;
                this.zzm = zzblgVar.zzd().zzd(new com.google.android.libraries.places.internal.zzbws(this), 250L, java.util.concurrent.TimeUnit.MILLISECONDS, zzblgVar.zze());
            }
        }
    }

    private final void zzt() {
        com.google.android.libraries.places.internal.zzbnw zzbnwVar = this.zzm;
        if (zzbnwVar != null) {
            zzbnwVar.zza();
            this.zzm = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r3.size() != 1) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final java.net.SocketAddress zzu(com.google.android.libraries.places.internal.zzblm zzblmVar) {
        boolean z;
        com.google.android.libraries.places.internal.zzbvp zzbvpVar = (com.google.android.libraries.places.internal.zzbvp) zzblmVar;
        zzbvpVar.zzj.zze.zzc();
        com.google.common.base.Preconditions.checkState(zzbvpVar.zzg, "not started");
        java.util.List list = zzbvpVar.zze;
        if (list != null) {
            z = true;
        }
        z = false;
        com.google.common.base.Preconditions.checkState(z, "%s does not have exactly one group", list);
        return (java.net.SocketAddress) ((com.google.android.libraries.places.internal.zzbka) list.get(0)).zza().get(0);
    }

    @Override // com.google.android.libraries.places.internal.zzblp
    public final com.google.android.libraries.places.internal.zzbnp zza(com.google.android.libraries.places.internal.zzbll zzbllVar) {
        com.google.android.libraries.places.internal.zzbwx zzbwxVar;
        java.lang.Boolean bool;
        if (this.zzn == com.google.android.libraries.places.internal.zzbjn.SHUTDOWN) {
            return com.google.android.libraries.places.internal.zzbnp.zzg.zze("Already shut down");
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) zzbllVar.zzd().zza(zze);
        this.zzp = bool2 == null || !bool2.booleanValue();
        java.util.List<com.google.android.libraries.places.internal.zzbka> zzc = zzbllVar.zzc();
        if (zzc.isEmpty()) {
            com.google.android.libraries.places.internal.zzbnp zzbnpVar = com.google.android.libraries.places.internal.zzbnp.zzi;
            java.lang.String valueOf = java.lang.String.valueOf(zzbllVar.zzc());
            java.lang.String valueOf2 = java.lang.String.valueOf(zzbllVar.zzd());
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 55 + java.lang.String.valueOf(valueOf2).length());
            sb.append("NameResolver returned no usable address. addrs=");
            sb.append(valueOf);
            sb.append(", attrs=");
            sb.append(valueOf2);
            com.google.android.libraries.places.internal.zzbnp zze = zzbnpVar.zze(sb.toString());
            zzb(zze);
            return zze;
        }
        java.util.Iterator it = zzc.iterator();
        while (it.hasNext()) {
            if (((com.google.android.libraries.places.internal.zzbka) it.next()) == null) {
                com.google.android.libraries.places.internal.zzbnp zzbnpVar2 = com.google.android.libraries.places.internal.zzbnp.zzi;
                java.lang.String valueOf3 = java.lang.String.valueOf(zzbllVar.zzc());
                java.lang.String valueOf4 = java.lang.String.valueOf(zzbllVar.zzd());
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf3).length() + 69 + java.lang.String.valueOf(valueOf4).length());
                sb2.append("NameResolver returned address list with null endpoint. addrs=");
                sb2.append(valueOf3);
                sb2.append(", attrs=");
                sb2.append(valueOf4);
                com.google.android.libraries.places.internal.zzbnp zze2 = zzbnpVar2.zze(sb2.toString());
                zzb(zze2);
                return zze2;
            }
        }
        this.zzl = true;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.libraries.places.internal.zzbka zzbkaVar : zzc) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.net.SocketAddress socketAddress : zzbkaVar.zza()) {
                if (hashSet.add(socketAddress)) {
                    arrayList2.add(socketAddress);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new com.google.android.libraries.places.internal.zzbka(arrayList2, zzbkaVar.zzb()));
            }
        }
        if ((zzbllVar.zze() instanceof com.google.android.libraries.places.internal.zzbwx) && (bool = (zzbwxVar = (com.google.android.libraries.places.internal.zzbwx) zzbllVar.zze()).zza) != null && bool.booleanValue()) {
            java.lang.Long l = zzbwxVar.zzb;
            java.util.Collections.shuffle(arrayList, new java.util.Random());
        }
        com.google.common.collect.ImmutableList build = com.google.common.collect.ImmutableList.builder().addAll((java.lang.Iterable) arrayList).build();
        com.google.android.libraries.places.internal.zzbjn zzbjnVar = this.zzn;
        com.google.android.libraries.places.internal.zzbjn zzbjnVar2 = com.google.android.libraries.places.internal.zzbjn.READY;
        if (zzbjnVar == zzbjnVar2 || zzbjnVar == com.google.android.libraries.places.internal.zzbjn.CONNECTING) {
            com.google.android.libraries.places.internal.zzbwv zzbwvVar = this.zzj;
            java.net.SocketAddress zzd = zzbwvVar.zzd();
            zzbwvVar.zzg(build);
            if (zzbwvVar.zzh(zzd)) {
                ((com.google.android.libraries.places.internal.zzbxb) this.zzi.get(zzd)).zza().zzd(zzbwvVar.zzf());
                zzo(build);
                return com.google.android.libraries.places.internal.zzbnp.zza;
            }
        } else {
            this.zzj.zzg(build);
        }
        if (zzo(build)) {
            com.google.android.libraries.places.internal.zzbjn zzbjnVar3 = com.google.android.libraries.places.internal.zzbjn.CONNECTING;
            this.zzn = zzbjnVar3;
            zzr(zzbjnVar3, new com.google.android.libraries.places.internal.zzbwy(com.google.android.libraries.places.internal.zzbli.zzd()));
        }
        com.google.android.libraries.places.internal.zzbjn zzbjnVar4 = this.zzn;
        if (zzbjnVar4 == zzbjnVar2) {
            com.google.android.libraries.places.internal.zzbjn zzbjnVar5 = com.google.android.libraries.places.internal.zzbjn.IDLE;
            this.zzn = zzbjnVar5;
            zzr(zzbjnVar5, new com.google.android.libraries.places.internal.zzbxa(this, this));
        } else if (zzbjnVar4 == com.google.android.libraries.places.internal.zzbjn.CONNECTING || zzbjnVar4 == com.google.android.libraries.places.internal.zzbjn.TRANSIENT_FAILURE) {
            zzt();
            zzd();
        }
        return com.google.android.libraries.places.internal.zzbnp.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzblp
    public final void zzb(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        if (this.zzn == com.google.android.libraries.places.internal.zzbjn.SHUTDOWN) {
            return;
        }
        java.util.Map map = this.zzi;
        java.util.Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.libraries.places.internal.zzbxb) it.next()).zza().zzb();
        }
        map.clear();
        this.zzj.zzg(com.google.common.collect.ImmutableList.of());
        com.google.android.libraries.places.internal.zzbjn zzbjnVar = com.google.android.libraries.places.internal.zzbjn.TRANSIENT_FAILURE;
        this.zzn = zzbjnVar;
        zzr(zzbjnVar, new com.google.android.libraries.places.internal.zzbwy(com.google.android.libraries.places.internal.zzbli.zzb(zzbnpVar)));
    }

    @Override // com.google.android.libraries.places.internal.zzblp
    public final void zzc() {
        java.util.Map map = this.zzi;
        zzf.logp(java.util.logging.Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", java.lang.Integer.valueOf(map.size()));
        com.google.android.libraries.places.internal.zzbjn zzbjnVar = com.google.android.libraries.places.internal.zzbjn.SHUTDOWN;
        this.zzn = zzbjnVar;
        this.zzo = zzbjnVar;
        zzt();
        com.google.android.libraries.places.internal.zzbnw zzbnwVar = this.zzq;
        if (zzbnwVar != null) {
            zzbnwVar.zza();
            this.zzq = null;
        }
        this.zzs = null;
        java.util.Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.libraries.places.internal.zzbxb) it.next()).zza().zzb();
        }
        map.clear();
    }

    @Override // com.google.android.libraries.places.internal.zzblp
    public final void zzd() {
        com.google.android.libraries.places.internal.zzbwv zzbwvVar = this.zzj;
        if (!zzbwvVar.zza() || this.zzn == com.google.android.libraries.places.internal.zzbjn.SHUTDOWN) {
            return;
        }
        java.util.Map map = this.zzi;
        java.net.SocketAddress zzd = zzbwvVar.zzd();
        com.google.android.libraries.places.internal.zzbxb zzbxbVar = (com.google.android.libraries.places.internal.zzbxb) map.get(zzd);
        if (zzbxbVar == null) {
            com.google.android.libraries.places.internal.zzbio zze = zzbwvVar.zze();
            com.google.android.libraries.places.internal.zzbwt zzbwtVar = new com.google.android.libraries.places.internal.zzbwt(this, null);
            com.google.android.libraries.places.internal.zzblg zzblgVar = this.zzh;
            com.google.android.libraries.places.internal.zzblb zzd2 = com.google.android.libraries.places.internal.zzbld.zzd();
            zzd2.zzb(com.google.common.collect.Lists.newArrayList(new com.google.android.libraries.places.internal.zzbka(java.util.Collections.singletonList(zzd), zze)));
            zzd2.zza(zzb, zzbwtVar);
            zzd2.zza(com.google.android.libraries.places.internal.zzblp.zzc, java.lang.Boolean.valueOf(this.zzr));
            com.google.android.libraries.places.internal.zzblm zza = zzblgVar.zza(zzd2.zzc());
            final com.google.android.libraries.places.internal.zzbxb zzbxbVar2 = new com.google.android.libraries.places.internal.zzbxb(zza, com.google.android.libraries.places.internal.zzbjn.IDLE);
            zzbwtVar.zzb(zzbxbVar2);
            map.put(zzd, zzbxbVar2);
            com.google.android.libraries.places.internal.zzbio zzb = ((com.google.android.libraries.places.internal.zzbvp) zza).zza.zzb();
            if (this.zzp || zzb.zza(com.google.android.libraries.places.internal.zzblp.zzd) == null) {
                zzbxbVar2.zzi(com.google.android.libraries.places.internal.zzbjo.zza(com.google.android.libraries.places.internal.zzbjn.READY));
            }
            zza.zza(new com.google.android.libraries.places.internal.zzblo() { // from class: com.google.android.libraries.places.internal.zzbww
                @Override // com.google.android.libraries.places.internal.zzblo
                public final /* synthetic */ void zza(com.google.android.libraries.places.internal.zzbjo zzbjoVar) {
                    com.google.android.libraries.places.internal.zzbxc.this.zzf(zzbxbVar2, zzbjoVar);
                }
            });
            zzbxbVar = zzbxbVar2;
        }
        int ordinal = zzbxbVar.zzb().ordinal();
        if (ordinal == 0) {
            zzs();
            return;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                zzbxbVar.zzf().zzc();
                zzbxbVar.zzd(com.google.android.libraries.places.internal.zzbjn.CONNECTING);
                zzs();
                return;
            }
            return;
        }
        if (!this.zzr) {
            zzbwvVar.zzb();
            zzd();
        } else if (!zzbwvVar.zza()) {
            zzp();
        } else {
            zzbxbVar.zzf().zzc();
            zzbxbVar.zzd(com.google.android.libraries.places.internal.zzbjn.CONNECTING);
        }
    }

    final /* synthetic */ void zzf(com.google.android.libraries.places.internal.zzbxb zzbxbVar, com.google.android.libraries.places.internal.zzbjo zzbjoVar) {
        com.google.android.libraries.places.internal.zzblm zzf2 = zzbxbVar.zzf();
        com.google.android.libraries.places.internal.zzbjn zzc = zzbjoVar.zzc();
        java.util.Map map = this.zzi;
        if (zzbxbVar != map.get(zzu(zzf2)) || zzc == com.google.android.libraries.places.internal.zzbjn.SHUTDOWN) {
            return;
        }
        com.google.android.libraries.places.internal.zzbjn zzbjnVar = com.google.android.libraries.places.internal.zzbjn.IDLE;
        if (zzc == zzbjnVar && zzbxbVar.zzg() == com.google.android.libraries.places.internal.zzbjn.READY) {
            this.zzh.zzc();
        }
        zzbxbVar.zzd(zzc);
        com.google.android.libraries.places.internal.zzbjn zzbjnVar2 = this.zzn;
        com.google.android.libraries.places.internal.zzbjn zzbjnVar3 = com.google.android.libraries.places.internal.zzbjn.TRANSIENT_FAILURE;
        if (zzbjnVar2 == zzbjnVar3 || this.zzo == zzbjnVar3) {
            if (zzc == com.google.android.libraries.places.internal.zzbjn.CONNECTING) {
                return;
            }
            if (zzc == zzbjnVar) {
                zzd();
                return;
            }
        }
        int ordinal = zzc.ordinal();
        if (ordinal == 0) {
            com.google.android.libraries.places.internal.zzbjn zzbjnVar4 = com.google.android.libraries.places.internal.zzbjn.CONNECTING;
            this.zzn = zzbjnVar4;
            zzr(zzbjnVar4, new com.google.android.libraries.places.internal.zzbwy(com.google.android.libraries.places.internal.zzbli.zzd()));
            return;
        }
        if (ordinal == 1) {
            com.google.android.libraries.places.internal.zzbnw zzbnwVar = this.zzq;
            if (zzbnwVar != null) {
                zzbnwVar.zza();
                this.zzq = null;
            }
            this.zzs = null;
            zzt();
            for (com.google.android.libraries.places.internal.zzbxb zzbxbVar2 : map.values()) {
                if (!zzbxbVar2.zza().equals(zzbxbVar.zzf())) {
                    zzbxbVar2.zza().zzb();
                }
            }
            map.clear();
            com.google.android.libraries.places.internal.zzbjn zzbjnVar5 = com.google.android.libraries.places.internal.zzbjn.READY;
            zzbxbVar.zzd(zzbjnVar5);
            map.put(zzu(zzbxbVar.zzf()), zzbxbVar);
            this.zzj.zzh(zzu(zzbxbVar.zzf()));
            this.zzn = zzbjnVar5;
            zzg(zzbxbVar);
            return;
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                throw new java.lang.IllegalArgumentException("Unsupported state:".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzc))));
            }
            this.zzj.zzc();
            this.zzn = zzbjnVar;
            zzr(zzbjnVar, new com.google.android.libraries.places.internal.zzbxa(this, this));
            return;
        }
        com.google.android.libraries.places.internal.zzbwv zzbwvVar = this.zzj;
        if (zzbwvVar.zza() && map.get(zzbwvVar.zzd()) == zzbxbVar) {
            if (zzbwvVar.zzb()) {
                zzt();
                zzd();
            } else if (map.size() >= zzbwvVar.zzi()) {
                zzp();
            } else {
                zzbwvVar.zzc();
                zzd();
            }
        }
        if (map.size() >= zzbwvVar.zzi()) {
            java.util.Iterator it = map.values().iterator();
            while (it.hasNext()) {
                if (!((com.google.android.libraries.places.internal.zzbxb) it.next()).zzc()) {
                    return;
                }
            }
            this.zzn = zzbjnVar3;
            zzr(zzbjnVar3, new com.google.android.libraries.places.internal.zzbwy(com.google.android.libraries.places.internal.zzbli.zzb(zzbjoVar.zzd())));
            int i = this.zzk + 1;
            this.zzk = i;
            if (i >= zzbwvVar.zzi() || this.zzl) {
                this.zzl = false;
                this.zzk = 0;
                this.zzh.zzc();
            }
        }
    }

    final /* synthetic */ void zzn(com.google.android.libraries.places.internal.zzbnw zzbnwVar) {
        this.zzq = null;
    }

    final /* synthetic */ boolean zzm() {
        return this.zzp;
    }

    final /* synthetic */ void zzl(com.google.android.libraries.places.internal.zzbnw zzbnwVar) {
        this.zzm = null;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbwv zzk() {
        return this.zzj;
    }

    final /* synthetic */ java.util.Map zzj() {
        return this.zzi;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzblg zzi() {
        return this.zzh;
    }
}
