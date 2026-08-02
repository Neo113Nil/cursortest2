package com.paypal.oslo.feature.contacts.ui.contacts.views;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\u001aK\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\u000b\u001a5\u0010\f\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, d2 = {"RecentSearchesList", "", "recentSearches", "", "Lcom/paypal/oslo/feature/contacts/api/RecentSearch;", "contactsListConfig", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsListConfig;", "onRecentClick", "Lkotlin/Function1;", "onEvent", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "(Ljava/util/List;Lcom/paypal/oslo/feature/contacts/api/configs/ContactsListConfig;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "RecentSearchStringItem", "Landroidx/compose/foundation/lazy/LazyItemScope;", "recentSearch", "Lcom/paypal/oslo/feature/contacts/api/RecentSearch$SearchString;", "onItemClick", "Lkotlin/Function0;", "onDeleteClick", "(Landroidx/compose/foundation/lazy/LazyItemScope;Lcom/paypal/oslo/feature/contacts/api/RecentSearch$SearchString;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "contacts_prodRelease", "hasMoreContent", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RecentSearchesListKt {
    public static final void RecentSearchesList(final java.util.List<? extends com.paypal.oslo.feature.contacts.api.RecentSearch> list, final com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.contacts.api.RecentSearch, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.foundation.shape.RoundedCornerShape m1971RoundedCornerShape0680j_4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsListConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(253259344);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(contactsListConfig) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(253259344, i3, -1, "com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesList (RecentSearchesList.kt:70)");
            }
            final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = (androidx.compose.ui.platform.SoftwareKeyboardController) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController());
            final androidx.compose.ui.focus.FocusManager focusManager = (androidx.compose.ui.focus.FocusManager) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager());
            final androidx.compose.foundation.lazy.LazyListState rememberLazyListState = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        boolean canScrollForward;
                        canScrollForward = androidx.compose.foundation.lazy.LazyListState.this.getCanScrollForward();
                        return java.lang.Boolean.valueOf(canScrollForward);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            if (((java.lang.Boolean) ((androidx.compose.runtime.State) rememberedValue).getValue()).booleanValue()) {
                m1971RoundedCornerShape0680j_4 = androidx.compose.foundation.shape.RoundedCornerShapeKt.m1973RoundedCornerShapea9UjIt4$default(com.paypal.pds.core.ConstantsKt.getSize24(), com.paypal.pds.core.ConstantsKt.getSize24(), 0.0f, 0.0f, 12, null);
            } else {
                m1971RoundedCornerShape0680j_4 = androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSize24());
            }
            androidx.compose.foundation.shape.RoundedCornerShape roundedCornerShape = m1971RoundedCornerShape0680j_4;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.lang.Object headerItem = new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.HeaderItem("Recent", new com.paypal.oslo.feature.contacts.api.HeaderAction(com.paypal.pds.components.SearchKt.ClearIconTag, com.paypal.oslo.feature.contacts.api.HeaderActionType.INSTANCE.getClearAll()));
                startRestartGroup.updateRememberedValue(headerItem);
                rememberedValue2 = headerItem;
            }
            com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.HeaderItem headerItem2 = (com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.HeaderItem) rememberedValue2;
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
            com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.HeaderItem headerItem3 = headerItem2;
            int i4 = i3 & 7168;
            boolean z = i4 == 2048;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt.m13670$r8$lambda$M8yY13o0vpLoUI77SnsJJyww1M(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemKt.ContactHeaderItem(headerItem3, (kotlin.jvm.functions.Function0) rememberedValue3, null, startRestartGroup, com.paypal.oslo.feature.contacts.api.HeaderAction.$stable, 4);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.Modifier.INSTANCE, roundedCornerShape), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
            androidx.compose.foundation.layout.PaddingValues m1700PaddingValuesYgX7TsA = androidx.compose.foundation.layout.PaddingKt.m1700PaddingValuesYgX7TsA(com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing4());
            boolean changedInstance = startRestartGroup.changedInstance(list);
            boolean changed = startRestartGroup.changed(softwareKeyboardController);
            boolean changedInstance2 = startRestartGroup.changedInstance(focusManager);
            boolean z2 = (i3 & 896) == 256;
            boolean z3 = i4 == 2048;
            boolean z4 = (i3 & 112) == 32;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changedInstance | changed | changedInstance2 | z2 | z3 | z4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt.$r8$lambda$VnVN5jqcEskQx7dyE8WQ9ucfqRg(list, softwareKeyboardController, focusManager, function1, function12, contactsListConfig, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            composer2 = startRestartGroup;
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(background, rememberLazyListState, m1700PaddingValuesYgX7TsA, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue4, composer2, 0, 504);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt.$r8$lambda$PvvFlvGPJJqezK71QfR0vdtm9LQ(list, contactsListConfig, function1, function12, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(final androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, final com.paypal.oslo.feature.contacts.api.RecentSearch.SearchString searchString, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-57997987);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(lazyItemScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(searchString) : startRestartGroup.changedInstance(searchString) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-57997987, i2, -1, "com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchStringItem (RecentSearchesList.kt:142)");
            }
            androidx.compose.ui.Modifier animateItem$default = androidx.compose.foundation.lazy.LazyItemScope.animateItem$default(lazyItemScope, androidx.compose.ui.Modifier.INSTANCE, null, null, null, 7, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt.m13671$r8$lambda$caEnKQnFoX6YfI_I_mnRNIgPgM((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(animateItem$default, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), null, null, false, androidx.compose.ui.semantics.Role.m7792boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c()), null, function0, startRestartGroup, (i2 << 12) & 3670016, 23);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m22100clickable_mRqjOc);
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
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize48()), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.MagnifyingGlass.INSTANCE, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, startRestartGroup, 27702, 4);
            startRestartGroup.endNode();
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(searchString.getValue(), androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 1, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 12779904, 6, 856);
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.XMark.INSTANCE, "Delete recent search", com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.ui.Modifier.INSTANCE, null, null, false, androidx.compose.ui.semantics.Role.m7792boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c()), null, function02, startRestartGroup, ((i2 << 9) & 3670016) | 6, 23), com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentMuted.INSTANCE, startRestartGroup, 27702, 0);
            startRestartGroup.endNode();
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt.m13669$r8$lambda$G5yrO7qwZEFaJxhSw9gcyf6wvc(androidx.compose.foundation.lazy.LazyItemScope.this, searchString, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$G5yrO7qwZE-FaJxhSw9gcyf6wvc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13669$r8$lambda$G5yrO7qwZEFaJxhSw9gcyf6wvc(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, com.paypal.oslo.feature.contacts.api.RecentSearch.SearchString searchString, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(lazyItemScope, searchString, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$M8yY13o0vpLoU-I77SnsJJyww1M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13670$r8$lambda$M8yY13o0vpLoUI77SnsJJyww1M(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearches(com.paypal.oslo.feature.contacts.api.NetworkType.P2P));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$NPFLDi_4SmHQXblZGZdS6BxGqqs(com.paypal.oslo.feature.contacts.api.RecentSearch recentSearch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentSearch, "");
        return com.paypal.oslo.feature.contacts.ui.contacts.state.ContactSearchExtensionsKt.id(recentSearch);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PvvFlvGPJJqezK71QfR0vdtm9LQ(java.util.List list, com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, androidx.compose.runtime.Composer composer, int i2) {
        RecentSearchesList(list, contactsListConfig, function1, function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VnVN5jqcEskQx7dyE8WQ9ucfqRg(final java.util.List list, final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, final androidx.compose.ui.focus.FocusManager focusManager, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12, final com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt.$r8$lambda$NPFLDi_4SmHQXblZGZdS6BxGqqs((com.paypal.oslo.feature.contacts.api.RecentSearch) obj);
            }
        };
        final com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt$RecentSearchesList$lambda$3$1$0$$inlined$items$default$1 recentSearchesListKt$RecentSearchesList$lambda$3$1$0$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt$RecentSearchesList$lambda$3$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(com.paypal.oslo.feature.contacts.api.RecentSearch recentSearch) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                return invoke((com.paypal.oslo.feature.contacts.api.RecentSearch) obj);
            }
        };
        lazyListScope.items(list.size(), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt$RecentSearchesList$lambda$3$1$0$$inlined$items$default$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt$RecentSearchesList$lambda$3$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802480018, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt$RecentSearchesList$lambda$3$1$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
            
                r5 = r11.copy((r37 & 1) != 0 ? r11.id : null, (r37 & 2) != 0 ? r11.firstName : null, (r37 & 4) != 0 ? r11.lastName : null, (r37 & 8) != 0 ? r11.type : null, (r37 & 16) != 0 ? r11.phoneNumber : null, (r37 & 32) != 0 ? r11.email : null, (r37 & 64) != 0 ? r11.avatarUrl : null, (r37 & 128) != 0 ? r11.isExternalWallet : false, (r37 & 256) != 0 ? r11.externalWalletName : null, (r37 & 512) != 0 ? r11.externalWalletLogoUrl : null, (r37 & 1024) != 0 ? r11.actionType : com.paypal.oslo.feature.contacts.api.ContactActionType.Delete, (r37 & 2048) != 0 ? r11.handle : null, (r37 & 4096) != 0 ? r11.location : null, (r37 & 8192) != 0 ? r11.isBlocked : false, (r37 & 16384) != 0 ? r11.isFavorite : false, (r37 & 32768) != 0 ? r11.isMobile : false, (r37 & 65536) != 0 ? r11.totalCompletedPayments : 0, (r37 & 131072) != 0 ? r11.contactNameType : null, (r37 & 262144) != 0 ? r11.accountId : null);
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                int i3;
                com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contact;
                com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactItem copy;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                final com.paypal.oslo.feature.contacts.api.RecentSearch recentSearch = (com.paypal.oslo.feature.contacts.api.RecentSearch) list.get(i);
                composer.startReplaceGroup(1187343393);
                if (recentSearch instanceof com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem) {
                    composer.startReplaceGroup(-1762812323);
                    com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem contactItem = (com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem) recentSearch;
                    com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contact2 = contactItem.getContact();
                    com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactItem contactItem2 = contact2 instanceof com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactItem ? (com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactItem) contact2 : null;
                    if (contactItem2 != null && copy != null) {
                        contact = copy;
                    } else {
                        contact = contactItem.getContact();
                    }
                    boolean changed = composer.changed(softwareKeyboardController);
                    boolean changedInstance = composer.changedInstance(focusManager);
                    boolean changed2 = composer.changed(function1);
                    boolean changedInstance2 = composer.changedInstance(recentSearch);
                    java.lang.Object rememberedValue = composer.rememberedValue();
                    if ((changed | changedInstance | changed2 | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController2 = softwareKeyboardController;
                        final androidx.compose.ui.focus.FocusManager focusManager2 = focusManager;
                        final kotlin.jvm.functions.Function1 function14 = function1;
                        rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt$RecentSearchesList$1$2$1$2$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public final /* synthetic */ kotlin.Unit invoke() {
                                androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController3 = androidx.compose.ui.platform.SoftwareKeyboardController.this;
                                if (softwareKeyboardController3 != null) {
                                    softwareKeyboardController3.hide();
                                }
                                androidx.compose.ui.focus.FocusManager.clearFocus$default(focusManager2, false, 1, null);
                                function14.invoke(recentSearch);
                                return kotlin.Unit.INSTANCE;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                    boolean changed3 = composer.changed(softwareKeyboardController);
                    boolean changedInstance3 = composer.changedInstance(focusManager);
                    boolean changed4 = composer.changed(function12);
                    boolean changedInstance4 = composer.changedInstance(recentSearch);
                    java.lang.Object rememberedValue2 = composer.rememberedValue();
                    if ((changed3 | changedInstance3 | changed4 | changedInstance4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController3 = softwareKeyboardController;
                        final androidx.compose.ui.focus.FocusManager focusManager3 = focusManager;
                        final kotlin.jvm.functions.Function1 function15 = function12;
                        rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt$RecentSearchesList$1$2$1$2$2$1
                            @Override // kotlin.jvm.functions.Function0
                            public final /* synthetic */ kotlin.Unit invoke() {
                                androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController4 = androidx.compose.ui.platform.SoftwareKeyboardController.this;
                                if (softwareKeyboardController4 != null) {
                                    softwareKeyboardController4.hide();
                                }
                                androidx.compose.ui.focus.FocusManager.clearFocus$default(focusManager3, false, 1, null);
                                function15.invoke(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearch(((com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem) recentSearch).getId()));
                                return kotlin.Unit.INSTANCE;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.oslo.feature.contacts.ui.contacts.views.ContactItemKt.ContactItem(lazyItemScope, contact, function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, contactsListConfig, composer, i3 & 14, 8);
                    composer.endReplaceGroup();
                } else {
                    if (!(recentSearch instanceof com.paypal.oslo.feature.contacts.api.RecentSearch.SearchString)) {
                        composer.startReplaceGroup(-1762813918);
                        composer.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(-1762784796);
                    com.paypal.oslo.feature.contacts.api.RecentSearch.SearchString searchString = (com.paypal.oslo.feature.contacts.api.RecentSearch.SearchString) recentSearch;
                    boolean changed5 = composer.changed(softwareKeyboardController);
                    boolean changedInstance5 = composer.changedInstance(focusManager);
                    boolean changed6 = composer.changed(function1);
                    boolean changedInstance6 = composer.changedInstance(recentSearch);
                    java.lang.Object rememberedValue3 = composer.rememberedValue();
                    if ((changed5 | changedInstance5 | changed6 | changedInstance6) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController4 = softwareKeyboardController;
                        final androidx.compose.ui.focus.FocusManager focusManager4 = focusManager;
                        final kotlin.jvm.functions.Function1 function16 = function1;
                        rememberedValue3 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt$RecentSearchesList$1$2$1$2$3$1
                            @Override // kotlin.jvm.functions.Function0
                            public final /* synthetic */ kotlin.Unit invoke() {
                                androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController5 = androidx.compose.ui.platform.SoftwareKeyboardController.this;
                                if (softwareKeyboardController5 != null) {
                                    softwareKeyboardController5.hide();
                                }
                                androidx.compose.ui.focus.FocusManager.clearFocus$default(focusManager4, false, 1, null);
                                function16.invoke(recentSearch);
                                return kotlin.Unit.INSTANCE;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
                    boolean changed7 = composer.changed(softwareKeyboardController);
                    boolean changedInstance7 = composer.changedInstance(focusManager);
                    boolean changed8 = composer.changed(function12);
                    boolean changedInstance8 = composer.changedInstance(recentSearch);
                    java.lang.Object rememberedValue4 = composer.rememberedValue();
                    if ((changed7 | changedInstance7 | changed8 | changedInstance8) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController5 = softwareKeyboardController;
                        final androidx.compose.ui.focus.FocusManager focusManager5 = focusManager;
                        final kotlin.jvm.functions.Function1 function17 = function12;
                        rememberedValue4 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt$RecentSearchesList$1$2$1$2$4$1
                            @Override // kotlin.jvm.functions.Function0
                            public final /* synthetic */ kotlin.Unit invoke() {
                                androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController6 = androidx.compose.ui.platform.SoftwareKeyboardController.this;
                                if (softwareKeyboardController6 != null) {
                                    softwareKeyboardController6.hide();
                                }
                                androidx.compose.ui.focus.FocusManager.clearFocus$default(focusManager5, false, 1, null);
                                function17.invoke(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearch(((com.paypal.oslo.feature.contacts.api.RecentSearch.SearchString) recentSearch).getId()));
                                return kotlin.Unit.INSTANCE;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue4);
                    }
                    com.paypal.oslo.feature.contacts.ui.contacts.views.RecentSearchesListKt.getHighSpeedVideoFpsRanges(lazyItemScope, searchString, function02, (kotlin.jvm.functions.Function0) rememberedValue4, composer, (com.paypal.oslo.feature.contacts.api.RecentSearch.$stable << 3) | (i3 & 14));
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$caEnKQnFoX6YfI_-I_mnRNIgPgM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13671$r8$lambda$caEnKQnFoX6YfI_I_mnRNIgPgM(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return kotlin.Unit.INSTANCE;
    }
}
