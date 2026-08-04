package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzsh extends zzajy<zzsh, zza> implements zzale {
    private static final zzsh zzc;
    private static volatile zzalp<zzsh> zzd;
    private int zze;
    private zzsk zzf;
    private int zzg;

    public static final class zza extends zzajy.zza<zzsh, zza> implements zzale {
        public final zza zza(int i7) {
            zzh();
            ((zzsh) this.zza).zzg = i7;
            return this;
        }

        private zza() {
            super(zzsh.zzc);
        }

        public final zza zza(zzsk zzskVar) {
            zzh();
            zzsh.zza((zzsh) this.zza, zzskVar);
            return this;
        }
    }

    static {
        zzsh zzshVar = new zzsh();
        zzc = zzshVar;
        zzajy.zza((Class<zzsh>) zzsh.class, zzshVar);
    }

    private zzsh() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzsh zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzsk zze() {
        zzsk zzskVar = this.zzf;
        return zzskVar == null ? zzsk.zzd() : zzskVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzsj.zza[i7 - 1]) {
            case 1:
                return new zzsh();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzsh> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzsh.class) {
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

    public static /* synthetic */ void zza(zzsh zzshVar, zzsk zzskVar) {
        zzskVar.getClass();
        zzshVar.zzf = zzskVar;
        zzshVar.zze |= 1;
    }
}
