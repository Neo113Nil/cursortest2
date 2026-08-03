package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzih {
    private final java.util.Map zza = new java.util.HashMap();
    private java.util.Map zzb;

    public final synchronized java.util.Map zza() {
        if (this.zzb == null) {
            this.zzb = java.util.Collections.unmodifiableMap(new java.util.HashMap(this.zza));
        }
        return this.zzb;
    }
}
