package com.paypal.oslo.feature.inappcheckout.ui.common;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\u001a5\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, d2 = {"InAppCheckoutLoader", "", "modifier", "Landroidx/compose/ui/Modifier;", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize;", "trackColor", "", "progressColor", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize;IILandroidx/compose/runtime/Composer;II)V", "inappcheckout_prodRelease", androidx.constraintlayout.motion.widget.Key.ROTATION, ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InAppCheckoutLoaderKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InAppCheckoutLoader(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize loaderSize, int i, int i2, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        androidx.compose.ui.Modifier modifier2;
        int i5;
        com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize loaderSize2;
        int i6;
        int i7;
        int i8;
        androidx.compose.ui.Modifier.Companion companion;
        com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize.Large large;
        final int i9;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i10;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-377108773);
        int i11 = i4 & 1;
        if (i11 != 0) {
            i5 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 6) == 0) {
            modifier2 = modifier;
            i5 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i5 = i3;
        }
        int i12 = i4 & 2;
        if (i12 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            loaderSize2 = loaderSize;
            i5 |= startRestartGroup.changed(loaderSize2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                i7 = i;
                i5 |= startRestartGroup.changed(i7) ? 256 : 128;
                if ((i3 & 3072) == 0) {
                    if ((i4 & 8) == 0) {
                        i8 = i2;
                        if (startRestartGroup.changed(i8)) {
                            i10 = 2048;
                            i5 |= i10;
                        }
                    } else {
                        i8 = i2;
                    }
                    i10 = 1024;
                    i5 |= i10;
                } else {
                    i8 = i2;
                }
                if (startRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i4 & 8) != 0) {
                            i5 &= -7169;
                        }
                        companion = modifier2;
                        large = loaderSize2;
                    } else {
                        companion = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        large = i12 != 0 ? com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize.Large.INSTANCE : loaderSize2;
                        if (i6 != 0) {
                            i7 = 17170445;
                        }
                        if ((i4 & 8) != 0) {
                            i5 &= -7169;
                            i8 = com.paypal.oslo.feature.inappcheckout.R.color.feature_inappcheckout_primary_blue;
                        }
                    }
                    int i13 = i7;
                    int i14 = i8;
                    int i15 = i5;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-377108773, i15, -1, "com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutLoader (InAppCheckoutLoader.kt:62)");
                    }
                    i9 = i13;
                    final androidx.compose.runtime.State<java.lang.Float> animateFloat = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition(androidx.constraintlayout.motion.widget.Key.ROTATION, startRestartGroup, 6, 0), 0.0f, 360.0f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(1000, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), androidx.constraintlayout.motion.widget.Key.ROTATION, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 25008 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 0);
                    android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    final boolean z = startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()) == androidx.compose.ui.unit.LayoutDirection.Rtl;
                    final float borderWidth = large.getBorderWidth();
                    final java.lang.String rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.pds.R.string.core_pds_ui_sys_loading, new java.lang.Object[0], startRestartGroup, 0);
                    final long rememberColorValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberColorValue(context, i9, startRestartGroup, (i15 >> 3) & 112);
                    final long rememberColorValue2 = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberColorValue(context, i14, startRestartGroup, (i15 >> 6) & 112);
                    androidx.compose.ui.Modifier m1740size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(companion, large.getSize());
                    boolean changed = startRestartGroup.changed(z);
                    boolean changed2 = startRestartGroup.changed(animateFloat);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutLoaderKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutLoaderKt.$r8$lambda$BVhqxWQMy7LMCD9oKWYACuzQWe0(z, animateFloat, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.ui.Modifier graphicsLayer = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(m1740size3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue);
                    boolean changed3 = startRestartGroup.changed(rememberStringValue);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutLoaderKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutLoaderKt.$r8$lambda$XcTc6a670_DJKV6sBCI6ArVv3pg(rememberStringValue, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(graphicsLayer, false, (kotlin.jvm.functions.Function1) rememberedValue2, 1, null);
                    boolean changed4 = startRestartGroup.changed(borderWidth);
                    boolean changed5 = startRestartGroup.changed(rememberColorValue);
                    boolean changed6 = startRestartGroup.changed(rememberColorValue2);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((changed4 | changed5 | changed6) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutLoaderKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutLoaderKt.m15504$r8$lambda$0YIwmlSq0eKNHf8xhKdKAqXY3k(borderWidth, rememberColorValue, rememberColorValue2, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    androidx.compose.foundation.CanvasKt.Canvas(semantics$default, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    i8 = i14;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    large = loaderSize2;
                    i9 = i7;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = companion;
                    final com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize loaderSize3 = large;
                    final int i16 = i8;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutLoaderKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutLoaderKt.$r8$lambda$MuJdN5lJEQtPvVv9ohBHdzyAQVo(androidx.compose.ui.Modifier.this, loaderSize3, i9, i16, i3, i4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i7 = i;
            if ((i3 & 3072) == 0) {
            }
            if (startRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        loaderSize2 = loaderSize;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i;
        if ((i3 & 3072) == 0) {
        }
        if (startRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$0YIwmlSq0eKNHf8xhKdKAq-XY3k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15504$r8$lambda$0YIwmlSq0eKNHf8xhKdKAqXY3k(float f, long j, long j2, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        float f2 = drawScope.mo1418toPx0680j_4(f);
        float m5820getMinDimensionimpl = androidx.compose.ui.geometry.Size.m5820getMinDimensionimpl(drawScope.mo6531getSizeNHjbRc()) - f2;
        float f3 = f2 / 2.0f;
        long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f3) << 32) | (java.lang.Float.floatToRawIntBits(f3) & 4294967295L));
        long m5812constructorimpl = androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(m5820getMinDimensionimpl) << 32) | (java.lang.Float.floatToRawIntBits(m5820getMinDimensionimpl) & 4294967295L));
        androidx.compose.ui.graphics.drawscope.Stroke stroke = new androidx.compose.ui.graphics.drawscope.Stroke(f2, 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6341getRoundKaPHkGw(), 0, null, 26, null);
        androidx.compose.ui.graphics.drawscope.DrawScope.m6511drawArcyD3GUKo$default(drawScope, j, -90.0f, 126.000015f, false, m5744constructorimpl, m5812constructorimpl, 0.0f, stroke, null, 0, 832, null);
        androidx.compose.ui.graphics.drawscope.DrawScope.m6511drawArcyD3GUKo$default(drawScope, j2, 36.000015f, 233.99998f, false, m5744constructorimpl, m5812constructorimpl, 0.0f, stroke, null, 0, 832, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BVhqxWQMy7LMCD9oKWYACuzQWe0(boolean z, androidx.compose.runtime.State state, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setRotationZ(z ? -((java.lang.Number) state.getValue()).floatValue() : ((java.lang.Number) state.getValue()).floatValue());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MuJdN5lJEQtPvVv9ohBHdzyAQVo(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize loaderSize, int i, int i2, int i3, int i4, androidx.compose.runtime.Composer composer, int i5) {
        InAppCheckoutLoader(modifier, loaderSize, i, i2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XcTc6a670_DJKV6sBCI6ArVv3pg(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }
}
