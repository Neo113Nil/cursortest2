package com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aC\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f¨\u0006\u000e"}, d2 = {"RecurringOptionsSelection", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SELECTED_OPTION, "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/RecurringOption;", "onOptionSelect", "Lkotlin/Function1;", "onContinueClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/RecurringOption;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RecurringOptionsSelectionNoSelectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "RecurringOptionsSelectionOneTimePreview", "cryptocurrency_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RecurringOptionsSelectionKt {
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecurringOptionsSelection(final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption recurringOption, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1594891331);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(recurringOption == null ? -1 : recurringOption.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1594891331, i4, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringOptionsSelection (RecurringOptionsSelection.kt:49)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
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
                final kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption> entries = com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption.getEntries();
                startRestartGroup.startReplaceGroup(-1888002787);
                kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption> enumEntries = entries;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(enumEntries, 10));
                java.util.Iterator<E> it = enumEntries.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.paypal.pds.components.RadioButtonItem.Companion.create$default(com.paypal.pds.components.RadioButtonItem.INSTANCE, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOptionKt.displayText((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption) it.next(), startRestartGroup, 0), (java.lang.String) null, (com.paypal.pds.core.AnalyticsScope) null, 6, (java.lang.Object) null));
                }
                java.util.ArrayList arrayList2 = arrayList;
                startRestartGroup.endReplaceGroup();
                java.lang.Integer valueOf = java.lang.Integer.valueOf(kotlin.collections.CollectionsKt.indexOf((java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption>) entries, recurringOption));
                if (valueOf.intValue() < 0) {
                    valueOf = null;
                }
                androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                boolean changedInstance = startRestartGroup.changedInstance(entries);
                boolean z = (i4 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringOptionsSelectionKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringOptionsSelectionKt.$r8$lambda$_shtw4nAyBGhG_PQKqXH01qmlsg(kotlin.enums.EnumEntries.this, function1, ((java.lang.Integer) obj).intValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                com.paypal.pds.components.RadioKt.Radio(arrayList2, valueOf, fillMaxWidth$default2, false, (kotlin.jvm.functions.Function1) rememberedValue, null, null, startRestartGroup, 384, 104);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), startRestartGroup, 0);
                composer2 = startRestartGroup;
                com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_action_continue_button, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, recurringOption != null, false, startRestartGroup, ((i4 >> 6) & 14) | 384, 376);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringOptionsSelectionKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringOptionsSelectionKt.$r8$lambda$YB0cbt1_Rrux0cTBoxWKi1EaOPw(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption.this, function1, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WSKpa2DNtOmAxuCS6flqXYAsgbg(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption recurringOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringOption, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YB0cbt1_Rrux0cTBoxWKi1EaOPw(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption recurringOption, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RecurringOptionsSelection(recurringOption, function1, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_shtw4nAyBGhG_PQKqXH01qmlsg(kotlin.enums.EnumEntries enumEntries, kotlin.jvm.functions.Function1 function1, int i) {
        if (i >= 0 && i < enumEntries.size()) {
            function1.invoke(enumEntries.get(i));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$o9xZdRrTEj18rdwP3IpGd-xZwsw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13788$r8$lambda$o9xZdRrTEj18rdwP3IpGdxZwsw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(744680498);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(744680498, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringOptionsSelectionNoSelectionPreview (RecurringOptionsSelection.kt:91)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringOptionsSelectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringOptionsSelectionKt.$r8$lambda$WSKpa2DNtOmAxuCS6flqXYAsgbg((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringOptionsSelectionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            RecurringOptionsSelection(null, function1, (kotlin.jvm.functions.Function0) rememberedValue2, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 438, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringOptionsSelectionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringOptionsSelectionKt.m13788$r8$lambda$o9xZdRrTEj18rdwP3IpGdxZwsw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vg9vgfNuNubcWdyqtAaL4DVsa58(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption recurringOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringOption, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zz-U0JgQ6sF9sigsc_tzlGJt7fc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13789$r8$lambda$zzU0JgQ6sF9sigsc_tzlGJt7fc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1679478742);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1679478742, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringOptionsSelectionOneTimePreview (RecurringOptionsSelection.kt:109)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption recurringOption = com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption.ONE_TIME;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringOptionsSelectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringOptionsSelectionKt.$r8$lambda$vg9vgfNuNubcWdyqtAaL4DVsa58((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringOptionsSelectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            RecurringOptionsSelection(recurringOption, function1, (kotlin.jvm.functions.Function0) rememberedValue2, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 438, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringOptionsSelectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringOptionsSelectionKt.m13789$r8$lambda$zzU0JgQ6sF9sigsc_tzlGJt7fc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
