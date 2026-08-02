package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* loaded from: classes.dex */
public final class zzwg extends zzajy<zzwg, zza> implements zzale {
    private static final zzwg zzc;
    private static volatile zzalp<zzwg> zzd;
    private int zze;
    private int zzf;
    private zzwj zzg;

    public static final class zza extends zzajy.zza<zzwg, zza> implements zzale {
        public final zza zza(zzwj zzwjVar) {
            zzh();
            zzwg.zza((zzwg) this.zza, zzwjVar);
            return this;
        }

        private zza() {
            super(zzwg.zzc);
        }
    }

    static {
        zzwg zzwgVar = new zzwg();
        zzc = zzwgVar;
        zzajy.zza((Class<zzwg>) zzwg.class, zzwgVar);
    }

    private zzwg() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalp<zzwg> zze() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzwj zzd() {
        zzwj zzwjVar = this.zzg;
        return zzwjVar == null ? zzwj.zzc() : zzwjVar;
    }

    public static zzwg zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzwg) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzwi.zza[i7 - 1]) {
            case 1:
                return new zzwg();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzwg> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzwg.class) {
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

    public static /* synthetic */ void zza(zzwg zzwgVar, zzwj zzwjVar) {
        zzwjVar.getClass();
        zzwgVar.zzg = zzwjVar;
        zzwgVar.zze |= 1;
    }
}
