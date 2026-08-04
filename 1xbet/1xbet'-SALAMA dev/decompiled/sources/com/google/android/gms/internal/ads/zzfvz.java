package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzfvz {
    public static int zza(int i7) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i7) * (-862048943)), 15)) * 461845907);
    }

    public static int zzb(Object obj) {
        return zza(obj == null ? 0 : obj.hashCode());
    }
}
