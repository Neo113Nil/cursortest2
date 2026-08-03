package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes4.dex */
public final class zzbj {
    public static android.os.Looper zza(android.os.Looper looper) {
        return looper != null ? looper : zzb();
    }

    public static android.os.Looper zzb() {
        com.google.android.gms.common.internal.Preconditions.checkState(android.os.Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        return android.os.Looper.myLooper();
    }
}
