package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbzc implements com.google.android.libraries.places.internal.zzbpn {
    final com.google.android.libraries.places.internal.zzbzd zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzf zzb;

    zzbzc(com.google.android.libraries.places.internal.zzbzf zzbzfVar, com.google.android.libraries.places.internal.zzbzd zzbzdVar) {
        java.util.Objects.requireNonNull(zzbzfVar);
        this.zzb = zzbzfVar;
        this.zza = zzbzdVar;
    }

    @javax.annotation.Nullable
    private static final java.lang.Integer zze(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        java.lang.String str = (java.lang.String) zzbmgVar.zzb(com.google.android.libraries.places.internal.zzbzf.zzf);
        if (str == null) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(str);
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbpn
    public final void zza(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i;
        int i2;
        com.google.android.libraries.places.internal.zzbzd zzbzdVar = this.zza;
        int i3 = zzbzdVar.zzd;
        if (i3 > 0) {
            com.google.android.libraries.places.internal.zzbmc zzbmcVar = com.google.android.libraries.places.internal.zzbzf.zze;
            zzbmgVar.zzd(zzbmcVar);
            zzbmgVar.zzc(zzbmcVar, java.lang.String.valueOf(i3));
        }
        com.google.android.libraries.places.internal.zzbzf zzbzfVar = this.zzb;
        zzbzfVar.zzp(zzbzdVar);
        if (zzbzfVar.zzQ().zzf == zzbzdVar) {
            if (zzbzfVar.zzO() != null) {
                com.google.android.libraries.places.internal.zzbze zzO = zzbzfVar.zzO();
                do {
                    atomicInteger = zzO.zzd;
                    i = atomicInteger.get();
                    i2 = zzO.zza;
                    if (i == i2) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i, java.lang.Math.min(zzO.zzc + i, i2)));
            }
            com.google.android.libraries.places.internal.zzbnx zzbnxVar = (com.google.android.libraries.places.internal.zzbnx) zzbzfVar.zzF();
            zzbnxVar.zzb(new com.google.android.libraries.places.internal.zzbyv(this, zzbmgVar));
            zzbnxVar.zza();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcad
    public final void zzb(com.google.android.libraries.places.internal.zzcac zzcacVar) {
        com.google.android.libraries.places.internal.zzbzf zzbzfVar = this.zzb;
        com.google.android.libraries.places.internal.zzbzd zzbzdVar = zzbzfVar.zzQ().zzf;
        com.google.common.base.Preconditions.checkState(zzbzdVar != null, "Headers should be received prior to messages.");
        if (zzbzdVar != this.zza) {
            com.google.android.libraries.places.internal.zzbsz.zzg(zzcacVar);
            return;
        }
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = (com.google.android.libraries.places.internal.zzbnx) zzbzfVar.zzF();
        zzbnxVar.zzb(new com.google.android.libraries.places.internal.zzbza(this, zzcacVar));
        zzbnxVar.zza();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0195, code lost:
    
        if (r5.zzQ().zzd.isEmpty() == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0229  */
    @Override // com.google.android.libraries.places.internal.zzbpn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbpm zzbpmVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        long j;
        boolean z;
        com.google.android.libraries.places.internal.zzbyp zzbypVar;
        com.google.android.libraries.places.internal.zzbzf zzbzfVar = this.zzb;
        synchronized (zzbzfVar.zzK()) {
            com.google.android.libraries.places.internal.zzbyu zzQ = zzbzfVar.zzQ();
            com.google.android.libraries.places.internal.zzbzd zzbzdVar = this.zza;
            zzbzdVar.zzb = true;
            java.util.Collection collection = zzQ.zzc;
            if (collection.contains(zzbzdVar)) {
                java.util.ArrayList arrayList = new java.util.ArrayList(collection);
                arrayList.remove(zzbzdVar);
                zzQ = new com.google.android.libraries.places.internal.zzbyu(zzQ.zzb, java.util.Collections.unmodifiableCollection(arrayList), zzQ.zzd, zzQ.zzf, zzQ.zzg, zzQ.zza, zzQ.zzh, zzQ.zze);
            }
            zzbzfVar.zzR(zzQ);
            zzbzfVar.zzP().zza(zzbnpVar.zzg());
        }
        com.google.android.libraries.places.internal.zzbzf zzbzfVar2 = this.zzb;
        if (zzbzfVar2.zzU().decrementAndGet() == Integer.MIN_VALUE) {
            com.google.android.libraries.places.internal.zzbnx zzbnxVar = (com.google.android.libraries.places.internal.zzbnx) zzbzfVar2.zzF();
            zzbnxVar.zzb(new com.google.android.libraries.places.internal.zzbyy(this));
            zzbnxVar.zza();
            return;
        }
        com.google.android.libraries.places.internal.zzbzd zzbzdVar2 = this.zza;
        if (zzbzdVar2.zzc) {
            zzbzfVar2.zzp(zzbzdVar2);
            if (zzbzfVar2.zzQ().zzf == zzbzdVar2) {
                zzbzfVar2.zzB(zzbnpVar, zzbpmVar, zzbmgVar);
                return;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbpm zzbpmVar2 = com.google.android.libraries.places.internal.zzbpm.MISCARRIED;
        if (zzbpmVar == zzbpmVar2 && zzbzfVar2.zzT().incrementAndGet() > 1000) {
            com.google.android.libraries.places.internal.zzbzf zzbzfVar3 = this.zzb;
            com.google.android.libraries.places.internal.zzbzd zzbzdVar3 = this.zza;
            zzbzfVar3.zzp(zzbzdVar3);
            if (zzbzfVar3.zzQ().zzf == zzbzdVar3) {
                zzbzfVar3.zzB(com.google.android.libraries.places.internal.zzbnp.zzh.zze("Too many transparent retries. Might be a bug in gRPC").zzd(new com.google.android.libraries.places.internal.zzbns(zzbnpVar, null)), zzbpmVar, zzbmgVar);
                return;
            }
            return;
        }
        if (zzbzfVar2.zzQ().zzf == null) {
            if (zzbpmVar == zzbpmVar2 || (zzbpmVar == com.google.android.libraries.places.internal.zzbpm.REFUSED && zzbzfVar2.zzS().compareAndSet(false, true))) {
                com.google.android.libraries.places.internal.zzbzf zzbzfVar4 = this.zzb;
                com.google.android.libraries.places.internal.zzbzd zzbzdVar4 = this.zza;
                com.google.android.libraries.places.internal.zzbzd zzq = zzbzfVar4.zzq(zzbzdVar4.zzd, true, false);
                if (zzq != null) {
                    if (zzbzfVar4.zzJ()) {
                        synchronized (zzbzfVar4.zzK()) {
                            com.google.android.libraries.places.internal.zzbyu zzQ2 = zzbzfVar4.zzQ();
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(zzQ2.zzd);
                            arrayList2.remove(zzbzdVar4);
                            arrayList2.add(zzq);
                            zzbzfVar4.zzR(new com.google.android.libraries.places.internal.zzbyu(zzQ2.zzb, zzQ2.zzc, java.util.Collections.unmodifiableCollection(arrayList2), zzQ2.zzf, zzQ2.zzg, zzQ2.zza, zzQ2.zzh, zzQ2.zze));
                        }
                    }
                    this.zzb.zzE().execute(new com.google.android.libraries.places.internal.zzbyz(this, zzq));
                    return;
                }
                return;
            }
            if (zzbpmVar != com.google.android.libraries.places.internal.zzbpm.DROPPED) {
                zzbzfVar2.zzS().set(true);
                if (zzbzfVar2.zzJ()) {
                    java.lang.Integer zze = zze(zzbmgVar);
                    com.google.android.libraries.places.internal.zzbzf zzbzfVar5 = this.zzb;
                    boolean contains = zzbzfVar5.zzI().zzc.contains(zzbnpVar.zzg());
                    boolean z2 = (zzbzfVar5.zzO() == null || (!contains && (zze == null || zze.intValue() >= 0))) ? false : !zzbzfVar5.zzO().zzb();
                    if (contains && !z2 && !zzbnpVar.zzj() && zze != null && zze.intValue() > 0) {
                        zze = 0;
                    }
                    boolean z3 = contains && !z2;
                    if (z3) {
                        zzbzfVar5.zzy(zze);
                    }
                    synchronized (zzbzfVar5.zzK()) {
                        com.google.android.libraries.places.internal.zzbyu zzQ3 = zzbzfVar5.zzQ();
                        com.google.android.libraries.places.internal.zzbzd zzbzdVar5 = this.zza;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(zzQ3.zzd);
                        arrayList3.remove(zzbzdVar5);
                        zzbzfVar5.zzR(new com.google.android.libraries.places.internal.zzbyu(zzQ3.zzb, zzQ3.zzc, java.util.Collections.unmodifiableCollection(arrayList3), zzQ3.zzf, zzQ3.zzg, zzQ3.zza, zzQ3.zzh, zzQ3.zze));
                        if (z3) {
                            if (!zzbzfVar5.zzz(zzbzfVar5.zzQ())) {
                            }
                            return;
                        }
                    }
                } else {
                    if (zzbzfVar2.zzH() != null) {
                        boolean contains2 = zzbzfVar2.zzH().zzf.contains(zzbnpVar.zzg());
                        java.lang.Integer zze2 = zze(zzbmgVar);
                        boolean z4 = (zzbzfVar2.zzO() == null || (!contains2 && (zze2 == null || zze2.intValue() >= 0))) ? false : !zzbzfVar2.zzO().zzb();
                        if (zzbzfVar2.zzH().zza > zzbzdVar2.zzd + 1 && !z4) {
                            if (zze2 == null) {
                                if (contains2) {
                                    com.google.android.libraries.places.internal.zzbzg zzH = zzbzfVar2.zzH();
                                    long zzab = zzbzfVar2.zzab();
                                    long zzab2 = zzbzfVar2.zzab();
                                    j = com.google.android.libraries.places.internal.zzbzf.zzj(zzab);
                                    zzbzfVar2.zzac(java.lang.Math.min((long) (zzab2 * zzH.zzd), zzbzfVar2.zzH().zzc));
                                    z = true;
                                }
                            } else if (zze2.intValue() >= 0) {
                                j = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(zze2.intValue());
                                zzbzfVar2.zzac(zzbzfVar2.zzH().zzb);
                                z = true;
                            }
                            if (z) {
                                com.google.android.libraries.places.internal.zzbzd zzq2 = zzbzfVar2.zzq(zzbzdVar2.zzd + 1, false, false);
                                if (zzq2 != null) {
                                    synchronized (zzbzfVar2.zzK()) {
                                        zzbypVar = new com.google.android.libraries.places.internal.zzbyp(zzbzfVar2.zzK());
                                        zzbzfVar2.zzZ(zzbypVar);
                                    }
                                    zzbypVar.zza(this.zzb.zzG().schedule(new com.google.android.libraries.places.internal.zzbyx(this, zzbypVar, zzq2), j, java.util.concurrent.TimeUnit.NANOSECONDS));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    j = 0;
                    z = false;
                    if (z) {
                    }
                }
            } else if (zzbzfVar2.zzJ()) {
                zzbzfVar2.zzA();
            }
        }
        com.google.android.libraries.places.internal.zzbzf zzbzfVar6 = this.zzb;
        com.google.android.libraries.places.internal.zzbzd zzbzdVar6 = this.zza;
        zzbzfVar6.zzp(zzbzdVar6);
        if (zzbzfVar6.zzQ().zzf == zzbzdVar6) {
            zzbzfVar6.zzB(zzbnpVar, zzbpmVar, zzbmgVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcad
    public final void zzd() {
        com.google.android.libraries.places.internal.zzbzf zzbzfVar = this.zzb;
        if (zzbzfVar.zzm()) {
            com.google.android.libraries.places.internal.zzbnx zzbnxVar = (com.google.android.libraries.places.internal.zzbnx) zzbzfVar.zzF();
            zzbnxVar.zzb(new com.google.android.libraries.places.internal.zzbzb(this));
            zzbnxVar.zza();
        }
    }
}
