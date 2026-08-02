package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/json/JsonDecoder;", "asJsonDecoder", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/json/JsonEncoder;", "asJsonEncoder", "(Lkotlinx/serialization/encoding/Encoder;)Lkotlinx/serialization/json/JsonEncoder;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonElementSerializersKt {
    public static final kotlinx.serialization.json.JsonDecoder asJsonDecoder(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.json.JsonDecoder jsonDecoder = decoder instanceof kotlinx.serialization.json.JsonDecoder ? (kotlinx.serialization.json.JsonDecoder) decoder : null;
        if (jsonDecoder != null) {
            return jsonDecoder;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(decoder.getClass()));
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public static final kotlinx.serialization.json.JsonEncoder asJsonEncoder(kotlinx.serialization.encoding.Encoder encoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlinx.serialization.json.JsonEncoder jsonEncoder = encoder instanceof kotlinx.serialization.json.JsonEncoder ? (kotlinx.serialization.json.JsonEncoder) encoder : null;
        if (jsonEncoder != null) {
            return jsonEncoder;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(encoder.getClass()));
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public static final /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor access$defer(final kotlin.jvm.functions.Function0 function0) {
        return new kotlinx.serialization.descriptors.SerialDescriptor(function0) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1

            /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
            private final kotlin.Lazy Camera2StreamConfigurationMap;

            {
                this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(function0);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public final /* bridge */ java.util.List<java.lang.annotation.Annotation> getAnnotations() {
                return super.getAnnotations();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            /* renamed from: isInline */
            public final /* bridge */ boolean getIsInline() {
                return super.getIsInline();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public final /* bridge */ boolean isNullable() {
                return super.isNullable();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public final java.util.List<java.lang.annotation.Annotation> getElementAnnotations(int index) {
                return ((kotlinx.serialization.descriptors.SerialDescriptor) this.Camera2StreamConfigurationMap.getValue()).getElementAnnotations(index);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public final kotlinx.serialization.descriptors.SerialDescriptor getElementDescriptor(int index) {
                return ((kotlinx.serialization.descriptors.SerialDescriptor) this.Camera2StreamConfigurationMap.getValue()).getElementDescriptor(index);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public final int getElementIndex(java.lang.String name2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                return ((kotlinx.serialization.descriptors.SerialDescriptor) this.Camera2StreamConfigurationMap.getValue()).getElementIndex(name2);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public final java.lang.String getElementName(int index) {
                return ((kotlinx.serialization.descriptors.SerialDescriptor) this.Camera2StreamConfigurationMap.getValue()).getElementName(index);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public final int getElementsCount() {
                return ((kotlinx.serialization.descriptors.SerialDescriptor) this.Camera2StreamConfigurationMap.getValue()).getElementsCount();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public final kotlinx.serialization.descriptors.SerialKind getKind() {
                return ((kotlinx.serialization.descriptors.SerialDescriptor) this.Camera2StreamConfigurationMap.getValue()).getKind();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public final java.lang.String getSerialName() {
                return ((kotlinx.serialization.descriptors.SerialDescriptor) this.Camera2StreamConfigurationMap.getValue()).getSerialName();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public final boolean isElementOptional(int index) {
                return ((kotlinx.serialization.descriptors.SerialDescriptor) this.Camera2StreamConfigurationMap.getValue()).isElementOptional(index);
            }
        };
    }
}
