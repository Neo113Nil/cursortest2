package com.goldenboot.saga.zone;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class ClipboardSequence extends WidgetUtil {
    public abstract boolean applyTask(Map.Entry entry);

    public final boolean clipOrigin(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return applyTask(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return clipOrigin((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return serializeOffset((Map.Entry) obj);
        }
        return false;
    }

    public abstract /* bridge */ boolean serializeOffset(Map.Entry entry);
}
