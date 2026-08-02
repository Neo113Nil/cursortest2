package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/savedstate/serialization/EmptyArrayDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "p0", "", "decodeElementIndex", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "Lkotlinx/serialization/modules/SerializersModule;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class EmptyArrayDecoder extends kotlinx.serialization.encoding.AbstractDecoder {
    public static final androidx.view.serialization.EmptyArrayDecoder INSTANCE = new androidx.view.serialization.EmptyArrayDecoder();
    private static final kotlinx.serialization.modules.SerializersModule getHighResolutionOutputSizeshNQ4ISI = kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule();

    private EmptyArrayDecoder() {
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public final kotlinx.serialization.modules.SerializersModule getSerializersModule() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(kotlinx.serialization.descriptors.SerialDescriptor p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return -1;
    }
}
