package com.paypal.oslo.feature.activity.domain.ledger.models;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ActivityTransactionModel$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel$$serializer activityTransactionModel$$serializer = new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel$$serializer();
        INSTANCE = activityTransactionModel$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel", activityTransactionModel$$serializer, 23);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("groupId", false);
        pluginGeneratedSerialDescriptor.addElement("invoiceId", true);
        pluginGeneratedSerialDescriptor.addElement("avatar", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("date", false);
        pluginGeneratedSerialDescriptor.addElement("createdTime", false);
        pluginGeneratedSerialDescriptor.addElement("amountInformation", false);
        pluginGeneratedSerialDescriptor.addElement("transactionShortDescription", false);
        pluginGeneratedSerialDescriptor.addElement("paymentStatus", true);
        pluginGeneratedSerialDescriptor.addElement("transactionETANote", true);
        pluginGeneratedSerialDescriptor.addElement("additionalInfo", true);
        pluginGeneratedSerialDescriptor.addElement("rewardInfo", true);
        pluginGeneratedSerialDescriptor.addElement("activityMoneyMovementDirection", false);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("activityStatus", true);
        pluginGeneratedSerialDescriptor.addElement("shipmentPackages", true);
        pluginGeneratedSerialDescriptor.addElement("activityFlags", true);
        pluginGeneratedSerialDescriptor.addElement("activityPartnerInfo", true);
        pluginGeneratedSerialDescriptor.addElement("subdomain", true);
        pluginGeneratedSerialDescriptor.addElement("channels", true);
        pluginGeneratedSerialDescriptor.addElement("purposes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActivityTransactionModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar$$serializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation$$serializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[13].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[14].getValue()), lazyArr[15].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[16].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[17].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[21].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[22].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo rewardInfo;
        com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus;
        java.util.List list;
        java.util.List list2;
        java.util.List list3;
        com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar counterPartyAvatar;
        java.lang.String str;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.util.List list4;
        java.lang.String str8;
        int i;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation activityCounterPartyAmountInformation;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain activitySubdomain;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo activityPartnerInfo;
        java.lang.String str9;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType;
        java.lang.String str10;
        kotlin.Lazy[] lazyArr2;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo activityPartnerInfo2;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags2;
        int i2;
        java.lang.String str11;
        java.util.List list5;
        kotlin.Lazy[] lazyArr3;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo activityPartnerInfo3;
        java.lang.String str12;
        java.util.List list6;
        int i3;
        kotlin.Lazy[] lazyArr4;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo activityPartnerInfo4;
        java.lang.String str13;
        java.util.List list7;
        int i4;
        int i5;
        int i6;
        int i7;
        kotlin.Lazy[] lazyArr5;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel.$childSerializers;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags3 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar counterPartyAvatar2 = (com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar) beginStructure.decodeSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar$$serializer.INSTANCE, null);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 4);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 5);
            java.lang.String decodeStringElement5 = beginStructure.decodeStringElement(serialDescriptor, 6);
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation activityCounterPartyAmountInformation2 = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation) beginStructure.decodeSerializableElement(serialDescriptor, 7, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation$$serializer.INSTANCE, null);
            java.lang.String decodeStringElement6 = beginStructure.decodeStringElement(serialDescriptor, 8);
            java.lang.String str15 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str16 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str17 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo rewardInfo2 = (com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo$$serializer.INSTANCE, null);
            activityMoneyMovementDirection = (com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (kotlinx.serialization.DeserializationStrategy) lazyArr[13].getValue(), null);
            java.util.List list8 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 14, (kotlinx.serialization.DeserializationStrategy) lazyArr[14].getValue(), null);
            com.paypal.oslo.api.graphql.schema.type.ActivityType activityType2 = (com.paypal.oslo.api.graphql.schema.type.ActivityType) beginStructure.decodeSerializableElement(serialDescriptor, 15, (kotlinx.serialization.DeserializationStrategy) lazyArr[15].getValue(), null);
            com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus2 = (com.paypal.oslo.api.graphql.schema.type.ActivityStatus) beginStructure.decodeNullableSerializableElement(serialDescriptor, 16, (kotlinx.serialization.DeserializationStrategy) lazyArr[16].getValue(), null);
            java.util.List list9 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 17, (kotlinx.serialization.DeserializationStrategy) lazyArr[17].getValue(), null);
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags4 = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags) beginStructure.decodeNullableSerializableElement(serialDescriptor, 18, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo activityPartnerInfo5 = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo) beginStructure.decodeNullableSerializableElement(serialDescriptor, 19, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain activitySubdomain2 = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain) beginStructure.decodeNullableSerializableElement(serialDescriptor, 20, com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain$$serializer.INSTANCE, null);
            java.util.List list10 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 21, (kotlinx.serialization.DeserializationStrategy) lazyArr[21].getValue(), null);
            list4 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 22, (kotlinx.serialization.DeserializationStrategy) lazyArr[22].getValue(), null);
            list2 = list10;
            str2 = str15;
            activityCounterPartyAmountInformation = activityCounterPartyAmountInformation2;
            str5 = decodeStringElement6;
            str7 = decodeStringElement;
            activitySubdomain = activitySubdomain2;
            str10 = decodeStringElement2;
            str6 = decodeStringElement4;
            counterPartyAvatar = counterPartyAvatar2;
            str = decodeStringElement3;
            list = list9;
            activityPartnerInfo = activityPartnerInfo5;
            activityFlags = activityFlags4;
            str3 = str16;
            str9 = decodeStringElement5;
            str8 = str14;
            i = 8388607;
            activityStatus = activityStatus2;
            str4 = str17;
            activityType = activityType2;
            list3 = list8;
            rewardInfo = rewardInfo2;
        } else {
            int i9 = 22;
            int i10 = 0;
            boolean z = true;
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo activityPartnerInfo6 = null;
            java.lang.String str18 = null;
            com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo rewardInfo3 = null;
            com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection2 = null;
            com.paypal.oslo.api.graphql.schema.type.ActivityType activityType3 = null;
            com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus3 = null;
            java.util.List list11 = null;
            java.util.List list12 = null;
            java.util.List list13 = null;
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain activitySubdomain3 = null;
            java.util.List list14 = null;
            java.lang.String str19 = null;
            java.lang.String str20 = null;
            java.lang.String str21 = null;
            java.lang.String str22 = null;
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation activityCounterPartyAmountInformation3 = null;
            java.lang.String str23 = null;
            java.lang.String str24 = null;
            com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar counterPartyAvatar3 = null;
            java.lang.String str25 = null;
            java.lang.String str26 = null;
            java.lang.String str27 = null;
            while (z) {
                java.lang.String str28 = str18;
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        lazyArr2 = lazyArr;
                        activityPartnerInfo2 = activityPartnerInfo6;
                        activityFlags2 = activityFlags3;
                        i2 = i10;
                        str11 = str28;
                        list5 = list14;
                        z = false;
                        lazyArr = lazyArr2;
                        activityPartnerInfo6 = activityPartnerInfo2;
                        activityFlags3 = activityFlags2;
                        str18 = str11;
                        list14 = list5;
                        i10 = i2;
                        i9 = 22;
                    case 0:
                        lazyArr2 = lazyArr;
                        activityPartnerInfo2 = activityPartnerInfo6;
                        activityFlags2 = activityFlags3;
                        int i11 = i10;
                        str11 = str28;
                        list5 = list14;
                        str27 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 = i11 | 1;
                        lazyArr = lazyArr2;
                        activityPartnerInfo6 = activityPartnerInfo2;
                        activityFlags3 = activityFlags2;
                        str18 = str11;
                        list14 = list5;
                        i10 = i2;
                        i9 = 22;
                    case 1:
                        lazyArr2 = lazyArr;
                        activityPartnerInfo2 = activityPartnerInfo6;
                        activityFlags2 = activityFlags3;
                        int i12 = i10;
                        str11 = str28;
                        list5 = list14;
                        str26 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 = i12 | 2;
                        lazyArr = lazyArr2;
                        activityPartnerInfo6 = activityPartnerInfo2;
                        activityFlags3 = activityFlags2;
                        str18 = str11;
                        list14 = list5;
                        i10 = i2;
                        i9 = 22;
                    case 2:
                        lazyArr5 = lazyArr;
                        str25 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str25);
                        i8 = i10 | 4;
                        activityPartnerInfo6 = activityPartnerInfo6;
                        activityFlags3 = activityFlags3;
                        str18 = str28;
                        list14 = list14;
                        i9 = 22;
                        i10 = i8;
                        lazyArr = lazyArr5;
                    case 3:
                        int i13 = i10;
                        list5 = list14;
                        str11 = str28;
                        counterPartyAvatar3 = (com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar) beginStructure.decodeSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar$$serializer.INSTANCE, counterPartyAvatar3);
                        i2 = i13 | 8;
                        lazyArr = lazyArr;
                        activityPartnerInfo6 = activityPartnerInfo6;
                        str18 = str11;
                        list14 = list5;
                        i10 = i2;
                        i9 = 22;
                    case 4:
                        lazyArr3 = lazyArr;
                        activityPartnerInfo3 = activityPartnerInfo6;
                        int i14 = i10;
                        str12 = str28;
                        list6 = list14;
                        str19 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 = i14 | 16;
                        activityPartnerInfo6 = activityPartnerInfo3;
                        list14 = list6;
                        str18 = str12;
                        i10 = i3;
                        lazyArr = lazyArr3;
                        i9 = 22;
                    case 5:
                        lazyArr3 = lazyArr;
                        activityPartnerInfo3 = activityPartnerInfo6;
                        int i15 = i10;
                        str12 = str28;
                        list6 = list14;
                        str24 = beginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 = i15 | 32;
                        activityPartnerInfo6 = activityPartnerInfo3;
                        list14 = list6;
                        str18 = str12;
                        i10 = i3;
                        lazyArr = lazyArr3;
                        i9 = 22;
                    case 6:
                        lazyArr3 = lazyArr;
                        activityPartnerInfo3 = activityPartnerInfo6;
                        int i16 = i10;
                        str12 = str28;
                        list6 = list14;
                        str23 = beginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 = i16 | 64;
                        activityPartnerInfo6 = activityPartnerInfo3;
                        list14 = list6;
                        str18 = str12;
                        i10 = i3;
                        lazyArr = lazyArr3;
                        i9 = 22;
                    case 7:
                        lazyArr4 = lazyArr;
                        activityPartnerInfo4 = activityPartnerInfo6;
                        int i17 = i10;
                        str13 = str28;
                        list5 = list14;
                        activityCounterPartyAmountInformation3 = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation) beginStructure.decodeSerializableElement(serialDescriptor, 7, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation$$serializer.INSTANCE, activityCounterPartyAmountInformation3);
                        i2 = i17 | 128;
                        str18 = str13;
                        lazyArr = lazyArr4;
                        activityPartnerInfo6 = activityPartnerInfo4;
                        list14 = list5;
                        i10 = i2;
                        i9 = 22;
                    case 8:
                        lazyArr4 = lazyArr;
                        activityPartnerInfo4 = activityPartnerInfo6;
                        int i18 = i10;
                        str13 = str28;
                        list5 = list14;
                        str22 = beginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 = i18 | 256;
                        str18 = str13;
                        lazyArr = lazyArr4;
                        activityPartnerInfo6 = activityPartnerInfo4;
                        list14 = list5;
                        i10 = i2;
                        i9 = 22;
                    case 9:
                        int i19 = i10;
                        list5 = list14;
                        i2 = i19 | 512;
                        str18 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, str28);
                        lazyArr = lazyArr;
                        activityPartnerInfo6 = activityPartnerInfo6;
                        str21 = str21;
                        list14 = list5;
                        i10 = i2;
                        i9 = 22;
                    case 10:
                        int i20 = i10;
                        list7 = list14;
                        str21 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kotlinx.serialization.internal.StringSerializer.INSTANCE, str21);
                        i2 = i20 | 1024;
                        lazyArr = lazyArr;
                        activityPartnerInfo6 = activityPartnerInfo6;
                        str20 = str20;
                        list14 = list7;
                        str18 = str28;
                        i10 = i2;
                        i9 = 22;
                    case 11:
                        lazyArr5 = lazyArr;
                        str20 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, str20);
                        i8 = i10 | 2048;
                        activityPartnerInfo6 = activityPartnerInfo6;
                        list14 = list14;
                        str18 = str28;
                        i9 = 22;
                        i10 = i8;
                        lazyArr = lazyArr5;
                    case 12:
                        int i21 = i10;
                        list7 = list14;
                        rewardInfo3 = (com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo$$serializer.INSTANCE, rewardInfo3);
                        i2 = i21 | 4096;
                        lazyArr = lazyArr;
                        list14 = list7;
                        str18 = str28;
                        i10 = i2;
                        i9 = 22;
                    case 13:
                        int i22 = i10;
                        list7 = list14;
                        activityMoneyMovementDirection2 = (com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (kotlinx.serialization.DeserializationStrategy) lazyArr[13].getValue(), activityMoneyMovementDirection2);
                        i2 = i22 | 8192;
                        list14 = list7;
                        str18 = str28;
                        i10 = i2;
                        i9 = 22;
                    case 14:
                        int i23 = i10;
                        list7 = list14;
                        list13 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 14, (kotlinx.serialization.DeserializationStrategy) lazyArr[14].getValue(), list13);
                        i2 = i23 | 16384;
                        list14 = list7;
                        str18 = str28;
                        i10 = i2;
                        i9 = 22;
                    case 15:
                        i4 = i10;
                        list7 = list14;
                        activityType3 = (com.paypal.oslo.api.graphql.schema.type.ActivityType) beginStructure.decodeSerializableElement(serialDescriptor, 15, (kotlinx.serialization.DeserializationStrategy) lazyArr[15].getValue(), activityType3);
                        i5 = 32768;
                        i2 = i4 | i5;
                        list14 = list7;
                        str18 = str28;
                        i10 = i2;
                        i9 = 22;
                    case 16:
                        i6 = i10;
                        list7 = list14;
                        activityStatus3 = (com.paypal.oslo.api.graphql.schema.type.ActivityStatus) beginStructure.decodeNullableSerializableElement(serialDescriptor, 16, (kotlinx.serialization.DeserializationStrategy) lazyArr[16].getValue(), activityStatus3);
                        i7 = 65536;
                        i2 = i6 | i7;
                        list14 = list7;
                        str18 = str28;
                        i10 = i2;
                        i9 = 22;
                    case 17:
                        i4 = i10;
                        list7 = list14;
                        list11 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 17, (kotlinx.serialization.DeserializationStrategy) lazyArr[17].getValue(), list11);
                        i5 = 131072;
                        i2 = i4 | i5;
                        list14 = list7;
                        str18 = str28;
                        i10 = i2;
                        i9 = 22;
                    case 18:
                        i6 = i10;
                        list7 = list14;
                        activityFlags3 = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags) beginStructure.decodeNullableSerializableElement(serialDescriptor, 18, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags$$serializer.INSTANCE, activityFlags3);
                        i7 = 262144;
                        i2 = i6 | i7;
                        list14 = list7;
                        str18 = str28;
                        i10 = i2;
                        i9 = 22;
                    case 19:
                        i4 = i10;
                        list7 = list14;
                        activityPartnerInfo6 = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo) beginStructure.decodeNullableSerializableElement(serialDescriptor, 19, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo$$serializer.INSTANCE, activityPartnerInfo6);
                        i5 = 524288;
                        i2 = i4 | i5;
                        list14 = list7;
                        str18 = str28;
                        i10 = i2;
                        i9 = 22;
                    case 20:
                        i6 = i10;
                        list7 = list14;
                        activitySubdomain3 = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain) beginStructure.decodeNullableSerializableElement(serialDescriptor, 20, com.paypal.oslo.feature.activity.domain.ledger.models.ActivitySubdomain$$serializer.INSTANCE, activitySubdomain3);
                        i7 = 1048576;
                        i2 = i6 | i7;
                        list14 = list7;
                        str18 = str28;
                        i10 = i2;
                        i9 = 22;
                    case 21:
                        i4 = i10;
                        list7 = list14;
                        list12 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 21, (kotlinx.serialization.DeserializationStrategy) lazyArr[21].getValue(), list12);
                        i5 = 2097152;
                        i2 = i4 | i5;
                        list14 = list7;
                        str18 = str28;
                        i10 = i2;
                        i9 = 22;
                    case 22:
                        list14 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, i9, (kotlinx.serialization.DeserializationStrategy) lazyArr[i9].getValue(), list14);
                        i10 |= 4194304;
                        str18 = str28;
                        i9 = 22;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            rewardInfo = rewardInfo3;
            activityMoneyMovementDirection = activityMoneyMovementDirection2;
            activityStatus = activityStatus3;
            list = list11;
            list2 = list12;
            list3 = list13;
            counterPartyAvatar = counterPartyAvatar3;
            str = str19;
            activityFlags = activityFlags3;
            str2 = str18;
            str3 = str21;
            str4 = str20;
            str5 = str22;
            str6 = str24;
            str7 = str27;
            list4 = list14;
            str8 = str25;
            i = i10;
            activityCounterPartyAmountInformation = activityCounterPartyAmountInformation3;
            activitySubdomain = activitySubdomain3;
            activityPartnerInfo = activityPartnerInfo6;
            str9 = str23;
            activityType = activityType3;
            str10 = str26;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel(i, str7, str10, str8, counterPartyAvatar, str, str6, str9, activityCounterPartyAmountInformation, str5, str2, str3, str4, rewardInfo, activityMoneyMovementDirection, list3, activityType, activityStatus, list, activityFlags, activityPartnerInfo, activitySubdomain, list2, list4, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel.write$Self$activity_prodRelease(value, beginStructure, serialDescriptor);
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
