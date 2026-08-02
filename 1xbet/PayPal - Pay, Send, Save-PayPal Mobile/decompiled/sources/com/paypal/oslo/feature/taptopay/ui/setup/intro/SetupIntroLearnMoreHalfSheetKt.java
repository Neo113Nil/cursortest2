package com.paypal.oslo.feature.taptopay.ui.setup.intro;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a/\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0001¢\u0006\u0002\u0010\r\u001a5\u0010\u000e\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0001¢\u0006\u0002\u0010\u0011\u001a\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0001¢\u0006\u0002\u0010\u0013\u001a\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0001¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0015\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"SetupEducationLearnMoreTitleTestTag", "", "SetupEducationLearnMoreAccordionTestTag", "SetupEducationLearnMoreOkButtonTestTag", "SetupIntroLearnMoreHalfSheet", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "faqItems", "", "Lcom/paypal/oslo/feature/taptopay/ui/setup/intro/FaqItem;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "SetupIntroLearnMoreContent", "onClose", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "setupFaqItems", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "onboardingFaqItems", "SetupIntroLearnMoreContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "taptopay_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SetupIntroLearnMoreHalfSheetKt {
    public static final java.lang.String SetupEducationLearnMoreAccordionTestTag = "setup_education_learn_more_accordion";
    public static final java.lang.String SetupEducationLearnMoreOkButtonTestTag = "setup_education_learn_more_ok_button";
    public static final java.lang.String SetupEducationLearnMoreTitleTestTag = "setup_education_learn_more_title";

    public static final void SetupIntroLearnMoreHalfSheet(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem> list, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1515508041);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i5 != 0) {
                list = kotlin.collections.CollectionsKt.emptyList();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1515508041, i3, -1, "com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheet (SetupIntroLearnMoreHalfSheet.kt:76)");
            }
            boolean z = (i3 & 14) == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt.$r8$lambda$tPgZURn_QRp9A00fAkQije7E3Zs(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SetupIntroLearnMoreContent((kotlin.jvm.functions.Function0) rememberedValue, modifier, list, startRestartGroup, i3 & 1008, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem> list2 = list;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt.$r8$lambda$UAIJYtaYeoPoWM12Ay8XVmz9cg8(com.paypal.oslo.core.navigation.AppNavigator.this, modifier2, list2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SetupIntroLearnMoreContent(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem> list, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem> list2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem> list3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(417182582);
        int i5 = (i & 6) == 0 ? (startRestartGroup.changedInstance(function0) ? 4 : 2) | i : i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i5 |= 384;
            } else if ((i & 384) == 0) {
                list2 = list;
                i5 |= startRestartGroup.changedInstance(list2) ? 256 : 128;
                i4 = i5;
                if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    list3 = list2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem> emptyList = i3 != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(417182582, i4, -1, "com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreContent (SetupIntroLearnMoreHalfSheet.kt:97)");
                    }
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        int size = emptyList.size();
                        java.lang.Boolean[] boolArr = new java.lang.Boolean[size];
                        for (int i7 = 0; i7 < size; i7++) {
                            boolArr[i7] = java.lang.Boolean.FALSE;
                        }
                        rememberedValue = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf(boolArr);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue;
                    androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(com.paypal.pds.core.ModifierExtensionsKt.background(modifier4, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, ((i4 >> 3) & 14) | 48, 2), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
                    com.paypal.pds.components.HeaderKt.Header(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_learn_more_sheet_title, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, SetupEducationLearnMoreTitleTestTag), (java.lang.String) null, (java.lang.String) null, (com.paypal.pds.components.HeaderContentAlignment) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, 48, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), SetupEducationLearnMoreAccordionTestTag);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt.$r8$lambda$Kp6d1ENahc8EZ2Q2YV4PdklsJ_M((com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt.$r8$lambda$hyp9vxmnttC0r7koxmCoptSFQls((com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt.$r8$lambda$Kurs4DA8Il4rbevoT_F6gzTRJlg(androidx.compose.runtime.snapshots.SnapshotStateList.this, (com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem) obj));
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt.$r8$lambda$UV8FmJKM7fKBA_p5D9sh_HSO1jA(androidx.compose.runtime.snapshots.SnapshotStateList.this, (com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    com.paypal.pds.components.AccordionKt.Accordion(emptyList, function1, function12, function13, testTag, null, null, (kotlin.jvm.functions.Function2) rememberedValue5, true, null, startRestartGroup, ((i4 >> 6) & 14) | 113274288, androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_DRAW_PATH);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                    int i8 = (i4 & 14) | 1769472;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_setup_education_learn_more_ok, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 7, null), SetupEducationLearnMoreOkButtonTestTag), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, i8, 408);
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    list3 = emptyList;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt.m20209$r8$lambda$j04dqe1DTAipZXglHu7S2MSLgs(kotlin.jvm.functions.Function0.this, modifier3, list3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            list2 = list;
            i4 = i5;
            if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        list2 = list;
        i4 = i5;
        if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem> setupFaqItems(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1023134999, i, -1, "com.paypal.oslo.feature.taptopay.ui.setup.intro.setupFaqItems (SetupIntroLearnMoreHalfSheet.kt:152)");
        }
        java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem> onboardingFaqItems = onboardingFaqItems(composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return onboardingFaqItems;
    }

    public static final java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem> onboardingFaqItems(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(168307037, i, -1, "com.paypal.oslo.feature.taptopay.ui.setup.intro.onboardingFaqItems (SetupIntroLearnMoreHalfSheet.kt:158)");
        }
        java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem[]{new com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem(0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_learn_more_sheet_q1, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_learn_more_sheet_a1, composer, 0)), new com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem(1, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_learn_more_sheet_q2, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_learn_more_sheet_a2, composer, 0)), new com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem(2, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_learn_more_sheet_q3, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_learn_more_sheet_a3, composer, 0)), new com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem(3, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_learn_more_sheet_q4, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_learn_more_sheet_a4, composer, 0)), new com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem(4, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_learn_more_sheet_q5, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_learn_more_sheet_a5, composer, 0)), new com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem(5, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_learn_more_sheet_q6, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_intro_learn_more_sheet_a6, composer, 0))});
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return listOf;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$Kp6d1ENahc8EZ2Q2YV4PdklsJ_M(com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem faqItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faqItem, "");
        return faqItem.getQuestion();
    }

    public static /* synthetic */ boolean $r8$lambda$Kurs4DA8Il4rbevoT_F6gzTRJlg(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem faqItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faqItem, "");
        return ((java.lang.Boolean) snapshotStateList.get(faqItem.getIndex())).booleanValue();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UAIJYtaYeoPoWM12Ay8XVmz9cg8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, java.util.List list, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SetupIntroLearnMoreHalfSheet(appNavigator, modifier, list, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UV8FmJKM7fKBA_p5D9sh_HSO1jA(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem faqItem, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faqItem, "");
        snapshotStateList.set(faqItem.getIndex(), java.lang.Boolean.valueOf(!((java.lang.Boolean) snapshotStateList.get(faqItem.getIndex())).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$h4ovsjmKFoa-HaFM6OE_R4af-AI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20208$r8$lambda$h4ovsjmKFoaHaFM6OE_R4afAI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$hyp9vxmnttC0r7koxmCoptSFQls(com.paypal.oslo.feature.taptopay.ui.setup.intro.FaqItem faqItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faqItem, "");
        return faqItem.getAnswer();
    }

    /* renamed from: $r8$lambda$j04dqe1DTAipZXglHu7-S2MSLgs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20209$r8$lambda$j04dqe1DTAipZXglHu7S2MSLgs(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, java.util.List list, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SetupIntroLearnMoreContent(function0, modifier, list, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mRf8cbHyUKJno7k22EY1knlNKk8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1658441599);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1658441599, updateChangedFlags, -1, "com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreContentPreview (SetupIntroLearnMoreHalfSheet.kt:193)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SetupIntroLearnMoreContent((kotlin.jvm.functions.Function0) rememberedValue, null, onboardingFaqItems(startRestartGroup, 0), startRestartGroup, 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt.$r8$lambda$mRf8cbHyUKJno7k22EY1knlNKk8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tPgZURn_QRp9A00fAkQije7E3Zs(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroLearnMoreHalfSheetKt.m20208$r8$lambda$h4ovsjmKFoaHaFM6OE_R4afAI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
