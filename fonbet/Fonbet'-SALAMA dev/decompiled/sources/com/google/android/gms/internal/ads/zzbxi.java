package com.google.android.gms.internal.ads;

import E2.o;
import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zzbxi implements zzaxx {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzbxi(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final String zza() {
        return this.zzc;
    }

    public final void zzb(boolean z4) {
        o oVar = o.f1952C;
        if (oVar.f1978y.zzp(this.zza)) {
            synchronized (this.zzb) {
                try {
                    if (this.zzd == z4) {
                        return;
                    }
                    this.zzd = z4;
                    if (TextUtils.isEmpty(this.zzc)) {
                        return;
                    }
                    if (this.zzd) {
                        oVar.f1978y.zzf(this.zza, this.zzc);
                    } else {
                        oVar.f1978y.zzg(this.zza, this.zzc);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    public final void zzdn(zzaxw zzaxwVar) {
        zzb(zzaxwVar.zzj);
    }
}
