package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzsz extends zzajy<zzsz, zza> implements zzale {
    private static final zzsz zzc;
    private static volatile zzalp<zzsz> zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzajy.zza<zzsz, zza> implements zzale {
        public final zza zza(int i7) {
            zzh();
            ((zzsz) this.zza).zze = i7;
            return this;
        }

        private zza() {
            super(zzsz.zzc);
        }
    }

    static {
        zzsz zzszVar = new zzsz();
        zzc = zzszVar;
        zzajy.zza((Class<zzsz>) zzsz.class, zzszVar);
    }

    private zzsz() {
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public static zzsz zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzsz) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zztb.zza[i7 - 1]) {
            case 1:
                return new zzsz();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzsz> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzsz.class) {
                        try {
                            zzcVar = zzd;
                            if (zzcVar == null) {
                                zzcVar = new zzajy.zzc<>(zzc);
                                zzd = zzcVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return zzcVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
