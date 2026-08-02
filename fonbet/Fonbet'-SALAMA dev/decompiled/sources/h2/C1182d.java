package h2;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: h2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1182d extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 4;
    }
}
