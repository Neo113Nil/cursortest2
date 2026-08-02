package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzfwr {
    public static Object zza(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static void zzb(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean zzc(Collection collection, Iterator it) {
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= collection.add(it.next());
        }
        return z4;
    }
}
