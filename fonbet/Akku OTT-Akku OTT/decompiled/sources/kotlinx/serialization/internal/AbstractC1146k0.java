package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;

@SourceDebugExtension({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/MapLikeSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 4 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,283:1\n1#2:284\n488#3,2:285\n490#3,2:289\n32#4,2:287\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/MapLikeSerializer\n*L\n118#1:285,2\n118#1:289,2\n121#1:287,2\n*E\n"})
/* renamed from: kotlinx.serialization.internal.k0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1146k0<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractC1125a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    public final kotlinx.serialization.b<Key> a;
    public final kotlinx.serialization.b<Value> b;

    public AbstractC1146k0(kotlinx.serialization.b bVar, kotlinx.serialization.b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final void g(kotlinx.serialization.encoding.c decoder, Object obj, int i, int i2) {
        IntProgression step;
        Map builder = (Map) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (i2 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        step = RangesKt___RangesKt.step(RangesKt.until(0, i2 * 2), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 <= 0 || first > last) && (step2 >= 0 || last > first)) {
            return;
        }
        while (true) {
            k(decoder, i + first, builder, false);
            if (first == last) {
                return;
            } else {
                first += step2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final /* bridge */ /* synthetic */ void h(kotlinx.serialization.encoding.c cVar, int i, Object obj) {
        k(cVar, i, (Map) obj, true);
    }

    public final void k(kotlinx.serialization.encoding.c decoder, int i, Builder builder, boolean z) {
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object decodeSerializableElement = decoder.decodeSerializableElement(getDescriptor(), i, this.a, null);
        if (z) {
            i2 = decoder.decodeElementIndex(getDescriptor());
            if (i2 != i + 1) {
                throw new IllegalArgumentException(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a.a("Value must follow key in a map, index for key: ", i, ", returned index for value: ", i2).toString());
            }
        } else {
            i2 = i + 1;
        }
        boolean containsKey = builder.containsKey(decodeSerializableElement);
        kotlinx.serialization.b<Value> bVar = this.b;
        builder.put(decodeSerializableElement, (!containsKey || (bVar.getDescriptor().getKind() instanceof kotlinx.serialization.descriptors.e)) ? decoder.decodeSerializableElement(getDescriptor(), i2, bVar, null) : decoder.decodeSerializableElement(getDescriptor(), i2, bVar, MapsKt.getValue(builder, decodeSerializableElement)));
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Collection collection) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int e = e(collection);
        kotlinx.serialization.descriptors.f descriptor = getDescriptor();
        kotlinx.serialization.encoding.d beginCollection = encoder.beginCollection(descriptor, e);
        Iterator<Map.Entry<? extends Key, ? extends Value>> d = d(collection);
        int i = 0;
        while (d.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = d.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i2 = i + 1;
            beginCollection.encodeSerializableElement(getDescriptor(), i, this.a, key);
            i += 2;
            beginCollection.encodeSerializableElement(getDescriptor(), i2, this.b, value);
        }
        beginCollection.endStructure(descriptor);
    }
}
