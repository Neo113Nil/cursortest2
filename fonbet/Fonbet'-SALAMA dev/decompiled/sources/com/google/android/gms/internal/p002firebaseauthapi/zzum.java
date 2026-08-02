package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* loaded from: classes.dex */
public final class zzum extends zzajy<zzum, zza> implements zzale {
    private static final zzum zzc;
    private static volatile zzalp<zzum> zzd;
    private int zze;
    private int zzf;
    private zzaip zzg = zzaip.zza;

    public static final class zza extends zzajy.zza<zzum, zza> implements zzale {
        public final zza zza(zzup zzupVar) {
            zzh();
            zzum.zza((zzum) this.zza, zzupVar);
            return this;
        }

        private zza() {
            super(zzum.zzc);
        }

        public final zza zza(zzur zzurVar) {
            zzh();
            zzum.zza((zzum) this.zza, zzurVar);
            return this;
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzum.zza((zzum) this.zza, zzaipVar);
            return this;
        }
    }

    static {
        zzum zzumVar = new zzum();
        zzc = zzumVar;
        zzajy.zza((Class<zzum>) zzum.class, zzumVar);
    }

    private zzum() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzum zzc() {
        return zzc;
    }

    public final zzup zzd() {
        zzup zza2 = zzup.zza(this.zze);
        return zza2 == null ? zzup.UNRECOGNIZED : zza2;
    }

    public final zzur zze() {
        zzur zza2 = zzur.zza(this.zzf);
        return zza2 == null ? zzur.UNRECOGNIZED : zza2;
    }

    public final zzaip zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzul.zza[i7 - 1]) {
            case 1:
                return new zzum();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzum> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzum.class) {
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

    public static /* synthetic */ void zza(zzum zzumVar, zzup zzupVar) {
        zzumVar.zze = zzupVar.zza();
    }

    public static /* synthetic */ void zza(zzum zzumVar, zzur zzurVar) {
        zzumVar.zzf = zzurVar.zza();
    }

    public static /* synthetic */ void zza(zzum zzumVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzumVar.zzg = zzaipVar;
    }
}
