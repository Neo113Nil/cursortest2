package com.paypal.oslo.feature.searchandintelligence.api.renderer;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0017\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u000fH'¢\u0006\u0002\u0010\u0010R\u001a\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "T", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "provideAnalyticsConfig", "Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig;", "content", "(Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;)Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig;", "Render", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "search-and-intelligence-api_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface UiComponentRenderer<T extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> {
    void Render(T t, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i);

    kotlin.reflect.KClass<? extends T> getType();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <T extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig provideAnalyticsConfig(com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<T> uiComponentRenderer, T t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
            return com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer.super.provideAnalyticsConfig(t);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class ComposeDefaultImpls {
        public static final void Render$default(final T t, androidx.compose.ui.Modifier modifier, final com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<T> uiComponentRenderer, androidx.compose.runtime.Composer composer, final int i, final int i2) {
            int i3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiComponentRenderer, "");
            androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1998402014);
            if ((i & 6) == 0) {
                i3 = ((i & 8) == 0 ? startRestartGroup.changed(t) : startRestartGroup.changedInstance(t) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            int i4 = i2 & 2;
            if (i4 != 0) {
                i3 |= 48;
            } else if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? startRestartGroup.changed(uiComponentRenderer) : startRestartGroup.changedInstance(uiComponentRenderer) ? 256 : 128;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                if (i4 != 0) {
                    modifier = androidx.compose.ui.Modifier.INSTANCE;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1998402014, i3, -1, "com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer.ComposeDefaultImpls.Render$default (UiComponentRenderer.kt:-1)");
                }
                uiComponentRenderer.Render(t, modifier, startRestartGroup, i3 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            final androidx.compose.ui.Modifier modifier2 = modifier;
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer$ComposeDefaultImpls$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer.ComposeDefaultImpls.$r8$lambda$o4QtxqJLEXCmPyCbl4Mc7yJIZpk(com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent.this, modifier2, uiComponentRenderer, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
            }
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$o4QtxqJLEXCmPyCbl4Mc7yJIZpk(com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent uiComponent, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer uiComponentRenderer, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
            Render$default(uiComponent, modifier, uiComponentRenderer, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            return kotlin.Unit.INSTANCE;
        }
    }

    default com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig provideAnalyticsConfig(T content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        return null;
    }
}
