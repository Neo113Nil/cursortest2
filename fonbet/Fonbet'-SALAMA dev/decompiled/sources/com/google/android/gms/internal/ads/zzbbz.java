package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbbz {
    public static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbdi.zzc("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbdv.zza);
        zzc(arrayList, zzbdv.zzb);
        zzc(arrayList, zzbdv.zzc);
        zzc(arrayList, zzbdv.zzd);
        zzc(arrayList, zzbdv.zze);
        zzc(arrayList, zzbdv.zzu);
        zzc(arrayList, zzbdv.zzf);
        zzc(arrayList, zzbdv.zzm);
        zzc(arrayList, zzbdv.zzn);
        zzc(arrayList, zzbdv.zzo);
        zzc(arrayList, zzbdv.zzp);
        zzc(arrayList, zzbdv.zzq);
        zzc(arrayList, zzbdv.zzr);
        zzc(arrayList, zzbdv.zzs);
        zzc(arrayList, zzbdv.zzt);
        zzc(arrayList, zzbdv.zzg);
        zzc(arrayList, zzbdv.zzh);
        zzc(arrayList, zzbdv.zzi);
        zzc(arrayList, zzbdv.zzj);
        zzc(arrayList, zzbdv.zzk);
        zzc(arrayList, zzbdv.zzl);
        return arrayList;
    }

    public static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbej.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbdi zzbdiVar) {
        String str = (String) zzbdiVar.zze();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
