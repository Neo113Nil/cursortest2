package com.paypal.oslo.feature.savings.ui.savingshub;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u000b\u001aC\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0016"}, d2 = {"SavingsHubDocumentZone", "", "documents", "", "Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemData;", "modifier", "Landroidx/compose/ui/Modifier;", "isLoading", "", "onDocumentClick", "Lkotlin/Function1;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "DocumentItem", "document", "itemIndex", "", "onClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemData;Landroidx/compose/ui/Modifier;IZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SavingsHubDocumentZonePreview", "(Landroidx/compose/runtime/Composer;I)V", "DocumentItemPreview", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsHubDocumentZoneKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SavingsHubDocumentZone(final java.util.List<com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData> list, androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData, kotlin.Unit> function12;
        androidx.compose.ui.Modifier.Companion companion;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData, kotlin.Unit> function13;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1584245820);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function12 = function1;
                    i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        z3 = z2;
                    } else {
                        companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        final boolean z4 = i4 != 0 ? false : z2;
                        if (i5 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt.$r8$lambda$TmHapIs1d6xG3QyW4tIzIORVLW4((com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function13 = (kotlin.jvm.functions.Function1) rememberedValue;
                        } else {
                            function13 = function12;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1584245820, i3, -1, "com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZone (SavingsHubDocumentZone.kt:95)");
                        }
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Hub.INSTANCE.getDOCUMENT_ZONE()), com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.DocumentZone.SECTION);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                        int i7 = (i3 & 896) | 3120;
                        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData, kotlin.Unit> function14 = function13;
                        com.paypal.pds.components.ShimmerKt.Shimmer((androidx.compose.ui.Modifier) null, com.paypal.pds.components.ShimmerStyle.Text.INSTANCE, z4, com.paypal.oslo.feature.savings.ui.savingshub.ComposableSingletons$SavingsHubDocumentZoneKt.INSTANCE.getLambda$1760200499$savings_prodRelease(), startRestartGroup, i7, 1);
                        boolean z5 = z4;
                        com.paypal.pds.components.CardKt.Card(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.DocumentZone.CARD), com.paypal.pds.core.Color.BackgroundBase.INSTANCE, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(489506912, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt.m18966$r8$lambda$tRRxUevCQSAlkgNIJKW3p1yX5U(list, z4, function14, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306422, 500);
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function12 = function14;
                        z3 = z5;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = companion;
                        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData, kotlin.Unit> function15 = function12;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt.$r8$lambda$Z55eRqwrnCOXdk1eMhC6M1YkU0g(list, modifier3, z3, function15, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function12 = function1;
                if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function12 = function1;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function12 = function1;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData documentItemData, androidx.compose.ui.Modifier modifier, int i, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        int i6;
        int i7;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final int i8;
        boolean z2;
        androidx.compose.ui.Modifier.Companion companion;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1614776815);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? startRestartGroup.changed(documentItemData) : startRestartGroup.changedInstance(documentItemData) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i4 |= startRestartGroup.changed(i) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        function02 = function0;
                        i4 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
                        if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            i8 = i;
                            z2 = z;
                            companion = modifier2;
                            function03 = function02;
                        } else {
                            companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            final int i10 = i5 != 0 ? 0 : i;
                            z2 = i6 != 0 ? false : z;
                            if (i7 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt$$ExternalSyntheticLambda0
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
                                androidx.compose.runtime.ComposerKt.traceEventStart(1614776815, i4, -1, "com.paypal.oslo.feature.savings.ui.savingshub.DocumentItem (SavingsHubDocumentZone.kt:167)");
                            }
                            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                            androidx.compose.foundation.layout.Arrangement.Horizontal start = androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart();
                            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            boolean z3 = (57344 & i4) == 16384;
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt.$r8$lambda$z50ZY7p8ozpze5xObHpWoMluoIY(kotlin.jvm.functions.Function0.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            kotlin.jvm.functions.Function0<kotlin.Unit> function05 = function04;
                            androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(fillMaxWidth$default, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 31);
                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(start, centerVertically, startRestartGroup, 54);
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
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            final androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                            int i11 = ((i4 >> 3) & 896) | 3120;
                            com.paypal.pds.components.ShimmerKt.Shimmer((androidx.compose.ui.Modifier) null, com.paypal.pds.components.ShimmerStyle.Rounded.INSTANCE, z2, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(296512824, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt.$r8$lambda$I0U9rF15VvkaUMEa8xmo5uGp2r4(com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData.this, i10, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, startRestartGroup, 54), startRestartGroup, i11, 1);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                            com.paypal.pds.components.ShimmerKt.Shimmer((androidx.compose.ui.Modifier) null, com.paypal.pds.components.ShimmerStyle.Text.INSTANCE, z2, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1800524001, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt.$r8$lambda$rwF44JU2k6xZ_C14y3TFvMCgR0c(androidx.compose.foundation.layout.RowScope.this, documentItemData, i10, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, startRestartGroup, 54), startRestartGroup, i11, 1);
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            i8 = i10;
                            function03 = function05;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = companion;
                            final boolean z4 = z2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt.m18962$r8$lambda$AdEqyTSUCXB0wnBuXaoDEC4Nh0(com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData.this, modifier3, i8, z4, function03, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function02 = function0;
                    if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                function02 = function0;
                if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            function02 = function0;
            if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        function02 = function0;
        if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$Ad-EqyTSUCXB0wnBuXaoDEC4Nh0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18962$r8$lambda$AdEqyTSUCXB0wnBuXaoDEC4Nh0(com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData documentItemData, androidx.compose.ui.Modifier modifier, int i, boolean z, kotlin.jvm.functions.Function0 function0, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        getHighResolutionOutputSizeshNQ4ISI(documentItemData, modifier, i, z, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$I0U9rF15VvkaUMEa8xmo5uGp2r4(com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData documentItemData, int i, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(296512824, i2, -1, "com.paypal.oslo.feature.savings.ui.savingshub.DocumentItem.<anonymous>.<anonymous> (SavingsHubDocumentZone.kt:180)");
            }
            com.paypal.pds.components.IconKt.Icon(documentItemData.getIcon(), "", androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.DocumentZone.INSTANCE.documentItemIcon(i)), com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer, 27696, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TRgUOhF7pp6OtA7XA09WOTyWD5I(com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData documentItemData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentItemData, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TmHapIs1d6xG3QyW4tIzIORVLW4(com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData documentItemData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentItemData, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WMs0mPEIRkFsqv-_bIiJO_SavsU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18963$r8$lambda$WMs0mPEIRkFsqv_bIiJO_SavsU(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData documentItemData) {
        function1.invoke(documentItemData);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z55eRqwrnCOXdk1eMhC6M1YkU0g(java.util.List list, androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SavingsHubDocumentZone(list, modifier, z, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_i-66FcsKEZ4uTps_BB1O9Ng3Ho, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18964$r8$lambda$_i66FcsKEZ4uTps_BB1O9Ng3Ho(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1213357674);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1213357674, updateChangedFlags, -1, "com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZonePreview (SavingsHubDocumentZone.kt:227)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData[]{new com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData("PayPal Savings statements", null, new com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Destination(com.paypal.oslo.feature.savings.ui.savingshub.DocumentDestinationType.SAVINGS_STATEMENT), com.paypal.pds.core.Icon.Receipt.INSTANCE), new com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData("Synchrony Bank Deposit Account Agreement", null, new com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Pdf(com.paypal.oslo.feature.savings.constants.SavingsConstants.DocumentUrls.SYNCHRONY_ACCOUNT_AGREEMENT), com.paypal.pds.core.Icon.Bill.INSTANCE), new com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData("FDIC insurance", null, new com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Pdf("pdf url"), com.paypal.pds.core.Icon.NoIcon.INSTANCE), new com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData("Tax statement delivery preference", null, new com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Destination(com.paypal.oslo.feature.savings.ui.savingshub.DocumentDestinationType.TAX_PREFERENCES), com.paypal.pds.core.Icon.Send.INSTANCE), new com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData("Tax documents", null, new com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Web("web url"), com.paypal.pds.core.Icon.Document.INSTANCE)});
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt.$r8$lambda$TRgUOhF7pp6OtA7XA09WOTyWD5I((com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SavingsHubDocumentZone(listOf, m1706padding3ABfNKs, false, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 3072, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt.m18964$r8$lambda$_i66FcsKEZ4uTps_BB1O9Ng3Ho(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$heoXuQYJ4a5wBe8Mq-DTcUgMXNI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18965$r8$lambda$heoXuQYJ4a5wBe8MqDTcUgMXNI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-56096351);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-56096351, updateChangedFlags, -1, "com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemPreview (SavingsHubDocumentZone.kt:276)");
            }
            com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData documentItemData = new com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData("PayPal Savings statements", null, new com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Destination(com.paypal.oslo.feature.savings.ui.savingshub.DocumentDestinationType.SAVINGS_STATEMENT), com.paypal.pds.core.Icon.Document.INSTANCE);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighResolutionOutputSizeshNQ4ISI(documentItemData, null, 0, false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 24576, 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt.m18965$r8$lambda$heoXuQYJ4a5wBe8MqDTcUgMXNI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rwF44JU2k6xZ_C14y3TFvMCgR0c(androidx.compose.foundation.layout.RowScope rowScope, com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData documentItemData, int i, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1800524001, i2, -1, "com.paypal.oslo.feature.savings.ui.savingshub.DocumentItem.<anonymous>.<anonymous> (SavingsHubDocumentZone.kt:196)");
            }
            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScope, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, weight$default);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(documentItemData.getTitle(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.DocumentZone.INSTANCE.documentItemTitle(i)), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1016);
            java.lang.String subtitle = documentItemData.getSubtitle();
            if (subtitle == null) {
                composer.startReplaceGroup(-81480248);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-81480247);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), composer, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(subtitle, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.DocumentZone.INSTANCE.documentItemSubtitle(i)), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 384, 6, 1016);
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

    /* renamed from: $r8$lambda$tRRx-UevCQSAlkgNIJKW3p1yX5U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18966$r8$lambda$tRRxUevCQSAlkgNIJKW3p1yX5U(java.util.List list, boolean z, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(489506912, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZone.<anonymous>.<anonymous> (SavingsHubDocumentZone.kt:124)");
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
            composer.startReplaceGroup(-1685404725);
            int i2 = 0;
            for (java.lang.Object obj : list) {
                if (i2 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                final com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData documentItemData = (com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData) obj;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.copy$default(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Hub.INSTANCE.getDOCUMENT_ITEM(), null, 0, null, java.lang.Integer.valueOf(i2), 7, null)), com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Hub.INSTANCE.getDOCUMENT_ITEM_TAP()), com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.DocumentZone.INSTANCE.documentItem(i2));
                boolean changed = composer.changed(function1);
                boolean changedInstance = composer.changedInstance(documentItemData);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubDocumentZoneKt.m18963$r8$lambda$WMs0mPEIRkFsqv_bIiJO_SavsU(kotlin.jvm.functions.Function1.this, documentItemData);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                getHighResolutionOutputSizeshNQ4ISI(documentItemData, testTag, i2, z, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0, 0);
                if (i2 < list.size() - 1) {
                    composer.startReplaceGroup(2113197618);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(2113294679);
                    composer.endReplaceGroup();
                }
                i2++;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z50ZY7p8ozpze5xObHpWoMluoIY(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
