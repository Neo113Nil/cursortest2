package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* loaded from: classes.dex */
public final class zzxe extends zzajy<zzxe, zza> implements zzale {
    private static final zzxe zzc;
    private static volatile zzalp<zzxe> zzd;
    private int zze;

    public static final class zza extends zzajy.zza<zzxe, zza> implements zzale {
        public final zza zza(int i7) {
            zzh();
            ((zzxe) this.zza).zze = i7;
            return this;
        }

        private zza() {
            super(zzxe.zzc);
        }
    }

    static {
        zzxe zzxeVar = new zzxe();
        zzc = zzxeVar;
        zzajy.zza((Class<zzxe>) zzxe.class, zzxeVar);
    }

    private zzxe() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzxe zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzxd.zza[i7 - 1]) {
            case 1:
                return new zzxe();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzxe> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzxe.class) {
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
