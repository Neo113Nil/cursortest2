package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzvq extends zzajy<zzvq, zza> implements zzale {
    private static final zzvq zzc;
    private static volatile zzalp<zzvq> zzd;
    private String zze = "";
    private zzaip zzf = zzaip.zza;
    private int zzg;

    public static final class zza extends zzajy.zza<zzvq, zza> implements zzale {
        public final zza zza(zzb zzbVar) {
            zzh();
            zzvq.zza((zzvq) this.zza, zzbVar);
            return this;
        }

        private zza() {
            super(zzvq.zzc);
        }

        public final zza zza(String str) {
            zzh();
            zzvq.zza((zzvq) this.zza, str);
            return this;
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzvq.zza((zzvq) this.zza, zzaipVar);
            return this;
        }
    }

    static {
        zzvq zzvqVar = new zzvq();
        zzc = zzvqVar;
        zzajy.zza((Class<zzvq>) zzvq.class, zzvqVar);
    }

    private zzvq() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzvq zzd() {
        return zzc;
    }

    public final zzb zzb() {
        zzb zzbVarZza = zzb.zza(this.zzg);
        return zzbVarZza == null ? zzb.UNRECOGNIZED : zzbVarZza;
    }

    public final zzaip zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzvs.zza[i7 - 1]) {
            case 1:
                return new zzvq();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzvq> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzvq.class) {
                        try {
                            zzcVar = zzd;
                            if (zzcVar == null) {
                                zzcVar = new zzajy.zzc<>(zzc);
                                zzd = zzcVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return zzcVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public enum zzb implements zzaka {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        private final int zzh;

        zzb(int i7) {
            this.zzh = i7;
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(zzb.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(zza());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final int zza() {
            if (this != UNRECOGNIZED) {
                return this.zzh;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static zzb zza(int i7) {
            if (i7 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i7 == 1) {
                return SYMMETRIC;
            }
            if (i7 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i7 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i7 != 4) {
                return null;
            }
            return REMOTE;
        }
    }

    public static /* synthetic */ void zza(zzvq zzvqVar, zzb zzbVar) {
        zzvqVar.zzg = zzbVar.zza();
    }

    public static /* synthetic */ void zza(zzvq zzvqVar, String str) {
        str.getClass();
        zzvqVar.zze = str;
    }

    public static /* synthetic */ void zza(zzvq zzvqVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzvqVar.zzf = zzaipVar;
    }
}
