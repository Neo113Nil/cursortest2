package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzfj {
    private static final java.lang.String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final com.google.android.gms.internal.fido.zzfn zzb;

    static {
        com.google.android.gms.internal.fido.zzfn zzfoVar;
        int i = 0;
        while (true) {
            if (i >= 2) {
                zzfoVar = new com.google.android.gms.internal.fido.zzfo();
                break;
            }
            try {
                zzfoVar = (com.google.android.gms.internal.fido.zzfn) java.lang.Class.forName(zza[i]).asSubclass(com.google.android.gms.internal.fido.zzfn.class).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.Throwable unused) {
                zzfoVar = null;
            }
            if (zzfoVar != null) {
                break;
            } else {
                i++;
            }
        }
        zzb = zzfoVar;
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public static java.lang.StackTraceElement zza(java.lang.Class cls, int i) {
        com.google.android.gms.internal.fido.zzfk.zza(cls, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET);
        return zzb.zza(cls, 2);
    }
}
