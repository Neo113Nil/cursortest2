package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/FinancialActivitiesOverview$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/FinancialActivitiesOverview;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/FinancialActivitiesOverview;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/FinancialActivitiesOverview;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class FinancialActivitiesOverview$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview$$serializer financialActivitiesOverview$$serializer = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview$$serializer();
        INSTANCE = financialActivitiesOverview$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview", financialActivitiesOverview$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("repaymentActivity", false);
        pluginGeneratedSerialDescriptor.addElement("creditActivities", false);
        pluginGeneratedSerialDescriptor.addElement("servicingContact", false);
        pluginGeneratedSerialDescriptor.addElement("nextOffset", false);
        pluginGeneratedSerialDescriptor.addElement("hasNextPage", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FinancialActivitiesOverview$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[0].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[1].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        boolean z;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact;
        java.lang.Integer num;
        java.util.List list;
        java.util.List list2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            java.util.List list3 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            java.util.List list4 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact$$serializer.INSTANCE, null);
            list = list4;
            list2 = list3;
            num = (java.lang.Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            z = beginStructure.decodeBooleanElement(serialDescriptor, 4);
            customerServiceContact = customerServiceContact2;
            i = 31;
        } else {
            boolean z2 = false;
            boolean z3 = true;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact3 = null;
            java.lang.Integer num2 = null;
            java.util.List list5 = null;
            java.util.List list6 = null;
            int i2 = 0;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z3 = false;
                } else if (decodeElementIndex == 0) {
                    list6 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), list6);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    list5 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), list5);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    customerServiceContact3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact$$serializer.INSTANCE, customerServiceContact3);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    num2 = (java.lang.Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.IntSerializer.INSTANCE, num2);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    z2 = beginStructure.decodeBooleanElement(serialDescriptor, 4);
                    i2 |= 16;
                }
            }
            z = z2;
            i = i2;
            customerServiceContact = customerServiceContact3;
            num = num2;
            list = list5;
            list2 = list6;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview(i, list2, list, customerServiceContact, num, z, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview.write$Self$revolvingcredit_servicing_prodRelease(value, beginStructure, serialDescriptor);
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
