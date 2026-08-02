package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
final class zzan implements zzae {
    private final /* synthetic */ long zzdv;
    private final /* synthetic */ zzam zzdw;

    zzan(zzam zzamVar, long j) {
        this.zzdw = zzamVar;
        this.zzdv = j;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzae
    public final void onError(String str) {
        if (this.zzdv != this.zzdw.zzdu.zzdo) {
            this.zzdw.zzdu.zzbs.zza("Ignoring getToken error, because this was not the latest attempt.", null, new Object[0]);
            return;
        }
        this.zzdw.zzdu.zzdc = zzav.Disconnected;
        zzhz zzhzVar = this.zzdw.zzdu.zzbs;
        String valueOf = String.valueOf(str);
        zzhzVar.zza(valueOf.length() != 0 ? "Error fetching token: ".concat(valueOf) : new String("Error fetching token: "), null, new Object[0]);
        this.zzdw.zzdu.zzae();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzae
    public final void zzf(String str) {
        if (this.zzdv != this.zzdw.zzdu.zzdo) {
            this.zzdw.zzdu.zzbs.zza("Ignoring getToken result, because this was not the latest attempt.", null, new Object[0]);
        } else if (this.zzdw.zzdu.zzdc == zzav.GettingToken) {
            this.zzdw.zzdu.zzbs.zza("Successfully fetched token, opening connection", null, new Object[0]);
            this.zzdw.zzdu.zzi(str);
        } else {
            zzag.zza(this.zzdw.zzdu.zzdc == zzav.Disconnected, "Expected connection state disconnected, but was %s", this.zzdw.zzdu.zzdc);
            this.zzdw.zzdu.zzbs.zza("Not opening connection after token refresh, because connection was set to disconnected", null, new Object[0]);
        }
    }
}
