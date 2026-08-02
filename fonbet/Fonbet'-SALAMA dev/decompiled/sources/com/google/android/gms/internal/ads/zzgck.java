package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class zzgck {
    private final OutputStream zza;

    private zzgck(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgck zzb(OutputStream outputStream) {
        return new zzgck(outputStream);
    }

    public final void zza(zzgsm zzgsmVar) {
        try {
            zzgsmVar.zzaU(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
