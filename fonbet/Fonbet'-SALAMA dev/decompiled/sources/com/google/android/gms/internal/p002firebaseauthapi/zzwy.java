package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* loaded from: classes.dex */
public final class zzwy extends zzajy<zzwy, zza> implements zzale {
    private static final zzwy zzc;
    private static volatile zzalp<zzwy> zzd;
    private int zze;
    private int zzf;
    private zzxe zzg;
    private zzaip zzh = zzaip.zza;

    public static final class zza extends zzajy.zza<zzwy, zza> implements zzale {
        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzwy.zza((zzwy) this.zza, zzaipVar);
            return this;
        }

        private zza() {
            super(zzwy.zzc);
        }

        public final zza zza(zzxe zzxeVar) {
            zzh();
            zzwy.zza((zzwy) this.zza, zzxeVar);
            return this;
        }
    }

    static {
        zzwy zzwyVar = new zzwy();
        zzc = zzwyVar;
        zzajy.zza((Class<zzwy>) zzwy.class, zzwyVar);
    }

    private zzwy() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzxe zzd() {
        zzxe zzxeVar = this.zzg;
        return zzxeVar == null ? zzxe.zzd() : zzxeVar;
    }

    public final zzaip zze() {
        return this.zzh;
    }

    public static zzwy zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzwy) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzwx.zza[i7 - 1]) {
            case 1:
                return new zzwy();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzwy> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzwy.class) {
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

    public static /* synthetic */ void zza(zzwy zzwyVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzwyVar.zzh = zzaipVar;
    }

    public static /* synthetic */ void zza(zzwy zzwyVar, zzxe zzxeVar) {
        zzxeVar.getClass();
        zzwyVar.zzg = zzxeVar;
        zzwyVar.zze |= 1;
    }
}
