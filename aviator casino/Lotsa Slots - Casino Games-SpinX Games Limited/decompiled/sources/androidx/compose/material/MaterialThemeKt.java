package androidx.compose.material;

/* compiled from: MaterialTheme.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"MaterialTheme", "", "colors", "Landroidx/compose/material/Colors;", "typography", "Landroidx/compose/material/Typography;", "shapes", "Landroidx/compose/material/Shapes;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MaterialThemeKt {
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        if ((r49 & 4) != 0) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MaterialTheme(androidx.compose.material.Colors colors, androidx.compose.material.Typography typography, androidx.compose.material.Shapes shapes, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.compose.material.Colors colors2;
        int i3;
        androidx.compose.material.Typography typography2;
        androidx.compose.material.Shapes shapes2;
        final androidx.compose.material.Shapes shapes3;
        final androidx.compose.material.Typography typography3;
        int i4;
        int i5;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-891417079);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(MaterialTheme)P(!1,3,2)59@2947L6,60@2998L10,61@3045L6,*64@3120L184,69@3367L16,70@3410L45,73@3581L4,71@3460L492:MaterialTheme.kt#jmzs0o");
        if ((i & 14) == 0) {
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
        if ((i & 112) == 0) {
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
        if ((i & 896) == 0) {
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
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(content) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            } else {
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
                final int i7 = i3;
                final androidx.compose.material.Typography typography4 = typography2;
                androidx.compose.material.Shapes shapes4 = shapes2;
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = r14.m1307copypvPzIIM((r43 & 1) != 0 ? r14.m1315getPrimary0d7_KjU() : 0L, (r43 & 2) != 0 ? r14.m1316getPrimaryVariant0d7_KjU() : 0L, (r43 & 4) != 0 ? r14.m1317getSecondary0d7_KjU() : 0L, (r43 & 8) != 0 ? r14.m1318getSecondaryVariant0d7_KjU() : 0L, (r43 & 16) != 0 ? r14.m1308getBackground0d7_KjU() : 0L, (r43 & 32) != 0 ? r14.m1319getSurface0d7_KjU() : 0L, (r43 & 64) != 0 ? r14.m1309getError0d7_KjU() : 0L, (r43 & 128) != 0 ? r14.m1312getOnPrimary0d7_KjU() : 0L, (r43 & 256) != 0 ? r14.m1313getOnSecondary0d7_KjU() : 0L, (r43 & 512) != 0 ? r14.m1310getOnBackground0d7_KjU() : 0L, (r43 & 1024) != 0 ? r14.m1314getOnSurface0d7_KjU() : 0L, (r43 & 2048) != 0 ? r14.m1311getOnError0d7_KjU() : 0L, (r43 & 4096) != 0 ? colors2.isLight() : false);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.material.Colors colors3 = (androidx.compose.material.Colors) rememberedValue;
                androidx.compose.material.ColorsKt.updateColorsFrom(colors3, colors2);
                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ColorsKt.getLocalColors().provides(colors3), androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6))), androidx.compose.foundation.IndicationKt.getLocalIndication().provides(androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, 0L, startRestartGroup, 0, 7)), androidx.compose.material.ripple.RippleThemeKt.getLocalRippleTheme().provides(androidx.compose.material.MaterialRippleTheme.INSTANCE), androidx.compose.material.ShapesKt.getLocalShapes().provides(shapes4), androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors().provides(androidx.compose.material.MaterialTextSelectionColorsKt.rememberTextSelectionColors(colors3, startRestartGroup, 0)), androidx.compose.material.TypographyKt.getLocalTypography().provides(typography4)}, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1740102967, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        invoke(composer2, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.runtime.Composer composer2, int i8) {
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C80@3849L97:MaterialTheme.kt#jmzs0o");
                        if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                            androidx.compose.ui.text.TextStyle body1 = androidx.compose.material.Typography.this.getBody1();
                            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = content;
                            final int i9 = i7;
                            androidx.compose.material.TextKt.ProvideTextStyle(body1, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 181426554, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                    invoke(composer3, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer3, int i10) {
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C81@3906L30:MaterialTheme.kt#jmzs0o");
                                    if ((i10 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        androidx.compose.material.MaterialTheme_androidKt.PlatformMaterialTheme(function2, composer3, (i9 >> 9) & 14);
                                    }
                                }
                            }), composer2, 48);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, 56);
                shapes3 = shapes4;
                typography3 = typography4;
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            typography3 = typography2;
            shapes3 = shapes2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i8) {
                androidx.compose.material.MaterialThemeKt.MaterialTheme(androidx.compose.material.Colors.this, typography3, shapes3, content, composer2, i | 1, i2);
            }
        });
    }
}
