package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
public final class zzaa {
    static int zza(java.util.Set set) {
        java.util.Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
