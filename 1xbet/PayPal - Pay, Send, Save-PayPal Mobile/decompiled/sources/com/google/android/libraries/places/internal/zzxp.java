package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzxp extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzxp zzN;
    private static volatile com.google.android.libraries.places.internal.zzbff zzO;
    private com.google.android.libraries.places.internal.zzag zzA;
    private com.google.android.libraries.places.internal.zzcr zzB;
    private com.google.android.libraries.places.internal.zzbj zzC;
    private com.google.android.libraries.places.internal.zzahy zzD;
    private com.google.android.libraries.places.internal.zzca zzE;
    private com.google.android.libraries.places.internal.zzch zzF;
    private com.google.android.libraries.places.internal.zzash zzG;
    private com.google.android.libraries.places.internal.zzacv zzH;
    private com.google.android.libraries.places.internal.zzary zzI;
    private com.google.android.libraries.places.internal.zzaru zzJ;
    private com.google.android.libraries.places.internal.zzar zzK;
    private com.google.android.libraries.places.internal.zzxr zzL;
    private int zzb;
    private int zze;
    private com.google.android.libraries.places.internal.zzaoj zzg;
    private com.google.android.libraries.places.internal.zzaae zzh;
    private com.google.android.libraries.places.internal.zzasj zzi;
    private com.google.android.libraries.places.internal.zzakb zzj;
    private com.google.android.libraries.places.internal.zzafl zzk;
    private com.google.android.libraries.places.internal.zzbs zzl;
    private com.google.android.libraries.places.internal.zzzz zzm;
    private com.google.android.libraries.places.internal.zzzh zzn;
    private com.google.android.libraries.places.internal.zzact zzo;
    private com.google.android.libraries.places.internal.zzahh zzp;
    private com.google.android.libraries.places.internal.zzaib zzq;
    private com.google.android.libraries.places.internal.zzaid zzr;
    private com.google.android.libraries.places.internal.zzyi zzs;
    private com.google.android.libraries.places.internal.zzadn zzt;
    private com.google.android.libraries.places.internal.zzf zzu;
    private com.google.android.libraries.places.internal.zzan zzv;
    private com.google.android.libraries.places.internal.zzax zzw;
    private com.google.android.libraries.places.internal.zzdf zzx;
    private com.google.android.libraries.places.internal.zzaz zzy;
    private com.google.android.libraries.places.internal.zzbe zzz;
    private byte zzM = 2;
    private int zzf = 1;

    static {
        com.google.android.libraries.places.internal.zzxp zzxpVar = new com.google.android.libraries.places.internal.zzxp();
        zzN = zzxpVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzxp.class, zzxpVar);
    }

    private zzxp() {
    }

    public static com.google.android.libraries.places.internal.zzxn zza() {
        return (com.google.android.libraries.places.internal.zzxn) zzN.zzbv();
    }

    final /* synthetic */ void zzc(com.google.android.libraries.places.internal.zzaoj zzaojVar) {
        this.zzg = zzaojVar;
        this.zzb |= 2;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.zzM);
        }
        if (i2 == 2) {
            return zzbA(zzN, "\u0001!\u0000\u0002\u0001\"!\u0000\u0000\u0002\u0001᠌\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000fဉ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဉ\u0011\u0014ဉ\u0012\u0015ဉ\u0013\u0016ဉ\u0014\u0017ဉ\u0015\u0018ဉ\u0016\u0019ဉ\u0017\u001aဉ\u0018\u001bဉ\u0019\u001cဉ\u001a\u001dဉ\u001b\u001eဉ\u001c\u001fဉ\u001d ဉ\u001e!ဉ\u001f\"ဉ ", new java.lang.Object[]{"zzb", "zze", "zzf", com.google.android.libraries.places.internal.zzxo.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzxp();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzxn(bArr);
        }
        if (i2 == 5) {
            return zzN;
        }
        if (i2 != 6) {
            this.zzM = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzO;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzxp.class) {
            zzbffVar = zzO;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzN);
                zzO = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zzf = 1;
        this.zzb = 1 | this.zzb;
    }
}
