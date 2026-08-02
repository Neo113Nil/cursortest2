package com.paypal.oslo.feature.businessprofile.ui.landingpage;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001ao\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"SalesToolsScreen", "", "featureGatesProvider", "Lcom/paypal/oslo/feature/businessprofile/ui/provider/SalesToolsUiFeatureGatesProvider;", "modifier", "Landroidx/compose/ui/Modifier;", "onGoToBusinessProfile", "Lkotlin/Function0;", "onGoToCustomers", "onGoToItemList", "onGoToSalesTax", "onGoToInquiries", "(Lcom/paypal/oslo/feature/businessprofile/ui/provider/SalesToolsUiFeatureGatesProvider;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SalesToolsScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "business-profile_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SalesToolsScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SalesToolsScreen(final com.paypal.oslo.feature.businessprofile.ui.provider.SalesToolsUiFeatureGatesProvider salesToolsUiFeatureGatesProvider, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, kotlin.jvm.functions.Function0<kotlin.Unit> function05, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        int i6;
        kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        int i7;
        kotlin.jvm.functions.Function0<kotlin.Unit> function09;
        int i8;
        androidx.compose.ui.Modifier modifier2;
        kotlin.jvm.functions.Function0<kotlin.Unit> function010;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function011;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function012;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function013;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function014;
        kotlin.jvm.functions.Function0<kotlin.Unit> function015;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(salesToolsUiFeatureGatesProvider, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-529822053);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(salesToolsUiFeatureGatesProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function06 = function0;
                i3 |= startRestartGroup.changedInstance(function06) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function07 = function02;
                    i3 |= startRestartGroup.changedInstance(function07) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function08 = function03;
                        i3 |= startRestartGroup.changedInstance(function08) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i) == 0) {
                            function09 = function04;
                            i3 |= startRestartGroup.changedInstance(function09) ? 131072 : 65536;
                            i8 = i2 & 64;
                            if (i8 == 0) {
                                i3 |= 1572864;
                            } else if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changedInstance(function05) ? 1048576 : 524288;
                            }
                            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                function010 = function05;
                                function011 = function07;
                                function012 = function08;
                                function013 = function09;
                            } else {
                                androidx.compose.ui.Modifier.Companion companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if (i4 != 0) {
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsScreenKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    function06 = (kotlin.jvm.functions.Function0) rememberedValue;
                                }
                                if (i5 != 0) {
                                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsScreenKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    function014 = (kotlin.jvm.functions.Function0) rememberedValue2;
                                } else {
                                    function014 = function07;
                                }
                                if (i6 != 0) {
                                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsScreenKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    function015 = (kotlin.jvm.functions.Function0) rememberedValue3;
                                } else {
                                    function015 = function08;
                                }
                                if (i7 != 0) {
                                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsScreenKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    function013 = (kotlin.jvm.functions.Function0) rememberedValue4;
                                } else {
                                    function013 = function09;
                                }
                                if (i8 != 0) {
                                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsScreenKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    function010 = (kotlin.jvm.functions.Function0) rememberedValue5;
                                } else {
                                    function010 = function05;
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-529822053, i3, -1, "com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsScreen (SalesToolsScreen.kt:50)");
                                }
                                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), androidx.compose.ui.unit.Dp.m8601constructorimpl(((com.paypal.oslo.core.navigation.scene.L1ContentInsets) startRestartGroup.consume(com.paypal.oslo.core.navigation.scene.LocalL1ContentInsetsKt.getLocalL1ContentInsets())).m11616getBottomD9Ej5fM() + com.paypal.pds.core.ConstantsKt.getSpacing16())), com.paypal.oslo.feature.businessprofile.constants.BusinessProfileConstants.Test.SALES_TOOLS_SCREEN_TAG);
                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                final kotlin.jvm.functions.Function0<kotlin.Unit> function016 = function06;
                                final kotlin.jvm.functions.Function0<kotlin.Unit> function017 = function014;
                                final kotlin.jvm.functions.Function0<kotlin.Unit> function018 = function015;
                                final kotlin.jvm.functions.Function0<kotlin.Unit> function019 = function013;
                                final kotlin.jvm.functions.Function0<kotlin.Unit> function020 = function010;
                                com.paypal.pds.components.CardKt.Card(null, null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1845146359, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsScreenKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsScreenKt.$r8$lambda$xBwJRq1aIQqbiz_tFXuHue5WvvU(com.paypal.oslo.feature.businessprofile.ui.provider.SalesToolsUiFeatureGatesProvider.this, function016, function017, function018, function019, function020, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306368, 503);
                                startRestartGroup.endNode();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                modifier2 = companion;
                                function012 = function015;
                                function011 = function014;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final androidx.compose.ui.Modifier modifier3 = modifier2;
                                final kotlin.jvm.functions.Function0<kotlin.Unit> function021 = function06;
                                final kotlin.jvm.functions.Function0<kotlin.Unit> function022 = function010;
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsScreenKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsScreenKt.$r8$lambda$WLZl5xefycEPgZoSje4ArXPfY_Q(com.paypal.oslo.feature.businessprofile.ui.provider.SalesToolsUiFeatureGatesProvider.this, modifier3, function021, function011, function012, function013, function022, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        function09 = function04;
                        i8 = i2 & 64;
                        if (i8 == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    function08 = function03;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    function09 = function04;
                    i8 = i2 & 64;
                    if (i8 == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function07 = function02;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function08 = function03;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                function09 = function04;
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function06 = function0;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function07 = function02;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function08 = function03;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            function09 = function04;
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function06 = function0;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function07 = function02;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function08 = function03;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        function09 = function04;
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void SalesToolsScreenPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1097529868);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1097529868, i, -1, "com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsScreenPreview (SalesToolsScreen.kt:177)");
            }
            SalesToolsScreen(new com.paypal.oslo.feature.businessprofile.ui.provider.SalesToolsUiFeatureGatesProvider(true, true, true), null, null, null, null, null, null, startRestartGroup, 0, 126);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsScreenKt.m13374$r8$lambda$GgXwUoQOr6_mlawhVKrFQIUVs(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$GgXwUoQOr6_mla-wh-VKrFQIUVs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13374$r8$lambda$GgXwUoQOr6_mlawhVKrFQIUVs(int i, androidx.compose.runtime.Composer composer, int i2) {
        SalesToolsScreenPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WLZl5xefycEPgZoSje4ArXPfY_Q(com.paypal.oslo.feature.businessprofile.ui.provider.SalesToolsUiFeatureGatesProvider salesToolsUiFeatureGatesProvider, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SalesToolsScreen(salesToolsUiFeatureGatesProvider, modifier, function0, function02, function03, function04, function05, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xBwJRq1aIQqbiz_tFXuHue5WvvU(com.paypal.oslo.feature.businessprofile.ui.provider.SalesToolsUiFeatureGatesProvider salesToolsUiFeatureGatesProvider, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1845146359, i, -1, "com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsScreen.<anonymous>.<anonymous> (SalesToolsScreen.kt:62)");
            }
            androidx.compose.ui.Modifier userIntent = com.paypal.oslo.feature.businessprofile.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.ui.Modifier.INSTANCE, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("business_tools", 0, null, null, 14, null)), "business_tools", "view_business");
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, userIntent);
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
            if (salesToolsUiFeatureGatesProvider.isBusinessProfileAvailable()) {
                composer.startReplaceGroup(-2106569146);
                com.paypal.pds.components.ListKt.ListItemView(new com.paypal.pds.components.ListItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessprofile.R.string.feature_business_profile_sales_tools_manage_business_manage_profile, composer, 0), null, null, null, true, true, null, null, null, null, null, null, null, 8142, null), com.paypal.oslo.feature.businessprofile.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.businessprofile.analytics.UiContextValues.ItemName.BusinessProfileButton, 0, 2, null)), "business_tools", com.paypal.oslo.feature.businessprofile.analytics.UserIntentContextValues.Action.ViewBusinessProfile), false, function0, com.paypal.pds.components.ListStyle.INSTANCE.getDefault(), com.paypal.pds.components.ListAlignment.Center, false, composer, com.paypal.pds.components.ListItem.$stable | 1769472 | (com.paypal.pds.components.ListStyle.$stable << 12), 4);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2105583563);
                composer.endReplaceGroup();
            }
            com.paypal.pds.components.ListKt.ListItemView(new com.paypal.pds.components.ListItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessprofile.R.string.feature_business_profile_sales_tools_manage_business_customers, composer, 0), null, null, null, true, true, null, null, null, null, null, null, null, 8142, null), com.paypal.oslo.feature.businessprofile.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.businessprofile.analytics.UiContextValues.ItemName.CustomersButton, 0, 2, null)), "business_tools", "view_customers"), false, function02, com.paypal.pds.components.ListStyle.INSTANCE.getDefault(), com.paypal.pds.components.ListAlignment.Center, false, composer, com.paypal.pds.components.ListItem.$stable | 1769472 | (com.paypal.pds.components.ListStyle.$stable << 12), 4);
            if (salesToolsUiFeatureGatesProvider.isInventoryFeaturesAvailable()) {
                composer.startReplaceGroup(-2104526742);
                com.paypal.pds.components.ListKt.ListItemView(new com.paypal.pds.components.ListItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessprofile.R.string.feature_business_profile_sales_tools_manage_business_item_list, composer, 0), null, null, null, true, true, null, null, null, null, null, null, null, 8142, null), com.paypal.oslo.feature.businessprofile.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.businessprofile.analytics.UiContextValues.ItemName.ItemListButton, 0, 2, null)), "business_tools", "view_item_list"), false, function03, com.paypal.pds.components.ListStyle.INSTANCE.getDefault(), com.paypal.pds.components.ListAlignment.Center, false, composer, com.paypal.pds.components.ListItem.$stable | 1769472 | (com.paypal.pds.components.ListStyle.$stable << 12), 4);
                com.paypal.pds.components.ListKt.ListItemView(new com.paypal.pds.components.ListItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessprofile.R.string.feature_business_profile_sales_tools_manage_business_sales_tax, composer, 0), null, null, null, true, salesToolsUiFeatureGatesProvider.isInquiriesAvailable(), null, null, null, null, null, null, null, 8142, null), com.paypal.oslo.feature.businessprofile.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.businessprofile.analytics.UiContextValues.ItemName.SalesTaxButton, 0, 2, null)), "business_tools", com.paypal.oslo.feature.businessprofile.analytics.UserIntentContextValues.Action.ViewSalesTax), false, function04, com.paypal.pds.components.ListStyle.INSTANCE.getDefault(), com.paypal.pds.components.ListAlignment.Center, false, composer, com.paypal.pds.components.ListItem.$stable | 1769472 | (com.paypal.pds.components.ListStyle.$stable << 12), 4);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2102548043);
                composer.endReplaceGroup();
            }
            if (salesToolsUiFeatureGatesProvider.isInquiriesAvailable()) {
                composer.startReplaceGroup(-2102433932);
                com.paypal.pds.components.ListKt.ListItemView(new com.paypal.pds.components.ListItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessprofile.R.string.feature_business_profile_sales_tools_manage_business_inquiries, composer, 0), null, null, null, true, false, null, null, null, null, null, null, null, 8174, null), com.paypal.oslo.feature.businessprofile.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.businessprofile.analytics.UiContextValues.ItemName.InquiriesButton, 0, 2, null)), "business_tools", com.paypal.oslo.feature.businessprofile.analytics.UserIntentContextValues.Action.ViewInquiries), false, function05, com.paypal.pds.components.ListStyle.INSTANCE.getDefault(), com.paypal.pds.components.ListAlignment.Center, false, composer, com.paypal.pds.components.ListItem.$stable | 1769472 | (com.paypal.pds.components.ListStyle.$stable << 12), 4);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2101523307);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
