package kotlinx.serialization.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
/* loaded from: classes5.dex */
public final class O<K, V> extends AbstractC1146k0<K, V, Map<K, ? extends V>, HashMap<K, V>> {
    public final N c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(kotlinx.serialization.b<K> kSerializer, kotlinx.serialization.b<V> vSerializer) {
        super(kSerializer, vSerializer);
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        kotlinx.serialization.descriptors.f keyDesc = kSerializer.getDescriptor();
        kotlinx.serialization.descriptors.f valueDesc = vSerializer.getDescriptor();
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
        this.c = new N("kotlin.collections.HashMap", keyDesc, valueDesc);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Object a() {
        return new HashMap();
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final int b(Object obj) {
        HashMap hashMap = (HashMap) obj;
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        return hashMap.size() * 2;
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final void c(int i, Object obj) {
        Intrinsics.checkNotNullParameter((HashMap) obj, "<this>");
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Iterator d(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final int e(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return this.c;
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Object i(Object obj) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        return new HashMap((Map) null);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Object j(Object obj) {
        HashMap hashMap = (HashMap) obj;
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        return hashMap;
    }
}
