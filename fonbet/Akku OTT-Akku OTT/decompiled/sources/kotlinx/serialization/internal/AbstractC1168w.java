package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@PublishedApi
@SourceDebugExtension({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/CollectionLikeSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,283:1\n488#2,4:284\n1#3:288\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/CollectionLikeSerializer\n*L\n66#1:284,4\n*E\n"})
/* renamed from: kotlinx.serialization.internal.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1168w<Element, Collection, Builder> extends AbstractC1125a<Element, Collection, Builder> {
    public final kotlinx.serialization.b<Element> a;

    public AbstractC1168w(kotlinx.serialization.b bVar) {
        this.a = bVar;
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final void g(kotlinx.serialization.encoding.c decoder, Builder builder, int i, int i2) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (i2 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            h(decoder, i + i3, builder);
        }
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public void h(kotlinx.serialization.encoding.c decoder, int i, Object obj) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        k(i, obj, decoder.decodeSerializableElement(getDescriptor(), i, this.a, null));
    }

    public abstract void k(int i, Object obj, Object obj2);

    @Override // kotlinx.serialization.k
    public void serialize(kotlinx.serialization.encoding.f encoder, Collection collection) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int e = e(collection);
        kotlinx.serialization.descriptors.f descriptor = getDescriptor();
        kotlinx.serialization.encoding.d beginCollection = encoder.beginCollection(descriptor, e);
        Iterator<Element> d = d(collection);
        for (int i = 0; i < e; i++) {
            beginCollection.encodeSerializableElement(getDescriptor(), i, this.a, d.next());
        }
        beginCollection.endStructure(descriptor);
    }
}
