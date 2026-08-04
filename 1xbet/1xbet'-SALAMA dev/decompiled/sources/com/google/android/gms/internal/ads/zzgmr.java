package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzgmr {
    private final Class zza;
    private zzgms zzd;
    private Map zzb = new HashMap();
    private final List zzc = new ArrayList();
    private zzgky zze = zzgky.zza;

    public /* synthetic */ zzgmr(Class cls, zzgmt zzgmtVar) {
        this.zza = cls;
    }

    private final zzgmr zze(Object obj, zzgcs zzgcsVar, zzgsk zzgskVar, boolean z4) throws GeneralSecurityException {
        byte[] bArrZzd;
        if (this.zzb == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if (zzgskVar.zzk() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int iOrdinal = zzgskVar.zzf().ordinal();
        if (iOrdinal == 1) {
            bArrZzd = zzglv.zzb(zzgskVar.zza()).zzd();
        } else if (iOrdinal == 2) {
            bArrZzd = zzglv.zza(zzgskVar.zza()).zzd();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrZzd = zzglv.zza(zzgskVar.zza()).zzd();
        } else {
            bArrZzd = zzgcn.zza;
        }
        zzgms zzgmsVar = new zzgms(obj, zzgvd.zzb(bArrZzd), zzgcu.zza, zzgskVar.zza(), zzgcsVar, null);
        Map map = this.zzb;
        List list = this.zzc;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzgmsVar);
        List list2 = (List) map.put(zzgmsVar.zzd(), Collections.unmodifiableList(arrayList));
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            arrayList2.add(zzgmsVar);
            map.put(zzgmsVar.zzd(), Collections.unmodifiableList(arrayList2));
        }
        list.add(zzgmsVar);
        if (z4) {
            if (this.zzd != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.zzd = zzgmsVar;
        }
        return this;
    }

    public final zzgmr zza(Object obj, zzgcs zzgcsVar, zzgsk zzgskVar) throws GeneralSecurityException {
        zze(obj, zzgcsVar, zzgskVar, false);
        return this;
    }

    public final zzgmr zzb(Object obj, zzgcs zzgcsVar, zzgsk zzgskVar) throws GeneralSecurityException {
        zze(obj, zzgcsVar, zzgskVar, true);
        return this;
    }

    public final zzgmr zzc(zzgky zzgkyVar) {
        if (this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zze = zzgkyVar;
        return this;
    }

    public final zzgmu zzd() {
        Map map = this.zzb;
        if (map == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzgmu zzgmuVar = new zzgmu(map, this.zzc, this.zzd, this.zze, this.zza, null);
        this.zzb = null;
        return zzgmuVar;
    }
}
