package com.paypal.oslo.feature.debitcard.servicing.data.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\":\u0010\n\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0000j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/model/ActivatePhysicalCardRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivatePhysicalDebitInstrumentInput;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "activatePhysicalCardRequestMapper", "Lkotlin/jvm/functions/Function1;", "getActivatePhysicalCardRequestMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/ActivatePhysicalDebitInstrumentMutation$Data;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/model/ActivatePhysicalCardResult;", "activatePhysicalCardResultMapper", "getActivatePhysicalCardResultMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActivatePhysicalCardMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardRequest, com.paypal.oslo.api.graphql.schema.type.ActivatePhysicalDebitInstrumentInput> activatePhysicalCardRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.ActivatePhysicalCardMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.ActivatePhysicalCardMapperKt.$r8$lambda$yne0VKh3fvTJpYNjgF18WBWHquI((com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.Data, com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardResult> activatePhysicalCardResultMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.ActivatePhysicalCardMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.ActivatePhysicalCardMapperKt.m14275$r8$lambda$K4vkArTEbevImNBhvVFOmn3cY((com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.Data) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardRequest, com.paypal.oslo.api.graphql.schema.type.ActivatePhysicalDebitInstrumentInput> getActivatePhysicalCardRequestMapper() {
        return activatePhysicalCardRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.Data, com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardResult> getActivatePhysicalCardResultMapper() {
        return activatePhysicalCardResultMapper;
    }

    /* renamed from: $r8$lambda$K-4vkArTE-bevImNBhvVFOmn3cY, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardResult m14275$r8$lambda$K4vkArTEbevImNBhvVFOmn3cY(com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardResult(data.getActivatePhysicalDebitInstrument().getInstrumentId(), data.getActivatePhysicalDebitInstrument().getProductName().getRawValue(), com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentLifecycleStatusMapper().invoke(data.getActivatePhysicalDebitInstrument().getLifecycleState()), data.getActivatePhysicalDebitInstrument().isPrimary());
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ActivatePhysicalDebitInstrumentInput $r8$lambda$yne0VKh3fvTJpYNjgF18WBWHquI(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardRequest activatePhysicalCardRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activatePhysicalCardRequest, "");
        return new com.paypal.oslo.api.graphql.schema.type.ActivatePhysicalDebitInstrumentInput(activatePhysicalCardRequest.getInstrumentId(), null, null, null, com.apollographql.apollo.api.Optional.INSTANCE.present(activatePhysicalCardRequest.getCardVerificationCode()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(activatePhysicalCardRequest.getPin()), 14, null);
    }
}
