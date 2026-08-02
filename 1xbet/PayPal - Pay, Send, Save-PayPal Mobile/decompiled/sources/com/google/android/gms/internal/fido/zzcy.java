package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzcy {
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
