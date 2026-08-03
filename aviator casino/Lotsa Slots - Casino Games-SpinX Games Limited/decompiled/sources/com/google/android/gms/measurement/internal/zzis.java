package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzis implements java.util.concurrent.Callable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbg zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjc zzc;

    zzis(com.google.android.gms.measurement.internal.zzjc zzjcVar, com.google.android.gms.measurement.internal.zzbg zzbgVar, java.lang.String str) {
        this.zza = zzbgVar;
        this.zzb = str;
        java.util.Objects.requireNonNull(zzjcVar);
        this.zzc = zzjcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.measurement.internal.zzbg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.measurement.internal.zzok] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        byte[] bArr;
        com.google.android.gms.measurement.internal.zzpf zzpfVar;
        com.google.android.gms.measurement.internal.zzpm zzpmVar;
        com.google.android.gms.measurement.internal.zzpf zzpfVar2;
        com.google.android.gms.measurement.internal.zzpf zzpfVar3;
        com.google.android.gms.measurement.internal.zzh zzhVar;
        com.google.android.gms.internal.measurement.zzhz zzhzVar;
        android.os.Bundle bundle;
        java.lang.String str;
        com.google.android.gms.measurement.internal.zzib zzibVar;
        com.google.android.gms.internal.measurement.zzic zzicVar;
        java.lang.String str2;
        boolean z;
        java.lang.Object obj;
        com.google.android.gms.measurement.internal.zzbc zza;
        long j;
        com.google.android.gms.measurement.internal.zzav zzj;
        com.google.android.gms.measurement.internal.zzjc zzjcVar = this.zzc;
        zzjcVar.zzL().zzY();
        com.google.android.gms.measurement.internal.zzlo zzn = zzjcVar.zzL().zzn();
        zzn.zzg();
        com.google.android.gms.measurement.internal.zzib zzibVar2 = zzn.zzu;
        com.google.android.gms.measurement.internal.zzib.zzL();
        ?? r4 = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r4);
        java.lang.String str3 = this.zzb;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str3);
        java.lang.String str4 = r4.zza;
        if (!"_iap".equals(str4) && !"_iapx".equals(str4)) {
            zzn.zzu.zzaV().zzj().zzc("Generating a payload for this event is not available. package_name, event_name", str3, str4);
            return null;
        }
        com.google.android.gms.measurement.internal.zzpf zzpfVar4 = zzn.zzg;
        com.google.android.gms.internal.measurement.zzhz zzh = com.google.android.gms.internal.measurement.zzib.zzh();
        zzpfVar4.zzj().zzb();
        try {
            com.google.android.gms.measurement.internal.zzh zzu = zzpfVar4.zzj().zzu(str3);
            if (zzu == null) {
                zzn.zzu.zzaV().zzj().zzb("Log and bundle not available. package_name", str3);
                bArr = new byte[0];
            } else if (zzu.zzD()) {
                com.google.android.gms.internal.measurement.zzic zzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                zzaE.zza(1);
                zzaE.zzC("android");
                if (!android.text.TextUtils.isEmpty(zzu.zzc())) {
                    zzaE.zzL(zzu.zzc());
                }
                if (!android.text.TextUtils.isEmpty(zzu.zzv())) {
                    zzaE.zzJ((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzu.zzv()));
                }
                if (!android.text.TextUtils.isEmpty(zzu.zzr())) {
                    zzaE.zzM((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzu.zzr()));
                }
                if (zzu.zzt() != -2147483648L) {
                    zzaE.zzaj((int) zzu.zzt());
                }
                zzaE.zzN(zzu.zzx());
                zzaE.zzar(zzu.zzB());
                java.lang.String zzf = zzu.zzf();
                if (!android.text.TextUtils.isEmpty(zzf)) {
                    zzaE.zzad(zzf);
                }
                zzaE.zzay(zzu.zzak());
                com.google.android.gms.measurement.internal.zzjk zzB = zzn.zzg.zzB(str3);
                zzaE.zzY(zzu.zzz());
                if (zzibVar2.zzB() && zzn.zzu.zzc().zzC(zzaE.zzK()) && zzB.zzo(com.google.android.gms.measurement.internal.zzjj.AD_STORAGE) && !android.text.TextUtils.isEmpty(null)) {
                    zzaE.zzam(null);
                }
                zzaE.zzat(zzB.zzk());
                if (zzB.zzo(com.google.android.gms.measurement.internal.zzjj.AD_STORAGE) && zzu.zzac()) {
                    android.util.Pair zzc = zzpfVar4.zzq().zzc(zzu.zzc(), zzB);
                    if (zzu.zzac() && !android.text.TextUtils.isEmpty((java.lang.CharSequence) zzc.first)) {
                        try {
                            zzaE.zzQ(com.google.android.gms.measurement.internal.zzlo.zzc((java.lang.String) zzc.first, java.lang.Long.toString(r4.zzd)));
                            if (zzc.second != null) {
                                zzaE.zzT(((java.lang.Boolean) zzc.second).booleanValue());
                            }
                        } catch (java.lang.SecurityException e) {
                            zzn.zzu.zzaV().zzj().zzb("Resettable device id encryption failed", e.getMessage());
                            bArr = new byte[0];
                            zzpfVar = zzn.zzg;
                            zzj = zzpfVar.zzj();
                            zzj.zzd();
                            return bArr;
                        }
                    }
                }
                com.google.android.gms.measurement.internal.zzib zzibVar3 = zzn.zzu;
                zzibVar3.zzu().zzw();
                zzaE.zzF(android.os.Build.MODEL);
                zzibVar3.zzu().zzw();
                zzaE.zzE(android.os.Build.VERSION.RELEASE);
                zzaE.zzI((int) zzibVar3.zzu().zzb());
                zzaE.zzH(zzibVar3.zzu().zzc());
                try {
                    try {
                        if (zzB.zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE) && zzu.zzd() != null) {
                            zzaE.zzW(com.google.android.gms.measurement.internal.zzlo.zzc((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzu.zzd()), java.lang.Long.toString(r4.zzd)));
                        }
                        if (!android.text.TextUtils.isEmpty(zzu.zzl())) {
                            zzaE.zzah((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzu.zzl()));
                        }
                        java.lang.String zzc2 = zzu.zzc();
                        com.google.android.gms.measurement.internal.zzpf zzpfVar5 = zzn.zzg;
                        java.util.List zzn2 = zzpfVar5.zzj().zzn(zzc2);
                        java.util.Iterator it = zzn2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                zzpmVar = null;
                                break;
                            }
                            zzpmVar = (com.google.android.gms.measurement.internal.zzpm) it.next();
                            if ("_lte".equals(zzpmVar.zzc)) {
                                break;
                            }
                        }
                        if (zzpmVar == null || zzpmVar.zze == null) {
                            com.google.android.gms.measurement.internal.zzpm zzpmVar2 = new com.google.android.gms.measurement.internal.zzpm(zzc2, "auto", "_lte", zzn.zzu.zzaZ().currentTimeMillis(), 0L);
                            zzn2.add(zzpmVar2);
                            zzpfVar5.zzj().zzl(zzpmVar2);
                        }
                        com.google.android.gms.internal.measurement.zziu[] zziuVarArr = new com.google.android.gms.internal.measurement.zziu[zzn2.size()];
                        for (int i = 0; i < zzn2.size(); i++) {
                            com.google.android.gms.internal.measurement.zzit zzm = com.google.android.gms.internal.measurement.zziu.zzm();
                            zzm.zzb(((com.google.android.gms.measurement.internal.zzpm) zzn2.get(i)).zzc);
                            zzm.zza(((com.google.android.gms.measurement.internal.zzpm) zzn2.get(i)).zzd);
                            zzpfVar5.zzp().zzc(zzm, ((com.google.android.gms.measurement.internal.zzpm) zzn2.get(i)).zze);
                            zziuVarArr[i] = (com.google.android.gms.internal.measurement.zziu) zzm.zzbc();
                        }
                        zzaE.zzq(java.util.Arrays.asList(zziuVarArr));
                        com.google.android.gms.measurement.internal.zzpf zzpfVar6 = zzn.zzg;
                        zzpfVar6.zzI(zzu, zzaE);
                        zzpfVar6.zzJ(zzu, zzaE);
                        com.google.android.gms.measurement.internal.zzgu zza2 = com.google.android.gms.measurement.internal.zzgu.zza(r4);
                        com.google.android.gms.measurement.internal.zzib zzibVar4 = zzn.zzu;
                        com.google.android.gms.measurement.internal.zzpo zzk = zzibVar4.zzk();
                        android.os.Bundle bundle2 = zza2.zzd;
                        zzk.zzI(bundle2, zzpfVar5.zzj().zzW(str3));
                        zzibVar4.zzk().zzG(zza2, zzibVar4.zzc().zzd(str3));
                        try {
                            bundle2.putLong("_c", 1L);
                            zzibVar4.zzaV().zzj().zza("Marking in-app purchase as real-time");
                            bundle2.putLong("_r", 1L);
                            java.lang.String str5 = r4.zzc;
                            bundle2.putString("_o", str5);
                            if (zzibVar4.zzk().zzaa(zzaE.zzK(), zzu.zzay())) {
                                zzibVar4.zzk().zzM(bundle2, "_dbg", 1L);
                                zzibVar4.zzk().zzM(bundle2, "_r", 1L);
                            }
                            com.google.android.gms.measurement.internal.zzav zzj2 = zzpfVar5.zzj();
                            java.lang.String str6 = r4.zza;
                            com.google.android.gms.measurement.internal.zzbc zzf2 = zzj2.zzf(str3, str6);
                            if (zzf2 == null) {
                                bundle = bundle2;
                                str = str5;
                                zzibVar = zzibVar4;
                                zzicVar = zzaE;
                                zzpfVar3 = zzpfVar5;
                                zzhVar = zzu;
                                zzhzVar = zzh;
                                zzpfVar2 = zzpfVar6;
                                str2 = str3;
                                z = true;
                                obj = null;
                                zza = new com.google.android.gms.measurement.internal.zzbc(str3, str6, 0L, 0L, 0L, r4.zzd, 0L, null, null, null, null);
                                j = 0;
                            } else {
                                zzpfVar2 = zzpfVar6;
                                zzpfVar3 = zzpfVar5;
                                zzhVar = zzu;
                                zzhzVar = zzh;
                                bundle = bundle2;
                                str = str5;
                                zzibVar = zzibVar4;
                                zzicVar = zzaE;
                                str2 = str3;
                                z = true;
                                obj = null;
                                long j2 = zzf2.zzf;
                                zza = zzf2.zza(r4.zzd);
                                j = j2;
                            }
                            zzpfVar3.zzj().zzh(zza);
                            try {
                                com.google.android.gms.measurement.internal.zzbb zzbbVar = new com.google.android.gms.measurement.internal.zzbb(zzn.zzu, str, str2, str6, r4.zzd, j, bundle);
                                com.google.android.gms.internal.measurement.zzhr zzk2 = com.google.android.gms.internal.measurement.zzhs.zzk();
                                zzk2.zzo(zzbbVar.zzd);
                                zzk2.zzl(zzbbVar.zzb);
                                zzk2.zzq(zzbbVar.zze);
                                com.google.android.gms.measurement.internal.zzbe zzbeVar = zzbbVar.zzf;
                                com.google.android.gms.measurement.internal.zzbd zzbdVar = new com.google.android.gms.measurement.internal.zzbd(zzbeVar);
                                while (zzbdVar.hasNext()) {
                                    java.lang.String next = zzbdVar.next();
                                    java.lang.String str7 = next;
                                    com.google.android.gms.internal.measurement.zzhv zzn3 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                    zzn3.zzb(next);
                                    java.lang.Object zza3 = zzbeVar.zza(next);
                                    if (zza3 != null) {
                                        zzpfVar3.zzp().zzd(zzn3, zza3);
                                        zzk2.zzg(zzn3);
                                    }
                                }
                                com.google.android.gms.internal.measurement.zzic zzicVar2 = zzicVar;
                                zzicVar2.zzg(zzk2);
                                com.google.android.gms.internal.measurement.zzie zza4 = com.google.android.gms.internal.measurement.zzig.zza();
                                com.google.android.gms.internal.measurement.zzht zza5 = com.google.android.gms.internal.measurement.zzhu.zza();
                                zza5.zzb(zza.zzc);
                                zza5.zza(str6);
                                zza4.zza(zza5);
                                zzicVar2.zzap(zza4);
                                zzicVar2.zzaf(zzpfVar3.zzm().zzb(zzhVar.zzc(), java.util.Collections.emptyList(), zzicVar2.zzk(), java.lang.Long.valueOf(zzk2.zzn()), java.lang.Long.valueOf(zzk2.zzn()), false));
                                if (zzk2.zzm()) {
                                    zzicVar2.zzv(zzk2.zzn());
                                    zzicVar2.zzx(zzk2.zzn());
                                }
                                long zzp = zzhVar.zzp();
                                if (zzp != 0) {
                                    zzicVar2.zzA(zzp);
                                }
                                long zzn4 = zzhVar.zzn();
                                if (zzn4 != 0) {
                                    zzicVar2.zzy(zzn4);
                                } else if (zzp != 0) {
                                    zzicVar2.zzy(zzp);
                                }
                                java.lang.String zzh2 = zzhVar.zzh();
                                com.google.android.gms.internal.measurement.zzqu.zza();
                                java.lang.String str8 = str2;
                                if (zzibVar.zzc().zzp(str8, com.google.android.gms.measurement.internal.zzfx.zzaM) && zzh2 != null) {
                                    zzicVar2.zzau(zzh2);
                                }
                                zzhVar.zzL();
                                zzicVar2.zzZ((int) zzhVar.zzG());
                                zzibVar.zzc().zzi();
                                zzicVar2.zzO(130000L);
                                zzicVar2.zzs(zzibVar.zzaZ().currentTimeMillis());
                                zzicVar2.zzae(z);
                                zzpfVar2.zzS(zzicVar2.zzK(), zzicVar2);
                                com.google.android.gms.internal.measurement.zzhz zzhzVar2 = zzhzVar;
                                zzhzVar2.zze(zzicVar2);
                                com.google.android.gms.measurement.internal.zzh zzhVar2 = zzhVar;
                                zzhVar2.zzo(zzicVar2.zzu());
                                zzhVar2.zzq(zzicVar2.zzw());
                                zzpfVar3.zzj().zzv(zzhVar2, false, false);
                                zzpfVar3.zzj().zzc();
                                zzpfVar3.zzj().zzd();
                                try {
                                    return zzpfVar3.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVar2.zzbc()).zzcc());
                                } catch (java.io.IOException e2) {
                                    zzn.zzu.zzaV().zzb().zzc("Data loss. Failed to bundle and serialize. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str8), e2);
                                    return obj;
                                }
                            } catch (java.lang.Throwable th) {
                                th = th;
                                r4 = zzn;
                                r4.zzg.zzj().zzd();
                                throw th;
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            r4 = zzn;
                        }
                    } catch (java.lang.SecurityException e3) {
                        zzn.zzu.zzaV().zzj().zzb("app instance id encryption failed", e3.getMessage());
                        bArr = new byte[0];
                        zzpfVar = zzn.zzg;
                        zzj = zzpfVar.zzj();
                        zzj.zzd();
                        return bArr;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
            } else {
                zzn.zzu.zzaV().zzj().zzb("Log and bundle disabled. package_name", str3);
                bArr = new byte[0];
            }
            zzj = zzpfVar4.zzj();
            zzj.zzd();
            return bArr;
        } catch (java.lang.Throwable th4) {
            th = th4;
            r4 = zzn;
            r4.zzg.zzj().zzd();
            throw th;
        }
    }
}
