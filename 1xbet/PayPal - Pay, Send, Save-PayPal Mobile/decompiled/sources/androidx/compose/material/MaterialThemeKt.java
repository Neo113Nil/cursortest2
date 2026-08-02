package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"MaterialTheme", "", "colors", "Landroidx/compose/material/Colors;", "typography", "Landroidx/compose/material/Typography;", "shapes", "Landroidx/compose/material/Shapes;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MaterialThemeKt {
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
    
        if ((r48 & 4) != 0) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MaterialTheme(androidx.compose.material.Colors colors, androidx.compose.material.Typography typography, androidx.compose.material.Shapes shapes, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.material.Colors colors2;
        int i3;
        final androidx.compose.material.Typography typography2;
        androidx.compose.material.Shapes shapes2;
        int i4;
        int i5;
        int i6;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(53836214);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                colors2 = colors;
                if (startRestartGroup.changed(colors2)) {
                    i6 = 4;
                    i3 = i6 | i;
                }
            } else {
                colors2 = colors;
            }
            i6 = 2;
            i3 = i6 | i;
        } else {
            colors2 = colors;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                typography2 = typography;
                if (startRestartGroup.changed(typography2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                typography2 = typography;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            typography2 = typography;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                shapes2 = shapes;
                if (startRestartGroup.changed(shapes2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                shapes2 = shapes;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            shapes2 = shapes;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    colors2 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    typography2 = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    shapes2 = androidx.compose.material.MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6);
                    i3 &= -897;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(53836214, i3, -1, "androidx.compose.material.MaterialTheme (MaterialTheme.kt:62)");
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = r14.m2554copypvPzIIM((r43 & 1) != 0 ? r14.m2562getPrimary0d7_KjU() : 0L, (r43 & 2) != 0 ? r14.m2563getPrimaryVariant0d7_KjU() : 0L, (r43 & 4) != 0 ? r14.m2564getSecondary0d7_KjU() : 0L, (r43 & 8) != 0 ? r14.m2565getSecondaryVariant0d7_KjU() : 0L, (r43 & 16) != 0 ? r14.m2555getBackground0d7_KjU() : 0L, (r43 & 32) != 0 ? r14.m2566getSurface0d7_KjU() : 0L, (r43 & 64) != 0 ? r14.m2556getError0d7_KjU() : 0L, (r43 & 128) != 0 ? r14.m2559getOnPrimary0d7_KjU() : 0L, (r43 & 256) != 0 ? r14.m2560getOnSecondary0d7_KjU() : 0L, (r43 & 512) != 0 ? r14.m2557getOnBackground0d7_KjU() : 0L, (r43 & 1024) != 0 ? r14.m2561getOnSurface0d7_KjU() : 0L, (r43 & 2048) != 0 ? r14.m2558getOnError0d7_KjU() : 0L, (r43 & 4096) != 0 ? colors2.isLight() : false);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.material.Colors colors3 = (androidx.compose.material.Colors) rememberedValue;
                androidx.compose.material.ColorsKt.updateColorsFrom(colors3, colors2);
                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ColorsKt.getLocalColors().provides(colors3), androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6))), androidx.compose.foundation.IndicationKt.getLocalIndication().provides(androidx.compose.material.RippleKt.m2713rippleH2RKhps$default(false, 0.0f, 0L, 7, null)), androidx.compose.material.ShapesKt.getLocalShapes().provides(shapes2), androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors().provides(androidx.compose.material.MaterialTextSelectionColorsKt.rememberTextSelectionColors(colors3, startRestartGroup, 0)), androidx.compose.material.TypographyKt.getLocalTypography().provides(typography2)}, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(496803446, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.MaterialThemeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material.MaterialThemeKt.$r8$lambda$xJHanvEWQlNeDFHovdP1lOL6QLA(androidx.compose.material.Typography.this, function2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | 48);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final androidx.compose.material.Shapes shapes3 = shapes2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final androidx.compose.material.Colors colors4 = colors2;
            final androidx.compose.material.Typography typography3 = typography2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.MaterialThemeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.MaterialThemeKt.m2655$r8$lambda$c3c52GvXr7_buwSTsH3AqKNj4(androidx.compose.material.Colors.this, typography3, shapes3, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$c-3-c52GvXr7_buwSTsH3AqKNj4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2655$r8$lambda$c3c52GvXr7_buwSTsH3AqKNj4(androidx.compose.material.Colors colors, androidx.compose.material.Typography typography, androidx.compose.material.Shapes shapes, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MaterialTheme(colors, typography, shapes, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dPWl9x5GEAcLkvsCGizKJFiBvGk(kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(905505767, i, -1, "androidx.compose.material.MaterialTheme.<anonymous>.<anonymous> (MaterialTheme.kt:80)");
            }
            androidx.compose.material.MaterialTheme_androidKt.PlatformMaterialTheme(function2, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xJHanvEWQlNeDFHovdP1lOL6QLA(androidx.compose.material.Typography typography, final kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(496803446, i, -1, "androidx.compose.material.MaterialTheme.<anonymous> (MaterialTheme.kt:80)");
            }
            androidx.compose.material.TextKt.ProvideTextStyle(typography.getBody1(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(905505767, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.MaterialThemeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.MaterialThemeKt.$r8$lambda$dPWl9x5GEAcLkvsCGizKJFiBvGk(kotlin.jvm.functions.Function2.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
