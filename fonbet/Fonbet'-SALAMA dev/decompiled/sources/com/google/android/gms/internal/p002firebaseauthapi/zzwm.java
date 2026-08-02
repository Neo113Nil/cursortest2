package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* loaded from: classes.dex */
public final class zzwm extends zzajy<zzwm, zza> implements zzale {
    private static final zzwm zzc;
    private static volatile zzalp<zzwm> zzd;
    private int zze;
    private int zzf;
    private zzwp zzg;

    public static final class zza extends zzajy.zza<zzwm, zza> implements zzale {
        public final zza zza(zzwp zzwpVar) {
            zzh();
            zzwm.zza((zzwm) this.zza, zzwpVar);
            return this;
        }

        private zza() {
            super(zzwm.zzc);
        }
    }

    static {
        zzwm zzwmVar = new zzwm();
        zzc = zzwmVar;
        zzajy.zza((Class<zzwm>) zzwm.class, zzwmVar);
    }

    private zzwm() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalp<zzwm> zze() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzwp zzd() {
        zzwp zzwpVar = this.zzg;
        return zzwpVar == null ? zzwp.zzd() : zzwpVar;
    }

    public static zzwm zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzwm) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzwo.zza[i7 - 1]) {
            case 1:
                return new zzwm();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzwm> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzwm.class) {
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

    public static /* synthetic */ void zza(zzwm zzwmVar, zzwp zzwpVar) {
        zzwpVar.getClass();
        zzwmVar.zzg = zzwpVar;
        zzwmVar.zze |= 1;
    }
}
