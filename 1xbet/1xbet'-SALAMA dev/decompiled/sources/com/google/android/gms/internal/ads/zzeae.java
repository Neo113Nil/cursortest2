package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
final class zzeae implements zzgay {
    final /* synthetic */ zzfei zza;

    public zzeae(zzeaf zzeafVar, zzfei zzfeiVar) {
        this.zza = zzfeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        String strValueOf = String.valueOf(th.getMessage());
        int i7 = J.f3546b;
        j.d("Failed to get offline buffered ping database: ".concat(strValueOf));
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e7) {
            String strValueOf = String.valueOf(e7.getMessage());
            int i7 = J.f3546b;
            j.d("Error executing function on offline buffered ping database: ".concat(strValueOf));
        }
    }
}
