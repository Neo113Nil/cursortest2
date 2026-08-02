package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbek {
    public static final java.util.List zza(java.lang.Object obj, long j) {
        com.google.android.libraries.places.internal.zzbea zzbeaVar = (com.google.android.libraries.places.internal.zzbea) com.google.android.libraries.places.internal.zzbgf.zzn(obj, j);
        if (zzbeaVar.zza()) {
            return zzbeaVar;
        }
        int size = zzbeaVar.size();
        com.google.android.libraries.places.internal.zzbea zzg = zzbeaVar.zzg(size == 0 ? 10 : size + size);
        com.google.android.libraries.places.internal.zzbgf.zzo(obj, j, zzg);
        return zzg;
    }

    zzbek() {
    }
}
