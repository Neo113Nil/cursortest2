package com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a%\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"MinZoomScale", "", "MaxZoomScale", "ScreenshotPreviewScreen", "", "screenshot", "", "onBack", "Lkotlin/Function0;", "([BLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ScreenshotPreviewNoImagePreview", "(Landroidx/compose/runtime/Composer;I)V", "shake-to-report_prodRelease", "scale", "offset", "Landroidx/compose/ui/geometry/Offset;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ScreenshotPreviewScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void ScreenshotPreviewScreen(final byte[] bArr, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance;
        java.lang.Object obj;
        int i3;
        float f;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(670365511);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(bArr) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2;
        if (startRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(670365511, i4, -1, "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ScreenshotPreviewScreen (ScreenshotPreviewScreen.kt:58)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableFloatState mutableFloatState = (androidx.compose.runtime.MutableFloatState) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            kotlin.Unit unit = null;
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ScreenshotPreviewScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ScreenshotPreviewScreenKt.m19370$r8$lambda$65pqqtkGqAG_a4fGL0y8ghdTxY(androidx.compose.runtime.MutableFloatState.this, mutableState, ((java.lang.Float) obj2).floatValue(), (androidx.compose.ui.geometry.Offset) obj3, ((java.lang.Float) obj4).floatValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.foundation.gestures.TransformableState rememberTransformableState = androidx.compose.foundation.gestures.TransformableStateKt.rememberTransformableState((kotlin.jvm.functions.Function3) rememberedValue3, startRestartGroup, 6);
            androidx.compose.ui.Modifier statusBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundOverlayUi.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2));
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, statusBarsPadding);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            if (bArr == null) {
                startRestartGroup.startReplaceGroup(1832613188);
                startRestartGroup.endReplaceGroup();
                i3 = i4;
                boxScopeInstance = boxScopeInstance2;
                obj = null;
                f = 0.0f;
            } else {
                startRestartGroup.startReplaceGroup(1832613189);
                boolean changed = startRestartGroup.changed(bArr);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) rememberedValue4;
                if (bitmap == null) {
                    startRestartGroup.startReplaceGroup(815887666);
                    startRestartGroup.endReplaceGroup();
                    i3 = i4;
                    boxScopeInstance = boxScopeInstance2;
                    obj = null;
                    f = 0.0f;
                } else {
                    startRestartGroup.startReplaceGroup(815887667);
                    androidx.compose.ui.graphics.ImageBitmap asImageBitmap = androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(bitmap);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_screenshot_preview, startRestartGroup, 0);
                    androidx.compose.ui.layout.ContentScale fit = androidx.compose.ui.layout.ContentScale.INSTANCE.getFit();
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    androidx.compose.runtime.MutableFloatState mutableFloatState2 = mutableFloatState;
                    float floatValue = mutableFloatState2.getFloatValue();
                    float floatValue2 = mutableFloatState2.getFloatValue();
                    androidx.compose.runtime.MutableState mutableState2 = mutableState;
                    androidx.compose.ui.Modifier transformable$default = androidx.compose.foundation.gestures.TransformableKt.transformable$default(androidx.compose.ui.graphics.GraphicsLayerModifierKt.m6144graphicsLayer_6ThJ44$default(fillMaxSize$default, floatValue, floatValue2, 0.0f, java.lang.Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.Offset) mutableState2.getValue()).m5762unboximpl() >> 32)), java.lang.Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.Offset) mutableState2.getValue()).m5762unboximpl() & 4294967295L)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524260, null), rememberTransformableState, false, false, 6, null);
                    boxScopeInstance = boxScopeInstance2;
                    obj = null;
                    i3 = i4;
                    f = 0.0f;
                    androidx.compose.foundation.ImageKt.m1335Image5hnEew(asImageBitmap, stringResource, transformable$default, null, fit, 0.0f, null, 0, startRestartGroup, 24576, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    unit = kotlin.Unit.INSTANCE;
                }
                startRestartGroup.endReplaceGroup();
            }
            if (unit == null) {
                startRestartGroup.startReplaceGroup(1833446097);
                androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, f, 1, obj);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shaketoreport.R.string.feature_shake_to_report_screenshot_not_available, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentInverse.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
                composer2.endNode();
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                composer2.endReplaceGroup();
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-1464904015);
                composer2.endReplaceGroup();
            }
            startRestartGroup = composer2;
            com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.ArrowLeft.INSTANCE, function0, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopStart()), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), null, null, null, null, false, false, composer2, (i3 & 112) | 6, 504);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ScreenshotPreviewScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ScreenshotPreviewScreenKt.$r8$lambda$3FUqdKXbrSeCNHHPb0z8Meb59yI(bArr, function0, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3FUqdKXbrSeCNHHPb0z8Meb59yI(byte[] bArr, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        ScreenshotPreviewScreen(bArr, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$65pqqt-kGqAG_a4fGL0y8ghdTxY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19370$r8$lambda$65pqqtkGqAG_a4fGL0y8ghdTxY(androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.runtime.MutableState mutableState, float f, androidx.compose.ui.geometry.Offset offset, float f2) {
        mutableFloatState.setFloatValue(kotlin.ranges.RangesKt.coerceIn(mutableFloatState.getFloatValue() * f, 0.5f, 5.0f));
        androidx.compose.runtime.MutableState mutableState2 = mutableState;
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.Offset) mutableState2.getValue()).m5762unboximpl() >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() >> 32));
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.Offset) mutableState2.getValue()).m5762unboximpl() & 4294967295L));
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() & 4294967295L));
        mutableState.setValue(androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat3 + intBitsToFloat4) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat + intBitsToFloat2) << 32))));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gWsJ1hbPTYw-gOaSW6sm_kGvhfQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19371$r8$lambda$gWsJ1hbPTYwgOaSW6sm_kGvhfQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-172096232);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-172096232, updateChangedFlags, -1, "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ScreenshotPreviewNoImagePreview (ScreenshotPreviewScreen.kt:130)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ScreenshotPreviewScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ScreenshotPreviewScreen(null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 54);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ScreenshotPreviewScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ScreenshotPreviewScreenKt.m19371$r8$lambda$gWsJ1hbPTYwgOaSW6sm_kGvhfQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
