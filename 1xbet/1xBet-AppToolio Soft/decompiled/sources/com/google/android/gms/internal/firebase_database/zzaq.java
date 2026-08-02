package com.google.android.gms.internal.firebase_database;

import java.util.Map;

/* loaded from: classes.dex */
final class zzaq implements zzau {
    private final /* synthetic */ String val$action;
    private final /* synthetic */ zzal zzdu;
    private final /* synthetic */ zzbb zzdx;
    private final /* synthetic */ long zzdz;
    private final /* synthetic */ zzaz zzea;

    zzaq(zzal zzalVar, String str, long j, zzaz zzazVar, zzbb zzbbVar) {
        this.zzdu = zzalVar;
        this.val$action = str;
        this.zzdz = j;
        this.zzea = zzazVar;
        this.zzdx = zzbbVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzau
    public final void zzd(Map<String, Object> map) {
        Map map2;
        Map map3;
        if (this.zzdu.zzbs.zzfa()) {
            zzhz zzhzVar = this.zzdu.zzbs;
            String str = this.val$action;
            String valueOf = String.valueOf(map);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(" response: ");
            sb.append(valueOf);
            zzhzVar.zza(sb.toString(), null, new Object[0]);
        }
        map2 = this.zzdu.zzdh;
        if (((zzaz) map2.get(Long.valueOf(this.zzdz))) == this.zzea) {
            map3 = this.zzdu.zzdh;
            map3.remove(Long.valueOf(this.zzdz));
            if (this.zzdx != null) {
                String str2 = (String) map.get("s");
                if (str2.equals("ok")) {
                    this.zzdx.zzb(null, null);
                } else {
                    this.zzdx.zzb(str2, (String) map.get("d"));
                }
            }
        } else if (this.zzdu.zzbs.zzfa()) {
            zzhz zzhzVar2 = this.zzdu.zzbs;
            long j = this.zzdz;
            StringBuilder sb2 = new StringBuilder(81);
            sb2.append("Ignoring on complete for put ");
            sb2.append(j);
            sb2.append(" because it was removed already.");
            zzhzVar2.zza(sb2.toString(), null, new Object[0]);
        }
        this.zzdu.zzag();
    }
}
