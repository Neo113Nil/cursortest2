package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Invoice$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Invoice;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Invoice;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Invoice;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class Invoice$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice$$serializer invoice$$serializer = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice$$serializer();
        INSTANCE = invoice$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice", invoice$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("amount", true);
        pluginGeneratedSerialDescriptor.addElement("dueAmount", true);
        pluginGeneratedSerialDescriptor.addElement("amountBreakdown", true);
        pluginGeneratedSerialDescriptor.addElement("detail", false);
        pluginGeneratedSerialDescriptor.addElement("primaryRecipients", true);
        pluginGeneratedSerialDescriptor.addElement("items", true);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, true);
        pluginGeneratedSerialDescriptor.addElement("payments", true);
        pluginGeneratedSerialDescriptor.addElement("refunds", true);
        pluginGeneratedSerialDescriptor.addElement("gratuity", true);
        pluginGeneratedSerialDescriptor.addElement("shareUrl", true);
        pluginGeneratedSerialDescriptor.addElement("paymentAmountExternal", true);
        pluginGeneratedSerialDescriptor.addElement("refundAmountExternal", true);
        pluginGeneratedSerialDescriptor.addElement("paymentAmountPayPal", true);
        pluginGeneratedSerialDescriptor.addElement("refundAmountPayPal", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Invoice$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown$$serializer.INSTANCE), com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceDetail$$serializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[6].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[7].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConfiguration$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoicePayments$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceRefunds$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConfiguration invoiceConfiguration;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown amountBreakdown;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceDetail invoiceDetail;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount;
        java.lang.String str;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoicePayments invoicePayments;
        java.util.List list;
        java.util.List list2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount3;
        java.lang.String str2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount4;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceRefunds invoiceRefunds;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount5;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount6;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount7;
        int i;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus;
        kotlin.Lazy[] lazyArr2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount8;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoicePayments invoicePayments2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice.$childSerializers;
        int i2 = 10;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount9 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus2 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount10 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount11 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown amountBreakdown2 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceDetail invoiceDetail2 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceDetail) beginStructure.decodeSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceDetail$$serializer.INSTANCE, null);
            java.util.List list3 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            java.util.List list4 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), null);
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConfiguration invoiceConfiguration2 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConfiguration) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConfiguration$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoicePayments invoicePayments3 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoicePayments) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoicePayments$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceRefunds invoiceRefunds2 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceRefunds) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceRefunds$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount12 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE, null);
            list2 = list4;
            java.lang.String str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount13 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount) beginStructure.decodeSerializableElement(serialDescriptor, 13, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount14 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount) beginStructure.decodeSerializableElement(serialDescriptor, 14, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE, null);
            tempAmount7 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount) beginStructure.decodeSerializableElement(serialDescriptor, 15, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE, null);
            invoiceConfiguration = invoiceConfiguration2;
            tempAmount = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount) beginStructure.decodeSerializableElement(serialDescriptor, 16, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE, null);
            tempAmount4 = tempAmount10;
            invoiceRefunds = invoiceRefunds2;
            invoicePayments = invoicePayments3;
            tempAmount6 = tempAmount12;
            invoiceStatus = invoiceStatus2;
            tempAmount5 = tempAmount14;
            tempAmount3 = tempAmount13;
            str = str3;
            list = list3;
            invoiceDetail = invoiceDetail2;
            tempAmount2 = tempAmount11;
            amountBreakdown = amountBreakdown2;
            str2 = decodeStringElement;
            i = 131071;
        } else {
            int i3 = 16;
            int i4 = 0;
            boolean z = true;
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount15 = null;
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoicePayments invoicePayments4 = null;
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceRefunds invoiceRefunds3 = null;
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown amountBreakdown3 = null;
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount16 = null;
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount17 = null;
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount18 = null;
            java.lang.String str4 = null;
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus3 = null;
            java.util.List list5 = null;
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceDetail invoiceDetail3 = null;
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount19 = null;
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConfiguration invoiceConfiguration3 = null;
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount20 = null;
            java.lang.String str5 = null;
            java.util.List list6 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        lazyArr2 = lazyArr;
                        tempAmount8 = tempAmount15;
                        invoicePayments2 = invoicePayments4;
                        z = false;
                        lazyArr = lazyArr2;
                        invoicePayments4 = invoicePayments2;
                        tempAmount15 = tempAmount8;
                        i3 = 16;
                        i2 = 10;
                    case 0:
                        lazyArr2 = lazyArr;
                        tempAmount8 = tempAmount15;
                        invoicePayments2 = invoicePayments4;
                        str5 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        lazyArr = lazyArr2;
                        invoicePayments4 = invoicePayments2;
                        tempAmount15 = tempAmount8;
                        i3 = 16;
                        i2 = 10;
                    case 1:
                        tempAmount8 = tempAmount15;
                        invoicePayments2 = invoicePayments4;
                        lazyArr2 = lazyArr;
                        invoiceStatus3 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), invoiceStatus3);
                        i4 |= 2;
                        lazyArr = lazyArr2;
                        invoicePayments4 = invoicePayments2;
                        tempAmount15 = tempAmount8;
                        i3 = 16;
                        i2 = 10;
                    case 2:
                        tempAmount8 = tempAmount15;
                        invoicePayments2 = invoicePayments4;
                        tempAmount20 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE, tempAmount20);
                        i4 |= 4;
                        tempAmount19 = tempAmount19;
                        invoicePayments4 = invoicePayments2;
                        tempAmount15 = tempAmount8;
                        i3 = 16;
                        i2 = 10;
                    case 3:
                        tempAmount8 = tempAmount15;
                        invoicePayments2 = invoicePayments4;
                        tempAmount19 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE, tempAmount19);
                        i4 |= 8;
                        invoicePayments4 = invoicePayments2;
                        tempAmount15 = tempAmount8;
                        i3 = 16;
                        i2 = 10;
                    case 4:
                        tempAmount8 = tempAmount15;
                        amountBreakdown3 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown$$serializer.INSTANCE, amountBreakdown3);
                        i4 |= 16;
                        tempAmount15 = tempAmount8;
                        i3 = 16;
                        i2 = 10;
                    case 5:
                        tempAmount8 = tempAmount15;
                        invoiceDetail3 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceDetail) beginStructure.decodeSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceDetail$$serializer.INSTANCE, invoiceDetail3);
                        i4 |= 32;
                        list6 = list6;
                        tempAmount15 = tempAmount8;
                        i3 = 16;
                        i2 = 10;
                    case 6:
                        tempAmount8 = tempAmount15;
                        list6 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), list6);
                        i4 |= 64;
                        list5 = list5;
                        tempAmount15 = tempAmount8;
                        i3 = 16;
                        i2 = 10;
                    case 7:
                        tempAmount8 = tempAmount15;
                        list5 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), list5);
                        i4 |= 128;
                        tempAmount15 = tempAmount8;
                        i3 = 16;
                        i2 = 10;
                    case 8:
                        i4 |= 256;
                        invoiceConfiguration3 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConfiguration) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConfiguration$$serializer.INSTANCE, invoiceConfiguration3);
                        i3 = 16;
                        i2 = 10;
                    case 9:
                        invoicePayments4 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoicePayments) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoicePayments$$serializer.INSTANCE, invoicePayments4);
                        i4 |= 512;
                        i3 = 16;
                    case 10:
                        invoiceRefunds3 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceRefunds) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceRefunds$$serializer.INSTANCE, invoiceRefunds3);
                        i4 |= 1024;
                        i3 = 16;
                    case 11:
                        tempAmount16 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE, tempAmount16);
                        i4 |= 2048;
                        i3 = 16;
                    case 12:
                        str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kotlinx.serialization.internal.StringSerializer.INSTANCE, str4);
                        i4 |= 4096;
                        i3 = 16;
                    case 13:
                        tempAmount15 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount) beginStructure.decodeSerializableElement(serialDescriptor, 13, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE, tempAmount15);
                        i4 |= 8192;
                        i3 = 16;
                    case 14:
                        tempAmount9 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount) beginStructure.decodeSerializableElement(serialDescriptor, 14, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE, tempAmount9);
                        i4 |= 16384;
                        i3 = 16;
                    case 15:
                        tempAmount17 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount) beginStructure.decodeSerializableElement(serialDescriptor, 15, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE, tempAmount17);
                        i4 |= 32768;
                        i3 = 16;
                    case 16:
                        tempAmount18 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount) beginStructure.decodeSerializableElement(serialDescriptor, i3, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount$$serializer.INSTANCE, tempAmount18);
                        i4 |= 65536;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus4 = invoiceStatus3;
            java.util.List list7 = list5;
            invoiceConfiguration = invoiceConfiguration3;
            amountBreakdown = amountBreakdown3;
            invoiceDetail = invoiceDetail3;
            tempAmount = tempAmount18;
            str = str4;
            tempAmount2 = tempAmount19;
            invoicePayments = invoicePayments4;
            list = list6;
            list2 = list7;
            tempAmount3 = tempAmount15;
            str2 = str5;
            tempAmount4 = tempAmount20;
            invoiceRefunds = invoiceRefunds3;
            tempAmount5 = tempAmount9;
            tempAmount6 = tempAmount16;
            tempAmount7 = tempAmount17;
            i = i4;
            invoiceStatus = invoiceStatus4;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice(i, str2, invoiceStatus, tempAmount4, tempAmount2, amountBreakdown, invoiceDetail, list, list2, invoiceConfiguration, invoicePayments, invoiceRefunds, tempAmount6, str, tempAmount3, tempAmount5, tempAmount7, tempAmount, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice.write$Self$business_pay_and_get_paid_prodRelease(value, beginStructure, serialDescriptor);
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
