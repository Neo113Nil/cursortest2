package com.paypal.oslo.feature.activity.domain.common.models;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionsTransactionInfo$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionsTransactionInfo;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionsTransactionInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionsTransactionInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ActivityActionsTransactionInfo$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo$$serializer activityActionsTransactionInfo$$serializer = new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo$$serializer();
        INSTANCE = activityActionsTransactionInfo$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo", activityActionsTransactionInfo$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("transactionId", false);
        pluginGeneratedSerialDescriptor.addElement("groupId", false);
        pluginGeneratedSerialDescriptor.addElement("invoiceId", false);
        pluginGeneratedSerialDescriptor.addElement("activityType", false);
        pluginGeneratedSerialDescriptor.addElement("activityFlags", false);
        pluginGeneratedSerialDescriptor.addElement("activityCounterPartyAmountInformation", true);
        pluginGeneratedSerialDescriptor.addElement("counterpartyAccountId", true);
        pluginGeneratedSerialDescriptor.addElement("isBlocked", true);
        pluginGeneratedSerialDescriptor.addElement("transactionCreatedTime", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActivityActionsTransactionInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[3].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation activityCounterPartyAmountInformation;
        java.lang.Boolean bool;
        java.lang.String str;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType;
        java.lang.String str2;
        int i;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        int i5 = 8;
        int i6 = 4;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags2 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.api.graphql.schema.type.ActivityType activityType2 = (com.paypal.oslo.api.graphql.schema.type.ActivityType) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags3 = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation activityCounterPartyAmountInformation2 = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation$$serializer.INSTANCE, null);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            activityType = activityType2;
            str5 = str6;
            bool = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            str = str9;
            activityCounterPartyAmountInformation = activityCounterPartyAmountInformation2;
            str2 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            activityFlags = activityFlags3;
            str3 = str8;
            i = 511;
            str4 = str7;
        } else {
            int i7 = 0;
            boolean z = true;
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation activityCounterPartyAmountInformation3 = null;
            java.lang.Boolean bool2 = null;
            java.lang.String str10 = null;
            com.paypal.oslo.api.graphql.schema.type.ActivityType activityType3 = null;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            java.lang.String str14 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        i6 = 4;
                    case 0:
                        str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str14);
                        i7 |= 1;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        i6 = 4;
                    case 1:
                        str13 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str13);
                        i7 |= 2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                    case 2:
                        str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str12);
                        i7 |= 4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 3:
                        activityType3 = (com.paypal.oslo.api.graphql.schema.type.ActivityType) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), activityType3);
                        i7 |= 8;
                        i2 = 7;
                    case 4:
                        activityFlags2 = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags) beginStructure.decodeNullableSerializableElement(serialDescriptor, i6, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags$$serializer.INSTANCE, activityFlags2);
                        i7 |= 16;
                    case 5:
                        activityCounterPartyAmountInformation3 = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation$$serializer.INSTANCE, activityCounterPartyAmountInformation3);
                        i7 |= 32;
                    case 6:
                        str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str10);
                        i7 |= 64;
                    case 7:
                        bool2 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, bool2);
                        i7 |= 128;
                    case 8:
                        str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str11);
                        i7 |= 256;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.String str15 = str12;
            java.lang.String str16 = str13;
            java.lang.String str17 = str14;
            activityCounterPartyAmountInformation = activityCounterPartyAmountInformation3;
            bool = bool2;
            str = str10;
            activityFlags = activityFlags2;
            activityType = activityType3;
            str2 = str11;
            i = i7;
            str3 = str15;
            str4 = str16;
            str5 = str17;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo(i, str5, str4, str3, activityType, activityFlags, activityCounterPartyAmountInformation, str, bool, str2, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo.write$Self$activity_prodRelease(value, beginStructure, serialDescriptor);
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
