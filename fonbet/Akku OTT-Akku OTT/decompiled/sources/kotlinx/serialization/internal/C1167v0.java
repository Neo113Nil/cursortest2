package kotlinx.serialization.internal;

import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
/* renamed from: kotlinx.serialization.internal.v0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1167v0<K, V> extends Y<K, V, Pair<? extends K, ? extends V>> {
    public final kotlinx.serialization.descriptors.i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1167v0(final kotlinx.serialization.b<K> keySerializer, final kotlinx.serialization.b<V> valueSerializer) {
        super(keySerializer, valueSerializer);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.c = kotlinx.serialization.descriptors.l.b("kotlin.Pair", new kotlinx.serialization.descriptors.f[0], new Function1() { // from class: kotlinx.serialization.internal.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kotlinx.serialization.descriptors.a buildClassSerialDescriptor = (kotlinx.serialization.descriptors.a) obj;
                Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                buildClassSerialDescriptor.a("first", kotlinx.serialization.b.this.getDescriptor(), CollectionsKt.emptyList());
                buildClassSerialDescriptor.a("second", valueSerializer.getDescriptor(), CollectionsKt.emptyList());
                return Unit.INSTANCE;
            }
        });
    }

    @Override // kotlinx.serialization.internal.Y
    public final Object a(Object obj) {
        Pair pair = (Pair) obj;
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.getFirst();
    }

    @Override // kotlinx.serialization.internal.Y
    public final Object b(Object obj) {
        Pair pair = (Pair) obj;
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.getSecond();
    }

    @Override // kotlinx.serialization.internal.Y
    public final Object c(Object obj, Object obj2) {
        return TuplesKt.to(obj, obj2);
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return this.c;
    }
}
