package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
/* loaded from: classes5.dex */
public final class U0<A, B, C> implements kotlinx.serialization.b<Triple<? extends A, ? extends B, ? extends C>> {
    public final kotlinx.serialization.b<A> a;
    public final kotlinx.serialization.b<B> b;
    public final kotlinx.serialization.b<C> c;
    public final kotlinx.serialization.descriptors.i d;

    public U0(kotlinx.serialization.b<A> aSerializer, kotlinx.serialization.b<B> bSerializer, kotlinx.serialization.b<C> cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        this.a = aSerializer;
        this.b = bSerializer;
        this.c = cSerializer;
        this.d = kotlinx.serialization.descriptors.l.b("kotlin.Triple", new kotlinx.serialization.descriptors.f[0], new Function1() { // from class: kotlinx.serialization.internal.T0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kotlinx.serialization.descriptors.a buildClassSerialDescriptor = (kotlinx.serialization.descriptors.a) obj;
                Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                U0 u0 = U0.this;
                buildClassSerialDescriptor.a("first", u0.a.getDescriptor(), CollectionsKt.emptyList());
                buildClassSerialDescriptor.a("second", u0.b.getDescriptor(), CollectionsKt.emptyList());
                buildClassSerialDescriptor.a("third", u0.c.getDescriptor(), CollectionsKt.emptyList());
                return Unit.INSTANCE;
            }
        });
    }

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.i iVar = this.d;
        kotlinx.serialization.encoding.c beginStructure = decoder.beginStructure(iVar);
        boolean decodeSequentially = beginStructure.decodeSequentially();
        kotlinx.serialization.b<C> bVar = this.c;
        kotlinx.serialization.b<B> bVar2 = this.b;
        kotlinx.serialization.b<A> bVar3 = this.a;
        if (decodeSequentially) {
            Object decodeSerializableElement = beginStructure.decodeSerializableElement(iVar, 0, bVar3, null);
            Object decodeSerializableElement2 = beginStructure.decodeSerializableElement(iVar, 1, bVar2, null);
            Object decodeSerializableElement3 = beginStructure.decodeSerializableElement(iVar, 2, bVar, null);
            beginStructure.endStructure(iVar);
            return new Triple(decodeSerializableElement, decodeSerializableElement2, decodeSerializableElement3);
        }
        Object obj = V0.a;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int decodeElementIndex = beginStructure.decodeElementIndex(iVar);
            if (decodeElementIndex == -1) {
                beginStructure.endStructure(iVar);
                if (obj2 == obj) {
                    throw new kotlinx.serialization.j("Element 'first' is missing");
                }
                if (obj3 == obj) {
                    throw new kotlinx.serialization.j("Element 'second' is missing");
                }
                if (obj4 != obj) {
                    return new Triple(obj2, obj3, obj4);
                }
                throw new kotlinx.serialization.j("Element 'third' is missing");
            }
            if (decodeElementIndex == 0) {
                obj2 = beginStructure.decodeSerializableElement(iVar, 0, bVar3, null);
            } else if (decodeElementIndex == 1) {
                obj3 = beginStructure.decodeSerializableElement(iVar, 1, bVar2, null);
            } else {
                if (decodeElementIndex != 2) {
                    throw new kotlinx.serialization.j(android.support.v4.media.a.a(decodeElementIndex, "Unexpected index "));
                }
                obj4 = beginStructure.decodeSerializableElement(iVar, 2, bVar, null);
            }
        }
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return this.d;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        Triple value = (Triple) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.descriptors.i iVar = this.d;
        kotlinx.serialization.encoding.d beginStructure = encoder.beginStructure(iVar);
        beginStructure.encodeSerializableElement(iVar, 0, this.a, value.getFirst());
        beginStructure.encodeSerializableElement(iVar, 1, this.b, value.getSecond());
        beginStructure.encodeSerializableElement(iVar, 2, this.c, value.getThird());
        beginStructure.endStructure(iVar);
    }
}
