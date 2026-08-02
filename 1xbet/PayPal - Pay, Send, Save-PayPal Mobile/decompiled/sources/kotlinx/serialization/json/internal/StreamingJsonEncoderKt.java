package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0006\u001a\u00020\u0005*\u00020\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007"}, d2 = {"", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges", "", "isUnsignedNumber", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "isUnquotedLiteral"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StreamingJsonEncoderKt {
    private static final java.util.Set<kotlinx.serialization.descriptors.SerialDescriptor> Camera2StreamConfigurationMap = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new kotlinx.serialization.descriptors.SerialDescriptor[]{kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.UInt.INSTANCE).getDescriptor(), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.ULong.INSTANCE).getDescriptor(), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.UByte.INSTANCE).getDescriptor(), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.UShort.INSTANCE).getDescriptor()});

    public static final boolean isUnsignedNumber(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return serialDescriptor.getIsInline() && Camera2StreamConfigurationMap.contains(serialDescriptor);
    }

    public static final boolean isUnquotedLiteral(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return serialDescriptor.getIsInline() && kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptor, kotlinx.serialization.json.JsonElementKt.getJsonUnquotedLiteralDescriptor());
    }
}
