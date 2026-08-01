package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdrb {
    public static final zzdrb zza = new zzdrb(new zzdra());
    private final zzbnt zzb;
    private final zzbnq zzc;
    private final zzbog zzd;
    private final zzbod zze;
    private final zzbtc zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    private zzdrb(zzdra zzdraVar) {
        this.zzb = zzdraVar.zza;
        this.zzc = zzdraVar.zzb;
        this.zzd = zzdraVar.zzc;
        this.zzg = new SimpleArrayMap(zzdraVar.zzf);
        this.zzh = new SimpleArrayMap(zzdraVar.zzg);
        this.zze = zzdraVar.zzd;
        this.zzf = zzdraVar.zze;
    }

    /* synthetic */ zzdrb(zzdra zzdraVar, byte[] bArr) {
        this(zzdraVar);
    }

    public final zzbnt zza() {
        return this.zzb;
    }

    public final zzbnq zzb() {
        return this.zzc;
    }

    public final zzbog zzc() {
        return this.zzd;
    }

    public final zzbod zzd() {
        return this.zze;
    }

    public final zzbtc zze() {
        return this.zzf;
    }

    public final zzbnz zzf(String str) {
        if (str == null) {
            return null;
        }
        return (zzbnz) this.zzg.get(str);
    }

    public final zzbnw zzg(String str) {
        return (zzbnw) this.zzh.get(str);
    }

    public final ArrayList zzh() {
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

    public final ArrayList zzi() {
        SimpleArrayMap simpleArrayMap = this.zzg;
        ArrayList arrayList = new ArrayList(simpleArrayMap.size());
        for (int i = 0; i < simpleArrayMap.size(); i++) {
            arrayList.add((String) simpleArrayMap.keyAt(i));
        }
        return arrayList;
    }
}
