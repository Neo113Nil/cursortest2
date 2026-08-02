package com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, d2 = {"MosaicBottomSheetField", "", "label", "", "addresses", "", "Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicAddress;", "selectedAddress", "onSelectedAddressChange", "Lkotlin/Function1;", "onAddAddressClick", "Lkotlin/Function0;", "onEditAddressClick", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicAddress;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "mosaic_prodRelease", "isBottomSheetVisible", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicBottomSheetFieldKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MosaicBottomSheetField(final java.lang.String str, final java.util.List<com.paypal.oslo.feature.mosaic.api.navigation.MosaicAddress> list, final com.paypal.oslo.feature.mosaic.api.navigation.MosaicAddress mosaicAddress, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.api.navigation.MosaicAddress, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        kotlin.jvm.functions.Function0<kotlin.Unit> function09;
        final androidx.compose.runtime.MutableState mutableState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1586173591);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(mosaicAddress) : startRestartGroup.changedInstance(mosaicAddress) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            function03 = function0;
            i3 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                function04 = function02;
                i3 |= startRestartGroup.changedInstance(function04) ? 131072 : 65536;
                i5 = i3;
                if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    function05 = function03;
                    function06 = function04;
                } else {
                    if (i6 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function07 = (kotlin.jvm.functions.Function0) rememberedValue;
                    } else {
                        function07 = function03;
                    }
                    if (i4 != 0) {
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        function04 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1586173591, i5, -1, "com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetField (MosaicBottomSheetField.kt:69)");
                    }
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue3;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new com.paypal.pds.components.BottomSheetController();
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue4;
                    androidx.compose.runtime.MutableState mutableState3 = mutableState2;
                    boolean booleanValue = ((java.lang.Boolean) mutableState3.getValue()).booleanValue();
                    boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
                    com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt$MosaicBottomSheetField$3$1 rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt$MosaicBottomSheetField$3$1(bottomSheetController, mutableState2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    java.lang.String onLineLabel = mosaicAddress.getOnLineLabel();
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt.m15786$r8$lambda$1dRuBgkNCnXN6BVH2dhbqTwo3g((java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue6;
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt.m15790$r8$lambda$pU88ytu8kddp4ztltDnl9BnJg(androidx.compose.runtime.MutableState.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    kotlin.jvm.functions.Function0<kotlin.Unit> function010 = function04;
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function011 = function07;
                    com.paypal.pds.components.TextInputKt.ClickableTextInput(onLineLabel, function12, fillMaxWidth$default, (kotlin.jvm.functions.Function0) rememberedValue7, str, null, null, true, true, null, null, null, false, null, null, null, null, com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.ComposableSingletons$MosaicBottomSheetFieldKt.INSTANCE.getLambda$915156269$mosaic_prodRelease(), startRestartGroup, ((i5 << 12) & 57344) | 113249712, 12582912, 130656);
                    composer2 = startRestartGroup;
                    androidx.compose.ui.text.AnnotatedString annotatedString = new androidx.compose.ui.text.AnnotatedString(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_edit_address, composer2, 0), null, 2, null);
                    androidx.compose.ui.text.TextStyle textStyle = new androidx.compose.ui.text.TextStyle(com.paypal.pds.core.Color.ContentLink.INSTANCE.getValue(composer2, 6), 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline(), (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, 0L, (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, (androidx.compose.ui.text.style.LineHeightStyle) null, 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 16773118, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8());
                    boolean z = (i5 & 458752) == 131072;
                    java.lang.Object rememberedValue8 = composer2.rememberedValue();
                    if (z || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        function08 = function010;
                        rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt.m15789$r8$lambda$oBLEd7bKAHkNrXC_xTIn7RtFWM(kotlin.jvm.functions.Function0.this, ((java.lang.Integer) obj).intValue());
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue8);
                    } else {
                        function08 = function010;
                    }
                    androidx.compose.foundation.text.ClickableTextKt.m2012ClickableText4YKlhWE(annotatedString, m1706padding3ABfNKs, textStyle, false, 0, 0, null, (kotlin.jvm.functions.Function1) rememberedValue8, composer2, 0, 120);
                    composer2.endNode();
                    if (((java.lang.Boolean) mutableState3.getValue()).booleanValue()) {
                        composer2.startReplaceGroup(-465444829);
                        java.lang.Object rememberedValue9 = composer2.rememberedValue();
                        if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            mutableState = mutableState2;
                            rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt.$r8$lambda$vPU3av2YFMdbYPekPEbPgbWBTHk(androidx.compose.runtime.MutableState.this);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue9);
                        } else {
                            mutableState = mutableState2;
                        }
                        kotlin.jvm.functions.Function0 function012 = (kotlin.jvm.functions.Function0) rememberedValue9;
                        com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null);
                        java.lang.Object rememberedValue10 = composer2.rememberedValue();
                        if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt.$r8$lambda$41FifJTnrTNQNHNoye1Jhk5y_e4(androidx.compose.runtime.MutableState.this);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue10);
                        }
                        function09 = function011;
                        com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function012, topNavConfig, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue10, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2034272437, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt.$r8$lambda$8iOHI6ZrJGCICLZ1cU8NmBS5l_w(kotlin.jvm.functions.Function0.this, list, mosaicAddress, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, composer2, 54), composer2, (com.paypal.pds.components.TopNavConfig.$stable << 6) | com.paypal.pds.components.BottomSheetController.$stable | 806879280, 440);
                        composer2.endReplaceGroup();
                    } else {
                        function09 = function011;
                        composer2.startReplaceGroup(-462809767);
                        composer2.endReplaceGroup();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function05 = function09;
                    function06 = function08;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt.m15787$r8$lambda$Ao71YqEurxcFeaNl_7bSrGkZwM(str, list, mosaicAddress, function1, function05, function06, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function04 = function02;
            i5 = i3;
            if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function03 = function0;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        function04 = function02;
        i5 = i3;
        if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$1dRuBgkN-CnXN6BVH2dhbqTwo3g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15786$r8$lambda$1dRuBgkNCnXN6BVH2dhbqTwo3g(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$41FifJTnrTNQNHNoye1Jhk5y_e4(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8iOHI6ZrJGCICLZ1cU8NmBS5l_w(final kotlin.jvm.functions.Function0 function0, java.util.List list, com.paypal.oslo.feature.mosaic.api.navigation.MosaicAddress mosaicAddress, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2034272437, i, -1, "com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetField.<anonymous> (MosaicBottomSheetField.kt:123)");
            }
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1710paddingqDBjuR0$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.feature.mosaic.ui.components.MosaicTextLabelKt.MosaicTextLabel(new com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel("body1", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_change_address, composer, 0), "HEADING", null, "MEDIUM", "LEFT", null, null, null, 456, null), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), composer, 0, 0);
            com.paypal.oslo.feature.mosaic.ui.components.MosaicTextLabelKt.MosaicTextLabel(new com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel("body2", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_use_the_address_that_s_shown_on_your_government_id, composer, 0), "BODY", null, "MEDIUM", "LEFT", null, null, null, 456, null), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), composer, 0, 0);
            androidx.compose.ui.text.AnnotatedString annotatedString = new androidx.compose.ui.text.AnnotatedString(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_add_address, composer, 0), null, 2, null);
            androidx.compose.ui.text.TextStyle textStyle = new androidx.compose.ui.text.TextStyle(com.paypal.pds.core.Color.ContentLink.INSTANCE.getValue(composer, 6), 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline(), (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8446getLefte0LSkKk(), 0, 0L, (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, (androidx.compose.ui.text.style.LineHeightStyle) null, 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 16740350, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4());
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt.$r8$lambda$qaiTBpGOeD9LprGT6Ail4c72obE(kotlin.jvm.functions.Function0.this, ((java.lang.Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.text.ClickableTextKt.m2012ClickableText4YKlhWE(annotatedString, m1706padding3ABfNKs, textStyle, false, 0, 0, null, (kotlin.jvm.functions.Function1) rememberedValue, composer, 0, 120);
            composer.startReplaceGroup(-1468738411);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                final com.paypal.oslo.feature.mosaic.api.navigation.MosaicAddress mosaicAddress2 = (com.paypal.oslo.feature.mosaic.api.navigation.MosaicAddress) it.next();
                boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(mosaicAddress2, mosaicAddress);
                boolean changed2 = composer.changed(function1);
                boolean changedInstance = composer.changedInstance(mosaicAddress2);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if ((changed2 | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicBottomSheetFieldKt.$r8$lambda$p58RK8O5JOh_6CIOup2nEekmeEM(kotlin.jvm.functions.Function1.this, mosaicAddress2);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.mosaic.ui.components.addressbottomsheet.MosaicAddressItemKt.MosaicAddressItem(mosaicAddress2, areEqual, (kotlin.jvm.functions.Function0) rememberedValue2, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), composer, com.paypal.oslo.feature.mosaic.api.navigation.MosaicAddress.$stable | 3072, 0);
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

    /* renamed from: $r8$lambda$Ao71YqEurxcFeaNl_7bSrGkZw-M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15787$r8$lambda$Ao71YqEurxcFeaNl_7bSrGkZwM(java.lang.String str, java.util.List list, com.paypal.oslo.feature.mosaic.api.navigation.MosaicAddress mosaicAddress, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MosaicBottomSheetField(str, list, mosaicAddress, function1, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$o-BLEd7bKAHkNrXC_xTIn7RtFWM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15789$r8$lambda$oBLEd7bKAHkNrXC_xTIn7RtFWM(kotlin.jvm.functions.Function0 function0, int i) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p58RK8O5JOh_6CIOup2nEekmeEM(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.mosaic.api.navigation.MosaicAddress mosaicAddress) {
        function1.invoke(mosaicAddress);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$pU88yt-u8kddp4ztlt-Dnl9BnJg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15790$r8$lambda$pU88ytu8kddp4ztltDnl9BnJg(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qaiTBpGOeD9LprGT6Ail4c72obE(kotlin.jvm.functions.Function0 function0, int i) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vPU3av2YFMdbYPekPEbPgbWBTHk(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }
}
