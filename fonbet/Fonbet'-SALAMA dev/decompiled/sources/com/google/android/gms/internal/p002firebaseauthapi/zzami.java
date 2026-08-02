package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* loaded from: classes.dex */
public final class zzami extends zzajy<zzami, zza> implements zzale {
    private static final zzami zzc;
    private static volatile zzalp<zzami> zzd;
    private long zze;
    private int zzf;

    public static final class zza extends zzajy.zza<zzami, zza> implements zzale {
        public final zza zza(int i7) {
            if (!this.zza.zzu()) {
                zzi();
            }
            ((zzami) this.zza).zzf = i7;
            return this;
        }

        private zza() {
            super(zzami.zzc);
        }

        public final zza zza(long j) {
            if (!this.zza.zzu()) {
                zzi();
            }
            ((zzami) this.zza).zze = j;
            return this;
        }
    }

    static {
        zzami zzamiVar = new zzami();
        zzc = zzamiVar;
        zzajy.zza((Class<zzami>) zzami.class, zzamiVar);
    }

    private zzami() {
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final long zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzamk.zza[i7 - 1]) {
            case 1:
                return new zzami();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzami> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzami.class) {
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
