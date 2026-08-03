package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
public abstract class zze extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.internal.auth.zzf {
    public static com.google.android.gms.internal.auth.zzf zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        return queryLocalInterface instanceof com.google.android.gms.internal.auth.zzf ? (com.google.android.gms.internal.auth.zzf) queryLocalInterface : new com.google.android.gms.internal.auth.zzd(iBinder);
    }
}
