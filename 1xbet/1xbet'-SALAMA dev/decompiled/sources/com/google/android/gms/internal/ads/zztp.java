package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class zztp implements zzus {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzva zzc = new zzva();
    private final zzrl zzd = new zzrl();
    private Looper zze;
    private zzbn zzf;
    private zzor zzg;

    @Override // com.google.android.gms.internal.ads.zzus
    public /* synthetic */ zzbn zzM() {
        return null;
    }

    public final zzor zzb() {
        zzor zzorVar = this.zzg;
        zzcv.zzb(zzorVar);
        return zzorVar;
    }

    public final zzrl zzc(zzuq zzuqVar) {
        return this.zzd.zza(0, zzuqVar);
    }

    public final zzrl zzd(int i7, zzuq zzuqVar) {
        return this.zzd.zza(0, zzuqVar);
    }

    public final zzva zze(zzuq zzuqVar) {
        return this.zzc.zza(0, zzuqVar);
    }

    public final zzva zzf(int i7, zzuq zzuqVar) {
        return this.zzc.zza(0, zzuqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzg(Handler handler, zzrm zzrmVar) {
        this.zzd.zzb(handler, zzrmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzh(Handler handler, zzvb zzvbVar) {
        this.zzc.zzb(handler, zzvbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzi(zzur zzurVar) {
        boolean zIsEmpty = this.zzb.isEmpty();
        this.zzb.remove(zzurVar);
        if (zIsEmpty || !this.zzb.isEmpty()) {
            return;
        }
        zzj();
    }

    public void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzk(zzur zzurVar) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(zzurVar);
        if (zIsEmpty) {
            zzl();
        }
    }

    public void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzm(zzur zzurVar, zzgx zzgxVar, zzor zzorVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z4 = true;
        if (looper != null && looper != looperMyLooper) {
            z4 = false;
        }
        zzcv.zzd(z4);
        this.zzg = zzorVar;
        zzbn zzbnVar = this.zzf;
        this.zza.add(zzurVar);
        if (this.zze == null) {
            this.zze = looperMyLooper;
            this.zzb.add(zzurVar);
            zzn(zzgxVar);
        } else if (zzbnVar != null) {
            zzk(zzurVar);
            zzurVar.zza(this, zzbnVar);
        }
    }

    public abstract void zzn(zzgx zzgxVar);

    public final void zzo(zzbn zzbnVar) {
        this.zzf = zzbnVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((zzur) arrayList.get(i7)).zza(this, zzbnVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzp(zzur zzurVar) {
        this.zza.remove(zzurVar);
        if (!this.zza.isEmpty()) {
            zzi(zzurVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzq();
    }

    public abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzr(zzrm zzrmVar) {
        this.zzd.zzc(zzrmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzs(zzvb zzvbVar) {
        this.zzc.zzi(zzvbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public /* synthetic */ void zzt(zzap zzapVar) {
        throw null;
    }

    public final boolean zzu() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public /* synthetic */ boolean zzv() {
        return true;
    }
}
