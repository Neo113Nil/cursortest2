package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzq extends android.os.AsyncTask {
    final /* synthetic */ com.google.android.gms.ads.internal.zzs zza;

    /* synthetic */ zzq(com.google.android.gms.ads.internal.zzs zzsVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzsVar);
        this.zza = zzsVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] objArr) {
        return this.zza.zzN();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(java.lang.Object obj) {
        com.google.android.gms.ads.internal.zzs zzsVar = this.zza;
        java.lang.String str = (java.lang.String) obj;
        if (zzsVar.zzW() == null || str == null) {
            return;
        }
        zzsVar.zzW().loadUrl(str);
    }
}
