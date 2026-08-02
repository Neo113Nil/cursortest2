package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.internal.G0;

@PublishedApi
@SourceDebugExtension({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/PrimitiveArraySerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n*L\n1#1,283:1\n488#2,4:284\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/PrimitiveArraySerializer\n*L\n174#1:284,4\n*E\n"})
/* loaded from: classes5.dex */
public abstract class I0<Element, Array, Builder extends G0<Array>> extends AbstractC1168w<Element, Array, Builder> {
    public final H0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(kotlinx.serialization.b<Element> primitiveSerializer) {
        super(primitiveSerializer);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.b = new H0(primitiveSerializer.getDescriptor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Object a() {
        return (G0) i(l());
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final int b(Object obj) {
        G0 g0 = (G0) obj;
        Intrinsics.checkNotNullParameter(g0, "<this>");
        return g0.d();
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final void c(int i, Object obj) {
        G0 g0 = (G0) obj;
        Intrinsics.checkNotNullParameter(g0, "<this>");
        g0.b(i);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Iterator<Element> d(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a, kotlinx.serialization.a
    public final Array deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return (Array) f(decoder);
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return this.b;
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Object j(Object obj) {
        G0 g0 = (G0) obj;
        Intrinsics.checkNotNullParameter(g0, "<this>");
        return g0.a();
    }

    @Override // kotlinx.serialization.internal.AbstractC1168w
    public final void k(int i, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter((G0) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Array l();

    public abstract void m(kotlinx.serialization.encoding.d dVar, Array array, int i);

    @Override // kotlinx.serialization.internal.AbstractC1168w, kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Array array) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int e = e(array);
        H0 h0 = this.b;
        kotlinx.serialization.encoding.d beginCollection = encoder.beginCollection(h0, e);
        m(beginCollection, array, e);
        beginCollection.endStructure(h0);
    }
}
