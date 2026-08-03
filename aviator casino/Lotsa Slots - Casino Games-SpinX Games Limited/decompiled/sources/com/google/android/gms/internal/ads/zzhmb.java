package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhmb {
    private java.util.HashMap zza = new java.util.HashMap();

    public final com.google.android.gms.internal.ads.zzhmc zza() {
        if (this.zza == null) {
            throw new java.lang.IllegalStateException("cannot call build() twice");
        }
        com.google.android.gms.internal.ads.zzhmc zzhmcVar = new com.google.android.gms.internal.ads.zzhmc(java.util.Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzhmcVar;
    }
}
