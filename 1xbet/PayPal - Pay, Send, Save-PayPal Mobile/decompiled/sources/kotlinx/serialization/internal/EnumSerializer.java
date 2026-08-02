package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tB'\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010\u000b\u001a\u00020\n8WX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lkotlinx/serialization/internal/EnumSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "", "serialName", "", "values", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "(Ljava/lang/String;[Ljava/lang/Enum;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "[Ljava/lang/Enum;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor$delegate", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnumSerializer<T extends java.lang.Enum<T>> implements kotlinx.serialization.KSerializer<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlinx.serialization.descriptors.SerialDescriptor getHighSpeedVideoSizes;

    /* renamed from: descriptor$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy descriptor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final T[] getHighSpeedVideoFpsRangesFor;

    public EnumSerializer(final java.lang.String str, T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        this.getHighSpeedVideoFpsRangesFor = tArr;
        this.descriptor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.internal.EnumSerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kotlinx.serialization.internal.EnumSerializer.$r8$lambda$TJMXX3M6I7vxH4CVgqgiNEiaiFI(kotlinx.serialization.internal.EnumSerializer.this, str);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumSerializer(java.lang.String str, T[] tArr, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        this(str, tArr);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        this.getHighSpeedVideoSizes = serialDescriptor;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return (kotlinx.serialization.descriptors.SerialDescriptor) this.descriptor.getValue();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        int indexOf = kotlin.collections.ArraysKt.indexOf(this.getHighSpeedVideoFpsRangesFor, value);
        if (indexOf == -1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(value);
            sb.append(" is not a valid enum ");
            sb.append(getDescriptor().getGetHighSpeedVideoSizes());
            sb.append(", must be one of ");
            java.lang.String arrays = java.util.Arrays.toString(this.getHighSpeedVideoFpsRangesFor);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
            sb.append(arrays);
            throw new kotlinx.serialization.SerializationException(sb.toString());
        }
        encoder.encodeEnum(getDescriptor(), indexOf);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        int decodeEnum = decoder.decodeEnum(getDescriptor());
        if (decodeEnum >= 0) {
            T[] tArr = this.getHighSpeedVideoFpsRangesFor;
            if (decodeEnum < tArr.length) {
                return tArr[decodeEnum];
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(decodeEnum);
        sb.append(" is not among valid ");
        sb.append(getDescriptor().getGetHighSpeedVideoSizes());
        sb.append(" enum values, values size is ");
        sb.append(this.getHighSpeedVideoFpsRangesFor.length);
        throw new kotlinx.serialization.SerializationException(sb.toString());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("kotlinx.serialization.internal.EnumSerializer<");
        sb.append(getDescriptor().getGetHighSpeedVideoSizes());
        sb.append(kotlin.text.Typography.greater);
        return sb.toString();
    }

    public static /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor $r8$lambda$TJMXX3M6I7vxH4CVgqgiNEiaiFI(kotlinx.serialization.internal.EnumSerializer enumSerializer, java.lang.String str) {
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = enumSerializer.getHighSpeedVideoSizes;
        if (serialDescriptor != null) {
            return serialDescriptor;
        }
        kotlinx.serialization.internal.EnumDescriptor enumDescriptor = new kotlinx.serialization.internal.EnumDescriptor(str, enumSerializer.getHighSpeedVideoFpsRangesFor.length);
        for (T t : enumSerializer.getHighSpeedVideoFpsRangesFor) {
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor.addElement$default(enumDescriptor, t.name(), false, 2, null);
        }
        return enumDescriptor;
    }
}
