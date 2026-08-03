package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzddj extends com.google.android.gms.internal.ads.zzdip {
    private boolean zzb;

    public zzddj(java.util.Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzs(com.google.android.gms.internal.ads.zzddi.zza);
        this.zzb = true;
    }
}
