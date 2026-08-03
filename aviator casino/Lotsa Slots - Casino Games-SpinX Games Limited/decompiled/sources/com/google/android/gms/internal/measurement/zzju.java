package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
interface zzju {

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
    /* renamed from: com.google.android.gms.internal.measurement.zzju$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static java.lang.Object zzg(com.google.android.gms.internal.measurement.zzjt zzjtVar) {
            try {
                return zzjtVar.zza();
            } catch (java.lang.SecurityException unused) {
                long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
                try {
                    return zzjtVar.zza();
                } finally {
                    android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        }
    }

    java.lang.Object zze(java.lang.String str);
}
