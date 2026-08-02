package com.paypal.oslo.feature.debitcard.servicing.data.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\":\u0010\n\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0000j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/lockcard/model/LockCardRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/DeactivateDebitInstrumentInput;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "lockCardRequestMapper", "Lkotlin/jvm/functions/Function1;", "getLockCardRequestMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/DeactivateDebitInstrumentMutation$Data;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/lockcard/model/LockCardResult;", "lockCardResultMapper", "getLockCardResultMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LockCardMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.lockcard.model.LockCardRequest, com.paypal.oslo.api.graphql.schema.type.DeactivateDebitInstrumentInput> lockCardRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.LockCardMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.LockCardMapperKt.$r8$lambda$_amg2hIlfxjEb_gFIDu60ZJx4PI((com.paypal.oslo.feature.debitcard.servicing.domain.lockcard.model.LockCardRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DeactivateDebitInstrumentMutation.Data, com.paypal.oslo.feature.debitcard.servicing.domain.lockcard.model.LockCardResult> lockCardResultMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.LockCardMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.LockCardMapperKt.$r8$lambda$IZD7SQhZLGZIknr7fwIi5unk1Ec((com.paypal.oslo.feature.debitcard.graphql.DeactivateDebitInstrumentMutation.Data) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.lockcard.model.LockCardRequest, com.paypal.oslo.api.graphql.schema.type.DeactivateDebitInstrumentInput> getLockCardRequestMapper() {
        return lockCardRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DeactivateDebitInstrumentMutation.Data, com.paypal.oslo.feature.debitcard.servicing.domain.lockcard.model.LockCardResult> getLockCardResultMapper() {
        return lockCardResultMapper;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.lockcard.model.LockCardResult $r8$lambda$IZD7SQhZLGZIknr7fwIi5unk1Ec(com.paypal.oslo.feature.debitcard.graphql.DeactivateDebitInstrumentMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.lockcard.model.LockCardResult(data.getDeactivateDebitInstrument().getSuccess());
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DeactivateDebitInstrumentInput $r8$lambda$_amg2hIlfxjEb_gFIDu60ZJx4PI(com.paypal.oslo.feature.debitcard.servicing.domain.lockcard.model.LockCardRequest lockCardRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lockCardRequest, "");
        return new com.paypal.oslo.api.graphql.schema.type.DeactivateDebitInstrumentInput(lockCardRequest.getInstrumentId());
    }
}
