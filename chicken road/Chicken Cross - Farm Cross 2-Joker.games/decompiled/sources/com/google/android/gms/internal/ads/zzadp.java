package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzadp extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzado zzd;
    private boolean zze;

    /* synthetic */ zzadp(zzado zzadoVar, SurfaceTexture surfaceTexture, boolean z, byte[] bArr) {
        super(surfaceTexture);
        this.zzd = zzadoVar;
        this.zza = z;
    }

    public static synchronized boolean zza(Context context) {
        int i;
        int i2;
        synchronized (zzadp.class) {
            if (!zzc) {
                try {
                } catch (zzdx e) {
                    String message = e.getMessage();
                    String.valueOf(message);
                    zzeh.zze("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(message)));
                }
                if (zzdy.zza(context)) {
                    i = zzdy.zzb() ? 1 : 2;
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

    public static zzadp zzb(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zza(context)) {
            z2 = false;
        }
        zzguk.zzi(z2);
        return new zzado().zza(z ? zzb : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzado zzadoVar = this.zzd;
        synchronized (zzadoVar) {
            if (!this.zze) {
                zzadoVar.zzb();
                this.zze = true;
            }
        }
    }
}
