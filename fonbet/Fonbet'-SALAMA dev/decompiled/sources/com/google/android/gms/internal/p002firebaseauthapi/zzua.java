package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* loaded from: classes.dex */
public final class zzua extends zzajy<zzua, zza> implements zzale {
    private static final zzua zzc;
    private static volatile zzalp<zzua> zzd;
    private int zze;
    private zzud zzf;

    public static final class zza extends zzajy.zza<zzua, zza> implements zzale {
        public final zza zza(zzud zzudVar) {
            zzh();
            zzua.zza((zzua) this.zza, zzudVar);
            return this;
        }

        private zza() {
            super(zzua.zzc);
        }
    }

    static {
        zzua zzuaVar = new zzua();
        zzc = zzuaVar;
        zzajy.zza((Class<zzua>) zzua.class, zzuaVar);
    }

    private zzua() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public final zzud zzc() {
        zzud zzudVar = this.zzf;
        return zzudVar == null ? zzud.zze() : zzudVar;
    }

    public static zzua zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzua) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zztz.zza[i7 - 1]) {
            case 1:
                return new zzua();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzua> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzua.class) {
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

    public static /* synthetic */ void zza(zzua zzuaVar, zzud zzudVar) {
        zzudVar.getClass();
        zzuaVar.zzf = zzudVar;
        zzuaVar.zze |= 1;
    }
}
