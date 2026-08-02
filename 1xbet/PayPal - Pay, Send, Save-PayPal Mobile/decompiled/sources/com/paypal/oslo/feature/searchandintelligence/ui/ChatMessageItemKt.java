package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a~\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n0\t23\u0010\u000b\u001a/\u0012\u001b\u0012\u0019\u0012\u0006\b\u0001\u0012\u00020\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u00120\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"ChatMessageItem", "", "message", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage;", "messageIndex", "", "isLastMessage", "", "fadedInItems", "", "Lkotlin/Pair;", "getRenderer", "Lkotlin/Function1;", "Lkotlin/reflect/KClass;", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "Lkotlin/ParameterName;", "name", "contentClass", "Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage;IZLjava/util/Set;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ChatMessageItemConversationPreview", "(Landroidx/compose/runtime/Composer;I)V", "search-and-intelligence_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ChatMessageItemKt {
    /* JADX WARN: Removed duplicated region for block: B:120:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChatMessageItem(final com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage chatMessage, final int i, final boolean z, final java.util.Set<kotlin.Pair<java.lang.Integer, java.lang.Integer>> set, final kotlin.jvm.functions.Function1<? super kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>, ? extends com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.ui.Modifier modifier5;
        java.lang.Object obj;
        int i5;
        int i6;
        float f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chatMessage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(768173159);
        int i7 = (i2 & 6) == 0 ? (startRestartGroup.changed(chatMessage) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i7 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i7 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i7 |= startRestartGroup.changedInstance(set) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i7 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        int i8 = i3 & 32;
        if (i8 != 0) {
            i7 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i2) == 0) {
            modifier2 = modifier;
            i7 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i4 = i7;
            int i9 = 1;
            if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier6 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(768173159, i4, -1, "com.paypal.oslo.feature.searchandintelligence.ui.ChatMessageItem (ChatMessageItem.kt:50)");
                }
                float f2 = 0.0f;
                java.lang.Object obj2 = null;
                if (chatMessage instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.User) {
                    startRestartGroup.startReplaceGroup(-519958176);
                    com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.User user = (com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.User) chatMessage;
                    com.paypal.oslo.feature.searchandintelligence.ui.UserChatBubbleKt.UserChatBubble(user.getText(), com.paypal.oslo.feature.searchandintelligence.ui.analytics.InstrumentationUtilsKt.instrument$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.searchandintelligence.ui.analytics.text.UserQueryModuleAnalyticsConfig.INSTANCE, java.lang.Integer.valueOf(i), (java.lang.Integer) null, 4, (java.lang.Object) null), user.getMaxLines(), startRestartGroup, 0, 0);
                    startRestartGroup.endReplaceGroup();
                    modifier4 = modifier6;
                } else {
                    modifier4 = modifier6;
                    if (chatMessage instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Remote) {
                        startRestartGroup.startReplaceGroup(1061506110);
                        com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Remote remote = (com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Remote) chatMessage;
                        int i10 = 0;
                        for (java.lang.Object obj3 : remote.getComponents()) {
                            if (i10 < 0) {
                                kotlin.collections.CollectionsKt.throwIndexOverflow();
                            }
                            final com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent uiComponent = (com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent) obj3;
                            boolean z2 = uiComponent instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.ui.PlainText;
                            if (z2 || (uiComponent instanceof com.paypal.oslo.feature.searchandintelligence.api.component.MarkdownText)) {
                                modifier5 = modifier4;
                                obj = obj2;
                                i5 = i10;
                                i6 = i4;
                                f = f2;
                                startRestartGroup.startReplaceGroup(-1707881339);
                                boolean z3 = i5 == kotlin.collections.CollectionsKt.getLastIndex(remote.getComponents()) && z;
                                kotlin.Pair<java.lang.Integer, java.lang.Integer> pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i5));
                                boolean z4 = z3 && !set.contains(pair);
                                if (z4) {
                                    set.add(pair);
                                }
                                if (z2) {
                                    startRestartGroup.startReplaceGroup(-609268550);
                                    com.paypal.oslo.feature.searchandintelligence.ui.RemoteChatBubbleKt.RemoteChatBubble(((com.paypal.oslo.feature.searchandintelligence.domain.model.ui.PlainText) uiComponent).getText(), com.paypal.oslo.feature.searchandintelligence.ui.analytics.InstrumentationUtilsKt.instrument$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, 1, obj), com.paypal.oslo.feature.searchandintelligence.ui.analytics.text.AgentTextResponseModuleAnalyticsConfig.INSTANCE, java.lang.Integer.valueOf(i), (java.lang.Integer) null, 4, (java.lang.Object) null), z4, 0, startRestartGroup, 0, 8);
                                    startRestartGroup.endReplaceGroup();
                                } else if (uiComponent instanceof com.paypal.oslo.feature.searchandintelligence.api.component.MarkdownText) {
                                    startRestartGroup.startReplaceGroup(-609250889);
                                    com.paypal.oslo.feature.paypalassistant.api.util.UiFadeInAlphaKt.UiFadeInAlpha(z4, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, 1, obj), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing32(), 0.0f, 10, null), 0, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1336070642, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ChatMessageItemKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                                            return com.paypal.oslo.feature.searchandintelligence.ui.ChatMessageItemKt.m19132$r8$lambda$RjvD1sR2vHY_2auonRBvRgn0dg(i, uiComponent, function1, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, 3072, 4);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(-1706312708);
                                    startRestartGroup.endReplaceGroup();
                                }
                            } else {
                                startRestartGroup.startReplaceGroup(-609229760);
                                int i11 = ((i4 >> 6) & 896) | ((i4 >> 3) & 14) | 3072;
                                obj = null;
                                i6 = i4;
                                f = f2;
                                modifier5 = modifier4;
                                i5 = i10;
                                com.paypal.oslo.feature.searchandintelligence.ui.RenderContentKt.RenderContent(i, uiComponent, function1, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f2, i9, obj2), startRestartGroup, i11, 0);
                            }
                            startRestartGroup.endReplaceGroup();
                            i10 = i5 + 1;
                            modifier4 = modifier5;
                            obj2 = obj;
                            f2 = f;
                            i4 = i6;
                            i9 = 1;
                        }
                        startRestartGroup.endReplaceGroup();
                    } else if (chatMessage instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Thinking) {
                        startRestartGroup.startReplaceGroup(1063619442);
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 0.0f, 14, null), com.paypal.oslo.feature.searchandintelligence.api.SearchAndIntelligenceTestTags.THINKING_INDICATOR_TEST_TAG);
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        com.paypal.oslo.feature.searchandintelligence.ui.SparkleAnimationKt.SparkleAnimation(null, startRestartGroup, 0, 1);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                        com.paypal.oslo.feature.searchandintelligence.ui.TextShimmerKt.m19171TextShimmerY0xEhic(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.searchandintelligence.R.string.feature_search_and_intelligence_thinking, startRestartGroup, 0), androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, null, 0, startRestartGroup, 0, 60);
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceGroup();
                        modifier4 = modifier4;
                        startRestartGroup = startRestartGroup;
                    } else if (chatMessage instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Agent) {
                        startRestartGroup.startReplaceGroup(1064251935);
                        com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Agent agent = (com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Agent) chatMessage;
                        startRestartGroup = startRestartGroup;
                        com.paypal.oslo.feature.searchandintelligence.ui.RemoteChatBubbleKt.RemoteChatBubble(agent.getText(), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), false, agent.getMaxLines(), startRestartGroup, 48, 4);
                        startRestartGroup.endReplaceGroup();
                        modifier4 = modifier4;
                    } else {
                        startRestartGroup = startRestartGroup;
                        if (chatMessage instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Error) {
                            startRestartGroup.startReplaceGroup(1064472469);
                            modifier4 = modifier4;
                            com.paypal.oslo.feature.searchandintelligence.ui.RemoteChatBubbleKt.RemoteChatBubble(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.searchandintelligence.R.string.feature_search_and_intelligence_send_error, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), false, 0, startRestartGroup, 0, 12);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-519956374);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ChatMessageItemKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.ChatMessageItemKt.$r8$lambda$HYkdrMSm0OoB1XOjKoUDBC5BTz8(com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.this, i, z, set, function1, modifier3, i2, i3, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i7;
        int i92 = 1;
        if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HYkdrMSm0OoB1XOjKoUDBC5BTz8(com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage chatMessage, int i, boolean z, java.util.Set set, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        ChatMessageItem(chatMessage, i, z, set, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RjvD1sR-2vHY_2auonRBvRgn0dg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19132$r8$lambda$RjvD1sR2vHY_2auonRBvRgn0dg(int i, com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent uiComponent, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1336070642, i2, -1, "com.paypal.oslo.feature.searchandintelligence.ui.ChatMessageItem.<anonymous>.<anonymous> (ChatMessageItem.kt:90)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.RenderContentKt.RenderContent(i, uiComponent, function1, null, composer, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$U7JW3LbODK2a_ASJV1-Htmi2eIQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19133$r8$lambda$U7JW3LbODK2a_ASJV1Htmi2eIQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(783598710);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(783598710, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.ChatMessageItemConversationPreview (ChatMessageItem.kt:145)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.SearchAndIntelligencePreview(com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$ChatMessageItemKt.INSTANCE.getLambda$1032622013$search_and_intelligence_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ChatMessageItemKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.ChatMessageItemKt.m19133$r8$lambda$U7JW3LbODK2a_ASJV1Htmi2eIQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
