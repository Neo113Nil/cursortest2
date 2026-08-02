package com.ingo.sdk.kotlin.common.features.configuration;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\f\u001a\u00020\t8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/configuration/ConfigurationRepositoryImpl;", "Lcom/ingo/sdk/kotlin/common/features/configuration/ConfigurationRepository;", "<init>", "()V", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "Lcom/ingo/sdk/kotlin/common/features/configuration/model/ConfigurationResponse;", "getConfiguration", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/features/configuration/ConfigurationApi;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConfigurationRepositoryImpl implements com.ingo.sdk.kotlin.common.features.configuration.ConfigurationRepository {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.features.configuration.ConfigurationRepositoryImpl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.ingo.sdk.kotlin.common.features.configuration.ConfigurationRepositoryImpl.$r8$lambda$SCBDPDB4ucXYBCdKzhNUPQ7OPe4();
        }
    });

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.configuration.ConfigurationApi $r8$lambda$SCBDPDB4ucXYBCdKzhNUPQ7OPe4() {
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.configuration.ConfigurationApi.class));
        if (obj != null) {
            return (com.ingo.sdk.kotlin.common.features.configuration.ConfigurationApi) obj;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.features.configuration.ConfigurationApi");
    }

    @Override // com.ingo.sdk.kotlin.common.features.configuration.ConfigurationRepository
    public final java.lang.Object getConfiguration(kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse>> continuation) {
        return ((com.ingo.sdk.kotlin.common.features.configuration.ConfigurationApi) this.getHighSpeedVideoFpsRanges.getValue()).getConfiguration(continuation);
    }
}
