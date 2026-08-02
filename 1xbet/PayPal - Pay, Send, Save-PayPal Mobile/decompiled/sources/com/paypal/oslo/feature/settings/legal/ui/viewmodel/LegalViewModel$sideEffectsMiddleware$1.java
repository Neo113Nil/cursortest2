package com.paypal.oslo.feature.settings.legal.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalViewModel$sideEffectsMiddleware$1;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LegalViewModel$sideEffectsMiddleware$1 implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState, com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent> {
    final /* synthetic */ com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel getHighSpeedVideoFpsRanges;

    LegalViewModel$sideEffectsMiddleware$1(com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel legalViewModel) {
        this.getHighSpeedVideoFpsRanges = legalViewModel;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState, com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent> input) {
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator2;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        final com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent event = input.getEvent();
        if (event instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnBackClicked) {
            appNavigator3 = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            appNavigator3.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel$sideEffectsMiddleware$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel$sideEffectsMiddleware$1.$r8$lambda$jBSU5RDqZapi3FmHOzHyvXai4Zo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return;
        }
        if (event instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLinkClicked) {
            com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLinkClicked onLinkClicked = (com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLinkClicked) event;
            final java.lang.String formatUrlWithLocale$default = com.paypal.oslo.feature.settings.legal.domain.util.LegalLinkMapper.formatUrlWithLocale$default(com.paypal.oslo.feature.settings.legal.domain.util.LegalLinkMapper.INSTANCE, onLinkClicked.getItem().getUrl(), null, 2, null);
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Going to legal link", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("title", onLinkClicked.getItem().getTitle()), kotlin.TuplesKt.to("url", formatUrlWithLocale$default)), null, 4, null);
            appNavigator2 = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            appNavigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel$sideEffectsMiddleware$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel$sideEffectsMiddleware$1.$r8$lambda$R2DjsufqjbTQYhjiXariPXWMi58(formatUrlWithLocale$default, event, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return;
        }
        if (event instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLegalHubClicked) {
            appNavigator = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            final com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel legalViewModel = this.getHighSpeedVideoFpsRanges;
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel$sideEffectsMiddleware$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel$sideEffectsMiddleware$1.$r8$lambda$xbFAfyoPUVaFYkCs3XWDVh1KhC8(com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else if (event instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.SystemEvent.LoadLegalItems) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r12), null, null, new com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel$loadLegalItems$1(this.getHighSpeedVideoFpsRanges, null), 3, null);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$R2DjsufqjbTQYhjiXariPXWMi58(java.lang.String str, com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent legalEvent, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.settings.api.navigation.LegalWebViewDestination(str, ((com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLinkClicked) legalEvent).getItem().getTitle()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jBSU5RDqZapi3FmHOzHyvXai4Zo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xbFAfyoPUVaFYkCs3XWDVh1KhC8(com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel legalViewModel, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        settingsStringsProvider = legalViewModel.Camera2StreamConfigurationMap;
        navigationScope.push(new com.paypal.oslo.feature.settings.api.navigation.LegalWebViewDestination(com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel.LEGAL_HUB_LINK, settingsStringsProvider.getLegalStrings().getLegalHub()));
        return kotlin.Unit.INSTANCE;
    }
}
