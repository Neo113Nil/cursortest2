package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseException;

/* loaded from: classes.dex */
public final class zzjg {
    public static zzja zzc(zzch zzchVar, Object obj) {
        String str;
        zzja zza = zzjd.zza(obj, zzir.zzfv());
        if (zza instanceof zziy) {
            zza = new zziq(Double.valueOf(((Long) zza.getValue()).longValue()), zzir.zzfv());
        }
        if (zzl(zza)) {
            return zza;
        }
        if (zzchVar != null) {
            String valueOf = String.valueOf(zzchVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
            sb.append("Path '");
            sb.append(valueOf);
            sb.append("'");
            str = sb.toString();
        } else {
            str = "Node";
        }
        throw new DatabaseException(String.valueOf(str).concat(" contains invalid priority: Must be a string, double, ServerValue, or null"));
    }

    public static boolean zzl(zzja zzjaVar) {
        if (zzjaVar.zzfl().isEmpty()) {
            return zzjaVar.isEmpty() || (zzjaVar instanceof zziq) || (zzjaVar instanceof zzji) || (zzjaVar instanceof zzip);
        }
        return false;
    }
}
