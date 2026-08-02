package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/serialization/json/JsonObjectSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonObject;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/JsonObject;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "JsonObjectDescriptor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonObjectSerializer implements kotlinx.serialization.KSerializer<kotlinx.serialization.json.JsonObject> {
    public static final kotlinx.serialization.json.JsonObjectSerializer INSTANCE = new kotlinx.serialization.json.JsonObjectSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.json.JsonObjectSerializer.JsonObjectDescriptor.INSTANCE;

    private JsonObjectSerializer() {
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00048\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00118WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00118WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010&\u001a\u00020#8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Lkotlinx/serialization/json/JsonObjectSerializer$JsonObjectDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "", "p0", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "getElementIndex", "(Ljava/lang/String;)I", "getElementName", "(I)Ljava/lang/String;", "", "isElementOptional", "(I)Z", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "getAnnotations", "()Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "getElementsCount", "()I", "getHighSpeedVideoSizes", "isInline", "()Z", "Camera2StreamConfigurationMap", "isNullable", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "getInputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    static final class JsonObjectDescriptor implements kotlinx.serialization.descriptors.SerialDescriptor {
        public static final kotlinx.serialization.json.JsonObjectSerializer.JsonObjectDescriptor INSTANCE = new kotlinx.serialization.json.JsonObjectSerializer.JsonObjectDescriptor();
        private static final java.lang.String getHighSpeedVideoFpsRanges = "kotlinx.serialization.json.JsonObject";
        private final /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor Camera2StreamConfigurationMap = kotlinx.serialization.builtins.BuiltinSerializersKt.MapSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE), kotlinx.serialization.json.JsonElementSerializer.INSTANCE).getDescriptor();

        private JsonObjectDescriptor() {
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: getSerialName */
        public final java.lang.String getGetHighSpeedVideoSizes() {
            return getHighSpeedVideoFpsRanges;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean isNullable() {
            return this.Camera2StreamConfigurationMap.isNullable();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: isInline */
        public final boolean getIsInline() {
            return this.Camera2StreamConfigurationMap.getIsInline();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean isElementOptional(int p0) {
            return this.Camera2StreamConfigurationMap.isElementOptional(p0);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final kotlinx.serialization.descriptors.SerialKind getKind() {
            return this.Camera2StreamConfigurationMap.getKind();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final int getElementsCount() {
            return this.Camera2StreamConfigurationMap.getElementsCount();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final java.lang.String getElementName(int p0) {
            return this.Camera2StreamConfigurationMap.getElementName(p0);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final int getElementIndex(java.lang.String p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return this.Camera2StreamConfigurationMap.getElementIndex(p0);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final kotlinx.serialization.descriptors.SerialDescriptor getElementDescriptor(int p0) {
            return this.Camera2StreamConfigurationMap.getElementDescriptor(p0);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final java.util.List<java.lang.annotation.Annotation> getElementAnnotations(int p0) {
            return this.Camera2StreamConfigurationMap.getElementAnnotations(p0);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final java.util.List<java.lang.annotation.Annotation> getAnnotations() {
            return this.Camera2StreamConfigurationMap.getAnnotations();
        }
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlinx.serialization.json.JsonObject value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.json.JsonElementSerializersKt.asJsonEncoder(encoder);
        kotlinx.serialization.builtins.BuiltinSerializersKt.MapSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE), kotlinx.serialization.json.JsonElementSerializer.INSTANCE).serialize(encoder, value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.json.JsonObject deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.json.JsonElementSerializersKt.asJsonDecoder(decoder);
        return new kotlinx.serialization.json.JsonObject((java.util.Map) kotlinx.serialization.builtins.BuiltinSerializersKt.MapSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE), kotlinx.serialization.json.JsonElementSerializer.INSTANCE).deserialize(decoder));
    }
}
