package com.paypal.oslo.feature.debitcard.servicing.data.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0000j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/GetDebitPinRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinInput;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "getDebitPinRequestMapper", "Lkotlin/jvm/functions/Function1;", "getGetDebitPinRequestMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentPinQuery$DebitInstrumentPin;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitInstrumentPinDetails;", "getDebitPinResponseMapper", "getGetDebitPinResponseMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetDebitPinMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.GetDebitPinRequest, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput> getDebitPinRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.GetDebitPinMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.GetDebitPinMapperKt.$r8$lambda$AXypmpW5LHsfMMQiP764sFR3mgc((com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.GetDebitPinRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin, com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails> getDebitPinResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.GetDebitPinMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.GetDebitPinMapperKt.$r8$lambda$FcRWZWem1478op04vmtCutl9n_o((com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.GetDebitPinRequest, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput> getGetDebitPinRequestMapper() {
        return getDebitPinRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin, com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails> getGetDebitPinResponseMapper() {
        return getDebitPinResponseMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput $r8$lambda$AXypmpW5LHsfMMQiP764sFR3mgc(com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.GetDebitPinRequest getDebitPinRequest) {
        com.apollographql.apollo.api.Optional.Absent absent;
        com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel experienceChannel;
        com.apollographql.apollo.api.Optional.Absent absent2;
        com.paypal.oslo.api.graphql.schema.type.ExperienceChannel experienceChannel2;
        com.paypal.oslo.api.graphql.schema.type.ClientChannel clientChannel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDebitPinRequest, "");
        java.lang.String instrumentId = getDebitPinRequest.getInstrumentId();
        java.lang.String cardVerificationCode = getDebitPinRequest.getCardVerificationCode();
        com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel clientChannel2 = getDebitPinRequest.getClientChannel();
        if (clientChannel2 != null) {
            com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
            int i = com.paypal.oslo.feature.debitcard.servicing.data.mapper.GetDebitPinMapperKt.WhenMappings.$EnumSwitchMapping$0[clientChannel2.ordinal()];
            if (i == 1) {
                clientChannel = com.paypal.oslo.api.graphql.schema.type.ClientChannel.MOBILE;
            } else if (i == 2) {
                clientChannel = com.paypal.oslo.api.graphql.schema.type.ClientChannel.WEB;
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                clientChannel = com.paypal.oslo.api.graphql.schema.type.ClientChannel.UNKNOWN__;
            }
            com.apollographql.apollo.api.Optional.Present present = companion.present(clientChannel);
            if (present != null) {
                absent = present;
                experienceChannel = getDebitPinRequest.getExperienceChannel();
                if (experienceChannel != null) {
                    com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
                    int i2 = com.paypal.oslo.feature.debitcard.servicing.data.mapper.GetDebitPinMapperKt.WhenMappings.$EnumSwitchMapping$1[experienceChannel.ordinal()];
                    if (i2 == 1) {
                        experienceChannel2 = com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.OSLO;
                    } else if (i2 == 2) {
                        experienceChannel2 = com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.VENICE;
                    } else {
                        if (i2 != 3) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        experienceChannel2 = com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.UNKNOWN__;
                    }
                    com.apollographql.apollo.api.Optional.Present present2 = companion2.present(experienceChannel2);
                    if (present2 != null) {
                        absent2 = present2;
                        return new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput(instrumentId, cardVerificationCode, absent, absent2);
                    }
                }
                absent2 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
                return new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput(instrumentId, cardVerificationCode, absent, absent2);
            }
        }
        absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        experienceChannel = getDebitPinRequest.getExperienceChannel();
        if (experienceChannel != null) {
        }
        absent2 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        return new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput(instrumentId, cardVerificationCode, absent, absent2);
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails $r8$lambda$FcRWZWem1478op04vmtCutl9n_o(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin debitInstrumentPin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentPin, "");
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus invoke = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentPinStatusMapper().invoke(debitInstrumentPin.getDebitInstrumentPinFragment().getStatus());
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinProfileName invoke2 = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentPinProfileNameMapper().invoke(debitInstrumentPin.getDebitInstrumentPinFragment().getProfileName());
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinOrigin invoke3 = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentPinOriginMapper().invoke(debitInstrumentPin.getDebitInstrumentPinFragment().getOrigin());
        java.lang.String pin = debitInstrumentPin.getPin();
        java.lang.String str = pin == null ? "" : pin;
        java.lang.Integer expiresInSec = debitInstrumentPin.getExpiresInSec();
        return new com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails(invoke, invoke2, invoke3, str, expiresInSec != null ? expiresInSec.intValue() : 15);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel.MOBILE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel.WEB.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel.values().length];
            try {
                iArr2[com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel.OSLO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel.VENICE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
