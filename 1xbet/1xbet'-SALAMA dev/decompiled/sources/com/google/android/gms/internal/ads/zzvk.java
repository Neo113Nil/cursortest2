package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzvk extends zzty {
    private static final zzap zza;
    private final zzus[] zzb;
    private final List zzc;
    private final zzbn[] zzd;
    private final ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;
    private zzvh zzh;
    private final zzub zzi;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zza("MergingMediaSource");
        zza = zzadVar.zzc();
    }

    public zzvk(boolean z4, boolean z7, zzub zzubVar, zzus... zzusVarArr) {
        this.zzb = zzusVarArr;
        this.zzi = zzubVar;
        this.zze = new ArrayList(Arrays.asList(zzusVarArr));
        this.zzc = new ArrayList(zzusVarArr.length);
        int i7 = 0;
        while (true) {
            int length = zzusVarArr.length;
            if (i7 >= length) {
                this.zzd = new zzbn[length];
                this.zzg = new long[0][];
                new HashMap();
                zzfxn.zzb(8).zzb(2).zza();
                return;
            }
            this.zzc.add(new ArrayList());
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final /* bridge */ /* synthetic */ void zzA(Object obj, zzus zzusVar, zzbn zzbnVar) {
        int iZzb;
        Integer num = (Integer) obj;
        if (this.zzh != null) {
            return;
        }
        if (this.zzf == -1) {
            iZzb = zzbnVar.zzb();
            this.zzf = iZzb;
        } else {
            int iZzb2 = zzbnVar.zzb();
            int i7 = this.zzf;
            if (iZzb2 != i7) {
                this.zzh = new zzvh(0);
                return;
            }
            iZzb = i7;
        }
        if (this.zzg.length == 0) {
            this.zzg = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iZzb, this.zzd.length);
        }
        this.zze.remove(zzusVar);
        this.zzd[num.intValue()] = zzbnVar;
        if (this.zze.isEmpty()) {
            zzo(this.zzd[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzG(zzuo zzuoVar) {
        zzvg zzvgVar = (zzvg) zzuoVar;
        for (int i7 = 0; i7 < this.zzb.length; i7++) {
            List list = (List) this.zzc.get(i7);
            for (int i8 = 0; i8 < list.size(); i8++) {
                if (((zzvi) list.get(i8)).zzb.equals(zzuoVar)) {
                    list.remove(i8);
                    break;
                }
            }
            this.zzb[i7].zzG(zzvgVar.zzn(i7));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final zzuo zzI(zzuq zzuqVar, zzyw zzywVar, long j) {
        zzbn[] zzbnVarArr = this.zzd;
        int length = this.zzb.length;
        zzuo[] zzuoVarArr = new zzuo[length];
        int iZza = zzbnVarArr[0].zza(zzuqVar.zza);
        for (int i7 = 0; i7 < length; i7++) {
            zzuq zzuqVarZza = zzuqVar.zza(this.zzd[i7].zzf(iZza));
            zzuoVarArr[i7] = this.zzb[i7].zzI(zzuqVarZza, zzywVar, j - this.zzg[iZza][i7]);
            ((List) this.zzc.get(i7)).add(new zzvi(zzuqVarZza, zzuoVarArr[i7], null));
        }
        return new zzvg(this.zzi, this.zzg[iZza], zzuoVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final zzap zzJ() {
        zzus[] zzusVarArr = this.zzb;
        return zzusVarArr.length > 0 ? zzusVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzty, com.google.android.gms.internal.ads.zztp
    public final void zzn(zzgx zzgxVar) {
        super.zzn(zzgxVar);
        int i7 = 0;
        while (true) {
            zzus[] zzusVarArr = this.zzb;
            if (i7 >= zzusVarArr.length) {
                return;
            }
            zzB(Integer.valueOf(i7), zzusVarArr[i7]);
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzty, com.google.android.gms.internal.ads.zztp
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzd, (Object) null);
        this.zzf = -1;
        this.zzh = null;
        this.zze.clear();
        Collections.addAll(this.zze, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzus
    public final void zzt(zzap zzapVar) {
        this.zzb[0].zzt(zzapVar);
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final /* bridge */ /* synthetic */ zzuq zzy(Object obj, zzuq zzuqVar) {
        List list = (List) this.zzc.get(((Integer) obj).intValue());
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (((zzvi) list.get(i7)).zza.equals(zzuqVar)) {
                return ((zzvi) ((List) this.zzc.get(0)).get(i7)).zza;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzty, com.google.android.gms.internal.ads.zzus
    public final void zzz() throws zzvh {
        zzvh zzvhVar = this.zzh;
        if (zzvhVar != null) {
            throw zzvhVar;
        }
        super.zzz();
    }
}
