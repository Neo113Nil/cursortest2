package com.paypal.oslo.feature.taptopay.domain.observer.paypal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/observer/paypal/NotifyServerOnCardStateChangeObserver;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OrphanedCardLifecycleDependency;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalObserveCardStateUseCase;", "payPalObserveCardStateUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;", "payPalCardRepository", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalObserveCardStateUseCase;Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalObserveCardStateUseCase;Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NotifyServerOnCardStateChangeObserver implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OrphanedCardLifecycleDependency {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository Camera2StreamConfigurationMap;

    public NotifyServerOnCardStateChangeObserver(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase payPalObserveCardStateUseCase, com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository payPalCardRepository, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalObserveCardStateUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalCardRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.Camera2StreamConfigurationMap = payPalCardRepository;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineDispatcher.plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        this.getHighSpeedVideoFpsRangesFor = CoroutineScope;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Observing card state changes", null, null, 6, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver.AnonymousClass1(payPalObserveCardStateUseCase, this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$notifyCardDeleted(com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver notifyServerOnCardStateChangeObserver, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardDeleted$1 notifyServerOnCardStateChangeObserver$notifyCardDeleted$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardDeleted$1) {
            notifyServerOnCardStateChangeObserver$notifyCardDeleted$1 = (com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardDeleted$1) continuation;
            if ((notifyServerOnCardStateChangeObserver$notifyCardDeleted$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                notifyServerOnCardStateChangeObserver$notifyCardDeleted$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = notifyServerOnCardStateChangeObserver$notifyCardDeleted$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notifyServerOnCardStateChangeObserver$notifyCardDeleted$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository payPalCardRepository = notifyServerOnCardStateChangeObserver.Camera2StreamConfigurationMap;
                    notifyServerOnCardStateChangeObserver$notifyCardDeleted$1.getHighSpeedVideoFpsRanges = deviceWalletServiceCardId;
                    notifyServerOnCardStateChangeObserver$notifyCardDeleted$1.getHighSpeedVideoSizes = 1;
                    obj = payPalCardRepository.notifyCardDeleted(deviceWalletServiceCardId, notifyServerOnCardStateChangeObserver$notifyCardDeleted$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    deviceWalletServiceCardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId) notifyServerOnCardStateChangeObserver$notifyCardDeleted$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Successfully notified card deleted", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", deviceWalletServiceCardId.getId())), 2, null);
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.taptopay.LoggerKt.log.w("Failed to notify card deleted", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardDeletedError) ((arrow.core.Either.Left) either).getValue()).getServiceApiError().toString())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", deviceWalletServiceCardId.getId())));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        notifyServerOnCardStateChangeObserver$notifyCardDeleted$1 = new com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardDeleted$1(notifyServerOnCardStateChangeObserver, continuation);
        java.lang.Object obj2 = notifyServerOnCardStateChangeObserver$notifyCardDeleted$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notifyServerOnCardStateChangeObserver$notifyCardDeleted$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$notifyCardResumed(com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver notifyServerOnCardStateChangeObserver, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardResumed$1 notifyServerOnCardStateChangeObserver$notifyCardResumed$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardResumed$1) {
            notifyServerOnCardStateChangeObserver$notifyCardResumed$1 = (com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardResumed$1) continuation;
            if ((notifyServerOnCardStateChangeObserver$notifyCardResumed$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                notifyServerOnCardStateChangeObserver$notifyCardResumed$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = notifyServerOnCardStateChangeObserver$notifyCardResumed$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notifyServerOnCardStateChangeObserver$notifyCardResumed$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository payPalCardRepository = notifyServerOnCardStateChangeObserver.Camera2StreamConfigurationMap;
                    notifyServerOnCardStateChangeObserver$notifyCardResumed$1.getHighSpeedVideoFpsRanges = deviceWalletServiceCardId;
                    notifyServerOnCardStateChangeObserver$notifyCardResumed$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = payPalCardRepository.notifyCardResumed(deviceWalletServiceCardId, notifyServerOnCardStateChangeObserver$notifyCardResumed$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    deviceWalletServiceCardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId) notifyServerOnCardStateChangeObserver$notifyCardResumed$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Successfully notified card resumed", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", deviceWalletServiceCardId.getId())), 2, null);
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.taptopay.LoggerKt.log.w("Failed to notify card resumed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardResumedError) ((arrow.core.Either.Left) either).getValue()).getServiceApiError().toString())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", deviceWalletServiceCardId.getId())));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        notifyServerOnCardStateChangeObserver$notifyCardResumed$1 = new com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardResumed$1(notifyServerOnCardStateChangeObserver, continuation);
        java.lang.Object obj2 = notifyServerOnCardStateChangeObserver$notifyCardResumed$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notifyServerOnCardStateChangeObserver$notifyCardResumed$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$notifyCardSuspended(com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver notifyServerOnCardStateChangeObserver, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardSuspended$1 notifyServerOnCardStateChangeObserver$notifyCardSuspended$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardSuspended$1) {
            notifyServerOnCardStateChangeObserver$notifyCardSuspended$1 = (com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardSuspended$1) continuation;
            if ((notifyServerOnCardStateChangeObserver$notifyCardSuspended$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                notifyServerOnCardStateChangeObserver$notifyCardSuspended$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = notifyServerOnCardStateChangeObserver$notifyCardSuspended$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notifyServerOnCardStateChangeObserver$notifyCardSuspended$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository payPalCardRepository = notifyServerOnCardStateChangeObserver.Camera2StreamConfigurationMap;
                    notifyServerOnCardStateChangeObserver$notifyCardSuspended$1.Camera2StreamConfigurationMap = deviceWalletServiceCardId;
                    notifyServerOnCardStateChangeObserver$notifyCardSuspended$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = payPalCardRepository.notifyCardSuspended(deviceWalletServiceCardId, notifyServerOnCardStateChangeObserver$notifyCardSuspended$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    deviceWalletServiceCardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId) notifyServerOnCardStateChangeObserver$notifyCardSuspended$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Successfully notified card suspended", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", deviceWalletServiceCardId.getId())), 2, null);
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.taptopay.LoggerKt.log.w("Failed to notify card suspended", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardSuspendError) ((arrow.core.Either.Left) either).getValue()).getServiceApiError().toString())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", deviceWalletServiceCardId.getId())));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        notifyServerOnCardStateChangeObserver$notifyCardSuspended$1 = new com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardSuspended$1(notifyServerOnCardStateChangeObserver, continuation);
        java.lang.Object obj2 = notifyServerOnCardStateChangeObserver$notifyCardSuspended$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notifyServerOnCardStateChangeObserver$notifyCardSuspended$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$notifyCardUpdated(com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver notifyServerOnCardStateChangeObserver, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardUpdated$1 notifyServerOnCardStateChangeObserver$notifyCardUpdated$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardUpdated$1) {
            notifyServerOnCardStateChangeObserver$notifyCardUpdated$1 = (com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardUpdated$1) continuation;
            if ((notifyServerOnCardStateChangeObserver$notifyCardUpdated$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                notifyServerOnCardStateChangeObserver$notifyCardUpdated$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = notifyServerOnCardStateChangeObserver$notifyCardUpdated$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notifyServerOnCardStateChangeObserver$notifyCardUpdated$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository payPalCardRepository = notifyServerOnCardStateChangeObserver.Camera2StreamConfigurationMap;
                    notifyServerOnCardStateChangeObserver$notifyCardUpdated$1.getHighResolutionOutputSizeshNQ4ISI = deviceWalletServiceCardId;
                    notifyServerOnCardStateChangeObserver$notifyCardUpdated$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalDigitizedCard);
                    notifyServerOnCardStateChangeObserver$notifyCardUpdated$1.Camera2StreamConfigurationMap = 1;
                    obj = payPalCardRepository.notifyCardUpdated(payPalDigitizedCard, notifyServerOnCardStateChangeObserver$notifyCardUpdated$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    deviceWalletServiceCardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId) notifyServerOnCardStateChangeObserver$notifyCardUpdated$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Successfully notified card updated", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", deviceWalletServiceCardId.getId())), 2, null);
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.taptopay.LoggerKt.log.w("Failed to notify card updated", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardUpdatedError) ((arrow.core.Either.Left) either).getValue()).getDebugMessage())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", deviceWalletServiceCardId.getId())));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        notifyServerOnCardStateChangeObserver$notifyCardUpdated$1 = new com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$notifyCardUpdated$1(notifyServerOnCardStateChangeObserver, continuation);
        java.lang.Object obj2 = notifyServerOnCardStateChangeObserver$notifyCardUpdated$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notifyServerOnCardStateChangeObserver$notifyCardUpdated$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public NotifyServerOnCardStateChangeObserver(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase payPalObserveCardStateUseCase, com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository payPalCardRepository) {
        this(payPalObserveCardStateUseCase, payPalCardRepository, kotlinx.coroutines.Dispatchers.getIO());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalObserveCardStateUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalCardRepository, "");
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$1", f = "NotifyServerOnCardStateChangeObserver.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, nl = {102}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01441<T> implements kotlinx.coroutines.flow.FlowCollector {
            final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver getHighResolutionOutputSizeshNQ4ISI;

            /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:16|17)(2:13|14))(7:22|23|(1:(1:(1:(2:28|(2:30|31)))(2:32|(2:34|31)))(2:35|(2:37|31)))(1:38)|40|41|19|20)|18|19|20))|42|6|7|(0)(0)|18|19|20) */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
            
                if (r11 == r1) goto L37;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange payPalCardStateChange, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$1$1$emit$1 notifyServerOnCardStateChangeObserver$1$1$emit$1;
                int i;
                if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$1$1$emit$1) {
                    notifyServerOnCardStateChangeObserver$1$1$emit$1 = (com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$1$1$emit$1) continuation;
                    if ((notifyServerOnCardStateChangeObserver$1$1$emit$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                        notifyServerOnCardStateChangeObserver$1$1$emit$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                        java.lang.Object obj = notifyServerOnCardStateChangeObserver$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = notifyServerOnCardStateChangeObserver$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                            kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", payPalCardStateChange.getCard().getDigitizedCard().getCardId()));
                            kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("changeType", payPalCardStateChange.getType()));
                            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId = payPalCardStateChange.getCard().getDeviceWalletServiceCardId();
                            int i2 = com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver.AnonymousClass1.C01441.WhenMappings.$EnumSwitchMapping$0[payPalCardStateChange.getType().ordinal()];
                            payPalCardStateChange = payPalCardStateChange;
                            if (i2 == 1) {
                                com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver notifyServerOnCardStateChangeObserver = this.getHighResolutionOutputSizeshNQ4ISI;
                                notifyServerOnCardStateChangeObserver$1$1$emit$1.Camera2StreamConfigurationMap = payPalCardStateChange;
                                notifyServerOnCardStateChangeObserver$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceWalletServiceCardId);
                                notifyServerOnCardStateChangeObserver$1$1$emit$1.getHighSpeedVideoFpsRangesFor = 1;
                                java.lang.Object access$notifyCardDeleted = com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver.access$notifyCardDeleted(notifyServerOnCardStateChangeObserver, deviceWalletServiceCardId, notifyServerOnCardStateChangeObserver$1$1$emit$1);
                                payPalCardStateChange = access$notifyCardDeleted;
                            } else if (i2 == 2) {
                                com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver notifyServerOnCardStateChangeObserver2 = this.getHighResolutionOutputSizeshNQ4ISI;
                                notifyServerOnCardStateChangeObserver$1$1$emit$1.Camera2StreamConfigurationMap = payPalCardStateChange;
                                notifyServerOnCardStateChangeObserver$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceWalletServiceCardId);
                                notifyServerOnCardStateChangeObserver$1$1$emit$1.getHighSpeedVideoFpsRangesFor = 2;
                                java.lang.Object access$notifyCardSuspended = com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver.access$notifyCardSuspended(notifyServerOnCardStateChangeObserver2, deviceWalletServiceCardId, notifyServerOnCardStateChangeObserver$1$1$emit$1);
                                payPalCardStateChange = access$notifyCardSuspended;
                                if (access$notifyCardSuspended == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (i2 == 3) {
                                com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver notifyServerOnCardStateChangeObserver3 = this.getHighResolutionOutputSizeshNQ4ISI;
                                notifyServerOnCardStateChangeObserver$1$1$emit$1.Camera2StreamConfigurationMap = payPalCardStateChange;
                                notifyServerOnCardStateChangeObserver$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceWalletServiceCardId);
                                notifyServerOnCardStateChangeObserver$1$1$emit$1.getHighSpeedVideoFpsRangesFor = 3;
                                java.lang.Object access$notifyCardResumed = com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver.access$notifyCardResumed(notifyServerOnCardStateChangeObserver3, deviceWalletServiceCardId, notifyServerOnCardStateChangeObserver$1$1$emit$1);
                                payPalCardStateChange = access$notifyCardResumed;
                                if (access$notifyCardResumed == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (i2 == 4) {
                                com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver notifyServerOnCardStateChangeObserver4 = this.getHighResolutionOutputSizeshNQ4ISI;
                                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard card = payPalCardStateChange.getCard();
                                notifyServerOnCardStateChangeObserver$1$1$emit$1.Camera2StreamConfigurationMap = payPalCardStateChange;
                                notifyServerOnCardStateChangeObserver$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceWalletServiceCardId);
                                notifyServerOnCardStateChangeObserver$1$1$emit$1.getHighSpeedVideoFpsRangesFor = 4;
                                java.lang.Object access$notifyCardUpdated = com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver.access$notifyCardUpdated(notifyServerOnCardStateChangeObserver4, deviceWalletServiceCardId, card, notifyServerOnCardStateChangeObserver$1$1$emit$1);
                                payPalCardStateChange = access$notifyCardUpdated;
                                if (access$notifyCardUpdated == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            com.paypal.oslo.feature.taptopay.LoggerKt.log.e("Failed to notify PayPal backend of card state change", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("changeType", payPalCardStateChange.getType())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", payPalCardStateChange.getCard().getDigitizedCard().getCardId())), th);
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i != 1 && i != 2 && i != 3 && i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange payPalCardStateChange2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange) notifyServerOnCardStateChangeObserver$1$1$emit$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        payPalCardStateChange = payPalCardStateChange2;
                        return kotlin.Unit.INSTANCE;
                    }
                }
                notifyServerOnCardStateChangeObserver$1$1$emit$1 = new com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$1$1$emit$1(this, continuation);
                java.lang.Object obj2 = notifyServerOnCardStateChangeObserver$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notifyServerOnCardStateChangeObserver$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                }
                return kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver$1$1$WhenMappings */
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.values().length];
                    try {
                        iArr[com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.DELETED.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.SUSPENDED.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.RESUMED.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.UPDATED.ordinal()] = 4;
                    } catch (java.lang.NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            C01441(com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver notifyServerOnCardStateChangeObserver) {
                this.getHighResolutionOutputSizeshNQ4ISI = notifyServerOnCardStateChangeObserver;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizes = 1;
                if (this.getHighSpeedVideoFpsRangesFor.invoke().collect(new com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver.AnonymousClass1.C01441(this.Camera2StreamConfigurationMap), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase payPalObserveCardStateUseCase, com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver notifyServerOnCardStateChangeObserver, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.observer.paypal.NotifyServerOnCardStateChangeObserver.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = payPalObserveCardStateUseCase;
            this.Camera2StreamConfigurationMap = notifyServerOnCardStateChangeObserver;
        }
    }
}
