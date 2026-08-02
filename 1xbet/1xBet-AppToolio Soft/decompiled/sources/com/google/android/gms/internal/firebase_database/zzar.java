package com.google.android.gms.internal.firebase_database;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzar implements zzau {
    private final /* synthetic */ zzal zzdu;
    private final /* synthetic */ zzay zzeb;

    zzar(zzal zzalVar, zzay zzayVar) {
        this.zzdu = zzalVar;
        this.zzeb = zzayVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzau
    public final void zzd(Map<String, Object> map) {
        Map map2;
        zzbb zzbbVar;
        zzbb zzbbVar2;
        zzaw zzawVar;
        String str = (String) map.get("s");
        if (str.equals("ok")) {
            Map map3 = (Map) map.get("d");
            if (map3.containsKey("w")) {
                List list = (List) map3.get("w");
                zzal zzalVar = this.zzdu;
                zzawVar = this.zzeb.zzen;
                zzalVar.zza((List<String>) list, zzawVar);
            }
        }
        map2 = this.zzdu.zzdi;
        if (((zzay) map2.get(this.zzeb.zzaj())) == this.zzeb) {
            if (str.equals("ok")) {
                zzbbVar = this.zzeb.zzem;
                zzbbVar.zzb(null, null);
            } else {
                this.zzdu.zza(this.zzeb.zzaj());
                String str2 = (String) map.get("d");
                zzbbVar2 = this.zzeb.zzem;
                zzbbVar2.zzb(str, str2);
            }
        }
    }
}
