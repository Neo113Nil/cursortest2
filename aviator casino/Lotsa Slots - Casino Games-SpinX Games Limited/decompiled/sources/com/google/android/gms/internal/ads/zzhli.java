package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhli {
    private final java.util.Map zza;
    private final java.util.Map zzb;

    /* synthetic */ zzhli(java.util.Map map, java.util.Map map2, byte[] bArr) {
        this.zza = map;
        this.zzb = map2;
    }

    public static com.google.android.gms.internal.ads.zzhlh zza() {
        return new com.google.android.gms.internal.ads.zzhlh(null);
    }

    public final java.lang.Enum zzb(java.lang.Object obj) throws java.security.GeneralSecurityException {
        java.lang.Enum r0 = (java.lang.Enum) this.zzb.get(obj);
        if (r0 != null) {
            return r0;
        }
        java.lang.String valueOf = java.lang.String.valueOf(obj);
        java.lang.String.valueOf(valueOf);
        throw new java.security.GeneralSecurityException("Unable to convert object enum: ".concat(java.lang.String.valueOf(valueOf)));
    }

    public final java.lang.Object zzc(java.lang.Enum r3) throws java.security.GeneralSecurityException {
        java.lang.Object obj = this.zza.get(r3);
        if (obj != null) {
            return obj;
        }
        java.lang.String valueOf = java.lang.String.valueOf(r3);
        java.lang.String.valueOf(valueOf);
        throw new java.security.GeneralSecurityException("Unable to convert proto enum: ".concat(java.lang.String.valueOf(valueOf)));
    }
}
