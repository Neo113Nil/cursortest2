package com.paypal.oslo.feature.savings.ui.savingshub;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00030\u000bH\u0001¢\u0006\u0002\u0010\u000e\u001aS\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0001¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"ShimmerLineThreeWidthFraction", "", "SavingsHubPromoZone", "", "dto", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/PromoZoneDTO;", "modifier", "Landroidx/compose/ui/Modifier;", "isLoading", "", "onTileClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/Action;", "onDismissClick", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/PromoZoneDTO;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SavingsHubPromoTile", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/PromoTileDTO;", "tileIndex", "", "onClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/PromoTileDTO;Landroidx/compose/ui/Modifier;IZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SavingsHubPromoTilePreview", "(Landroidx/compose/runtime/Composer;I)V", "SavingsHubPromoZonePreview", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsHubPromoZoneKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SavingsHubPromoZone(final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneDTO promoZoneDTO, androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        boolean z2;
        int i4;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action, kotlin.Unit> function13;
        int i5;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action, kotlin.Unit> function14;
        androidx.compose.ui.Modifier.Companion companion;
        final boolean z3;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action, kotlin.Unit> function15;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action, kotlin.Unit> function16;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action, kotlin.Unit> function17;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action, kotlin.Unit> function18;
        int i6;
        java.lang.Object obj;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action, kotlin.Unit> function19;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action, kotlin.Unit> function110;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promoZoneDTO, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-959712055);
        int i8 = (i & 6) == 0 ? (startRestartGroup.changedInstance(promoZoneDTO) ? 4 : 2) | i : i;
        int i9 = i2 & 2;
        if (i9 != 0) {
            i8 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i8 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i8 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i8 |= startRestartGroup.changed(z2) ? 256 : 128;
                i4 = i2 & 8;
                if (i4 != 0) {
                    i8 |= 3072;
                } else if ((i & 3072) == 0) {
                    function13 = function1;
                    i8 |= startRestartGroup.changedInstance(function13) ? 2048 : 1024;
                    i5 = i2 & 16;
                    if (i5 == 0) {
                        i8 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function14 = function12;
                        i8 |= startRestartGroup.changedInstance(function14) ? 16384 : 8192;
                        int i10 = 1;
                        if (!startRestartGroup.shouldExecute((i8 & 9363) != 9362, i8 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier2;
                            z3 = z2;
                            function15 = function13;
                            function16 = function14;
                        } else {
                            companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            boolean z4 = i3 != 0 ? false : z2;
                            if (i4 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj2) {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function17 = (kotlin.jvm.functions.Function1) rememberedValue;
                            } else {
                                function17 = function13;
                            }
                            if (i5 != 0) {
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj2) {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function18 = (kotlin.jvm.functions.Function1) rememberedValue2;
                            } else {
                                function18 = function14;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-959712055, i8, -1, "com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZone (SavingsHubPromoZone.kt:74)");
                            }
                            java.lang.Object obj2 = null;
                            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Hub.INSTANCE.getPROMO_ZONE()), com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.PromoZone.SECTION);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 6);
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
                            startRestartGroup.startReplaceGroup(2079755681);
                            int i11 = 0;
                            for (java.lang.Object obj3 : promoZoneDTO.getTiles()) {
                                if (i11 < 0) {
                                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                                }
                                final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneBaseDTO promoZoneBaseDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneBaseDTO) obj3;
                                if (promoZoneBaseDTO instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO) {
                                    startRestartGroup.startReplaceGroup(-499069054);
                                    com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO promoTileDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO) promoZoneBaseDTO;
                                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i10, obj2), com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.copy$default(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Hub.INSTANCE.getPROMO_TILE(), null, 0, null, java.lang.Integer.valueOf(i11), 7, null)), com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Hub.INSTANCE.getPROMO_TILE_TAP()), com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.PromoZone.INSTANCE.promoTile(i11));
                                    boolean z5 = (i8 & 7168) == 2048;
                                    boolean changedInstance = startRestartGroup.changedInstance(promoZoneBaseDTO);
                                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                    if ((z5 | changedInstance) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt$$ExternalSyntheticLambda10
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt.$r8$lambda$YSGKdTHrqABbTg_QZ5r8MkLzAuA(kotlin.jvm.functions.Function1.this, promoZoneBaseDTO);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                                    boolean z6 = (57344 & i8) == 16384;
                                    boolean changedInstance2 = startRestartGroup.changedInstance(promoZoneBaseDTO);
                                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                    if ((z6 | changedInstance2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt$$ExternalSyntheticLambda11
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt.m18969$r8$lambda$1M9lub8PSSV02FygIa58GrMg0I(kotlin.jvm.functions.Function1.this, promoZoneBaseDTO);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    i6 = i11;
                                    obj = null;
                                    function19 = function18;
                                    function110 = function17;
                                    i7 = 1;
                                    SavingsHubPromoTile(promoTileDTO, testTag2, i11, z4, function0, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, (i8 << 3) & 7168, 0);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    i6 = i11;
                                    obj = obj2;
                                    function19 = function18;
                                    function110 = function17;
                                    i7 = i10;
                                    startRestartGroup.startReplaceGroup(-498221669);
                                    startRestartGroup.endReplaceGroup();
                                }
                                i11 = i6 + 1;
                                i10 = i7;
                                obj2 = obj;
                                function18 = function19;
                                function17 = function110;
                            }
                            kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action, kotlin.Unit> function111 = function18;
                            function15 = function17;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            z3 = z4;
                            function16 = function111;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = companion;
                            final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action, kotlin.Unit> function112 = function15;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                                    return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt.$r8$lambda$5q84yARfdTVH8oRcCEpfNyIVmBo(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneDTO.this, modifier3, z3, function112, function16, i, i2, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function14 = function12;
                    int i102 = 1;
                    if (!startRestartGroup.shouldExecute((i8 & 9363) != 9362, i8 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function13 = function1;
                i5 = i2 & 16;
                if (i5 == 0) {
                }
                function14 = function12;
                int i1022 = 1;
                if (!startRestartGroup.shouldExecute((i8 & 9363) != 9362, i8 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i4 = i2 & 8;
            if (i4 != 0) {
            }
            function13 = function1;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function14 = function12;
            int i10222 = 1;
            if (!startRestartGroup.shouldExecute((i8 & 9363) != 9362, i8 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        z2 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function13 = function1;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function14 = function12;
        int i102222 = 1;
        if (!startRestartGroup.shouldExecute((i8 & 9363) != 9362, i8 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SavingsHubPromoTile(final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO promoTileDTO, androidx.compose.ui.Modifier modifier, int i, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        int i8;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        final int i9;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promoTileDTO, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1076040636);
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 = i2 | 48;
            modifier2 = modifier;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 32 : 16) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i5 = i;
            i4 |= startRestartGroup.changed(i5) ? 256 : 128;
            i6 = i3 & 8;
            if (i6 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    function03 = function0;
                    i4 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i2) == 0) {
                        function04 = function02;
                        i4 |= startRestartGroup.changedInstance(function04) ? 131072 : 65536;
                        if (!startRestartGroup.shouldExecute((74897 & i4) != 74896, i4 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            i9 = i5;
                            function05 = function03;
                            function06 = function04;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i10 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            i9 = i11 != 0 ? 0 : i5;
                            final boolean z3 = i6 != 0 ? false : z2;
                            if (i7 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt$$ExternalSyntheticLambda13
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function07 = (kotlin.jvm.functions.Function0) rememberedValue;
                            } else {
                                function07 = function03;
                            }
                            if (i8 != 0) {
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt$$ExternalSyntheticLambda14
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function08 = (kotlin.jvm.functions.Function0) rememberedValue2;
                            } else {
                                function08 = function04;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1076040636, i4, -1, "com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoTile (SavingsHubPromoZone.kt:118)");
                            }
                            kotlin.jvm.functions.Function0<kotlin.Unit> function09 = function08;
                            com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), com.paypal.pds.core.Color.BackgroundCardFilled.INSTANCE, null, com.paypal.pds.components.CardStyle.Filled.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1890245730, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt.$r8$lambda$geni5lvUq4wVoLujH0FWrduKvrg(z3, function07, i9, function08, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Filled.$stable << 9) | 805306416, 500);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            z2 = z3;
                            function05 = function07;
                            modifier2 = companion;
                            function06 = function09;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = modifier2;
                            final boolean z4 = z2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt.m18972$r8$lambda$cNQeaMb0SpMevH1PM5dC8tYne4(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO.this, modifier3, i9, z4, function05, function06, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function04 = function02;
                    if (!startRestartGroup.shouldExecute((74897 & i4) != 74896, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function03 = function0;
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                function04 = function02;
                if (!startRestartGroup.shouldExecute((74897 & i4) != 74896, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            function03 = function0;
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            function04 = function02;
            if (!startRestartGroup.shouldExecute((74897 & i4) != 74896, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i;
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        function03 = function0;
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        function04 = function02;
        if (!startRestartGroup.shouldExecute((74897 & i4) != 74896, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$1M9lub8PSSV02FygIa58GrMg0-I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18969$r8$lambda$1M9lub8PSSV02FygIa58GrMg0I(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneBaseDTO promoZoneBaseDTO) {
        function1.invoke(((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO) promoZoneBaseDTO).getDismissAction());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5q84yARfdTVH8oRcCEpfNyIVmBo(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneDTO promoZoneDTO, androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SavingsHubPromoZone(promoZoneDTO, modifier, z, function1, function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8eAZKoWq1EZTJwFoHuGwDCJQsd8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-849136202);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-849136202, updateChangedFlags, -1, "com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZonePreview (SavingsHubPromoZone.kt:271)");
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneDTO promoZoneDTO = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneDTO(kotlin.collections.CollectionsKt.arrayListOf(new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO("Arrow", new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Destination(com.paypal.oslo.feature.userprofile.domain.model.constants.PhoneConstants.HOME), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Dismiss(com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS))));
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            SavingsHubPromoZone(promoZoneDTO, m1706padding3ABfNKs, false, function1, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 27696, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt.$r8$lambda$8eAZKoWq1EZTJwFoHuGwDCJQsd8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$M4VNCuvApbQnGZrXGgRzr9bWebs(int i, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-429227197, i2, -1, "com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoTile.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SavingsHubPromoZone.kt:141)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.ArrowsVerticalLine.INSTANCE), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.PromoZone.INSTANCE.promoTileIcon(i)), com.paypal.pds.components.AvatarSize.Large.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentMuted.INSTANCE, com.paypal.pds.core.Color.BackgroundBase.INSTANCE), null, null, composer, com.paypal.pds.components.AvatarSize.Large.$stable << 6, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YSGKdTHrqABbTg_QZ5r8MkLzAuA(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneBaseDTO promoZoneBaseDTO) {
        function1.invoke(((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO) promoZoneBaseDTO).getAction());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cNQeaMb0SpMe-vH1PM5dC8tYne4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18972$r8$lambda$cNQeaMb0SpMevH1PM5dC8tYne4(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO promoTileDTO, androidx.compose.ui.Modifier modifier, int i, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        SavingsHubPromoTile(promoTileDTO, modifier, i, z, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$geni5lvUq4wVoLujH0FWrduKvrg(boolean z, kotlin.jvm.functions.Function0 function0, final int i, kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance;
        androidx.compose.runtime.Composer composer2;
        int i3;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1890245730, i2, -1, "com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoTile.<anonymous> (SavingsHubPromoZone.kt:124)");
            }
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical spaceBetween = androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween();
            androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, !z, null, null, function0, composer, 6, 27);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m22100clickable_mRqjOc);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            androidx.compose.ui.Alignment.Vertical centerVertically2 = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.foundation.layout.Arrangement.Horizontal start = androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart();
            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance2, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(start, centerVertically2, composer, 54);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, weight$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance3 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.ShimmerKt.Shimmer((androidx.compose.ui.Modifier) null, com.paypal.pds.components.ShimmerStyle.Rounded.INSTANCE, z, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-429227197, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt.$r8$lambda$M4VNCuvApbQnGZrXGgRzr9bWebs(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3120, 1);
            if (z) {
                composer.startReplaceGroup(1687119492);
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), 0.0f, 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 6);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1708paddingVpY3zN4$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.pds.components.ShimmerKt.Shimmer(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.components.ShimmerStyle) com.paypal.pds.components.ShimmerStyle.Text.INSTANCE, true, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) com.paypal.oslo.feature.savings.ui.savingshub.ComposableSingletons$SavingsHubPromoZoneKt.INSTANCE.getLambda$262729938$savings_prodRelease(), composer, 3510, 0);
                com.paypal.pds.components.ShimmerKt.Shimmer(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.components.ShimmerStyle) com.paypal.pds.components.ShimmerStyle.Text.INSTANCE, true, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) com.paypal.oslo.feature.savings.ui.savingshub.ComposableSingletons$SavingsHubPromoZoneKt.INSTANCE.getLambda$213785851$savings_prodRelease(), composer, 3510, 0);
                com.paypal.pds.components.ShimmerKt.Shimmer(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(androidx.compose.ui.Modifier.INSTANCE, 0.6f), (com.paypal.pds.components.ShimmerStyle) com.paypal.pds.components.ShimmerStyle.Text.INSTANCE, true, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) com.paypal.oslo.feature.savings.ui.savingshub.ComposableSingletons$SavingsHubPromoZoneKt.INSTANCE.getLambda$2041284890$savings_prodRelease(), composer, 3510, 0);
                composer.endNode();
                composer.endReplaceGroup();
                rowScopeInstance = rowScopeInstance2;
                composer2 = composer;
                i3 = 0;
            } else {
                composer.startReplaceGroup(1689196616);
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
                int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1708paddingVpY3zN4$default2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                rowScopeInstance = rowScopeInstance2;
                composer2 = composer;
                i3 = 0;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_promo_tile_content, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.PromoZone.INSTANCE.promoTileContent(i)), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, composer, 384, 6, 1016);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_promo_tile_content_description, composer2, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1018);
                composer.endNode();
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (z) {
                composer2.startReplaceGroup(2084457640);
                composer.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(2083841081);
                com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.Close.INSTANCE, function02, androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(rowScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTop()), com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Hub.INSTANCE.getPROMO_DISMISS_BUTTON()), com.paypal.oslo.feature.savings.ui.testtags.SavingsHubTestTags.PromoZone.INSTANCE.promoTileDismiss(i)), com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_promo_open_smart_route, composer2, i3), null, false, false, composer, 27654, 448);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$hhr1anOdQWUdcIFqPQKvBs24v18(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(837141876);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(837141876, updateChangedFlags, -1, "com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoTilePreview (SavingsHubPromoZone.kt:241)");
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO promoTileDTO = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO("Arrow", new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Destination(com.paypal.oslo.feature.userprofile.domain.model.constants.PhoneConstants.HOME), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Dismiss(com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS));
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f));
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 6);
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
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            SavingsHubPromoTile(promoTileDTO, m1706padding3ABfNKs, 0, false, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 224304, 4);
            androidx.compose.ui.Modifier m1706padding3ABfNKs2 = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f));
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            SavingsHubPromoTile(promoTileDTO, m1706padding3ABfNKs2, 0, true, function02, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 224304, 4);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubPromoZoneKt.$r8$lambda$hhr1anOdQWUdcIFqPQKvBs24v18(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
