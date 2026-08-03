package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzcz {
    public static final android.os.Handler zza = new android.os.Handler(android.os.Looper.getMainLooper());
    public static final java.util.concurrent.Executor zzb = new com.google.android.gms.internal.consent_sdk.zzcy("Google consent worker");

    public static void zza() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException("Method must be call on main thread.");
        }
    }
}
