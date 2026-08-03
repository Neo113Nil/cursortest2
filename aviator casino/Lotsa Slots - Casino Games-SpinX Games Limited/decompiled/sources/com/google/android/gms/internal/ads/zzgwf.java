package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgwf {
    static int zza(int i) {
        return (int) (java.lang.Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    static int zzb(java.lang.Object obj) {
        return zza(obj == null ? 0 : obj.hashCode());
    }
}
