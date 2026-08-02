package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class zzbf implements zzcb {
    private final InputStream zza;

    private zzbf(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzcb zza(byte[] bArr) {
        return new zzbf(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final zzwa zzb() {
        try {
            return zzwa.zza(this.zza, zzajk.zza());
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final zzuo zza() {
        try {
            return zzuo.zza(this.zza, zzajk.zza());
        } finally {
            this.zza.close();
        }
    }
}
