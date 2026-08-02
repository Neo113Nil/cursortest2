package com.paypal.android.taptopay.data.thales.payment;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0016H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/payment/ThalesTransactionRepository;", "Lcom/paypal/android/taptopay/domain/repository/payment/TransactionRepository;", "Lcom/paypal/android/taptopay/data/thales/payment/TransactionDataSource;", "transactionDataSource", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/android/taptopay/data/thales/payment/TransactionDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "digitalizedCardId", "Ljava/util/Date;", "from", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/domain/model/payment/Transaction;", "Lcom/paypal/android/taptopay/domain/model/payment/GetTransactionHistoryError;", "getTransactionHistory", "(Ljava/lang/String;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "refreshAccessToken", "getTransactionHistory$tap_to_pay_data_thales_release", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "observeTransactions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/android/taptopay/data/thales/payment/TransactionDataSource;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThalesTransactionRepository implements com.paypal.android.taptopay.domain.repository.payment.TransactionRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.payment.TransactionDataSource getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRanges;

    public ThalesTransactionRepository(com.paypal.android.taptopay.data.thales.payment.TransactionDataSource transactionDataSource, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRangesFor = transactionDataSource;
        this.getHighSpeedVideoFpsRanges = coroutineDispatcher;
    }

    public /* synthetic */ ThalesTransactionRepository(com.paypal.android.taptopay.data.thales.payment.TransactionDataSource transactionDataSource, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(transactionDataSource, (i & 2) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.TransactionRepository
    public final java.lang.Object getTransactionHistory(java.lang.String str, java.util.Date date, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends java.util.List<com.paypal.android.taptopay.domain.model.payment.Transaction>, com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError>> continuation) {
        return getTransactionHistory$tap_to_pay_data_thales_release$default(this, str, date != null ? new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", java.util.Locale.getDefault()).format(date) : null, false, continuation, 4, null);
    }

    public static /* synthetic */ java.lang.Object getTransactionHistory$tap_to_pay_data_thales_release$default(com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository thalesTransactionRepository, java.lang.String str, java.lang.String str2, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return thalesTransactionRepository.getTransactionHistory$tap_to_pay_data_thales_release(str, str2, z, continuation);
    }

    public final java.lang.Object getTransactionHistory$tap_to_pay_data_thales_release(java.lang.String str, java.lang.String str2, boolean z, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends java.util.List<com.paypal.android.taptopay.domain.model.payment.Transaction>, com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRanges, new com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository$getTransactionHistory$4(str, str2, z, this, null), continuation);
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.TransactionRepository
    public final java.lang.Object observeTransactions(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.paypal.android.taptopay.domain.model.payment.Transaction>>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.getTransactions();
    }

    public static final /* synthetic */ java.lang.Object access$getAccessToken(com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository thalesTransactionRepository, java.lang.String str, boolean z, kotlin.coroutines.Continuation continuation) {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getProvisioningBusinessService().getAccessToken(str, z ? com.gemalto.mfs.mwsdk.provisioning.model.GetAccessTokenMode.REFRESH : com.gemalto.mfs.mwsdk.provisioning.model.GetAccessTokenMode.NO_REFRESH, new com.gemalto.mfs.mwsdk.provisioning.listener.AccessTokenListener() { // from class: com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository$getAccessToken$2$1
            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.AccessTokenListener
            public final void onSuccess(java.lang.String digitalCardId, java.lang.String accessToken) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitalCardId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "");
                if (kotlin.jvm.internal.Ref.BooleanRef.this.element) {
                    return;
                }
                kotlin.jvm.internal.Ref.BooleanRef.this.element = true;
                kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<java.lang.String, com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError>> continuation2 = safeContinuation2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Success(accessToken)));
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.AccessTokenListener
            public final void onError(java.lang.String digitalCardId, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitalCardId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Access token Error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitalCardId", digitalCardId), kotlin.TuplesKt.to("error", error.getErrorMessage()), kotlin.TuplesKt.to("sdkErrorCode", error.getSdkErrorCode())), null, null, 12, null);
                if (kotlin.jvm.internal.Ref.BooleanRef.this.element) {
                    return;
                }
                kotlin.jvm.internal.Ref.BooleanRef.this.element = true;
                kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<java.lang.String, com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError>> continuation2 = safeContinuation2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.lang.String errorMessage = error.getErrorMessage();
                continuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError.DefaultError(errorMessage != null ? errorMessage : "", error.getCausingException()))));
            }
        });
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static final /* synthetic */ java.lang.Object access$getTransactionHistory(final com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository thalesTransactionRepository, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getTransactionHistoryService().refreshHistory(str, str2, str3, new com.gemalto.mfs.mwsdk.mobilegateway.listener.TransactionHistoryListener() { // from class: com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository$getTransactionHistory$6$1
            @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.TransactionHistoryListener
            public final void onSuccess(java.util.List<? extends com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord> records, java.lang.String digitalCardId, java.lang.String timeStamp) {
                java.util.Date date;
                java.lang.String str4 = "";
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(records, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitalCardId, "");
                com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                pairArr[0] = kotlin.TuplesKt.to("digitalCardId", digitalCardId);
                java.util.List<? extends com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord> list = records;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord mGTransactionRecord : list) {
                    arrayList.add(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("transactionId", mGTransactionRecord.getTransactionId()), kotlin.TuplesKt.to("transactionDate", mGTransactionRecord.getTransactionDate())));
                }
                pairArr[1] = kotlin.TuplesKt.to("transactions", arrayList);
                pairArr[2] = kotlin.TuplesKt.to("isHandled", java.lang.Boolean.valueOf(kotlin.jvm.internal.Ref.BooleanRef.this.element));
                com.paypal.android.logger.Logger.i$default(log, "Got Thales transactions.", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                if (kotlin.jvm.internal.Ref.BooleanRef.this.element) {
                    return;
                }
                kotlin.jvm.internal.Ref.BooleanRef.this.element = true;
                kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<? extends java.util.List<com.paypal.android.taptopay.domain.model.payment.Transaction>, com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError>> continuation2 = safeContinuation2;
                com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository thalesTransactionRepository2 = thalesTransactionRepository;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord mGTransactionRecord2 : list) {
                    java.lang.String transactionId = mGTransactionRecord2.getTransactionId();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transactionId, str4);
                    com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus transactionStatus = mGTransactionRecord2.getTransactionStatus();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transactionStatus, str4);
                    com.paypal.android.taptopay.domain.model.payment.TransactionStatus access$toStatus = com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository.access$toStatus(thalesTransactionRepository2, transactionStatus);
                    com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType transactionType = mGTransactionRecord2.getTransactionType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transactionType, str4);
                    com.paypal.android.taptopay.domain.model.payment.TransactionType access$toType = com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository.access$toType(thalesTransactionRepository2, transactionType);
                    double amount = mGTransactionRecord2.getAmount();
                    java.lang.String currencyCode = mGTransactionRecord2.getCurrencyCode();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currencyCode, str4);
                    java.lang.String displayAmount = mGTransactionRecord2.getDisplayAmount();
                    java.lang.String transactionDate = mGTransactionRecord2.getTransactionDate();
                    if (transactionDate != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(transactionDate);
                        date = com.paypal.android.taptopay.data.thales.payment.ExtensionsKt.parseTransactionDate(transactionDate);
                    } else {
                        date = null;
                    }
                    java.util.ArrayList arrayList3 = arrayList2;
                    arrayList3.add(new com.paypal.android.taptopay.domain.model.payment.Transaction(transactionId, digitalCardId, access$toStatus, access$toType, amount, currencyCode, displayAmount, date, mGTransactionRecord2.getMerchantName(), mGTransactionRecord2.getMerchantPostalCode(), mGTransactionRecord2.getMerchantType()));
                    arrayList2 = arrayList3;
                    continuation2 = continuation2;
                    thalesTransactionRepository2 = thalesTransactionRepository2;
                    str4 = str4;
                }
                com.paypal.android.taptopay.domain.Result.Success success = new com.paypal.android.taptopay.domain.Result.Success(arrayList2);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation2.resumeWith(kotlin.Result.m23436constructorimpl(success));
            }

            @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.TransactionHistoryListener
            public final void onError(java.lang.String digitalCardId, com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitalCardId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Transaction history Error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitalCardId", digitalCardId), kotlin.TuplesKt.to("isHandled", java.lang.Boolean.valueOf(kotlin.jvm.internal.Ref.BooleanRef.this.element)), kotlin.TuplesKt.to("error", error.getMessage()), kotlin.TuplesKt.to("sdkErrorCode", error.getSDKErrorCode()), kotlin.TuplesKt.to("message", error.getMessage()), kotlin.TuplesKt.to("serverErrorCode", java.lang.Integer.valueOf(error.getServerErrorCode())), kotlin.TuplesKt.to("causingException", error.getCausingException()), kotlin.TuplesKt.to("httpStatusCode", java.lang.Integer.valueOf(error.getHTTPStatusCode()))), null, 4, null);
                if (kotlin.jvm.internal.Ref.BooleanRef.this.element) {
                    return;
                }
                kotlin.jvm.internal.Ref.BooleanRef.this.element = true;
                kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<? extends java.util.List<com.paypal.android.taptopay.domain.model.payment.Transaction>, com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError>> continuation2 = safeContinuation2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Failure(error)));
            }
        });
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static final /* synthetic */ com.paypal.android.taptopay.domain.model.payment.TransactionStatus access$toStatus(com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository thalesTransactionRepository, com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus transactionStatus) {
        int i = com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository.WhenMappings.$EnumSwitchMapping$1[transactionStatus.ordinal()];
        if (i == 1) {
            return com.paypal.android.taptopay.domain.model.payment.TransactionStatus.APPROVED;
        }
        if (i == 2) {
            return com.paypal.android.taptopay.domain.model.payment.TransactionStatus.DECLINED;
        }
        if (i == 3) {
            return com.paypal.android.taptopay.domain.model.payment.TransactionStatus.CLEARED;
        }
        if (i == 4) {
            return com.paypal.android.taptopay.domain.model.payment.TransactionStatus.REFUNDED;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ com.paypal.android.taptopay.domain.model.payment.TransactionType access$toType(com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository thalesTransactionRepository, com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType transactionType) {
        int i = com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository.WhenMappings.$EnumSwitchMapping$0[transactionType.ordinal()];
        if (i == 1) {
            return com.paypal.android.taptopay.domain.model.payment.TransactionType.PURCHASE;
        }
        if (i == 2) {
            return com.paypal.android.taptopay.domain.model.payment.TransactionType.REFUND;
        }
        if (i == 3 || i == 4 || i == 5) {
            return com.paypal.android.taptopay.domain.model.payment.TransactionType.UNKNOWN;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.values().length];
            try {
                iArr[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.PURCHASE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.REFUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.ATM_WITHDRAWAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.ATM_OTHER_SERVICE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.OTHER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus.values().length];
            try {
                iArr2[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus.APPROVED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus.DECLINED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus.CLEARED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus.REFUNDED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
