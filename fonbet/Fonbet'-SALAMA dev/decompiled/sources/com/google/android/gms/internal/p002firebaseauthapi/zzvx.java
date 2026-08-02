package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

@Deprecated
/* loaded from: classes.dex */
public final class zzvx extends zzajy<zzvx, zza> implements zzale {
    private static final zzvx zzc;
    private static volatile zzalp<zzvx> zzd;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    public static final class zza extends zzajy.zza<zzvx, zza> implements zzale {
        private zza() {
            super(zzvx.zzc);
        }
    }

    static {
        zzvx zzvxVar = new zzvx();
        zzc = zzvxVar;
        zzajy.zza((Class<zzvx>) zzvx.class, zzvxVar);
    }

    private zzvx() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzvz.zza[i7 - 1]) {
            case 1:
                return new zzvx();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzvx> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzvx.class) {
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
