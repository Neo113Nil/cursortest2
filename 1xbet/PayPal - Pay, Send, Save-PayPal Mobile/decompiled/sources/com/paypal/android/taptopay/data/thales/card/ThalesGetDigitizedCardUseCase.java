package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0086B¢\u0006\u0004\b\r\u0010\b"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/card/ThalesGetDigitizedCardUseCase;", "", "<init>", "()V", "", "p0", "Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gemalto/mfs/mwsdk/mobilegateway/enrollment/PendingCardActivation;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Lcom/gemalto/mfs/mwsdk/mobilegateway/enrollment/PendingCardActivation;", "tokenizedCardId", "invoke"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThalesGetDigitizedCardUseCase {
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.model.card.DigitizedCard> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase$invoke$2(str, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a6, code lost:
    
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00fd A[Catch: all -> 0x01e3, TRY_LEAVE, TryCatch #0 {all -> 0x01e3, blocks: (B:13:0x0044, B:14:0x00f7, B:16:0x00fd, B:17:0x010b, B:20:0x0126, B:22:0x0146, B:24:0x015e, B:29:0x016f, B:33:0x017e, B:37:0x018d, B:39:0x0191, B:41:0x0197, B:46:0x01b3, B:50:0x01a8, B:57:0x01bf, B:63:0x01cf, B:64:0x01d4, B:68:0x0061, B:70:0x00c7, B:72:0x00cd, B:73:0x00df, B:81:0x01d5, B:82:0x01da, B:84:0x0076, B:86:0x0099, B:88:0x009f, B:89:0x00ad, B:95:0x01db, B:96:0x01e0, B:98:0x0082, B:100:0x0088), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0146 A[Catch: all -> 0x01e3, TryCatch #0 {all -> 0x01e3, blocks: (B:13:0x0044, B:14:0x00f7, B:16:0x00fd, B:17:0x010b, B:20:0x0126, B:22:0x0146, B:24:0x015e, B:29:0x016f, B:33:0x017e, B:37:0x018d, B:39:0x0191, B:41:0x0197, B:46:0x01b3, B:50:0x01a8, B:57:0x01bf, B:63:0x01cf, B:64:0x01d4, B:68:0x0061, B:70:0x00c7, B:72:0x00cd, B:73:0x00df, B:81:0x01d5, B:82:0x01da, B:84:0x0076, B:86:0x0099, B:88:0x009f, B:89:0x00ad, B:95:0x01db, B:96:0x01e0, B:98:0x0082, B:100:0x0088), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bf A[Catch: all -> 0x01e3, TryCatch #0 {all -> 0x01e3, blocks: (B:13:0x0044, B:14:0x00f7, B:16:0x00fd, B:17:0x010b, B:20:0x0126, B:22:0x0146, B:24:0x015e, B:29:0x016f, B:33:0x017e, B:37:0x018d, B:39:0x0191, B:41:0x0197, B:46:0x01b3, B:50:0x01a8, B:57:0x01bf, B:63:0x01cf, B:64:0x01d4, B:68:0x0061, B:70:0x00c7, B:72:0x00cd, B:73:0x00df, B:81:0x01d5, B:82:0x01da, B:84:0x0076, B:86:0x0099, B:88:0x009f, B:89:0x00ad, B:95:0x01db, B:96:0x01e0, B:98:0x0082, B:100:0x0088), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd A[Catch: all -> 0x01e3, TRY_LEAVE, TryCatch #0 {all -> 0x01e3, blocks: (B:13:0x0044, B:14:0x00f7, B:16:0x00fd, B:17:0x010b, B:20:0x0126, B:22:0x0146, B:24:0x015e, B:29:0x016f, B:33:0x017e, B:37:0x018d, B:39:0x0191, B:41:0x0197, B:46:0x01b3, B:50:0x01a8, B:57:0x01bf, B:63:0x01cf, B:64:0x01d4, B:68:0x0061, B:70:0x00c7, B:72:0x00cd, B:73:0x00df, B:81:0x01d5, B:82:0x01da, B:84:0x0076, B:86:0x0099, B:88:0x009f, B:89:0x00ad, B:95:0x01db, B:96:0x01e0, B:98:0x0082, B:100:0x0088), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009f A[Catch: all -> 0x01e3, TRY_LEAVE, TryCatch #0 {all -> 0x01e3, blocks: (B:13:0x0044, B:14:0x00f7, B:16:0x00fd, B:17:0x010b, B:20:0x0126, B:22:0x0146, B:24:0x015e, B:29:0x016f, B:33:0x017e, B:37:0x018d, B:39:0x0191, B:41:0x0197, B:46:0x01b3, B:50:0x01a8, B:57:0x01bf, B:63:0x01cf, B:64:0x01d4, B:68:0x0061, B:70:0x00c7, B:72:0x00cd, B:73:0x00df, B:81:0x01d5, B:82:0x01da, B:84:0x0076, B:86:0x0099, B:88:0x009f, B:89:0x00ad, B:95:0x01db, B:96:0x01e0, B:98:0x0082, B:100:0x0088), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.model.card.DigitizedCard> continuation) {
        com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase$getDigitalizedCard$1 thalesGetDigitizedCardUseCase$getDigitalizedCard$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard;
        java.lang.String str2;
        java.lang.Object cardDetails;
        com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase thalesGetDigitizedCardUseCase;
        com.paypal.android.taptopay.domain.Result result;
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails digitalizedCardDetails;
        java.lang.Object isDefault;
        java.lang.String str3;
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard2;
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails digitalizedCardDetails2;
        com.paypal.android.taptopay.domain.Result result2;
        int i2;
        java.lang.Object cardStatus$default;
        int i3;
        com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase thalesGetDigitizedCardUseCase2;
        java.lang.String str4;
        com.paypal.android.taptopay.domain.Result result3;
        com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status status;
        java.lang.String digitalCardId;
        try {
            if (continuation instanceof com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase$getDigitalizedCard$1) {
                thalesGetDigitizedCardUseCase$getDigitalizedCard$1 = (com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase$getDigitalizedCard$1) continuation;
                if ((thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                    thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getOutputFormats -= 2147483648;
                    java.lang.Object obj = thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getInputSizeshNQ4ISI;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getOutputFormats;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        digitalizedCard = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getDigitalizedCard(str);
                        if (digitalizedCard == null) {
                            return null;
                        }
                        thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighResolutionOutputSizeshNQ4ISI = this;
                        str2 = str;
                        thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoSizes = str2;
                        thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoFpsRangesFor = digitalizedCard;
                        thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getOutputFormats = 1;
                        cardDetails = com.paypal.android.taptopay.data.thales.card.ExtensionsKt.getCardDetails(digitalizedCard, thalesGetDigitizedCardUseCase$getDigitalizedCard$1);
                        if (cardDetails != coroutine_suspended) {
                            thalesGetDigitizedCardUseCase = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i == 1) {
                        digitalizedCard = (com.gemalto.mfs.mwsdk.dcm.DigitalizedCard) thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoFpsRangesFor;
                        java.lang.String str5 = (java.lang.String) thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoSizes;
                        thalesGetDigitizedCardUseCase = (com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase) thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        cardDetails = obj;
                        str2 = str5;
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i3 = thalesGetDigitizedCardUseCase$getDigitalizedCard$1.Camera2StreamConfigurationMap;
                            digitalizedCardDetails2 = (com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails) thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoFpsRanges;
                            digitalizedCard2 = (com.gemalto.mfs.mwsdk.dcm.DigitalizedCard) thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoFpsRangesFor;
                            str4 = (java.lang.String) thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoSizes;
                            thalesGetDigitizedCardUseCase2 = (com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase) thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj);
                            result3 = (com.paypal.android.taptopay.domain.Result) obj;
                            if (!(result3 instanceof com.paypal.android.taptopay.domain.Result.Success)) {
                                status = (com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status) ((com.paypal.android.taptopay.domain.Result.Success) result3).getResult();
                            } else {
                                if (!(result3 instanceof com.paypal.android.taptopay.domain.Result.Failure)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                status = null;
                            }
                            com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
                            kotlin.Pair[] pairArr = new kotlin.Pair[3];
                            pairArr[0] = kotlin.TuplesKt.to("digitalizedCard", digitalizedCard2);
                            pairArr[1] = kotlin.TuplesKt.to("status", status);
                            pairArr[2] = kotlin.TuplesKt.to("isDefault", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(i3 == 0));
                            com.paypal.android.logger.Logger.d$default(log, "Fetched digitalized card", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                            digitalCardId = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getDigitalCardId(str4);
                            if (digitalCardId != null) {
                                com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase thalesGetDigitizedCardUseCase3 = thalesGetDigitizedCardUseCase2;
                                com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Received null digitalCardId", null, null, 6, null);
                                return null;
                            }
                            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Fetched digitalCardId, generating a digitizedCard", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitalCardId", digitalCardId)), null, 4, null);
                            java.lang.String lastFourDigits = digitalizedCardDetails2 != null ? digitalizedCardDetails2.getLastFourDigits() : null;
                            java.lang.String str6 = lastFourDigits == null ? "" : lastFourDigits;
                            java.lang.String lastFourDigitsOfDPAN = digitalizedCardDetails2 != null ? digitalizedCardDetails2.getLastFourDigitsOfDPAN() : null;
                            java.lang.String str7 = lastFourDigitsOfDPAN == null ? "" : lastFourDigitsOfDPAN;
                            java.lang.String panExpiry = digitalizedCardDetails2 != null ? digitalizedCardDetails2.getPanExpiry() : null;
                            java.lang.String str8 = panExpiry == null ? "" : panExpiry;
                            if (status != null) {
                                if (status == com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status.Suspended && getHighResolutionOutputSizeshNQ4ISI(digitalCardId) != null) {
                                    com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Setting status to PendingActivation", null, null, 6, null);
                                    status = com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status.PendingActivation;
                                }
                            }
                            status = com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status.Unknown;
                            return new com.paypal.android.taptopay.domain.model.card.DigitizedCard(digitalCardId, str6, str7, str8, i3 != 0, status, null);
                        }
                        digitalizedCardDetails2 = (com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails) thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoFpsRanges;
                        digitalizedCard2 = (com.gemalto.mfs.mwsdk.dcm.DigitalizedCard) thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoFpsRangesFor;
                        java.lang.String str9 = (java.lang.String) thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoSizes;
                        com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase thalesGetDigitizedCardUseCase4 = (com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase) thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str3 = str9;
                        thalesGetDigitizedCardUseCase = thalesGetDigitizedCardUseCase4;
                        result2 = (com.paypal.android.taptopay.domain.Result) obj;
                        if (!(result2 instanceof com.paypal.android.taptopay.domain.Result.Success)) {
                            i2 = ((java.lang.Boolean) ((com.paypal.android.taptopay.domain.Result.Success) result2).getResult()).booleanValue();
                        } else {
                            if (!(result2 instanceof com.paypal.android.taptopay.domain.Result.Failure)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            i2 = 0;
                        }
                        thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighResolutionOutputSizeshNQ4ISI = thalesGetDigitizedCardUseCase;
                        thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoSizes = str3;
                        thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoFpsRangesFor = digitalizedCard2;
                        thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoFpsRanges = digitalizedCardDetails2;
                        thalesGetDigitizedCardUseCase$getDigitalizedCard$1.Camera2StreamConfigurationMap = i2;
                        thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getOutputFormats = 3;
                        cardStatus$default = com.paypal.android.taptopay.data.thales.card.ExtensionsKt.getCardStatus$default(digitalizedCard2, null, thalesGetDigitizedCardUseCase$getDigitalizedCard$1, 1, null);
                        if (cardStatus$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i3 = i2;
                        obj = cardStatus$default;
                        thalesGetDigitizedCardUseCase2 = thalesGetDigitizedCardUseCase;
                        str4 = str3;
                        result3 = (com.paypal.android.taptopay.domain.Result) obj;
                        if (!(result3 instanceof com.paypal.android.taptopay.domain.Result.Success)) {
                        }
                        com.paypal.android.logger.Logger log2 = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
                        kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
                        pairArr2[0] = kotlin.TuplesKt.to("digitalizedCard", digitalizedCard2);
                        pairArr2[1] = kotlin.TuplesKt.to("status", status);
                        pairArr2[2] = kotlin.TuplesKt.to("isDefault", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(i3 == 0));
                        com.paypal.android.logger.Logger.d$default(log2, "Fetched digitalized card", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                        digitalCardId = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getDigitalCardId(str4);
                        if (digitalCardId != null) {
                        }
                    }
                    result = (com.paypal.android.taptopay.domain.Result) cardDetails;
                    if (!(result instanceof com.paypal.android.taptopay.domain.Result.Success)) {
                        digitalizedCardDetails = (com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails) ((com.paypal.android.taptopay.domain.Result.Success) result).getResult();
                    } else {
                        if (!(result instanceof com.paypal.android.taptopay.domain.Result.Failure)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        digitalizedCardDetails = null;
                    }
                    thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighResolutionOutputSizeshNQ4ISI = thalesGetDigitizedCardUseCase;
                    thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoSizes = str2;
                    thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoFpsRangesFor = digitalizedCard;
                    thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoFpsRanges = digitalizedCardDetails;
                    thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getOutputFormats = 2;
                    isDefault = com.paypal.android.taptopay.data.thales.card.ExtensionsKt.isDefault(digitalizedCard, thalesGetDigitizedCardUseCase$getDigitalizedCard$1);
                    if (isDefault != coroutine_suspended) {
                        str3 = str2;
                        obj = isDefault;
                        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails digitalizedCardDetails3 = digitalizedCardDetails;
                        digitalizedCard2 = digitalizedCard;
                        digitalizedCardDetails2 = digitalizedCardDetails3;
                        result2 = (com.paypal.android.taptopay.domain.Result) obj;
                        if (!(result2 instanceof com.paypal.android.taptopay.domain.Result.Success)) {
                        }
                        thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighResolutionOutputSizeshNQ4ISI = thalesGetDigitizedCardUseCase;
                        thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoSizes = str3;
                        thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoFpsRangesFor = digitalizedCard2;
                        thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoFpsRanges = digitalizedCardDetails2;
                        thalesGetDigitizedCardUseCase$getDigitalizedCard$1.Camera2StreamConfigurationMap = i2;
                        thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getOutputFormats = 3;
                        cardStatus$default = com.paypal.android.taptopay.data.thales.card.ExtensionsKt.getCardStatus$default(digitalizedCard2, null, thalesGetDigitizedCardUseCase$getDigitalizedCard$1, 1, null);
                        if (cardStatus$default != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            result = (com.paypal.android.taptopay.domain.Result) cardDetails;
            if (!(result instanceof com.paypal.android.taptopay.domain.Result.Success)) {
            }
            thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighResolutionOutputSizeshNQ4ISI = thalesGetDigitizedCardUseCase;
            thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoSizes = str2;
            thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoFpsRangesFor = digitalizedCard;
            thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getHighSpeedVideoFpsRanges = digitalizedCardDetails;
            thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getOutputFormats = 2;
            isDefault = com.paypal.android.taptopay.data.thales.card.ExtensionsKt.isDefault(digitalizedCard, thalesGetDigitizedCardUseCase$getDigitalizedCard$1);
            if (isDefault != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th) {
            com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Exception from DigitalizedCardManager.getDigitalizedCard()", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", th.getMessage())), null, 4, null);
            return null;
        }
        thalesGetDigitizedCardUseCase$getDigitalizedCard$1 = new com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase$getDigitalizedCard$1(this, continuation);
        java.lang.Object obj2 = thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getInputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = thalesGetDigitizedCardUseCase$getDigitalizedCard$1.getOutputFormats;
    }

    private static com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
        try {
            return com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getCardEnrollmentService().getPendingCardActivation(p0);
        } catch (java.lang.Throwable th) {
            com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog().e("Error from Thales MGCardEnrollmentService.getPendingCardActivation()", th);
            return null;
        }
    }
}
