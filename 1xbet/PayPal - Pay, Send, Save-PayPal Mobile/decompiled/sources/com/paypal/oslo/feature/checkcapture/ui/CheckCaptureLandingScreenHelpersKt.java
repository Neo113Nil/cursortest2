package com.paypal.oslo.feature.checkcapture.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aM\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u000e"}, d2 = {"", "privacyPolicyUrl", "termsAndConditionsUrl", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "flowContext", "Lkotlin/Function1;", "", "onLinkClick", "Lkotlin/Function2;", "createOnLandingLinkClickCallback", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function2;", "Lkotlin/Function0;", "onNavigateBack", "createOnLandingBackButtonClickCallback", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", "onContinue", "createOnLandingGetStartedClickCallback"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckCaptureLandingScreenHelpersKt {
    public static final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> createOnLandingLinkClickCallback(final java.lang.String str, final java.lang.String str2, final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessFlowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.checkcapture.ui.CheckCaptureLandingScreenHelpersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.checkcapture.ui.CheckCaptureLandingScreenHelpersKt.$r8$lambda$2wIexpzQlO6iwORZ43ocVCO8FPw(str, businessFlowContext, str2, function1, (java.lang.String) obj, (java.lang.String) obj2);
            }
        };
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> createOnLandingBackButtonClickCallback(final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessFlowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.checkcapture.ui.CheckCaptureLandingScreenHelpersKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.checkcapture.ui.CheckCaptureLandingScreenHelpersKt.$r8$lambda$4imvxMDB4QQeTJsKS5abm0l9AqI(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext.this, function0);
            }
        };
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> createOnLandingGetStartedClickCallback(final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessFlowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.checkcapture.ui.CheckCaptureLandingScreenHelpersKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.checkcapture.ui.CheckCaptureLandingScreenHelpersKt.m13495$r8$lambda$ppDIOfzaysB_gIqPrc12bK1LcA(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext.this, function0);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2wIexpzQlO6iwORZ43ocVCO8FPw(java.lang.String str, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, java.lang.String str2, kotlin.jvm.functions.Function1 function1, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str4, str)) {
            com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt.clicked(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalytics.INSTANCE.createPrivacyPolicyLinkClickedEvent(businessFlowContext));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(str4, str2)) {
            com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt.clicked(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalytics.INSTANCE.createTermsAndConditionsLinkClickedEvent(businessFlowContext));
        }
        function1.invoke(str4);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4imvxMDB4QQeTJsKS5abm0l9AqI(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, kotlin.jvm.functions.Function0 function0) {
        com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt.clicked(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalytics.INSTANCE.createBackButtonClickedEvent(businessFlowContext));
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ppDIOfza-ysB_gIqPrc12bK1LcA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13495$r8$lambda$ppDIOfzaysB_gIqPrc12bK1LcA(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, kotlin.jvm.functions.Function0 function0) {
        com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt.clicked(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalytics.INSTANCE.createGetStartedButtonClickedEvent(businessFlowContext));
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
