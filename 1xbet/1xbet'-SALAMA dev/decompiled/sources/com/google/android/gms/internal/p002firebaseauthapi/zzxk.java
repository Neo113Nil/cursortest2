package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzxk extends zzajy<zzxk, zza> implements zzale {
    private static final zzxk zzc;
    private static volatile zzalp<zzxk> zzd;
    private int zze;

    public static final class zza extends zzajy.zza<zzxk, zza> implements zzale {
        private zza() {
            super(zzxk.zzc);
        }
    }

    static {
        zzxk zzxkVar = new zzxk();
        zzc = zzxkVar;
        zzajy.zza((Class<zzxk>) zzxk.class, zzxkVar);
    }

    private zzxk() {
    }

    public static zzxk zzc() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzxk zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzxk) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzxj.zza[i7 - 1]) {
            case 1:
                return new zzxk();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzxk> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzxk.class) {
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
