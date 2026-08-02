package com.paypal.oslo.feature.ads.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"AdWidgetContentComposable", "", "viewModel", "Lcom/paypal/oslo/feature/ads/ui/widget/AdWidgetViewModel;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lcom/paypal/oslo/feature/ads/api/widget/configs/AdWidgetConfiguration;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/ads/ui/widget/AdWidgetViewModel;Lcom/paypal/oslo/feature/ads/api/widget/configs/AdWidgetConfiguration;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ads_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdWidgetImplKt {
    public static final void AdWidgetContentComposable(final com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel adWidgetViewModel, final com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration adWidgetConfiguration, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adWidgetViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adWidgetConfiguration, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-497952612);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(adWidgetViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(adWidgetConfiguration) : startRestartGroup.changedInstance(adWidgetConfiguration) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        boolean z = true;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-497952612, i3, -1, "com.paypal.oslo.feature.ads.ui.widget.AdWidgetContentComposable (AdWidgetImpl.kt:105)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(adWidgetViewModel);
            if ((i3 & 112) != 32 && ((i3 & 64) == 0 || !startRestartGroup.changedInstance(adWidgetConfiguration))) {
                z = false;
            }
            com.paypal.oslo.feature.ads.ui.widget.AdWidgetImplKt$AdWidgetContentComposable$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.ads.ui.widget.AdWidgetImplKt$AdWidgetContentComposable$1$1(adWidgetViewModel, adWidgetConfiguration, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            int i5 = i3 >> 3;
            androidx.compose.runtime.EffectsKt.LaunchedEffect(adWidgetConfiguration, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration.$stable | (i5 & 14));
            com.paypal.oslo.feature.ads.ui.AdContainerKt.AdContainer(adWidgetConfiguration.getPlacement(), modifier, adWidgetViewModel, startRestartGroup, (i5 & 112) | ((i3 << 6) & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.ads.ui.widget.AdWidgetImplKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.ads.ui.widget.AdWidgetImplKt.$r8$lambda$FgmAyw96pE65wjHDmvaZo4KhcHc(com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel.this, adWidgetConfiguration, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FgmAyw96pE65wjHDmvaZo4KhcHc(com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel adWidgetViewModel, com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration adWidgetConfiguration, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AdWidgetContentComposable(adWidgetViewModel, adWidgetConfiguration, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
