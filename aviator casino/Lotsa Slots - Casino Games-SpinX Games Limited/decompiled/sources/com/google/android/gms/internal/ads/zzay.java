package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzay {
    private final com.google.android.gms.internal.ads.zzs zza;

    public zzay(com.google.android.gms.internal.ads.zzs zzsVar) {
        this.zza = zzsVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzay) {
            return this.zza.equals(((com.google.android.gms.internal.ads.zzay) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }
}
