package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaui implements com.google.android.gms.internal.ads.zzatz {
    final /* synthetic */ android.content.Context zza;
    private java.io.File zzb = null;

    zzaui(android.content.Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final java.io.File zza() {
        if (this.zzb == null) {
            this.zzb = new java.io.File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
