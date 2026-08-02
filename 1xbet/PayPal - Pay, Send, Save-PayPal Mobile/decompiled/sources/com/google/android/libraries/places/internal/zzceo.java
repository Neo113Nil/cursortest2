package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzceo extends com.google.android.libraries.places.internal.zzblp {
    private static final java.util.logging.Logger zzi = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzceo.class.getName());
    private static final int zzj = new java.util.Random().nextInt();
    protected boolean zzf;
    protected com.google.android.libraries.places.internal.zzbjn zzh;
    private final com.google.android.libraries.places.internal.zzblg zzl;
    private java.util.List zzk = new java.util.ArrayList(0);
    protected final com.google.android.libraries.places.internal.zzblr zzg = new com.google.android.libraries.places.internal.zzbxj();

    protected zzceo(com.google.android.libraries.places.internal.zzblg zzblgVar) {
        this.zzl = (com.google.android.libraries.places.internal.zzblg) com.google.common.base.Preconditions.checkNotNull(zzblgVar, "helper");
        zzi.logp(java.util.logging.Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "<init>", "Created");
    }

    @Override // com.google.android.libraries.places.internal.zzblp
    public final com.google.android.libraries.places.internal.zzbnp zza(com.google.android.libraries.places.internal.zzbll zzbllVar) {
        com.google.android.libraries.places.internal.zzbnp zzbnpVar;
        zzi.logp(java.util.logging.Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "acceptResolvedAddresses", "Received resolution result: {0}", zzbllVar);
        try {
            this.zzf = true;
            java.util.LinkedHashMap newLinkedHashMapWithExpectedSize = com.google.common.collect.Maps.newLinkedHashMapWithExpectedSize(zzbllVar.zzc().size());
            for (com.google.android.libraries.places.internal.zzbka zzbkaVar : zzbllVar.zzc()) {
                com.google.android.libraries.places.internal.zzblk zzb = zzbllVar.zzb();
                zzb.zza(java.util.Collections.singletonList(zzbkaVar));
                com.google.android.libraries.places.internal.zzbim zzb2 = com.google.android.libraries.places.internal.zzbio.zzb();
                zzb2.zza(zze, java.lang.Boolean.TRUE);
                zzb.zzb(zzb2.zzc());
                zzb.zzc(null);
                newLinkedHashMapWithExpectedSize.put(new com.google.android.libraries.places.internal.zzcen(zzbkaVar), zzb.zzd());
            }
            if (newLinkedHashMapWithExpectedSize.isEmpty()) {
                com.google.android.libraries.places.internal.zzbnp zzbnpVar2 = com.google.android.libraries.places.internal.zzbnp.zzi;
                java.lang.String obj = zzbllVar.toString();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 41);
                sb.append("NameResolver returned no usable address. ");
                sb.append(obj);
                zzbnpVar = zzbnpVar2.zze(sb.toString());
                zzb(zzbnpVar);
            } else {
                java.util.LinkedHashMap newLinkedHashMapWithExpectedSize2 = com.google.common.collect.Maps.newLinkedHashMapWithExpectedSize(this.zzk.size());
                for (com.google.android.libraries.places.internal.zzcem zzcemVar : this.zzk) {
                    newLinkedHashMapWithExpectedSize2.put(zzcemVar.zzc(), zzcemVar);
                }
                com.google.android.libraries.places.internal.zzbnp zzbnpVar3 = com.google.android.libraries.places.internal.zzbnp.zza;
                java.util.ArrayList arrayList = new java.util.ArrayList(newLinkedHashMapWithExpectedSize.size());
                for (java.util.Map.Entry entry : newLinkedHashMapWithExpectedSize.entrySet()) {
                    com.google.android.libraries.places.internal.zzcem zzcemVar2 = (com.google.android.libraries.places.internal.zzcem) newLinkedHashMapWithExpectedSize2.remove(entry.getKey());
                    if (zzcemVar2 == null) {
                        zzcemVar2 = zzf(entry.getKey());
                    }
                    arrayList.add(zzcemVar2);
                }
                int remainder = arrayList.isEmpty() ? 0 : com.google.common.primitives.UnsignedInts.remainder(zzj, arrayList.size());
                for (com.google.android.libraries.places.internal.zzcem zzcemVar3 : com.google.common.collect.Iterables.concat(com.google.common.collect.Iterables.skip(arrayList, remainder), com.google.common.collect.Iterables.limit(arrayList, remainder))) {
                    com.google.android.libraries.places.internal.zzbll zzbllVar2 = (com.google.android.libraries.places.internal.zzbll) newLinkedHashMapWithExpectedSize.get(zzcemVar3.zzc());
                    if (zzbllVar2 != null) {
                        com.google.android.libraries.places.internal.zzbnp zza = zzcemVar3.zzg().zza(zzbllVar2);
                        if (!zza.zzj()) {
                            zzbnpVar3 = zza;
                        }
                    }
                }
                this.zzk = arrayList;
                zze();
                java.util.Iterator it = newLinkedHashMapWithExpectedSize2.values().iterator();
                while (it.hasNext()) {
                    ((com.google.android.libraries.places.internal.zzcem) it.next()).zzb();
                }
                zzbnpVar = zzbnpVar3;
            }
            return zzbnpVar;
        } finally {
            this.zzf = false;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblp
    public final void zzb(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        if (this.zzh != com.google.android.libraries.places.internal.zzbjn.READY) {
            this.zzl.zzb(com.google.android.libraries.places.internal.zzbjn.TRANSIENT_FAILURE, new com.google.android.libraries.places.internal.zzblf(com.google.android.libraries.places.internal.zzbli.zzb(zzbnpVar)));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblp
    public final void zzc() {
        zzi.logp(java.util.logging.Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "shutdown", "Shutdown");
        java.util.Iterator it = this.zzk.iterator();
        while (it.hasNext()) {
            ((com.google.android.libraries.places.internal.zzcem) it.next()).zzb();
        }
        this.zzk.clear();
    }

    protected abstract void zze();

    protected final java.util.List zzi() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.libraries.places.internal.zzcem zzcemVar : this.zzk) {
            if (zzcemVar.zzf() == com.google.android.libraries.places.internal.zzbjn.READY) {
                arrayList.add(zzcemVar);
            }
        }
        return arrayList;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzblg zzk() {
        return this.zzl;
    }

    public final java.util.Collection zzh() {
        return this.zzk;
    }

    protected final com.google.android.libraries.places.internal.zzblg zzg() {
        return this.zzl;
    }

    protected com.google.android.libraries.places.internal.zzcem zzf(java.lang.Object obj) {
        throw null;
    }
}
