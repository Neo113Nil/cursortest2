package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldImplKt$CommonDecorationBox$3 implements kotlin.jvm.functions.Function6<java.lang.Float, androidx.compose.ui.graphics.Color, androidx.compose.ui.graphics.Color, java.lang.Float, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.material.TextFieldColors Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.layout.PaddingValues getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.foundation.interaction.InteractionSource getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getInputFormats;
    final /* synthetic */ boolean getInputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputMinFrameDuration;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ java.lang.String getOutputSizes;
    final /* synthetic */ boolean getOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getOutputStallDuration;
    final /* synthetic */ androidx.compose.ui.graphics.Shape getOutputStallDurationlomOqCM;
    final /* synthetic */ androidx.compose.material.TextFieldType toString;

    @Override // kotlin.jvm.functions.Function6
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Float f, androidx.compose.ui.graphics.Color color, androidx.compose.ui.graphics.Color color2, java.lang.Float f2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        int i;
        int i2;
        boolean z;
        androidx.compose.runtime.internal.ComposableLambda composableLambda;
        androidx.compose.runtime.internal.ComposableLambda composableLambda2;
        androidx.compose.runtime.internal.ComposableLambda composableLambda3;
        androidx.compose.runtime.internal.ComposableLambda composableLambda4;
        final float floatValue = f.floatValue();
        final long m6006unboximpl = color.m6006unboximpl();
        final long m6006unboximpl2 = color2.m6006unboximpl();
        final float floatValue2 = f2.floatValue();
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            i = (composer2.changed(floatValue) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= composer2.changed(m6006unboximpl) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i |= composer2.changed(m6006unboximpl2) ? 256 : 128;
        }
        if ((intValue & 3072) == 0) {
            i |= composer2.changed(floatValue2) ? 2048 : 1024;
        }
        int i3 = i;
        if (!composer2.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(33336375, i3, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:128)");
            }
            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.getOutputFormats;
            if (function2 == null) {
                composer2.startReplaceGroup(986681709);
                composer2.endReplaceGroup();
                i2 = 54;
                z = true;
                composableLambda = null;
            } else {
                composer2.startReplaceGroup(986681710);
                final boolean z2 = this.getOutputSizeshNQ4ISI;
                i2 = 54;
                z = true;
                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(723429411, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.getHighSpeedVideoFpsRanges(floatValue, m6006unboximpl2, function2, z2, m6006unboximpl, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer2, 54);
                composer2.endReplaceGroup();
                composableLambda = rememberComposableLambda;
            }
            if (this.getOutputMinFrameDuration != null && this.getOutputSizes.length() == 0 && floatValue2 > 0.0f) {
                composer2.startReplaceGroup(987666549);
                final androidx.compose.material.TextFieldColors textFieldColors = this.Camera2StreamConfigurationMap;
                final boolean z3 = this.getHighSpeedVideoSizes;
                final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.getOutputMinFrameDuration;
                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-426706263, z, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.getHighSpeedVideoFpsRanges(floatValue2, textFieldColors, z3, function22, (androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, composer2, i2);
                composer2.endReplaceGroup();
                composableLambda2 = rememberComposableLambda2;
            } else {
                composer2.startReplaceGroup(988093542);
                composer2.endReplaceGroup();
                composableLambda2 = null;
            }
            final long m6006unboximpl3 = this.Camera2StreamConfigurationMap.leadingIconColor(this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, composer2, 0).getValue().m6006unboximpl();
            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = this.getInputFormats;
            if (function23 == null) {
                composer2.startReplaceGroup(988282301);
                composer2.endReplaceGroup();
                composableLambda3 = null;
            } else {
                composer2.startReplaceGroup(988282302);
                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-317090443, z, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.getHighSpeedVideoFpsRanges(m6006unboximpl3, function23, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer2, i2);
                composer2.endReplaceGroup();
                composableLambda3 = rememberComposableLambda3;
            }
            final long m6006unboximpl4 = this.Camera2StreamConfigurationMap.trailingIconColor(this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, composer2, 0).getValue().m6006unboximpl();
            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = this.getOutputMinFrameDurationlomOqCM;
            if (function24 == null) {
                composer2.startReplaceGroup(988575964);
                composer2.endReplaceGroup();
                composableLambda4 = null;
            } else {
                composer2.startReplaceGroup(988575965);
                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda4 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(262889693, z, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.getHighSpeedVideoSizes(m6006unboximpl4, function24, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer2, i2);
                composer2.endReplaceGroup();
                composableLambda4 = rememberComposableLambda4;
            }
            androidx.compose.ui.Modifier m1285backgroundbw27NRU = androidx.compose.foundation.BackgroundKt.m1285backgroundbw27NRU(androidx.compose.ui.Modifier.INSTANCE, this.Camera2StreamConfigurationMap.backgroundColor(this.getHighSpeedVideoSizes, composer2, 0).getValue().m6006unboximpl(), this.getOutputStallDurationlomOqCM);
            int i4 = androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.WhenMappings.$EnumSwitchMapping$0[this.toString.ordinal()];
            if (i4 == z) {
                composer2.startReplaceGroup(988856360);
                androidx.compose.material.TextFieldKt.TextFieldLayout(m1285backgroundbw27NRU, this.getHighResolutionOutputSizeshNQ4ISI, composableLambda, composableLambda2, composableLambda3, composableLambda4, this.getOutputStallDuration, floatValue, this.getHighSpeedVideoFpsRangesFor, composer2, (i3 << 21) & 29360128);
                composer2.endReplaceGroup();
            } else {
                if (i4 != 2) {
                    composer2.startReplaceGroup(1971561250);
                    composer2.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer2.startReplaceGroup(989436742);
                java.lang.Object rememberedValue = composer2.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Size.m5809boximpl(androidx.compose.ui.geometry.Size.INSTANCE.m5830getZeroNHjbRc()), null, 2, null);
                    composer2.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                final androidx.compose.foundation.layout.PaddingValues paddingValues = this.getHighSpeedVideoFpsRangesFor;
                final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function25 = this.getHighSpeedVideoFpsRanges;
                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda5 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1107746014, z, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState.this, paddingValues, function25, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer2, i2);
                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function26 = this.getHighResolutionOutputSizeshNQ4ISI;
                boolean z4 = this.getOutputStallDuration;
                boolean z5 = (i3 & 14) == 4;
                java.lang.Object rememberedValue2 = composer2.rememberedValue();
                if (z5 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.getHighSpeedVideoSizes(floatValue, mutableState, (androidx.compose.ui.geometry.Size) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.material.OutlinedTextFieldKt.OutlinedTextFieldLayout(m1285backgroundbw27NRU, function26, composableLambda2, composableLambda, composableLambda3, composableLambda4, z4, floatValue, (kotlin.jvm.functions.Function1) rememberedValue2, rememberComposableLambda5, this.getHighSpeedVideoFpsRangesFor, composer2, ((i3 << 21) & 29360128) | 805306368, 0);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(float f, androidx.compose.material.TextFieldColors textFieldColors, boolean z, kotlin.jvm.functions.Function2 function2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changed(modifier) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-426706263, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:151)");
            }
            androidx.compose.ui.Modifier alpha = androidx.compose.ui.draw.AlphaKt.alpha(modifier, f);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, alpha);
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
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.material.TextFieldImplKt.m2820DecorationeuL9pac(textFieldColors.placeholderColor(z, composer, 0).getValue().m6006unboximpl(), androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer, 6).getSubtitle1(), null, function2, composer, 0, 4);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(float f, androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.geometry.Size size) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (size.m5826unboximpl() >> 32)) * f;
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (size.m5826unboximpl() & 4294967295L)) * f;
        if (java.lang.Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.Size) mutableState.getValue()).m5826unboximpl() >> 32)) != intBitsToFloat || java.lang.Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.Size) mutableState.getValue()).m5826unboximpl() & 4294967295L)) != intBitsToFloat2) {
            mutableState.setValue(androidx.compose.ui.geometry.Size.m5809boximpl(androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L))));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(long j, kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(262889693, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:170)");
            }
            androidx.compose.material.TextFieldImplKt.m2820DecorationeuL9pac(j, null, null, function2, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(long j, kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-317090443, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:164)");
            }
            androidx.compose.material.TextFieldImplKt.m2820DecorationeuL9pac(j, null, null, function2, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(float f, long j, kotlin.jvm.functions.Function2 function2, boolean z, long j2, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.ui.text.TextStyle textStyle;
        androidx.compose.ui.text.TextStyle m8065copyp1EtxEg;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(723429411, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:131)");
            }
            androidx.compose.ui.text.TextStyle lerp = androidx.compose.ui.text.TextStyleKt.lerp(androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer, 6).getSubtitle1(), androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer, 6).getCaption(), f);
            if (z) {
                m8065copyp1EtxEg = lerp.m8065copyp1EtxEg((r48 & 1) != 0 ? lerp.spanStyle.m7982getColor0d7_KjU() : j2, (r48 & 2) != 0 ? lerp.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? lerp.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? lerp.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? lerp.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? lerp.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? lerp.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? lerp.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? lerp.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? lerp.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? lerp.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? lerp.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? lerp.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? lerp.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? lerp.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? lerp.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? lerp.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? lerp.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? lerp.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? lerp.platformStyle : null, (r48 & 1048576) != 0 ? lerp.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? lerp.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? lerp.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? lerp.paragraphStyle.getTextMotion() : null);
                textStyle = m8065copyp1EtxEg;
            } else {
                textStyle = lerp;
            }
            androidx.compose.material.TextFieldImplKt.m2820DecorationeuL9pac(j, textStyle, null, function2, composer, 384, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState mutableState, androidx.compose.foundation.layout.PaddingValues paddingValues, kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1107746014, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:193)");
            }
            androidx.compose.ui.Modifier m2690outlineCutout12SF9DM = androidx.compose.material.OutlinedTextFieldKt.m2690outlineCutout12SF9DM(androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material.OutlinedTextFieldKt.BorderId), ((androidx.compose.ui.geometry.Size) mutableState.getValue()).m5826unboximpl(), paddingValues);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m2690outlineCutout12SF9DM);
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
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            if (function2 == null) {
                composer.startReplaceGroup(-1295979683);
            } else {
                composer.startReplaceGroup(235288868);
                function2.invoke(composer, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.material.TextFieldType.values().length];
            try {
                iArr[androidx.compose.material.TextFieldType.Filled.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.material.TextFieldType.Outlined.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    TextFieldImplKt$CommonDecorationBox$3(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, java.lang.String str, androidx.compose.material.TextFieldColors textFieldColors, boolean z, boolean z2, androidx.compose.foundation.interaction.InteractionSource interactionSource, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, androidx.compose.ui.graphics.Shape shape, androidx.compose.material.TextFieldType textFieldType, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25, boolean z3, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z4, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26) {
        this.getOutputFormats = function2;
        this.getOutputMinFrameDuration = function22;
        this.getOutputSizes = str;
        this.Camera2StreamConfigurationMap = textFieldColors;
        this.getHighSpeedVideoSizes = z;
        this.getInputSizeshNQ4ISI = z2;
        this.getHighSpeedVideoSizesFor = interactionSource;
        this.getInputFormats = function23;
        this.getOutputMinFrameDurationlomOqCM = function24;
        this.getOutputStallDurationlomOqCM = shape;
        this.toString = textFieldType;
        this.getHighResolutionOutputSizeshNQ4ISI = function25;
        this.getOutputStallDuration = z3;
        this.getHighSpeedVideoFpsRangesFor = paddingValues;
        this.getOutputSizeshNQ4ISI = z4;
        this.getHighSpeedVideoFpsRanges = function26;
    }
}
