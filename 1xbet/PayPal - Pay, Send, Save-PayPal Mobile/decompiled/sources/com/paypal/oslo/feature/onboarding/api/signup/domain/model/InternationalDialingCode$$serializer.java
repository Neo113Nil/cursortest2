package com.paypal.oslo.feature.onboarding.api.signup.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/InternationalDialingCode$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/InternationalDialingCode;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-ZY9Srfc", "(Lkotlinx/serialization/encoding/Decoder;)I", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize-n1zdR7U", "(Lkotlinx/serialization/encoding/Encoder;I)V", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class InternationalDialingCode$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode> {
    public static final com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode$$serializer internationalDialingCode$$serializer = new com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode$$serializer();
        INSTANCE = internationalDialingCode$$serializer;
        kotlinx.serialization.internal.InlineClassDescriptor inlineClassDescriptor = new kotlinx.serialization.internal.InlineClassDescriptor("com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode", internationalDialingCode$$serializer);
        inlineClassDescriptor.addElement(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, false);
        descriptor = inlineClassDescriptor;
    }

    private InternationalDialingCode$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final /* synthetic */ java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        return com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.m15960boximpl(m15967deserializeZY9Srfc(decoder));
    }

    /* renamed from: deserialize-ZY9Srfc, reason: not valid java name */
    public final int m15967deserializeZY9Srfc(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        return com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.m15961constructorimpl(decoder.decodeInline(descriptor).decodeInt());
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final /* synthetic */ void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        m15968serializen1zdR7U(encoder, ((com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode) obj).m15966unboximpl());
    }

    /* renamed from: serialize-n1zdR7U, reason: not valid java name */
    public final void m15968serializen1zdR7U(kotlinx.serialization.encoding.Encoder encoder, int value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlinx.serialization.encoding.Encoder encodeInline = encoder.encodeInline(descriptor);
        if (encodeInline == null) {
            return;
        }
        encodeInline.encodeInt(value);
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
