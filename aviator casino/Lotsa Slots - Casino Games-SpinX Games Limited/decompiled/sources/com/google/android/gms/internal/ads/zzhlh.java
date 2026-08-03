package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhlh {
    final java.util.Map zza = new java.util.HashMap();
    final java.util.Map zzb = new java.util.HashMap();

    private zzhlh() {
    }

    public final com.google.android.gms.internal.ads.zzhlh zza(java.lang.Enum r2, java.lang.Object obj) {
        this.zza.put(r2, obj);
        this.zzb.put(obj, r2);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhli zzb() {
        return new com.google.android.gms.internal.ads.zzhli(java.util.Collections.unmodifiableMap(this.zza), java.util.Collections.unmodifiableMap(this.zzb), null);
    }

    /* synthetic */ zzhlh(byte[] bArr) {
    }
}
