package com.google.android.datatransport.runtime.util;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.datatransport.e;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {
    public static final SparseArray<e> a = new SparseArray<>();
    public static final HashMap<e, Integer> b;

    static {
        HashMap<e, Integer> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put(e.a, 0);
        hashMap.put(e.b, 1);
        hashMap.put(e.c, 2);
        for (e eVar : hashMap.keySet()) {
            a.append(b.get(eVar).intValue(), eVar);
        }
    }

    public static int a(@NonNull e eVar) {
        Integer num = b.get(eVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + eVar);
    }

    @NonNull
    public static e b(int i) {
        e eVar = a.get(i);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(i, "Unknown Priority for value "));
    }
}
