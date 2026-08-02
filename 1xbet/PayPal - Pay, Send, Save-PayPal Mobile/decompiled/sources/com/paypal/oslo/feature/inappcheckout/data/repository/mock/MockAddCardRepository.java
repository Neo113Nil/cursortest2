package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockAddCardRepository;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/BaseMockCardOperationRepository;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AddCardRepository;", "Landroid/content/Context;", "context", "Lkotlinx/serialization/json/Json;", "json", "Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;", "mockFileNameProvider", "<init>", "(Landroid/content/Context;Lkotlinx/serialization/json/Json;Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationPayloadEntity;", "payload", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationSuccessEntity;", com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OPERATION_NAME, "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationPayloadEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockAddCardRepository extends com.paypal.oslo.feature.inappcheckout.data.repository.mock.BaseMockCardOperationRepository implements com.paypal.oslo.feature.inappcheckout.domain.repository.AddCardRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public MockAddCardRepository(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, kotlinx.serialization.json.Json json, com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider) {
        super(context, json);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockFileNameProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = mockFileNameProvider;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.AddCardRepository
    public final java.lang.Object addCard(com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationPayloadEntity cardOperationPayloadEntity, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity>> continuation) {
        return executeMockCardOperation(this.getHighResolutionOutputSizeshNQ4ISI.getGetHighResolutionOutputSizeshNQ4ISI(), com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OPERATION_NAME, "externalAddCardErrorResponse", com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_add_card_error_unknown, continuation);
    }
}
