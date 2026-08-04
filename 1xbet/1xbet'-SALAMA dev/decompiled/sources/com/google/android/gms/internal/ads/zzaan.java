package com.google.android.gms.internal.ads;

import io.sentry.protocol.OperatingSystem;

/* JADX INFO: loaded from: classes.dex */
final class zzaan implements zzbz {
    public static final /* synthetic */ int zza = 0;

    static {
        zzfud.zza(new zzftz() { // from class: com.google.android.gms.internal.ads.zzaam
            @Override // com.google.android.gms.internal.ads.zzftz
            public final Object zza() {
                int i7 = zzaan.zza;
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object objInvoke = cls.getMethod(OperatingSystem.JsonKeys.BUILD, null).invoke(cls.getConstructor(null).newInstance(null), null);
                    if (objInvoke != null) {
                        return (zzbz) objInvoke;
                    }
                    throw null;
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
                }
            }
        });
    }

    private zzaan() {
        throw null;
    }

    public /* synthetic */ zzaan(zzaap zzaapVar) {
    }
}
