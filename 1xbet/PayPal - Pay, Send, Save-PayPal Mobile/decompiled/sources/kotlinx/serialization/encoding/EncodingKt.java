package kotlinx.serialization.encoding;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aB\u0010\f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001ai\u0010\f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f24\b\u0004\u0010\u0007\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/Function1;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "", "Lkotlin/ExtensionFunctionType;", "block", "encodeStructure", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)V", "", "collectionSize", "encodeCollection", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlin/jvm/functions/Function1;)V", "E", "", "collection", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "index", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/util/Collection;Lkotlin/jvm/functions/Function3;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EncodingKt {
    public static final void encodeStructure(kotlinx.serialization.encoding.Encoder encoder, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlin.jvm.functions.Function1<? super kotlinx.serialization.encoding.CompositeEncoder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        function1.invoke(beginStructure);
        beginStructure.endStructure(serialDescriptor);
    }

    public static final void encodeCollection(kotlinx.serialization.encoding.Encoder encoder, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i, kotlin.jvm.functions.Function1<? super kotlinx.serialization.encoding.CompositeEncoder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlinx.serialization.encoding.CompositeEncoder beginCollection = encoder.beginCollection(serialDescriptor, i);
        function1.invoke(beginCollection);
        beginCollection.endStructure(serialDescriptor);
    }

    public static final <E> void encodeCollection(kotlinx.serialization.encoding.Encoder encoder, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, java.util.Collection<? extends E> collection, kotlin.jvm.functions.Function3<? super kotlinx.serialization.encoding.CompositeEncoder, ? super java.lang.Integer, ? super E, kotlin.Unit> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        kotlinx.serialization.encoding.CompositeEncoder beginCollection = encoder.beginCollection(serialDescriptor, collection.size());
        java.util.Iterator<T> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            amex.AMEXKernel aMEXKernel = (java.lang.Object) it.next();
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            function3.invoke(beginCollection, java.lang.Integer.valueOf(i), aMEXKernel);
            i++;
        }
        beginCollection.endStructure(serialDescriptor);
    }
}
