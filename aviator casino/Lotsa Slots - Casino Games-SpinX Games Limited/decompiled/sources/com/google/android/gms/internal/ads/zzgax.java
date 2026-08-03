package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgax extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzgax zzb;
    private static volatile com.google.android.gms.internal.ads.zzifx zzc;
    private com.google.android.gms.internal.ads.zzifj zza = com.google.android.gms.internal.ads.zzifj.zza();

    static {
        com.google.android.gms.internal.ads.zzgax zzgaxVar = new com.google.android.gms.internal.ads.zzgax();
        zzb = zzgaxVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzgax.class, zzgaxVar);
    }

    private zzgax() {
    }

    public static com.google.android.gms.internal.ads.zzgax zzc(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.android.gms.internal.ads.zzgax) com.google.android.gms.internal.ads.zziee.zzbW(zzb, inputStream);
    }

    public static com.google.android.gms.internal.ads.zzgax zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zza.size();
    }

    public final java.util.Map zzb() {
        return java.util.Collections.unmodifiableMap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"zza", com.google.android.gms.internal.ads.zzgaw.zza});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzgax();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzgav(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzc;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgax.class) {
                zzifxVar = zzc;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzb);
                    zzc = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ java.util.Map zze() {
        if (!this.zza.zze()) {
            this.zza = this.zza.zzc();
        }
        return this.zza;
    }
}
