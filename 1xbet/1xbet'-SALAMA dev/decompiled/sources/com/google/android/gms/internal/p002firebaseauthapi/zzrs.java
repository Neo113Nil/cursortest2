package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzrs extends zzajy<zzrs, zza> implements zzale {
    private static final zzrs zzc;
    private static volatile zzalp<zzrs> zzd;
    private int zze;
    private int zzf;
    private zzrv zzg;

    public static final class zza extends zzajy.zza<zzrs, zza> implements zzale {
        public final zza zza(int i7) {
            zzh();
            ((zzrs) this.zza).zzf = i7;
            return this;
        }

        private zza() {
            super(zzrs.zzc);
        }

        public final zza zza(zzrv zzrvVar) {
            zzh();
            zzrs.zza((zzrs) this.zza, zzrvVar);
            return this;
        }
    }

    static {
        zzrs zzrsVar = new zzrs();
        zzc = zzrsVar;
        zzajy.zza((Class<zzrs>) zzrs.class, zzrsVar);
    }

    private zzrs() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzrv zzd() {
        zzrv zzrvVar = this.zzg;
        return zzrvVar == null ? zzrv.zzd() : zzrvVar;
    }

    public static zzrs zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzrs) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzru.zza[i7 - 1]) {
            case 1:
                return new zzrs();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzrs> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzrs.class) {
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

    public static /* synthetic */ void zza(zzrs zzrsVar, zzrv zzrvVar) {
        zzrvVar.getClass();
        zzrsVar.zzg = zzrvVar;
        zzrsVar.zze |= 1;
    }
}
