package com.paypal.oslo.feature.debitcard.servicing.data.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0000j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/SetDebitPinRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/SetDebitInstrumentPinInput;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "setDebitPinRequestMapper", "Lkotlin/jvm/functions/Function1;", "getSetDebitPinRequestMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/SetDebitInstrumentPinMutation$Data;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/SetDebitPinResult;", "setDebitPinResponseMapper", "getSetDebitPinResponseMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SetDebitPinMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinRequest, com.paypal.oslo.api.graphql.schema.type.SetDebitInstrumentPinInput> setDebitPinRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.SetDebitPinMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.SetDebitPinMapperKt.$r8$lambda$cowC1VebDz0enRehgGaTtE1yIws((com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.SetDebitInstrumentPinMutation.Data, com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinResult> setDebitPinResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.SetDebitPinMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.SetDebitPinMapperKt.m14286$r8$lambda$GYx_8bc5spx9fu7p2E_4GGegmk((com.paypal.oslo.feature.debitcard.graphql.SetDebitInstrumentPinMutation.Data) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinRequest, com.paypal.oslo.api.graphql.schema.type.SetDebitInstrumentPinInput> getSetDebitPinRequestMapper() {
        return setDebitPinRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.SetDebitInstrumentPinMutation.Data, com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinResult> getSetDebitPinResponseMapper() {
        return setDebitPinResponseMapper;
    }

    /* renamed from: $r8$lambda$GYx_8bc5spx9fu7p2E_4G-Gegmk, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinResult m14286$r8$lambda$GYx_8bc5spx9fu7p2E_4GGegmk(com.paypal.oslo.feature.debitcard.graphql.SetDebitInstrumentPinMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinResult(data.getSetDebitInstrumentPin().getSuccess());
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.SetDebitInstrumentPinInput $r8$lambda$cowC1VebDz0enRehgGaTtE1yIws(com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinRequest setDebitPinRequest) {
        com.paypal.oslo.api.graphql.schema.type.DebitAcquisitionFlowIntent debitAcquisitionFlowIntent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setDebitPinRequest, "");
        java.lang.String cardId = setDebitPinRequest.getCardId();
        java.lang.String pin = setDebitPinRequest.getPin();
        int i = com.paypal.oslo.feature.debitcard.servicing.data.mapper.SetDebitPinMapperKt.WhenMappings.$EnumSwitchMapping$0[setDebitPinRequest.getFlowType().ordinal()];
        if (i == 1) {
            debitAcquisitionFlowIntent = com.paypal.oslo.api.graphql.schema.type.DebitAcquisitionFlowIntent.ONBOARDING;
        } else if (i == 2) {
            debitAcquisitionFlowIntent = com.paypal.oslo.api.graphql.schema.type.DebitAcquisitionFlowIntent.REBOARDING;
        } else if (i == 3) {
            debitAcquisitionFlowIntent = com.paypal.oslo.api.graphql.schema.type.DebitAcquisitionFlowIntent.STANDALONE;
        } else {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            debitAcquisitionFlowIntent = com.paypal.oslo.api.graphql.schema.type.DebitAcquisitionFlowIntent.OTHER;
        }
        return new com.paypal.oslo.api.graphql.schema.type.SetDebitInstrumentPinInput(cardId, pin, debitAcquisitionFlowIntent);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType.ONBOARDING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType.REBOARDING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType.STANDALONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType.OTHER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
