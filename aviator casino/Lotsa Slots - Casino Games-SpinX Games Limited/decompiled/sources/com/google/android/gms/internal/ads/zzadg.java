package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzadg extends android.view.Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final com.google.android.gms.internal.ads.zzadf zzd;
    private boolean zze;

    /* synthetic */ zzadg(com.google.android.gms.internal.ads.zzadf zzadfVar, android.graphics.SurfaceTexture surfaceTexture, boolean z, byte[] bArr) {
        super(surfaceTexture);
        this.zzd = zzadfVar;
        this.zza = z;
    }

    public static synchronized boolean zza(android.content.Context context) {
        int i;
        int i2;
        synchronized (com.google.android.gms.internal.ads.zzadg.class) {
            if (!zzc) {
                try {
                } catch (com.google.android.gms.internal.ads.zzdw e) {
                    java.lang.String message = e.getMessage();
                    java.lang.String.valueOf(message);
                    com.google.android.gms.internal.ads.zzeg.zze("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(java.lang.String.valueOf(message)));
                }
                if (com.google.android.gms.internal.ads.zzdx.zza(context)) {
                    i = com.google.android.gms.internal.ads.zzdx.zzb() ? 1 : 2;
                    zzb = i;
                    zzc = true;
                }
                i = 0;
                zzb = i;
                zzc = true;
            }
            i2 = zzb;
        }
        return i2 != 0;
    }

    public static com.google.android.gms.internal.ads.zzadg zzb(android.content.Context context, boolean z) {
        boolean z2 = true;
        if (z && !zza(context)) {
            z2 = false;
        }
        com.google.android.gms.internal.ads.zzgtj.zzi(z2);
        return new com.google.android.gms.internal.ads.zzadf().zza(z ? zzb : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        com.google.android.gms.internal.ads.zzadf zzadfVar = this.zzd;
        synchronized (zzadfVar) {
            if (!this.zze) {
                zzadfVar.zzb();
                this.zze = true;
            }
        }
    }
}
