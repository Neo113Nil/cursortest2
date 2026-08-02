package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzee {
    private final zzhz zzbs;
    private final zzfv zzkp;
    private final zzew zzkv;
    private long zzkw = 1;
    private zzgj<zzed> zzkq = zzgj.zzdl();
    private final zzfd zzkr = new zzfd();
    private final Map<zzex, zzhh> zzks = new HashMap();
    private final Map<zzhh, zzex> zzkt = new HashMap();
    private final Set<zzhh> zzku = new HashSet();

    public zzee(zzbz zzbzVar, zzfv zzfvVar, zzew zzewVar) {
        this.zzkv = zzewVar;
        this.zzkp = zzfvVar;
        this.zzbs = zzbzVar.zzp("SyncTree");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<zzgy> zza(zzfl zzflVar) {
        return zza(zzflVar, this.zzkq, (zzja) null, this.zzkr.zzt(zzch.zzbt()));
    }

    private final List<zzgy> zza(zzfl zzflVar, zzgj<zzed> zzgjVar, zzja zzjaVar, zzfg zzfgVar) {
        if (zzflVar.zzg().isEmpty()) {
            return zzb(zzflVar, zzgjVar, zzjaVar, zzfgVar);
        }
        zzed value = zzgjVar.getValue();
        if (zzjaVar == null && value != null) {
            zzjaVar = value.zzr(zzch.zzbt());
        }
        ArrayList arrayList = new ArrayList();
        zzid zzbw = zzflVar.zzg().zzbw();
        zzfl zzc = zzflVar.zzc(zzbw);
        zzgj<zzed> zzgjVar2 = zzgjVar.zzdm().get(zzbw);
        if (zzgjVar2 != null && zzc != null) {
            arrayList.addAll(zza(zzc, zzgjVar2, zzjaVar != null ? zzjaVar.zzm(zzbw) : null, zzfgVar.zzb(zzbw)));
        }
        if (value != null) {
            arrayList.addAll(value.zza(zzflVar, zzfgVar, zzjaVar));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<zzhi> zza(zzgj<zzed> zzgjVar) {
        ArrayList arrayList = new ArrayList();
        zza(zzgjVar, arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<? extends zzgy> zza(zzhh zzhhVar, zzfl zzflVar) {
        zzch zzg = zzhhVar.zzg();
        return this.zzkq.zzai(zzg).zza(zzflVar, this.zzkr.zzt(zzg), (zzja) null);
    }

    private final void zza(zzgj<zzed> zzgjVar, List<zzhi> list) {
        zzed value = zzgjVar.getValue();
        if (value != null && value.zzci()) {
            list.add(value.zzcj());
            return;
        }
        if (value != null) {
            list.addAll(value.zzch());
        }
        Iterator<Map.Entry<zzid, zzgj<zzed>>> it = zzgjVar.zzdm().iterator();
        while (it.hasNext()) {
            zza(it.next().getValue(), list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzhh zzhhVar, zzhi zzhiVar) {
        zzch zzg = zzhhVar.zzg();
        zzex zze = zze(zzhhVar);
        zzev zzevVar = new zzev(this, zzhiVar);
        this.zzkv.zza(zzd(zzhhVar), zze, zzevVar, zzevVar);
        zzgj<zzed> zzag = this.zzkq.zzag(zzg);
        if (zze == null) {
            zzag.zza(new zzej(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzhh zzb(zzex zzexVar) {
        return this.zzks.get(zzexVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<zzgy> zzb(zzfl zzflVar, zzgj<zzed> zzgjVar, zzja zzjaVar, zzfg zzfgVar) {
        zzed value = zzgjVar.getValue();
        if (zzjaVar == null && value != null) {
            zzjaVar = value.zzr(zzch.zzbt());
        }
        ArrayList arrayList = new ArrayList();
        zzgjVar.zzdm().inOrderTraversal(new zzek(this, zzjaVar, zzfgVar, zzflVar, arrayList));
        if (value != null) {
            arrayList.addAll(value.zza(zzflVar, zzfgVar, zzjaVar));
        }
        return arrayList;
    }

    private final List<zzgy> zzb(zzhh zzhhVar, zzce zzceVar, DatabaseError databaseError) {
        return (List) this.zzkp.zza(new zzei(this, zzhhVar, zzceVar, databaseError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzex zzcl() {
        long j = this.zzkw;
        this.zzkw = 1 + j;
        return new zzex(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzhh zzd(zzhh zzhhVar) {
        return (!zzhhVar.zzek() || zzhhVar.isDefault()) ? zzhhVar : zzhh.zzal(zzhhVar.zzg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List<zzhh> list) {
        for (zzhh zzhhVar : list) {
            if (!zzhhVar.zzek()) {
                zzex zze = zze(zzhhVar);
                this.zzkt.remove(zzhhVar);
                this.zzks.remove(zze);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzex zze(zzhh zzhhVar) {
        return this.zzkt.get(zzhhVar);
    }

    public final boolean isEmpty() {
        return this.zzkq.isEmpty();
    }

    public final List<? extends zzgy> zza(long j, boolean z, boolean z2, zzkf zzkfVar) {
        return (List) this.zzkp.zza(new zzem(this, z2, j, z, zzkfVar));
    }

    public final List<? extends zzgy> zza(zzch zzchVar, zzbv zzbvVar, zzbv zzbvVar2, long j, boolean z) {
        return (List) this.zzkp.zza(new zzel(this, z, zzchVar, zzbvVar, j, zzbvVar2));
    }

    public final List<? extends zzgy> zza(zzch zzchVar, zzja zzjaVar, zzex zzexVar) {
        return (List) this.zzkp.zza(new zzes(this, zzexVar, zzchVar, zzjaVar));
    }

    public final List<? extends zzgy> zza(zzch zzchVar, zzja zzjaVar, zzja zzjaVar2, long j, boolean z, boolean z2) {
        zzkq.zza(z || !z2, "We shouldn't be persisting non-visible writes.");
        return (List) this.zzkp.zza(new zzef(this, z2, zzchVar, zzjaVar, j, zzjaVar2, z));
    }

    public final List<? extends zzgy> zza(zzch zzchVar, List<zzjh> list, zzex zzexVar) {
        zzhh zzb = zzb(zzexVar);
        if (zzb == null) {
            return Collections.emptyList();
        }
        zzja zzep = this.zzkq.zzai(zzb.zzg()).zzb(zzb).zzep();
        Iterator<zzjh> it = list.iterator();
        while (it.hasNext()) {
            zzep = it.next().zzm(zzep);
        }
        return zza(zzchVar, zzep, zzexVar);
    }

    public final List<? extends zzgy> zza(zzch zzchVar, Map<zzch, zzja> map) {
        return (List) this.zzkp.zza(new zzep(this, map, zzchVar));
    }

    public final List<? extends zzgy> zza(zzch zzchVar, Map<zzch, zzja> map, zzex zzexVar) {
        return (List) this.zzkp.zza(new zzeg(this, zzexVar, zzchVar, map));
    }

    public final List<? extends zzgy> zza(zzex zzexVar) {
        return (List) this.zzkp.zza(new zzer(this, zzexVar));
    }

    public final List<zzgy> zza(zzhh zzhhVar, DatabaseError databaseError) {
        return zzb(zzhhVar, null, databaseError);
    }

    public final void zza(zzhh zzhhVar, boolean z) {
        if (z && !this.zzku.contains(zzhhVar)) {
            zzg(new zzeu(zzhhVar));
            this.zzku.add(zzhhVar);
        } else {
            if (z || !this.zzku.contains(zzhhVar)) {
                return;
            }
            zzh(new zzeu(zzhhVar));
            this.zzku.remove(zzhhVar);
        }
    }

    public final List<? extends zzgy> zzb(zzch zzchVar, List<zzjh> list) {
        zzhi zzcj;
        zzed zzai = this.zzkq.zzai(zzchVar);
        if (zzai != null && (zzcj = zzai.zzcj()) != null) {
            zzja zzep = zzcj.zzep();
            Iterator<zzjh> it = list.iterator();
            while (it.hasNext()) {
                zzep = it.next().zzm(zzep);
            }
            return zzi(zzchVar, zzep);
        }
        return Collections.emptyList();
    }

    public final zzja zzc(zzch zzchVar, List<Long> list) {
        zzgj<zzed> zzgjVar = this.zzkq;
        zzgjVar.getValue();
        zzch zzbt = zzch.zzbt();
        zzja zzjaVar = null;
        zzgj<zzed> zzgjVar2 = zzgjVar;
        zzch zzchVar2 = zzchVar;
        do {
            zzid zzbw = zzchVar2.zzbw();
            zzchVar2 = zzchVar2.zzbx();
            zzbt = zzbt.zza(zzbw);
            zzch zza = zzch.zza(zzbt, zzchVar);
            zzgjVar2 = zzbw != null ? zzgjVar2.zze(zzbw) : zzgj.zzdl();
            zzed value = zzgjVar2.getValue();
            if (value != null) {
                zzjaVar = value.zzr(zza);
            }
            if (zzchVar2.isEmpty()) {
                break;
            }
        } while (zzjaVar == null);
        return this.zzkr.zza(zzchVar, zzjaVar, list, true);
    }

    public final List<? extends zzgy> zzck() {
        return (List) this.zzkp.zza(new zzen(this));
    }

    public final List<? extends zzgy> zzg(zzce zzceVar) {
        return (List) this.zzkp.zza(new zzeh(this, zzceVar));
    }

    public final List<zzgy> zzh(zzce zzceVar) {
        return zzb(zzceVar.zzbe(), zzceVar, null);
    }

    public final List<? extends zzgy> zzi(zzch zzchVar, zzja zzjaVar) {
        return (List) this.zzkp.zza(new zzeo(this, zzchVar, zzjaVar));
    }

    public final List<? extends zzgy> zzs(zzch zzchVar) {
        return (List) this.zzkp.zza(new zzeq(this, zzchVar));
    }
}
