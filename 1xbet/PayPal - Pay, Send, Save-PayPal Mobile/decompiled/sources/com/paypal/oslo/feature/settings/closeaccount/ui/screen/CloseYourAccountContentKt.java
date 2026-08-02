package com.paypal.oslo.feature.settings.closeaccount.ui.screen;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a;\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0012\u001a;\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"CloseYourAccountMapper", "", "items", "", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiItem;", "onIntent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent$UserIntent;", "modifier", "Landroidx/compose/ui/Modifier;", "userInput", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountUserInput;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountUserInput;Landroidx/compose/runtime/Composer;II)V", "CloseYourAccountTopBar", "showBackButton", "", "title", "", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CloseYourAccountFooter", "footer", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;", "isLoading", "(Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "settings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseYourAccountContentKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CloseYourAccountMapper(final java.util.List<? extends com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput closeAccountUserInput, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput closeAccountUserInput2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        final com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput closeAccountUserInput3;
        boolean changedInstance;
        boolean z;
        boolean changedInstance2;
        java.lang.Object rememberedValue;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-211062297);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    closeAccountUserInput2 = closeAccountUserInput;
                    if (startRestartGroup.changedInstance(closeAccountUserInput2)) {
                        i4 = 2048;
                        i3 |= i4;
                    }
                } else {
                    closeAccountUserInput2 = closeAccountUserInput;
                }
                i4 = 1024;
                i3 |= i4;
            } else {
                closeAccountUserInput2 = closeAccountUserInput;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    companion = modifier2;
                } else {
                    companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        closeAccountUserInput3 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput(null, null, null, 7, null);
                        androidx.compose.ui.Modifier modifier4 = companion;
                        int i6 = i3;
                        modifier3 = modifier4;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-211062297, i6, -1, "com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountMapper (CloseYourAccountContent.kt:49)");
                        }
                        androidx.compose.foundation.layout.PaddingValues m1702PaddingValuesa9UjIt4 = androidx.compose.foundation.layout.PaddingKt.m1702PaddingValuesa9UjIt4(com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16());
                        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8());
                        changedInstance = startRestartGroup.changedInstance(list);
                        z = (i6 & 112) == 32;
                        changedInstance2 = startRestartGroup.changedInstance(closeAccountUserInput3);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!(changedInstance | z | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.$r8$lambda$aSFHZc7BQdm789OKd3pAJ9gBGWs(list, function1, closeAccountUserInput3, (androidx.compose.foundation.lazy.LazyListScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput closeAccountUserInput4 = closeAccountUserInput3;
                        androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(modifier3, null, m1702PaddingValuesa9UjIt4, false, m1602spacedBy0680j_4, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, (i6 >> 6) & 14, 490);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        closeAccountUserInput2 = closeAccountUserInput4;
                    }
                }
                closeAccountUserInput3 = closeAccountUserInput2;
                androidx.compose.ui.Modifier modifier42 = companion;
                int i62 = i3;
                modifier3 = modifier42;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.foundation.layout.PaddingValues m1702PaddingValuesa9UjIt42 = androidx.compose.foundation.layout.PaddingKt.m1702PaddingValuesa9UjIt4(com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_42 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8());
                changedInstance = startRestartGroup.changedInstance(list);
                if ((i62 & 112) == 32) {
                }
                changedInstance2 = startRestartGroup.changedInstance(closeAccountUserInput3);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | z | changedInstance2)) {
                }
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.$r8$lambda$aSFHZc7BQdm789OKd3pAJ9gBGWs(list, function1, closeAccountUserInput3, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput closeAccountUserInput42 = closeAccountUserInput3;
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(modifier3, null, m1702PaddingValuesa9UjIt42, false, m1602spacedBy0680j_42, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, (i62 >> 6) & 14, 490);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                closeAccountUserInput2 = closeAccountUserInput42;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                final com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput closeAccountUserInput5 = closeAccountUserInput2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.$r8$lambda$57SrjYCqKCFQNQjWSGI4Y8NTqv8(list, function1, modifier5, closeAccountUserInput5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CloseYourAccountTopBar(final boolean z, final java.lang.String str, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.internal.ComposableLambda composableLambda;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(29537727);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(29537727, i3, -1, "com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountTopBar (CloseYourAccountContent.kt:76)");
                }
                final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.core.common.ui.R.string.core_common_ui_top_bar_back_button_content_description, startRestartGroup, 0);
                if (z) {
                    startRestartGroup.startReplaceGroup(-509455407);
                    composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1053390480, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.$r8$lambda$vl2yKHra0JZkTAnmPyIbqqhm1Qs(stringResource, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-508970009);
                    startRestartGroup.endReplaceGroup();
                    composableLambda = null;
                }
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(str, modifier3, null, null, false, composableLambda, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1579880976, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.$r8$lambda$7Bt26cVbsVwPVHd9kQBKenbGOsY(kotlin.jvm.functions.Function1.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 14) | 1597440 | ((i3 >> 6) & 112), 12);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.$r8$lambda$arEqycpP_xJ2dvGBYqwhkQXvDVc(z, str, function1, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CloseYourAccountFooter(final com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter closeAccountUiFooter, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent, kotlin.Unit> function1, final boolean z, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountUiFooter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(743415533);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(closeAccountUiFooter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier5 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(743415533, i3, -1, "com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountFooter (CloseYourAccountContent.kt:110)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                if (!closeAccountUiFooter.getShowPrimaryButton()) {
                    modifier4 = modifier5;
                    i4 = 0;
                    startRestartGroup.startReplaceGroup(298366751);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(297735374);
                    boolean z2 = (i3 & 14) == 4;
                    boolean z3 = (i3 & 112) == 32;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.$r8$lambda$_gFeZAKEm8EmJFu4ql34emcY0t4(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter.this, function1);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    modifier4 = modifier5;
                    i4 = 0;
                    com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, closeAccountUiFooter.getPrimaryButtonText(), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, z, startRestartGroup, ((i3 << 18) & 234881024) | 1769856, 152);
                    startRestartGroup.endReplaceGroup();
                }
                if (closeAccountUiFooter.getShowSecondaryButton()) {
                    startRestartGroup.startReplaceGroup(298420226);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, i4);
                    int i6 = (i3 & 112) == 32 ? 1 : i4;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (i6 != 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.m19244$r8$lambda$TbyFx806wPrLn2I52stFQ0zHfA(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, closeAccountUiFooter.getSecondaryButtonText(), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, 1769856, 408);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(298786367);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.m19243$r8$lambda$322Mug0xtt4Mo2CA6e2YQxAKzs(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter.this, function1, z, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-322Mug0xtt4Mo2CA6e2YQxAKzs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19243$r8$lambda$322Mug0xtt4Mo2CA6e2YQxAKzs(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter closeAccountUiFooter, kotlin.jvm.functions.Function1 function1, boolean z, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CloseYourAccountFooter(closeAccountUiFooter, function1, z, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$57SrjYCqKCFQNQjWSGI4Y8NTqv8(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput closeAccountUserInput, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CloseYourAccountMapper(list, function1, modifier, closeAccountUserInput, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7Bt26cVbsVwPVHd9kQBKenbGOsY(final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1579880976, i, -1, "com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountTopBar.<anonymous> (CloseYourAccountContent.kt:97)");
            }
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.m19245$r8$lambda$u6NDdYsRrSsTICjOM1G8gpwLc(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton((kotlin.jvm.functions.Function0) rememberedValue, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CF30bk8OpTxqLhE_abqBNDoDyBU(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnBackPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$T-byFx806wPrLn2I52stFQ0zHfA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19244$r8$lambda$TbyFx806wPrLn2I52stFQ0zHfA(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnCanceledPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ypi5bzGKpuWsnHgVOM1MUsRJseI(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_gFeZAKEm8EmJFu4ql34emcY0t4(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter closeAccountUiFooter, kotlin.jvm.functions.Function1 function1) {
        com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent closeAccountEvent;
        int i = com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.WhenMappings.$EnumSwitchMapping$0[closeAccountUiFooter.getPrimaryButtonAction().ordinal()];
        if (i == 1) {
            closeAccountEvent = (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent) com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnContinuePressed.INSTANCE;
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            closeAccountEvent = (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent) com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnCloseAccountClicked.INSTANCE;
        }
        function1.invoke(closeAccountEvent);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aSFHZc7BQdm789OKd3pAJ9gBGWs(final java.util.List list, final kotlin.jvm.functions.Function1 function1, final com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput closeAccountUserInput, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt$CloseYourAccountMapper$lambda$0$0$$inlined$items$default$1 closeYourAccountContentKt$CloseYourAccountMapper$lambda$0$0$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt$CloseYourAccountMapper$lambda$0$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem closeAccountUiItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                return invoke((com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem) obj);
            }
        };
        lazyListScope.items(list.size(), null, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt$CloseYourAccountMapper$lambda$0$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802480018, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt$CloseYourAccountMapper$lambda$0$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem closeAccountUiItem = (com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem) list.get(i);
                composer.startReplaceGroup(-434774454);
                com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountItemMapperKt.CloseAccountItemRenderer(closeAccountUiItem, function1, null, closeAccountUserInput, composer, 0, 4);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$arEqycpP_xJ2dvGBYqwhkQXvDVc(boolean z, java.lang.String str, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CloseYourAccountTopBar(z, str, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$u-6NDdYs-RrSsTICjOM1G8gpwLc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19245$r8$lambda$u6NDdYsRrSsTICjOM1G8gpwLc(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnClosePressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vl2yKHra0JZkTAnmPyIbqqhm1Qs(final java.lang.String str, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1053390480, i, -1, "com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountTopBar.<anonymous> (CloseYourAccountContent.kt:82)");
            }
            com.paypal.pds.core.Icon.ArrowLeft arrowLeft = com.paypal.pds.core.Icon.ArrowLeft.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Medium medium = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed = composer.changed(str);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.$r8$lambda$Ypi5bzGKpuWsnHgVOM1MUsRJseI(str, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
            com.paypal.pds.core.Icon.ArrowLeft arrowLeft2 = arrowLeft;
            boolean changed2 = composer.changed(function1);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseYourAccountContentKt.$r8$lambda$CF30bk8OpTxqLhE_abqBNDoDyBU(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(arrowLeft2, (kotlin.jvm.functions.Function0) rememberedValue2, semantics$default, tertiary, medium, str, null, false, false, composer, 27654, 448);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction.Continue.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction.CloseAccount.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
