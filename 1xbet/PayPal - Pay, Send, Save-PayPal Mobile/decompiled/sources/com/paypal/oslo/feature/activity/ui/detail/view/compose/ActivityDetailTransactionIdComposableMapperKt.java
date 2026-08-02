package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a!\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"ActivityTransactionDetailTransactionIdCompose", "", "activityDetailTransactionIdsViewModel", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTransactionCopyableSectionModel;", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTransactionCopyableSectionModel;Landroidx/compose/runtime/Composer;I)V", "TransactionIdCopyableComposable", "item", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTransactionCopyableSection;", "paddingTop", "Landroidx/compose/ui/unit/Dp;", "TransactionIdCopyableComposable-rAjV9yQ", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTransactionCopyableSection;FLandroidx/compose/runtime/Composer;II)V", "activity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetailTransactionIdComposableMapperKt {
    public static final void ActivityTransactionDetailTransactionIdCompose(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSectionModel activityDetailTransactionCopyableSectionModel, androidx.compose.runtime.Composer composer, final int i) {
        float spacing8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailTransactionCopyableSectionModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1938214635);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(activityDetailTransactionCopyableSectionModel) ? 4 : 2) | i : i;
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1938214635, i2, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailTransactionIdCompose (ActivityDetailTransactionIdComposableMapper.kt:63)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
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
            if (activityDetailTransactionCopyableSectionModel.getCopyableSections().isEmpty()) {
                startRestartGroup.startReplaceGroup(1415932675);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1415591520);
                int i3 = 0;
                for (java.lang.Object obj : activityDetailTransactionCopyableSectionModel.getCopyableSections()) {
                    if (i3 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection activityDetailTransactionCopyableSection = (com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection) obj;
                    if (i3 == 0) {
                        spacing8 = com.paypal.pds.core.ConstantsKt.getSpacing4();
                    } else {
                        spacing8 = com.paypal.pds.core.ConstantsKt.getSpacing8();
                    }
                    m11848TransactionIdCopyableComposablerAjV9yQ(activityDetailTransactionCopyableSection, spacing8, startRestartGroup, 0, 0);
                    i3++;
                }
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailTransactionIdComposableMapperKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailTransactionIdComposableMapperKt.$r8$lambda$uRyqDMxbZH6GqDa1LOL0PImXDqQ(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSectionModel.this, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if ((r32 & 2) != 0) goto L37;
     */
    /* renamed from: TransactionIdCopyableComposable-rAjV9yQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11848TransactionIdCopyableComposablerAjV9yQ(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection activityDetailTransactionCopyableSection, float f, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final float f2;
        androidx.compose.runtime.Composer composer2;
        java.lang.String resolveString;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailTransactionCopyableSection, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1557489142);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(activityDetailTransactionCopyableSection) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                if (startRestartGroup.changed(f2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                f2 = f;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            f2 = f;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    f2 = com.paypal.pds.core.ConstantsKt.getSpacing8();
                    i3 &= -113;
                }
                int i5 = i3;
                float f3 = f2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1557489142, i5, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.TransactionIdCopyableComposable (ActivityDetailTransactionIdComposableMapper.kt:82)");
                }
                final androidx.compose.ui.platform.Clipboard clipboard = (androidx.compose.ui.platform.Clipboard) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboard());
                final kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) startRestartGroup.consume(com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt.getLocalShowToast());
                final java.lang.String resolveString2 = com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(java.lang.Integer.valueOf(activityDetailTransactionCopyableSection.getCopyToastMessageResId()), new java.lang.Object[0], startRestartGroup, 0);
                if (activityDetailTransactionCopyableSection.getSectionNamePlaceholder() != null) {
                    startRestartGroup.startReplaceGroup(-626975744);
                    resolveString = com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(java.lang.Integer.valueOf(activityDetailTransactionCopyableSection.getSectionNameResId()), new java.lang.Object[]{activityDetailTransactionCopyableSection.getSectionNamePlaceholder()}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-626883333);
                    resolveString = com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(java.lang.Integer.valueOf(activityDetailTransactionCopyableSection.getSectionNameResId()), new java.lang.Object[0], startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                composer2 = startRestartGroup;
                com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(resolveString, null, activityDetailTransactionCopyableSection.getTransactionId(), null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2084695200, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailTransactionIdComposableMapperKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailTransactionIdComposableMapperKt.$r8$lambda$KAOwNPMIMgopK4ILO0klvCyNws4(androidx.compose.ui.platform.Clipboard.this, resolveString2, activityDetailTransactionCopyableSection, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), null, null, null, null, false, null, androidx.compose.ui.unit.Dp.m8599boximpl(f3), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing8()), null, null, false, composer2, 12582912, (i5 << 9) & 57344, 475002);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                f2 = f3;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailTransactionIdComposableMapperKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailTransactionIdComposableMapperKt.$r8$lambda$Jp1q5vP4KIDQFI89lKHR6TIYZU0(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection.this, f2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1E0RXgE_mldMlcQVmWvzy8RwT2Y(androidx.compose.ui.platform.Clipboard clipboard, java.lang.String str, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection activityDetailTransactionCopyableSection, kotlin.jvm.functions.Function1 function1) {
        clipboard.getCamera2StreamConfigurationMap().setPrimaryClip(android.content.ClipData.newPlainText(str, activityDetailTransactionCopyableSection.getTransactionId()));
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Jp1q5vP4KIDQFI89lKHR6TIYZU0(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection activityDetailTransactionCopyableSection, float f, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m11848TransactionIdCopyableComposablerAjV9yQ(activityDetailTransactionCopyableSection, f, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KAOwNPMIMgopK4ILO0klvCyNws4(final androidx.compose.ui.platform.Clipboard clipboard, final java.lang.String str, final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection activityDetailTransactionCopyableSection, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2084695200, i, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.TransactionIdCopyableComposable.<anonymous> (ActivityDetailTransactionIdComposableMapper.kt:97)");
            }
            com.paypal.pds.core.Icon.Rectangles rectangles = com.paypal.pds.core.Icon.Rectangles.INSTANCE;
            boolean changedInstance = composer.changedInstance(clipboard);
            boolean changed = composer.changed(str);
            boolean changedInstance2 = composer.changedInstance(activityDetailTransactionCopyableSection);
            boolean changed2 = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changed | changedInstance2 | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailTransactionIdComposableMapperKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailTransactionIdComposableMapperKt.$r8$lambda$1E0RXgE_mldMlcQVmWvzy8RwT2Y(androidx.compose.ui.platform.Clipboard.this, str, activityDetailTransactionCopyableSection, function1);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(rectangles, (kotlin.jvm.functions.Function0) rememberedValue, null, com.paypal.pds.components.ButtonStyle.TertiaryContained.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, "Copy", null, false, false, composer, 224262, 452);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uRyqDMxbZH6GqDa1LOL0PImXDqQ(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSectionModel activityDetailTransactionCopyableSectionModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivityTransactionDetailTransactionIdCompose(activityDetailTransactionCopyableSectionModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
