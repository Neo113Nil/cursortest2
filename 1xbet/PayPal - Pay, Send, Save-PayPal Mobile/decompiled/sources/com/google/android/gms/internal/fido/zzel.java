package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzel extends com.google.android.gms.internal.fido.zzeg {
    private static final boolean zza = com.google.android.gms.internal.fido.zzel.zza.zza();
    private static final boolean zzb;
    private static final com.google.android.gms.internal.fido.zzef zzc;

    static {
        zzb = android.os.Build.FINGERPRINT == null || "robolectric".equals(android.os.Build.FINGERPRINT);
        zzc = new com.google.android.gms.internal.fido.zzef() { // from class: com.google.android.gms.internal.fido.zzel.1
            @Override // com.google.android.gms.internal.fido.zzef
            public java.lang.String zzb(java.lang.Class cls) {
                java.lang.StackTraceElement zza2;
                if (com.google.android.gms.internal.fido.zzel.zza) {
                    try {
                        if (cls.equals(com.google.android.gms.internal.fido.zzel.zzp())) {
                            return dalvik.system.VMStack.getStackClass2().getName();
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                }
                if (!com.google.android.gms.internal.fido.zzel.zzb || (zza2 = com.google.android.gms.internal.fido.zzfj.zza(cls, 1)) == null) {
                    return null;
                }
                return zza2.getClassName();
            }

            @Override // com.google.android.gms.internal.fido.zzef
            public com.google.android.gms.internal.fido.zzdj zza(java.lang.Class<?> cls, int i) {
                return com.google.android.gms.internal.fido.zzdj.zza;
            }
        };
    }

    static java.lang.Class<?> zzp() {
        return dalvik.system.VMStack.getStackClass2();
    }

    static java.lang.String zzq() {
        try {
            return dalvik.system.VMStack.getStackClass2().getName();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static boolean zzt() {
        try {
            java.lang.Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new java.lang.Class[0]);
            return com.google.android.gms.internal.fido.zzel.zza.class.getName().equals(zzq());
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    protected final com.google.android.gms.internal.fido.zzdp zze(java.lang.String str) {
        return com.google.android.gms.internal.fido.zzeo.zzb(str);
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    protected final com.google.android.gms.internal.fido.zzev zzj() {
        return com.google.android.gms.internal.fido.zzep.zzb();
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    protected final java.lang.String zzm() {
        return "platform: Android";
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    protected final com.google.android.gms.internal.fido.zzef zzh() {
        return zzc;
    }

    final class zza {
        static boolean zza() {
            return com.google.android.gms.internal.fido.zzel.zzt();
        }

        zza() {
        }
    }
}
