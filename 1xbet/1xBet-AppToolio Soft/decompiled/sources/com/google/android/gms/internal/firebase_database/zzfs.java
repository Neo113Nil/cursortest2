package com.google.android.gms.internal.firebase_database;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzfs implements zzfv {
    private final zzhz zzbs;
    private final zzfw zzne;
    private final zzgc zznf;
    private final zzfq zzng;
    private long zznh;

    public zzfs(zzbz zzbzVar, zzfw zzfwVar, zzfq zzfqVar) {
        this(zzbzVar, zzfwVar, zzfqVar, new zzkg());
    }

    private zzfs(zzbz zzbzVar, zzfw zzfwVar, zzfq zzfqVar, zzkf zzkfVar) {
        this.zznh = 0L;
        this.zzne = zzfwVar;
        this.zzbs = zzbzVar.zzp("Persistence");
        this.zznf = new zzgc(this.zzne, this.zzbs, zzkfVar);
        this.zzng = zzfqVar;
    }

    private final void zzdg() {
        this.zznh++;
        if (this.zzng.zzm(this.zznh)) {
            if (this.zzbs.zzfa()) {
                this.zzbs.zza("Reached prune check threshold.", null, new Object[0]);
            }
            this.zznh = 0L;
            boolean z = true;
            long zzk = this.zzne.zzk();
            if (this.zzbs.zzfa()) {
                zzhz zzhzVar = this.zzbs;
                StringBuilder sb = new StringBuilder(32);
                sb.append("Cache size: ");
                sb.append(zzk);
                zzhzVar.zza(sb.toString(), null, new Object[0]);
            }
            while (z && this.zzng.zza(zzk, this.zznf.zzdj())) {
                zzfx zza = this.zznf.zza(this.zzng);
                if (zza.zzdh()) {
                    this.zzne.zza(zzch.zzbt(), zza);
                } else {
                    z = false;
                }
                zzk = this.zzne.zzk();
                if (this.zzbs.zzfa()) {
                    zzhz zzhzVar2 = this.zzbs;
                    StringBuilder sb2 = new StringBuilder(44);
                    sb2.append("Cache size after prune: ");
                    sb2.append(zzk);
                    zzhzVar2.zza(sb2.toString(), null, new Object[0]);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final <T> T zza(Callable<T> callable) {
        this.zzne.beginTransaction();
        try {
            try {
                T call = callable.call();
                this.zzne.setTransactionSuccessful();
                return call;
            } catch (Throwable th) {
                this.zzbs.zza("Caught Throwable.", th);
                throw new RuntimeException(th);
            }
        } finally {
            this.zzne.endTransaction();
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zza(long j) {
        this.zzne.zza(j);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zza(zzch zzchVar, zzbv zzbvVar, long j) {
        this.zzne.zza(zzchVar, zzbvVar, j);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zza(zzch zzchVar, zzja zzjaVar, long j) {
        this.zzne.zza(zzchVar, zzjaVar, j);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zza(zzhh zzhhVar, zzja zzjaVar) {
        if (zzhhVar.zzek()) {
            this.zzne.zza(zzhhVar.zzg(), zzjaVar);
        } else {
            this.zzne.zzb(zzhhVar.zzg(), zzjaVar);
        }
        zzi(zzhhVar);
        zzdg();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zza(zzhh zzhhVar, Set<zzid> set) {
        this.zzne.zza(this.zznf.zzk(zzhhVar).id, set);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zza(zzhh zzhhVar, Set<zzid> set, Set<zzid> set2) {
        this.zzne.zza(this.zznf.zzk(zzhhVar).id, set, set2);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zzc(zzch zzchVar, zzbv zzbvVar) {
        Iterator<Map.Entry<zzch, zzja>> it = zzbvVar.iterator();
        while (it.hasNext()) {
            Map.Entry<zzch, zzja> next = it.next();
            zzk(zzchVar.zzh(next.getKey()), next.getValue());
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zzd(zzch zzchVar, zzbv zzbvVar) {
        this.zzne.zza(zzchVar, zzbvVar);
        zzdg();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final zzgu zzf(zzhh zzhhVar) {
        Set<zzid> zzaa;
        boolean z;
        if (this.zznf.zzm(zzhhVar)) {
            zzgb zzk = this.zznf.zzk(zzhhVar);
            zzaa = (zzhhVar.zzek() || zzk == null || !zzk.zznr) ? null : this.zzne.zzd(zzk.id);
            z = true;
        } else {
            zzaa = this.zznf.zzaa(zzhhVar.zzg());
            z = false;
        }
        zzja zza = this.zzne.zza(zzhhVar.zzg());
        if (zzaa == null) {
            return new zzgu(zzit.zza(zza, zzhhVar.zzeg()), true, false);
        }
        zzja zzfv = zzir.zzfv();
        for (zzid zzidVar : zzaa) {
            zzfv = zzfv.zze(zzidVar, zza.zzm(zzidVar));
        }
        return new zzgu(zzit.zza(zzfv, zzhhVar.zzeg()), z, true);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zzg(zzhh zzhhVar) {
        this.zznf.zzg(zzhhVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zzh(zzhh zzhhVar) {
        this.zznf.zzh(zzhhVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zzi(zzhh zzhhVar) {
        if (zzhhVar.zzek()) {
            this.zznf.zzz(zzhhVar.zzg());
        } else {
            this.zznf.zzl(zzhhVar);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final List<zzfa> zzj() {
        return this.zzne.zzj();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zzk(zzch zzchVar, zzja zzjaVar) {
        if (this.zznf.zzac(zzchVar)) {
            return;
        }
        this.zzne.zza(zzchVar, zzjaVar);
        this.zznf.zzab(zzchVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfv
    public final void zzm() {
        this.zzne.zzm();
    }
}
