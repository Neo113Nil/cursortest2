package com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001Bm\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/jsinterface/PaypalMobileJsInterface;", "", "Lkotlin/Function0;", "", "onAddCardCompleteCallback", "onActivateCardCompleteCallback", "Lkotlin/Function1;", "", "onAddAddressCompleteCallback", "onLinkBankAccountCallback", "onSeeDigitalCardCallback", "onManageCardCallback", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "payload", "onAddCardComplete", "(Ljava/lang/String;)V", "onAddAddressComplete", "onActivateCardComplete", "onLinkBankClick", "()V", "onEnrolmentCompleteUseDigitalCardTapped", "onEnrolmentCompleteManageCardTapped", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getInputFormats", "getOutputMinFrameDuration"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PaypalMobileJsInterface {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getOutputMinFrameDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public PaypalMobileJsInterface(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, kotlin.jvm.functions.Function0<kotlin.Unit> function05) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function05, "");
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoFpsRangesFor = function02;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRanges = function03;
        this.getHighSpeedVideoSizes = function04;
        this.getOutputMinFrameDuration = function05;
    }

    public /* synthetic */ PaypalMobileJsInterface(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.PaypalMobileJsInterface$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function0, (i & 2) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.PaypalMobileJsInterface$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function02, (i & 4) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.PaypalMobileJsInterface$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.PaypalMobileJsInterface.$r8$lambda$LUQPdxdE2MdskQiSyxIk7umpH3Q((java.lang.String) obj);
            }
        } : function1, (i & 8) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.PaypalMobileJsInterface$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function03, (i & 16) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.PaypalMobileJsInterface$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function04, (i & 32) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.PaypalMobileJsInterface$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function05);
    }

    @android.webkit.JavascriptInterface
    public final void onAddCardComplete(java.lang.String payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "onAddCardComplete", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("payload", payload)), null, 4, null);
        try {
            if (((com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddCardholderPayload) com.paypal.oslo.feature.debitcard.shared.util.JsonExtensionsKt.getJson().decodeFromString(com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddCardholderPayload.INSTANCE.serializer(), payload)).getSuccess()) {
                this.Camera2StreamConfigurationMap.invoke();
            }
        } catch (kotlinx.serialization.SerializationException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.debitcard.LoggerKt.log;
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddCardholderPayload.class).getSimpleName();
            java.lang.String message = e.getMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to deserialize JSON ");
            sb.append(payload);
            sb.append(" to ");
            sb.append(simpleName);
            sb.append(": ");
            sb.append(message);
            kotlinx.serialization.SerializationException serializationException = e;
            logger.e(sb.toString(), serializationException);
            throw new java.lang.IllegalStateException("Failed to deserialize JSON to ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddCardholderPayload.class).getSimpleName())), serializationException);
        }
    }

    @android.webkit.JavascriptInterface
    public final void onAddAddressComplete(java.lang.String payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "onAddAddressComplete", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("payload", payload)), null, 4, null);
        try {
            com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddAddressPayload addAddressPayload = (com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddAddressPayload) com.paypal.oslo.feature.debitcard.shared.util.JsonExtensionsKt.getJson().decodeFromString(com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddAddressPayload.INSTANCE.serializer(), payload);
            if (addAddressPayload.getSuccess()) {
                this.getHighResolutionOutputSizeshNQ4ISI.invoke(addAddressPayload.getNewAddressId());
            }
        } catch (kotlinx.serialization.SerializationException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.debitcard.LoggerKt.log;
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddAddressPayload.class).getSimpleName();
            java.lang.String message = e.getMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to deserialize JSON ");
            sb.append(payload);
            sb.append(" to ");
            sb.append(simpleName);
            sb.append(": ");
            sb.append(message);
            kotlinx.serialization.SerializationException serializationException = e;
            logger.e(sb.toString(), serializationException);
            throw new java.lang.IllegalStateException("Failed to deserialize JSON to ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddAddressPayload.class).getSimpleName())), serializationException);
        }
    }

    @android.webkit.JavascriptInterface
    public final void onActivateCardComplete(java.lang.String payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "onActivateCardComplete", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("payload", payload)), null, 4, null);
        try {
            if (((com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.ActivateCardPayload) com.paypal.oslo.feature.debitcard.shared.util.JsonExtensionsKt.getJson().decodeFromString(com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.ActivateCardPayload.INSTANCE.serializer(), payload)).getSuccess()) {
                this.getHighSpeedVideoFpsRangesFor.invoke();
            }
        } catch (kotlinx.serialization.SerializationException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.debitcard.LoggerKt.log;
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.ActivateCardPayload.class).getSimpleName();
            java.lang.String message = e.getMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to deserialize JSON ");
            sb.append(payload);
            sb.append(" to ");
            sb.append(simpleName);
            sb.append(": ");
            sb.append(message);
            kotlinx.serialization.SerializationException serializationException = e;
            logger.e(sb.toString(), serializationException);
            throw new java.lang.IllegalStateException("Failed to deserialize JSON to ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.ActivateCardPayload.class).getSimpleName())), serializationException);
        }
    }

    @android.webkit.JavascriptInterface
    public final void onLinkBankClick() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "onLinkBankClick", null, null, 6, null);
        this.getHighSpeedVideoFpsRanges.invoke();
    }

    @android.webkit.JavascriptInterface
    public final void onEnrolmentCompleteUseDigitalCardTapped() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "onEnrolmentCompleteUseDigitalCardTapped", null, null, 6, null);
        this.getHighSpeedVideoSizes.invoke();
    }

    @android.webkit.JavascriptInterface
    public final void onEnrolmentCompleteManageCardTapped() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "onEnrolmentCompleteManageCardTapped", null, null, 6, null);
        this.getOutputMinFrameDuration.invoke();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LUQPdxdE2MdskQiSyxIk7umpH3Q(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public PaypalMobileJsInterface() {
        this(null, null, null, null, null, null, 63, null);
    }
}
