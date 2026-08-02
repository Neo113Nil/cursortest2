package com.paypal.oslo.feature.helpcenter.ui.screens;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aI\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0013\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0016\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0014\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"finalIntentHelpOptions", "", "Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData;", "FinalIntentDescription", "", "FinalIntentContent", "", "topic", "Lcom/paypal/oslo/feature/helpcenter/domain/models/ContactTopic;", "articleTitleState", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "onArticleClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/helpcenter/domain/models/ContactTopic;Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "previewTopic", "FinalIntentLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "FinalIntentSuccessPreview", "FinalIntentFailurePreview", "helpcenter_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FinalIntentScreenKt {
    private static final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData> getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData[]{com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.ChatUs.INSTANCE, com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.CallUs.INSTANCE});
    private static final com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic Camera2StreamConfigurationMap = new com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic("dispute", "Open a Dispute", null, null, null, new com.paypal.oslo.feature.helpcenter.domain.models.ContactTopicResource("FAQ1234", null, null, null, 14, null), 28, null);

    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FinalIntentContent(final com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic contactTopic, final com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.lang.String> screenState, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.ui.Modifier modifier5;
        int i5;
        int i6;
        androidx.compose.runtime.Composer composer3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactTopic, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2045560579);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(contactTopic) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(screenState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                if (i7 != 0) {
                    modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2045560579, i4, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentContent (FinalIntentScreen.kt:74)");
                }
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing64(), 7, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), startRestartGroup, 0);
                java.lang.String title = contactTopic.getTitle();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("You selected \"");
                sb.append(title);
                sb.append("\"");
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(sb.toString(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "final_intent_title"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 432, 6, 1016);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("To further assist you, we think this article may be helpful. Otherwise, please select a contact option below.", androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "final_intent_description"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 438, 6, 1016);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                if (screenState instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading) {
                    startRestartGroup.startReplaceGroup(-656988090);
                    modifier4 = modifier2;
                    com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "final_intent_article_loader"), com.paypal.pds.components.LoaderSize.Small.INSTANCE, null, null, startRestartGroup, (com.paypal.pds.components.LoaderSize.Small.$stable << 3) | 6, 12);
                    startRestartGroup.endReplaceGroup();
                    modifier5 = null;
                    i5 = 1;
                    i6 = i4;
                    composer3 = startRestartGroup;
                } else {
                    modifier4 = modifier2;
                    if (screenState instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success) {
                        composer3 = startRestartGroup;
                        composer3.startReplaceGroup(-656775306);
                        com.paypal.oslo.feature.helpcenter.domain.models.ContactTopicResource resource = contactTopic.getResource();
                        final java.lang.String articleId = resource != null ? resource.getArticleId() : null;
                        if (articleId != null) {
                            com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success success = (com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success) screenState;
                            if (!kotlin.text.StringsKt.isBlank((java.lang.CharSequence) success.getData())) {
                                composer3.startReplaceGroup(-656622538);
                                java.lang.String str = (java.lang.String) success.getData();
                                float spacing16 = com.paypal.pds.core.ConstantsKt.getSpacing16();
                                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "final_intent_article_row");
                                boolean z = (i4 & 7168) == 2048;
                                boolean changed = composer3.changed(articleId);
                                java.lang.Object rememberedValue = composer3.rememberedValue();
                                if ((z | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentScreenKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentScreenKt.$r8$lambda$Nn1JRuDNWVCp5N26d88v4O5LGq8(kotlin.jvm.functions.Function1.this, articleId);
                                        }
                                    };
                                    composer3.updateRememberedValue(rememberedValue);
                                }
                                androidx.compose.ui.unit.Dp m8599boximpl = androidx.compose.ui.unit.Dp.m8599boximpl(spacing16);
                                i6 = i4;
                                modifier5 = null;
                                i5 = 1;
                                com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(str, testTag, null, null, null, false, false, null, null, null, null, null, false, (kotlin.jvm.functions.Function0) rememberedValue, m8599boximpl, null, null, null, false, composer3, 48, 0, 499708);
                                composer3.endReplaceGroup();
                                composer3.endReplaceGroup();
                            }
                        }
                        modifier5 = null;
                        i5 = 1;
                        i6 = i4;
                        composer3.startReplaceGroup(-656261605);
                        composer3.endReplaceGroup();
                        composer3.endReplaceGroup();
                    } else {
                        modifier5 = null;
                        i5 = 1;
                        i6 = i4;
                        composer3 = startRestartGroup;
                        if (!(screenState instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure)) {
                            composer3.startReplaceGroup(255899682);
                            composer3.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(-656205805);
                        composer3.endReplaceGroup();
                    }
                }
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer3, 0);
                com.paypal.pds.components.DividerKt.Divider(modifier5, composer3, 0, i5);
                composer2 = composer3;
                com.paypal.oslo.feature.helpcenter.ui.components.HelpOptionsSectionKt.HelpOptionsSection("", getHighSpeedVideoFpsRangesFor, appNavigator, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i5, modifier5), "final_intent_help_options"), composer3, (i6 & 896) | 3078, 0);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentScreenKt.$r8$lambda$soHfssVzReX5UElr3kDbjFhy77k(com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic.this, screenState, appNavigator, function1, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IZuCGvBuCQXKE8pUdfuA51Dck5M(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1361300403);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1361300403, updateChangedFlags, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentSuccessPreview (FinalIntentScreen.kt:169)");
            }
            com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic contactTopic = Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success success = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success("How to open a dispute");
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = new com.paypal.oslo.core.navigation.AppNavigator(null, null, 3, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentScreenKt.$r8$lambda$yEMMrZvkFVVz3c5Na7VGKJUX1U0((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            FinalIntentContent(contactTopic, success, appNavigator, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 3072, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentScreenKt.$r8$lambda$IZuCGvBuCQXKE8pUdfuA51Dck5M(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NXixSc4N8CCqe0QVyazvALyhV6s(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(828502182);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(828502182, updateChangedFlags, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentFailurePreview (FinalIntentScreen.kt:180)");
            }
            com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic contactTopic = Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure failure = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(null, null, 3, null);
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = new com.paypal.oslo.core.navigation.AppNavigator(null, null, 3, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentScreenKt.m14845$r8$lambda$ke5Bww1shcJcu0hxKOiTW_DzXI((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            FinalIntentContent(contactTopic, failure, appNavigator, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 3072, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentScreenKt.$r8$lambda$NXixSc4N8CCqe0QVyazvALyhV6s(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Nn1JRuDNWVCp5N26d88v4O5LGq8(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kcIchOKh_GRnTkDBPfXyTFeU7-k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14844$r8$lambda$kcIchOKh_GRnTkDBPfXyTFeU7k(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ke5Bww1shcJcu0hxKOiTW_DzX-I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14845$r8$lambda$ke5Bww1shcJcu0hxKOiTW_DzXI(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$omTX8KQ-i6uF6NL-YP2bZJOLrPg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14846$r8$lambda$omTX8KQi6uF6NLYP2bZJOLrPg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1582333236);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1582333236, updateChangedFlags, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentLoadingPreview (FinalIntentScreen.kt:158)");
            }
            com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic contactTopic = Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading loading = com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE;
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = new com.paypal.oslo.core.navigation.AppNavigator(null, null, 3, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentScreenKt.m14844$r8$lambda$kcIchOKh_GRnTkDBPfXyTFeU7k((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            FinalIntentContent(contactTopic, loading, appNavigator, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 3120, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.screens.FinalIntentScreenKt.m14846$r8$lambda$omTX8KQi6uF6NLYP2bZJOLrPg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$soHfssVzReX5UElr3kDbjFhy77k(com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic contactTopic, com.paypal.oslo.feature.helpcenter.ui.models.ScreenState screenState, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FinalIntentContent(contactTopic, screenState, appNavigator, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yEMMrZvkFVVz3c5Na7VGKJUX1U0(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }
}
