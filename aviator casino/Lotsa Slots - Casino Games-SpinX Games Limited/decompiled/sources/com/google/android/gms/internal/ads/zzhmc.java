package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhmc implements com.google.android.gms.internal.ads.zzhdj {
    private final java.util.Map zza;

    static {
        new com.google.android.gms.internal.ads.zzhmb().zza();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.zzhmc) {
            return this.zza.equals(((com.google.android.gms.internal.ads.zzhmc) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final java.lang.String toString() {
        return this.zza.toString();
    }

    public final boolean zza() {
        return this.zza.isEmpty();
    }
}
