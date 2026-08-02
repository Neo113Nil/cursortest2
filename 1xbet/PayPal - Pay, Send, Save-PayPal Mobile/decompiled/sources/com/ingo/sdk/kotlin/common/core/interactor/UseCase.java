package com.ingo.sdk.kotlin.common.core.interactor;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u0001*\u0006\b\u0001\u0010\u0003 \u00002\u00020\u0001:\u0002,-B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\b\u001a\u00028\u0001H¦@¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00012 \b\u0002\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\u000e0\rH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u000e2\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\u000e2\n\u0010\u001b\u001a\u00060\u001ej\u0002`\u001fH&¢\u0006\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010*"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/interactor/UseCase;", "", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE, "Params", "", "scopeTimeout", "<init>", "(J)V", "params", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "run", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "onResult", "invoke", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onCancel", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Lkotlin/jvm/functions/Function0;)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "getBackgroundDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "e", "trackUseCaseException", "(Ljava/lang/Exception;)V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", "trackCancellationException", "(Ljava/util/concurrent/CancellationException;)V", "J", "getScopeTimeout", "()J", "Lkotlinx/coroutines/CompletableJob;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CompletableJob;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "UseCaseTimeoutFailure"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class UseCase<Type, Params> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CompletableJob getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;
    private final long scopeTimeout;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/interactor/UseCase$None;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class None {
    }

    public abstract java.lang.Object run(Params params, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, ? extends Type>> continuation);

    public abstract void trackCancellationException(java.util.concurrent.CancellationException e);

    public abstract void trackUseCaseException(java.lang.Exception e);

    public UseCase(long j) {
        kotlinx.coroutines.CompletableJob Job$default;
        this.scopeTimeout = j;
        Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        this.getHighSpeedVideoFpsRanges = Job$default;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(getBackgroundDispatcher().plus(Job$default));
    }

    public /* synthetic */ UseCase(long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 60000L : j);
    }

    public long getScopeTimeout() {
        return this.scopeTimeout;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/interactor/UseCase$UseCaseTimeoutFailure;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure$FeatureFailure;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UseCaseTimeoutFailure extends com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UseCaseTimeoutFailure(java.lang.Throwable th) {
            super(th);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void invoke$default(com.ingo.sdk.kotlin.common.core.interactor.UseCase useCase, java.lang.Object obj, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.common.core.interactor.UseCase$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return com.ingo.sdk.kotlin.common.core.interactor.UseCase.$r8$lambda$cD99s_gECLo9eE6HR6Jq4upmr3c((com.ingo.sdk.kotlin.common.core.functional.Either) obj3);
                }
            };
        }
        useCase.invoke(obj, function1);
    }

    public final void invoke(Params params, kotlin.jvm.functions.Function1<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, ? extends Type>, kotlin.Unit> onResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResult, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new com.ingo.sdk.kotlin.common.core.interactor.UseCase$invoke$2(this, onResult, params, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void cancel$default(com.ingo.sdk.kotlin.common.core.interactor.UseCase useCase, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
        if ((i & 1) != 0) {
            function0 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.core.interactor.UseCase$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
        }
        useCase.cancel(function0);
    }

    public final void cancel(kotlin.jvm.functions.Function0<kotlin.Unit> onCancel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCancel, "");
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Cancelling!!!", null, null, 6, null);
        kotlinx.coroutines.JobKt__JobKt.cancelChildren$default(this.getHighResolutionOutputSizeshNQ4ISI.getCoroutineContext(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        onCancel.invoke();
    }

    protected final kotlinx.coroutines.CoroutineDispatcher getBackgroundDispatcher() {
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.core.IngoDispatchers.class));
        if (obj != null) {
            return ((com.ingo.sdk.kotlin.common.core.IngoDispatchers) obj).getBackgroundDispatcher();
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.core.IngoDispatchers");
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cD99s_gECLo9eE6HR6Jq4upmr3c(com.ingo.sdk.kotlin.common.core.functional.Either either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.ingo.sdk.kotlin.common.core.functional.Either.Left access$onCancellationException(com.ingo.sdk.kotlin.common.core.interactor.UseCase useCase, java.util.concurrent.CancellationException cancellationException) {
        useCase.trackCancellationException(cancellationException);
        return new com.ingo.sdk.kotlin.common.core.functional.Either.Left(new com.ingo.sdk.kotlin.common.core.interactor.UseCase.UseCaseTimeoutFailure(cancellationException));
    }

    public static final /* synthetic */ com.ingo.sdk.kotlin.common.core.functional.Either.Left access$onUseCaseException(com.ingo.sdk.kotlin.common.core.interactor.UseCase useCase, final java.lang.Exception exc) {
        useCase.trackUseCaseException(exc);
        return new com.ingo.sdk.kotlin.common.core.functional.Either.Left(new com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure(exc) { // from class: com.ingo.sdk.kotlin.common.core.interactor.UseCase$onUseCaseException$1
            {
                super(exc);
            }
        });
    }

    public UseCase() {
        this(0L, 1, null);
    }
}
