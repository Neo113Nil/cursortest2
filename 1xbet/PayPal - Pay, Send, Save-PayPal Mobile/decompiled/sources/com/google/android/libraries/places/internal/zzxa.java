package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzxa {
    private static final java.lang.String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final com.google.android.libraries.places.internal.zzxe zzb;

    static {
        com.google.android.libraries.places.internal.zzxe zzxfVar;
        int i = 0;
        while (true) {
            if (i >= 2) {
                zzxfVar = new com.google.android.libraries.places.internal.zzxf();
                break;
            }
            try {
                zzxfVar = (com.google.android.libraries.places.internal.zzxe) java.lang.Class.forName(zza[i]).asSubclass(com.google.android.libraries.places.internal.zzxe.class).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.Throwable unused) {
                zzxfVar = null;
            }
            if (zzxfVar != null) {
                break;
            } else {
                i++;
            }
        }
        zzb = zzxfVar;
    }

    public static java.lang.StackTraceElement zza(java.lang.Class cls, int i) {
        com.google.android.libraries.places.internal.zzxb.zza(cls, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET);
        return zzb.zza(cls, 2);
    }

    public static java.lang.StackTraceElement[] zzb(java.lang.Class cls, int i, int i2) {
        if (i > 0 || i == -1) {
            return zzb.zzb(cls, i, 2);
        }
        throw new java.lang.IllegalArgumentException("invalid maximum depth: 0");
    }
}
