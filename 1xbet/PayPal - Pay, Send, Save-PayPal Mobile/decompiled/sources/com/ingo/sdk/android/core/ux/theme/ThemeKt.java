package com.ingo.sdk.android.core.ux.theme;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a2\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00042\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"DarkColorPalette", "Landroidx/compose/material3/ColorScheme;", "LightColorPalette", "isNightMode", "", "appCompatDelegate", "Landroidx/appcompat/app/AppCompatDelegate;", "(Landroidx/appcompat/app/AppCompatDelegate;Landroidx/compose/runtime/Composer;I)Z", "IngoSdkMaterialTheme", "", "darkTheme", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/appcompat/app/AppCompatDelegate;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "systemTheme", "Lcom/ingo/sdk/kotlin/ux/IngoSdkColorTheme;", "Lcom/ingo/sdk/kotlin/ux/IngoSdkTheme;", "(Lcom/ingo/sdk/kotlin/ux/IngoSdkTheme;Landroidx/appcompat/app/AppCompatDelegate;Landroidx/compose/runtime/Composer;I)Lcom/ingo/sdk/kotlin/ux/IngoSdkColorTheme;", "androidCoreUx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ThemeKt {
    private static final androidx.compose.material3.ColorScheme getHighSpeedVideoSizes = androidx.compose.material3.ColorSchemeKt.m3091darkColorSchemeCXl9yA$default(com.ingo.sdk.android.core.ux.theme.ColorKt.getColorPrimary(), 0, 0, 0, com.ingo.sdk.android.core.ux.theme.ColorKt.getColorPrimaryDark(), com.ingo.sdk.android.core.ux.theme.ColorKt.getColorAccent(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -50, 15, null);
    private static final androidx.compose.material3.ColorScheme getHighResolutionOutputSizeshNQ4ISI = androidx.compose.material3.ColorSchemeKt.m3097lightColorSchemeCXl9yA$default(com.ingo.sdk.android.core.ux.theme.ColorKt.getColorPrimary(), 0, 0, 0, com.ingo.sdk.android.core.ux.theme.ColorKt.getColorPrimaryDark(), com.ingo.sdk.android.core.ux.theme.ColorKt.getColorAccent(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -50, 15, null);

    public static final boolean isNightMode(androidx.appcompat.app.AppCompatDelegate appCompatDelegate, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCompatDelegate, "");
        composer.startReplaceGroup(-311923196);
        int localNightMode = appCompatDelegate.getLocalNightMode();
        boolean z = false;
        if (localNightMode != 1) {
            z = localNightMode != 2 ? androidx.compose.foundation.DarkThemeKt.isSystemInDarkTheme(composer, 0) : true;
        }
        composer.endReplaceGroup();
        return z;
    }

    public static final void IngoSdkMaterialTheme(final androidx.appcompat.app.AppCompatDelegate appCompatDelegate, boolean z, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final boolean z2;
        int i3;
        androidx.compose.material3.ColorScheme m3097lightColorSchemeCXl9yA$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCompatDelegate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1866526505);
        if ((i2 & 2) != 0) {
            i3 = i & (-113);
            z2 = isNightMode(appCompatDelegate, startRestartGroup, 8);
        } else {
            z2 = z;
            i3 = i;
        }
        if (z2) {
            long colorPrimary = com.ingo.sdk.android.core.ux.theme.ColorKt.getColorPrimary();
            long colorPrimaryDark = com.ingo.sdk.android.core.ux.theme.ColorKt.getColorPrimaryDark();
            long colorAccent = com.ingo.sdk.android.core.ux.theme.ColorKt.getColorAccent();
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoSdkTheme.class));
            if (obj != null) {
                long Color = androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(((com.ingo.sdk.kotlin.ux.IngoSdkTheme) obj).getDark().getBackgroundColor()));
                java.lang.Object obj2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoSdkTheme.class));
                if (obj2 != null) {
                    m3097lightColorSchemeCXl9yA$default = androidx.compose.material3.ColorSchemeKt.m3091darkColorSchemeCXl9yA$default(colorPrimary, 0L, 0L, 0L, colorPrimaryDark, colorAccent, 0L, 0L, 0L, 0L, 0L, 0L, 0L, Color, 0L, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(((com.ingo.sdk.kotlin.ux.IngoSdkTheme) obj2).getDark().getBackgroundColor())), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -41010, 15, null);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoSdkTheme");
                }
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoSdkTheme");
            }
        } else {
            long colorPrimary2 = com.ingo.sdk.android.core.ux.theme.ColorKt.getColorPrimary();
            long colorPrimaryDark2 = com.ingo.sdk.android.core.ux.theme.ColorKt.getColorPrimaryDark();
            long colorAccent2 = com.ingo.sdk.android.core.ux.theme.ColorKt.getColorAccent();
            java.lang.Object obj3 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoSdkTheme.class));
            if (obj3 != null) {
                long Color2 = androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(((com.ingo.sdk.kotlin.ux.IngoSdkTheme) obj3).getLight().getBackgroundColor()));
                java.lang.Object obj4 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoSdkTheme.class));
                if (obj4 != null) {
                    m3097lightColorSchemeCXl9yA$default = androidx.compose.material3.ColorSchemeKt.m3097lightColorSchemeCXl9yA$default(colorPrimary2, 0L, 0L, 0L, colorPrimaryDark2, colorAccent2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, Color2, 0L, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(((com.ingo.sdk.kotlin.ux.IngoSdkTheme) obj4).getLight().getBackgroundColor())), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -41010, 15, null);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoSdkTheme");
                }
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoSdkTheme");
            }
        }
        final android.view.View view = (android.view.View) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
        startRestartGroup.startReplaceGroup(1564391947);
        if (!view.isInEditMode()) {
            androidx.compose.runtime.EffectsKt.SideEffect(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.core.ux.theme.ThemeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.core.ux.theme.ThemeKt.$r8$lambda$KJXFzpMu2WOxVr8cBp3FCn01sMs(view, z2);
                }
            }, startRestartGroup, 0);
        }
        startRestartGroup.endReplaceGroup();
        androidx.compose.material3.MaterialThemeKt.MaterialTheme(m3097lightColorSchemeCXl9yA$default, com.ingo.sdk.android.core.ux.theme.ShapeKt.getShapes(), com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography(), function2, startRestartGroup, ((i3 << 3) & 7168) | 48, 0);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final boolean z3 = z2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.core.ux.theme.ThemeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                    return com.ingo.sdk.android.core.ux.theme.ThemeKt.$r8$lambda$A_MbgNAXV3_vC1lS0qrmMLBhzd8(androidx.appcompat.app.AppCompatDelegate.this, z3, function2, i, i2, (androidx.compose.runtime.Composer) obj5, ((java.lang.Integer) obj6).intValue());
                }
            });
        }
    }

    public static final com.ingo.sdk.kotlin.ux.IngoSdkColorTheme systemTheme(com.ingo.sdk.kotlin.ux.IngoSdkTheme ingoSdkTheme, androidx.appcompat.app.AppCompatDelegate appCompatDelegate, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoSdkTheme, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCompatDelegate, "");
        composer.startReplaceGroup(-921472250);
        com.ingo.sdk.kotlin.ux.IngoSdkColorTheme dark = isNightMode(appCompatDelegate, composer, 8) ? ingoSdkTheme.getDark() : ingoSdkTheme.getLight();
        composer.endReplaceGroup();
        return dark;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$A_MbgNAXV3_vC1lS0qrmMLBhzd8(androidx.appcompat.app.AppCompatDelegate appCompatDelegate, boolean z, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        IngoSdkMaterialTheme(appCompatDelegate, z, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KJXFzpMu2WOxVr8cBp3FCn01sMs(android.view.View view, boolean z) {
        android.content.Context context = view.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        android.view.Window window = activity != null ? activity.getWindow() : null;
        if (window != null) {
            window.setStatusBarColor(androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU()));
            androidx.core.view.WindowCompat.getInsetsController(window, view).setAppearanceLightStatusBars(!z);
        }
        return kotlin.Unit.INSTANCE;
    }
}
