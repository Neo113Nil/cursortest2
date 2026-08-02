package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzfo implements com.google.android.gms.internal.fido.zzfn {
    @Override // com.google.android.gms.internal.fido.zzfn
    public final java.lang.StackTraceElement zza(java.lang.Class cls, int i) {
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        java.lang.String name2 = cls.getName();
        int i2 = 3;
        boolean z = false;
        while (true) {
            if (i2 >= stackTrace.length) {
                i2 = -1;
                break;
            }
            if (stackTrace[i2].getClassName().equals(name2)) {
                z = true;
            } else {
                if (z) {
                    break;
                }
                z = false;
            }
            i2++;
        }
        if (i2 != -1) {
            return stackTrace[i2];
        }
        return null;
    }

    zzfo() {
    }
}
