package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class Invoice$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice$$serializer invoice$$serializer = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice$$serializer();
        INSTANCE = invoice$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice", invoice$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("currency", true);
        pluginGeneratedSerialDescriptor.addElement("customer", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("items", true);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, true);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, true);
        pluginGeneratedSerialDescriptor.addElement("shareUrl", true);
        pluginGeneratedSerialDescriptor.addElement("total", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Invoice$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer$$serializer.INSTANCE), lazyArr[3].getValue(), lazyArr[4].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceConfiguration$$serializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.String str;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceConfiguration invoiceConfiguration;
        java.lang.String str2;
        java.util.List list;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney;
        java.lang.String str3;
        int i;
        com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer;
        java.lang.String str4;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus invoiceStatus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        int i5 = 8;
        java.util.List list2 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 1);
            com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer2 = (com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus invoiceStatus2 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            java.util.List list3 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceConfiguration invoiceConfiguration2 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceConfiguration) beginStructure.decodeSerializableElement(serialDescriptor, 6, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceConfiguration$$serializer.INSTANCE, null);
            i = 511;
            list = list3;
            str = str5;
            str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            invoiceConfiguration = invoiceConfiguration2;
            str2 = str6;
            getPaidMoney = (com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney) beginStructure.decodeSerializableElement(serialDescriptor, 8, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney$$serializer.INSTANCE, null);
            customer = customer2;
            invoiceStatus = invoiceStatus2;
            str3 = decodeStringElement;
        } else {
            int i6 = 0;
            boolean z = true;
            com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus invoiceStatus3 = null;
            com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceConfiguration invoiceConfiguration3 = null;
            java.lang.String str7 = null;
            com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney2 = null;
            java.lang.String str8 = null;
            com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer3 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                    case 0:
                        str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str10);
                        i6 |= 1;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                    case 1:
                        str9 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 2:
                        customer3 = (com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer$$serializer.INSTANCE, customer3);
                        i6 |= 4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 3:
                        invoiceStatus3 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), invoiceStatus3);
                        i6 |= 8;
                        i2 = 7;
                    case 4:
                        list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), list2);
                        i6 |= 16;
                    case 5:
                        str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str7);
                        i6 |= 32;
                    case 6:
                        invoiceConfiguration3 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceConfiguration) beginStructure.decodeSerializableElement(serialDescriptor, i3, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceConfiguration$$serializer.INSTANCE, invoiceConfiguration3);
                        i6 |= 64;
                    case 7:
                        str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str8);
                        i6 |= 128;
                    case 8:
                        getPaidMoney2 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney) beginStructure.decodeSerializableElement(serialDescriptor, i5, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney$$serializer.INSTANCE, getPaidMoney2);
                        i6 |= 256;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer4 = customer3;
            str = str10;
            invoiceConfiguration = invoiceConfiguration3;
            str2 = str7;
            list = list2;
            getPaidMoney = getPaidMoney2;
            str3 = str9;
            i = i6;
            customer = customer4;
            str4 = str8;
            invoiceStatus = invoiceStatus3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice(i, str, str3, customer, invoiceStatus, list, str2, invoiceConfiguration, str4, getPaidMoney, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice.write$Self$business_pay_and_get_paid_prodRelease(value, beginStructure, serialDescriptor);
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
