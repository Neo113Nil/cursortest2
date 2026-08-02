package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/BuildingName$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/BuildingName;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-f8-gp8E", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/String;", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize-CMN3QfY", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/String;)V", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class BuildingName$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.core.i18n.domain.model.BuildingName> {
    public static final com.paypal.oslo.core.i18n.domain.model.BuildingName$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.core.i18n.domain.model.BuildingName$$serializer buildingName$$serializer = new com.paypal.oslo.core.i18n.domain.model.BuildingName$$serializer();
        INSTANCE = buildingName$$serializer;
        kotlinx.serialization.internal.InlineClassDescriptor inlineClassDescriptor = new kotlinx.serialization.internal.InlineClassDescriptor("com.paypal.oslo.core.i18n.domain.model.BuildingName", buildingName$$serializer);
        inlineClassDescriptor.addElement(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, false);
        descriptor = inlineClassDescriptor;
    }

    private BuildingName$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final /* synthetic */ java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        return com.paypal.oslo.core.i18n.domain.model.BuildingName.m11336boximpl(m11343deserializef8gp8E(decoder));
    }

    /* renamed from: deserialize-f8-gp8E, reason: not valid java name */
    public final java.lang.String m11343deserializef8gp8E(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        return com.paypal.oslo.core.i18n.domain.model.BuildingName.m11337constructorimpl(decoder.decodeInline(descriptor).decodeString());
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final /* synthetic */ void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        m11344serializeCMN3QfY(encoder, ((com.paypal.oslo.core.i18n.domain.model.BuildingName) obj).m11342unboximpl());
    }

    /* renamed from: serialize-CMN3QfY, reason: not valid java name */
    public final void m11344serializeCMN3QfY(kotlinx.serialization.encoding.Encoder encoder, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.encoding.Encoder encodeInline = encoder.encodeInline(descriptor);
        if (encodeInline == null) {
            return;
        }
        encodeInline.encodeString(value);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }
}
