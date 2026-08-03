package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public abstract class zzac extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.zzad {
    public static com.google.android.gms.common.internal.zzad zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof com.google.android.gms.common.internal.zzad ? (com.google.android.gms.common.internal.zzad) queryLocalInterface : new com.google.android.gms.common.internal.zzab(iBinder);
    }
}
