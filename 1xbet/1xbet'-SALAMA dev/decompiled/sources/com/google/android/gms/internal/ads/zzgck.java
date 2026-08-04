package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class zzgck {
    private final OutputStream zza;

    private zzgck(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgck zzb(OutputStream outputStream) {
        return new zzgck(outputStream);
    }

    public final void zza(zzgsm zzgsmVar) throws IOException {
        try {
            zzgsmVar.zzaU(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
