package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zztr extends zzajy<zztr, zza> implements zzale {
    private static final zztr zzc;
    private static volatile zzalp<zztr> zzd;

    public static final class zza extends zzajy.zza<zztr, zza> implements zzale {
        private zza() {
            super(zztr.zzc);
        }
    }

    static {
        zztr zztrVar = new zztr();
        zzc = zztrVar;
        zzajy.zza((Class<zztr>) zztr.class, zztrVar);
    }

    private zztr() {
    }

    public static zztr zzb() {
        return zzc;
    }

    public static zztr zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zztr) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zztt.zza[i7 - 1]) {
            case 1:
                return new zztr();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzc;
            case 5:
                zzalp<zztr> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zztr.class) {
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
