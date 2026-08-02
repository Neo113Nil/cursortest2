package com.google.android.gms.internal.firebase_database;

import java.util.Map;

/* loaded from: classes.dex */
final class zzas implements zzau {
    private final /* synthetic */ zzal zzdu;

    zzas(zzal zzalVar) {
        this.zzdu = zzalVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzau
    public final void zzd(Map<String, Object> map) {
        String str = (String) map.get("s");
        if (str.equals("ok")) {
            return;
        }
        String str2 = (String) map.get("d");
        if (this.zzdu.zzbs.zzfa()) {
            zzhz zzhzVar = this.zzdu.zzbs;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
            sb.append("Failed to send stats: ");
            sb.append(str);
            sb.append(" (message: ");
            sb.append(str2);
            sb.append(")");
            zzhzVar.zza(sb.toString(), null, new Object[0]);
        }
    }
}
