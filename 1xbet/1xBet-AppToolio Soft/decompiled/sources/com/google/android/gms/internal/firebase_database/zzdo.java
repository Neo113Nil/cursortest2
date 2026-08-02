package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.FirebaseDatabase;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdo {
    private static final zzdo zzkb = new zzdo();
    private final Map<zzbz, Map<String, zzck>> zzkc = new HashMap();

    public static zzck zza(zzbz zzbzVar, zzdn zzdnVar, FirebaseDatabase firebaseDatabase) throws DatabaseException {
        return zzkb.zzb(zzbzVar, zzdnVar, firebaseDatabase);
    }

    private final zzck zzb(zzbz zzbzVar, zzdn zzdnVar, FirebaseDatabase firebaseDatabase) throws DatabaseException {
        zzck zzckVar;
        zzbzVar.zzba();
        String str = zzdnVar.zzct;
        String str2 = zzdnVar.zzcu;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 9 + String.valueOf(str2).length());
        sb.append("https://");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        String sb2 = sb.toString();
        synchronized (this.zzkc) {
            if (!this.zzkc.containsKey(zzbzVar)) {
                this.zzkc.put(zzbzVar, new HashMap());
            }
            Map<String, zzck> map = this.zzkc.get(zzbzVar);
            if (map.containsKey(sb2)) {
                throw new IllegalStateException("createLocalRepo() called for existing repo.");
            }
            zzckVar = new zzck(zzdnVar, zzbzVar, firebaseDatabase);
            map.put(sb2, zzckVar);
        }
        return zzckVar;
    }

    public static void zzd(zzbz zzbzVar) {
        zzdo zzdoVar = zzkb;
        zzdt zzdtVar = zzbzVar.zzhh;
        if (zzdtVar != null) {
            zzdtVar.zzc(new zzdr(zzdoVar, zzbzVar));
        }
    }

    public static void zze(zzbz zzbzVar) {
        zzdo zzdoVar = zzkb;
        zzdt zzdtVar = zzbzVar.zzhh;
        if (zzdtVar != null) {
            zzdtVar.zzc(new zzds(zzdoVar, zzbzVar));
        }
    }

    public static void zzk(zzck zzckVar) {
        zzckVar.zzc(new zzdp(zzckVar));
    }

    public static void zzl(zzck zzckVar) {
        zzckVar.zzc(new zzdq(zzckVar));
    }
}
