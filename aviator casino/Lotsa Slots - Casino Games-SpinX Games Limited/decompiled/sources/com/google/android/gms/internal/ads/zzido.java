package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzido {
    static final com.google.android.gms.internal.ads.zzido zza = new com.google.android.gms.internal.ads.zzido(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile com.google.android.gms.internal.ads.zzido zzd;
    private final java.util.Map zze;

    zzido() {
        this.zze = new java.util.HashMap();
    }

    public static com.google.android.gms.internal.ads.zzido zza() {
        int i = com.google.android.gms.internal.ads.zzicn.zza;
        return zza;
    }

    public static com.google.android.gms.internal.ads.zzido zzb() {
        com.google.android.gms.internal.ads.zzido zzidoVar = zzd;
        if (zzidoVar != null) {
            return zzidoVar;
        }
        synchronized (com.google.android.gms.internal.ads.zzido.class) {
            com.google.android.gms.internal.ads.zzido zzidoVar2 = zzd;
            if (zzidoVar2 != null) {
                return zzidoVar2;
            }
            int i = com.google.android.gms.internal.ads.zzicn.zza;
            com.google.android.gms.internal.ads.zzido zzb2 = com.google.android.gms.internal.ads.zzidw.zzb(com.google.android.gms.internal.ads.zzido.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final com.google.android.gms.internal.ads.zziec zzc(com.google.android.gms.internal.ads.zzifp zzifpVar, int i) {
        return (com.google.android.gms.internal.ads.zziec) this.zze.get(new com.google.android.gms.internal.ads.zzidn(zzifpVar, i));
    }

    zzido(boolean z) {
        this.zze = java.util.Collections.emptyMap();
    }
}
