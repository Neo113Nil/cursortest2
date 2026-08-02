package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockInitializeNativeRypCheckoutRepository;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/InitializeNativeRypCheckoutRepository;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/inappcheckout/data/parser/InitializeNativeRypCheckoutParser;", "parser", "Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;", "mockFileNameProvider", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/feature/inappcheckout/data/parser/InitializeNativeRypCheckoutParser;Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;)V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "tokenType", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeNativeRypCheckoutResponseEntity;", "executeDirectCall", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/data/parser/InitializeNativeRypCheckoutParser;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockInitializeNativeRypCheckoutRepository implements com.paypal.oslo.feature.inappcheckout.domain.repository.InitializeNativeRypCheckoutRepository {
    private final com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider getHighSpeedVideoFpsRanges;
    public static final int $stable = 8;

    @javax.inject.Inject
    public MockInitializeNativeRypCheckoutRepository(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser initializeNativeRypCheckoutParser, com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeNativeRypCheckoutParser, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockFileNameProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        this.Camera2StreamConfigurationMap = initializeNativeRypCheckoutParser;
        this.getHighSpeedVideoFpsRanges = mockFileNameProvider;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.InitializeNativeRypCheckoutRepository
    public final java.lang.Object executeDirectCall(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity>> continuation) {
        return com.paypal.oslo.feature.inappcheckout.data.utils.RetryUtilKt.executeWithRetry(0, new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository$executeDirectCall$2(this, null), continuation);
    }
}
