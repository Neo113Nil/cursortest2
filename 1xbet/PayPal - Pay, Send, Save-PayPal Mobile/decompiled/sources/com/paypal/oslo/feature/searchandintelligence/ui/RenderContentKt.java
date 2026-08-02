package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\\\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000523\u0010\u0006\u001a/\u0012\u001b\u0012\u0019\u0012\u0006\b\u0001\u0012\u00020\u00050\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\f0\u00072\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0010\u001a\u00020\u000e*\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0013"}, d2 = {"RenderContent", "", "verticalPosition", "", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "getRenderer", "Lkotlin/Function1;", "Lkotlin/reflect/KClass;", "Lkotlin/ParameterName;", "name", "contentClass", "Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "modifier", "Landroidx/compose/ui/Modifier;", "(ILcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "applyAnalyticsConfig", "config", "Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig;", "search-and-intelligence_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RenderContentKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderContent(final int i, final com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent uiComponent, final kotlin.jvm.functions.Function1<? super kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>, ? extends com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier instrument;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.ui.Modifier modifier5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiComponent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2109862469);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(uiComponent) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i5 = i4;
            if (startRestartGroup.shouldExecute((i5 & 1171) == 1170, i5 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier6 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2109862469, i5, -1, "com.paypal.oslo.feature.searchandintelligence.ui.RenderContent (RenderContent.kt:49)");
                }
                com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> invoke = function1.invoke(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(uiComponent.getClass()));
                kotlin.Unit unit = null;
                com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> uiComponentRenderer = invoke instanceof com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer ? invoke : null;
                if (uiComponentRenderer == null) {
                    startRestartGroup.startReplaceGroup(1933878159);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-353258830);
                    com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig provideAnalyticsConfig = uiComponentRenderer.provideAnalyticsConfig(uiComponent);
                    if (provideAnalyticsConfig == null) {
                        modifier4 = modifier6;
                    } else {
                        if (provideAnalyticsConfig instanceof com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig.Module) {
                            instrument = com.paypal.oslo.feature.searchandintelligence.ui.analytics.InstrumentationUtilsKt.instrument$default(modifier6, (com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig.Module) provideAnalyticsConfig, java.lang.Integer.valueOf(i), (java.lang.Integer) null, 4, (java.lang.Object) null);
                        } else if (provideAnalyticsConfig instanceof com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig.Component) {
                            instrument = com.paypal.oslo.feature.searchandintelligence.ui.analytics.InstrumentationUtilsKt.instrument$default(modifier6, (com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig.Component) provideAnalyticsConfig, java.lang.Integer.valueOf(i), (java.lang.Integer) null, 4, (java.lang.Object) null);
                        } else {
                            if (!(provideAnalyticsConfig instanceof com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig.Item)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            instrument = com.paypal.oslo.feature.searchandintelligence.ui.analytics.InstrumentationUtilsKt.instrument(modifier6, (com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig.Item) provideAnalyticsConfig);
                        }
                        modifier4 = instrument;
                    }
                    com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer.ComposeDefaultImpls.Render$default(uiComponent, modifier4, uiComponentRenderer, startRestartGroup, (i5 >> 3) & 14, 0);
                    startRestartGroup.endReplaceGroup();
                    unit = kotlin.Unit.INSTANCE;
                }
                if (unit == null) {
                    startRestartGroup.startReplaceGroup(1934099779);
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, com.paypal.oslo.feature.searchandintelligence.domain.LogActions.COMPONENT_RENDERER_MISSING, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("component_type", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(uiComponent.getClass()).getGetHighResolutionOutputSizeshNQ4ISI())), null, null, 12, null);
                    modifier5 = modifier6;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(uiComponent.toString(), modifier6, null, null, null, null, false, 0, 0, null, null, composer2, (i5 >> 6) & 112, 0, 2044);
                    composer2.endReplaceGroup();
                } else {
                    modifier5 = modifier6;
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(-353258780);
                    composer2.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.RenderContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.RenderContentKt.m19160$r8$lambda$2kGJZ9mOMzzNEuLyIs0gx6G5w(i, uiComponent, function1, modifier3, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i5 = i4;
        if (startRestartGroup.shouldExecute((i5 & 1171) == 1170, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$2-kGJZ9mOMzzNE-uLyIs0gx6G5w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19160$r8$lambda$2kGJZ9mOMzzNEuLyIs0gx6G5w(int i, com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent uiComponent, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        RenderContent(i, uiComponent, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }
}
