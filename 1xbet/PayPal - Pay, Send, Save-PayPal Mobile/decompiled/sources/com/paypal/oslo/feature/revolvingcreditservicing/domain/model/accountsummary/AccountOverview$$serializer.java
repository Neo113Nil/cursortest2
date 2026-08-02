package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountOverview$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountOverview;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountOverview;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountOverview;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AccountOverview$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview$$serializer accountOverview$$serializer = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview$$serializer();
        INSTANCE = accountOverview$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview", accountOverview$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("tags", false);
        pluginGeneratedSerialDescriptor.addElement("allowedFeatures", false);
        pluginGeneratedSerialDescriptor.addElement("billing", false);
        pluginGeneratedSerialDescriptor.addElement("accountAPRs", false);
        pluginGeneratedSerialDescriptor.addElement("cardDisplayLogo", false);
        pluginGeneratedSerialDescriptor.addElement("cardDisplayName", false);
        pluginGeneratedSerialDescriptor.addElement("cardNetwork", false);
        pluginGeneratedSerialDescriptor.addElement("tokenServiceProvider", false);
        pluginGeneratedSerialDescriptor.addElement("tier", false);
        pluginGeneratedSerialDescriptor.addElement("persistentDebt", false);
        pluginGeneratedSerialDescriptor.addElement("estimatedFirstPaymentDueDate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AccountOverview$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[0].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[1].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[6].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[7].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[8].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PersistentDebt$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.FormattedDate$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.String str;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork cardNetwork;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PersistentDebt persistentDebt;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider tokenServiceProvider;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.FormattedDate formattedDate;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon revolvingCardIcon;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs accountAPRs;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier productTier;
        java.util.List list;
        int i;
        java.util.List list2;
        java.util.List list3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 8;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier productTier2 = null;
        if (beginStructure.decodeSequentially()) {
            java.util.List list4 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            java.util.List list5 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs accountAPRs2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon revolvingCardIcon2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon$$serializer.INSTANCE, null);
            java.lang.String str2 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork cardNetwork2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider tokenServiceProvider2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier productTier3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PersistentDebt persistentDebt2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PersistentDebt) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PersistentDebt$$serializer.INSTANCE, null);
            productTier = productTier3;
            list = list4;
            formattedDate = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.FormattedDate) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.FormattedDate$$serializer.INSTANCE, null);
            persistentDebt = persistentDebt2;
            str = str2;
            accountAPRs = accountAPRs2;
            revolvingCardIcon = revolvingCardIcon2;
            billing = billing2;
            tokenServiceProvider = tokenServiceProvider2;
            cardNetwork = cardNetwork2;
            list2 = list5;
            i = 2047;
        } else {
            int i6 = 0;
            boolean z = true;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork cardNetwork3 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PersistentDebt persistentDebt3 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider tokenServiceProvider3 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.FormattedDate formattedDate2 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs accountAPRs3 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing3 = null;
            java.lang.String str3 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon revolvingCardIcon3 = null;
            java.util.List list6 = null;
            java.util.List list7 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        list3 = list6;
                        z = false;
                        lazyArr = lazyArr;
                        i3 = 9;
                        i4 = 7;
                        list6 = list3;
                        i5 = 8;
                    case 0:
                        list3 = list6;
                        list7 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), list7);
                        i6 |= 1;
                        lazyArr = lazyArr;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        list6 = list3;
                        i5 = 8;
                    case 1:
                        list6 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), list6);
                        i6 |= 2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                    case 2:
                        billing3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing$$serializer.INSTANCE, billing3);
                        i6 |= 4;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                    case 3:
                        accountAPRs3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs$$serializer.INSTANCE, accountAPRs3);
                        i6 |= 8;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                    case 4:
                        revolvingCardIcon3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon$$serializer.INSTANCE, revolvingCardIcon3);
                        i6 |= 16;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                    case 5:
                        str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str3);
                        i6 |= 32;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                    case 6:
                        cardNetwork3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), cardNetwork3);
                        i6 |= 64;
                        i2 = 10;
                    case 7:
                        tokenServiceProvider3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, (kotlinx.serialization.DeserializationStrategy) lazyArr[i4].getValue(), tokenServiceProvider3);
                        i6 |= 128;
                    case 8:
                        productTier2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier) beginStructure.decodeNullableSerializableElement(serialDescriptor, i5, (kotlinx.serialization.DeserializationStrategy) lazyArr[i5].getValue(), productTier2);
                        i6 |= 256;
                    case 9:
                        persistentDebt3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PersistentDebt) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PersistentDebt$$serializer.INSTANCE, persistentDebt3);
                        i6 |= 512;
                    case 10:
                        formattedDate2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.FormattedDate) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.FormattedDate$$serializer.INSTANCE, formattedDate2);
                        i6 |= 1024;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.util.List list8 = list6;
            java.util.List list9 = list7;
            str = str3;
            cardNetwork = cardNetwork3;
            persistentDebt = persistentDebt3;
            tokenServiceProvider = tokenServiceProvider3;
            formattedDate = formattedDate2;
            revolvingCardIcon = revolvingCardIcon3;
            accountAPRs = accountAPRs3;
            billing = billing3;
            productTier = productTier2;
            list = list9;
            i = i6;
            list2 = list8;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview(i, list, list2, billing, accountAPRs, revolvingCardIcon, str, cardNetwork, tokenServiceProvider, productTier, persistentDebt, formattedDate, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview.write$Self$revolvingcredit_servicing_prodRelease(value, beginStructure, serialDescriptor);
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
