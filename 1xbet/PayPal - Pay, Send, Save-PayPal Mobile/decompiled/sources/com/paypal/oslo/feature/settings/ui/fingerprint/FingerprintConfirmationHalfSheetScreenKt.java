package com.paypal.oslo.feature.settings.ui.fingerprint;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"FingerprintConfirmationHalfSheetScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "settings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FingerprintConfirmationHalfSheetScreenKt {
    public static final void FingerprintConfirmationHalfSheetScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(215682439);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(215682439, i3, -1, "com.paypal.oslo.feature.settings.ui.fingerprint.FingerprintConfirmationHalfSheetScreen (FingerprintConfirmationHalfSheetScreen.kt:36)");
            }
            com.paypal.oslo.feature.settings.ui.model.HalfSheetData fingerprintConfirmation = com.paypal.oslo.feature.settings.ui.model.HalfSheetDefaults.INSTANCE.fingerprintConfirmation(startRestartGroup, 6);
            int i5 = i3 & 14;
            boolean z = i5 == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.ui.fingerprint.FingerprintConfirmationHalfSheetScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.settings.ui.fingerprint.FingerprintConfirmationHalfSheetScreenKt.$r8$lambda$U5f9hBayEHHt3EWzD0V0LqievUU(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean z2 = i5 == 4;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.ui.fingerprint.FingerprintConfirmationHalfSheetScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.settings.ui.fingerprint.FingerprintConfirmationHalfSheetScreenKt.m19295$r8$lambda$PhylYGoJ_HsZ3NXUQGJe6DERGo(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.settings.ui.components.GenericHalfSheetKt.GenericHalfSheetContent(fingerprintConfirmation, function0, (kotlin.jvm.functions.Function0) rememberedValue2, modifier, startRestartGroup, (i3 << 6) & 7168, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.ui.fingerprint.FingerprintConfirmationHalfSheetScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.ui.fingerprint.FingerprintConfirmationHalfSheetScreenKt.$r8$lambda$LU4m8fOR2M2344YVdFcr6Cfxm4M(com.paypal.oslo.core.navigation.AppNavigator.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$3I-QhmsiqkUokx5qqarfBqygxLM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19294$r8$lambda$3IQhmsiqkUokx5qqarfBqygxLM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.settings.navigation.result.FingerprintConfirmationNavResult(false));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LU4m8fOR2M2344YVdFcr6Cfxm4M(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FingerprintConfirmationHalfSheetScreen(appNavigator, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PhylYGoJ_H-sZ3NXUQGJe6DERGo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19295$r8$lambda$PhylYGoJ_HsZ3NXUQGJe6DERGo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.ui.fingerprint.FingerprintConfirmationHalfSheetScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.settings.ui.fingerprint.FingerprintConfirmationHalfSheetScreenKt.$r8$lambda$ZPXWEqHdQLl2EMRkyl2V1yAZwWY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$U5f9hBayEHHt3EWzD0V0LqievUU(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.ui.fingerprint.FingerprintConfirmationHalfSheetScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.settings.ui.fingerprint.FingerprintConfirmationHalfSheetScreenKt.m19294$r8$lambda$3IQhmsiqkUokx5qqarfBqygxLM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZPXWEqHdQLl2EMRkyl2V1yAZwWY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.settings.navigation.result.FingerprintConfirmationNavResult(true));
        return kotlin.Unit.INSTANCE;
    }
}
