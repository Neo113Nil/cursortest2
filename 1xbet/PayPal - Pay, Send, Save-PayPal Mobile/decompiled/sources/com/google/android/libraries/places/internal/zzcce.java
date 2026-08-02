package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcce {
    static {
        java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzcce.class.getName());
    }

    public static com.google.android.libraries.places.internal.zzbmg zza(java.util.List list) {
        return com.google.android.libraries.places.internal.zzbkw.zzb(zzc(list));
    }

    public static com.google.android.libraries.places.internal.zzbmg zzb(java.util.List list) {
        return com.google.android.libraries.places.internal.zzbkw.zzb(zzc(list));
    }

    private static byte[][] zzc(java.util.List list) {
        int size = list.size();
        byte[][] bArr = new byte[size + size][];
        java.util.Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            com.google.android.libraries.places.internal.zzccz zzcczVar = (com.google.android.libraries.places.internal.zzccz) it.next();
            bArr[i] = zzcczVar.zzf.zzk();
            bArr[i + 1] = zzcczVar.zzg.zzk();
            i += 2;
        }
        return com.google.android.libraries.places.internal.zzcah.zzb(bArr);
    }

    private zzcce() {
    }
}
