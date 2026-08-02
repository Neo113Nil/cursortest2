package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzvt extends com.google.android.libraries.places.internal.zzvn {
    private static final boolean zza = com.google.android.libraries.places.internal.zzvt.zza.zza();
    private static final boolean zzb;
    private static final com.google.android.libraries.places.internal.zzvm zzc;

    static {
        boolean z = true;
        if (android.os.Build.FINGERPRINT != null && !"robolectric".equals(android.os.Build.FINGERPRINT)) {
            z = false;
        }
        zzb = z;
        zzc = new com.google.android.libraries.places.internal.zzvm() { // from class: com.google.android.libraries.places.internal.zzvt.1
            @Override // com.google.android.libraries.places.internal.zzvm
            public java.lang.String zza(java.lang.Class<? extends com.google.android.libraries.places.internal.zzss<?>> cls) {
                java.lang.StackTraceElement zza2;
                if (com.google.android.libraries.places.internal.zzvt.zza) {
                    try {
                        if (cls.equals(com.google.android.libraries.places.internal.zzvt.zzr())) {
                            return dalvik.system.VMStack.getStackClass2().getName();
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                }
                if (!com.google.android.libraries.places.internal.zzvt.zzb || (zza2 = com.google.android.libraries.places.internal.zzxa.zza(cls, 1)) == null) {
                    return null;
                }
                return zza2.getClassName();
            }

            @Override // com.google.android.libraries.places.internal.zzvm
            public com.google.android.libraries.places.internal.zztm zzb(java.lang.Class<?> cls, int i) {
                return com.google.android.libraries.places.internal.zztm.zza;
            }
        };
    }

    static boolean zzp() {
        try {
            java.lang.Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new java.lang.Class[0]);
            return com.google.android.libraries.places.internal.zzvt.zza.class.getName().equals(zzq());
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

    @Override // com.google.android.libraries.places.internal.zzvn
    protected final com.google.android.libraries.places.internal.zzup zze(java.lang.String str) {
        return com.google.android.libraries.places.internal.zzvy.zze(str);
    }

    @Override // com.google.android.libraries.places.internal.zzvn
    protected final com.google.android.libraries.places.internal.zzwd zzg() {
        return com.google.android.libraries.places.internal.zzvz.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzvn
    protected final java.lang.String zzn() {
        return "platform: Android";
    }

    @Override // com.google.android.libraries.places.internal.zzvn
    protected final com.google.android.libraries.places.internal.zzvm zzc() {
        return zzc;
    }

    final class zza {
        static boolean zza() {
            return com.google.android.libraries.places.internal.zzvt.zzp();
        }

        zza() {
        }
    }
}
