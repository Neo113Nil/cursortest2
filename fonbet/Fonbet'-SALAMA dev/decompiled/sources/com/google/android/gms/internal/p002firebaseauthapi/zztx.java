package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* loaded from: classes.dex */
public final class zztx extends zzajy<zztx, zza> implements zzale {
    private static final zztx zzc;
    private static volatile zzalp<zztx> zzd;
    private int zze;
    private zzvu zzf;

    public static final class zza extends zzajy.zza<zztx, zza> implements zzale {
        public final zza zza(zzvu zzvuVar) {
            zzh();
            zztx.zza((zztx) this.zza, zzvuVar);
            return this;
        }

        private zza() {
            super(zztx.zzc);
        }
    }

    static {
        zztx zztxVar = new zztx();
        zzc = zztxVar;
        zzajy.zza((Class<zztx>) zztx.class, zztxVar);
    }

    private zztx() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zztx zzc() {
        return zzc;
    }

    public final zzvu zzd() {
        zzvu zzvuVar = this.zzf;
        return zzvuVar == null ? zzvu.zzc() : zzvuVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zztw.zza[i7 - 1]) {
            case 1:
                return new zztx();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zztx> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zztx.class) {
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

    public static /* synthetic */ void zza(zztx zztxVar, zzvu zzvuVar) {
        zzvuVar.getClass();
        zztxVar.zzf = zzvuVar;
        zztxVar.zze |= 1;
    }
}
