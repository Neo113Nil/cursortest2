package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzty extends zztp {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzgx zzc;

    public abstract void zzA(Object obj, zzus zzusVar, zzbn zzbnVar);

    public final void zzB(final Object obj, zzus zzusVar) {
        zzcv.zzd(!this.zza.containsKey(obj));
        zzur zzurVar = new zzur() { // from class: com.google.android.gms.internal.ads.zztv
            @Override // com.google.android.gms.internal.ads.zzur
            public final void zza(zzus zzusVar2, zzbn zzbnVar) {
                this.zza.zzA(obj, zzusVar2, zzbnVar);
            }
        };
        zztw zztwVar = new zztw(this, obj);
        this.zza.put(obj, new zztx(zzusVar, zzurVar, zztwVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzusVar.zzh(handler, zztwVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzusVar.zzg(handler2, zztwVar);
        zzusVar.zzm(zzurVar, this.zzc, zzb());
        if (zzu()) {
            return;
        }
        zzusVar.zzi(zzurVar);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzj() {
        for (zztx zztxVar : this.zza.values()) {
            zztxVar.zza.zzi(zztxVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzl() {
        for (zztx zztxVar : this.zza.values()) {
            zztxVar.zza.zzk(zztxVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public void zzn(zzgx zzgxVar) {
        this.zzc = zzgxVar;
        this.zzb = zzen.zzy(null);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public void zzq() {
        for (zztx zztxVar : this.zza.values()) {
            zztxVar.zza.zzp(zztxVar.zzb);
            zztxVar.zza.zzs(zztxVar.zzc);
            zztxVar.zza.zzr(zztxVar.zzc);
        }
        this.zza.clear();
    }

    public int zzw(Object obj, int i7) {
        return 0;
    }

    public long zzx(Object obj, long j, zzuq zzuqVar) {
        return j;
    }

    public zzuq zzy(Object obj, zzuq zzuqVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public void zzz() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zztx) it.next()).zza.zzz();
        }
    }
}
