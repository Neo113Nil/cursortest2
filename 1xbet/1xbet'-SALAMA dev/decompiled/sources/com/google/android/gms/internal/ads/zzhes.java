package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzhes implements zzheg {
    private final List zza;
    private final List zzb;

    static {
        zzheh.zza(Collections.emptySet());
    }

    public /* synthetic */ zzhes(List list, List list2, zzheq zzheqVar) {
        this.zza = list;
        this.zzb = list2;
    }

    public static zzher zza(int i7, int i8) {
        return new zzher(i7, i8, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int size = this.zza.size();
        ArrayList arrayList = new ArrayList(this.zzb.size());
        int size2 = this.zzb.size();
        for (int i7 = 0; i7 < size2; i7++) {
            Collection collection = (Collection) ((zzhep) this.zzb.get(i7)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetZza = zzhed.zza(size);
        int size3 = this.zza.size();
        for (int i8 = 0; i8 < size3; i8++) {
            Object objZzb = ((zzhep) this.zza.get(i8)).zzb();
            objZzb.getClass();
            hashSetZza.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i9 = 0; i9 < size4; i9++) {
            for (Object obj : (Collection) arrayList.get(i9)) {
                obj.getClass();
                hashSetZza.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSetZza);
    }
}
