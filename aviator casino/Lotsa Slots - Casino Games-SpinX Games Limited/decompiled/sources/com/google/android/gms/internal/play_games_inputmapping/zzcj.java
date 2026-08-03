package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzcj extends com.google.android.gms.internal.play_games_inputmapping.zzcb {
    private static final boolean zza = com.google.android.gms.internal.play_games_inputmapping.zzcj.zza.zza();
    private static final boolean zzb;
    private static final com.google.android.gms.internal.play_games_inputmapping.zzca zzc;

    /* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
    final class zza {
        zza() {
        }

        static boolean zza() {
            return com.google.android.gms.internal.play_games_inputmapping.zzcj.zzp();
        }
    }

    static {
        boolean z = true;
        if (android.os.Build.FINGERPRINT != null && !"robolectric".equals(android.os.Build.FINGERPRINT)) {
            z = false;
        }
        zzb = z;
        zzc = new com.google.android.gms.internal.play_games_inputmapping.zzca() { // from class: com.google.android.gms.internal.play_games_inputmapping.zzcj.1
            @Override // com.google.android.gms.internal.play_games_inputmapping.zzca
            public java.lang.String zza(java.lang.Class<? extends com.google.android.gms.internal.play_games_inputmapping.zzp<?>> cls) {
                java.lang.StackTraceElement zza2;
                if (com.google.android.gms.internal.play_games_inputmapping.zzcj.zza) {
                    try {
                        if (cls.equals(com.google.android.gms.internal.play_games_inputmapping.zzcj.zzr())) {
                            return dalvik.system.VMStack.getStackClass2().getName();
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                }
                if (!com.google.android.gms.internal.play_games_inputmapping.zzcj.zzb || (zza2 = com.google.android.gms.internal.play_games_inputmapping.zzdr.zza(cls, 1)) == null) {
                    return null;
                }
                return zza2.getClassName();
            }

            @Override // com.google.android.gms.internal.play_games_inputmapping.zzca
            public com.google.android.gms.internal.play_games_inputmapping.zzaf zzb(java.lang.Class<?> cls, int i) {
                return com.google.android.gms.internal.play_games_inputmapping.zzaf.zza;
            }
        };
    }

    static boolean zzp() {
        try {
            java.lang.Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new java.lang.Class[0]);
            return com.google.android.gms.internal.play_games_inputmapping.zzcj.zza.class.getName().equals(zzq());
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    static java.lang.String zzq() {
        try {
            return dalvik.system.VMStack.getStackClass2().getName();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static java.lang.Class<?> zzr() {
        return dalvik.system.VMStack.getStackClass2();
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzcb
    protected com.google.android.gms.internal.play_games_inputmapping.zzca zzc() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzcb
    protected com.google.android.gms.internal.play_games_inputmapping.zzbc zze(java.lang.String str) {
        return com.google.android.gms.internal.play_games_inputmapping.zzcn.zze(str);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzcb
    protected com.google.android.gms.internal.play_games_inputmapping.zzcs zzg() {
        return com.google.android.gms.internal.play_games_inputmapping.zzco.zza();
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzcb
    protected java.lang.String zzn() {
        return "platform: Android";
    }
}
