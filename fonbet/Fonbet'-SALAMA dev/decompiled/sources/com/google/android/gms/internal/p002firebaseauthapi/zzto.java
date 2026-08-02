package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* loaded from: classes.dex */
public final class zzto extends zzajy<zzto, zza> implements zzale {
    private static final zzto zzc;
    private static volatile zzalp<zzto> zzd;
    private int zze;
    private zzaip zzf = zzaip.zza;

    public static final class zza extends zzajy.zza<zzto, zza> implements zzale {
        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzto.zza((zzto) this.zza, zzaipVar);
            return this;
        }

        private zza() {
            super(zzto.zzc);
        }
    }

    static {
        zzto zztoVar = new zzto();
        zzc = zztoVar;
        zzajy.zza((Class<zzto>) zzto.class, zztoVar);
    }

    private zzto() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalp<zzto> zze() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzaip zzd() {
        return this.zzf;
    }

    public static zzto zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzto) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zztq.zza[i7 - 1]) {
            case 1:
                return new zzto();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzto> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzto.class) {
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

    public static /* synthetic */ void zza(zzto zztoVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zztoVar.zzf = zzaipVar;
    }
}
