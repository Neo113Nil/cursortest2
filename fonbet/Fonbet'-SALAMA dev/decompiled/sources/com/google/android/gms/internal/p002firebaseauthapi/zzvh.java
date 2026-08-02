package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* loaded from: classes.dex */
public final class zzvh extends zzajy<zzvh, zza> implements zzale {
    private static final zzvh zzc;
    private static volatile zzalp<zzvh> zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public static final class zza extends zzajy.zza<zzvh, zza> implements zzale {
        public final zza zza(zzvd zzvdVar) {
            zzh();
            zzvh.zza((zzvh) this.zza, zzvdVar);
            return this;
        }

        private zza() {
            super(zzvh.zzc);
        }

        public final zza zza(zzvc zzvcVar) {
            zzh();
            zzvh.zza((zzvh) this.zza, zzvcVar);
            return this;
        }

        public final zza zza(zzvf zzvfVar) {
            zzh();
            zzvh.zza((zzvh) this.zza, zzvfVar);
            return this;
        }
    }

    static {
        zzvh zzvhVar = new zzvh();
        zzc = zzvhVar;
        zzajy.zza((Class<zzvh>) zzvh.class, zzvhVar);
    }

    private zzvh() {
    }

    public static zza zzd() {
        return zzc.zzm();
    }

    public static zzvh zzf() {
        return zzc;
    }

    public final zzvd zza() {
        zzvd zza2 = zzvd.zza(this.zzg);
        return zza2 == null ? zzvd.UNRECOGNIZED : zza2;
    }

    public final zzvc zzb() {
        zzvc zza2 = zzvc.zza(this.zzf);
        return zza2 == null ? zzvc.UNRECOGNIZED : zza2;
    }

    public final zzvf zzc() {
        zzvf zza2 = zzvf.zza(this.zze);
        return zza2 == null ? zzvf.UNRECOGNIZED : zza2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzvj.zza[i7 - 1]) {
            case 1:
                return new zzvh();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzvh> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzvh.class) {
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

    public static /* synthetic */ void zza(zzvh zzvhVar, zzvd zzvdVar) {
        zzvhVar.zzg = zzvdVar.zza();
    }

    public static /* synthetic */ void zza(zzvh zzvhVar, zzvc zzvcVar) {
        zzvhVar.zzf = zzvcVar.zza();
    }

    public static /* synthetic */ void zza(zzvh zzvhVar, zzvf zzvfVar) {
        zzvhVar.zze = zzvfVar.zza();
    }
}
