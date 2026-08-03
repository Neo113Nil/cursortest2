package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzr {
    private final android.util.SparseBooleanArray zza = new android.util.SparseBooleanArray();
    private boolean zzb;

    public final com.google.android.gms.internal.ads.zzr zza(int i) {
        com.google.android.gms.internal.ads.zzgtj.zzi(!this.zzb);
        this.zza.append(i, true);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzs zzb() {
        com.google.android.gms.internal.ads.zzgtj.zzi(!this.zzb);
        this.zzb = true;
        return new com.google.android.gms.internal.ads.zzs(this.zza, null);
    }
}
