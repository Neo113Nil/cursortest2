package com.adobe.marketing.mobile.services.ui.floatingbutton;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u00020\u00102\u0010\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001f\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010%"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonPresentable;", "Lcom/adobe/marketing/mobile/services/ui/common/AEPPresentable;", "Lcom/adobe/marketing/mobile/services/ui/FloatingButton;", com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonTestTags.FLOATING_BUTTON, "Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonViewModel;", "floatingButtonViewModel", "Lcom/adobe/marketing/mobile/services/ui/PresentationDelegate;", "presentationDelegate", "Lcom/adobe/marketing/mobile/services/ui/PresentationUtilityProvider;", "presentationUtilityProvider", "Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider;", "appLifecycleProvider", "Lkotlinx/coroutines/CoroutineScope;", "mainScope", "<init>", "(Lcom/adobe/marketing/mobile/services/ui/FloatingButton;Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonViewModel;Lcom/adobe/marketing/mobile/services/ui/PresentationDelegate;Lcom/adobe/marketing/mobile/services/ui/PresentationUtilityProvider;Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider;Lkotlinx/coroutines/CoroutineScope;)V", "", "gateDisplay", "()Z", "Landroid/content/Context;", "activityContext", "Landroidx/compose/ui/platform/ComposeView;", "getContent", "(Landroid/content/Context;)Landroidx/compose/ui/platform/ComposeView;", "getPresentation", "()Lcom/adobe/marketing/mobile/services/ui/FloatingButton;", "", "Lcom/adobe/marketing/mobile/services/ui/Presentation;", "visiblePresentations", "hasConflicts", "(Ljava/util/List;)Z", "Camera2StreamConfigurationMap", "Lcom/adobe/marketing/mobile/services/ui/FloatingButton;", "getHighSpeedVideoSizes", "Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonPresentable$floatingButtonEventHandler$1;", "getHighSpeedVideoFpsRanges", "Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonPresentable$floatingButtonEventHandler$1;", "Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonViewModel;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class FloatingButtonPresentable extends com.adobe.marketing.mobile.services.ui.common.AEPPresentable<com.adobe.marketing.mobile.services.ui.FloatingButton> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.adobe.marketing.mobile.services.ui.FloatingButton getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable$floatingButtonEventHandler$1 Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonViewModel getHighResolutionOutputSizeshNQ4ISI;

    @Override // com.adobe.marketing.mobile.services.ui.common.AEPPresentable
    public final boolean gateDisplay() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable$floatingButtonEventHandler$1] */
    public FloatingButtonPresentable(com.adobe.marketing.mobile.services.ui.FloatingButton floatingButton, com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonViewModel floatingButtonViewModel, com.adobe.marketing.mobile.services.ui.PresentationDelegate presentationDelegate, com.adobe.marketing.mobile.services.ui.PresentationUtilityProvider presentationUtilityProvider, com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider appLifecycleProvider, kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(floatingButton, presentationUtilityProvider, presentationDelegate, appLifecycleProvider, coroutineScope);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(floatingButton, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(floatingButtonViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(presentationUtilityProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoSizes = floatingButton;
        this.getHighResolutionOutputSizeshNQ4ISI = floatingButtonViewModel;
        ?? r10 = new com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonEventHandler() { // from class: com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable$floatingButtonEventHandler$1
            @Override // com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonEventHandler
            public final void updateGraphic(android.graphics.Bitmap graphic) {
                com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonViewModel floatingButtonViewModel2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphic, "");
                floatingButtonViewModel2 = com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable.this.getHighResolutionOutputSizeshNQ4ISI;
                floatingButtonViewModel2.onGraphicUpdate$core_phoneRelease(graphic);
            }
        };
        this.Camera2StreamConfigurationMap = r10;
        floatingButton.setEventHandler$core_phoneRelease((com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonEventHandler) r10);
        floatingButtonViewModel.onGraphicUpdate$core_phoneRelease(floatingButton.getSettings().getInitialGraphic());
    }

    @Override // com.adobe.marketing.mobile.services.ui.common.AEPPresentable
    public final androidx.compose.ui.platform.ComposeView getContent(android.content.Context activityContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "");
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(getThemedContext$core_phoneRelease(activityContext), null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(302621519, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable$getContent$1$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                getHighSpeedVideoFpsRanges(composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(androidx.compose.runtime.Composer composer, int i) {
                com.adobe.marketing.mobile.services.ui.common.PresentationStateManager presentationStateManager;
                com.adobe.marketing.mobile.services.ui.FloatingButton floatingButton;
                com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonViewModel floatingButtonViewModel;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(302621519, i, -1, "com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable.getContent.<anonymous>.<anonymous> (FloatingButtonPresentable.kt:65)");
                    }
                    presentationStateManager = com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable.this.getPresentationStateManager();
                    floatingButton = com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable.this.getHighSpeedVideoSizes;
                    com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonSettings settings = floatingButton.getSettings();
                    floatingButtonViewModel = com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable.this.getHighResolutionOutputSizeshNQ4ISI;
                    final com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable floatingButtonPresentable = com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable.this;
                    kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable$getContent$1$1.1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* synthetic */ kotlin.Unit invoke() {
                            com.adobe.marketing.mobile.services.ui.FloatingButton floatingButton2;
                            floatingButton2 = com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable.this.getHighSpeedVideoSizes;
                            floatingButton2.getEventListener().onTapDetected(com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable.this);
                            return kotlin.Unit.INSTANCE;
                        }

                        {
                            super(0);
                        }
                    };
                    final com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable floatingButtonPresentable2 = com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable.this;
                    com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonScreenKt.FloatingButtonScreen(presentationStateManager, settings, floatingButtonViewModel, function0, new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable$getContent$1$1.2
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Offset offset) {
                            com.adobe.marketing.mobile.services.ui.FloatingButton floatingButton2;
                            offset.m5762unboximpl();
                            floatingButton2 = com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable.this.getHighSpeedVideoSizes;
                            floatingButton2.getEventListener().onPanDetected(com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable.this);
                            return kotlin.Unit.INSTANCE;
                        }

                        {
                            super(1);
                        }
                    }, composer, androidx.compose.animation.core.MutableTransitionState.$stable | 576);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            {
                super(2);
            }
        }));
        return composeView;
    }

    @Override // com.adobe.marketing.mobile.services.ui.Presentable
    /* renamed from: getPresentation, reason: from getter */
    public final com.adobe.marketing.mobile.services.ui.FloatingButton getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.adobe.marketing.mobile.services.ui.common.AEPPresentable
    public final boolean hasConflicts(java.util.List<? extends com.adobe.marketing.mobile.services.ui.Presentation<?>> visiblePresentations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visiblePresentations, "");
        return false;
    }
}
