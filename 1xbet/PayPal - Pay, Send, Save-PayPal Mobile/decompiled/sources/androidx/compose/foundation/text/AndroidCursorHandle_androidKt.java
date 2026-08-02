package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a)\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u0014\u001a\f\u0010\u0015\u001a\u00020\u000e*\u00020\u000eH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0007\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\b\u0010\u0005¨\u0006\u0016"}, d2 = {"Sqrt2", "", "CursorHandleHeight", "Landroidx/compose/ui/unit/Dp;", "getCursorHandleHeight", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "CursorHandleWidth", "getCursorHandleWidth", "CursorHandle", "", "offsetProvider", "Landroidx/compose/foundation/text/selection/OffsetProvider;", "modifier", "Landroidx/compose/ui/Modifier;", "minTouchTargetSize", "Landroidx/compose/ui/unit/DpSize;", "CursorHandle-USBMPiE", "(Landroidx/compose/foundation/text/selection/OffsetProvider;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "DefaultCursorHandle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "drawCursorHandle", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCursorHandle_androidKt {
    private static final float Camera2StreamConfigurationMap;
    private static final float getHighSpeedVideoSizes;

    public static final float getCursorHandleHeight() {
        return getHighSpeedVideoSizes;
    }

    public static final float getCursorHandleWidth() {
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        if ((r14 & 4) != 0) goto L45;
     */
    /* renamed from: CursorHandle-USBMPiE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1977CursorHandleUSBMPiE(final androidx.compose.foundation.text.selection.OffsetProvider offsetProvider, final androidx.compose.ui.Modifier modifier, final long j, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1776202187);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(offsetProvider) : startRestartGroup.changedInstance(offsetProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j)) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    j = androidx.compose.ui.unit.DpSize.INSTANCE.m8708getUnspecifiedMYxV2XQ();
                    i3 &= -897;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1776202187, i3, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:51)");
                }
                int i4 = i3 & 14;
                boolean z = i4 == 4 || ((i3 & 8) != 0 && startRestartGroup.changedInstance(offsetProvider));
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit highSpeedVideoFpsRanges;
                            highSpeedVideoFpsRanges = androidx.compose.foundation.text.AndroidCursorHandle_androidKt.getHighSpeedVideoFpsRanges(androidx.compose.foundation.text.selection.OffsetProvider.this, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            return highSpeedVideoFpsRanges;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
                androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.HandlePopup(offsetProvider, androidx.compose.ui.Alignment.INSTANCE.getTopCenter(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1653527038, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        kotlin.Unit Camera2StreamConfigurationMap2;
                        Camera2StreamConfigurationMap2 = androidx.compose.foundation.text.AndroidCursorHandle_androidKt.Camera2StreamConfigurationMap(j, semantics$default, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        return Camera2StreamConfigurationMap2;
                    }
                }, startRestartGroup, 54), startRestartGroup, i4 | 432);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final long j2 = j;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoSizes;
                    ((java.lang.Integer) obj2).intValue();
                    highSpeedVideoSizes = androidx.compose.foundation.text.AndroidCursorHandle_androidKt.getHighSpeedVideoSizes(androidx.compose.foundation.text.selection.OffsetProvider.this, modifier, j2, i, i2, (androidx.compose.runtime.Composer) obj);
                    return highSpeedVideoSizes;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.foundation.text.selection.OffsetProvider offsetProvider, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.foundation.text.selection.SelectionHandlesKt.getSelectionHandleInfoKey(), new androidx.compose.foundation.text.selection.SelectionHandleInfo(androidx.compose.foundation.text.Handle.Cursor, offsetProvider.mo1994provideF1C5BW0(), androidx.compose.foundation.text.selection.SelectionHandleAnchor.Middle, true, null));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(long j, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1653527038, i, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:63)");
            }
            if (j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                composer.startReplaceGroup(-1244013944);
                androidx.compose.ui.Modifier m1736requiredSizeInqDBjuR0$default = androidx.compose.foundation.layout.SizeKt.m1736requiredSizeInqDBjuR0$default(modifier, androidx.compose.ui.unit.DpSize.m8699getWidthD9Ej5fM(j), androidx.compose.ui.unit.DpSize.m8697getHeightD9Ej5fM(j), 0.0f, 0.0f, 12, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopCenter(), false);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                getHighSpeedVideoFpsRangesFor((androidx.compose.ui.Modifier) null, composer, 0, 1);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1243644858);
                getHighSpeedVideoFpsRangesFor(modifier, composer, 0, 0);
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

    private static final void getHighSpeedVideoFpsRangesFor(final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(694251107, i3, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(getHighSpeedVideoFpsRanges(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(modifier, Camera2StreamConfigurationMap, getHighSpeedVideoSizes)), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    ((java.lang.Integer) obj2).intValue();
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.AndroidCursorHandle_androidKt.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj);
                    return highSpeedVideoFpsRangesFor;
                }
            });
        }
    }

    private static final androidx.compose.ui.Modifier getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier modifier) {
        return androidx.compose.ui.ComposedModifierKt.composed$default(modifier, null, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                androidx.compose.ui.Modifier Camera2StreamConfigurationMap2;
                Camera2StreamConfigurationMap2 = androidx.compose.foundation.text.AndroidCursorHandle_androidKt.Camera2StreamConfigurationMap((androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                return Camera2StreamConfigurationMap2;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier Camera2StreamConfigurationMap(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-2126899193);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2126899193, i, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:87)");
        }
        final long handleColor = ((androidx.compose.foundation.text.selection.TextSelectionColors) composer.consume(androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors())).getHandleColor();
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        boolean changed = composer.changed(handleColor);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.ui.draw.DrawResult highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.text.AndroidCursorHandle_androidKt.getHighSpeedVideoSizes(handleColor, (androidx.compose.ui.draw.CacheDrawScope) obj);
                    return highSpeedVideoSizes;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.Modifier then = modifier.then(androidx.compose.ui.draw.DrawModifierKt.drawWithCache(companion, (kotlin.jvm.functions.Function1) rememberedValue));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return then;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.draw.DrawResult getHighSpeedVideoSizes(long j, androidx.compose.ui.draw.CacheDrawScope cacheDrawScope) {
        final float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (cacheDrawScope.m5554getSizeNHjbRc() >> 32)) / 2.0f;
        final androidx.compose.ui.graphics.ImageBitmap createHandleImage = androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.createHandleImage(cacheDrawScope, intBitsToFloat);
        final androidx.compose.ui.graphics.ColorFilter m6037tintxETnrds$default = androidx.compose.ui.graphics.ColorFilter.Companion.m6037tintxETnrds$default(androidx.compose.ui.graphics.ColorFilter.INSTANCE, j, 0, 2, null);
        return cacheDrawScope.onDrawWithContent(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap2;
                Camera2StreamConfigurationMap2 = androidx.compose.foundation.text.AndroidCursorHandle_androidKt.Camera2StreamConfigurationMap(intBitsToFloat, createHandleImage, m6037tintxETnrds$default, (androidx.compose.ui.graphics.drawscope.ContentDrawScope) obj);
                return Camera2StreamConfigurationMap2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(float f, androidx.compose.ui.graphics.ImageBitmap imageBitmap, androidx.compose.ui.graphics.ColorFilter colorFilter, androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = contentDrawScope2.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            androidx.compose.ui.graphics.drawscope.DrawTransform transform = drawContext.getTransform();
            androidx.compose.ui.graphics.drawscope.DrawTransform.translate$default(transform, f, 0.0f, 2, null);
            transform.mo6459rotateUv8p0NA(45.0f, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
            androidx.compose.ui.graphics.drawscope.DrawScope.m6516drawImagegbVJVH8$default(contentDrawScope2, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            throw th;
        }
    }

    static {
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(25.0f);
        getHighSpeedVideoSizes = m8601constructorimpl;
        Camera2StreamConfigurationMap = androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(m8601constructorimpl * 2.0f) / 2.4142137f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer) {
        getHighSpeedVideoFpsRangesFor(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.text.selection.OffsetProvider offsetProvider, androidx.compose.ui.Modifier modifier, long j, int i, int i2, androidx.compose.runtime.Composer composer) {
        m1977CursorHandleUSBMPiE(offsetProvider, modifier, j, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
