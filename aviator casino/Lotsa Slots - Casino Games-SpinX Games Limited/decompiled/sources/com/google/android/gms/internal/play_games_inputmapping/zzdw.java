package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzdw implements com.google.android.gms.internal.play_games_inputmapping.zzdv {
    zzdw() {
    }

    private static final int zzc(java.lang.StackTraceElement[] stackTraceElementArr, java.lang.Class cls, int i) {
        java.lang.String name = cls.getName();
        boolean z = false;
        for (int i2 = 3; i2 < stackTraceElementArr.length; i2++) {
            if (stackTraceElementArr[i2].getClassName().equals(name)) {
                z = true;
            } else if (z) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdv
    public final java.lang.StackTraceElement zza(java.lang.Class cls, int i) {
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        int zzc = zzc(stackTrace, cls, 3);
        if (zzc != -1) {
            return stackTrace[zzc];
        }
        return null;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdv
    public final java.lang.StackTraceElement[] zzb(java.lang.Class cls, int i, int i2) {
        boolean z = true;
        if (i != -1 && i <= 0) {
            z = false;
        }
        com.google.android.gms.internal.play_games_inputmapping.zzds.zzb(z, "maxDepth must be > 0 or -1");
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        int zzc = zzc(stackTrace, cls, 3);
        if (zzc == -1) {
            return new java.lang.StackTraceElement[0];
        }
        int length = stackTrace.length - zzc;
        if (i <= 0 || i >= length) {
            i = length;
        }
        java.lang.StackTraceElement[] stackTraceElementArr = new java.lang.StackTraceElement[i];
        java.lang.System.arraycopy(stackTrace, zzc, stackTraceElementArr, 0, i);
        return stackTraceElementArr;
    }
}
