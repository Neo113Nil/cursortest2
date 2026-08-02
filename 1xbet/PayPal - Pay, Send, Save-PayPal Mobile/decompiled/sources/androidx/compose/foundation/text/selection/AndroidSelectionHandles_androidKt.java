package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0011\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0015\u001a\"\u0010\u0016\u001a\u00020\u000e*\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\u0017\u001a\u00020\u0018*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0000\u001a0\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b H\u0001¢\u0006\u0002\u0010!¨\u0006\""}, d2 = {"SelectionHandle", "", "offsetProvider", "Landroidx/compose/foundation/text/selection/OffsetProvider;", "isStartHandle", "", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "handlesCrossed", "minTouchTargetSize", "Landroidx/compose/ui/unit/DpSize;", "lineHeight", "", "modifier", "Landroidx/compose/ui/Modifier;", "SelectionHandle-wLIcFTc", "(Landroidx/compose/foundation/text/selection/OffsetProvider;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZJFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SelectionHandleIcon", "iconVisible", "Lkotlin/Function0;", "isLeft", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "drawSelectionHandle", "createHandleImage", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroidx/compose/ui/draw/CacheDrawScope;", "radius", "HandlePopup", "positionProvider", "handleReferencePoint", "Landroidx/compose/ui/Alignment;", "content", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/text/selection/OffsetProvider;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt {
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b8, code lost:
    
        if ((r28 & 16) != 0) goto L67;
     */
    /* renamed from: SelectionHandle-wLIcFTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2370SelectionHandlewLIcFTc(final androidx.compose.foundation.text.selection.OffsetProvider offsetProvider, final boolean z, final androidx.compose.ui.text.style.ResolvedTextDirection resolvedTextDirection, final boolean z2, long j, final float f, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final long j2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-466280168);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(offsetProvider) : startRestartGroup.changedInstance(offsetProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(resolvedTextDirection.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            j2 = j;
            i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j2)) ? 16384 : 8192;
        } else {
            j2 = j;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
        }
        if (startRestartGroup.shouldExecute((533651 & i3) != 533650, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    j2 = androidx.compose.ui.unit.DpSize.INSTANCE.m8708getUnspecifiedMYxV2XQ();
                    i3 &= -57345;
                }
                final long j3 = j2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-466280168, i3, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:65)");
                }
                final boolean isLeftSelectionHandle = androidx.compose.foundation.text.selection.SelectionHandlesKt.isLeftSelectionHandle(z, resolvedTextDirection, z2);
                androidx.compose.ui.AbsoluteAlignment absoluteAlignment = androidx.compose.ui.AbsoluteAlignment.INSTANCE;
                androidx.compose.ui.Alignment topRight = isLeftSelectionHandle ? absoluteAlignment.getTopRight() : absoluteAlignment.getTopLeft();
                int i4 = i3 & 14;
                boolean z3 = i4 == 4 || ((i3 & 8) != 0 && startRestartGroup.changedInstance(offsetProvider));
                boolean z4 = (i3 & 112) == 32;
                boolean changed = startRestartGroup.changed(isLeftSelectionHandle);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z3 | z4 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.$r8$lambda$YLQYkAbVOmgr6vFIK4rqIOgnaY8(androidx.compose.foundation.text.selection.OffsetProvider.this, z, isLeftSelectionHandle, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
                final androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration());
                HandlePopup(offsetProvider, topRight, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1365123137, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.$r8$lambda$o1RA7W4TBmcAy8UZi13UO1MBF8s(androidx.compose.ui.platform.ViewConfiguration.this, j3, isLeftSelectionHandle, semantics$default, offsetProvider, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, i4 | 384);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                j2 = j3;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.$r8$lambda$Wu2Ot1xupbG7ETFJPuJ20sSWYEA(androidx.compose.foundation.text.selection.OffsetProvider.this, z, resolvedTextDirection, z2, j2, f, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SelectionHandleIcon(final androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function0<java.lang.Boolean> function0, final boolean z, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2111672474);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2111672474, i2, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:123)");
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(drawSelectionHandle(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(modifier, androidx.compose.foundation.text.selection.SelectionHandlesKt.getHandleWidth(), androidx.compose.foundation.text.selection.SelectionHandlesKt.getHandleHeight()), function0, z), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.$r8$lambda$PuZ6kKVj7KUdgC2ahuDM8sdo1o8(androidx.compose.ui.Modifier.this, function0, z, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final androidx.compose.ui.Modifier drawSelectionHandle(androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function0<java.lang.Boolean> function0, final boolean z) {
        return androidx.compose.ui.ComposedModifierKt.composed$default(modifier, null, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.$r8$lambda$VLjsut1Z55LamzOhXosPLubSLuQ(kotlin.jvm.functions.Function0.this, z, (androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.functions.Function0 function0, boolean z, androidx.compose.ui.graphics.ImageBitmap imageBitmap, androidx.compose.ui.graphics.ColorFilter colorFilter, androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        if (!((java.lang.Boolean) function0.invoke()).booleanValue()) {
            return kotlin.Unit.INSTANCE;
        }
        if (z) {
            androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
            long mo6530getCenterF1C5BW0 = contentDrawScope2.mo6530getCenterF1C5BW0();
            androidx.compose.ui.graphics.drawscope.DrawContext drawContext = contentDrawScope2.getDrawContext();
            long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo6460scale0AR0LA0(-1.0f, 1.0f, mo6530getCenterF1C5BW0);
                androidx.compose.ui.graphics.drawscope.DrawScope.m6516drawImagegbVJVH8$default(contentDrawScope2, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            }
        } else {
            androidx.compose.ui.graphics.drawscope.DrawScope.m6516drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final androidx.compose.ui.graphics.ImageBitmap createHandleImage(androidx.compose.ui.draw.CacheDrawScope cacheDrawScope, float f) {
        int ceil = ((int) java.lang.Math.ceil(f)) * 2;
        androidx.compose.foundation.text.selection.HandleImageCache handleImageCache = androidx.compose.foundation.text.selection.HandleImageCache.INSTANCE;
        androidx.compose.ui.graphics.ImageBitmap highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.selection.HandleImageCache.getHighResolutionOutputSizeshNQ4ISI();
        androidx.compose.foundation.text.selection.HandleImageCache handleImageCache2 = androidx.compose.foundation.text.selection.HandleImageCache.INSTANCE;
        androidx.compose.ui.graphics.Canvas highSpeedVideoFpsRanges = androidx.compose.foundation.text.selection.HandleImageCache.getHighSpeedVideoFpsRanges();
        androidx.compose.foundation.text.selection.HandleImageCache handleImageCache3 = androidx.compose.foundation.text.selection.HandleImageCache.INSTANCE;
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope highSpeedVideoSizes = androidx.compose.foundation.text.selection.HandleImageCache.getHighSpeedVideoSizes();
        if (highResolutionOutputSizeshNQ4ISI == null || highSpeedVideoFpsRanges == null || ceil > highResolutionOutputSizeshNQ4ISI.getWidth() || ceil > highResolutionOutputSizeshNQ4ISI.getHeight()) {
            highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.graphics.ImageBitmapKt.m6215ImageBitmapx__hDU$default(ceil, ceil, androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m6209getAlpha8_sVssgQ(), false, null, 24, null);
            androidx.compose.foundation.text.selection.HandleImageCache handleImageCache4 = androidx.compose.foundation.text.selection.HandleImageCache.INSTANCE;
            androidx.compose.foundation.text.selection.HandleImageCache.getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI);
            highSpeedVideoFpsRanges = androidx.compose.ui.graphics.CanvasKt.Canvas(highResolutionOutputSizeshNQ4ISI);
            androidx.compose.foundation.text.selection.HandleImageCache handleImageCache5 = androidx.compose.foundation.text.selection.HandleImageCache.INSTANCE;
            androidx.compose.foundation.text.selection.HandleImageCache.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges);
        }
        androidx.compose.ui.graphics.ImageBitmap imageBitmap = highResolutionOutputSizeshNQ4ISI;
        androidx.compose.ui.graphics.Canvas canvas = highSpeedVideoFpsRanges;
        if (highSpeedVideoSizes == null) {
            highSpeedVideoSizes = new androidx.compose.ui.graphics.drawscope.CanvasDrawScope();
            androidx.compose.foundation.text.selection.HandleImageCache handleImageCache6 = androidx.compose.foundation.text.selection.HandleImageCache.INSTANCE;
            androidx.compose.foundation.text.selection.HandleImageCache.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes);
        }
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope = highSpeedVideoSizes;
        androidx.compose.ui.unit.LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        float width = imageBitmap.getWidth();
        float height = imageBitmap.getHeight();
        long m5812constructorimpl = androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(width) << 32) | (java.lang.Float.floatToRawIntBits(height) & 4294967295L));
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        androidx.compose.ui.unit.Density density = drawParams.getDensity();
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas2 = drawParams.getCanvas();
        long size = drawParams.getSize();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m6452setSizeuvyYCjk(m5812constructorimpl);
        canvas.save();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(canvasDrawScope2, androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), 0L, canvasDrawScope2.mo6531getSizeNHjbRc(), 0.0f, null, null, androidx.compose.ui.graphics.BlendMode.INSTANCE.m5910getClear0nO6VwU(), 58, null);
        androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(canvasDrawScope2, androidx.compose.ui.graphics.ColorKt.Color(com.datadog.android.sessionreplay.utils.ColorConstantsKt.MASK_ALPHA), androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0(), androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32)), 0.0f, null, null, 0, 120, null);
        androidx.compose.ui.graphics.drawscope.DrawScope.m6513drawCircleVaOC9Bg$default(canvasDrawScope2, androidx.compose.ui.graphics.ColorKt.Color(com.datadog.android.sessionreplay.utils.ColorConstantsKt.MASK_ALPHA), f, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        canvas.restore();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(density);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas2);
        drawParams3.m6452setSizeuvyYCjk(size);
        return imageBitmap;
    }

    public static final void HandlePopup(final androidx.compose.foundation.text.selection.OffsetProvider offsetProvider, final androidx.compose.ui.Alignment alignment, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(offsetProvider) : startRestartGroup.changedInstance(offsetProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(alignment) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        boolean z = true;
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1090171650, i2, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:219)");
            }
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !startRestartGroup.changed(offsetProvider))) {
                z = false;
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.foundation.text.selection.HandlePositionProvider(alignment, offsetProvider);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.window.AndroidPopup_androidKt.Popup((androidx.compose.foundation.text.selection.HandlePositionProvider) rememberedValue, null, new androidx.compose.ui.window.PopupProperties(false, false, false, (androidx.compose.ui.window.SecureFlagPolicy) null, true, false, 15, (kotlin.jvm.internal.DefaultConstructorMarker) null), function2, startRestartGroup, ((i2 << 3) & 7168) | 384, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.$r8$lambda$LjRFjw4XE8bGihfBKtQi9jFbYbk(androidx.compose.foundation.text.selection.OffsetProvider.this, alignment, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ boolean $r8$lambda$2MCOkCUjf2V9hyM6MiCrQug_T4M(androidx.compose.foundation.text.selection.OffsetProvider offsetProvider) {
        return (offsetProvider.mo1994provideF1C5BW0() & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IlY2RIVLPAXZo_JUgEpXEZiM2Ac(long j, boolean z, androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.text.selection.OffsetProvider offsetProvider, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1260045569, i, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:86)");
            }
            if (j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                composer.startReplaceGroup(3458246);
                androidx.compose.foundation.layout.Arrangement.Horizontal right = z ? androidx.compose.foundation.layout.Arrangement.Absolute.INSTANCE.getRight() : androidx.compose.foundation.layout.Arrangement.Absolute.INSTANCE.getLeft();
                androidx.compose.ui.Modifier m1736requiredSizeInqDBjuR0$default = androidx.compose.foundation.layout.SizeKt.m1736requiredSizeInqDBjuR0$default(modifier, androidx.compose.ui.unit.DpSize.m8699getWidthD9Ej5fM(j), androidx.compose.ui.unit.DpSize.m8697getHeightD9Ej5fM(j), 0.0f, 0.0f, 12, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(right, androidx.compose.ui.Alignment.INSTANCE.getTop(), composer, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1736requiredSizeInqDBjuR0$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                boolean changedInstance = composer.changedInstance(offsetProvider);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return java.lang.Boolean.valueOf(androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.$r8$lambda$2MCOkCUjf2V9hyM6MiCrQug_T4M(androidx.compose.foundation.text.selection.OffsetProvider.this));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                SelectionHandleIcon(companion, (kotlin.jvm.functions.Function0) rememberedValue, z, composer, 6);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(4389176);
                boolean changedInstance2 = composer.changedInstance(offsetProvider);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return java.lang.Boolean.valueOf(androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.$r8$lambda$aq7HYYBsd_Q1PyS9_u0psxwapUE(androidx.compose.foundation.text.selection.OffsetProvider.this));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                SelectionHandleIcon(modifier, (kotlin.jvm.functions.Function0) rememberedValue2, z, composer, 0);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LjRFjw4XE8bGihfBKtQi9jFbYbk(androidx.compose.foundation.text.selection.OffsetProvider offsetProvider, androidx.compose.ui.Alignment alignment, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        HandlePopup(offsetProvider, alignment, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PuZ6kKVj7KUdgC2ahuDM8sdo1o8(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, boolean z, int i, androidx.compose.runtime.Composer composer, int i2) {
        SelectionHandleIcon(modifier, function0, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.Modifier $r8$lambda$VLjsut1Z55LamzOhXosPLubSLuQ(final kotlin.jvm.functions.Function0 function0, final boolean z, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-196777734);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-196777734, i, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:129)");
        }
        final long handleColor = ((androidx.compose.foundation.text.selection.TextSelectionColors) composer.consume(androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors())).getHandleColor();
        boolean changed = composer.changed(handleColor);
        boolean changed2 = composer.changed(function0);
        boolean changed3 = composer.changed(z);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.m2369$r8$lambda$yY4vNkdTpeccOD8ga4PtNZsLFs(handleColor, function0, z, (androidx.compose.ui.draw.CacheDrawScope) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.Modifier drawWithCache = androidx.compose.ui.draw.DrawModifierKt.drawWithCache(modifier, (kotlin.jvm.functions.Function1) rememberedValue);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return drawWithCache;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Wu2Ot1xupbG7ETFJPuJ20sSWYEA(androidx.compose.foundation.text.selection.OffsetProvider offsetProvider, boolean z, androidx.compose.ui.text.style.ResolvedTextDirection resolvedTextDirection, boolean z2, long j, float f, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m2370SelectionHandlewLIcFTc(offsetProvider, z, resolvedTextDirection, z2, j, f, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YLQYkAbVOmgr6vFIK4rqIOgnaY8(androidx.compose.foundation.text.selection.OffsetProvider offsetProvider, boolean z, boolean z2, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        long mo1994provideF1C5BW0 = offsetProvider.mo1994provideF1C5BW0();
        semanticsPropertyReceiver.set(androidx.compose.foundation.text.selection.SelectionHandlesKt.getSelectionHandleInfoKey(), new androidx.compose.foundation.text.selection.SelectionHandleInfo(z ? androidx.compose.foundation.text.Handle.SelectionStart : androidx.compose.foundation.text.Handle.SelectionEnd, mo1994provideF1C5BW0, z2 ? androidx.compose.foundation.text.selection.SelectionHandleAnchor.Left : androidx.compose.foundation.text.selection.SelectionHandleAnchor.Right, (9223372034707292159L & mo1994provideF1C5BW0) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$aq7HYYBsd_Q1PyS9_u0psxwapUE(androidx.compose.foundation.text.selection.OffsetProvider offsetProvider) {
        return (offsetProvider.mo1994provideF1C5BW0() & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$o1RA7W4TBmcAy8UZi13UO1MBF8s(androidx.compose.ui.platform.ViewConfiguration viewConfiguration, final long j, final boolean z, final androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.text.selection.OffsetProvider offsetProvider, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1365123137, i, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:85)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration().provides(viewConfiguration), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1260045569, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.$r8$lambda$IlY2RIVLPAXZo_JUgEpXEZiM2Ac(j, z, modifier, offsetProvider, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yY4vNkdTpeccOD8ga-4PtNZsLFs, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.draw.DrawResult m2369$r8$lambda$yY4vNkdTpeccOD8ga4PtNZsLFs(long j, final kotlin.jvm.functions.Function0 function0, final boolean z, androidx.compose.ui.draw.CacheDrawScope cacheDrawScope) {
        final androidx.compose.ui.graphics.ImageBitmap createHandleImage = createHandleImage(cacheDrawScope, java.lang.Float.intBitsToFloat((int) (cacheDrawScope.m5554getSizeNHjbRc() >> 32)) / 2.0f);
        final androidx.compose.ui.graphics.ColorFilter m6037tintxETnrds$default = androidx.compose.ui.graphics.ColorFilter.Companion.m6037tintxETnrds$default(androidx.compose.ui.graphics.ColorFilter.INSTANCE, j, 0, 2, null);
        return cacheDrawScope.onDrawWithContent(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.Camera2StreamConfigurationMap(kotlin.jvm.functions.Function0.this, z, createHandleImage, m6037tintxETnrds$default, (androidx.compose.ui.graphics.drawscope.ContentDrawScope) obj);
                return Camera2StreamConfigurationMap;
            }
        });
    }
}
