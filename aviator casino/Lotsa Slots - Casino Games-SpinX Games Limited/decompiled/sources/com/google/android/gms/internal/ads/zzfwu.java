package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzfwu extends android.os.AsyncTask {
    private com.google.android.gms.internal.ads.zzfwv zza;
    protected final com.google.android.gms.internal.ads.zzfwm zzd;

    public zzfwu(com.google.android.gms.internal.ads.zzfwm zzfwmVar) {
        this.zzd = zzfwmVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(java.lang.String str) {
        com.google.android.gms.internal.ads.zzfwv zzfwvVar = this.zza;
        if (zzfwvVar != null) {
            zzfwvVar.zzb(this);
        }
    }

    public final void zzb(com.google.android.gms.internal.ads.zzfwv zzfwvVar) {
        this.zza = zzfwvVar;
    }
}
