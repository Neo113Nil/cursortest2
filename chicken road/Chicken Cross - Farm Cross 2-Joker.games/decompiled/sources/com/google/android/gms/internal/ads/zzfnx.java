package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfnx implements zzfnv {
    private final String zza;

    public zzfnx(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final boolean equals(Object obj) {
        if (obj instanceof zzfnx) {
            return this.zza.equals(((zzfnx) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
