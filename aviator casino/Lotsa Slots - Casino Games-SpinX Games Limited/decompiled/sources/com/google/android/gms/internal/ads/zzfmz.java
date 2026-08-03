package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfmz implements com.google.android.gms.internal.ads.zzfmx {
    private final java.lang.String zza;

    public zzfmz(java.lang.String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfmx
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.zzfmz) {
            return this.zza.equals(((com.google.android.gms.internal.ads.zzfmz) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfmx
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final java.lang.String toString() {
        return this.zza;
    }
}
