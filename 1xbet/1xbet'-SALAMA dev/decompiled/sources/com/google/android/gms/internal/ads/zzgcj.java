package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class zzgcj {
    private final InputStream zza;

    private zzgcj(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzgcj zzb(byte[] bArr) {
        return new zzgcj(new ByteArrayInputStream(bArr));
    }

    public final zzgsm zza() throws IOException {
        try {
            return zzgsm.zzg(this.zza, zzgwq.zza());
        } finally {
            this.zza.close();
        }
    }
}
