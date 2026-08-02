package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* loaded from: classes.dex */
public final class zztl extends zzajy<zztl, zza> implements zzale {
    private static final zztl zzc;
    private static volatile zzalp<zztl> zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzajy.zza<zztl, zza> implements zzale {
        public final zza zza(int i7) {
            zzh();
            ((zztl) this.zza).zze = i7;
            return this;
        }

        private zza() {
            super(zztl.zzc);
        }
    }

    static {
        zztl zztlVar = new zztl();
        zzc = zztlVar;
        zzajy.zza((Class<zztl>) zztl.class, zztlVar);
    }

    private zztl() {
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

    public static zztl zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zztl) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zztn.zza[i7 - 1]) {
            case 1:
                return new zztl();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zztl> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zztl.class) {
                        try {
                            zzalpVar = zzd;
                            if (zzalpVar == null) {
                                zzalpVar = new zzajy.zzc<>(zzc);
                                zzd = zzalpVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzalpVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
