package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzhi {
    private final zzhh zzpc;
    private final zzhl zzpt;
    private zzhk zzpu;
    private final List<zzce> zzpv;
    private final zzha zzpw;

    public zzhi(zzhh zzhhVar, zzhk zzhkVar) {
        this.zzpc = zzhhVar;
        zzhr zzhrVar = new zzhr(zzhhVar.zzeg());
        zzht zzem = zzhhVar.zzen().zzem();
        this.zzpt = new zzhl(zzem);
        zzgu zzet = zzhkVar.zzet();
        zzgu zzer = zzhkVar.zzer();
        zzit zza = zzit.zza(zzir.zzfv(), zzhhVar.zzeg());
        zzit zza2 = zzhrVar.zza(zza, zzet.zzdq(), null);
        zzit zza3 = zzem.zza(zza, zzer.zzdq(), null);
        this.zzpu = new zzhk(new zzgu(zza3, zzer.zzdo(), zzem.zzex()), new zzgu(zza2, zzet.zzdo(), false));
        this.zzpv = new ArrayList();
        this.zzpw = new zzha(zzhhVar);
    }

    private final List<zzgx> zza(List<zzgw> list, zzit zzitVar, zzce zzceVar) {
        return this.zzpw.zza(list, zzitVar, zzceVar == null ? this.zzpv : Arrays.asList(zzceVar));
    }

    public final boolean isEmpty() {
        return this.zzpv.isEmpty();
    }

    public final List<zzgy> zza(zzce zzceVar, DatabaseError databaseError) {
        List<zzgy> emptyList;
        if (databaseError != null) {
            emptyList = new ArrayList<>();
            zzch zzg = this.zzpc.zzg();
            Iterator<zzce> it = this.zzpv.iterator();
            while (it.hasNext()) {
                emptyList.add(new zzgv(it.next(), databaseError, zzg));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        if (zzceVar != null) {
            int i = 0;
            int i2 = -1;
            while (true) {
                if (i >= this.zzpv.size()) {
                    i = i2;
                    break;
                }
                zzce zzceVar2 = this.zzpv.get(i);
                if (zzceVar2.zzc(zzceVar)) {
                    if (zzceVar2.zzbs()) {
                        break;
                    }
                    i2 = i;
                }
                i++;
            }
            if (i != -1) {
                zzce zzceVar3 = this.zzpv.get(i);
                this.zzpv.remove(i);
                zzceVar3.zzbr();
            }
        } else {
            Iterator<zzce> it2 = this.zzpv.iterator();
            while (it2.hasNext()) {
                it2.next().zzbr();
            }
            this.zzpv.clear();
        }
        return emptyList;
    }

    public final zzhj zzb(zzfl zzflVar, zzfg zzfgVar, zzja zzjaVar) {
        if (zzflVar.zzcz() == zzfm.Merge) {
            zzflVar.zzcy().zzdc();
        }
        zzho zza = this.zzpt.zza(this.zzpu, zzflVar, zzfgVar, zzjaVar);
        this.zzpu = zza.zzpu;
        return new zzhj(zza(zza.zzpy, zza.zzpu.zzer().zzdq(), null), zza.zzpy);
    }

    public final void zzb(zzce zzceVar) {
        this.zzpv.add(zzceVar);
    }

    public final zzhh zzeo() {
        return this.zzpc;
    }

    public final zzja zzep() {
        return this.zzpu.zzet().zzd();
    }

    public final zzja zzeq() {
        return this.zzpu.zzer().zzd();
    }

    public final List<zzgx> zzk(zzce zzceVar) {
        zzgu zzer = this.zzpu.zzer();
        ArrayList arrayList = new ArrayList();
        for (zziz zzizVar : zzer.zzd()) {
            arrayList.add(zzgw.zzc(zzizVar.zzge(), zzizVar.zzd()));
        }
        if (zzer.zzdo()) {
            arrayList.add(zzgw.zza(zzer.zzdq()));
        }
        return zza(arrayList, zzer.zzdq(), zzceVar);
    }

    public final zzja zzr(zzch zzchVar) {
        zzja zzeu = this.zzpu.zzeu();
        if (zzeu == null) {
            return null;
        }
        if (this.zzpc.zzek() || !(zzchVar.isEmpty() || zzeu.zzm(zzchVar.zzbw()).isEmpty())) {
            return zzeu.zzam(zzchVar);
        }
        return null;
    }
}
