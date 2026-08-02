package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010\"\u0014\u0010\f\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Landroidx/compose/ui/Modifier;", "imeNestedScroll", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "side", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "rememberWindowInsetsConnection-VRgvIgI", "(Landroidx/compose/foundation/layout/AndroidWindowInsets;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "rememberWindowInsetsConnection", "", "Camera2StreamConfigurationMap", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighResolutionOutputSizeshNQ4ISI", "", "D", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WindowInsetsConnection_androidKt {
    private static final float Camera2StreamConfigurationMap = android.view.ViewConfiguration.getScrollFriction();
    private static final double getHighResolutionOutputSizeshNQ4ISI;
    private static final double getHighSpeedVideoFpsRangesFor;

    public static final androidx.compose.ui.Modifier imeNestedScroll(androidx.compose.ui.Modifier modifier) {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return modifier;
        }
        return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$imeNestedScroll$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("imeNestedScroll");
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                androidx.compose.ui.Modifier highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.getHighSpeedVideoFpsRangesFor((androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                return highSpeedVideoFpsRangesFor;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier getHighSpeedVideoFpsRangesFor(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-369978792);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-369978792, i, -1, "androidx.compose.foundation.layout.imeNestedScroll.<anonymous> (WindowInsetsConnection.android.kt:76)");
        }
        androidx.compose.ui.Modifier nestedScroll$default = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(modifier, m1749rememberWindowInsetsConnectionVRgvIgI(androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getIme(), androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1771getBottomJoeWqyM(), composer, 48), null, 2, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return nestedScroll$default;
    }

    /* renamed from: rememberWindowInsetsConnection-VRgvIgI, reason: not valid java name */
    public static final androidx.compose.ui.input.nestedscroll.NestedScrollConnection m1749rememberWindowInsetsConnectionVRgvIgI(androidx.compose.foundation.layout.AndroidWindowInsets androidWindowInsets, int i, androidx.compose.runtime.Composer composer, int i2) {
        composer.startReplaceGroup(-1011341039);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1011341039, i2, -1, "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:105)");
        }
        if (android.os.Build.VERSION.SDK_INT < 30) {
            androidx.compose.foundation.layout.DoNothingNestedScrollConnection doNothingNestedScrollConnection = androidx.compose.foundation.layout.DoNothingNestedScrollConnection.INSTANCE;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return doNothingNestedScrollConnection;
        }
        androidx.compose.foundation.layout.SideCalculator m1723chooseCalculatorni1skBw = androidx.compose.foundation.layout.SideCalculator.INSTANCE.m1723chooseCalculatorni1skBw(i, (androidx.compose.ui.unit.LayoutDirection) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()));
        android.view.View view = (android.view.View) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        boolean z = (((i2 & 14) ^ 6) > 4 && composer.changed(androidWindowInsets)) || (i2 & 6) == 4;
        boolean changed = composer.changed(view);
        boolean changed2 = composer.changed(m1723chooseCalculatorni1skBw);
        boolean changed3 = composer.changed(density);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z | changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection(androidWindowInsets, view, m1723chooseCalculatorni1skBw, density);
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection) rememberedValue;
        boolean changedInstance = composer.changedInstance(windowInsetsNestedScrollConnection);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.runtime.DisposableEffectResult highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.this);
                    return highSpeedVideoFpsRangesFor;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.DisposableEffect(windowInsetsNestedScrollConnection, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return windowInsetsNestedScrollConnection;
    }

    static {
        double log = java.lang.Math.log(0.78d) / java.lang.Math.log(0.9d);
        getHighResolutionOutputSizeshNQ4ISI = log;
        getHighSpeedVideoFpsRangesFor = log - 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.DisposableEffectResult getHighSpeedVideoFpsRangesFor(final androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection) {
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection_VRgvIgI$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.this.Camera2StreamConfigurationMap();
            }
        };
    }
}
