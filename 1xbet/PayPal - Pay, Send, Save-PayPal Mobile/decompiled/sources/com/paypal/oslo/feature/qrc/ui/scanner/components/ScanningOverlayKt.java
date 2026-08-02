package com.paypal.oslo.feature.qrc.ui.scanner.components;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000\u001a{\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00132\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eH\u0001¢\u0006\u0002\u0010\u001c\u001a5\u0010\u001d\u001a\u00020\f*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\"\u0010#\u001a\u0017\u0010$\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010%\u001a)\u0010&\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010'\u001a\u00020\u001a2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0004\b(\u0010)\u001a\r\u0010*\u001a\u00020\fH\u0003¢\u0006\u0002\u0010+\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"QrDetectionHighlightDuration", "", "ErrorAutoDismissDelay", "PaddingFromLeftRight", "", "calculateScanningRect", "Landroidx/compose/ui/geometry/Rect;", "scanAreaSizePx", "", "canvasWidth", "canvasHeight", "ScanningOverlay", "", "onFlashToggle", "Lkotlin/Function0;", "onGalleryClick", "modifier", "Landroidx/compose/ui/Modifier;", "isProcessing", "", "flashLightState", "Lcom/paypal/oslo/feature/qrc/ui/scanner/components/FlashLightState;", "errorMessage", "", "isQRCodeDetected", "scannedImageUri", "Landroid/net/Uri;", "onErrorDismissed", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLcom/paypal/oslo/feature/qrc/ui/scanner/components/FlashLightState;Ljava/lang/String;ZLandroid/net/Uri;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ScanAreaBorder", "Landroidx/compose/foundation/layout/BoxScope;", "scanAreaSize", "Landroidx/compose/ui/unit/Dp;", "showBorderHighlight", "ScanAreaBorder-DzVHIIc", "(Landroidx/compose/foundation/layout/BoxScope;FLjava/lang/String;ZZLandroidx/compose/runtime/Composer;I)V", "ViewfinderFrame", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ScannedImagePreview", "imageUri", "ScannedImagePreview-Kz89ssw", "(FLandroid/net/Uri;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ScanningOverlayPreview", "(Landroidx/compose/runtime/Composer;I)V", "qrc_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ScanningOverlayKt {
    public static final androidx.compose.ui.geometry.Rect calculateScanningRect(float f, float f2, float f3) {
        float f4 = f2 / 2.0f;
        float f5 = f3 / 2.0f;
        float f6 = f / 2.0f;
        return new androidx.compose.ui.geometry.Rect(f4 - f6, f5 - f6, f4 + f6, f5 + f6);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScanningOverlay(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, boolean z, com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState flashLightState, java.lang.String str, boolean z2, android.net.Uri uri, kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        android.net.Uri uri2;
        int i9;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final boolean z3;
        final com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState flashLightState2;
        final java.lang.String str2;
        final boolean z4;
        final android.net.Uri uri3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        boolean z5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        com.paypal.pds.components.ButtonStyle.Primary primary;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1316456582);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(flashLightState == null ? -1 : flashLightState.ordinal()) ? 16384 : 8192;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changed(str) ? 131072 : 65536;
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                    uri2 = uri;
                } else {
                    uri2 = uri;
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(uri2) ? 8388608 : 4194304;
                    }
                }
                i9 = i2 & 256;
                if (i9 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changedInstance(function03) ? 67108864 : 33554432;
                }
                if (!startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier2 = modifier;
                    z3 = z;
                    flashLightState2 = flashLightState;
                    str2 = str;
                    z4 = z2;
                    uri3 = uri2;
                    function04 = function03;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i10 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                    boolean z6 = i4 != 0 ? false : z;
                    com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState flashLightState3 = i5 != 0 ? com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState.Off : flashLightState;
                    java.lang.String str4 = i6 != 0 ? null : str;
                    boolean z7 = i7 != 0 ? false : z2;
                    android.net.Uri uri4 = i8 != 0 ? null : uri2;
                    kotlin.jvm.functions.Function0<kotlin.Unit> function06 = i9 != 0 ? null : function03;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1316456582, i3, -1, "com.paypal.oslo.feature.qrc.ui.scanner.components.ScanningOverlay (ScanningOverlay.kt:116)");
                    }
                    com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState flashLightState4 = flashLightState3;
                    final long m6022getBlack0d7_KjU = androidx.compose.foundation.DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0) ? androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU() : androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU();
                    android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                    androidx.compose.ui.platform.WindowInfo windowInfo = (androidx.compose.ui.platform.WindowInfo) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo());
                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                    float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(density.mo1415toDpu2uoSUM((int) (windowInfo.mo7767getContainerSizeYbymL2g() >> 32)) - androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f));
                    final int mo1412roundToPx0680j_4 = density.mo1412roundToPx0680j_4(m8601constructorimpl);
                    boolean z8 = (3670016 & i3) == 1048576;
                    boolean changedInstance = startRestartGroup.changedInstance(context);
                    com.paypal.oslo.feature.qrc.ui.scanner.components.ScanningOverlayKt$ScanningOverlay$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((z8 | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new com.paypal.oslo.feature.qrc.ui.scanner.components.ScanningOverlayKt$ScanningOverlay$1$1(z7, context, mutableState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    int i11 = i3 >> 18;
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z7), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i11 & 14);
                    boolean z9 = (458752 & i3) == 131072;
                    boolean z10 = (234881024 & i3) == 67108864;
                    com.paypal.oslo.feature.qrc.ui.scanner.components.ScanningOverlayKt$ScanningOverlay$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((z9 || z10) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        obj = null;
                        rememberedValue3 = new com.paypal.oslo.feature.qrc.ui.scanner.components.ScanningOverlayKt$ScanningOverlay$2$1(str4, function06, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    } else {
                        obj = null;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(str4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, (i3 >> 15) & 14);
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, obj), com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenTestTags.SCREEN_OVERLAY);
                    boolean changed = startRestartGroup.changed(mo1412roundToPx0680j_4);
                    boolean changed2 = startRestartGroup.changed(m6022getBlack0d7_KjU);
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((changed | changed2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.components.ScanningOverlayKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                kotlin.Unit highSpeedVideoSizes;
                                highSpeedVideoSizes = com.paypal.oslo.feature.qrc.ui.scanner.components.ScanningOverlayKt.getHighSpeedVideoSizes(mo1412roundToPx0680j_4, m6022getBlack0d7_KjU, (androidx.compose.ui.graphics.drawscope.DrawScope) obj2);
                                return highSpeedVideoSizes;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    androidx.compose.ui.Modifier drawBehind = androidx.compose.ui.draw.DrawModifierKt.drawBehind(testTag, (kotlin.jvm.functions.Function1) rememberedValue4);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, drawBehind);
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
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    if (!z6 && !z7) {
                        startRestartGroup.startReplaceGroup(-1196462694);
                        if (str4 == null) {
                            startRestartGroup.startReplaceGroup(-1285520536);
                            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_scan_to_pay_txt_scanner_center_code, startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                            str3 = stringResource;
                        } else {
                            startRestartGroup.startReplaceGroup(-1285521032);
                            startRestartGroup.endReplaceGroup();
                            str3 = str4;
                        }
                        z5 = z7;
                        function05 = function06;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str3, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.OffsetKt.m1679offsetVpY3zN4$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter()), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(-androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(m8601constructorimpl / 2.0f) + com.paypal.pds.core.ConstantsKt.getSpacing40())), 1, null), com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenTestTags.SCAN_LABEL), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 1, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 12583296, 6, 872);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        z5 = z7;
                        function05 = function06;
                        startRestartGroup.startReplaceGroup(-1195953054);
                        startRestartGroup.endReplaceGroup();
                    }
                    getHighSpeedVideoFpsRanges(boxScopeInstance, m8601constructorimpl, str4, z6, ((java.lang.Boolean) mutableState.getValue()).booleanValue(), startRestartGroup, ((i3 >> 9) & 896) | 6 | (i3 & 7168));
                    if (uri4 != null && z6) {
                        startRestartGroup.startReplaceGroup(-1195598414);
                        m17938ScannedImagePreviewKz89ssw(m8601constructorimpl, uri4, boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter()), startRestartGroup, i11 & 112, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1195398526);
                        startRestartGroup.endReplaceGroup();
                    }
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getBottomCenter()), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing48(), 7, null);
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize48()), com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenTestTags.FLASHLIGHT_ICON);
                    com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                    if (flashLightState4 == com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState.Off) {
                        primary = com.paypal.pds.components.ButtonStyle.Overlay.INSTANCE;
                    } else {
                        primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                    }
                    boolean z11 = z5;
                    kotlin.jvm.functions.Function0<kotlin.Unit> function07 = function05;
                    java.lang.String str5 = str4;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.Lightning.INSTANCE, function0, testTag2, primary, large, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_scan_to_pay_txt_flashlight_content_desc, startRestartGroup, 0), null, false, false, startRestartGroup, ((i3 << 3) & 112) | 24582, 448);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, 0);
                    androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize48()), com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenTestTags.GALLERY_ICON);
                    com.paypal.pds.components.ButtonSize.Large large2 = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                    com.paypal.pds.components.ButtonStyle.Overlay overlay = com.paypal.pds.components.ButtonStyle.Overlay.INSTANCE;
                    com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.Image.INSTANCE, function02, testTag3, overlay, large2, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_scan_to_pay_txt_gallery_content_desc, composer2, 0), null, false, false, composer2, (i3 & 112) | 27654, 448);
                    composer2.endNode();
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    flashLightState2 = flashLightState4;
                    function04 = function07;
                    modifier2 = modifier4;
                    z4 = z11;
                    str2 = str5;
                    z3 = z6;
                    uri3 = uri4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.components.ScanningOverlayKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.qrc.ui.scanner.components.ScanningOverlayKt.$r8$lambda$5R1MzQgiSXmZdRPVgBgxKhJG_bQ(kotlin.jvm.functions.Function0.this, function02, modifier2, z3, flashLightState2, str2, z4, uri3, function04, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            i9 = i2 & 256;
            if (i9 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        i9 = i2 & 256;
        if (i9 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(int i, long j, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        long j2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        float f = drawScope.mo1418toPx0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24());
        androidx.compose.ui.geometry.Rect calculateScanningRect = calculateScanningRect(i, java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32)), java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L)));
        androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        androidx.compose.ui.graphics.Path.addRoundRect$default(Path, androidx.compose.ui.geometry.RoundRectKt.RoundRect(calculateScanningRect, f, f), null, 2, null);
        int m5984getDifferencertfAjoo = androidx.compose.ui.graphics.ClipOp.INSTANCE.m5984getDifferencertfAjoo();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6455clipPathmtrdDE(Path, m5984getDifferencertfAjoo);
            try {
                androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(drawScope, j, 0L, 0L, 0.0f, null, null, 0, 126, null);
                drawContext.getCanvas().restore();
                drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th) {
                th = th;
                j2 = mo6453getSizeNHjbRc;
                drawContext.getCanvas().restore();
                drawContext.mo6454setSizeuvyYCjk(j2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            j2 = mo6453getSizeNHjbRc;
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final androidx.compose.foundation.layout.BoxScope boxScope, final float f, final java.lang.String str, final boolean z, final boolean z2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        float spacing2;
        com.paypal.pds.core.Color.BorderBase borderBase;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1286028628);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1286028628, i2, -1, "com.paypal.oslo.feature.qrc.ui.scanner.components.ScanAreaBorder (ScanningOverlay.kt:256)");
            }
            if (str != null) {
                spacing2 = com.paypal.pds.core.ConstantsKt.getSpacing4();
            } else if (z2) {
                spacing2 = com.paypal.pds.core.ConstantsKt.getSpacing4();
            } else {
                spacing2 = com.paypal.pds.core.ConstantsKt.getSpacing2();
            }
            float f2 = spacing2;
            if (str != null) {
                borderBase = com.paypal.pds.core.Color.BorderRoleEmphasisNegative.INSTANCE;
            } else if (z2) {
                borderBase = com.paypal.pds.core.Color.BorderRoleBaseInfo.INSTANCE;
            } else {
                borderBase = com.paypal.pds.core.Color.BorderBase.INSTANCE;
            }
            androidx.compose.ui.Modifier m22099borderDzVHIIc = com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(boxScope.align(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenTestTags.SCAN_AREA_BOX), androidx.compose.ui.Alignment.INSTANCE.getCenter()), f), com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24()), f2, borderBase, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24(), startRestartGroup, 0, 0);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m22099borderDzVHIIc);
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
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            if (!z) {
                startRestartGroup.startReplaceGroup(-2016440685);
                ViewfinderFrame(boxScopeInstance.align(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(210.0f)), androidx.compose.ui.Alignment.INSTANCE.getCenter()), startRestartGroup, 0, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-2016278276);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.components.ScanningOverlayKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.scanner.components.ScanningOverlayKt.$r8$lambda$qptzkFTItjQRsHSzQ_Vokffhd64(androidx.compose.foundation.layout.BoxScope.this, f, str, z, z2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v6 ??, still in use, count: 1, list:
          (r0v6 ?? I:java.lang.Object) from 0x0074: INVOKE (r11v1 ?? I:androidx.compose.runtime.Composer), (r0v6 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:545)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void ViewfinderFrame(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v6 ??, still in use, count: 1, list:
          (r0v6 ?? I:java.lang.Object) from 0x0074: INVOKE (r11v1 ?? I:androidx.compose.runtime.Composer), (r0v6 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:545)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    private static final void Camera2StreamConfigurationMap(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, float f, com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs cornerSpecs) {
        androidx.compose.ui.graphics.drawscope.DrawScope.m6518drawLineNGM6Ib0$default(drawScope, j, cornerSpecs.getHorizontal().m17933getStartF1C5BW0(), cornerSpecs.getHorizontal().m17932getEndF1C5BW0(), f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6341getRoundKaPHkGw(), null, 0.0f, null, 0, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
        androidx.compose.ui.graphics.drawscope.DrawScope.m6518drawLineNGM6Ib0$default(drawScope, j, cornerSpecs.getVertical().m17933getStartF1C5BW0(), cornerSpecs.getVertical().m17932getEndF1C5BW0(), f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6341getRoundKaPHkGw(), null, 0.0f, null, 0, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
        androidx.compose.ui.graphics.drawscope.DrawScope.m6511drawArcyD3GUKo$default(drawScope, j, cornerSpecs.getArc().getStartAngle(), cornerSpecs.getArc().getSweepAngle(), false, cornerSpecs.getArc().m17924getTopLeftF1C5BW0(), cornerSpecs.getArc().m17923getSizeNHjbRc(), 0.0f, new androidx.compose.ui.graphics.drawscope.Stroke(f, 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6341getRoundKaPHkGw(), 0, null, 26, null), null, 0, 832, null);
    }

    /* renamed from: ScannedImagePreview-Kz89ssw, reason: not valid java name */
    public static final void m17938ScannedImagePreviewKz89ssw(final float f, final android.net.Uri uri, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1915088932);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(uri) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1915088932, i3, -1, "com.paypal.oslo.feature.qrc.ui.scanner.components.ScannedImagePreview (ScanningOverlay.kt:351)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(modifier, com.paypal.pds.core.ConstantsKt.getSpacing16()), com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenTestTags.SCANNED_IMAGE_PREVIEW);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(uri, "Scanned Image", androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, f), com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24()), null, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), startRestartGroup, ((i3 >> 3) & 14) | 196656, 24);
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.components.ScanningOverlayKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.scanner.components.ScanningOverlayKt.m17936$r8$lambda$Z_FIiTVPffvWuT4sxrnI7_iRA(f, uri, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5R1MzQgiSXmZdRPVgBgxKhJG_bQ(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, boolean z, com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState flashLightState, java.lang.String str, boolean z2, android.net.Uri uri, kotlin.jvm.functions.Function0 function03, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ScanningOverlay(function0, function02, modifier, z, flashLightState, str, z2, uri, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Lp_WdnuMd_gkdIokrnSL0THquMY(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ViewfinderFrame(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VCoIaJBZkUsO02fJeid8nRZ_s5U(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1086990775);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1086990775, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.scanner.components.ScanningOverlayPreview (ScanningOverlay.kt:375)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState flashLightState = com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState.Off;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.components.ScanningOverlayKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.components.ScanningOverlayKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ScanningOverlay(function0, (kotlin.jvm.functions.Function0) rememberedValue2, fillMaxSize$default2, true, flashLightState, null, false, null, null, startRestartGroup, 14380470, 256);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.components.ScanningOverlayKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.scanner.components.ScanningOverlayKt.$r8$lambda$VCoIaJBZkUsO02fJeid8nRZ_s5U(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Z_FIiTVPff-vWuT4sxrnI7_i-RA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17936$r8$lambda$Z_FIiTVPffvWuT4sxrnI7_iRA(float f, android.net.Uri uri, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m17938ScannedImagePreviewKz89ssw(f, uri, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$iMj0MN2tPB-lNPc1wrBneNY_8DU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17937$r8$lambda$iMj0MN2tPBlNPc1wrBneNY_8DU(float f, float f2, float f3, long j, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        float f4 = drawScope.mo1418toPx0680j_4(f);
        com.paypal.oslo.feature.qrc.ui.scanner.components.ViewfinderFrameSpecs calculateViewfinderFrameSpecs = com.paypal.oslo.feature.qrc.ui.scanner.components.ViewFinderFrameKt.calculateViewfinderFrameSpecs(java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32)), java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L)), f4, drawScope.mo1418toPx0680j_4(f2), drawScope.mo1418toPx0680j_4(f3));
        Camera2StreamConfigurationMap(drawScope, j, f4, calculateViewfinderFrameSpecs.getTopLeft());
        Camera2StreamConfigurationMap(drawScope, j, f4, calculateViewfinderFrameSpecs.getTopRight());
        Camera2StreamConfigurationMap(drawScope, j, f4, calculateViewfinderFrameSpecs.getBottomLeft());
        Camera2StreamConfigurationMap(drawScope, j, f4, calculateViewfinderFrameSpecs.getBottomRight());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qptzkFTItjQRsHSzQ_Vokffhd64(androidx.compose.foundation.layout.BoxScope boxScope, float f, java.lang.String str, boolean z, boolean z2, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(boxScope, f, str, z, z2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
