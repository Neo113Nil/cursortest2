package kotlinx.serialization.json.internal;

/* compiled from: StreamingJsonEncoder.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005\"\u0018\u0010\u0006\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"unsignedNumberDescriptors", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "isUnsignedNumber", "", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "isUnquotedLiteral", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StreamingJsonEncoderKt {
    private static final java.util.Set<kotlinx.serialization.descriptors.SerialDescriptor> unsignedNumberDescriptors = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new kotlinx.serialization.descriptors.SerialDescriptor[]{kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.UInt.INSTANCE).getDescriptor(), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.ULong.INSTANCE).getDescriptor(), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.UByte.INSTANCE).getDescriptor(), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.UShort.INSTANCE).getDescriptor()});

    public static final boolean isUnsignedNumber(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return serialDescriptor.getIsInline() && unsignedNumberDescriptors.contains(serialDescriptor);
    }

    public static final boolean isUnquotedLiteral(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return serialDescriptor.getIsInline() && kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptor, kotlinx.serialization.json.JsonElementKt.getJsonUnquotedLiteralDescriptor());
    }
}
