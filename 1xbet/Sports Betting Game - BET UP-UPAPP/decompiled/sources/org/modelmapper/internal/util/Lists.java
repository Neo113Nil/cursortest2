package org.modelmapper.internal.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class Lists {
    private Lists() {
    }

    public static <T> List<T> from(Iterator<T> it) {
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static <T> List<T> from(Set<Map.Entry<T, ?>> set) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<T, ?>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        return arrayList;
    }
}
