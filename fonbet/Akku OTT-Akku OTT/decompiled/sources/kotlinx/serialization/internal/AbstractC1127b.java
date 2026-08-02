package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@SourceDebugExtension({"SMAP\nAbstractPolymorphicSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPolymorphicSerializer.kt\nkotlinx/serialization/internal/AbstractPolymorphicSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n475#2,2:116\n477#2,2:119\n82#3:118\n570#4,2:121\n572#4,2:124\n1#5:123\n*S KotlinDebug\n*F\n+ 1 AbstractPolymorphicSerializer.kt\nkotlinx/serialization/internal/AbstractPolymorphicSerializer\n*L\n33#1:116,2\n33#1:119,2\n35#1:118\n39#1:121,2\n39#1:124,2\n*E\n"})
/* renamed from: kotlinx.serialization.internal.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1127b<T> implements kotlinx.serialization.b<T> {
    public kotlinx.serialization.a<T> a(kotlinx.serialization.encoding.c decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.getSerializersModule().e(str, c());
    }

    public kotlinx.serialization.k b(kotlinx.serialization.encoding.b encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        return encoder.getSerializersModule().f(c(), value);
    }

    public abstract KClass<T> c();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.a
    public final T deserialize(kotlinx.serialization.encoding.e decoder) {
        T t;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.f descriptor = getDescriptor();
        kotlinx.serialization.encoding.c beginStructure = decoder.beginStructure(descriptor);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (beginStructure.decodeSequentially()) {
            t = (T) beginStructure.decodeSerializableElement(getDescriptor(), 1, kotlinx.serialization.g.a(this, beginStructure, beginStructure.decodeStringElement(getDescriptor(), 0)), null);
        } else {
            Object obj = null;
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor());
                if (decodeElementIndex != -1) {
                    if (decodeElementIndex == 0) {
                        objectRef.element = (T) beginStructure.decodeStringElement(getDescriptor(), decodeElementIndex);
                    } else {
                        if (decodeElementIndex != 1) {
                            StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                            String str = (String) objectRef.element;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(decodeElementIndex);
                            throw new kotlinx.serialization.j(sb.toString());
                        }
                        T t2 = objectRef.element;
                        if (t2 == 0) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        objectRef.element = t2;
                        obj = beginStructure.decodeSerializableElement(getDescriptor(), decodeElementIndex, kotlinx.serialization.g.a(this, beginStructure, (String) t2), null);
                    }
                } else {
                    if (obj == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) objectRef.element)).toString());
                    }
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                    t = (T) obj;
                }
            }
        }
        beginStructure.endStructure(descriptor);
        return t;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.k<? super T> b = kotlinx.serialization.g.b(this, (kotlinx.serialization.encoding.b) encoder, value);
        kotlinx.serialization.descriptors.f descriptor = getDescriptor();
        kotlinx.serialization.encoding.d beginStructure = encoder.beginStructure(descriptor);
        beginStructure.encodeStringElement(getDescriptor(), 0, b.getDescriptor().h());
        kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
        Intrinsics.checkNotNull(b, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        beginStructure.encodeSerializableElement(descriptor2, 1, b, value);
        beginStructure.endStructure(descriptor);
    }
}
