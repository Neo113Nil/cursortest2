package com.paypal.oslo.feature.settings.closeaccount.ui.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0012"}, d2 = {"CloseAccountOpenItemSection", "", "title", "", "text", "subText", "icon", "Lcom/paypal/pds/core/Icon;", "showChevron", "", "modifier", "Landroidx/compose/ui/Modifier;", "onOpenItemClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Icon;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CloseAccountOpenItemSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "CloseAccountOpenItemSectionWithoutChevronPreview", "settings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseAccountOpenItemSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CloseAccountOpenItemSection(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final com.paypal.pds.core.Icon icon, final boolean z, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1454952210);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(icon) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                i5 = i3;
                if (!startRestartGroup.shouldExecute((599187 & i5) != 599186, i5 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    function03 = function02;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSectionKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                    } else {
                        function04 = function02;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1454952210, i5, -1, "com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSection (CloseAccountOpenItemSection.kt:56)");
                    }
                    com.paypal.pds.components.CardStyle.Filled filled = com.paypal.pds.components.CardStyle.Filled.INSTANCE;
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function05 = function04;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.CardKt.Card(modifier4, com.paypal.pds.core.Color.BackgroundCardFilled.INSTANCE, (androidx.compose.ui.graphics.painter.Painter) null, filled, new com.paypal.pds.components.HeaderConfig(null, str, null, null, null, 29, null), (com.paypal.pds.components.FooterConfig) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (com.paypal.pds.components.CardPadding) null, (com.paypal.pds.components.CardCornerRadius) null, (kotlin.Unit) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1163210682, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSectionKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSectionKt.$r8$lambda$4tufwQt4tk3_W2d4pLPfgzUzHSc(kotlin.jvm.functions.Function0.this, z, str2, str3, icon, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), composer2, (com.paypal.pds.components.CardStyle.Filled.$stable << 9) | ((i5 >> 15) & 14) | 48 | (com.paypal.pds.components.HeaderConfig.$stable << 12), 6, 996);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    function03 = function04;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSectionKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSectionKt.$r8$lambda$RVpm5cHs4YW47fLgucSLtaDAXxk(str, str2, str3, icon, z, modifier3, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            i5 = i3;
            if (!startRestartGroup.shouldExecute((599187 & i5) != 599186, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i3;
        if (!startRestartGroup.shouldExecute((599187 & i5) != 599186, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0LRFggROXlirzC3fK97us6Y7CaI(com.paypal.pds.core.Icon icon, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1137094239, i, -1, "com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CloseAccountOpenItemSection.kt:78)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(icon), null, com.paypal.pds.components.AvatarSize.XSmall.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBaseWarning.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseWarning.INSTANCE), null, null, composer, com.paypal.pds.components.AvatarSize.XSmall.$stable << 6, 50);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4tufwQt4tk3_W2d4pLPfgzUzHSc(final kotlin.jvm.functions.Function0 function0, final boolean z, final java.lang.String str, final java.lang.String str2, final com.paypal.pds.core.Icon icon, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1163210682, i, -1, "com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSection.<anonymous> (CloseAccountOpenItemSection.kt:65)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            com.paypal.pds.components.CardKt.Card(null, com.paypal.pds.core.Color.BackgroundBase.INSTANCE, null, com.paypal.pds.components.CardStyle.Filled.INSTANCE, function0, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(467915370, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSectionKt.m19225$r8$lambda$cRLM3YlH3JFoK04G1UofYLQW1M(z, str, str2, function0, icon, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, (com.paypal.pds.components.CardStyle.Filled.$stable << 9) | 805306416, 485);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7XHGIKuidB9c9K-wXdG2hLe8FsY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19224$r8$lambda$7XHGIKuidB9c9KwXdG2hLe8FsY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1740905188);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1740905188, updateChangedFlags, -1, "com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSectionWithoutChevronPreview (CloseAccountOpenItemSection.kt:123)");
            }
            CloseAccountOpenItemSection("Things to do to close your account:", "Pay outstanding balances", null, com.paypal.pds.core.Icon.Hand.INSTANCE, true, null, null, startRestartGroup, 28086, 96);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSectionKt.m19224$r8$lambda$7XHGIKuidB9c9KwXdG2hLe8FsY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RVpm5cHs4YW47fLgucSLtaDAXxk(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.pds.core.Icon icon, boolean z, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CloseAccountOpenItemSection(str, str2, str3, icon, z, modifier, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RzF6g4hdilqZtLCocGlk3QSPVZY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1545293713);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1545293713, updateChangedFlags, -1, "com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSectionPreview (CloseAccountOpenItemSection.kt:109)");
            }
            CloseAccountOpenItemSection("Things to do to close your account:", "Pay outstanding amount", "Pay off any open payment plans or loans.", com.paypal.pds.core.Icon.Coins.INSTANCE, true, null, null, startRestartGroup, 28086, 96);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSectionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSectionKt.$r8$lambda$RzF6g4hdilqZtLCocGlk3QSPVZY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cRLM3YlH3JFoK04G1Uo-fYLQW1M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19225$r8$lambda$cRLM3YlH3JFoK04G1UofYLQW1M(boolean z, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, final com.paypal.pds.core.Icon icon, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(467915370, i, -1, "com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSection.<anonymous>.<anonymous>.<anonymous> (CloseAccountOpenItemSection.kt:71)");
            }
            com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(str, null, str2, null, null, z, false, z ? com.paypal.oslo.feature.settings.closeaccount.ui.components.ComposableSingletons$CloseAccountOpenItemSectionKt.INSTANCE.m19235getLambda$303157465$settings_prodRelease() : null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1137094239, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.closeaccount.ui.components.CloseAccountOpenItemSectionKt.$r8$lambda$0LRFggROXlirzC3fK97us6Y7CaI(com.paypal.pds.core.Icon.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), null, null, null, false, function0, null, null, null, null, false, composer, 102236160, 0, 515610);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
