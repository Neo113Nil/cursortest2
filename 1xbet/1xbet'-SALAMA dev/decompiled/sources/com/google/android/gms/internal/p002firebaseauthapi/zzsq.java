package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzsq extends zzajy<zzsq, zza> implements zzale {
    private static final zzsq zzc;
    private static volatile zzalp<zzsq> zzd;
    private int zze;
    private zzst zzf;
    private int zzg;

    public static final class zza extends zzajy.zza<zzsq, zza> implements zzale {
        public final zza zza(int i7) {
            zzh();
            ((zzsq) this.zza).zzg = i7;
            return this;
        }

        private zza() {
            super(zzsq.zzc);
        }

        public final zza zza(zzst zzstVar) {
            zzh();
            zzsq.zza((zzsq) this.zza, zzstVar);
            return this;
        }
    }

    static {
        zzsq zzsqVar = new zzsq();
        zzc = zzsqVar;
        zzajy.zza((Class<zzsq>) zzsq.class, zzsqVar);
    }

    private zzsq() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzst zzd() {
        zzst zzstVar = this.zzf;
        return zzstVar == null ? zzst.zzd() : zzstVar;
    }

    public static zzsq zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzsq) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzss.zza[i7 - 1]) {
            case 1:
                return new zzsq();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzsq> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzsq.class) {
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

    public static /* synthetic */ void zza(zzsq zzsqVar, zzst zzstVar) {
        zzstVar.getClass();
        zzsqVar.zzf = zzstVar;
        zzsqVar.zze |= 1;
    }
}
