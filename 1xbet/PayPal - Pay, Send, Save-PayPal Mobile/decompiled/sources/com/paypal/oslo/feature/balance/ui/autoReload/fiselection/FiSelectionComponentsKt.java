package com.paypal.oslo.feature.balance.ui.autoReload.fiselection;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001aU\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001aG\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0018\u001a\u0015\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001c\u001a5\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010 \u001a\r\u0010!\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001c¨\u0006\""}, d2 = {"FiSectionHeader", "", "title", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FiList", "fiItems", "", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentOption;", "selectedFiId", "reloadAmount", "Ljava/math/BigDecimal;", "onSelectFi", "Lkotlin/Function1;", "isBusinessAccount", "", "(Ljava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "FiListItem", "fi", "isSelected", "onClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentOption;ZLjava/math/BigDecimal;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "buildFiDescription", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentOption;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "CheckmarkIcon", "(Landroidx/compose/runtime/Composer;I)V", "AddFundingSourceItem", "icon", "Lcom/paypal/pds/core/Icon;", "(Ljava/lang/String;Lcom/paypal/pds/core/Icon;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SavingsInfoMessage", "balance_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FiSelectionComponentsKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FiSectionHeader(final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(85717862);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(85717862, i3, -1, "com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSectionHeader (FiSelectionComponents.kt:61)");
                }
                int i5 = (i3 & 14) | 384 | (i3 & 112);
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, modifier3, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, startRestartGroup, i5, 6, 1016);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt.m12052$r8$lambda$NLynfm4f4hgHfcH3uOFp04eAu4(str, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FiList(final java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> list, final java.lang.String str, final java.math.BigDecimal bigDecimal, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(801337558);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(bigDecimal) ? 256 : 128;
        }
        int i6 = 2048;
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                i5 = i3;
                boolean z5 = false;
                if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    z3 = z2;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    boolean z6 = i4 != 0 ? false : z2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(801337558, i5, -1, "com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiList (FiSelectionComponents.kt:82)");
                    }
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
                    startRestartGroup.startReplaceGroup(518652128);
                    java.util.Iterator it = list.iterator();
                    int i8 = 0;
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        if (i8 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        final com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) next;
                        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(fundingInstrumentOption.getInstrumentId(), str);
                        final boolean z7 = (!(fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption) || ((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption) fundingInstrumentOption).getCurrentBalance().getAmount().compareTo(bigDecimal) >= 0) ? z5 : true;
                        boolean changed = startRestartGroup.changed(z7);
                        boolean z8 = (i5 & 7168) == i6;
                        boolean changedInstance = startRestartGroup.changedInstance(fundingInstrumentOption);
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if ((changed | z8 | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt.m12053$r8$lambda$lNCLU3qZXFAbBbm8BUNGx80XGk(z7, function1, fundingInstrumentOption);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        java.util.Iterator it2 = it;
                        int i9 = i8;
                        androidx.compose.ui.Modifier modifier4 = modifier3;
                        int i10 = i5;
                        getHighSpeedVideoFpsRangesFor(fundingInstrumentOption, areEqual, bigDecimal, (kotlin.jvm.functions.Function0) rememberedValue, null, z6, startRestartGroup, i5 & 459648, 16);
                        if (i9 < kotlin.collections.CollectionsKt.getLastIndex(list)) {
                            startRestartGroup.startReplaceGroup(333587388);
                            z4 = false;
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            z4 = false;
                            startRestartGroup.startReplaceGroup(333660424);
                            startRestartGroup.endReplaceGroup();
                        }
                        i8 = i9 + 1;
                        it = it2;
                        z5 = z4;
                        i6 = 2048;
                        modifier3 = modifier4;
                        i5 = i10;
                    }
                    androidx.compose.ui.Modifier modifier5 = modifier3;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    z3 = z6;
                    modifier2 = modifier5;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt.$r8$lambda$xvZIQhwXnqWplorPSBqZIiyWfh4(list, str, bigDecimal, function1, modifier2, z3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            i5 = i3;
            boolean z52 = false;
            if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i3;
        boolean z522 = false;
        if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x00f0, code lost:
    
        if (r10 == null) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0402  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption, final boolean z, final java.math.BigDecimal bigDecimal, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, boolean z2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final boolean z3;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption fundingInstrumentBankOption;
        java.lang.String str4;
        boolean z4;
        java.lang.Object rememberedValue;
        int i5;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType bankType;
        java.lang.String name2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(158283788);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(fundingInstrumentOption) : startRestartGroup.changedInstance(fundingInstrumentOption) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(bigDecimal) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    z3 = z2;
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    boolean z5 = i4 != 0 ? false : z2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(158283788, i3, -1, "com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiListItem (FiSelectionComponents.kt:113)");
                    }
                    java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
                    java.lang.String instrumentId = fundingInstrumentOption.getInstrumentId();
                    boolean z6 = fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption;
                    if (z6) {
                        str2 = "bank";
                    } else if (fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption) {
                        java.lang.String productClass = ((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption) fundingInstrumentOption).getProductClass();
                        if (productClass != null) {
                            str3 = productClass.toLowerCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
                        }
                        str3 = "";
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(str3);
                        sb.append("_card");
                        str2 = sb.toString();
                    } else if (fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption) {
                        str2 = "savings";
                    } else {
                        str = "";
                        fundingInstrumentBankOption = !z6 ? (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) fundingInstrumentOption : null;
                        if (fundingInstrumentBankOption != null || (bankType = fundingInstrumentBankOption.getBankType()) == null || (name2 = bankType.name()) == null) {
                            str4 = null;
                        } else {
                            java.lang.String lowerCase = name2.toLowerCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                            str4 = lowerCase;
                        }
                        com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption fundingInstrumentCardOption = !(fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption) ? (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption) fundingInstrumentOption : null;
                        com.paypal.oslo.core.telemetry.analytics.schema.context.domain.FundingInstrumentContext fundingInstrumentContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.FundingInstrumentContext(emptyList, instrumentId, null, str, str4, "", fundingInstrumentCardOption == null ? fundingInstrumentCardOption.getBrand() : null, "");
                        androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                        z4 = (i3 & 7168) != 2048;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z4 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt.$r8$lambda$WzPVxaeyXr7C0IkaZtwtLKdildA(kotlin.jvm.functions.Function0.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        modifier3 = modifier4;
                        androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(fillMaxWidth$default, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 31), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f), 1, null), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getFI_SELECTION_ITEM()), kotlin.collections.CollectionsKt.listOf(fundingInstrumentContext));
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, context);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
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
                        com.paypal.oslo.feature.balance.common.ui.FundingInstrumentThumbnailKt.FundingInstrumentThumbnail(fundingInstrumentOption.getImageUrl(), com.paypal.oslo.feature.balance.common.ui.FundingInstrumentThumbnailKt.getFallbackIcon(fundingInstrumentOption.getType()), startRestartGroup, 0);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                        androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor2);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(fundingInstrumentOption.getName(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(getHighResolutionOutputSizeshNQ4ISI(fundingInstrumentOption, i3 & 14), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelSmall.INSTANCE, startRestartGroup, 384, 6, 1018);
                        if (!(fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption) && ((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption) fundingInstrumentOption).getCurrentBalance().getAmount().compareTo(bigDecimal) < 0) {
                            startRestartGroup.startReplaceGroup(-1976610674);
                            i5 = 0;
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                            com.paypal.pds.components.ContextualAlertKt.ContextualAlert(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_fi_insufficient_balance, startRestartGroup, 0), null, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, startRestartGroup, com.paypal.pds.components.ContextualAlertStyle.Negative.$stable << 6, 2);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            i5 = 0;
                            if (!(fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentDepositOption) && fundingInstrumentOption.getMode() == com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.INSTANT && (!z6 || !z5)) {
                                startRestartGroup.startReplaceGroup(-1449217920);
                                java.lang.String formattedLimit = ((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentDepositOption) fundingInstrumentOption).getFormattedLimit();
                                if (formattedLimit != null) {
                                    startRestartGroup.startReplaceGroup(-1976082558);
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                                    com.paypal.pds.components.ContextualAlertKt.ContextualAlert(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_fi_selection_limit_available, new java.lang.Object[]{formattedLimit}, startRestartGroup, 0), null, com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE, startRestartGroup, com.paypal.pds.components.ContextualAlertStyle.Neutral.$stable << 6, 2);
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    startRestartGroup.endReplaceGroup();
                                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                } else {
                                    startRestartGroup.startReplaceGroup(-1976082559);
                                    startRestartGroup.endReplaceGroup();
                                }
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-1975595300);
                                startRestartGroup.endReplaceGroup();
                            }
                        }
                        startRestartGroup.endNode();
                        if (!z) {
                            startRestartGroup.startReplaceGroup(-1944279629);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, i5);
                            CheckmarkIcon(startRestartGroup, i5);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-1944188334);
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        z3 = z5;
                    }
                    str = str2;
                    if (!z6) {
                    }
                    if (fundingInstrumentBankOption != null) {
                    }
                    str4 = null;
                    if (!(fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption)) {
                    }
                    com.paypal.oslo.core.telemetry.analytics.schema.context.domain.FundingInstrumentContext fundingInstrumentContext2 = new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.FundingInstrumentContext(emptyList, instrumentId, null, str, str4, "", fundingInstrumentCardOption == null ? fundingInstrumentCardOption.getBrand() : null, "");
                    androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    if ((i3 & 7168) != 2048) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z4) {
                    }
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt.$r8$lambda$WzPVxaeyXr7C0IkaZtwtLKdildA(kotlin.jvm.functions.Function0.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    modifier3 = modifier4;
                    androidx.compose.ui.Modifier context2 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(fillMaxWidth$default2, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 31), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f), 1, null), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getFI_SELECTION_ITEM()), kotlin.collections.CollectionsKt.listOf(fundingInstrumentContext2));
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, context2);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    com.paypal.oslo.feature.balance.common.ui.FundingInstrumentThumbnailKt.FundingInstrumentThumbnail(fundingInstrumentOption.getImageUrl(), com.paypal.oslo.feature.balance.common.ui.FundingInstrumentThumbnailKt.getFallbackIcon(fundingInstrumentOption.getType()), startRestartGroup, 0);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                    androidx.compose.ui.Modifier weight$default2 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance2, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode22 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier22 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl22 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl22, java.lang.Integer.valueOf(hashCode22), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, materializeModifier22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(fundingInstrumentOption.getName(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(getHighResolutionOutputSizeshNQ4ISI(fundingInstrumentOption, i3 & 14), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelSmall.INSTANCE, startRestartGroup, 384, 6, 1018);
                    if (!(fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption)) {
                    }
                    i5 = 0;
                    if (!(fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentDepositOption)) {
                    }
                    startRestartGroup.startReplaceGroup(-1975595300);
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.endNode();
                    if (!z) {
                    }
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z5;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt.m12051$r8$lambda$DBGmcpTPgq3SWAkLOtKgJhQo0(com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption.this, z, bigDecimal, function0, modifier5, z3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption, int i) {
        java.lang.String description;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-472488364, i, -1, "com.paypal.oslo.feature.balance.ui.autoReload.fiselection.buildFiDescription (FiSelectionComponents.kt:188)");
        }
        if (fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) {
            com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption fundingInstrumentBankOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) fundingInstrumentOption;
            com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType bankType = fundingInstrumentBankOption.getBankType();
            java.lang.String last4Digits = fundingInstrumentBankOption.getLast4Digits();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(bankType);
            sb.append(" ••••");
            sb.append(last4Digits);
            description = sb.toString();
        } else if (fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption) {
            com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption fundingInstrumentCardOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption) fundingInstrumentOption;
            java.lang.String brand = fundingInstrumentCardOption.getBrand();
            java.lang.String last4Digits2 = fundingInstrumentCardOption.getLast4Digits();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(brand);
            sb2.append(" ••••");
            sb2.append(last4Digits2);
            description = sb2.toString();
        } else {
            description = fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption ? ((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption) fundingInstrumentOption).getDescription() : "";
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return description;
    }

    public static final void CheckmarkIcon(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1183047383);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1183047383, i, -1, "com.paypal.oslo.feature.balance.ui.autoReload.fiselection.CheckmarkIcon (FiSelectionComponents.kt:201)");
            }
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.CheckmarkCircleFill.INSTANCE, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 27702, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt.$r8$lambda$UJRki3V__9GwTuD9bAaPBaDXQEo(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddFundingSourceItem(final java.lang.String str, final com.paypal.pds.core.Icon icon, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1218154718);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(icon) ? 32 : 16;
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
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1218154718, i4, -1, "com.paypal.oslo.feature.balance.ui.autoReload.fiselection.AddFundingSourceItem (FiSelectionComponents.kt:219)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                boolean z = (i4 & 896) == 256;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt.$r8$lambda$qeDjc50JlKbdigirKPZdfEmeBZo(kotlin.jvm.functions.Function0.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(fillMaxWidth$default, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 31), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
                com.paypal.pds.components.IconKt.Icon(icon, null, androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(48.0f)), androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f)), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f)), startRestartGroup, 54, 0), androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f)), com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, ((i4 >> 3) & 14) | 27696, 0);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, (i4 & 14) | 384, 6, 1018);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt.$r8$lambda$izsZBopj3_b8e4A5otCm9Y4exsA(str, icon, function0, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static final void SavingsInfoMessage(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(56370135);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(56370135, i, -1, "com.paypal.oslo.feature.balance.ui.autoReload.fiselection.SavingsInfoMessage (FiSelectionComponents.kt:251)");
            }
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Information.INSTANCE, null, null, com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentMuted.INSTANCE, startRestartGroup, 27702, 4);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), startRestartGroup, 0);
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_fi_savings_upsell, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt.$r8$lambda$L5cDZPUwGSW3Wipyf_d1E3AvdkE(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$DBGmcpTP-gq3SWAkLOtKgJhQ-o0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12051$r8$lambda$DBGmcpTPgq3SWAkLOtKgJhQo0(com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption, boolean z, java.math.BigDecimal bigDecimal, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, boolean z2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(fundingInstrumentOption, z, bigDecimal, function0, modifier, z2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$L5cDZPUwGSW3Wipyf_d1E3AvdkE(int i, androidx.compose.runtime.Composer composer, int i2) {
        SavingsInfoMessage(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NLynfm4f4hgHfcH3-uOFp04eAu4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12052$r8$lambda$NLynfm4f4hgHfcH3uOFp04eAu4(java.lang.String str, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FiSectionHeader(str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UJRki3V__9GwTuD9bAaPBaDXQEo(int i, androidx.compose.runtime.Composer composer, int i2) {
        CheckmarkIcon(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WzPVxaeyXr7C0IkaZtwtLKdildA(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$izsZBopj3_b8e4A5otCm9Y4exsA(java.lang.String str, com.paypal.pds.core.Icon icon, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddFundingSourceItem(str, icon, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$l-NCLU3qZXFAbBbm8BUNGx80XGk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12053$r8$lambda$lNCLU3qZXFAbBbm8BUNGx80XGk(boolean z, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption) {
        if (!z) {
            function1.invoke(fundingInstrumentOption);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qeDjc50JlKbdigirKPZdfEmeBZo(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xvZIQhwXnqWplorPSBqZIiyWfh4(java.util.List list, java.lang.String str, java.math.BigDecimal bigDecimal, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FiList(list, str, bigDecimal, function1, modifier, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
