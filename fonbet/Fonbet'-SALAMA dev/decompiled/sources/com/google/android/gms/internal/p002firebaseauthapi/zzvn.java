package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* loaded from: classes.dex */
public final class zzvn extends zzajy<zzvn, zza> implements zzale {
    private static final zzvn zzc;
    private static volatile zzalp<zzvn> zzd;
    private int zze;
    private int zzf;
    private zzvh zzg;
    private zzaip zzh = zzaip.zza;

    public static final class zza extends zzajy.zza<zzvn, zza> implements zzale {
        public final zza zza(zzvh zzvhVar) {
            zzh();
            zzvn.zza((zzvn) this.zza, zzvhVar);
            return this;
        }

        private zza() {
            super(zzvn.zzc);
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzvn.zza((zzvn) this.zza, zzaipVar);
            return this;
        }

        public final zza zza(int i7) {
            zzh();
            ((zzvn) this.zza).zzf = 0;
            return this;
        }
    }

    static {
        zzvn zzvnVar = new zzvn();
        zzc = zzvnVar;
        zzajy.zza((Class<zzvn>) zzvn.class, zzvnVar);
    }

    private zzvn() {
    }

    public static zzalp<zzvn> d_() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzvn zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzvh zzb() {
        zzvh zzvhVar = this.zzg;
        return zzvhVar == null ? zzvh.zzf() : zzvhVar;
    }

    public final zzaip zzf() {
        return this.zzh;
    }

    public static zzvn zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzvn) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzvp.zza[i7 - 1]) {
            case 1:
                return new zzvn();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzvn> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzvn.class) {
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

    public static /* synthetic */ void zza(zzvn zzvnVar, zzvh zzvhVar) {
        zzvhVar.getClass();
        zzvnVar.zzg = zzvhVar;
        zzvnVar.zze |= 1;
    }

    public static /* synthetic */ void zza(zzvn zzvnVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzvnVar.zzh = zzaipVar;
    }
}
