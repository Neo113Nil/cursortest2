package com.paypal.oslo.feature.activity.api.widget.configs;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFiltersConfig$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFiltersConfig;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFiltersConfig;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFiltersConfig;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ActivityWidgetFiltersConfig$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig$$serializer activityWidgetFiltersConfig$$serializer = new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig$$serializer();
        INSTANCE = activityWidgetFiltersConfig$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig", activityWidgetFiltersConfig$$serializer, 24);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, true);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_END_TIME, true);
        pluginGeneratedSerialDescriptor.addElement("searchText", true);
        pluginGeneratedSerialDescriptor.addElement("includeReportedTransactions", true);
        pluginGeneratedSerialDescriptor.addElement("partnerIdentifiers", true);
        pluginGeneratedSerialDescriptor.addElement("cryptoAssetNames", true);
        pluginGeneratedSerialDescriptor.addElement("currencies", true);
        pluginGeneratedSerialDescriptor.addElement("billingAgreementIds", true);
        pluginGeneratedSerialDescriptor.addElement("recurringProfileIds", true);
        pluginGeneratedSerialDescriptor.addElement("issuanceProductName", true);
        pluginGeneratedSerialDescriptor.addElement("regulatoryReasons", true);
        pluginGeneratedSerialDescriptor.addElement("cryptoSymbols", true);
        pluginGeneratedSerialDescriptor.addElement("moneyMovementDirection", true);
        pluginGeneratedSerialDescriptor.addElement("types", true);
        pluginGeneratedSerialDescriptor.addElement("statuses", true);
        pluginGeneratedSerialDescriptor.addElement("channels", true);
        pluginGeneratedSerialDescriptor.addElement("purposes", true);
        pluginGeneratedSerialDescriptor.addElement("accountIds", true);
        pluginGeneratedSerialDescriptor.addElement("productFundingType", true);
        pluginGeneratedSerialDescriptor.addElement("channelPartnerIdentifiers", true);
        pluginGeneratedSerialDescriptor.addElement("fundingSourceTypes", true);
        pluginGeneratedSerialDescriptor.addElement("category", true);
        pluginGeneratedSerialDescriptor.addElement("moneyPoolIds", true);
        pluginGeneratedSerialDescriptor.addElement("moneyPoolSubjectId", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private ActivityWidgetFiltersConfig$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[0].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[1].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[4].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[5].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[6].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[7].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[8].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[10].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[11].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[13].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[14].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[15].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[16].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[17].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[19].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[20].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[21].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[22].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.util.Date date;
        java.util.List list;
        java.lang.String str;
        java.util.List list2;
        java.util.List list3;
        java.lang.String str2;
        java.lang.Boolean bool;
        java.util.List list4;
        java.util.List list5;
        java.util.List list6;
        java.util.List list7;
        java.util.List list8;
        java.util.List list9;
        java.lang.String str3;
        java.lang.String str4;
        java.util.List list10;
        java.util.List list11;
        java.util.List list12;
        java.util.List list13;
        java.util.List list14;
        java.util.List list15;
        java.util.List list16;
        java.util.Date date2;
        int i;
        java.lang.String str5;
        java.util.List list17;
        int i2;
        java.util.List list18;
        int i3;
        java.lang.String str6;
        int i4;
        kotlin.Lazy[] lazyArr2;
        java.util.List list19;
        java.util.List list20;
        java.util.List list21;
        java.util.List list22;
        java.util.List list23;
        java.util.List list24;
        java.lang.String str7;
        java.util.List list25;
        java.util.List list26;
        java.util.List list27;
        java.util.List list28;
        java.util.List list29;
        java.lang.Boolean bool2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig.$childSerializers;
        java.util.List list30 = null;
        if (beginStructure.decodeSequentially()) {
            java.util.Date date3 = (java.util.Date) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            java.util.Date date4 = (java.util.Date) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Boolean bool3 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            java.util.List list31 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            java.util.List list32 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), null);
            java.util.List list33 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            java.util.List list34 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), null);
            java.util.List list35 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), null);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.util.List list36 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, (kotlinx.serialization.DeserializationStrategy) lazyArr[10].getValue(), null);
            java.util.List list37 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (kotlinx.serialization.DeserializationStrategy) lazyArr[11].getValue(), null);
            java.lang.String str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.util.List list38 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (kotlinx.serialization.DeserializationStrategy) lazyArr[13].getValue(), null);
            java.util.List list39 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 14, (kotlinx.serialization.DeserializationStrategy) lazyArr[14].getValue(), null);
            java.util.List list40 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 15, (kotlinx.serialization.DeserializationStrategy) lazyArr[15].getValue(), null);
            java.util.List list41 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 16, (kotlinx.serialization.DeserializationStrategy) lazyArr[16].getValue(), null);
            java.util.List list42 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 17, (kotlinx.serialization.DeserializationStrategy) lazyArr[17].getValue(), null);
            java.lang.String str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 18, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.util.List list43 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 19, (kotlinx.serialization.DeserializationStrategy) lazyArr[19].getValue(), null);
            java.util.List list44 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 20, (kotlinx.serialization.DeserializationStrategy) lazyArr[20].getValue(), null);
            java.util.List list45 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 21, (kotlinx.serialization.DeserializationStrategy) lazyArr[21].getValue(), null);
            i = 16777215;
            list = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 22, (kotlinx.serialization.DeserializationStrategy) lazyArr[22].getValue(), null);
            str = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 23, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            list2 = list45;
            date = date4;
            list12 = list44;
            list13 = list43;
            list11 = list42;
            list3 = list41;
            list8 = list40;
            list10 = list39;
            list16 = list38;
            date2 = date3;
            str4 = str11;
            bool = bool3;
            str2 = str8;
            list9 = list36;
            list6 = list34;
            list5 = list33;
            list4 = list32;
            list7 = list35;
            list15 = list31;
            str3 = str10;
            list14 = list37;
            str5 = str9;
        } else {
            int i5 = 0;
            boolean z = true;
            java.util.List list46 = null;
            java.util.List list47 = null;
            java.util.List list48 = null;
            java.lang.String str12 = null;
            java.util.List list49 = null;
            java.lang.String str13 = null;
            java.util.List list50 = null;
            java.util.List list51 = null;
            java.lang.String str14 = null;
            java.util.List list52 = null;
            java.util.List list53 = null;
            java.util.List list54 = null;
            java.util.List list55 = null;
            java.lang.String str15 = null;
            java.util.List list56 = null;
            java.util.List list57 = null;
            java.util.List list58 = null;
            java.util.List list59 = null;
            java.lang.Boolean bool4 = null;
            java.lang.String str16 = null;
            java.util.Date date5 = null;
            java.util.List list60 = null;
            java.util.Date date6 = null;
            while (z) {
                java.lang.String str17 = str14;
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        lazyArr2 = lazyArr;
                        list19 = list47;
                        list20 = list48;
                        z = false;
                        lazyArr = lazyArr2;
                        list48 = list20;
                        str14 = str17;
                        list47 = list19;
                    case 0:
                        list19 = list47;
                        list20 = list48;
                        lazyArr2 = lazyArr;
                        date6 = (java.util.Date) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), date6);
                        i5 |= 1;
                        list46 = list46;
                        lazyArr = lazyArr2;
                        list48 = list20;
                        str14 = str17;
                        list47 = list19;
                    case 1:
                        list19 = list47;
                        list20 = list48;
                        date5 = (java.util.Date) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), date5);
                        i5 |= 2;
                        list46 = list46;
                        str16 = str16;
                        list48 = list20;
                        str14 = str17;
                        list47 = list19;
                    case 2:
                        list21 = list46;
                        list19 = list47;
                        list22 = list48;
                        list23 = list54;
                        list24 = list55;
                        str7 = str15;
                        list25 = list56;
                        list26 = list57;
                        list27 = list58;
                        list28 = list59;
                        list29 = list60;
                        bool2 = bool4;
                        str16 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str16);
                        i5 |= 4;
                        str15 = str7;
                        list46 = list21;
                        list56 = list25;
                        bool4 = bool2;
                        list59 = list28;
                        list58 = list27;
                        list54 = list23;
                        list55 = list24;
                        list57 = list26;
                        list48 = list22;
                        list60 = list29;
                        str14 = str17;
                        list47 = list19;
                    case 3:
                        list21 = list46;
                        list19 = list47;
                        list22 = list48;
                        list23 = list54;
                        list24 = list55;
                        str7 = str15;
                        list25 = list56;
                        list26 = list57;
                        list27 = list58;
                        list29 = list60;
                        list28 = list59;
                        bool4 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, bool4);
                        i5 |= 8;
                        bool2 = bool4;
                        str15 = str7;
                        list46 = list21;
                        list56 = list25;
                        bool4 = bool2;
                        list59 = list28;
                        list58 = list27;
                        list54 = list23;
                        list55 = list24;
                        list57 = list26;
                        list48 = list22;
                        list60 = list29;
                        str14 = str17;
                        list47 = list19;
                    case 4:
                        list19 = list47;
                        list20 = list48;
                        list59 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), list59);
                        i5 |= 16;
                        list46 = list46;
                        list58 = list58;
                        list48 = list20;
                        str14 = str17;
                        list47 = list19;
                    case 5:
                        list19 = list47;
                        list20 = list48;
                        list58 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), list58);
                        i5 |= 32;
                        list46 = list46;
                        list54 = list54;
                        list48 = list20;
                        str14 = str17;
                        list47 = list19;
                    case 6:
                        list21 = list46;
                        list19 = list47;
                        list22 = list48;
                        str7 = str15;
                        list25 = list56;
                        list26 = list57;
                        list29 = list60;
                        list24 = list55;
                        i5 |= 64;
                        list23 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), list54);
                        list27 = list58;
                        list28 = list59;
                        bool2 = bool4;
                        str15 = str7;
                        list46 = list21;
                        list56 = list25;
                        bool4 = bool2;
                        list59 = list28;
                        list58 = list27;
                        list54 = list23;
                        list55 = list24;
                        list57 = list26;
                        list48 = list22;
                        list60 = list29;
                        str14 = str17;
                        list47 = list19;
                    case 7:
                        list19 = list47;
                        list20 = list48;
                        list55 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), list55);
                        i5 |= 128;
                        list46 = list46;
                        list57 = list57;
                        list48 = list20;
                        str14 = str17;
                        list47 = list19;
                    case 8:
                        list19 = list47;
                        list20 = list48;
                        list57 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), list57);
                        i5 |= 256;
                        list46 = list46;
                        list48 = list20;
                        str14 = str17;
                        list47 = list19;
                    case 9:
                        list21 = list46;
                        list19 = list47;
                        list25 = list56;
                        list29 = list60;
                        i5 |= 512;
                        str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, str15);
                        list22 = list48;
                        list23 = list54;
                        list24 = list55;
                        list26 = list57;
                        list27 = list58;
                        list28 = list59;
                        bool2 = bool4;
                        str15 = str7;
                        list46 = list21;
                        list56 = list25;
                        bool4 = bool2;
                        list59 = list28;
                        list58 = list27;
                        list54 = list23;
                        list55 = list24;
                        list57 = list26;
                        list48 = list22;
                        list60 = list29;
                        str14 = str17;
                        list47 = list19;
                    case 10:
                        list19 = list47;
                        list60 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, (kotlinx.serialization.DeserializationStrategy) lazyArr[10].getValue(), list60);
                        i5 |= 1024;
                        list46 = list46;
                        list56 = list56;
                        str14 = str17;
                        list47 = list19;
                    case 11:
                        list19 = list47;
                        list56 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (kotlinx.serialization.DeserializationStrategy) lazyArr[11].getValue(), list56);
                        i5 |= 2048;
                        list46 = list46;
                        str14 = str17;
                        list47 = list19;
                    case 12:
                        list19 = list47;
                        str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kotlinx.serialization.internal.StringSerializer.INSTANCE, str17);
                        i5 |= 4096;
                        list46 = list46;
                        list47 = list19;
                    case 13:
                        i5 |= 8192;
                        list47 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (kotlinx.serialization.DeserializationStrategy) lazyArr[13].getValue(), list47);
                        list46 = list46;
                        str14 = str17;
                    case 14:
                        list17 = list47;
                        list50 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 14, (kotlinx.serialization.DeserializationStrategy) lazyArr[14].getValue(), list50);
                        i5 |= 16384;
                        str14 = str17;
                        list47 = list17;
                    case 15:
                        list17 = list47;
                        list48 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 15, (kotlinx.serialization.DeserializationStrategy) lazyArr[15].getValue(), list48);
                        i2 = 32768;
                        int i6 = i2;
                        str6 = str13;
                        i4 = i6;
                        i5 |= i4;
                        str13 = str6;
                        str14 = str17;
                        list47 = list17;
                    case 16:
                        list17 = list47;
                        list52 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 16, (kotlinx.serialization.DeserializationStrategy) lazyArr[16].getValue(), list52);
                        list18 = list51;
                        i3 = 65536;
                        i5 |= i3;
                        list51 = list18;
                        str14 = str17;
                        list47 = list17;
                    case 17:
                        list17 = list47;
                        str6 = str13;
                        i4 = 131072;
                        list53 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 17, (kotlinx.serialization.DeserializationStrategy) lazyArr[17].getValue(), list53);
                        i5 |= i4;
                        str13 = str6;
                        str14 = str17;
                        list47 = list17;
                    case 18:
                        list17 = list47;
                        str6 = str13;
                        i4 = 262144;
                        str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 18, kotlinx.serialization.internal.StringSerializer.INSTANCE, str12);
                        i5 |= i4;
                        str13 = str6;
                        str14 = str17;
                        list47 = list17;
                    case 19:
                        list17 = list47;
                        list46 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 19, (kotlinx.serialization.DeserializationStrategy) lazyArr[19].getValue(), list46);
                        java.util.List list61 = list51;
                        i3 = 524288;
                        list18 = list61;
                        i5 |= i3;
                        list51 = list18;
                        str14 = str17;
                        list47 = list17;
                    case 20:
                        list17 = list47;
                        str6 = str13;
                        i4 = 1048576;
                        list30 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 20, (kotlinx.serialization.DeserializationStrategy) lazyArr[20].getValue(), list30);
                        i5 |= i4;
                        str13 = str6;
                        str14 = str17;
                        list47 = list17;
                    case 21:
                        list17 = list47;
                        list18 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 21, (kotlinx.serialization.DeserializationStrategy) lazyArr[21].getValue(), list51);
                        i3 = 2097152;
                        i5 |= i3;
                        list51 = list18;
                        str14 = str17;
                        list47 = list17;
                    case 22:
                        list17 = list47;
                        list49 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 22, (kotlinx.serialization.DeserializationStrategy) lazyArr[22].getValue(), list49);
                        i2 = 4194304;
                        int i62 = i2;
                        str6 = str13;
                        i4 = i62;
                        i5 |= i4;
                        str13 = str6;
                        str14 = str17;
                        list47 = list17;
                    case 23:
                        list17 = list47;
                        java.lang.String str18 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 23, kotlinx.serialization.internal.StringSerializer.INSTANCE, str13);
                        i4 = 8388608;
                        str6 = str18;
                        i5 |= i4;
                        str13 = str6;
                        str14 = str17;
                        list47 = list17;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.String str19 = str14;
            java.util.List list62 = list54;
            java.util.List list63 = list55;
            java.lang.String str20 = str15;
            date = date5;
            list = list49;
            str = str13;
            list2 = list51;
            list3 = list52;
            str2 = str16;
            bool = bool4;
            list4 = list58;
            list5 = list62;
            list6 = list63;
            list7 = list57;
            list8 = list48;
            list9 = list60;
            str3 = str19;
            str4 = str12;
            list10 = list50;
            list11 = list53;
            list12 = list30;
            list13 = list46;
            list14 = list56;
            list15 = list59;
            list16 = list47;
            date2 = date6;
            i = i5;
            str5 = str20;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig(i, date2, date, str2, bool, list15, list4, list5, list6, list7, str5, list9, list14, str3, list16, list10, list8, list3, list11, str4, list13, list12, list2, list, str, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig.write$Self$activity_api_prodRelease(value, beginStructure, serialDescriptor);
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
