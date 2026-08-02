package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzfwx {
    public static ArrayList zza(int i7) {
        zzfve.zza(i7, "initialArraySize");
        return new ArrayList(i7);
    }

    public static List zzb(List list, zzfsw zzfswVar) {
        return list instanceof RandomAccess ? new zzfwu(list, zzfswVar) : new zzfww(list, zzfswVar);
    }
}
