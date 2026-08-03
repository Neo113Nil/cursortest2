package kotlinx.serialization.json;

/* compiled from: JsonElementSerializers.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0005H\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0003H\u0000\u001a\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0002¨\u0006\u000e"}, d2 = {"verify", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "asJsonDecoder", "Lkotlinx/serialization/json/JsonDecoder;", "asJsonEncoder", "Lkotlinx/serialization/json/JsonEncoder;", "defer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "deferred", "Lkotlin/Function0;", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonElementSerializersKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void verify(kotlinx.serialization.encoding.Encoder encoder) {
        asJsonEncoder(encoder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void verify(kotlinx.serialization.encoding.Decoder decoder) {
        asJsonDecoder(decoder);
    }

    public static final kotlinx.serialization.json.JsonDecoder asJsonDecoder(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "<this>");
        kotlinx.serialization.json.JsonDecoder jsonDecoder = decoder instanceof kotlinx.serialization.json.JsonDecoder ? (kotlinx.serialization.json.JsonDecoder) decoder : null;
        if (jsonDecoder != null) {
            return jsonDecoder;
        }
        throw new java.lang.IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(decoder.getClass()));
    }

    public static final kotlinx.serialization.json.JsonEncoder asJsonEncoder(kotlinx.serialization.encoding.Encoder encoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "<this>");
        kotlinx.serialization.json.JsonEncoder jsonEncoder = encoder instanceof kotlinx.serialization.json.JsonEncoder ? (kotlinx.serialization.json.JsonEncoder) encoder : null;
        if (jsonEncoder != null) {
            return jsonEncoder;
        }
        throw new java.lang.IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(encoder.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.serialization.descriptors.SerialDescriptor defer(final kotlin.jvm.functions.Function0<? extends kotlinx.serialization.descriptors.SerialDescriptor> function0) {
        return new kotlinx.serialization.descriptors.SerialDescriptor(function0) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1

            /* renamed from: original$delegate, reason: from kotlin metadata */
            private final kotlin.Lazy original;

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public /* synthetic */ java.util.List getAnnotations() {
                return kotlinx.serialization.descriptors.SerialDescriptor.CC.$default$getAnnotations(this);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            /* renamed from: isInline */
            public /* synthetic */ boolean getIsInline() {
                return kotlinx.serialization.descriptors.SerialDescriptor.CC.$default$isInline(this);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public /* synthetic */ boolean isNullable() {
                return kotlinx.serialization.descriptors.SerialDescriptor.CC.$default$isNullable(this);
            }

            {
                this.original = kotlin.LazyKt.lazy(function0);
            }

            private final kotlinx.serialization.descriptors.SerialDescriptor getOriginal() {
                return (kotlinx.serialization.descriptors.SerialDescriptor) this.original.getValue();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public java.lang.String getSerialName() {
                return getOriginal().getSerialName();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public kotlinx.serialization.descriptors.SerialKind getKind() {
                return getOriginal().getKind();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public int getElementsCount() {
                return getOriginal().getElementsCount();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public java.lang.String getElementName(int index) {
                return getOriginal().getElementName(index);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public int getElementIndex(java.lang.String name) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
                return getOriginal().getElementIndex(name);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public java.util.List<java.lang.annotation.Annotation> getElementAnnotations(int index) {
                return getOriginal().getElementAnnotations(index);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public kotlinx.serialization.descriptors.SerialDescriptor getElementDescriptor(int index) {
                return getOriginal().getElementDescriptor(index);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public boolean isElementOptional(int index) {
                return getOriginal().isElementOptional(index);
            }
        };
    }
}
