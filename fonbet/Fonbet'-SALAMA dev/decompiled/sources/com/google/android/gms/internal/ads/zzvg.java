package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
final class zzvg implements zzuo, zzun {
    private final zzuo[] zza;
    private zzun zze;
    private zzwv zzf;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzwm zzh = new zzua(zzfwh.zzn(), zzfwh.zzn());
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzuo[] zzg = new zzuo[0];

    public zzvg(zzub zzubVar, long[] jArr, zzuo... zzuoVarArr) {
        this.zza = zzuoVarArr;
        for (int i7 = 0; i7 < zzuoVarArr.length; i7++) {
            long j = jArr[i7];
            if (j != 0) {
                this.zza[i7] = new zzws(zzuoVarArr[i7], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zza(long j, zzls zzlsVar) {
        zzuo[] zzuoVarArr = this.zzg;
        return (zzuoVarArr.length > 0 ? zzuoVarArr[0] : this.zza[0]).zza(j, zzlsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zzd() {
        long j = -9223372036854775807L;
        for (zzuo zzuoVar : this.zzg) {
            long zzd = zzuoVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (zzuo zzuoVar2 : this.zzg) {
                        if (zzuoVar2 == zzuoVar) {
                            break;
                        }
                        if (zzuoVar2.zze(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd;
                } else if (zzd != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && zzuoVar.zze(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zze(long j) {
        long zze = this.zzg[0].zze(j);
        int i7 = 1;
        while (true) {
            zzuo[] zzuoVarArr = this.zzg;
            if (i7 >= zzuoVarArr.length) {
                return zze;
            }
            if (zzuoVarArr[i7].zze(zze) != zze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zzf(zzyh[] zzyhVarArr, boolean[] zArr, zzwk[] zzwkVarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = zzyhVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            length = zzyhVarArr.length;
            if (i8 >= length) {
                break;
            }
            zzwk zzwkVar = zzwkVarArr[i8];
            Integer num = zzwkVar != null ? (Integer) this.zzb.get(zzwkVar) : null;
            iArr[i8] = num == null ? -1 : num.intValue();
            zzyh zzyhVar = zzyhVarArr[i8];
            if (zzyhVar != null) {
                String str = zzyhVar.zzg().zzb;
                iArr2[i8] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i8] = -1;
            }
            i8++;
        }
        this.zzb.clear();
        zzwk[] zzwkVarArr2 = new zzwk[length];
        zzwk[] zzwkVarArr3 = new zzwk[length];
        zzyh[] zzyhVarArr2 = new zzyh[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j3 = j;
        int i9 = 0;
        while (i9 < this.zza.length) {
            for (int i10 = i7; i10 < zzyhVarArr.length; i10++) {
                zzwkVarArr3[i10] = iArr[i10] == i9 ? zzwkVarArr[i10] : null;
                if (iArr2[i10] == i9) {
                    zzyh zzyhVar2 = zzyhVarArr[i10];
                    zzyhVar2.getClass();
                    zzbo zzboVar = (zzbo) this.zzd.get(zzyhVar2.zzg());
                    zzboVar.getClass();
                    zzyhVarArr2[i10] = new zzvf(zzyhVar2, zzboVar);
                } else {
                    zzyhVarArr2[i10] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            zzyh[] zzyhVarArr3 = zzyhVarArr2;
            zzwk[] zzwkVarArr4 = zzwkVarArr3;
            long zzf = this.zza[i9].zzf(zzyhVarArr2, zArr, zzwkVarArr3, zArr2, j3);
            if (i9 == 0) {
                j3 = zzf;
            } else if (zzf != j3) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z4 = false;
            for (int i11 = 0; i11 < zzyhVarArr.length; i11++) {
                if (iArr2[i11] == i9) {
                    zzwk zzwkVar2 = zzwkVarArr4[i11];
                    zzwkVar2.getClass();
                    zzwkVarArr2[i11] = zzwkVar2;
                    this.zzb.put(zzwkVar2, Integer.valueOf(i9));
                    z4 = true;
                } else if (iArr[i11] == i9) {
                    zzcv.zzf(zzwkVarArr4[i11] == null);
                }
            }
            if (z4) {
                arrayList2.add(this.zza[i9]);
            }
            i9++;
            arrayList = arrayList2;
            zzyhVarArr2 = zzyhVarArr3;
            zzwkVarArr3 = zzwkVarArr4;
            i7 = 0;
        }
        int i12 = i7;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzwkVarArr2, i12, zzwkVarArr, i12, length);
        this.zzg = (zzuo[]) arrayList3.toArray(new zzuo[i12]);
        this.zzh = new zzua(arrayList3, zzfwx.zzb(arrayList3, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzve
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                return ((zzuo) obj).zzg().zzc();
            }
        }));
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final zzwv zzg() {
        zzwv zzwvVar = this.zzf;
        zzwvVar.getClass();
        return zzwvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final /* bridge */ /* synthetic */ void zzh(zzwm zzwmVar) {
        zzun zzunVar = this.zze;
        zzunVar.getClass();
        zzunVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(long j, boolean z4) {
        for (zzuo zzuoVar : this.zzg) {
            zzuoVar.zzi(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzj(zzuo zzuoVar) {
        this.zzc.remove(zzuoVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i7 = 0;
        for (zzuo zzuoVar2 : this.zza) {
            i7 += zzuoVar2.zzg().zzb;
        }
        zzbo[] zzboVarArr = new zzbo[i7];
        int i8 = 0;
        int i9 = 0;
        while (true) {
            zzuo[] zzuoVarArr = this.zza;
            if (i8 >= zzuoVarArr.length) {
                this.zzf = new zzwv(zzboVarArr);
                zzun zzunVar = this.zze;
                zzunVar.getClass();
                zzunVar.zzj(this);
                return;
            }
            zzwv zzg = zzuoVarArr[i8].zzg();
            int i10 = zzg.zzb;
            int i11 = 0;
            while (i11 < i10) {
                zzbo zzb = zzg.zzb(i11);
                zzz[] zzzVarArr = new zzz[zzb.zza];
                for (int i12 = 0; i12 < zzb.zza; i12++) {
                    zzz zzb2 = zzb.zzb(i12);
                    zzx zzb3 = zzb2.zzb();
                    String str = zzb2.zza;
                    if (str == null) {
                        str = "";
                    }
                    zzb3.zzO(i8 + ":" + str);
                    zzzVarArr[i12] = zzb3.zzaj();
                }
                zzbo zzboVar = new zzbo(i8 + ":" + zzb.zzb, zzzVarArr);
                this.zzd.put(zzboVar, zzb);
                zzboVarArr[i9] = zzboVar;
                i11++;
                i9++;
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzk() {
        int i7 = 0;
        while (true) {
            zzuo[] zzuoVarArr = this.zza;
            if (i7 >= zzuoVarArr.length) {
                return;
            }
            zzuoVarArr[i7].zzk();
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzl(zzun zzunVar, long j) {
        this.zze = zzunVar;
        Collections.addAll(this.zzc, this.zza);
        int i7 = 0;
        while (true) {
            zzuo[] zzuoVarArr = this.zza;
            if (i7 >= zzuoVarArr.length) {
                return;
            }
            zzuoVarArr[i7].zzl(this, j);
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zzuo zzn(int i7) {
        zzuo zzuoVar = this.zza[i7];
        return zzuoVar instanceof zzws ? ((zzws) zzuoVar).zzn() : zzuoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final boolean zzo(zzkm zzkmVar) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(zzkmVar);
        }
        int size = this.zzc.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((zzuo) this.zzc.get(i7)).zzo(zzkmVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
