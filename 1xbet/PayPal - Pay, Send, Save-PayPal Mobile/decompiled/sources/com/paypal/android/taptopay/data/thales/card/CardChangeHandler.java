package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/card/CardChangeHandler;", "", "Lcom/paypal/android/taptopay/data/thales/card/CardPushNotificationDataSource;", "cardPushNotificationDataSource", "Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;", "cardDataSource", "<init>", "(Lcom/paypal/android/taptopay/data/thales/card/CardPushNotificationDataSource;Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardChangeHandler {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.card.CardDataSource getHighResolutionOutputSizeshNQ4ISI;

    public CardChangeHandler(com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource cardPushNotificationDataSource, com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPushNotificationDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDataSource, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cardDataSource;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getMain()), null, null, new com.paypal.android.taptopay.data.thales.card.CardChangeHandler.AnonymousClass1(cardPushNotificationDataSource, this, null), 3, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.CardChangeHandler$1", f = "CardChangeHandler.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.paypal.android.taptopay.data.thales.card.CardChangeHandler$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.android.taptopay.data.thales.card.CardChangeHandler getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.SharedFlow<com.paypal.android.taptopay.data.thales.fcm.model.CardPushNotification> pushNotification = this.Camera2StreamConfigurationMap.getPushNotification();
                final com.paypal.android.taptopay.data.thales.card.CardChangeHandler cardChangeHandler = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (pushNotification.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.android.taptopay.data.thales.card.CardChangeHandler.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Object emit(com.paypal.android.taptopay.data.thales.fcm.model.CardPushNotification cardPushNotification, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        com.paypal.android.taptopay.data.thales.card.CardChangeHandler.this.getHighResolutionOutputSizeshNQ4ISI.rehydrate$tap_to_pay_data_thales_release();
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.android.taptopay.data.thales.card.CardChangeHandler.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.android.taptopay.data.thales.card.CardChangeHandler.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource cardPushNotificationDataSource, com.paypal.android.taptopay.data.thales.card.CardChangeHandler cardChangeHandler, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.CardChangeHandler.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = cardPushNotificationDataSource;
            this.getHighSpeedVideoSizes = cardChangeHandler;
        }
    }
}
