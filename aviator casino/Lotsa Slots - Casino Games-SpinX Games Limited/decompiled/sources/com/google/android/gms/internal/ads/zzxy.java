package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzxy implements com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzxh {
    private final com.google.android.gms.internal.ads.zzxi[] zza;
    private final boolean[] zzb;
    private com.google.android.gms.internal.ads.zzxh zzf;
    private com.google.android.gms.internal.ads.zzzn zzg;
    private final java.util.ArrayList zzd = new java.util.ArrayList();
    private final java.util.HashMap zze = new java.util.HashMap();
    private com.google.android.gms.internal.ads.zzze zzi = new com.google.android.gms.internal.ads.zzwu(com.google.android.gms.internal.ads.zzgwm.zzi(), com.google.android.gms.internal.ads.zzgwm.zzi());
    private final java.util.IdentityHashMap zzc = new java.util.IdentityHashMap();
    private com.google.android.gms.internal.ads.zzxi[] zzh = new com.google.android.gms.internal.ads.zzxi[0];

    public zzxy(com.google.android.gms.internal.ads.zzwv zzwvVar, long[] jArr, com.google.android.gms.internal.ads.zzxi... zzxiVarArr) {
        this.zza = zzxiVarArr;
        this.zzb = new boolean[zzxiVarArr.length];
        for (int i = 0; i < zzxiVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zzb[i] = true;
                this.zza[i] = new com.google.android.gms.internal.ads.zzzk(zzxiVarArr[i], j);
            }
        }
    }

    public final com.google.android.gms.internal.ads.zzxi zza(int i) {
        return this.zzb[i] ? ((com.google.android.gms.internal.ads.zzzk) this.zza[i]).zza() : this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzb(com.google.android.gms.internal.ads.zzxh zzxhVar, long j) {
        this.zzf = zzxhVar;
        java.util.ArrayList arrayList = this.zzd;
        com.google.android.gms.internal.ads.zzxi[] zzxiVarArr = this.zza;
        java.util.Collections.addAll(arrayList, zzxiVarArr);
        for (com.google.android.gms.internal.ads.zzxi zzxiVar : zzxiVarArr) {
            zzxiVar.zzb(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzc() throws java.io.IOException {
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzxi[] zzxiVarArr = this.zza;
            if (i >= zzxiVarArr.length) {
                return;
            }
            zzxiVarArr[i].zzc();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zze(com.google.android.gms.internal.ads.zzaba[] zzabaVarArr, boolean[] zArr, com.google.android.gms.internal.ads.zzzc[] zzzcVarArr, boolean[] zArr2, long j) {
        int length;
        java.util.ArrayList arrayList;
        int length2 = zzabaVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzabaVarArr.length;
            if (i >= length) {
                break;
            }
            com.google.android.gms.internal.ads.zzzc zzzcVar = zzzcVarArr[i];
            java.lang.Integer num = zzzcVar == null ? null : (java.lang.Integer) this.zzc.get(zzzcVar);
            iArr[i] = num == null ? -1 : num.intValue();
            com.google.android.gms.internal.ads.zzaba zzabaVar = zzabaVarArr[i];
            if (zzabaVar != null) {
                java.lang.String str = zzabaVar.zza().zzb;
                iArr2[i] = java.lang.Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i] = -1;
            }
            i++;
        }
        java.util.IdentityHashMap identityHashMap = this.zzc;
        identityHashMap.clear();
        com.google.android.gms.internal.ads.zzxi[] zzxiVarArr = this.zza;
        com.google.android.gms.internal.ads.zzzc[] zzzcVarArr2 = new com.google.android.gms.internal.ads.zzzc[length];
        com.google.android.gms.internal.ads.zzzc[] zzzcVarArr3 = new com.google.android.gms.internal.ads.zzzc[length];
        com.google.android.gms.internal.ads.zzaba[] zzabaVarArr2 = new com.google.android.gms.internal.ads.zzaba[length];
        java.util.ArrayList arrayList2 = new java.util.ArrayList(zzxiVarArr.length);
        long j2 = j;
        int i2 = 0;
        while (i2 < zzxiVarArr.length) {
            int i3 = 0;
            while (i3 < zzabaVarArr.length) {
                zzzcVarArr3[i3] = iArr[i3] == i2 ? zzzcVarArr[i3] : null;
                if (iArr2[i3] == i2) {
                    com.google.android.gms.internal.ads.zzaba zzabaVar2 = zzabaVarArr[i3];
                    zzabaVar2.getClass();
                    arrayList = arrayList2;
                    com.google.android.gms.internal.ads.zzbg zzbgVar = (com.google.android.gms.internal.ads.zzbg) this.zze.get(zzabaVar2.zza());
                    zzbgVar.getClass();
                    zzabaVarArr2[i3] = new com.google.android.gms.internal.ads.zzxx(zzabaVar2, zzbgVar);
                } else {
                    arrayList = arrayList2;
                    zzabaVarArr2[i3] = null;
                }
                i3++;
                arrayList2 = arrayList;
            }
            java.util.ArrayList arrayList3 = arrayList2;
            int i4 = i2;
            com.google.android.gms.internal.ads.zzaba[] zzabaVarArr3 = zzabaVarArr2;
            com.google.android.gms.internal.ads.zzzc[] zzzcVarArr4 = zzzcVarArr3;
            long zze = zzxiVarArr[i2].zze(zzabaVarArr2, zArr, zzzcVarArr3, zArr2, j2);
            if (i4 == 0) {
                j2 = zze;
            } else if (zze != j2) {
                throw new java.lang.IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < zzabaVarArr.length; i5++) {
                if (iArr2[i5] == i4) {
                    com.google.android.gms.internal.ads.zzzc zzzcVar2 = zzzcVarArr4[i5];
                    zzzcVar2.getClass();
                    zzzcVarArr2[i5] = zzzcVar2;
                    identityHashMap.put(zzzcVar2, java.lang.Integer.valueOf(i4));
                    z = true;
                } else if (iArr[i5] == i4) {
                    com.google.android.gms.internal.ads.zzgtj.zzi(zzzcVarArr4[i5] == null);
                }
            }
            if (z) {
                arrayList3.add(zzxiVarArr[i4]);
            }
            i2 = i4 + 1;
            arrayList2 = arrayList3;
            zzabaVarArr2 = zzabaVarArr3;
            zzzcVarArr3 = zzzcVarArr4;
        }
        java.util.ArrayList arrayList4 = arrayList2;
        java.lang.System.arraycopy(zzzcVarArr2, 0, zzzcVarArr, 0, length);
        this.zzh = (com.google.android.gms.internal.ads.zzxi[]) arrayList4.toArray(new com.google.android.gms.internal.ads.zzxi[0]);
        this.zzi = new com.google.android.gms.internal.ads.zzwu(arrayList4, com.google.android.gms.internal.ads.zzgxm.zzc(arrayList4, com.google.android.gms.internal.ads.zzxw.zza));
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzf(long j, boolean z) {
        for (com.google.android.gms.internal.ads.zzxi zzxiVar : this.zzh) {
            zzxiVar.zzf(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final void zzg(long j) {
        this.zzi.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzh() {
        long j = -9223372036854775807L;
        for (com.google.android.gms.internal.ads.zzxi zzxiVar : this.zzh) {
            long zzh = zzxiVar.zzh();
            if (zzh != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (com.google.android.gms.internal.ads.zzxi zzxiVar2 : this.zzh) {
                        if (zzxiVar2 == zzxiVar) {
                            break;
                        }
                        if (zzxiVar2.zzj(zzh) != zzh) {
                            throw new java.lang.IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzh;
                } else if (zzh != j) {
                    throw new java.lang.IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && zzxiVar.zzj(j) != j) {
                throw new java.lang.IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzi() {
        return this.zzi.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzj(long j) {
        long zzj = this.zzh[0].zzj(j);
        int i = 1;
        while (true) {
            com.google.android.gms.internal.ads.zzxi[] zzxiVarArr = this.zzh;
            if (i >= zzxiVarArr.length) {
                return zzj;
            }
            if (zzxiVarArr[i].zzj(zzj) != zzj) {
                throw new java.lang.IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzk(long j, com.google.android.gms.internal.ads.zzni zzniVar) {
        com.google.android.gms.internal.ads.zzxi[] zzxiVarArr = this.zzh;
        return (zzxiVarArr.length > 0 ? zzxiVarArr[0] : this.zza[0]).zzk(j, zzniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzl() {
        return this.zzi.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzm(com.google.android.gms.internal.ads.zzma zzmaVar) {
        java.util.ArrayList arrayList = this.zzd;
        if (arrayList.isEmpty()) {
            return this.zzi.zzm(zzmaVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((com.google.android.gms.internal.ads.zzxi) arrayList.get(i)).zzm(zzmaVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzn() {
        return this.zzi.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final void zzp(com.google.android.gms.internal.ads.zzxi zzxiVar) {
        java.util.ArrayList arrayList = this.zzd;
        arrayList.remove(zzxiVar);
        if (arrayList.isEmpty()) {
            com.google.android.gms.internal.ads.zzxi[] zzxiVarArr = this.zza;
            int i = 0;
            for (com.google.android.gms.internal.ads.zzxi zzxiVar2 : zzxiVarArr) {
                i += zzxiVar2.zzd().zzb;
            }
            com.google.android.gms.internal.ads.zzbg[] zzbgVarArr = new com.google.android.gms.internal.ads.zzbg[i];
            int i2 = 0;
            for (int i3 = 0; i3 < zzxiVarArr.length; i3++) {
                com.google.android.gms.internal.ads.zzzn zzd = zzxiVarArr[i3].zzd();
                int i4 = zzd.zzb;
                int i5 = 0;
                while (i5 < i4) {
                    com.google.android.gms.internal.ads.zzbg zza = zzd.zza(i5);
                    int i6 = zza.zza;
                    com.google.android.gms.internal.ads.zzv[] zzvVarArr = new com.google.android.gms.internal.ads.zzv[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        com.google.android.gms.internal.ads.zzv zza2 = zza.zza(i7);
                        com.google.android.gms.internal.ads.zzt zza3 = zza2.zza();
                        java.lang.String str = zza2.zza;
                        if (str == null) {
                            str = "";
                        }
                        com.google.android.gms.internal.ads.zzxi[] zzxiVarArr2 = zzxiVarArr;
                        com.google.android.gms.internal.ads.zzzn zzznVar = zzd;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i3).length() + 1 + str.length());
                        sb.append(i3);
                        sb.append(":");
                        sb.append(str);
                        zza3.zza(sb.toString());
                        java.lang.String str2 = zza2.zzn;
                        if (str2 != null) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i3).length() + 1 + str2.length());
                            sb2.append(i3);
                            sb2.append(":");
                            sb2.append(str2);
                            zza3.zzm(sb2.toString());
                        }
                        zzvVarArr[i7] = zza3.zzO();
                        i7++;
                        zzxiVarArr = zzxiVarArr2;
                        zzd = zzznVar;
                    }
                    com.google.android.gms.internal.ads.zzxi[] zzxiVarArr3 = zzxiVarArr;
                    java.lang.String str3 = zza.zzb;
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(i3).length() + 1 + java.lang.String.valueOf(str3).length());
                    sb3.append(i3);
                    sb3.append(":");
                    sb3.append(str3);
                    com.google.android.gms.internal.ads.zzbg zzbgVar = new com.google.android.gms.internal.ads.zzbg(sb3.toString(), zzvVarArr);
                    this.zze.put(zzbgVar, zza);
                    zzbgVarArr[i2] = zzbgVar;
                    i5++;
                    i2++;
                    zzxiVarArr = zzxiVarArr3;
                    zzd = zzd;
                }
            }
            this.zzg = new com.google.android.gms.internal.ads.zzzn(zzbgVarArr);
            com.google.android.gms.internal.ads.zzxh zzxhVar = this.zzf;
            zzxhVar.getClass();
            zzxhVar.zzp(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final /* bridge */ /* synthetic */ void zzs(com.google.android.gms.internal.ads.zzze zzzeVar) {
        com.google.android.gms.internal.ads.zzxh zzxhVar = this.zzf;
        zzxhVar.getClass();
        zzxhVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final com.google.android.gms.internal.ads.zzzn zzd() {
        com.google.android.gms.internal.ads.zzzn zzznVar = this.zzg;
        zzznVar.getClass();
        return zzznVar;
    }
}
