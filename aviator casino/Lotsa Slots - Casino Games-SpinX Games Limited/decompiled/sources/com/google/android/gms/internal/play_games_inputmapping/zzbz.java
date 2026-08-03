package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzbz {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzcb zza = zzb(com.google.android.gms.internal.play_games_inputmapping.zzcb.zzd);

    private static com.google.android.gms.internal.play_games_inputmapping.zzcb zzb(java.lang.String[] strArr) {
        com.google.android.gms.internal.play_games_inputmapping.zzcb zzcbVar;
        try {
            zzcbVar = com.google.android.gms.internal.play_games_inputmapping.zzcc.zza();
        } catch (java.lang.NoClassDefFoundError unused) {
            zzcbVar = null;
        }
        if (zzcbVar != null) {
            return zzcbVar;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : strArr) {
            try {
                return (com.google.android.gms.internal.play_games_inputmapping.zzcb) java.lang.Class.forName(str).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.Throwable th) {
                th = th;
                if (th instanceof java.lang.reflect.InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                sb.append(th);
            }
        }
        throw new java.lang.IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
