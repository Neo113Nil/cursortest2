package com.adobe.marketing.mobile.services.ui.alert;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\u000e2\u0010\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/alert/AlertPresentable;", "Lcom/adobe/marketing/mobile/services/ui/common/AEPPresentable;", "Lcom/adobe/marketing/mobile/services/ui/Alert;", "alert", "Lcom/adobe/marketing/mobile/services/ui/PresentationDelegate;", "presentationDelegate", "Lcom/adobe/marketing/mobile/services/ui/PresentationUtilityProvider;", "presentationUtilityProvider", "Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider;", "appLifecycleProvider", "Lkotlinx/coroutines/CoroutineScope;", "mainScope", "<init>", "(Lcom/adobe/marketing/mobile/services/ui/Alert;Lcom/adobe/marketing/mobile/services/ui/PresentationDelegate;Lcom/adobe/marketing/mobile/services/ui/PresentationUtilityProvider;Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider;Lkotlinx/coroutines/CoroutineScope;)V", "", "gateDisplay", "()Z", "Landroid/content/Context;", "activityContext", "Landroidx/compose/ui/platform/ComposeView;", "getContent", "(Landroid/content/Context;)Landroidx/compose/ui/platform/ComposeView;", "getPresentation", "()Lcom/adobe/marketing/mobile/services/ui/Alert;", "", "Lcom/adobe/marketing/mobile/services/ui/Presentation;", "visiblePresentations", "hasConflicts", "(Ljava/util/List;)Z", "Lcom/adobe/marketing/mobile/services/ui/Alert;", "getAlert"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AlertPresentable extends com.adobe.marketing.mobile.services.ui.common.AEPPresentable<com.adobe.marketing.mobile.services.ui.Alert> {
    private final com.adobe.marketing.mobile.services.ui.Alert alert;

    @Override // com.adobe.marketing.mobile.services.ui.common.AEPPresentable
    public final boolean gateDisplay() {
        return false;
    }

    public final com.adobe.marketing.mobile.services.ui.Alert getAlert() {
        return this.alert;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertPresentable(com.adobe.marketing.mobile.services.ui.Alert alert, com.adobe.marketing.mobile.services.ui.PresentationDelegate presentationDelegate, com.adobe.marketing.mobile.services.ui.PresentationUtilityProvider presentationUtilityProvider, com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider appLifecycleProvider, kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(alert, presentationUtilityProvider, presentationDelegate, appLifecycleProvider, coroutineScope);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alert, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(presentationUtilityProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.alert = alert;
    }

    @Override // com.adobe.marketing.mobile.services.ui.common.AEPPresentable
    public final androidx.compose.ui.platform.ComposeView getContent(android.content.Context activityContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "");
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(activityContext, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1228840351, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.alert.AlertPresentable$getContent$1$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                getHighResolutionOutputSizeshNQ4ISI(composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.Composer composer, int i) {
                com.adobe.marketing.mobile.services.ui.common.PresentationStateManager presentationStateManager;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1228840351, i, -1, "com.adobe.marketing.mobile.services.ui.alert.AlertPresentable.getContent.<anonymous>.<anonymous> (AlertPresentable.kt:47)");
                    }
                    presentationStateManager = com.adobe.marketing.mobile.services.ui.alert.AlertPresentable.this.getPresentationStateManager();
                    com.adobe.marketing.mobile.services.ui.alert.AlertSettings settings = com.adobe.marketing.mobile.services.ui.alert.AlertPresentable.this.getAlert().getSettings();
                    final com.adobe.marketing.mobile.services.ui.alert.AlertPresentable alertPresentable = com.adobe.marketing.mobile.services.ui.alert.AlertPresentable.this;
                    kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.alert.AlertPresentable$getContent$1$1.1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* synthetic */ kotlin.Unit invoke() {
                            com.adobe.marketing.mobile.services.ui.alert.AlertPresentable.this.getAlert().getEventListener().onPositiveResponse(com.adobe.marketing.mobile.services.ui.alert.AlertPresentable.this);
                            com.adobe.marketing.mobile.services.ui.alert.AlertPresentable.this.dismiss();
                            return kotlin.Unit.INSTANCE;
                        }

                        {
                            super(0);
                        }
                    };
                    final com.adobe.marketing.mobile.services.ui.alert.AlertPresentable alertPresentable2 = com.adobe.marketing.mobile.services.ui.alert.AlertPresentable.this;
                    kotlin.jvm.functions.Function0<kotlin.Unit> function02 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.alert.AlertPresentable$getContent$1$1.2
                        @Override // kotlin.jvm.functions.Function0
                        public final /* synthetic */ kotlin.Unit invoke() {
                            com.adobe.marketing.mobile.services.ui.alert.AlertPresentable.this.getAlert().getEventListener().onNegativeResponse(com.adobe.marketing.mobile.services.ui.alert.AlertPresentable.this);
                            com.adobe.marketing.mobile.services.ui.alert.AlertPresentable.this.dismiss();
                            return kotlin.Unit.INSTANCE;
                        }

                        {
                            super(0);
                        }
                    };
                    final com.adobe.marketing.mobile.services.ui.alert.AlertPresentable alertPresentable3 = com.adobe.marketing.mobile.services.ui.alert.AlertPresentable.this;
                    com.adobe.marketing.mobile.services.ui.alert.views.AlertScreenKt.AlertScreen(presentationStateManager, settings, function0, function02, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.alert.AlertPresentable$getContent$1$1.3
                        @Override // kotlin.jvm.functions.Function0
                        public final /* synthetic */ kotlin.Unit invoke() {
                            com.adobe.marketing.mobile.services.ui.alert.AlertPresentable.this.dismiss();
                            return kotlin.Unit.INSTANCE;
                        }

                        {
                            super(0);
                        }
                    }, composer, androidx.compose.animation.core.MutableTransitionState.$stable);
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
    public final com.adobe.marketing.mobile.services.ui.Alert getPresentation() {
        return this.alert;
    }

    @Override // com.adobe.marketing.mobile.services.ui.common.AEPPresentable
    public final boolean hasConflicts(java.util.List<? extends com.adobe.marketing.mobile.services.ui.Presentation<?>> visiblePresentations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visiblePresentations, "");
        java.util.List<? extends com.adobe.marketing.mobile.services.ui.Presentation<?>> list = visiblePresentations;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.adobe.marketing.mobile.services.ui.Presentation presentation = (com.adobe.marketing.mobile.services.ui.Presentation) it.next();
            if ((presentation instanceof com.adobe.marketing.mobile.services.ui.Alert) || (presentation instanceof com.adobe.marketing.mobile.services.ui.InAppMessage)) {
                return true;
            }
        }
        return false;
    }
}
