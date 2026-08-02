package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlinx.serialization.internal.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1125a<Element, Collection, Builder> implements kotlinx.serialization.b<Collection> {
    public abstract Builder a();

    public abstract int b(Builder builder);

    public abstract void c(int i, Object obj);

    public abstract Iterator<Element> d(Collection collection);

    public Collection deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return (Collection) f(decoder);
    }

    public abstract int e(Collection collection);

    public final Object f(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Builder a = a();
        int b = b(a);
        kotlinx.serialization.encoding.c beginStructure = decoder.beginStructure(getDescriptor());
        if (!beginStructure.decodeSequentially()) {
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor());
                if (decodeElementIndex == -1) {
                    break;
                }
                h(beginStructure, decodeElementIndex + b, a);
            }
        } else {
            int decodeCollectionSize = beginStructure.decodeCollectionSize(getDescriptor());
            c(decodeCollectionSize, a);
            g(beginStructure, a, b, decodeCollectionSize);
        }
        beginStructure.endStructure(getDescriptor());
        return j(a);
    }

    public abstract void g(kotlinx.serialization.encoding.c cVar, Builder builder, int i, int i2);

    public abstract void h(kotlinx.serialization.encoding.c cVar, int i, Object obj);

    public abstract Builder i(Collection collection);

    public abstract Collection j(Builder builder);
}
