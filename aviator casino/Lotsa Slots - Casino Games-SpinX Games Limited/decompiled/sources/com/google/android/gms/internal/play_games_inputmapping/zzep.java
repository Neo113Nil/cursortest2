package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class zzep extends com.google.android.gms.internal.play_games_inputmapping.zzeb {
    private static final java.util.logging.Logger zzb = java.util.logging.Logger.getLogger(com.google.android.gms.internal.play_games_inputmapping.zzep.class.getName());
    private static final boolean zzc = com.google.android.gms.internal.play_games_inputmapping.zzhn.zza();
    com.google.android.gms.internal.play_games_inputmapping.zzeq zza;

    private zzep() {
    }

    /* synthetic */ zzep(byte[] bArr) {
    }

    public static int zzA(com.google.android.gms.internal.play_games_inputmapping.zzek zzekVar) {
        int zzc2 = zzekVar.zzc();
        return zzw(zzc2) + zzc2;
    }

    static int zzB(com.google.android.gms.internal.play_games_inputmapping.zzge zzgeVar, com.google.android.gms.internal.play_games_inputmapping.zzgp zzgpVar) {
        com.google.android.gms.internal.play_games_inputmapping.zzdy zzdyVar = (com.google.android.gms.internal.play_games_inputmapping.zzdy) zzgeVar;
        int zzh = zzdyVar.zzh();
        if (zzh == -1) {
            zzh = zzgpVar.zzd(zzdyVar);
            zzdyVar.zzi(zzh);
        }
        return zzw(zzh) + zzh;
    }

    @java.lang.Deprecated
    static int zzE(int i, com.google.android.gms.internal.play_games_inputmapping.zzge zzgeVar, com.google.android.gms.internal.play_games_inputmapping.zzgp zzgpVar) {
        int zzw = zzw(i << 3);
        int i2 = zzw + zzw;
        com.google.android.gms.internal.play_games_inputmapping.zzdy zzdyVar = (com.google.android.gms.internal.play_games_inputmapping.zzdy) zzgeVar;
        int zzh = zzdyVar.zzh();
        if (zzh == -1) {
            zzh = zzgpVar.zzd(zzdyVar);
            zzdyVar.zzi(zzh);
        }
        return i2 + zzh;
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzep zzt(byte[] bArr) {
        return new com.google.android.gms.internal.play_games_inputmapping.zzen(bArr, 0, bArr.length);
    }

    public static int zzu(int i) {
        return zzw(i << 3);
    }

    public static int zzv(int i) {
        if (i >= 0) {
            return zzw(i);
        }
        return 10;
    }

    public static int zzw(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzx(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int zzy(java.lang.String str) {
        int length;
        try {
            length = com.google.android.gms.internal.play_games_inputmapping.zzhr.zzc(str);
        } catch (com.google.android.gms.internal.play_games_inputmapping.zzhq unused) {
            length = str.getBytes(com.google.android.gms.internal.play_games_inputmapping.zzfi.zzb).length;
        }
        return zzw(length) + length;
    }

    public static int zzz(com.google.android.gms.internal.play_games_inputmapping.zzfn zzfnVar) {
        int zza = zzfnVar.zza();
        return zzw(zza) + zza;
    }

    public final void zzC() {
        if (zzs() != 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzD(java.lang.String str, com.google.android.gms.internal.play_games_inputmapping.zzhq zzhqVar) throws java.io.IOException {
        zzb.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) zzhqVar);
        byte[] bytes = str.getBytes(com.google.android.gms.internal.play_games_inputmapping.zzfi.zzb);
        try {
            int length = bytes.length;
            zzl(length);
            zzq(bytes, 0, length);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.play_games_inputmapping.zzeo(e);
        }
    }

    public abstract void zza(int i, int i2) throws java.io.IOException;

    public abstract void zzb(int i, int i2) throws java.io.IOException;

    public abstract void zzc(int i, int i2) throws java.io.IOException;

    public abstract void zzd(int i, int i2) throws java.io.IOException;

    public abstract void zze(int i, long j) throws java.io.IOException;

    public abstract void zzf(int i, long j) throws java.io.IOException;

    public abstract void zzg(int i, boolean z) throws java.io.IOException;

    public abstract void zzh(int i, java.lang.String str) throws java.io.IOException;

    public abstract void zzi(int i, com.google.android.gms.internal.play_games_inputmapping.zzek zzekVar) throws java.io.IOException;

    public abstract void zzj(byte b) throws java.io.IOException;

    public abstract void zzk(int i) throws java.io.IOException;

    public abstract void zzl(int i) throws java.io.IOException;

    public abstract void zzm(int i) throws java.io.IOException;

    public abstract void zzn(long j) throws java.io.IOException;

    public abstract void zzo(long j) throws java.io.IOException;

    public abstract void zzq(byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract int zzs();
}
