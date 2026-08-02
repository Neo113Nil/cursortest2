package com.google.android.gms.internal.firebase_database;

import java.util.Map;

/* loaded from: classes.dex */
final class zzao implements zzau {
    private final /* synthetic */ zzbb zzdx;

    zzao(zzal zzalVar, zzbb zzbbVar) {
        this.zzdx = zzbbVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzau
    public final void zzd(Map<String, Object> map) {
        String str = (String) map.get("s");
        String str2 = null;
        if (str.equals("ok")) {
            str = null;
        } else {
            str2 = (String) map.get("d");
        }
        zzbb zzbbVar = this.zzdx;
        if (zzbbVar != null) {
            zzbbVar.zzb(str, str2);
        }
    }
}
