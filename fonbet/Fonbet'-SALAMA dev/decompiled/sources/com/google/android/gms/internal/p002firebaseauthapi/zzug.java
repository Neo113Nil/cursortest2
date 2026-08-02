package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* loaded from: classes.dex */
public final class zzug extends zzajy<zzug, zza> implements zzale {
    private static final zzug zzc;
    private static volatile zzalp<zzug> zzd;
    private int zze;
    private int zzf;
    private zzuj zzg;
    private zzaip zzh = zzaip.zza;

    public static final class zza extends zzajy.zza<zzug, zza> implements zzale {
        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzug.zza((zzug) this.zza, zzaipVar);
            return this;
        }

        private zza() {
            super(zzug.zzc);
        }

        public final zza zza(zzuj zzujVar) {
            zzh();
            zzug.zza((zzug) this.zza, zzujVar);
            return this;
        }

        public final zza zza(int i7) {
            zzh();
            ((zzug) this.zza).zzf = 0;
            return this;
        }
    }

    static {
        zzug zzugVar = new zzug();
        zzc = zzugVar;
        zzajy.zza((Class<zzug>) zzug.class, zzugVar);
    }

    private zzug() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalp<zzug> zzf() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzuj zzd() {
        zzuj zzujVar = this.zzg;
        return zzujVar == null ? zzuj.zze() : zzujVar;
    }

    public final zzaip zze() {
        return this.zzh;
    }

    public static zzug zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzug) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzuf.zza[i7 - 1]) {
            case 1:
                return new zzug();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzug> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzug.class) {
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

    public static /* synthetic */ void zza(zzug zzugVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzugVar.zzh = zzaipVar;
    }

    public static /* synthetic */ void zza(zzug zzugVar, zzuj zzujVar) {
        zzujVar.getClass();
        zzugVar.zzg = zzujVar;
        zzugVar.zze |= 1;
    }
}
