package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import r.l;

/* loaded from: classes.dex */
public final class zzdhn {
    public static final zzdhn zza = new zzdhn(new zzdhl());
    private final zzbgk zzb;
    private final zzbgh zzc;
    private final zzbgx zzd;
    private final zzbgu zze;
    private final zzbls zzf;
    private final l zzg;
    private final l zzh;

    public final zzbgh zza() {
        return this.zzc;
    }

    public final zzbgk zzb() {
        return this.zzb;
    }

    public final zzbgn zzc(String str) {
        return (zzbgn) this.zzh.getOrDefault(str, null);
    }

    public final zzbgq zzd(String str) {
        if (str == null) {
            return null;
        }
        return (zzbgq) this.zzg.getOrDefault(str, null);
    }

    public final zzbgu zze() {
        return this.zze;
    }

    public final zzbgx zzf() {
        return this.zzd;
    }

    public final zzbls zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.f16007c);
        int i7 = 0;
        while (true) {
            l lVar = this.zzg;
            if (i7 >= lVar.f16007c) {
                return arrayList;
            }
            arrayList.add((String) lVar.h(i7));
            i7++;
        }
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    private zzdhn(zzdhl zzdhlVar) {
        this.zzb = zzdhlVar.zza;
        this.zzc = zzdhlVar.zzb;
        this.zzd = zzdhlVar.zzc;
        this.zzg = new l(zzdhlVar.zzf);
        this.zzh = new l(zzdhlVar.zzg);
        this.zze = zzdhlVar.zzd;
        this.zzf = zzdhlVar.zze;
    }
}
