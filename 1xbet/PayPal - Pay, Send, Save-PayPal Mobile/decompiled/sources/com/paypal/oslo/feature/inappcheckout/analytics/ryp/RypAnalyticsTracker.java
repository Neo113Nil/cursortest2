package com.paypal.oslo.feature.inappcheckout.analytics.ryp;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsTracker;", "", "Lcom/paypal/oslo/feature/inappcheckout/analytics/AnalyticsContextMapper;", "contextMapper", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/analytics/AnalyticsContextMapper;)V", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent;", "event", "", "trackEvent", "(Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/analytics/AnalyticsContextMapper;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RypAnalyticsTracker {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public RypAnalyticsTracker(com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper analyticsContextMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContextMapper, "");
        this.getHighSpeedVideoFpsRangesFor = analyticsContextMapper;
    }

    public final void trackEvent(com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent event) {
        com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentAppeared componentAppeared;
        java.lang.String str;
        java.lang.String id;
        com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantEntity merchant;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        try {
            boolean z = event instanceof com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenShown;
            java.lang.String str2 = com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.NavigationType.FORWARD;
            if (!z) {
                if (!(event instanceof com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenLoaded)) {
                    if (!(event instanceof com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenDismissed)) {
                        if (!(event instanceof com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentViewed)) {
                            if (!(event instanceof com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentInteracted)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentInteracted componentInteracted = (com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentInteracted) event;
                            com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData data = componentInteracted.getData();
                            java.lang.String compName = data.getCompName();
                            if (compName == null) {
                                compName = data.getItemName();
                            }
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Tracking component_clicked event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("screen", com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Ryp.Screen.ID), kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, compName)), null, 4, null);
                            java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> buildFundingInstrumentContexts = this.getHighSpeedVideoFpsRangesFor.buildFundingInstrumentContexts(data.getSelectedFi(), data.getFundingInstruments());
                            new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked(this.getHighSpeedVideoFpsRangesFor.buildUiContext(com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Ryp.Screen.ID, data.getCompName(), data.getItemName()), this.getHighSpeedVideoFpsRangesFor.buildUserIntentContext(componentInteracted.getType().getRawValue()), buildFundingInstrumentContexts).track(com.paypal.oslo.feature.inappcheckout.AnalyticsTrackerKt.analyticsTracker);
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Successfully tracked component_clicked event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain_contexts_count", java.lang.String.valueOf(buildFundingInstrumentContexts.size())), kotlin.TuplesKt.to("context_types", kotlin.collections.CollectionsKt.joinToString$default(buildFundingInstrumentContexts, null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsTracker$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsTracker.$r8$lambda$AHwh3FXbr2W4XW75yew8iUuAoqk((com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext) obj);
                                }
                            }, 31, null))), null, 4, null);
                            return;
                        }
                        com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentViewed componentViewed = (com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentViewed) event;
                        com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData data2 = componentViewed.getData();
                        java.lang.String compName2 = data2.getCompName();
                        if (compName2 == null) {
                            compName2 = data2.getItemName();
                        }
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Tracking component_viewed event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("screen", com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Ryp.Screen.ID), kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, compName2)), null, 4, null);
                        java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> buildFundingInstrumentContexts2 = this.getHighSpeedVideoFpsRangesFor.buildFundingInstrumentContexts(data2.getSelectedFi(), data2.getFundingInstruments());
                        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext buildUiContext = this.getHighSpeedVideoFpsRangesFor.buildUiContext(com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Ryp.Screen.ID, data2.getCompName(), data2.getItemName());
                        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext buildUserIntentContext = this.getHighSpeedVideoFpsRangesFor.buildUserIntentContext(data2.getIntent());
                        if (componentViewed.isEnabled()) {
                            componentAppeared = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentAvailable(buildUiContext, buildUserIntentContext, buildFundingInstrumentContexts2);
                        } else {
                            componentAppeared = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentAppeared(buildUiContext, buildUserIntentContext, buildFundingInstrumentContexts2);
                        }
                        componentAppeared.track(com.paypal.oslo.feature.inappcheckout.AnalyticsTrackerKt.analyticsTracker);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Successfully tracked component_viewed event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain_contexts_count", java.lang.String.valueOf(buildFundingInstrumentContexts2.size())), kotlin.TuplesKt.to("context_types", kotlin.collections.CollectionsKt.joinToString$default(buildFundingInstrumentContexts2, null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsTracker$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsTracker.$r8$lambda$KTNquoEqOeli7d3AGgwpiqU45AA((com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext) obj);
                            }
                        }, 31, null))), null, 4, null);
                        return;
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Tracking screen_exit event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("screen", com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Ryp.Screen.ID)), null, 4, null);
                    new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenDisappeared(com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper.buildUiContext$default(this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Ryp.Screen.ID, null, null, 6, null), com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper.buildUserIntentContext$default(this.getHighSpeedVideoFpsRangesFor, null, 1, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext(com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.NavigationType.FORWARD, null, null), this.getHighSpeedVideoFpsRangesFor.buildBusinessFlowContext(), null, 16, null).track(com.paypal.oslo.feature.inappcheckout.AnalyticsTrackerKt.analyticsTracker);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Successfully tracked screen_exit event", null, null, 6, null);
                    return;
                }
                com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenContext context = ((com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenLoaded) event).getContext();
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.inappcheckout.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                pairArr[0] = kotlin.TuplesKt.to("screen", com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Ryp.Screen.ID);
                pairArr[1] = kotlin.TuplesKt.to("total_fis", java.lang.String.valueOf(context.getFundingInstruments().size()));
                com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity checkoutEntity = context.getCheckoutEntity();
                java.lang.String str3 = "null";
                if (checkoutEntity == null || (merchant = checkoutEntity.getMerchant()) == null || (str = merchant.getName()) == null) {
                    str = "null";
                }
                pairArr[2] = kotlin.TuplesKt.to("merchant_name", str);
                kotlin.collections.MapsKt.mapOf(pairArr);
                com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument selectedFi = context.getSelectedFi();
                if (selectedFi != null && (id = selectedFi.getId()) != null) {
                    str3 = id;
                }
                kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("selected_fi_id", str3));
                java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> buildCheckoutContexts = this.getHighSpeedVideoFpsRangesFor.buildCheckoutContexts(context.getCheckoutEntity(), context.getSelectedFi(), context.getFundingInstruments());
                new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAvailable(com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper.buildUiContext$default(this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Ryp.Screen.ID, null, null, 6, null), com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper.buildUserIntentContext$default(this.getHighSpeedVideoFpsRangesFor, null, 1, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext(com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.NavigationType.FORWARD, null, null), this.getHighSpeedVideoFpsRangesFor.buildBusinessFlowContext(), buildCheckoutContexts).track(com.paypal.oslo.feature.inappcheckout.AnalyticsTrackerKt.analyticsTracker);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Successfully tracked screen_loaded event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain_contexts_count", java.lang.String.valueOf(buildCheckoutContexts.size())), kotlin.TuplesKt.to("context_types", kotlin.collections.CollectionsKt.joinToString$default(buildCheckoutContexts, null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsTracker$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsTracker.$r8$lambda$tsSnfLPkcaF6B9rdPJ15Ni18bMg((com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext) obj);
                    }
                }, 31, null))), null, 4, null);
                return;
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Tracking screen_shown event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("screen", com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Ryp.Screen.ID)), null, 4, null);
            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext buildUiContext$default = com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper.buildUiContext$default(this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Ryp.Screen.ID, null, null, 6, null);
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext buildUserIntentContext$default = com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper.buildUserIntentContext$default(this.getHighSpeedVideoFpsRangesFor, null, 1, null);
            if (((com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenShown) event).isBackToThisScreen()) {
                str2 = "back";
            }
            new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared(buildUiContext$default, buildUserIntentContext$default, new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext(str2, null, null), this.getHighSpeedVideoFpsRangesFor.buildBusinessFlowContext(), null, 16, null).track(com.paypal.oslo.feature.inappcheckout.AnalyticsTrackerKt.analyticsTracker);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Successfully tracked screen_shown event", null, null, 6, null);
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Failed to track analytics event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("event", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(event.getClass()).getSimpleName()), kotlin.TuplesKt.to("screen", com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Ryp.Screen.ID), kotlin.TuplesKt.to("exception_type", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(e.getClass()).getSimpleName())), null, e, 4, null);
        }
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$AHwh3FXbr2W4XW75yew8iUuAoqk(com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext analyticsContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "");
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(analyticsContext.getClass()).getSimpleName();
        return simpleName != null ? simpleName : "Unknown";
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$KTNquoEqOeli7d3AGgwpiqU45AA(com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext analyticsContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "");
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(analyticsContext.getClass()).getSimpleName();
        return simpleName != null ? simpleName : "Unknown";
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$tsSnfLPkcaF6B9rdPJ15Ni18bMg(com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext analyticsContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "");
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(analyticsContext.getClass()).getSimpleName();
        return simpleName != null ? simpleName : "Unknown";
    }
}
