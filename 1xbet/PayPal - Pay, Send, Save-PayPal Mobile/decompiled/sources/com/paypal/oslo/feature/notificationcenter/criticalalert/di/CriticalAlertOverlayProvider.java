package com.paypal.oslo.feature.notificationcenter.criticalalert.di;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u001f\u0010\n\u001a\u001b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/criticalalert/di/CriticalAlertOverlayProvider;", "Lcom/paypal/oslo/core/navigation/ui/NavigationOverlayProvider;", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/ui/NavigationOverlayScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "onTabNavigated", "", "onVisibilityChanged", "Landroidx/compose/ui/Modifier;", "modifier", "Overlay", "(Lcom/paypal/oslo/core/navigation/ui/NavigationOverlayScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "reservedHeight", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getReservedHeight-D9Ej5fM", "()F", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CriticalAlertOverlayProvider implements com.paypal.oslo.core.navigation.ui.NavigationOverlayProvider {
    public static final int $stable = 0;
    private final float reservedHeight = Camera2StreamConfigurationMap;
    private static final com.paypal.oslo.feature.notificationcenter.criticalalert.di.CriticalAlertOverlayProvider.Companion Companion = new com.paypal.oslo.feature.notificationcenter.criticalalert.di.CriticalAlertOverlayProvider.Companion(null);
    private static final float Camera2StreamConfigurationMap = androidx.compose.ui.unit.Dp.m8601constructorimpl(100.0f);

    @javax.inject.Inject
    public CriticalAlertOverlayProvider() {
    }

    @Override // com.paypal.oslo.core.navigation.ui.NavigationOverlayProvider
    /* renamed from: getReservedHeight-D9Ej5fM, reason: from getter */
    public final float getReservedHeight() {
        return this.reservedHeight;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/criticalalert/di/CriticalAlertOverlayProvider$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "Camera2StreamConfigurationMap", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.core.navigation.ui.NavigationOverlayProvider
    public final void Overlay(final com.paypal.oslo.core.navigation.ui.NavigationOverlayScope navigationOverlayScope, final kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function12, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationOverlayScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1812522232);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(navigationOverlayScope) : startRestartGroup.changedInstance(navigationOverlayScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1812522232, i2, -1, "com.paypal.oslo.feature.notificationcenter.criticalalert.di.CriticalAlertOverlayProvider.Overlay (CriticalAlertOverlayProvider.kt:52)");
            }
            int i3 = i2 << 6;
            com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertContainerKt.CriticalAlertContainer(navigationOverlayScope.isL1Visible(), navigationOverlayScope.getOnNavigate(), modifier, function1, function12, startRestartGroup, ((i2 >> 3) & 896) | (i3 & 7168) | (i3 & 57344), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.notificationcenter.criticalalert.di.CriticalAlertOverlayProvider$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.notificationcenter.criticalalert.di.CriticalAlertOverlayProvider.$r8$lambda$3vA6hHSdvVBwknq68mSR1olmgHk(com.paypal.oslo.feature.notificationcenter.criticalalert.di.CriticalAlertOverlayProvider.this, navigationOverlayScope, function1, function12, modifier, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3vA6hHSdvVBwknq68mSR1olmgHk(com.paypal.oslo.feature.notificationcenter.criticalalert.di.CriticalAlertOverlayProvider criticalAlertOverlayProvider, com.paypal.oslo.core.navigation.ui.NavigationOverlayScope navigationOverlayScope, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, int i, androidx.compose.runtime.Composer composer, int i2) {
        criticalAlertOverlayProvider.Overlay(navigationOverlayScope, function1, function12, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
