package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public final /* synthetic */ class zzcj {
    public static java.lang.Object zza(com.google.android.gms.internal.auth.zzck zzckVar) {
        try {
            return zzckVar.zza();
        } catch (java.lang.SecurityException unused) {
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                return zzckVar.zza();
            } finally {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
