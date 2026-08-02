package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes.dex */
public final class zzaah extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzaaf zzd;
    private boolean zze;

    public /* synthetic */ zzaah(zzaaf zzaafVar, SurfaceTexture surfaceTexture, boolean z4, zzaag zzaagVar) {
        super(surfaceTexture);
        this.zzd = zzaafVar;
        this.zza = z4;
    }

    public static zzaah zza(Context context, boolean z4) {
        boolean z7 = true;
        if (z4 && !zzb(context)) {
            z7 = false;
        }
        zzcv.zzf(z7);
        return new zzaaf().zza(z4 ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        int i7;
        synchronized (zzaah.class) {
            try {
                if (!zzc) {
                    zzb = zzdh.zzb(context) ? zzdh.zzc() ? 1 : 2 : 0;
                    zzc = true;
                }
                i7 = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i7 != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            try {
                if (!this.zze) {
                    this.zzd.zzb();
                    this.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
