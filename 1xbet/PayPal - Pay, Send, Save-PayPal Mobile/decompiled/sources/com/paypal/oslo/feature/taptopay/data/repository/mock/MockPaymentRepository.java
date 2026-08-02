package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\t0\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u001d\u0010\u001a\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0011R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u000e\u001a\u0006*\u00020\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/mock/MockPaymentRepository;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/PaymentRepository;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/MockTransactionRepository;", "transactionRepository", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/feature/taptopay/data/repository/mock/MockTransactionRepository;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;", "observePayment", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/channels/ProducerScope;", "", "getHighSpeedVideoFpsRanges", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isListedAsPaymentApp", "()Z", "show", "", "showAsPaymentApp", "(Z)V", "isDefaultPaymentApp", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "activityResultLauncher", "setDefaultPaymentApp", "(Landroidx/activity/result/ActivityResultLauncher;)Z", "Landroid/app/Activity;", "activity", "setPreferredAppForOneTimeUse", "(Landroid/app/Activity;)Z", "unsetPreferredAppForOneTimeUse", "isForegroundSettingEnabled", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/MockTransactionRepository;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Landroid/content/Context;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MockPaymentRepository implements com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository {

    @java.lang.Deprecated
    public static final long AUTHENTICATION_DELAY_MS = 1000;

    @java.lang.Deprecated
    public static final long SECOND_TAP_DELAY_MS = 5000;

    @java.lang.Deprecated
    public static final long TRANSACTION_NOTIFICATION_DELAY_MS = 1500;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository.Companion Companion = new com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public MockPaymentRepository(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository mockTransactionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockTransactionRepository, "");
        this.getHighSpeedVideoFpsRangesFor = mockTransactionRepository;
        this.getHighSpeedVideoFpsRanges = context.getApplicationContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0134, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1500, r3) != r4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0122, code lost:
    
        if (r1.send(r2, r3) != r4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0110, code lost:
    
        if (r1.send(r5, r3) != r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dc, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(5000, r3) != r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:
    
        if (r1.send(r2, r3) != r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0172, code lost:
    
        if (r1.send(r0, r3) == r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (r2 != r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r3) != r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a3, code lost:
    
        if (r1.send(r2, r3) != r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0096, code lost:
    
        if (r1.send(r2, r3) != r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$producePaymentStateSuccess(com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository mockPaymentRepository, kotlinx.coroutines.channels.ProducerScope producerScope, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository$producePaymentStateSuccess$1 mockPaymentRepository$producePaymentStateSuccess$1;
        kotlinx.coroutines.channels.ProducerScope producerScope2 = producerScope;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository$producePaymentStateSuccess$1) {
            mockPaymentRepository$producePaymentStateSuccess$1 = (com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository$producePaymentStateSuccess$1) continuation;
            if ((mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = mockPaymentRepository$producePaymentStateSuccess$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoSizes) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.TransactionStarted transactionStarted = com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.TransactionStarted.INSTANCE;
                        mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoFpsRanges = producerScope2;
                        mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoSizes = 1;
                        break;
                    case 1:
                        producerScope2 = (kotlinx.coroutines.channels.ProducerScope) mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.FirstTapCompleted firstTapCompleted = com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.FirstTapCompleted.INSTANCE;
                        mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoFpsRanges = producerScope2;
                        mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoSizes = 2;
                        break;
                    case 2:
                        producerScope2 = (kotlinx.coroutines.channels.ProducerScope) mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoFpsRanges = producerScope2;
                        mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoSizes = 3;
                        break;
                    case 3:
                        producerScope2 = (kotlinx.coroutines.channels.ProducerScope) mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoFpsRanges = producerScope2;
                        mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoSizes = 4;
                        obj = getHighSpeedVideoFpsRanges(producerScope2, mockPaymentRepository$producePaymentStateSuccess$1);
                        break;
                    case 4:
                        producerScope2 = (kotlinx.coroutines.channels.ProducerScope) mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.ReadyForSecondTap readyForSecondTap = com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.ReadyForSecondTap.INSTANCE;
                            mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoFpsRanges = producerScope2;
                            mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoSizes = 5;
                            break;
                        } else {
                            com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.AuthenticationError authenticationError = com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.AuthenticationError.INSTANCE;
                            mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope2);
                            mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoSizes = 10;
                            break;
                        }
                        return coroutine_suspended;
                    case 5:
                        producerScope2 = (kotlinx.coroutines.channels.ProducerScope) mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoFpsRanges = producerScope2;
                        mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoSizes = 6;
                        break;
                    case 6:
                        producerScope2 = (kotlinx.coroutines.channels.ProducerScope) mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted transactionCompleted = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted(new com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionContext(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID, 1.99d, "USD", new com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus("1228", 4, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Active, false), 1.99d, com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme.VISA, "240618", com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.PURCHASE));
                        mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoFpsRanges = producerScope2;
                        mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoSizes = 7;
                        break;
                    case 7:
                        producerScope2 = (kotlinx.coroutines.channels.ProducerScope) mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.Idle idle = com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.Idle.INSTANCE;
                        mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope2);
                        mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoSizes = 8;
                        break;
                    case 8:
                        producerScope2 = (kotlinx.coroutines.channels.ProducerScope) mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope2);
                        mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoSizes = 9;
                        break;
                    case 9:
                        kotlin.ResultKt.throwOnFailure(obj);
                        mockPaymentRepository.getHighSpeedVideoFpsRangesFor.notify$taptopay_prodRelease(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction("abc", "xyz", com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.CLEARED, com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.PURCHASE, 1.99d, "USD", "$1.99", new java.util.Date(), "Acme Hardware", "95131", "5251")));
                        return kotlin.Unit.INSTANCE;
                    case 10:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        mockPaymentRepository$producePaymentStateSuccess$1 = new com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository$producePaymentStateSuccess$1(mockPaymentRepository, continuation);
        java.lang.Object obj2 = mockPaymentRepository$producePaymentStateSuccess$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (mockPaymentRepository$producePaymentStateSuccess$1.getHighSpeedVideoSizes) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/mock/MockPaymentRepository$Companion;", "", "<init>", "()V", "", "AUTHENTICATION_DELAY_MS", "J", "SECOND_TAP_DELAY_MS", "TRANSACTION_NOTIFICATION_DELAY_MS"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState> observePayment() {
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository$observePayment$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Object getHighSpeedVideoFpsRanges(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState> producerScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO()), null, null, new com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository$handleAuthentication$2$1(producerScope, safeContinuation, null), 3, null);
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean isListedAsPaymentApp() {
        return this.getHighSpeedVideoFpsRanges.getPackageManager().getComponentEnabledSetting(new android.content.ComponentName(this.getHighSpeedVideoFpsRanges, (java.lang.Class<?>) com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService.class)) == 1;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final void showAsPaymentApp(boolean show) {
        this.getHighSpeedVideoFpsRanges.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(this.getHighSpeedVideoFpsRanges, (java.lang.Class<?>) com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService.class), show ? 1 : 2, 1);
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean isDefaultPaymentApp() {
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(this.getHighSpeedVideoFpsRanges);
        if (defaultAdapter != null) {
            return android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter).isDefaultServiceForCategory(new android.content.ComponentName(this.getHighSpeedVideoFpsRanges, (java.lang.Class<?>) com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService.class), "payment");
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0 != null) goto L19;
     */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean setDefaultPaymentApp(androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        android.content.Intent putExtra;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        if (android.nfc.NfcAdapter.getDefaultAdapter(this.getHighSpeedVideoFpsRanges) == null) {
            return false;
        }
        java.lang.Boolean bool = null;
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            java.lang.Object systemService = this.getHighSpeedVideoFpsRanges.getSystemService("role");
            android.app.role.RoleManager roleManager = systemService instanceof android.app.role.RoleManager ? (android.app.role.RoleManager) systemService : null;
            if (roleManager != null) {
                putExtra = roleManager.isRoleAvailable("android.app.role.WALLET") ? roleManager.createRequestRoleIntent("android.app.role.WALLET") : null;
            }
            putExtra = null;
        } else {
            putExtra = new android.content.Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT").putExtra(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, new android.content.ComponentName(this.getHighSpeedVideoFpsRanges, (java.lang.Class<?>) com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService.class)).putExtra("category", "payment");
        }
        if (putExtra != null) {
            activityResultLauncher.launch(putExtra);
            bool = java.lang.Boolean.TRUE;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean setPreferredAppForOneTimeUse(android.app.Activity activity) {
        android.nfc.cardemulation.CardEmulation cardEmulation;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(this.getHighSpeedVideoFpsRanges);
        if (defaultAdapter == null || (cardEmulation = android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter)) == null || !cardEmulation.categoryAllowsForegroundPreference("payment")) {
            return false;
        }
        cardEmulation.setPreferredService(activity, new android.content.ComponentName(this.getHighSpeedVideoFpsRanges, (java.lang.Class<?>) com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService.class));
        return true;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean unsetPreferredAppForOneTimeUse(android.app.Activity activity) {
        android.nfc.cardemulation.CardEmulation cardEmulation;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(this.getHighSpeedVideoFpsRanges);
        if (defaultAdapter == null || (cardEmulation = android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter)) == null || !cardEmulation.isDefaultServiceForCategory(new android.content.ComponentName(this.getHighSpeedVideoFpsRanges, (java.lang.Class<?>) com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService.class), "payment")) {
            return false;
        }
        cardEmulation.unsetPreferredService(activity);
        return true;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean isForegroundSettingEnabled() {
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(this.getHighSpeedVideoFpsRanges);
        if (defaultAdapter == null) {
            return false;
        }
        return android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter).categoryAllowsForegroundPreference("payment");
    }
}
