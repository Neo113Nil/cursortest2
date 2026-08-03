package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzdr {
    private static final java.lang.String[] zza;
    private static final com.google.android.gms.internal.play_games_inputmapping.zzdv zzb;

    static {
        com.google.android.gms.internal.play_games_inputmapping.zzdv zzdwVar;
        java.lang.String[] strArr = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
        zza = strArr;
        int i = 0;
        while (true) {
            if (i >= 2) {
                zzdwVar = new com.google.android.gms.internal.play_games_inputmapping.zzdw();
                break;
            }
            try {
                zzdwVar = (com.google.android.gms.internal.play_games_inputmapping.zzdv) java.lang.Class.forName(strArr[i]).asSubclass(com.google.android.gms.internal.play_games_inputmapping.zzdv.class).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.Throwable unused) {
                zzdwVar = null;
            }
            if (zzdwVar != null) {
                break;
            } else {
                i++;
            }
        }
        zzb = zzdwVar;
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public static java.lang.StackTraceElement zza(java.lang.Class cls, int i) {
        com.google.android.gms.internal.play_games_inputmapping.zzds.zza(cls, "target");
        return zzb.zza(cls, 2);
    }

    public static java.lang.StackTraceElement[] zzb(java.lang.Class cls, int i, int i2) {
        if (i > 0 || i == -1) {
            return zzb.zzb(cls, i, 2);
        }
        throw new java.lang.IllegalArgumentException("invalid maximum depth: 0");
    }
}
