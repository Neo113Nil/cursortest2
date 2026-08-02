package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "p0", "Landroidx/lifecycle/Lifecycle;", "p1", "Lkotlin/Function0;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/lifecycle/Lifecycle;)Lkotlin/jvm/functions/Function0;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewCompositionStrategy_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.ui.platform.AbstractComposeView abstractComposeView, final androidx.view.Lifecycle lifecycle) {
        if (lifecycle.getCamera2StreamConfigurationMap().compareTo(androidx.lifecycle.Lifecycle.State.DESTROYED) <= 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot configure ");
            sb.append(abstractComposeView);
            sb.append(" to disposeComposition at Lifecycle ON_DESTROY: ");
            sb.append(lifecycle);
            sb.append("is already destroyed");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        final androidx.view.LifecycleEventObserver lifecycleEventObserver = new androidx.view.LifecycleEventObserver() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$$ExternalSyntheticLambda0
            @Override // androidx.view.LifecycleEventObserver
            public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                androidx.compose.ui.platform.ViewCompositionStrategy_androidKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.platform.AbstractComposeView.this, event);
            }
        };
        lifecycle.addObserver(lifecycleEventObserver);
        return new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$2
            public final void getHighSpeedVideoSizes() {
                androidx.view.Lifecycle.this.removeObserver(lifecycleEventObserver);
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoSizes();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.platform.AbstractComposeView abstractComposeView, androidx.lifecycle.Lifecycle.Event event) {
        if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
            abstractComposeView.disposeComposition();
        }
    }
}
