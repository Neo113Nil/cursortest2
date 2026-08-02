package com.paypal.oslo.feature.wallet.me.ui;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\f\u0010\t\u001a\u0004\u0018\u00010\u0004X\u008a\u0084\u0002"}, d2 = {"NotificationOverlay", "", "notifications", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/me/ui/AccountsViewModel$UiState$Notification;", "onDismiss", "Lkotlin/Function0;", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease", "notification"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class NotificationOverlayKt {
    public static final void NotificationOverlay(final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState.Notification> stateFlow, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(766740471);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(stateFlow) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(766740471, i2, -1, "com.paypal.oslo.feature.wallet.me.ui.NotificationOverlay (NotificationOverlay.kt:35)");
            }
            final com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState.Notification notification = (com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState.Notification) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(stateFlow, (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, i2 & 14, 7).getValue();
            if (notification == null) {
                startRestartGroup.startReplaceGroup(1329531963);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1329531964);
                androidx.compose.ui.window.AndroidPopup_androidKt.Popup(new androidx.compose.ui.window.PopupPositionProvider() { // from class: com.paypal.oslo.feature.wallet.me.ui.NotificationOverlayKt$NotificationOverlay$1$1
                    @Override // androidx.compose.ui.window.PopupPositionProvider
                    /* renamed from: calculatePosition-llwVHH4 */
                    public final long mo1386calculatePositionllwVHH4(androidx.compose.ui.unit.IntRect anchorBounds, long windowSize, androidx.compose.ui.unit.LayoutDirection layoutDirection, long popupContentSize) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(anchorBounds, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutDirection, "");
                        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl(((((int) (windowSize >> 32)) - ((int) (popupContentSize >> 32))) / 2) << 32);
                    }
                }, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-172285771, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.NotificationOverlayKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.me.ui.NotificationOverlayKt.$r8$lambda$NuJwRGJ1DxzMm3YdDqWWU_19aE8(com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState.Notification.this, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 3072, 6);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.NotificationOverlayKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.me.ui.NotificationOverlayKt.m21417$r8$lambda$pXQOTKQXUmmGghy61Z7OHoHLg(kotlinx.coroutines.flow.StateFlow.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NuJwRGJ1DxzMm3YdDqWWU_19aE8(com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState.Notification notification, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-172285771, i, -1, "com.paypal.oslo.feature.wallet.me.ui.NotificationOverlay.<anonymous>.<anonymous> (NotificationOverlay.kt:52)");
            }
            com.paypal.oslo.feature.wallet.me.ui.SuccessToastKt.SuccessToast(com.paypal.oslo.core.commonui.utils.RefTextKt.value(notification.getMessage(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable), function0, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.ui.Modifier.INSTANCE), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.oslo.feature.wallet.me.ui.AccountsScreenKt.TestTagPaymentPreferenceUpdatedToast), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pXQOTKQ-XUmmGghy6-1Z7OHoHLg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21417$r8$lambda$pXQOTKQXUmmGghy61Z7OHoHLg(kotlinx.coroutines.flow.StateFlow stateFlow, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        NotificationOverlay(stateFlow, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
