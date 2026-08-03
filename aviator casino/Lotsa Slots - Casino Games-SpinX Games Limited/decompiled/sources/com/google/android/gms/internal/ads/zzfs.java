package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfs {
    private boolean zza;

    public zzfs(android.content.Context context, android.os.Looper looper, com.google.android.gms.internal.ads.zzdo zzdoVar) {
        context.getApplicationContext();
        zzdoVar.zzd(looper, null);
        zzdoVar.zzd(android.os.Looper.getMainLooper(), null);
    }

    public final void zza(boolean z) {
        if (this.zza == z) {
            return;
        }
        this.zza = z;
    }
}
