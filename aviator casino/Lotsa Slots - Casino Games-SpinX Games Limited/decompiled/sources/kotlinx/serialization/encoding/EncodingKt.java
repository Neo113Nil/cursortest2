package kotlinx.serialization.encoding;

/* compiled from: Encoding.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u001a;\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u001ab\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e24\b\u0004\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"encodeStructure", "", "Lkotlinx/serialization/encoding/Encoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "block", "Lkotlin/Function1;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "Lkotlin/ExtensionFunctionType;", "encodeCollection", "collectionSize", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "collection", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EncodingKt {
    public static final void encodeStructure(kotlinx.serialization.encoding.Encoder encoder, kotlinx.serialization.descriptors.SerialDescriptor descriptor, kotlin.jvm.functions.Function1<? super kotlinx.serialization.encoding.CompositeEncoder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        block.invoke(beginStructure);
        beginStructure.endStructure(descriptor);
    }

    public static final void encodeCollection(kotlinx.serialization.encoding.Encoder encoder, kotlinx.serialization.descriptors.SerialDescriptor descriptor, int i, kotlin.jvm.functions.Function1<? super kotlinx.serialization.encoding.CompositeEncoder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        kotlinx.serialization.encoding.CompositeEncoder beginCollection = encoder.beginCollection(descriptor, i);
        block.invoke(beginCollection);
        beginCollection.endStructure(descriptor);
    }

    public static final <E> void encodeCollection(kotlinx.serialization.encoding.Encoder encoder, kotlinx.serialization.descriptors.SerialDescriptor descriptor, java.util.Collection<? extends E> collection, kotlin.jvm.functions.Function3<? super kotlinx.serialization.encoding.CompositeEncoder, ? super java.lang.Integer, ? super E, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "collection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        kotlinx.serialization.encoding.CompositeEncoder beginCollection = encoder.beginCollection(descriptor, collection.size());
        java.util.Iterator<T> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            android.R.anim animVar = (java.lang.Object) it.next();
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            block.invoke(beginCollection, java.lang.Integer.valueOf(i), animVar);
            i = i2;
        }
        beginCollection.endStructure(descriptor);
    }
}
