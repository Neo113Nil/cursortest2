package com.google.android.gms.internal.firebase_database;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzjh {
    private final zzch zzso;
    private final zzch zzsp;
    private final zzja zzsq;

    public zzjh(zzba zzbaVar) {
        List<String> zzap = zzbaVar.zzap();
        this.zzso = zzap != null ? new zzch(zzap) : null;
        List<String> zzaq = zzbaVar.zzaq();
        this.zzsp = zzaq != null ? new zzch(zzaq) : null;
        this.zzsq = zzjd.zza(zzbaVar.zzar(), zzir.zzfv());
    }

    private final zzja zzb(zzch zzchVar, zzja zzjaVar, zzja zzjaVar2) {
        zzch zzchVar2 = this.zzso;
        int compareTo = zzchVar2 == null ? 1 : zzchVar.compareTo(zzchVar2);
        zzch zzchVar3 = this.zzsp;
        int compareTo2 = zzchVar3 == null ? -1 : zzchVar.compareTo(zzchVar3);
        zzch zzchVar4 = this.zzso;
        int i = 0;
        boolean z = zzchVar4 != null && zzchVar.zzi(zzchVar4);
        zzch zzchVar5 = this.zzsp;
        boolean z2 = zzchVar5 != null && zzchVar.zzi(zzchVar5);
        if (compareTo > 0 && compareTo2 < 0 && !z2) {
            return zzjaVar2;
        }
        if (compareTo > 0 && z2 && zzjaVar2.zzfk()) {
            return zzjaVar2;
        }
        if (compareTo > 0 && compareTo2 == 0) {
            return zzjaVar.zzfk() ? zzir.zzfv() : zzjaVar;
        }
        if (!z && !z2) {
            return zzjaVar;
        }
        HashSet hashSet = new HashSet();
        Iterator<zziz> it = zzjaVar.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zzge());
        }
        Iterator<zziz> it2 = zzjaVar2.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().zzge());
        }
        ArrayList arrayList = new ArrayList(hashSet.size() + 1);
        arrayList.addAll(hashSet);
        if (!zzjaVar2.zzfl().isEmpty() || !zzjaVar.zzfl().isEmpty()) {
            arrayList.add(zzid.zzfe());
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        zzja zzjaVar3 = zzjaVar;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            zzid zzidVar = (zzid) obj;
            zzja zzm = zzjaVar.zzm(zzidVar);
            zzja zzb = zzb(zzchVar.zza(zzidVar), zzjaVar.zzm(zzidVar), zzjaVar2.zzm(zzidVar));
            if (zzb != zzm) {
                zzjaVar3 = zzjaVar3.zze(zzidVar, zzb);
            }
        }
        return zzjaVar3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzso);
        String valueOf2 = String.valueOf(this.zzsp);
        String valueOf3 = String.valueOf(this.zzsq);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("RangeMerge{optExclusiveStart=");
        sb.append(valueOf);
        sb.append(", optInclusiveEnd=");
        sb.append(valueOf2);
        sb.append(", snap=");
        sb.append(valueOf3);
        sb.append('}');
        return sb.toString();
    }

    public final zzja zzm(zzja zzjaVar) {
        return zzb(zzch.zzbt(), zzjaVar, this.zzsq);
    }
}
