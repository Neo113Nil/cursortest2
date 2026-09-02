package com.goldenboot.saga.zone;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ModuleVersion {
    public static final PaletteMap growPayload(final IconExporter iconExporter, TouchRecord touchRecord) {
        IconExporter iconExporter2 = new IconExporter() { // from class: com.goldenboot.saga.zone.FragmentRelay
            @Override // com.goldenboot.saga.zone.IconExporter
            public final Object invoke(Object obj, Object obj2) {
                Object injectMetric;
                injectMetric = ModuleVersion.injectMetric(IconExporter.this, (ItemStore) obj, obj2);
                return injectMetric;
            }
        };
        Intrinsics.checkNotNull(touchRecord, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return MarginEncoder.releaseHeader(iconExporter2, (TouchRecord) TypeIntrinsics.beforeCheckcastToFunctionOfArity(touchRecord, 1));
    }

    public static final Object injectMetric(IconExporter iconExporter, ItemStore itemStore, Object obj) {
        List list = (List) iconExporter.invoke(itemStore, obj);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            if (obj2 != null && !itemStore.evictLayout(obj2)) {
                throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj2).toString());
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return new ArrayList(list);
    }
}
