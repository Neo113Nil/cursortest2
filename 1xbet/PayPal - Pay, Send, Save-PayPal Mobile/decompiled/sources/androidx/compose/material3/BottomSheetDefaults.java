package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u000f2\b\b\u0002\u0010&\u001a\u00020\u000f2\b\b\u0002\u0010'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\u000bH\u0007¢\u0006\u0004\b)\u0010*R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u00020\u000f¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\rR\u0013\u0010\u0015\u001a\u00020\u000f¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\u0017\u001a\u00020\u000f¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u0019\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u000fX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001e\u0010\u0011R\u0016\u0010\u001f\u001a\u00020\u000fX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b \u0010\u0011¨\u0006+"}, d2 = {"Landroidx/compose/material3/BottomSheetDefaults;", "", "<init>", "()V", "HiddenShape", "Landroidx/compose/ui/graphics/Shape;", "getHiddenShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "ExpandedShape", "getExpandedShape", "ContainerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "ScrimColor", "getScrimColor", "SheetPeekHeight", "getSheetPeekHeight-D9Ej5fM", "SheetMaxWidth", "getSheetMaxWidth-D9Ej5fM", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "PositionalThreshold", "getPositionalThreshold-D9Ej5fM$material3", "VelocityThreshold", "getVelocityThreshold-D9Ej5fM$material3", "DragHandle", "", "modifier", "Landroidx/compose/ui/Modifier;", "width", "height", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "DragHandle-lgZ2HuY", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;JLandroidx/compose/runtime/Composer;II)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.BottomSheetDefaults INSTANCE = new androidx.compose.material3.BottomSheetDefaults();
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.material3.tokens.SheetBottomTokens.INSTANCE.m5009getDockedModalContainerElevationD9Ej5fM();
    private static final float Camera2StreamConfigurationMap = androidx.compose.ui.unit.Dp.m8601constructorimpl(56.0f);
    private static final float getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.Dp.m8601constructorimpl(640.0f);
    private static final float getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8601constructorimpl(56.0f);
    private static final float getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.Dp.m8601constructorimpl(125.0f);

    private BottomSheetDefaults() {
    }

    public final androidx.compose.ui.graphics.Shape getHiddenShape(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1971658024, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-HiddenShape> (SheetDefaults.kt:375)");
        }
        androidx.compose.ui.graphics.Shape value = androidx.compose.material3.ShapesKt.getValue(androidx.compose.material3.tokens.SheetBottomTokens.INSTANCE.getDockedMinimizedContainerShape(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final androidx.compose.ui.graphics.Shape getExpandedShape(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1683783414, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:379)");
        }
        androidx.compose.ui.graphics.Shape value = androidx.compose.material3.ShapesKt.getValue(androidx.compose.material3.tokens.SheetBottomTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getContainerColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(433375448, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:383)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SheetBottomTokens.INSTANCE.getDockedContainerColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2932getElevationD9Ej5fM() {
        return getHighSpeedVideoFpsRanges;
    }

    public final long getScrimColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2040719176, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:390)");
        }
        long m5995copywmQWz5c$default = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m5995copywmQWz5c$default;
    }

    /* renamed from: getSheetPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m2935getSheetPeekHeightD9Ej5fM() {
        return Camera2StreamConfigurationMap;
    }

    /* renamed from: getSheetMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m2934getSheetMaxWidthD9Ej5fM() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public final androidx.compose.foundation.layout.WindowInsets getWindowInsets(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-511309409, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-windowInsets> (SheetDefaults.kt:401)");
        }
        androidx.compose.foundation.layout.WindowInsets m1752onlybOOhFvg = androidx.compose.foundation.layout.WindowInsetsKt.m1752onlybOOhFvg(androidx.compose.foundation.layout.WindowInsets_androidKt.getSafeDrawing(androidx.compose.foundation.layout.WindowInsets.INSTANCE, composer, 6), androidx.compose.foundation.layout.WindowInsetsSides.m1764plusgK_yJZ4(androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1771getBottomJoeWqyM(), androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1777getTopJoeWqyM()));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m1752onlybOOhFvg;
    }

    /* renamed from: getPositionalThreshold-D9Ej5fM$material3, reason: not valid java name */
    public final float m2933getPositionalThresholdD9Ej5fM$material3() {
        return getHighSpeedVideoSizes;
    }

    /* renamed from: getVelocityThreshold-D9Ej5fM$material3, reason: not valid java name */
    public final float m2936getVelocityThresholdD9Ej5fM$material3() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x004c  */
    /* renamed from: DragHandle-lgZ2HuY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2931DragHandlelgZ2HuY(androidx.compose.ui.Modifier modifier, float f, float f2, androidx.compose.ui.graphics.Shape shape, long j, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        final float f3;
        int i4;
        float f4;
        androidx.compose.ui.graphics.Shape shape2;
        long j2;
        final androidx.compose.ui.Modifier.Companion companion;
        final float f5;
        final float f6;
        final androidx.compose.ui.graphics.Shape shape3;
        final long j3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        float f7;
        boolean changed;
        java.lang.Object rememberedValue;
        int i6;
        int i7;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1364277227);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f3 = f;
            i3 |= startRestartGroup.changed(f3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i7 = 2048;
                            i3 |= i7;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i7 = 1024;
                    i3 |= i7;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j2 = j;
                        if (startRestartGroup.changed(j2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        j2 = j;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    j2 = j;
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                    } else {
                        companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if (i9 != 0) {
                            f3 = androidx.compose.material3.tokens.SheetBottomTokens.INSTANCE.m5008getDockedDragHandleWidthD9Ej5fM();
                        }
                        if (i4 != 0) {
                            f4 = androidx.compose.material3.tokens.SheetBottomTokens.INSTANCE.m5007getDockedDragHandleHeightD9Ej5fM();
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shape2 = androidx.compose.material3.MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getExtraLarge();
                        }
                        if ((i2 & 16) != 0) {
                            j2 = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), startRestartGroup, 6);
                            i5 = i3 & (-57345);
                            final float f8 = f4;
                            androidx.compose.ui.graphics.Shape shape4 = shape2;
                            long j4 = j2;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1364277227, i5, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:415)");
                            }
                            androidx.compose.material3.internal.Strings.Companion companion2 = androidx.compose.material3.internal.Strings.INSTANCE;
                            final java.lang.String m4383getString2EP1pXo = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_bottom_sheet_drag_handle_description), startRestartGroup, 0);
                            f7 = androidx.compose.material3.SheetDefaultsKt.Camera2StreamConfigurationMap;
                            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(companion, 0.0f, f7, 1, null);
                            changed = startRestartGroup.changed(m4383getString2EP1pXo);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.BottomSheetDefaults$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return androidx.compose.material3.BottomSheetDefaults.$r8$lambda$GqPZK2lLySES9drhAZICbv9vZAs(m4383getString2EP1pXo, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            int i10 = i5 >> 6;
                            androidx.compose.material3.SurfaceKt.m3828SurfaceT9BRK9s(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1708paddingVpY3zN4$default, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), shape4, j4, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1039573072, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    androidx.compose.runtime.Composer composer3 = composer2;
                                    int intValue = num.intValue();
                                    if (!composer3.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventStart(-1039573072, intValue, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:425)");
                                        }
                                        androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, f3, f8), composer3, 0);
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        }
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i10 & 112) | 12582912 | (i10 & 896), 120);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            shape3 = shape4;
                            f6 = f8;
                            f5 = f3;
                            j3 = j4;
                        } else {
                            modifier2 = companion;
                        }
                    }
                    companion = modifier2;
                    i5 = i3;
                    final float f82 = f4;
                    androidx.compose.ui.graphics.Shape shape42 = shape2;
                    long j42 = j2;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.material3.internal.Strings.Companion companion22 = androidx.compose.material3.internal.Strings.INSTANCE;
                    final java.lang.String m4383getString2EP1pXo2 = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_bottom_sheet_drag_handle_description), startRestartGroup, 0);
                    f7 = androidx.compose.material3.SheetDefaultsKt.Camera2StreamConfigurationMap;
                    androidx.compose.ui.Modifier m1708paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(companion, 0.0f, f7, 1, null);
                    changed = startRestartGroup.changed(m4383getString2EP1pXo2);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.BottomSheetDefaults$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.compose.material3.BottomSheetDefaults.$r8$lambda$GqPZK2lLySES9drhAZICbv9vZAs(m4383getString2EP1pXo2, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    int i102 = i5 >> 6;
                    androidx.compose.material3.SurfaceKt.m3828SurfaceT9BRK9s(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1708paddingVpY3zN4$default2, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), shape42, j42, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1039573072, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            androidx.compose.runtime.Composer composer3 = composer2;
                            int intValue = num.intValue();
                            if (!composer3.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                                composer3.skipToGroupEnd();
                            } else {
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1039573072, intValue, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:425)");
                                }
                                androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, f3, f82), composer3, 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i102 & 112) | 12582912 | (i102 & 896), 120);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    shape3 = shape42;
                    f6 = f82;
                    f5 = f3;
                    j3 = j42;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    f5 = f3;
                    f6 = f4;
                    shape3 = shape2;
                    j3 = j2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.BottomSheetDefaults$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.compose.material3.BottomSheetDefaults.$r8$lambda$NZC2xIO2xcvBVQMC33K5WgTJ6kw(androidx.compose.material3.BottomSheetDefaults.this, companion, f5, f6, shape3, j3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            f4 = f2;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f3 = f;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f4 = f2;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GqPZK2lLySES9drhAZICbv9vZAs(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NZC2xIO2xcvBVQMC33K5WgTJ6kw(androidx.compose.material3.BottomSheetDefaults bottomSheetDefaults, androidx.compose.ui.Modifier modifier, float f, float f2, androidx.compose.ui.graphics.Shape shape, long j, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        bottomSheetDefaults.m2931DragHandlelgZ2HuY(modifier, f, f2, shape, j, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
