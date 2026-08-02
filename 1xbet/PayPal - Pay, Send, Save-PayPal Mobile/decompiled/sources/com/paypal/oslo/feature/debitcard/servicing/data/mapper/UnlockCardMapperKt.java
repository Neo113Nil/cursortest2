package com.paypal.oslo.feature.debitcard.servicing.data.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\":\u0010\n\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0000j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/unlockcard/model/UnlockCardRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/UnlockDebitInstrumentInput;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "unlockCardRequestMapper", "Lkotlin/jvm/functions/Function1;", "getUnlockCardRequestMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/UnlockDebitInstrumentMutation$Data;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/unlockcard/model/UnlockCardResult;", "unlockCardResultMapper", "getUnlockCardResultMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UnlockCardMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardRequest, com.paypal.oslo.api.graphql.schema.type.UnlockDebitInstrumentInput> unlockCardRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.UnlockCardMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.UnlockCardMapperKt.$r8$lambda$Tvls8SzPs2KoFprYbTLeIkQMWlc((com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.UnlockDebitInstrumentMutation.Data, com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardResult> unlockCardResultMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.UnlockCardMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.UnlockCardMapperKt.m14289$r8$lambda$XYqIXgmg5uN7vLSEJKdXhZbkA((com.paypal.oslo.feature.debitcard.graphql.UnlockDebitInstrumentMutation.Data) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardRequest, com.paypal.oslo.api.graphql.schema.type.UnlockDebitInstrumentInput> getUnlockCardRequestMapper() {
        return unlockCardRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.UnlockDebitInstrumentMutation.Data, com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardResult> getUnlockCardResultMapper() {
        return unlockCardResultMapper;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UnlockDebitInstrumentInput $r8$lambda$Tvls8SzPs2KoFprYbTLeIkQMWlc(com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardRequest unlockCardRequest) {
        com.apollographql.apollo.api.Optional.Present present;
        com.apollographql.apollo.api.Optional.Present present2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unlockCardRequest, "");
        java.lang.String instrumentId = unlockCardRequest.getInstrumentId();
        java.lang.String clientChannel = unlockCardRequest.getClientChannel();
        com.apollographql.apollo.api.Optional.Absent absent = (clientChannel == null || (present2 = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.ClientChannel.INSTANCE.safeValueOf(clientChannel))) == null) ? com.apollographql.apollo.api.Optional.INSTANCE.absent() : present2;
        java.lang.String experienceChannel = unlockCardRequest.getExperienceChannel();
        return new com.paypal.oslo.api.graphql.schema.type.UnlockDebitInstrumentInput(instrumentId, absent, (experienceChannel == null || (present = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.INSTANCE.safeValueOf(experienceChannel))) == null) ? com.apollographql.apollo.api.Optional.INSTANCE.absent() : present);
    }

    /* renamed from: $r8$lambda$XYqIXgmg5uN7vLSEJ-KdXhZbk-A, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardResult m14289$r8$lambda$XYqIXgmg5uN7vLSEJKdXhZbkA(com.paypal.oslo.feature.debitcard.graphql.UnlockDebitInstrumentMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardResult(data.getUnlockDebitInstrument().getSuccess());
    }
}
