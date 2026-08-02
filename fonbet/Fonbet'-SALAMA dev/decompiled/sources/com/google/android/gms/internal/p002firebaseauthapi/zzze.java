package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public final class zzze {
    private final zzzc zza;

    private zzze(zzzc zzzcVar) {
        this.zza = zzzcVar;
    }

    public final int zza() {
        return this.zza.zza();
    }

    public static zzze zza(byte[] bArr, zzcn zzcnVar) {
        if (zzcnVar != null) {
            return new zzze(zzzc.zza(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public static zzze zza(int i7) {
        return new zzze(zzzc.zza(zzpe.zza(i7)));
    }

    public final byte[] zza(zzcn zzcnVar) {
        if (zzcnVar != null) {
            return this.zza.zzb();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
