package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\t\u001aC\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a \u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u0017\u0010\u0017\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002"}, d2 = {"Loader", "", "modifier", "Landroidx/compose/ui/Modifier;", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/paypal/pds/components/LoaderSize;", "trackColor", "Lcom/paypal/pds/core/Color;", "progressColor", "(Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/LoaderSize;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Landroidx/compose/runtime/Composer;II)V", "drawLoaderArc", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "trimStart", "", "trimEnd", "strokePx", "isRtl", "", "drawLoaderArc-eopBjH0", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFFFZ)V", "calculateLoaderArcAngles", "Lcom/paypal/pds/components/ArcAngles;", "LoaderPreview", "(Lcom/paypal/pds/components/LoaderSize;Landroidx/compose/runtime/Composer;I)V", "pds_release", androidx.constraintlayout.motion.widget.Key.ROTATION}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoaderKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Loader(androidx.compose.ui.Modifier modifier, com.paypal.pds.components.LoaderSize loaderSize, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        int i4;
        com.paypal.pds.core.Color color3;
        int i5;
        com.paypal.pds.core.Color color4;
        int i6;
        final com.paypal.pds.components.LoaderSize loaderSize2;
        final com.paypal.pds.core.Color color5;
        com.paypal.pds.core.Color color6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-697640190);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(loaderSize) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                color3 = color;
                i3 |= startRestartGroup.changed(color3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    com.paypal.pds.core.Color color7 = color2;
                    i3 |= startRestartGroup.changed(color7) ? 2048 : 1024;
                    color4 = color7;
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((i6 & 1171) == 1170, i6 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        loaderSize2 = loaderSize;
                        color5 = color3;
                        color6 = color4;
                    } else {
                        androidx.compose.ui.Modifier.Companion companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        com.paypal.pds.components.LoaderSize.Large large = i8 != 0 ? com.paypal.pds.components.LoaderSize.Large.INSTANCE : loaderSize;
                        com.paypal.pds.core.Color color8 = i4 != 0 ? com.paypal.pds.core.Color.BorderMuted.INSTANCE : color3;
                        if (i5 != 0) {
                            color4 = com.paypal.pds.core.Color.BorderUtilityEmphasis.INSTANCE;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-697640190, i6, -1, "com.paypal.pds.components.Loader (Loader.kt:80)");
                        }
                        final androidx.compose.animation.core.Easing easingStandardInOut = com.paypal.pds.core.MotionEasingKt.easingStandardInOut(startRestartGroup, 0);
                        androidx.compose.animation.core.InfiniteTransition rememberInfiniteTransition = androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition("loader", startRestartGroup, 6, 0);
                        final int i9 = 3000;
                        com.paypal.pds.core.Color color9 = color4;
                        com.paypal.pds.core.Color color10 = color8;
                        final androidx.compose.runtime.State<java.lang.Float> animateFloat = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 360.0f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(3000, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), androidx.constraintlayout.motion.widget.Key.ROTATION, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 25008 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 0);
                        boolean changed = startRestartGroup.changed(easingStandardInOut);
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        final int i10 = 1500;
                        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            final int i11 = 1200;
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.LoaderKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.pds.components.LoaderKt.$r8$lambda$3nUeq4G0RW2xYbWiSDTVXn9vnZM(i9, easingStandardInOut, i11, i10, (androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final androidx.compose.runtime.State<java.lang.Float> animateFloat2 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.001f, 0.001f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes((kotlin.jvm.functions.Function1) rememberedValue), null, 0L, 6, null), "trimEnd", startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 25008 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 0);
                        boolean changed2 = startRestartGroup.changed(easingStandardInOut);
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            final int i12 = 300;
                            final int i13 = 1500;
                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.LoaderKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.pds.components.LoaderKt.$r8$lambda$m2fsNMOz90jJU66Bi6JhFjSAa1A(i9, i12, easingStandardInOut, i13, (androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        final androidx.compose.runtime.State<java.lang.Float> animateFloat3 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 0.0f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes((kotlin.jvm.functions.Function1) rememberedValue2), null, 0L, 6, null), "trimStart", startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 25008 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 0);
                        final boolean z = startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()) == androidx.compose.ui.unit.LayoutDirection.Rtl;
                        final float borderWidth = large.getBorderWidth();
                        final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.pds.R.string.core_pds_ui_sys_loading, startRestartGroup, 0);
                        final long value = color10.getValue(startRestartGroup, (i6 >> 6) & 14);
                        com.paypal.pds.core.Color color11 = color9;
                        final long value2 = color11.getValue(startRestartGroup, (i6 >> 9) & 14);
                        androidx.compose.ui.Modifier modifier3 = companion;
                        androidx.compose.ui.Modifier m1740size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(companion), large.getSize());
                        boolean changed3 = startRestartGroup.changed(z);
                        boolean changed4 = startRestartGroup.changed(animateFloat);
                        com.paypal.pds.components.LoaderSize loaderSize3 = large;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if ((changed3 | changed4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.LoaderKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.pds.components.LoaderKt.$r8$lambda$Bep0xDRRB_J3MjwuLlUSSqL9tuE(z, animateFloat, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        androidx.compose.ui.Modifier graphicsLayer = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(m1740size3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue3);
                        boolean changed5 = startRestartGroup.changed(stringResource);
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (changed5 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.LoaderKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.pds.components.LoaderKt.$r8$lambda$2gCGaJnrMyYYJwW_gxXViCZ56MU(stringResource, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(graphicsLayer, false, (kotlin.jvm.functions.Function1) rememberedValue4, 1, null);
                        boolean changed6 = startRestartGroup.changed(borderWidth);
                        boolean changed7 = startRestartGroup.changed(value);
                        boolean changed8 = startRestartGroup.changed(value2);
                        boolean changed9 = startRestartGroup.changed(animateFloat3);
                        boolean changed10 = startRestartGroup.changed(animateFloat2);
                        boolean changed11 = startRestartGroup.changed(z);
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if ((changed6 | changed7 | changed8 | changed9 | changed10 | changed11) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            final boolean z2 = z;
                            rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.LoaderKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.pds.components.LoaderKt.m21935$r8$lambda$5Wk31m2dDaqqm3GXEjfnQ85IaM(borderWidth, value, value2, z2, animateFloat3, animateFloat2, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        androidx.compose.foundation.CanvasKt.Canvas(semantics$default, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        loaderSize2 = loaderSize3;
                        color5 = color10;
                        color6 = color11;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier4 = modifier2;
                        final com.paypal.pds.core.Color color12 = color6;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.LoaderKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.pds.components.LoaderKt.$r8$lambda$jyWnipjZz6s1xI3Sx4OrAPiqf9g(androidx.compose.ui.Modifier.this, loaderSize2, color5, color12, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                color4 = color2;
                i6 = i3;
                if (startRestartGroup.shouldExecute((i6 & 1171) == 1170, i6 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            color3 = color;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            color4 = color2;
            i6 = i3;
            if (startRestartGroup.shouldExecute((i6 & 1171) == 1170, i6 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        color3 = color;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        color4 = color2;
        i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 1171) == 1170, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: drawLoaderArc-eopBjH0, reason: not valid java name */
    public static final void m21936drawLoaderArceopBjH0(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, long j2, float f, float f2, float f3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        float m5820getMinDimensionimpl = androidx.compose.ui.geometry.Size.m5820getMinDimensionimpl(drawScope.mo6531getSizeNHjbRc()) - f3;
        float f4 = f3 / 2.0f;
        long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f4) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L));
        long m5812constructorimpl = androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(m5820getMinDimensionimpl) << 32) | (java.lang.Float.floatToRawIntBits(m5820getMinDimensionimpl) & 4294967295L));
        androidx.compose.ui.graphics.drawscope.Stroke stroke = new androidx.compose.ui.graphics.drawscope.Stroke(f3, 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6341getRoundKaPHkGw(), 0, null, 26, null);
        androidx.compose.ui.graphics.drawscope.DrawScope.m6511drawArcyD3GUKo$default(drawScope, j, 0.0f, 360.0f, false, m5744constructorimpl, m5812constructorimpl, 0.0f, stroke, null, 0, 832, null);
        com.paypal.pds.components.ArcAngles calculateLoaderArcAngles = calculateLoaderArcAngles(f, f2, z);
        androidx.compose.ui.graphics.drawscope.DrawScope.m6511drawArcyD3GUKo$default(drawScope, j2, calculateLoaderArcAngles.getStartAngle(), kotlin.ranges.RangesKt.coerceAtLeast(calculateLoaderArcAngles.getSweepAngle(), 1.0f), false, m5744constructorimpl, m5812constructorimpl, 0.0f, stroke, null, 0, 832, null);
    }

    public static final com.paypal.pds.components.ArcAngles calculateLoaderArcAngles(float f, float f2, boolean z) {
        return new com.paypal.pds.components.ArcAngles(((f * 360.0f) * (z ? -1.0f : 1.0f)) - 90.0f, (f2 - f) * 360.0f);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1Q3ygNCiz0mzMUDFgeIlxSocFSA(final com.paypal.pds.components.LoaderSize loaderSize, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-868579353);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changed(loaderSize) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-868579353, i3, -1, "com.paypal.pds.components.LoaderPreview (Loader.kt:347)");
            }
            Loader(null, loaderSize, null, null, startRestartGroup, (i3 << 3) & 112, 13);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.LoaderKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.LoaderKt.$r8$lambda$1Q3ygNCiz0mzMUDFgeIlxSocFSA(com.paypal.pds.components.LoaderSize.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2gCGaJnrMyYYJwW_gxXViCZ56MU(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3nUeq4G0RW2xYbWiSDTVXn9vnZM(int i, androidx.compose.animation.core.Easing easing, int i2, int i3, androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyframesSpecConfig, "");
        keyframesSpecConfig.setDurationMillis(i);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.001f);
        keyframesSpecConfig.using(keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf, 0), easing);
        java.lang.Float valueOf2 = java.lang.Float.valueOf(1.0f);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf2, i2);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf2, i3 - 1);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf, i3);
        keyframesSpecConfig.using(keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf, i3), easing);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf2, i3 + i2);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf2, i - 1);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf, i);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5Wk31m2dDaq-qm3GXEjfnQ85IaM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21935$r8$lambda$5Wk31m2dDaqqm3GXEjfnQ85IaM(float f, long j, long j2, boolean z, androidx.compose.runtime.State state, androidx.compose.runtime.State state2, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        m21936drawLoaderArceopBjH0(drawScope, j, j2, ((java.lang.Number) state.getValue()).floatValue(), ((java.lang.Number) state2.getValue()).floatValue(), drawScope.mo1418toPx0680j_4(f), z);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Bep0xDRRB_J3MjwuLlUSSqL9tuE(boolean z, androidx.compose.runtime.State state, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setRotationZ(z ? -((java.lang.Number) state.getValue()).floatValue() : ((java.lang.Number) state.getValue()).floatValue());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jyWnipjZz6s1xI3Sx4OrAPiqf9g(androidx.compose.ui.Modifier modifier, com.paypal.pds.components.LoaderSize loaderSize, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Loader(modifier, loaderSize, color, color2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m2fsNMOz90jJU66Bi6JhFjSAa1A(int i, int i2, androidx.compose.animation.core.Easing easing, int i3, androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyframesSpecConfig, "");
        keyframesSpecConfig.setDurationMillis(i);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf, 0);
        keyframesSpecConfig.using(keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf, i2), easing);
        java.lang.Float valueOf2 = java.lang.Float.valueOf(0.999f);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf2, i3 - 1);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf, i3);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf, i3);
        keyframesSpecConfig.using(keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf, i3 + i2), easing);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf2, i - 1);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf, i);
        return kotlin.Unit.INSTANCE;
    }
}
