package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0086B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetAllCardsUseCase;", "getAllCardsUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardArtUseCase;", "payPalGetCardArtUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardInfoUseCase;", "payPalGetCardInfoUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupsUseCase;", "payPalGetCardIdGroupsUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetAllCardsUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardArtUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardInfoUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupsUseCase;)V", "", "getCardArt", "waitForRefresh", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalGetAllCardsError;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "invoke", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetAllCardsUseCase;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardArtUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardInfoUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupsUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalGetAllCardsUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PayPalGetAllCardsUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase payPalGetCardArtUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase payPalGetCardIdGroupsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAllCardsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardArtUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardInfoUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardIdGroupsUseCase, "");
        this.Camera2StreamConfigurationMap = getAllCardsUseCase;
        this.getHighSpeedVideoFpsRanges = payPalGetCardArtUseCase;
        this.getHighSpeedVideoFpsRangesFor = payPalGetCardInfoUseCase;
        this.getHighSpeedVideoSizes = payPalGetCardIdGroupsUseCase;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase, boolean z, boolean z2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return payPalGetAllCardsUseCase.invoke(z, z2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0125 A[Catch: all -> 0x00b9, RaiseCancellationException -> 0x00bd, TRY_ENTER, TryCatch #4 {RaiseCancellationException -> 0x00bd, all -> 0x00b9, blocks: (B:29:0x00a3, B:31:0x011f, B:34:0x0125, B:36:0x0131, B:37:0x0162, B:40:0x014a, B:41:0x014f, B:44:0x0154, B:45:0x01d3, B:46:0x01d8), top: B:28:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v8, types: [arrow.core.raise.DefaultRaise] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(boolean z, boolean z2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetAllCardsError, ? extends java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard>>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase$invoke$1 payPalGetAllCardsUseCase$invoke$1;
        java.lang.Object coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        int i2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        int i3;
        int i4;
        java.lang.Object obj;
        arrow.core.raise.DefaultRaise defaultRaise4;
        int i5;
        arrow.core.raise.Raise raise;
        boolean z3;
        arrow.core.Either either;
        arrow.core.Either right;
        java.lang.Object invoke;
        boolean z4;
        arrow.core.raise.DefaultRaise defaultRaise5;
        boolean z5;
        int i6;
        int i7;
        java.util.List list;
        boolean z6 = z;
        ?? r2 = z2;
        try {
            try {
                if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase$invoke$1) {
                    payPalGetAllCardsUseCase$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase$invoke$1) continuation;
                    if ((payPalGetAllCardsUseCase$invoke$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                        payPalGetAllCardsUseCase$invoke$1.getOutputStallDurationlomOqCM -= 2147483648;
                        java.lang.Object obj2 = payPalGetAllCardsUseCase$invoke$1.getOutputStallDuration;
                        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = payPalGetAllCardsUseCase$invoke$1.getOutputStallDurationlomOqCM;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            i2 = 0;
                            arrow.core.raise.DefaultRaise defaultRaise6 = new arrow.core.raise.DefaultRaise(false);
                            defaultRaise3 = defaultRaise6;
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Invoking PayPalGetAllCardsUseCase", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("get_card_art", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z)), kotlin.TuplesKt.to("wait_for_refresh", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2))), null, 4, null);
                            ?? r6 = this.Camera2StreamConfigurationMap;
                            payPalGetAllCardsUseCase$invoke$1.Camera2StreamConfigurationMap = defaultRaise6;
                            payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                            payPalGetAllCardsUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise3;
                            payPalGetAllCardsUseCase$invoke$1.getOutputFormats = z6;
                            payPalGetAllCardsUseCase$invoke$1.getInputFormats = r2;
                            payPalGetAllCardsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                            payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                            payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                            payPalGetAllCardsUseCase$invoke$1.getOutputStallDurationlomOqCM = 1;
                            java.lang.Object invoke2 = r6.invoke(z6, r2, payPalGetAllCardsUseCase$invoke$1);
                            if (invoke2 != coroutine_suspended) {
                                i3 = 0;
                                i4 = 0;
                                obj = invoke2;
                                defaultRaise4 = defaultRaise6;
                                i5 = 0;
                                raise = defaultRaise3;
                                z3 = r2;
                            }
                            return coroutine_suspended;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i8 = payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                int i9 = payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizes;
                                int i10 = payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                int i11 = payPalGetAllCardsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                boolean z7 = payPalGetAllCardsUseCase$invoke$1.getInputFormats;
                                boolean z8 = payPalGetAllCardsUseCase$invoke$1.getOutputFormats;
                                arrow.core.raise.DefaultRaise defaultRaise7 = (arrow.core.raise.DefaultRaise) payPalGetAllCardsUseCase$invoke$1.Camera2StreamConfigurationMap;
                                kotlin.ResultKt.throwOnFailure(obj2);
                                r2 = defaultRaise7;
                                r2.complete();
                                return new arrow.core.Either.Right((java.util.List) obj2);
                            }
                            i6 = payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                            int i12 = payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizes;
                            int i13 = payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                            i7 = payPalGetAllCardsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                            z4 = payPalGetAllCardsUseCase$invoke$1.getInputFormats;
                            boolean z9 = payPalGetAllCardsUseCase$invoke$1.getOutputFormats;
                            list = (java.util.List) payPalGetAllCardsUseCase$invoke$1.getInputSizeshNQ4ISI;
                            defaultRaise3 = (arrow.core.raise.Raise) payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizesFor;
                            arrow.core.raise.DefaultRaise defaultRaise8 = (arrow.core.raise.DefaultRaise) payPalGetAllCardsUseCase$invoke$1.Camera2StreamConfigurationMap;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            z5 = z9;
                            i3 = i13;
                            i5 = i12;
                            defaultRaise5 = defaultRaise8;
                            java.util.List list2 = (java.util.List) obj2;
                            com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase payPalGetCardArtUseCase = this.getHighSpeedVideoFpsRanges;
                            com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase = this.getHighSpeedVideoFpsRangesFor;
                            payPalGetAllCardsUseCase$invoke$1.Camera2StreamConfigurationMap = defaultRaise5;
                            payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                            payPalGetAllCardsUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                            payPalGetAllCardsUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                            payPalGetAllCardsUseCase$invoke$1.getOutputFormats = z5;
                            payPalGetAllCardsUseCase$invoke$1.getInputFormats = z4;
                            payPalGetAllCardsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i7;
                            payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i3;
                            payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizes = i5;
                            payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges = i6;
                            payPalGetAllCardsUseCase$invoke$1.getOutputStallDurationlomOqCM = 3;
                            obj2 = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardExtensionsKt.toPayPalDigitizedCards(list, list2, payPalGetCardArtUseCase, payPalGetCardInfoUseCase, payPalGetAllCardsUseCase$invoke$1);
                            r2 = defaultRaise5;
                            if (obj2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r2.complete();
                            return new arrow.core.Either.Right((java.util.List) obj2);
                        }
                        int i14 = payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        int i15 = payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizes;
                        int i16 = payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        int i17 = payPalGetAllCardsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        boolean z10 = payPalGetAllCardsUseCase$invoke$1.getInputFormats;
                        boolean z11 = payPalGetAllCardsUseCase$invoke$1.getOutputFormats;
                        arrow.core.raise.Raise raise2 = (arrow.core.raise.Raise) payPalGetAllCardsUseCase$invoke$1.getInputSizeshNQ4ISI;
                        arrow.core.raise.Raise raise3 = (arrow.core.raise.Raise) payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizesFor;
                        defaultRaise4 = (arrow.core.raise.DefaultRaise) payPalGetAllCardsUseCase$invoke$1.Camera2StreamConfigurationMap;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            i2 = i14;
                            z6 = z11;
                            i4 = i17;
                            obj = obj2;
                            i5 = i15;
                            z3 = z10;
                            i3 = i16;
                            raise = raise2;
                            defaultRaise3 = raise3;
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise2 = defaultRaise4;
                            defaultRaise2.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise = defaultRaise4;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                        either = (arrow.core.Either) obj;
                        if (!(either instanceof arrow.core.Either.Left)) {
                            com.paypal.oslo.feature.taptopay.domain.model.card.GetAllCardsError getAllCardsError = (com.paypal.oslo.feature.taptopay.domain.model.card.GetAllCardsError) ((arrow.core.Either.Left) either).getValue();
                            if (!(getAllCardsError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.GetAllCardsError.DefaultError)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.feature.taptopay.domain.model.card.GetAllCardsError.DefaultError defaultError = (com.paypal.oslo.feature.taptopay.domain.model.card.GetAllCardsError.DefaultError) getAllCardsError;
                            right = new arrow.core.Either.Left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetAllCardsError.DefaultError(defaultError.getDebugMessage(), defaultError.getThrowable()));
                        } else {
                            if (!(either instanceof arrow.core.Either.Right)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                        }
                        java.util.List list3 = (java.util.List) raise.bind(right);
                        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase payPalGetCardIdGroupsUseCase = this.getHighSpeedVideoSizes;
                        payPalGetAllCardsUseCase$invoke$1.Camera2StreamConfigurationMap = defaultRaise4;
                        payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        payPalGetAllCardsUseCase$invoke$1.getInputSizeshNQ4ISI = list3;
                        payPalGetAllCardsUseCase$invoke$1.getOutputFormats = z6;
                        payPalGetAllCardsUseCase$invoke$1.getInputFormats = z3;
                        payPalGetAllCardsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i4;
                        payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i3;
                        payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizes = i5;
                        payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges = i2;
                        payPalGetAllCardsUseCase$invoke$1.getOutputStallDurationlomOqCM = 2;
                        invoke = payPalGetCardIdGroupsUseCase.invoke(payPalGetAllCardsUseCase$invoke$1);
                        if (invoke != coroutine_suspended) {
                            z4 = z3;
                            defaultRaise5 = defaultRaise4;
                            z5 = z6;
                            i6 = i2;
                            obj2 = invoke;
                            i7 = i4;
                            list = list3;
                            java.util.List list22 = (java.util.List) obj2;
                            com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase payPalGetCardArtUseCase2 = this.getHighSpeedVideoFpsRanges;
                            com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase2 = this.getHighSpeedVideoFpsRangesFor;
                            payPalGetAllCardsUseCase$invoke$1.Camera2StreamConfigurationMap = defaultRaise5;
                            payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                            payPalGetAllCardsUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                            payPalGetAllCardsUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list22);
                            payPalGetAllCardsUseCase$invoke$1.getOutputFormats = z5;
                            payPalGetAllCardsUseCase$invoke$1.getInputFormats = z4;
                            payPalGetAllCardsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i7;
                            payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i3;
                            payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizes = i5;
                            payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges = i6;
                            payPalGetAllCardsUseCase$invoke$1.getOutputStallDurationlomOqCM = 3;
                            obj2 = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardExtensionsKt.toPayPalDigitizedCards(list, list22, payPalGetCardArtUseCase2, payPalGetCardInfoUseCase2, payPalGetAllCardsUseCase$invoke$1);
                            r2 = defaultRaise5;
                            if (obj2 == coroutine_suspended) {
                            }
                            r2.complete();
                            return new arrow.core.Either.Right((java.util.List) obj2);
                        }
                        return coroutine_suspended;
                    }
                }
                if (i != 0) {
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                }
                java.util.List list32 = (java.util.List) raise.bind(right);
                com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase payPalGetCardIdGroupsUseCase2 = this.getHighSpeedVideoSizes;
                payPalGetAllCardsUseCase$invoke$1.Camera2StreamConfigurationMap = defaultRaise4;
                payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                payPalGetAllCardsUseCase$invoke$1.getInputSizeshNQ4ISI = list32;
                payPalGetAllCardsUseCase$invoke$1.getOutputFormats = z6;
                payPalGetAllCardsUseCase$invoke$1.getInputFormats = z3;
                payPalGetAllCardsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i4;
                payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i3;
                payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizes = i5;
                payPalGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges = i2;
                payPalGetAllCardsUseCase$invoke$1.getOutputStallDurationlomOqCM = 2;
                invoke = payPalGetCardIdGroupsUseCase2.invoke(payPalGetAllCardsUseCase$invoke$1);
                if (invoke != coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (arrow.core.raise.RaiseCancellationException e2) {
                e = e2;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            e = e3;
            defaultRaise2 = r2;
        } catch (java.lang.Throwable th3) {
            th = th3;
            defaultRaise = r2;
        }
        payPalGetAllCardsUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase$invoke$1(this, continuation);
        java.lang.Object obj22 = payPalGetAllCardsUseCase$invoke$1.getOutputStallDuration;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payPalGetAllCardsUseCase$invoke$1.getOutputStallDurationlomOqCM;
    }
}
