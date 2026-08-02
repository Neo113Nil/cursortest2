package com.paypal.oslo.feature.directdeposit.ui.summary.composable;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003¢\u0006\u0002\u0010\u0010\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00160\u000eH\u0002\u001aB\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00182\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002\u001a \u0010\u001f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0014H\u0000¨\u0006\""}, d2 = {"FaqAccordionCard", "", "isDirectDepositInfoExpanded", "", "isDirectDebitInfoExpanded", "onDirectDepositToggle", "Lkotlin/Function0;", "onDirectDebitToggle", "context", "Landroid/content/Context;", "modifier", "Landroidx/compose/ui/Modifier;", "(ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroid/content/Context;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "buildFaqItems", "", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/composable/FaqItem;", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "buildRichTextWithLinks", "Lcom/paypal/pds/core/RichText;", "content", "", "links", "Lkotlin/Pair;", "findNonOverlappingMatch", "Lkotlin/Triple;", "", "linkText", "linkUrl", "processedRanges", "", "Lkotlin/ranges/IntRange;", "handleFaqLinkClick", "hasLinks", "url", "directdeposit_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FaqAccordionCardKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FaqAccordionCard(final boolean z, final boolean z2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final android.content.Context context, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z3;
        java.lang.Object listOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1472064467);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(context) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if (startRestartGroup.shouldExecute((i3 & 74899) == 74898, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1472064467, i3, -1, "com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCard (FaqAccordionCard.kt:55)");
                }
                int i5 = i3;
                androidx.compose.ui.Modifier modifier4 = modifier3;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), "directDepositScreenHowItWorksCard");
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
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(437534485, 0, -1, "com.paypal.oslo.feature.directdeposit.ui.summary.composable.buildFaqItems (FaqAccordionCard.kt:111)");
                }
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_faq_howdirectdepositworks_title, startRestartGroup, 0);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_faq_howdirectdebitworks_title, startRestartGroup, 0);
                final java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_faq_howdirectdepositworks_content, startRestartGroup, 0);
                java.lang.Object stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_faq_howdirectdepositworks_link_programbanks, startRestartGroup, 0);
                java.lang.Object stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_faq_howdirectdepositworks_link_programbank, startRestartGroup, 0);
                java.lang.Object stringResource6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_faq_howdirectdepositworks_link_terms, startRestartGroup, 0);
                java.lang.Object stringResource7 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_faq_howdirectdebitworks_link_useragreement, startRestartGroup, 0);
                java.lang.Object stringResource8 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_faq_howdirectdepositworks_link_learnmore, startRestartGroup, 0);
                final java.lang.String stringResource9 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_faq_howdirectdebitworks_content, startRestartGroup, 0);
                boolean changed = startRestartGroup.changed(stringResource);
                boolean changed2 = startRestartGroup.changed(stringResource2);
                boolean changed3 = startRestartGroup.changed(stringResource3);
                boolean changed4 = startRestartGroup.changed(stringResource9);
                boolean changed5 = startRestartGroup.changed(stringResource4);
                boolean changed6 = startRestartGroup.changed(stringResource5);
                boolean changed7 = startRestartGroup.changed(stringResource6);
                boolean changed8 = startRestartGroup.changed(stringResource7);
                boolean changed9 = startRestartGroup.changed(stringResource8);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (((changed | changed2 | changed3 | changed4 | changed5 | changed6 | changed7 | changed8) || changed9) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    z3 = false;
                    final java.util.List listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to(stringResource4, "https://www.paypal.com/us/legalhub/paypal/program-banks-tnc"), kotlin.TuplesKt.to(stringResource5, "https://www.paypal.com/us/legalhub/paypal/program-banks-tnc"), kotlin.TuplesKt.to(stringResource6, "https://www.paypal.com/us/legalhub/paypal/pp-balance-tnc"), kotlin.TuplesKt.to(stringResource8, "https://www.paypal.com/us/legalhub/paypal/pp-balance-tnc")});
                    com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem faqItem = new com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem(stringResource, com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCardKt.$r8$lambda$jO8Z5HrBMSGkJ7MTWo313hjQCMA(listOf2, stringResource3, (com.paypal.pds.core.Builder) obj);
                        }
                    }), "directDepositScreenHowDirectDepositWorks", true);
                    final java.util.List listOf3 = kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(stringResource7, com.paypal.oslo.feature.directdeposit.constants.DirectDepositConstants.Urls.USER_AGREEMENT));
                    listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem[]{faqItem, new com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem(stringResource2, com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCardKt.$r8$lambda$jO8Z5HrBMSGkJ7MTWo313hjQCMA(listOf3, stringResource9, (com.paypal.pds.core.Builder) obj);
                        }
                    }), "directDepositScreenHowDirectDebitWorks", true)});
                    startRestartGroup.updateRememberedValue(listOf);
                } else {
                    listOf = rememberedValue;
                    z3 = false;
                }
                java.util.List list = (java.util.List) listOf;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                boolean z4 = (i5 & 14) == 4 ? true : z3;
                boolean z5 = (i5 & 112) == 32 ? true : z3;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((z4 | z5) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCardKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCardKt.m14766$r8$lambda$Et94506SZM6QJsujkQfN1YKQMI(z, z2, (com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem) obj));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                boolean z6 = (i5 & 896) == 256 ? true : z3;
                if ((i5 & 7168) == 2048) {
                    z3 = true;
                }
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((z6 | z3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCardKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCardKt.$r8$lambda$ot2S08jy1XoOpQzubgtL7fRQg9E(kotlin.jvm.functions.Function0.this, function02, (com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.pds.components.AccordionKt.Accordion(list, function1, m1708paddingVpY3zN4$default, (kotlin.jvm.functions.Function2) rememberedValue3, false, com.paypal.oslo.feature.directdeposit.ui.summary.composable.ComposableSingletons$FaqAccordionCardKt.INSTANCE.getLambda$2008108571$directdeposit_prodRelease(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1545577797, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCardKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function4
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCardKt.$r8$lambda$e3gUJL0Z091jkwB58zZyowQtbcU(context, (com.paypal.pds.components.AccordionBodyScope) obj, (com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    }
                }, startRestartGroup, 54), null, startRestartGroup, 1769472, 144);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCardKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCardKt.m14765$r8$lambda$8Uh0sQPzA6xDiqPAtxqa9TgJyk(z, z2, function0, function02, context, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 74899) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void handleFaqLinkClick(android.content.Context context, boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            context.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)));
        }
    }

    /* renamed from: $r8$lambda$8Uh0sQPzA6xDiqPAtxqa9TgJ-yk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14765$r8$lambda$8Uh0sQPzA6xDiqPAtxqa9TgJyk(boolean z, boolean z2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, android.content.Context context, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FaqAccordionCard(z, z2, function0, function02, context, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Et94506SZM6QJsujkQfN1YKQM-I, reason: not valid java name */
    public static /* synthetic */ boolean m14766$r8$lambda$Et94506SZM6QJsujkQfN1YKQMI(boolean z, boolean z2, com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem faqItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faqItem, "");
        java.lang.String tag = faqItem.getTag();
        if (kotlin.jvm.internal.Intrinsics.areEqual(tag, "directDepositScreenHowDirectDepositWorks")) {
            return z;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(tag, "directDepositScreenHowDirectDebitWorks")) {
            return z2;
        }
        return false;
    }

    /* renamed from: $r8$lambda$UaZtQm-F6kaQHGCY576TkjrvppQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14767$r8$lambda$UaZtQmF6kaQHGCY576TkjrvppQ(android.content.Context context, com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem faqItem, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        handleFaqLinkClick(context, faqItem.getHasLinks(), str2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e3gUJL0Z091jkwB58zZyowQtbcU(final android.content.Context context, com.paypal.pds.components.AccordionBodyScope accordionBodyScope, final com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem faqItem, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionBodyScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faqItem, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1545577797, i, -1, "com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCard.<anonymous>.<anonymous> (FaqAccordionCard.kt:89)");
        }
        com.paypal.pds.core.RichText richText = faqItem.getRichText();
        com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
        com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
        androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
        java.lang.String tag = faqItem.getTag();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(tag);
        sb.append("Content");
        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(m1708paddingVpY3zN4$default, sb.toString());
        com.paypal.pds.core.Color.ContentBase contentBase2 = contentBase;
        boolean changedInstance = composer.changedInstance(context);
        boolean z = (((i & 112) ^ 48) > 32 && composer.changed(faqItem)) || (i & 48) == 32;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCardKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCardKt.m14767$r8$lambda$UaZtQmF6kaQHGCY576TkjrvppQ(context, faqItem, (java.lang.String) obj, (java.lang.String) obj2);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, testTag, contentBase2, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue, bodyMedium, null, composer, 384, 48, 5112);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jO8Z5HrBMSGkJ7MTWo313hjQCMA(java.util.List list, java.lang.String str, com.paypal.pds.core.Builder builder) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(list, new java.util.Comparator() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCardKt$buildRichTextWithLinks$lambda$0$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((java.lang.String) ((kotlin.Pair) t2).getFirst()).length()), java.lang.Integer.valueOf(((java.lang.String) ((kotlin.Pair) t).getFirst()).length()));
            }
        });
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = sortedWith.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            kotlin.Pair pair = (kotlin.Pair) it.next();
            java.lang.String str2 = (java.lang.String) pair.component1();
            java.lang.String str3 = (java.lang.String) pair.component2();
            kotlin.Triple triple = null;
            while (i < str.length() && triple == null) {
                int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, str2, i, false, 4, (java.lang.Object) null);
                if (indexOf$default >= 0) {
                    kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(indexOf$default, str2.length() + indexOf$default);
                    java.util.ArrayList arrayList3 = arrayList;
                    if (!arrayList3.isEmpty()) {
                        java.util.Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            if (!kotlin.collections.CollectionsKt.intersect((kotlin.ranges.IntRange) it2.next(), until).isEmpty()) {
                                i = indexOf$default + 1;
                                break;
                            }
                        }
                    }
                    arrayList.add(until);
                    triple = new kotlin.Triple(java.lang.Integer.valueOf(indexOf$default), str2, str3);
                } else {
                    i = str.length();
                }
            }
            if (triple != null) {
                arrayList2.add(triple);
            }
        }
        for (kotlin.Triple triple2 : kotlin.collections.CollectionsKt.sortedWith(arrayList2, new java.util.Comparator() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCardKt$buildRichTextWithLinks$lambda$0$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Integer) ((kotlin.Triple) t).getFirst(), (java.lang.Integer) ((kotlin.Triple) t2).getFirst());
            }
        })) {
            int intValue = ((java.lang.Number) triple2.component1()).intValue();
            java.lang.String str4 = (java.lang.String) triple2.component2();
            java.lang.String str5 = (java.lang.String) triple2.component3();
            if (intValue > i) {
                java.lang.String substring = str.substring(i, intValue);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                com.paypal.pds.core.Builder.append$default(builder, substring, null, false, 6, null);
            }
            builder.appendLink(str4, str5);
            i = str4.length() + intValue;
        }
        if (i < str.length()) {
            java.lang.String substring2 = str.substring(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            com.paypal.pds.core.Builder.append$default(builder, substring2, null, false, 6, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ot2S08jy1XoOpQzubgtL7fRQg9E(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem faqItem, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faqItem, "");
        java.lang.String tag = faqItem.getTag();
        if (kotlin.jvm.internal.Intrinsics.areEqual(tag, "directDepositScreenHowDirectDepositWorks")) {
            function0.invoke();
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(tag, "directDepositScreenHowDirectDebitWorks")) {
            function02.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }
}
