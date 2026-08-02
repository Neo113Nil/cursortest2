package com.paypal.oslo.feature.p2p.ui.claim.middlewares;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/middlewares/ClaimPreviewMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/p2p/ui/claim/state/ClaimPreviewUiState;", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent;", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferUseCase;", "getPaymentTransferUseCase", "Lcom/paypal/oslo/feature/p2p/domain/usecase/ClaimMoneyUseCase;", "claimMoneyUseCase", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferUseCase;Lcom/paypal/oslo/feature/p2p/domain/usecase/ClaimMoneyUseCase;Lcom/paypal/oslo/core/userstore/UserStore;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "Lcom/paypal/oslo/feature/p2p/domain/model/ClaimMoneyTransfer;", "Lcom/paypal/oslo/feature/p2p/ui/claim/composables/ClaimPreviewData;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/p2p/domain/model/ClaimMoneyTransfer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/p2p/domain/usecase/ClaimMoneyUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/userstore/UserStore;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ClaimPreviewMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState, com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.ClaimMoneyUseCase Camera2StreamConfigurationMap;

    public ClaimPreviewMiddleware(com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferUseCase getPaymentTransferUseCase, com.paypal.oslo.feature.p2p.domain.usecase.ClaimMoneyUseCase claimMoneyUseCase, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaymentTransferUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claimMoneyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighSpeedVideoFpsRanges = getPaymentTransferUseCase;
        this.Camera2StreamConfigurationMap = claimMoneyUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = userStore;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState, com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent event = input.getEvent();
        if (!(event instanceof com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ScreenAppeared)) {
            if (event instanceof com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.AcceptMoneyClicked) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware$handleAcceptMoneyClicked$1(input, this, null), 3, null);
            }
        } else {
            com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ScreenAppeared screenAppeared = (com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ScreenAppeared) event;
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CLAIM_PREVIEW_SCREEN_APPEARED, null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_CODE_ID, screenAppeared.getPaymentCodeId())), 2, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware$handleScreenAppeared$1(this, screenAppeared, input, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b5, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyTransfer claimMoneyTransfer, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData> continuation) {
        com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware$toClaimPreviewData$1 claimPreviewMiddleware$toClaimPreviewData$1;
        int i;
        java.lang.Object m23436constructorimpl;
        java.lang.String str;
        com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName name2;
        java.lang.String businessName;
        java.lang.String str2;
        if (continuation instanceof com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware$toClaimPreviewData$1) {
            claimPreviewMiddleware$toClaimPreviewData$1 = (com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware$toClaimPreviewData$1) continuation;
            if ((claimPreviewMiddleware$toClaimPreviewData$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                claimPreviewMiddleware$toClaimPreviewData$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = claimPreviewMiddleware$toClaimPreviewData$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = claimPreviewMiddleware$toClaimPreviewData$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.util.Currency.getInstance(claimMoneyTransfer.getAmount().getCurrency()).getSymbol());
                    } catch (java.lang.Throwable th) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    }
                    java.lang.String currency = claimMoneyTransfer.getAmount().getCurrency();
                    if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                        m23436constructorimpl = currency;
                    }
                    java.lang.String str3 = (java.lang.String) m23436constructorimpl;
                    com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils userPaymentUtils = com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils.INSTANCE;
                    com.paypal.oslo.core.userstore.UserStore userStore = this.getHighResolutionOutputSizeshNQ4ISI;
                    claimPreviewMiddleware$toClaimPreviewData$1.getHighSpeedVideoFpsRangesFor = claimMoneyTransfer;
                    claimPreviewMiddleware$toClaimPreviewData$1.getHighSpeedVideoSizes = str3;
                    claimPreviewMiddleware$toClaimPreviewData$1.Camera2StreamConfigurationMap = 1;
                    java.lang.Object userEmail = userPaymentUtils.getUserEmail(userStore, claimPreviewMiddleware$toClaimPreviewData$1);
                    if (userEmail == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = str3;
                    obj = userEmail;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.String str4 = (java.lang.String) claimPreviewMiddleware$toClaimPreviewData$1.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyTransfer claimMoneyTransfer2 = (com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyTransfer) claimPreviewMiddleware$toClaimPreviewData$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str = str4;
                    claimMoneyTransfer = claimMoneyTransfer2;
                }
                java.lang.String str5 = (java.lang.String) obj;
                com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils userPaymentUtils2 = com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils.INSTANCE;
                com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink = claimMoneyTransfer.getPaymentLink();
                java.lang.String formatExpiryDate = userPaymentUtils2.formatExpiryDate(paymentLink == null ? paymentLink.getExpirationTime() : null);
                name2 = claimMoneyTransfer.getReceiver().getName();
                if (name2 instanceof com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Person) {
                    if (name2 instanceof com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Business) {
                        businessName = ((com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Business) name2).getBusinessName();
                    } else if (name2 != null) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    str2 = "";
                } else {
                    com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Person person = (com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Person) name2;
                    businessName = person.getFullName();
                    if (businessName == null) {
                        businessName = person.getGivenName();
                    }
                    str2 = businessName;
                }
                com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName name3 = claimMoneyTransfer.getReceiver().getName();
                java.lang.String initials = !(name3 instanceof com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Person) ? ((com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Person) name3).getInitials() : "";
                java.lang.String amount = claimMoneyTransfer.getAmount().getAmount();
                kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                java.lang.String profilePhotoUrl = claimMoneyTransfer.getReceiver().getProfilePhotoUrl();
                com.paypal.oslo.feature.p2p.domain.model.NoteDetails note = claimMoneyTransfer.getNote();
                return new com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData(amount, str, claimMoneyTransfer.getAmount().getCurrency(), str2, profilePhotoUrl, note == null ? note.getMemo() : null, str5, formatExpiryDate, initials);
            }
        }
        claimPreviewMiddleware$toClaimPreviewData$1 = new com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware$toClaimPreviewData$1(this, continuation);
        java.lang.Object obj2 = claimPreviewMiddleware$toClaimPreviewData$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = claimPreviewMiddleware$toClaimPreviewData$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        java.lang.String str52 = (java.lang.String) obj2;
        com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils userPaymentUtils22 = com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils.INSTANCE;
        com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink2 = claimMoneyTransfer.getPaymentLink();
        java.lang.String formatExpiryDate2 = userPaymentUtils22.formatExpiryDate(paymentLink2 == null ? paymentLink2.getExpirationTime() : null);
        name2 = claimMoneyTransfer.getReceiver().getName();
        if (name2 instanceof com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Person) {
        }
        com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName name32 = claimMoneyTransfer.getReceiver().getName();
        if (!(name32 instanceof com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Person)) {
        }
        java.lang.String amount2 = claimMoneyTransfer.getAmount().getAmount();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        java.lang.String profilePhotoUrl2 = claimMoneyTransfer.getReceiver().getProfilePhotoUrl();
        com.paypal.oslo.feature.p2p.domain.model.NoteDetails note2 = claimMoneyTransfer.getNote();
        return new com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData(amount2, str, claimMoneyTransfer.getAmount().getCurrency(), str2, profilePhotoUrl2, note2 == null ? note2.getMemo() : null, str52, formatExpiryDate2, initials);
    }
}
