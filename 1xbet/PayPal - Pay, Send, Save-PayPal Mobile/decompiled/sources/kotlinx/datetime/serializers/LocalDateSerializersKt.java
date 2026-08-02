package kotlinx.datetime.serializers;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/datetime/format/DateTimeFormat;", "", "serialName", "Lkotlinx/serialization/KSerializer;", "asKSerializer", "(Lkotlinx/datetime/format/DateTimeFormat;Ljava/lang/String;)Lkotlinx/serialization/KSerializer;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LocalDateSerializersKt {
    public static final <T> kotlinx.serialization.KSerializer<T> asKSerializer(final kotlinx.datetime.format.DateTimeFormat<T> dateTimeFormat, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new kotlinx.serialization.KSerializer<T>(str, dateTimeFormat) { // from class: kotlinx.datetime.serializers.LocalDateSerializersKt$asKSerializer$1
            private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;
            final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
            final /* synthetic */ kotlinx.datetime.format.DateTimeFormat<T> getHighSpeedVideoFpsRangesFor;

            {
                this.getHighSpeedVideoFpsRanges = str;
                this.getHighSpeedVideoFpsRangesFor = dateTimeFormat;
                this.descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.PrimitiveSerialDescriptor(str, kotlinx.serialization.descriptors.PrimitiveKind.STRING.INSTANCE);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return this.descriptor;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final T deserialize(kotlinx.serialization.encoding.Decoder decoder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
                return this.getHighSpeedVideoFpsRangesFor.parse(decoder.decodeString());
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final void serialize(kotlinx.serialization.encoding.Encoder encoder, T value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
                encoder.encodeString(this.getHighSpeedVideoFpsRangesFor.format(value));
            }

            /* renamed from: toString, reason: from getter */
            public final java.lang.String getGetHighSpeedVideoFpsRanges() {
                return this.getHighSpeedVideoFpsRanges;
            }
        };
    }
}
