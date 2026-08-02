package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
/* renamed from: kotlinx.serialization.internal.a0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1126a0<K, V> extends AbstractC1146k0<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
    public final Z c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1126a0(kotlinx.serialization.b<K> kSerializer, kotlinx.serialization.b<V> vSerializer) {
        super(kSerializer, vSerializer);
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        kotlinx.serialization.descriptors.f keyDesc = kSerializer.getDescriptor();
        kotlinx.serialization.descriptors.f valueDesc = vSerializer.getDescriptor();
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
        this.c = new Z("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final void c(int i, Object obj) {
        Intrinsics.checkNotNullParameter((LinkedHashMap) obj, "<this>");
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
        return new LinkedHashMap((Map) null);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Object j(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
