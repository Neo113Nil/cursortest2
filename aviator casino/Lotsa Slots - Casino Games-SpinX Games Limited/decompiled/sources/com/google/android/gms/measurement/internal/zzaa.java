package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzaa extends com.google.android.gms.measurement.internal.zzab {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzad zza;
    private final com.google.android.gms.internal.measurement.zzff zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaa(com.google.android.gms.measurement.internal.zzad zzadVar, java.lang.String str, int i, com.google.android.gms.internal.measurement.zzff zzffVar) {
        super(str, i);
        java.util.Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
        this.zzh = zzffVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final int zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final boolean zzc() {
        return this.zzh.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x036c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0364  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean zzd(java.lang.Long l, java.lang.Long l2, com.google.android.gms.internal.measurement.zzhs zzhsVar, long j, com.google.android.gms.measurement.internal.zzbc zzbcVar, boolean z) {
        java.lang.Boolean zzi;
        com.google.android.gms.internal.measurement.zzpq.zza();
        com.google.android.gms.measurement.internal.zzad zzadVar = this.zza;
        com.google.android.gms.measurement.internal.zzib zzibVar = zzadVar.zzu;
        com.google.android.gms.measurement.internal.zzal zzc = zzibVar.zzc();
        java.lang.String str = this.zzb;
        boolean zzp = zzc.zzp(str, com.google.android.gms.measurement.internal.zzfx.zzaF);
        com.google.android.gms.internal.measurement.zzff zzffVar = this.zzh;
        long j2 = zzffVar.zzm() ? zzbcVar.zze : j;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        java.lang.Boolean bool = null;
        if (android.util.Log.isLoggable(zzibVar.zzaV().zzn(), 2)) {
            zzibVar.zzaV().zzk().zzd("Evaluating filter. audience, filter, event", java.lang.Integer.valueOf(this.zzc), zzffVar.zza() ? java.lang.Integer.valueOf(zzffVar.zzb()) : null, zzibVar.zzl().zza(zzffVar.zzc()));
            zzibVar.zzaV().zzk().zzb("Filter definition", zzadVar.zzg.zzp().zzj(zzffVar));
        }
        if (!zzffVar.zza() || zzffVar.zzb() > 256) {
            zzibVar.zzaV().zze().zzc("Invalid event filter ID. appId, id", com.google.android.gms.measurement.internal.zzgt.zzl(str), java.lang.String.valueOf(zzffVar.zza() ? java.lang.Integer.valueOf(zzffVar.zzb()) : null));
            return false;
        }
        boolean z2 = zzffVar.zzi() || zzffVar.zzj() || zzffVar.zzm();
        if (z && !z2) {
            zzibVar.zzaV().zzk().zzc("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", java.lang.Integer.valueOf(this.zzc), zzffVar.zza() ? java.lang.Integer.valueOf(zzffVar.zzb()) : null);
            return true;
        }
        java.lang.String zzd = zzhsVar.zzd();
        if (zzffVar.zzg()) {
            java.lang.Boolean zzg = zzg(j2, zzffVar.zzh());
            if (zzg != null) {
                if (!zzg.booleanValue()) {
                    bool = false;
                }
            }
            zzibVar.zzaV().zzk().zzb("Event filter result", bool != null ? kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL : bool);
            if (bool != null) {
                return false;
            }
            this.zzd = true;
            if (!bool.booleanValue()) {
                return true;
            }
            this.zze = true;
            if (z2 && zzhsVar.zze()) {
                java.lang.Long valueOf = java.lang.Long.valueOf(zzhsVar.zzf());
                if (zzffVar.zzj()) {
                    if (zzp && zzffVar.zzg()) {
                        valueOf = l;
                    }
                    this.zzg = valueOf;
                } else {
                    if (zzp && zzffVar.zzg()) {
                        valueOf = l2;
                    }
                    this.zzf = valueOf;
                }
            }
            return true;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = zzffVar.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
                java.util.Iterator it2 = zzhsVar.zza().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        java.util.Iterator it3 = zzffVar.zzd().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                bool = true;
                                break;
                            }
                            com.google.android.gms.internal.measurement.zzfh zzfhVar = (com.google.android.gms.internal.measurement.zzfh) it3.next();
                            boolean z3 = zzfhVar.zze() && zzfhVar.zzf();
                            java.lang.String zzh = zzfhVar.zzh();
                            if (zzh.isEmpty()) {
                                zzibVar.zzaV().zze().zzb("Event has empty param name. event", zzibVar.zzl().zza(zzd));
                                break;
                            }
                            V v = arrayMap.get(zzh);
                            if (v instanceof java.lang.Long) {
                                if (!zzfhVar.zzc()) {
                                    zzibVar.zzaV().zze().zzc("No number filter for long param. event, param", zzibVar.zzl().zza(zzd), zzibVar.zzl().zzb(zzh));
                                    break;
                                }
                                java.lang.Boolean zzg2 = zzg(((java.lang.Long) v).longValue(), zzfhVar.zzd());
                                if (zzg2 == null) {
                                    break;
                                }
                                if (zzg2.booleanValue() == z3) {
                                    bool = false;
                                    break;
                                }
                            } else if (v instanceof java.lang.Double) {
                                if (!zzfhVar.zzc()) {
                                    zzibVar.zzaV().zze().zzc("No number filter for double param. event, param", zzibVar.zzl().zza(zzd), zzibVar.zzl().zzb(zzh));
                                    break;
                                }
                                java.lang.Boolean zzh2 = zzh(((java.lang.Double) v).doubleValue(), zzfhVar.zzd());
                                if (zzh2 == null) {
                                    break;
                                }
                                if (zzh2.booleanValue() == z3) {
                                    bool = false;
                                    break;
                                }
                            } else if (v instanceof java.lang.String) {
                                if (!zzfhVar.zza()) {
                                    if (!zzfhVar.zzc()) {
                                        zzibVar.zzaV().zze().zzc("No filter for String param. event, param", zzibVar.zzl().zza(zzd), zzibVar.zzl().zzb(zzh));
                                        break;
                                    }
                                    java.lang.String str2 = (java.lang.String) v;
                                    if (!com.google.android.gms.measurement.internal.zzpj.zzm(str2)) {
                                        zzibVar.zzaV().zze().zzc("Invalid param value for number filter. event, param", zzibVar.zzl().zza(zzd), zzibVar.zzl().zzb(zzh));
                                        break;
                                    }
                                    zzi = zzi(str2, zzfhVar.zzd());
                                } else {
                                    zzi = zzf((java.lang.String) v, zzfhVar.zzb(), zzibVar.zzaV());
                                }
                                if (zzi == null) {
                                    break;
                                }
                                if (zzi.booleanValue() == z3) {
                                    bool = false;
                                    break;
                                }
                            } else if (v == 0) {
                                zzibVar.zzaV().zzk().zzc("Missing param for filter. event, param", zzibVar.zzl().zza(zzd), zzibVar.zzl().zzb(zzh));
                                bool = false;
                            } else {
                                zzibVar.zzaV().zze().zzc("Unknown param type. event, param", zzibVar.zzl().zza(zzd), zzibVar.zzl().zzb(zzh));
                            }
                        }
                    } else {
                        com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it2.next();
                        if (hashSet.contains(zzhwVar.zzb())) {
                            if (!zzhwVar.zze()) {
                                if (!zzhwVar.zzi()) {
                                    if (!zzhwVar.zzc()) {
                                        zzibVar.zzaV().zze().zzc("Unknown value for param. event, param", zzibVar.zzl().zza(zzd), zzibVar.zzl().zzb(zzhwVar.zzb()));
                                        break;
                                    }
                                    arrayMap.put(zzhwVar.zzb(), zzhwVar.zzd());
                                } else {
                                    arrayMap.put(zzhwVar.zzb(), zzhwVar.zzi() ? java.lang.Double.valueOf(zzhwVar.zzj()) : null);
                                }
                            } else {
                                arrayMap.put(zzhwVar.zzb(), zzhwVar.zze() ? java.lang.Long.valueOf(zzhwVar.zzf()) : null);
                            }
                        }
                    }
                }
            } else {
                com.google.android.gms.internal.measurement.zzfh zzfhVar2 = (com.google.android.gms.internal.measurement.zzfh) it.next();
                if (zzfhVar2.zzh().isEmpty()) {
                    zzibVar.zzaV().zze().zzb("null or empty param name in filter. event", zzibVar.zzl().zza(zzd));
                    break;
                }
                hashSet.add(zzfhVar2.zzh());
            }
        }
        zzibVar.zzaV().zzk().zzb("Event filter result", bool != null ? kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL : bool);
        if (bool != null) {
        }
    }
}
