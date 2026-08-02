package com.paypal.oslo.feature.debitcard.servicing.data.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0000j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007*0\b\u0000\u0010\u000e\u001a\u0004\b\u0000\u0010\f\u001a\u0004\b\u0001\u0010\r\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/ReissueCardRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/ReissueDebitInstrumentInput;", "Lcom/paypal/oslo/feature/debitcard/servicing/data/mapper/Mapper;", "reissueCardRequestMapper", "Lkotlin/jvm/functions/Function1;", "getReissueCardRequestMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/ReissueDebitInstrumentMutation$Data;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/ReissueCardResponse;", "reissueCardResponseMapper", "getReissueCardResponseMapper", "INPUT", "OUTPUT", "Mapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReissueCardMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardRequest, com.paypal.oslo.api.graphql.schema.type.ReissueDebitInstrumentInput> reissueCardRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.ReissueCardMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.ReissueCardMapperKt.m14284$r8$lambda$vbDfy8p0GtQjRVgLCUSmQwmpw((com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.ReissueDebitInstrumentMutation.Data, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardResponse> reissueCardResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.ReissueCardMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.ReissueCardMapperKt.$r8$lambda$JKd1aplcW3VW54Zm4U8u2smZGGE((com.paypal.oslo.feature.debitcard.graphql.ReissueDebitInstrumentMutation.Data) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardRequest, com.paypal.oslo.api.graphql.schema.type.ReissueDebitInstrumentInput> getReissueCardRequestMapper() {
        return reissueCardRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.ReissueDebitInstrumentMutation.Data, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardResponse> getReissueCardResponseMapper() {
        return reissueCardResponseMapper;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardResponse $r8$lambda$JKd1aplcW3VW54Zm4U8u2smZGGE(com.paypal.oslo.feature.debitcard.graphql.ReissueDebitInstrumentMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardResponse(data.getReissueDebitInstrument().getSuccess());
    }

    /* renamed from: $r8$lambda$vb-Dfy8p0GtQjRVgLCUSmQwm-pw, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ReissueDebitInstrumentInput m14284$r8$lambda$vbDfy8p0GtQjRVgLCUSmQwmpw(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardRequest reissueCardRequest) {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentReissueReason debitInstrumentReissueReason;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reissueCardRequest, "");
        java.lang.String instrumentId = reissueCardRequest.getInstrumentId();
        int i = com.paypal.oslo.feature.debitcard.servicing.data.mapper.ReissueCardMapperKt.WhenMappings.$EnumSwitchMapping$0[reissueCardRequest.getReason().ordinal()];
        if (i == 1) {
            debitInstrumentReissueReason = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentReissueReason.LOST_STOLEN;
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            debitInstrumentReissueReason = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentReissueReason.WORN;
        }
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentReissueReason debitInstrumentReissueReason2 = debitInstrumentReissueReason;
        java.lang.String shippingAddressId = reissueCardRequest.getShippingAddressId();
        return new com.paypal.oslo.api.graphql.schema.type.ReissueDebitInstrumentInput(instrumentId, debitInstrumentReissueReason2, shippingAddressId != null ? new com.apollographql.apollo.api.Optional.Present(shippingAddressId) : com.apollographql.apollo.api.Optional.Absent.INSTANCE, com.apollographql.apollo.api.Optional.Absent.INSTANCE, com.apollographql.apollo.api.Optional.Absent.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason.LOST_STOLEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason.WORN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
