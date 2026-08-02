package com.google.android.gms.internal.firebase_database;

import java.util.Map;

/* loaded from: classes.dex */
final class zzap implements zzau {
    private final /* synthetic */ zzal zzdu;
    private final /* synthetic */ boolean zzdy;

    zzap(zzal zzalVar, boolean z) {
        this.zzdu = zzalVar;
        this.zzdy = z;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzau
    public final void zzd(Map<String, Object> map) {
        zzak zzakVar;
        zzz zzzVar;
        int i;
        zzbm zzbmVar;
        zzak zzakVar2;
        this.zzdu.zzdc = zzav.Connected;
        String str = (String) map.get("s");
        if (str.equals("ok")) {
            zzal.zza(this.zzdu, 0);
            zzakVar2 = this.zzdu.zzcw;
            zzakVar2.zzb(true);
            if (this.zzdy) {
                this.zzdu.zzaf();
                return;
            }
            return;
        }
        zzal.zza(this.zzdu, (String) null);
        zzal.zza(this.zzdu, true);
        zzakVar = this.zzdu.zzcw;
        zzakVar.zzb(false);
        String str2 = (String) map.get("d");
        zzhz zzhzVar = this.zzdu.zzbs;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(str2).length());
        sb.append("Authentication failed: ");
        sb.append(str);
        sb.append(" (");
        sb.append(str2);
        sb.append(")");
        zzhzVar.zza(sb.toString(), null, new Object[0]);
        zzzVar = this.zzdu.zzdb;
        zzzVar.close();
        if (str.equals("invalid_token")) {
            zzal.zzj(this.zzdu);
            i = this.zzdu.zzdp;
            if (i >= 3) {
                zzbmVar = this.zzdu.zzdm;
                zzbmVar.zzay();
                this.zzdu.zzbs.zzb("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.", null);
            }
        }
    }
}
