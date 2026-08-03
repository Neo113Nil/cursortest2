package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzcf {
    private static final java.lang.ThreadLocal zza = new com.google.android.gms.internal.measurement.zzce();

    public static android.content.SharedPreferences zza(android.content.Context context, java.lang.String str, int i, com.google.android.gms.internal.measurement.zzca zzcaVar) {
        com.google.android.gms.internal.measurement.zzbv.zza();
        com.google.android.gms.internal.measurement.zzcd zzcdVar = str.equals("") ? new com.google.android.gms.internal.measurement.zzcd() : null;
        if (zzcdVar != null) {
            return zzcdVar;
        }
        java.lang.ThreadLocal threadLocal = zza;
        com.google.common.base.Preconditions.checkArgument(((java.lang.Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(java.lang.Boolean.FALSE);
        try {
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(java.lang.Boolean.TRUE);
            return sharedPreferences;
        } catch (java.lang.Throwable th) {
            zza.set(java.lang.Boolean.TRUE);
            throw th;
        }
    }
}
