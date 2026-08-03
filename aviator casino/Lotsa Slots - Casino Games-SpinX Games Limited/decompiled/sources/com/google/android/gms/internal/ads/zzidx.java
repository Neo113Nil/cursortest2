package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzidx implements com.google.android.gms.internal.ads.zzifn {
    private static final com.google.android.gms.internal.ads.zzidx zza = new com.google.android.gms.internal.ads.zzidx();

    private zzidx() {
    }

    public static com.google.android.gms.internal.ads.zzidx zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifn
    public final boolean zzb(java.lang.Class cls) {
        return com.google.android.gms.internal.ads.zziee.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzifn
    public final com.google.android.gms.internal.ads.zzifm zzc(java.lang.Class cls) {
        if (!com.google.android.gms.internal.ads.zziee.class.isAssignableFrom(cls)) {
            java.lang.String name = cls.getName();
            java.lang.String.valueOf(name);
            throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(java.lang.String.valueOf(name)));
        }
        try {
            return (com.google.android.gms.internal.ads.zzifm) com.google.android.gms.internal.ads.zziee.zzbt(cls.asSubclass(com.google.android.gms.internal.ads.zziee.class)).zzbs();
        } catch (java.lang.Exception e) {
            java.lang.String name2 = cls.getName();
            java.lang.String.valueOf(name2);
            throw new java.lang.RuntimeException("Unable to get message info for ".concat(java.lang.String.valueOf(name2)), e);
        }
    }
}
