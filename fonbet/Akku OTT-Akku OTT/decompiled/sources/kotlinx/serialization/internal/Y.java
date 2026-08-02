package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@PublishedApi
@SourceDebugExtension({"SMAP\nTuples.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tuples.kt\nkotlinx/serialization/internal/KeyValueSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,168:1\n570#2,4:169\n*S KotlinDebug\n*F\n+ 1 Tuples.kt\nkotlinx/serialization/internal/KeyValueSerializer\n*L\n35#1:169,4\n*E\n"})
/* loaded from: classes5.dex */
public abstract class Y<K, V, R> implements kotlinx.serialization.b<R> {
    public final kotlinx.serialization.b<K> a;
    public final kotlinx.serialization.b<V> b;

    public Y(kotlinx.serialization.b bVar, kotlinx.serialization.b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    public abstract K a(R r);

    public abstract V b(R r);

    public abstract R c(K k, V v);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.a
    public final R deserialize(kotlinx.serialization.encoding.e decoder) {
        R r;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.f descriptor = getDescriptor();
        kotlinx.serialization.encoding.c beginStructure = decoder.beginStructure(descriptor);
        boolean decodeSequentially = beginStructure.decodeSequentially();
        kotlinx.serialization.b<V> bVar = this.b;
        kotlinx.serialization.b<K> bVar2 = this.a;
        if (decodeSequentially) {
            r = (R) c(beginStructure.decodeSerializableElement(getDescriptor(), 0, bVar2, null), beginStructure.decodeSerializableElement(getDescriptor(), 1, bVar, null));
        } else {
            Object obj = V0.a;
            Object obj2 = obj;
            Object obj3 = obj2;
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor());
                if (decodeElementIndex != -1) {
                    if (decodeElementIndex == 0) {
                        obj2 = beginStructure.decodeSerializableElement(getDescriptor(), 0, bVar2, null);
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new kotlinx.serialization.j(android.support.v4.media.a.a(decodeElementIndex, "Invalid index: "));
                        }
                        obj3 = beginStructure.decodeSerializableElement(getDescriptor(), 1, bVar, null);
                    }
                } else {
                    if (obj2 == obj) {
                        throw new kotlinx.serialization.j("Element 'key' is missing");
                    }
                    if (obj3 == obj) {
                        throw new kotlinx.serialization.j("Element 'value' is missing");
                    }
                    r = (R) c(obj2, obj3);
                }
            }
        }
        beginStructure.endStructure(descriptor);
        return r;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, R r) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlinx.serialization.encoding.d beginStructure = encoder.beginStructure(getDescriptor());
        beginStructure.encodeSerializableElement(getDescriptor(), 0, this.a, a(r));
        beginStructure.encodeSerializableElement(getDescriptor(), 1, this.b, b(r));
        beginStructure.endStructure(getDescriptor());
    }
}
