package org.betup.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.betup.model.remote.entity.Entity;

/* loaded from: classes4.dex */
public final class EntityUtils {
    private EntityUtils() {
    }

    public static List<Integer> getEntityIds(List<? extends Entity> entities) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Entity> it = entities.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getId());
        }
        return arrayList;
    }
}
