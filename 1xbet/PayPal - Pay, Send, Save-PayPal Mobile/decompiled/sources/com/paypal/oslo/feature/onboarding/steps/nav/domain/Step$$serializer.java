package com.paypal.oslo.feature.onboarding.steps.nav.domain;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class Step$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.onboarding.steps.nav.domain.Step> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.onboarding.steps.nav.domain.Step$$serializer step$$serializer = new com.paypal.oslo.feature.onboarding.steps.nav.domain.Step$$serializer();
        INSTANCE = step$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.onboarding.steps.nav.domain.Step", step$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, false);
        pluginGeneratedSerialDescriptor.addElement("initialFlowId", false);
        pluginGeneratedSerialDescriptor.addElement("stepId", false);
        pluginGeneratedSerialDescriptor.addElement("supportedTransitions", false);
        pluginGeneratedSerialDescriptor.addElement("flowData", true);
        pluginGeneratedSerialDescriptor.addElement("progress", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Step$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.onboarding.steps.nav.domain.Step.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId$$serializer.INSTANCE, com.paypal.oslo.feature.onboarding.api.steps.domain.StepId$$serializer.INSTANCE, lazyArr[3].getValue(), lazyArr[4].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.oneonboarding.api.domain.Progress$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.util.List list;
        com.paypal.oslo.feature.oneonboarding.api.domain.Progress progress;
        int i;
        java.util.Set set;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.onboarding.steps.nav.domain.Step.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId flowId = (com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId$$serializer.INSTANCE, null);
            java.lang.String m16026unboximpl = flowId != null ? flowId.m16026unboximpl() : null;
            com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId flowId2 = (com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId$$serializer.INSTANCE, null);
            java.lang.String m16026unboximpl2 = flowId2 != null ? flowId2.m16026unboximpl() : null;
            com.paypal.oslo.feature.onboarding.api.steps.domain.StepId stepId = (com.paypal.oslo.feature.onboarding.api.steps.domain.StepId) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.onboarding.api.steps.domain.StepId$$serializer.INSTANCE, null);
            java.lang.String m16035unboximpl = stepId != null ? stepId.m16035unboximpl() : null;
            java.util.Set set2 = (java.util.Set) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            list = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            str3 = m16026unboximpl;
            progress = (com.paypal.oslo.feature.oneonboarding.api.domain.Progress) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.oneonboarding.api.domain.Progress$$serializer.INSTANCE, null);
            str2 = m16035unboximpl;
            set = set2;
            str = m16026unboximpl2;
            i = 63;
        } else {
            int i2 = 0;
            boolean z = true;
            java.util.List list2 = null;
            java.lang.String str4 = null;
            com.paypal.oslo.feature.oneonboarding.api.domain.Progress progress2 = null;
            java.lang.String str5 = null;
            java.util.Set set3 = null;
            java.lang.String str6 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId flowId3 = (com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId$$serializer.INSTANCE, str4 != null ? com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16020boximpl(str4) : null);
                        str4 = flowId3 != null ? flowId3.m16026unboximpl() : null;
                        i2 |= 1;
                        break;
                    case 1:
                        com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId flowId4 = (com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId$$serializer.INSTANCE, str6 != null ? com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16020boximpl(str6) : null);
                        str6 = flowId4 != null ? flowId4.m16026unboximpl() : null;
                        i2 |= 2;
                        break;
                    case 2:
                        com.paypal.oslo.feature.onboarding.api.steps.domain.StepId stepId2 = (com.paypal.oslo.feature.onboarding.api.steps.domain.StepId) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.onboarding.api.steps.domain.StepId$$serializer.INSTANCE, str5 != null ? com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16029boximpl(str5) : null);
                        str5 = stepId2 != null ? stepId2.m16035unboximpl() : null;
                        i2 |= 4;
                        break;
                    case 3:
                        set3 = (java.util.Set) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), set3);
                        i2 |= 8;
                        break;
                    case 4:
                        list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), list2);
                        i2 |= 16;
                        break;
                    case 5:
                        progress2 = (com.paypal.oslo.feature.oneonboarding.api.domain.Progress) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.oneonboarding.api.domain.Progress$$serializer.INSTANCE, progress2);
                        i2 |= 32;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            list = list2;
            progress = progress2;
            i = i2;
            set = set3;
            str = str6;
            str2 = str5;
            str3 = str4;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.onboarding.steps.nav.domain.Step(i, str3, str, str2, set, list, progress, null, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.onboarding.steps.nav.domain.Step value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.onboarding.steps.nav.domain.Step.write$Self$onboarding_prodRelease(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
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
