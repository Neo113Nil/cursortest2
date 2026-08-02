package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/RemoveExistingPayLaterCardsUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/GetAllCardsApi;", "getAllCardsApi", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/DeleteCardApi;", "deleteCardApi", "<init>", "(Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/GetAllCardsApi;Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/DeleteCardApi;)V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/GetAllCardsApi;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/DeleteCardApi;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RemoveExistingPayLaterCardsUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetAllCardsApi Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.api.domain.usecase.card.DeleteCardApi getHighSpeedVideoSizes;

    @javax.inject.Inject
    public RemoveExistingPayLaterCardsUseCase(com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetAllCardsApi getAllCardsApi, com.paypal.oslo.feature.taptopay.api.domain.usecase.card.DeleteCardApi deleteCardApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAllCardsApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteCardApi, "");
        this.Camera2StreamConfigurationMap = getAllCardsApi;
        this.getHighSpeedVideoSizes = deleteCardApi;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|(2:3|(18:5|6|7|(1:(1:(10:11|12|13|14|15|(1:17)(2:57|(1:59)(2:60|61))|18|19|20|(6:22|23|24|25|(8:27|14|15|(0)(0)|18|19|20|(4:48|49|34|(2:36|37)(2:38|(2:40|41)(2:42|43)))(0))|28)(0))(2:62|63))(4:64|65|66|67))(5:108|109|110|(1:112)|28)|68|69|(1:71)(2:99|(1:101)(2:102|103))|72|(4:75|(3:77|78|79)(1:81)|80|73)|82|83|(6:86|(1:88)(1:95)|89|(2:91|92)(1:94)|93|84)|96|97|98|19|20|(0)(0)))|118|6|7|(0)(0)|68|69|(0)(0)|72|(1:73)|82|83|(1:84)|96|97|98|19|20|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0071, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x006e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0287, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0288, code lost:
    
        r12 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0281, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0282, code lost:
    
        r12 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0296, code lost:
    
        r3 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01f7 A[Catch: all -> 0x006e, RaiseCancellationException -> 0x0071, TRY_ENTER, TRY_LEAVE, TryCatch #8 {RaiseCancellationException -> 0x0071, all -> 0x006e, blocks: (B:12:0x005f, B:14:0x01f1, B:17:0x01f7, B:18:0x0258, B:59:0x024b, B:60:0x0264, B:61:0x0269, B:68:0x00d3, B:71:0x00d9, B:72:0x0115, B:73:0x0122, B:75:0x0128, B:78:0x0134, B:83:0x0152, B:84:0x015d, B:86:0x0163, B:88:0x0170, B:89:0x017a, B:91:0x017e, B:97:0x0184, B:101:0x0108, B:102:0x028d, B:103:0x0292), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x019d A[Catch: all -> 0x0281, RaiseCancellationException -> 0x0287, TRY_LEAVE, TryCatch #9 {RaiseCancellationException -> 0x0287, all -> 0x0281, blocks: (B:20:0x0197, B:22:0x019d), top: B:19:0x0197 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d9 A[Catch: all -> 0x006e, RaiseCancellationException -> 0x0071, TRY_ENTER, TRY_LEAVE, TryCatch #8 {RaiseCancellationException -> 0x0071, all -> 0x006e, blocks: (B:12:0x005f, B:14:0x01f1, B:17:0x01f7, B:18:0x0258, B:59:0x024b, B:60:0x0264, B:61:0x0269, B:68:0x00d3, B:71:0x00d9, B:72:0x0115, B:73:0x0122, B:75:0x0128, B:78:0x0134, B:83:0x0152, B:84:0x015d, B:86:0x0163, B:88:0x0170, B:89:0x017a, B:91:0x017e, B:97:0x0184, B:101:0x0108, B:102:0x028d, B:103:0x0292), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0128 A[Catch: all -> 0x006e, RaiseCancellationException -> 0x0071, TryCatch #8 {RaiseCancellationException -> 0x0071, all -> 0x006e, blocks: (B:12:0x005f, B:14:0x01f1, B:17:0x01f7, B:18:0x0258, B:59:0x024b, B:60:0x0264, B:61:0x0269, B:68:0x00d3, B:71:0x00d9, B:72:0x0115, B:73:0x0122, B:75:0x0128, B:78:0x0134, B:83:0x0152, B:84:0x015d, B:86:0x0163, B:88:0x0170, B:89:0x017a, B:91:0x017e, B:97:0x0184, B:101:0x0108, B:102:0x028d, B:103:0x0292), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0163 A[Catch: all -> 0x006e, RaiseCancellationException -> 0x0071, TryCatch #8 {RaiseCancellationException -> 0x0071, all -> 0x006e, blocks: (B:12:0x005f, B:14:0x01f1, B:17:0x01f7, B:18:0x0258, B:59:0x024b, B:60:0x0264, B:61:0x0269, B:68:0x00d3, B:71:0x00d9, B:72:0x0115, B:73:0x0122, B:75:0x0128, B:78:0x0134, B:83:0x0152, B:84:0x015d, B:86:0x0163, B:88:0x0170, B:89:0x017a, B:91:0x017e, B:97:0x0184, B:101:0x0108, B:102:0x028d, B:103:0x0292), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [arrow.core.raise.DefaultRaise] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x01e8 -> B:14:0x01f1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase$invoke$1 removeExistingPayLaterCardsUseCase$invoke$1;
        ?? r3;
        arrow.core.Either.Right right;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        int i;
        int i2;
        int i3;
        arrow.core.Either either;
        arrow.core.Either right2;
        java.util.Iterator it;
        int i4;
        java.lang.Iterable iterable;
        java.util.List list;
        int i5;
        int i6;
        int i7;
        int i8;
        java.util.List list2;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType;
        arrow.core.raise.DefaultRaise defaultRaise3;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.PayPalDigitizedCard payPalDigitizedCard;
        java.lang.Object invoke;
        int i9;
        java.lang.String str;
        java.lang.String str2;
        arrow.core.Either right3;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase removeExistingPayLaterCardsUseCase = this;
        try {
            if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase$invoke$1) {
                removeExistingPayLaterCardsUseCase$invoke$1 = (com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase$invoke$1) continuation;
                if ((removeExistingPayLaterCardsUseCase$invoke$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                    removeExistingPayLaterCardsUseCase$invoke$1.getOutputStallDuration -= 2147483648;
                    java.lang.Object obj = removeExistingPayLaterCardsUseCase$invoke$1.unwrapAs;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r3 = removeExistingPayLaterCardsUseCase$invoke$1.getOutputStallDuration;
                    java.lang.String str3 = "cardId";
                    java.lang.String str4 = "error";
                    ?? r12 = 2;
                    if (r3 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        try {
                            arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise;
                            com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetAllCardsApi getAllCardsApi = removeExistingPayLaterCardsUseCase.Camera2StreamConfigurationMap;
                            removeExistingPayLaterCardsUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise;
                            removeExistingPayLaterCardsUseCase$invoke$1.getOutputFormats = defaultRaise4;
                            removeExistingPayLaterCardsUseCase$invoke$1.getInputFormats = defaultRaise4;
                            removeExistingPayLaterCardsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            removeExistingPayLaterCardsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                            removeExistingPayLaterCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                            removeExistingPayLaterCardsUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                            removeExistingPayLaterCardsUseCase$invoke$1.getOutputStallDuration = 1;
                            java.lang.Object invoke$default = com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetAllCardsApi.invoke$default(getAllCardsApi, false, false, removeExistingPayLaterCardsUseCase$invoke$1, 3, null);
                            if (invoke$default != coroutine_suspended) {
                                raise = defaultRaise4;
                                raise2 = raise;
                                obj = invoke$default;
                                defaultRaise2 = defaultRaise;
                                i = 0;
                                i2 = 0;
                                i3 = 0;
                                r12 = 0;
                            }
                            return coroutine_suspended;
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise.complete();
                            right = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                            if (right instanceof arrow.core.Either.Right) {
                            }
                        }
                    } else if (r3 != 1) {
                        if (r3 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i10 = removeExistingPayLaterCardsUseCase$invoke$1.getHighSpeedVideoSizesFor;
                        int i11 = removeExistingPayLaterCardsUseCase$invoke$1.getHighSpeedVideoSizes;
                        i8 = removeExistingPayLaterCardsUseCase$invoke$1.Camera2StreamConfigurationMap;
                        i7 = removeExistingPayLaterCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        i6 = removeExistingPayLaterCardsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        i4 = removeExistingPayLaterCardsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        raise2 = (arrow.core.raise.Raise) removeExistingPayLaterCardsUseCase$invoke$1.getOutputSizeshNQ4ISI;
                        list = (java.util.List) removeExistingPayLaterCardsUseCase$invoke$1.getOutputStallDurationlomOqCM;
                        com.paypal.oslo.feature.taptopay.api.domain.model.card.PayPalDigitizedCard payPalDigitizedCard2 = (com.paypal.oslo.feature.taptopay.api.domain.model.card.PayPalDigitizedCard) removeExistingPayLaterCardsUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
                        java.lang.Object obj2 = removeExistingPayLaterCardsUseCase$invoke$1.getOutputSizes;
                        it = (java.util.Iterator) removeExistingPayLaterCardsUseCase$invoke$1.getOutputMinFrameDuration;
                        iterable = (java.lang.Iterable) removeExistingPayLaterCardsUseCase$invoke$1.getInputFormats;
                        arrow.core.raise.Raise raise3 = (arrow.core.raise.Raise) removeExistingPayLaterCardsUseCase$invoke$1.getOutputFormats;
                        defaultRaise2 = (arrow.core.raise.DefaultRaise) removeExistingPayLaterCardsUseCase$invoke$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        int i12 = i11;
                        java.lang.String str5 = "error";
                        java.lang.String str6 = "cardId";
                        arrow.core.raise.Raise raise4 = raise3;
                        arrow.core.Either either2 = (arrow.core.Either) obj;
                        if (!(either2 instanceof arrow.core.Either.Left)) {
                            i9 = i12;
                            str2 = str6;
                            str = str5;
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "DeleteCardApi failed during PL2GO card removal", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(str2, payPalDigitizedCard2.getDeviceWalletServiceCardId().getId()), kotlin.TuplesKt.to(str, ((com.paypal.oslo.feature.taptopay.api.domain.model.card.DeleteCardError) ((arrow.core.Either.Left) either2).getValue()).toString())), null, 4, null);
                            right3 = new arrow.core.Either.Left(kotlin.Unit.INSTANCE);
                        } else {
                            i9 = i12;
                            str = str5;
                            str2 = str6;
                            if (!(either2 instanceof arrow.core.Either.Right)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            right3 = new arrow.core.Either.Right(((arrow.core.Either.Right) either2).getValue());
                        }
                        raise2.bind(right3);
                        removeExistingPayLaterCardsUseCase = this;
                        raise2 = raise4;
                        str3 = str2;
                        str4 = str;
                        i5 = i9;
                        if (!it.hasNext()) {
                            try {
                                java.lang.Object next = it.next();
                                str5 = str4;
                                payPalDigitizedCard = (com.paypal.oslo.feature.taptopay.api.domain.model.card.PayPalDigitizedCard) next;
                                str6 = str3;
                                com.paypal.oslo.feature.taptopay.api.domain.usecase.card.DeleteCardApi deleteCardApi = removeExistingPayLaterCardsUseCase.getHighSpeedVideoSizes;
                                com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId = payPalDigitizedCard.getDeviceWalletServiceCardId();
                                removeExistingPayLaterCardsUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise2;
                                removeExistingPayLaterCardsUseCase$invoke$1.getOutputFormats = raise2;
                                removeExistingPayLaterCardsUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                                removeExistingPayLaterCardsUseCase$invoke$1.getOutputMinFrameDuration = it;
                                removeExistingPayLaterCardsUseCase$invoke$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                                removeExistingPayLaterCardsUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = payPalDigitizedCard;
                                removeExistingPayLaterCardsUseCase$invoke$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                                removeExistingPayLaterCardsUseCase$invoke$1.getOutputSizeshNQ4ISI = raise2;
                                removeExistingPayLaterCardsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i4;
                                removeExistingPayLaterCardsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i6;
                                removeExistingPayLaterCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges = i7;
                                removeExistingPayLaterCardsUseCase$invoke$1.Camera2StreamConfigurationMap = i8;
                                removeExistingPayLaterCardsUseCase$invoke$1.getHighSpeedVideoSizes = i5;
                                removeExistingPayLaterCardsUseCase$invoke$1.getHighSpeedVideoSizesFor = 0;
                                removeExistingPayLaterCardsUseCase$invoke$1.getOutputStallDuration = 2;
                                invoke = deleteCardApi.invoke(deviceWalletServiceCardId, removeExistingPayLaterCardsUseCase$invoke$1);
                            } catch (arrow.core.raise.RaiseCancellationException e2) {
                                e = e2;
                                r3 = defaultRaise3;
                                defaultRaise = r3;
                                defaultRaise.complete();
                                right = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                                if (right instanceof arrow.core.Either.Right) {
                                }
                            } catch (java.lang.Throwable th) {
                                th = th;
                                r3 = defaultRaise3;
                                r3.complete();
                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                            }
                            defaultRaise3 = defaultRaise2;
                            if (invoke != coroutine_suspended) {
                                raise4 = raise2;
                                payPalDigitizedCard2 = payPalDigitizedCard;
                                defaultRaise2 = defaultRaise3;
                                i12 = i5;
                                obj = invoke;
                                arrow.core.Either either22 = (arrow.core.Either) obj;
                                if (!(either22 instanceof arrow.core.Either.Left)) {
                                }
                                raise2.bind(right3);
                                removeExistingPayLaterCardsUseCase = this;
                                raise2 = raise4;
                                str3 = str2;
                                str4 = str;
                                i5 = i9;
                                if (!it.hasNext()) {
                                    defaultRaise3 = defaultRaise2;
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    defaultRaise3.complete();
                                    right = new arrow.core.Either.Right(unit);
                                    if (right instanceof arrow.core.Either.Right) {
                                        return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success(null, kotlin.Unit.INSTANCE, 1, null);
                                    }
                                    if (right instanceof arrow.core.Either.Left) {
                                        return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.Generic(null, 1, null);
                                    }
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                            }
                            return coroutine_suspended;
                        }
                    } else {
                        int i13 = removeExistingPayLaterCardsUseCase$invoke$1.Camera2StreamConfigurationMap;
                        i = removeExistingPayLaterCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        i2 = removeExistingPayLaterCardsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        i3 = removeExistingPayLaterCardsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        raise = (arrow.core.raise.Raise) removeExistingPayLaterCardsUseCase$invoke$1.getInputFormats;
                        raise2 = (arrow.core.raise.Raise) removeExistingPayLaterCardsUseCase$invoke$1.getOutputFormats;
                        arrow.core.raise.DefaultRaise defaultRaise5 = (arrow.core.raise.DefaultRaise) removeExistingPayLaterCardsUseCase$invoke$1.getInputSizeshNQ4ISI;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            r12 = i13;
                            defaultRaise2 = defaultRaise5;
                        } catch (arrow.core.raise.RaiseCancellationException e3) {
                            e = e3;
                            r3 = defaultRaise5;
                            defaultRaise = r3;
                            defaultRaise.complete();
                            right = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                            if (right instanceof arrow.core.Either.Right) {
                            }
                        }
                    }
                    either = (arrow.core.Either) obj;
                    if (!(either instanceof arrow.core.Either.Left)) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "GetAllCardsApi failed during PL2GO card removal", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.taptopay.api.domain.model.card.GetAllCardsError) ((arrow.core.Either.Left) either).getValue()).toString())), null, 4, null);
                        right2 = new arrow.core.Either.Left(kotlin.Unit.INSTANCE);
                    } else {
                        if (!(either instanceof arrow.core.Either.Right)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        right2 = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                    }
                    java.util.List list3 = (java.util.List) raise.bind(right2);
                    java.util.List<com.paypal.oslo.feature.taptopay.api.domain.model.card.PayPalDigitizedCard> list4 = list3;
                    for (com.paypal.oslo.feature.taptopay.api.domain.model.card.PayPalDigitizedCard payPalDigitizedCard3 : list4) {
                        if (payPalDigitizedCard3.getCardInfo() == null) {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "PayPalDigitizedCard has null cardInfo, skipping during PL2GO filter", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", payPalDigitizedCard3.getDeviceWalletServiceCardId().getId())), null, 4, null);
                        }
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj3 : list4) {
                        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardInfo cardInfo = ((com.paypal.oslo.feature.taptopay.api.domain.model.card.PayPalDigitizedCard) obj3).getCardInfo();
                        if (cardInfo != null) {
                            cardType = cardInfo.getType();
                            list2 = list3;
                        } else {
                            list2 = list3;
                            cardType = null;
                        }
                        if (cardType == com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.PayLaterToGo) {
                            arrayList.add(obj3);
                        }
                        list3 = list2;
                    }
                    java.util.List list5 = list3;
                    java.util.ArrayList arrayList2 = arrayList;
                    it = arrayList2.iterator();
                    i4 = i3;
                    iterable = arrayList2;
                    list = list5;
                    i5 = 0;
                    i6 = i2;
                    i7 = i;
                    i8 = r12;
                    if (!it.hasNext()) {
                    }
                }
            }
            if (r3 != 0) {
            }
            either = (arrow.core.Either) obj;
            if (!(either instanceof arrow.core.Either.Left)) {
            }
            java.util.List list32 = (java.util.List) raise.bind(right2);
            java.util.List<com.paypal.oslo.feature.taptopay.api.domain.model.card.PayPalDigitizedCard> list42 = list32;
            while (r13.hasNext()) {
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            while (r7.hasNext()) {
            }
            java.util.List list52 = list32;
            java.util.ArrayList arrayList22 = arrayList3;
            it = arrayList22.iterator();
            i4 = i3;
            iterable = arrayList22;
            list = list52;
            i5 = 0;
            i6 = i2;
            i7 = i;
            i8 = r12;
            if (!it.hasNext()) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        removeExistingPayLaterCardsUseCase$invoke$1 = new com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase$invoke$1(removeExistingPayLaterCardsUseCase, continuation);
        java.lang.Object obj4 = removeExistingPayLaterCardsUseCase$invoke$1.unwrapAs;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r3 = removeExistingPayLaterCardsUseCase$invoke$1.getOutputStallDuration;
        java.lang.String str32 = "cardId";
        java.lang.String str42 = "error";
        ?? r122 = 2;
    }
}
