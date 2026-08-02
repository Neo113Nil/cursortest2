package com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel$loadPayRequestData$1", f = "PayRequestViewModel.kt", i = {0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {131, 146, 148}, m = "invokeSuspend", n = {"resolvedIdType", "resolvedIdType", "this_$iv", "paymentRequest", "$i$f$fold", "$i$a$-fold-PayRequestViewModel$loadPayRequestData$1$2", "resolvedIdType", "this_$iv", "paymentRequest", "userEmail", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate, "$i$f$fold", "$i$a$-fold-PayRequestViewModel$loadPayRequestData$1$2"}, nl = {134, 147, 149}, s = {"L$0", "L$0", "L$1", "L$4", "I$0", "I$1", "L$0", "L$1", "L$3", "L$4", "L$5", "I$0", "I$1"}, v = 2)
/* loaded from: classes13.dex */
final class PayRequestViewModel$loadPayRequestData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel getOutputSizes;

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00d8, code lost:
    
        if (r10 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x015c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType paymentRequestIdType;
        com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentRequestUseCase getPaymentRequestUseCase;
        java.lang.String str2;
        java.lang.Object invoke;
        java.lang.String str3;
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent, kotlin.Unit> function1;
        com.paypal.oslo.feature.p2p.domain.model.PaymentRequest paymentRequest;
        com.paypal.oslo.core.userstore.UserStore userStore;
        java.lang.Object userEmail;
        arrow.core.Either either;
        com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel payRequestViewModel;
        com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType paymentRequestIdType2;
        int i;
        com.paypal.oslo.core.userstore.UserStore userStore2;
        java.lang.Object awaitUser;
        java.lang.String str4;
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent, kotlin.Unit> function12;
        java.lang.String str5;
        arrow.core.Either.Right right;
        java.lang.Object value;
        java.util.Iterator<T> it;
        java.lang.Object obj2;
        com.paypal.oslo.feature.p2p.domain.model.NoteDetails note;
        com.paypal.oslo.feature.p2p.domain.model.MediaItem media;
        java.lang.String scamUrl;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getOutputMinFrameDuration;
        java.lang.String str6 = null;
        int i3 = 0;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            str = this.getOutputSizes.getHighSpeedVideoFpsRangesFor;
            if (str == null || kotlin.jvm.internal.Intrinsics.areEqual(str, "PAYMENT_CODE")) {
                paymentRequestIdType = com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType.PAYMENT_CODE;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(str, "PAYMENT_REQUEST_ID")) {
                paymentRequestIdType = com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType.PAYMENT_REQUEST_ID;
            } else {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
                kotlin.Pair pair = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "PAR");
                str3 = this.getOutputSizes.getHighSpeedVideoFpsRangesFor;
                com.paypal.android.logger.Logger.e$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.PAR_UNRECOGNISED_REQUEST_ID_TYPE, kotlin.collections.MapsKt.mapOf(pair, kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.REQUEST_ID_TYPE, str3)), null, null, 12, null);
                paymentRequestIdType = com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType.PAYMENT_REQUEST_ID;
            }
            getPaymentRequestUseCase = this.getOutputSizes.getHighSpeedVideoFpsRanges;
            str2 = this.getOutputSizes.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentRequestIdType);
            this.getOutputMinFrameDuration = 1;
            invoke = getPaymentRequestUseCase.invoke(str2, paymentRequestIdType, this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.String str7 = (java.lang.String) this.getOutputFormats;
                    java.lang.String str8 = (java.lang.String) this.getInputSizeshNQ4ISI;
                    paymentRequest = (com.paypal.oslo.feature.p2p.domain.model.PaymentRequest) this.getInputFormats;
                    function12 = (kotlin.jvm.functions.Function1) this.getHighSpeedVideoSizesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str5 = str7;
                    str4 = str8;
                    awaitUser = obj;
                    right = (arrow.core.Either) awaitUser;
                    if (!(right instanceof arrow.core.Either.Right)) {
                        java.lang.String lowerCase = ((com.paypal.oslo.core.userstore.model.User) ((arrow.core.Either.Right) right).getValue()).getAccountCountryCode().toLowerCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        right = new arrow.core.Either.Right(lowerCase);
                    } else if (!(right instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (!(right instanceof arrow.core.Either.Left)) {
                        value = "us";
                    } else {
                        if (!(right instanceof arrow.core.Either.Right)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        value = ((arrow.core.Either.Right) right).getValue();
                    }
                    java.lang.String str9 = (java.lang.String) value;
                    it = paymentRequest.getDisclosures().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((com.paypal.oslo.feature.p2p.domain.model.Disclosure) obj2).getScamUrl() != null) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.p2p.domain.model.Disclosure disclosure = (com.paypal.oslo.feature.p2p.domain.model.Disclosure) obj2;
                    java.lang.String replace$default = (disclosure != null || (scamUrl = disclosure.getScamUrl()) == null) ? null : kotlin.text.StringsKt.replace$default(scamUrl, "%s", str9, false, 4, (java.lang.Object) null);
                    java.lang.String str10 = replace$default != null ? "" : replace$default;
                    com.paypal.oslo.feature.p2p.domain.model.Amount amount = paymentRequest.getAmount();
                    com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName name2 = paymentRequest.getReceiver().getName();
                    java.lang.String displayName = name2 == null ? name2.getDisplayName() : null;
                    java.lang.String str11 = displayName != null ? "" : displayName;
                    com.paypal.oslo.feature.p2p.domain.model.NoteDetails note2 = paymentRequest.getNote();
                    java.lang.String memo = note2 == null ? note2.getMemo() : null;
                    java.lang.String str12 = memo != null ? "" : memo;
                    com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink = paymentRequest.getPaymentLink();
                    java.lang.String url = paymentLink == null ? paymentLink.getUrl() : null;
                    java.lang.String str13 = url != null ? "" : url;
                    java.lang.String id = paymentRequest.getId();
                    note = paymentRequest.getNote();
                    if (note != null && (media = note.getMedia()) != null) {
                        str6 = media.getRefUrl();
                    }
                    function12.invoke(new com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.DataLoaded(new com.paypal.oslo.feature.p2p.ui.payrequest.models.PayRequestData(amount, str11, str12, str13, id, str6, paymentRequest.getReceiver().getProfilePhotoUrl(), str4, str5, str10)));
                    return kotlin.Unit.INSTANCE;
                }
                int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i5 = this.getHighSpeedVideoSizes;
                paymentRequest = (com.paypal.oslo.feature.p2p.domain.model.PaymentRequest) this.getInputSizeshNQ4ISI;
                kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent, kotlin.Unit> function13 = (kotlin.jvm.functions.Function1) this.getInputFormats;
                payRequestViewModel = (com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel) this.getHighSpeedVideoSizesFor;
                either = (arrow.core.Either) this.getHighSpeedVideoFpsRanges;
                paymentRequestIdType2 = (com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                function1 = function13;
                userEmail = obj;
                i3 = i5;
                i = i4;
                java.lang.String str14 = (java.lang.String) userEmail;
                com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils userPaymentUtils = com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils.INSTANCE;
                com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink2 = paymentRequest.getPaymentLink();
                java.lang.String formatExpiryDate = userPaymentUtils.formatExpiryDate(paymentLink2 == null ? paymentLink2.getExpirationTime() : null);
                userStore2 = payRequestViewModel.getInputFormats;
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentRequestIdType2);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getHighSpeedVideoSizesFor = function1;
                this.getInputFormats = paymentRequest;
                this.getInputSizeshNQ4ISI = str14;
                this.getOutputFormats = formatExpiryDate;
                this.getHighSpeedVideoSizes = i3;
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                this.getOutputMinFrameDuration = 3;
                awaitUser = com.paypal.oslo.core.userstore.UserStoreExtensionsKt.awaitUser(userStore2, this);
                if (awaitUser != coroutine_suspended) {
                    str4 = str14;
                    function12 = function1;
                    str5 = formatExpiryDate;
                    right = (arrow.core.Either) awaitUser;
                    if (!(right instanceof arrow.core.Either.Right)) {
                    }
                    if (!(right instanceof arrow.core.Either.Left)) {
                    }
                    java.lang.String str92 = (java.lang.String) value;
                    it = paymentRequest.getDisclosures().iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    com.paypal.oslo.feature.p2p.domain.model.Disclosure disclosure2 = (com.paypal.oslo.feature.p2p.domain.model.Disclosure) obj2;
                    if (disclosure2 != null) {
                    }
                    if (replace$default != null) {
                    }
                    com.paypal.oslo.feature.p2p.domain.model.Amount amount2 = paymentRequest.getAmount();
                    com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName name22 = paymentRequest.getReceiver().getName();
                    if (name22 == null) {
                    }
                    if (displayName != null) {
                    }
                    com.paypal.oslo.feature.p2p.domain.model.NoteDetails note22 = paymentRequest.getNote();
                    if (note22 == null) {
                    }
                    if (memo != null) {
                    }
                    com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink3 = paymentRequest.getPaymentLink();
                    if (paymentLink3 == null) {
                    }
                    if (url != null) {
                    }
                    java.lang.String id2 = paymentRequest.getId();
                    note = paymentRequest.getNote();
                    if (note != null) {
                        str6 = media.getRefUrl();
                    }
                    function12.invoke(new com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.DataLoaded(new com.paypal.oslo.feature.p2p.ui.payrequest.models.PayRequestData(amount2, str11, str12, str13, id2, str6, paymentRequest.getReceiver().getProfilePhotoUrl(), str4, str5, str10)));
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            paymentRequestIdType = (com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either2 = (arrow.core.Either) invoke;
        function1 = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel payRequestViewModel2 = this.getOutputSizes;
        if (!(either2 instanceof arrow.core.Either.Right)) {
            if (!(either2 instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError paymentTransferError = (com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError) ((arrow.core.Either.Left) either2).getValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.PAR_LOAD_PAYMENT_REQUEST_FAILED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "PAR"), kotlin.TuplesKt.to("errorMessage", paymentTransferError.toString())), null, 4, null);
            function1.invoke(new com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.DataLoadFailed(paymentTransferError.toString()));
            return kotlin.Unit.INSTANCE;
        }
        paymentRequest = (com.paypal.oslo.feature.p2p.domain.model.PaymentRequest) ((arrow.core.Either.Right) either2).getValue();
        com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils userPaymentUtils2 = com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils.INSTANCE;
        userStore = payRequestViewModel2.getInputFormats;
        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentRequestIdType);
        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
        this.getHighSpeedVideoSizesFor = payRequestViewModel2;
        this.getInputFormats = function1;
        this.getInputSizeshNQ4ISI = paymentRequest;
        this.getHighSpeedVideoSizes = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.getOutputMinFrameDuration = 2;
        userEmail = userPaymentUtils2.getUserEmail(userStore, this);
        if (userEmail != coroutine_suspended) {
            either = either2;
            payRequestViewModel = payRequestViewModel2;
            paymentRequestIdType2 = paymentRequestIdType;
            i = 0;
            java.lang.String str142 = (java.lang.String) userEmail;
            com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils userPaymentUtils3 = com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils.INSTANCE;
            com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink22 = paymentRequest.getPaymentLink();
            java.lang.String formatExpiryDate2 = userPaymentUtils3.formatExpiryDate(paymentLink22 == null ? paymentLink22.getExpirationTime() : null);
            userStore2 = payRequestViewModel.getInputFormats;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentRequestIdType2);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getHighSpeedVideoSizesFor = function1;
            this.getInputFormats = paymentRequest;
            this.getInputSizeshNQ4ISI = str142;
            this.getOutputFormats = formatExpiryDate2;
            this.getHighSpeedVideoSizes = i3;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getOutputMinFrameDuration = 3;
            awaitUser = com.paypal.oslo.core.userstore.UserStoreExtensionsKt.awaitUser(userStore2, this);
            if (awaitUser != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel$loadPayRequestData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel$loadPayRequestData$1(this.getOutputSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PayRequestViewModel$loadPayRequestData$1(com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel payRequestViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel$loadPayRequestData$1> continuation) {
        super(2, continuation);
        this.getOutputSizes = payRequestViewModel;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
