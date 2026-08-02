package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a5\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\r\u0010\u000f\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0012\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"IconButtonGroupItemTag", "", "IconButtonGroup", "", "items", "", "Lcom/paypal/pds/components/IconButtonGroupModel;", "modifier", "Landroidx/compose/ui/Modifier;", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/paypal/pds/components/ButtonSize;", "([Lcom/paypal/pds/components/IconButtonGroupModel;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/ButtonSize;Landroidx/compose/runtime/Composer;II)V", "FirstItemContentDescription", "SecondItemContentDescription", "ThirdItemContentDescription", "IconButtonGroupSizesPreview", "(Landroidx/compose/runtime/Composer;I)V", "IconButtonGroupStylesPreview", "IconButtonGroupVariableItemCountPreview", "pds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class IconButtonGroupKt {
    public static final java.lang.String IconButtonGroupItemTag = "IconButtonGroupItem";

    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconButtonGroup(final com.paypal.pds.components.IconButtonGroupModel[] iconButtonGroupModelArr, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.ButtonSize buttonSize, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        com.paypal.pds.components.ButtonSize buttonSize2;
        int i4;
        int i5;
        androidx.compose.ui.Modifier.Companion companion;
        com.paypal.pds.components.ButtonSize buttonSize3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iconButtonGroupModelArr, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1736578082);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i | 48;
            modifier2 = modifier;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 32 : 16) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            buttonSize2 = buttonSize;
            i3 |= startRestartGroup.changed(buttonSize2) ? 256 : 128;
            startRestartGroup.startMovableGroup(-1890740508, java.lang.Integer.valueOf(iconButtonGroupModelArr.length));
            i4 = i3 | (!startRestartGroup.changed(iconButtonGroupModelArr.length) ? 4 : 0);
            for (com.paypal.pds.components.IconButtonGroupModel iconButtonGroupModel : iconButtonGroupModelArr) {
                i4 |= startRestartGroup.changed(iconButtonGroupModel) ? 4 : 0;
            }
            startRestartGroup.endMovableGroup();
            if ((i4 & 14) == 0) {
                i4 |= 2;
            }
            i5 = i4;
            if (startRestartGroup.shouldExecute((i5 & 147) == 146, i5 & 1)) {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                buttonSize3 = buttonSize2;
            } else {
                companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                buttonSize3 = i7 != 0 ? com.paypal.pds.components.ButtonSize.Medium.INSTANCE : buttonSize2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1736578082, i5, -1, "com.paypal.pds.components.IconButtonGroup (IconButtonGroup.kt:44)");
                }
                androidx.compose.ui.Modifier pdsComponent = com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(companion);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, pdsComponent);
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
                startRestartGroup.startReplaceGroup(-952048834);
                int length = iconButtonGroupModelArr.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length) {
                    com.paypal.pds.components.IconButtonGroupModel iconButtonGroupModel2 = iconButtonGroupModelArr[i8];
                    com.paypal.pds.components.IconButtonKt.IconButton(iconButtonGroupModel2.getIcon(), iconButtonGroupModel2.getOnClick(), androidx.compose.ui.platform.TestTagKt.testTag(iconButtonGroupModel2.getAnalyticsScope().getModifier(), "IconButtonGroupItem_".concat(java.lang.String.valueOf(i9))), iconButtonGroupModel2.getStyle(), buttonSize3, iconButtonGroupModel2.getContentDescription(), null, false, false, startRestartGroup, (i5 << 6) & 57344, 448);
                    i8++;
                    i9++;
                    i5 = i5;
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                final com.paypal.pds.components.ButtonSize buttonSize4 = buttonSize3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.pds.components.IconButtonGroupKt.m21887$r8$lambda$eDKHn0qf5k3eYoQeSI2FVQKXZA(iconButtonGroupModelArr, modifier3, buttonSize4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        buttonSize2 = buttonSize;
        startRestartGroup.startMovableGroup(-1890740508, java.lang.Integer.valueOf(iconButtonGroupModelArr.length));
        i4 = i3 | (!startRestartGroup.changed(iconButtonGroupModelArr.length) ? 4 : 0);
        while (r12 < r9) {
        }
        startRestartGroup.endMovableGroup();
        if ((i4 & 14) == 0) {
        }
        i5 = i4;
        if (startRestartGroup.shouldExecute((i5 & 147) == 146, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$EpSuFxgoJ1XaDIB7-5wmZU5M9Us, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21881$r8$lambda$EpSuFxgoJ1XaDIB75wmZU5M9Us(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer composer3;
        androidx.compose.runtime.Composer composer4;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1005791241);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1005791241, updateChangedFlags, -1, "com.paypal.pds.components.IconButtonGroupSizesPreview (IconButtonGroup.kt:87)");
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16());
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Small", null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 6, 0, 2046);
            com.paypal.pds.components.IconButtonGroupModel[] iconButtonGroupModelArr = new com.paypal.pds.components.IconButtonGroupModel[3];
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer3 = startRestartGroup;
                composer3.updateRememberedValue(rememberedValue);
            } else {
                composer3 = startRestartGroup;
            }
            iconButtonGroupModelArr[0] = new com.paypal.pds.components.IconButtonGroupModel(null, defaultIcon, "First Action", (kotlin.jvm.functions.Function0) rememberedValue, null, 17, null);
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon2 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            java.lang.Object rememberedValue2 = composer3.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer3.updateRememberedValue(rememberedValue2);
            }
            iconButtonGroupModelArr[1] = new com.paypal.pds.components.IconButtonGroupModel(null, defaultIcon2, "Second Action", (kotlin.jvm.functions.Function0) rememberedValue2, null, 17, null);
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon3 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            java.lang.Object rememberedValue3 = composer3.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer3.updateRememberedValue(rememberedValue3);
            }
            iconButtonGroupModelArr[2] = new com.paypal.pds.components.IconButtonGroupModel(null, defaultIcon3, "Third Action", (kotlin.jvm.functions.Function0) rememberedValue3, null, 17, null);
            IconButtonGroup(iconButtonGroupModelArr, null, com.paypal.pds.components.ButtonSize.Small.INSTANCE, composer3, 384, 2);
            androidx.compose.runtime.Composer composer5 = composer3;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Medium (Default)", null, null, null, null, null, false, 0, 0, null, null, composer3, 6, 0, 2046);
            com.paypal.pds.components.IconButtonGroupModel[] iconButtonGroupModelArr2 = new com.paypal.pds.components.IconButtonGroupModel[3];
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon4 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            java.lang.Object rememberedValue4 = composer5.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer4 = composer5;
                composer4.updateRememberedValue(rememberedValue4);
            } else {
                composer4 = composer5;
            }
            iconButtonGroupModelArr2[0] = new com.paypal.pds.components.IconButtonGroupModel(null, defaultIcon4, "First Action", (kotlin.jvm.functions.Function0) rememberedValue4, null, 17, null);
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon5 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            java.lang.Object rememberedValue5 = composer4.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer4.updateRememberedValue(rememberedValue5);
            }
            iconButtonGroupModelArr2[1] = new com.paypal.pds.components.IconButtonGroupModel(null, defaultIcon5, "Second Action", (kotlin.jvm.functions.Function0) rememberedValue5, null, 17, null);
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon6 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            java.lang.Object rememberedValue6 = composer4.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer4.updateRememberedValue(rememberedValue6);
            }
            iconButtonGroupModelArr2[2] = new com.paypal.pds.components.IconButtonGroupModel(null, defaultIcon6, "Third Action", (kotlin.jvm.functions.Function0) rememberedValue6, null, 17, null);
            IconButtonGroup(iconButtonGroupModelArr2, null, null, composer4, 0, 6);
            androidx.compose.runtime.Composer composer6 = composer4;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Large", null, null, null, null, null, false, 0, 0, null, null, composer4, 6, 0, 2046);
            com.paypal.pds.components.IconButtonGroupModel[] iconButtonGroupModelArr3 = new com.paypal.pds.components.IconButtonGroupModel[3];
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon7 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            java.lang.Object rememberedValue7 = composer6.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2 = composer6;
                composer2.updateRememberedValue(rememberedValue7);
            } else {
                composer2 = composer6;
            }
            iconButtonGroupModelArr3[0] = new com.paypal.pds.components.IconButtonGroupModel(null, defaultIcon7, "First Action", (kotlin.jvm.functions.Function0) rememberedValue7, null, 17, null);
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon8 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            java.lang.Object rememberedValue8 = composer2.rememberedValue();
            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2.updateRememberedValue(rememberedValue8);
            }
            iconButtonGroupModelArr3[1] = new com.paypal.pds.components.IconButtonGroupModel(null, defaultIcon8, "Second Action", (kotlin.jvm.functions.Function0) rememberedValue8, null, 17, null);
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon9 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            java.lang.Object rememberedValue9 = composer2.rememberedValue();
            if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2.updateRememberedValue(rememberedValue9);
            }
            iconButtonGroupModelArr3[2] = new com.paypal.pds.components.IconButtonGroupModel(null, defaultIcon9, "Third Action", (kotlin.jvm.functions.Function0) rememberedValue9, null, 17, null);
            IconButtonGroup(iconButtonGroupModelArr3, null, com.paypal.pds.components.ButtonSize.Large.INSTANCE, composer2, 384, 2);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.IconButtonGroupKt.m21881$r8$lambda$EpSuFxgoJ1XaDIB75wmZU5M9Us(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MMTsngl6Z9yBtab3hJO_1HYW7pE(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer composer3;
        androidx.compose.runtime.Composer composer4;
        androidx.compose.runtime.Composer composer5;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-852100549);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-852100549, updateChangedFlags, -1, "com.paypal.pds.components.IconButtonGroupVariableItemCountPreview (IconButtonGroup.kt:183)");
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16());
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("One Icon Button", null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 6, 0, 2046);
            com.paypal.pds.components.IconButtonGroupModel[] iconButtonGroupModelArr = new com.paypal.pds.components.IconButtonGroupModel[1];
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer3 = startRestartGroup;
                composer3.updateRememberedValue(rememberedValue);
            } else {
                composer3 = startRestartGroup;
            }
            iconButtonGroupModelArr[0] = new com.paypal.pds.components.IconButtonGroupModel(null, defaultIcon, "Action 1", (kotlin.jvm.functions.Function0) rememberedValue, null, 17, null);
            IconButtonGroup(iconButtonGroupModelArr, null, null, composer3, 0, 6);
            androidx.compose.runtime.Composer composer6 = composer3;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Two Icon Buttons", null, null, null, null, null, false, 0, 0, null, null, composer3, 6, 0, 2046);
            com.paypal.pds.components.IconButtonGroupModel[] iconButtonGroupModelArr2 = new com.paypal.pds.components.IconButtonGroupModel[2];
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon2 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            java.lang.Object rememberedValue2 = composer6.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer4 = composer6;
                composer4.updateRememberedValue(rememberedValue2);
            } else {
                composer4 = composer6;
            }
            iconButtonGroupModelArr2[0] = new com.paypal.pds.components.IconButtonGroupModel(null, defaultIcon2, "Action 1", (kotlin.jvm.functions.Function0) rememberedValue2, null, 17, null);
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon3 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            java.lang.Object rememberedValue3 = composer4.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer4.updateRememberedValue(rememberedValue3);
            }
            iconButtonGroupModelArr2[1] = new com.paypal.pds.components.IconButtonGroupModel(null, defaultIcon3, "Action 2", (kotlin.jvm.functions.Function0) rememberedValue3, null, 17, null);
            IconButtonGroup(iconButtonGroupModelArr2, null, null, composer4, 0, 6);
            androidx.compose.runtime.Composer composer7 = composer4;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Three Icon Buttons", null, null, null, null, null, false, 0, 0, null, null, composer4, 6, 0, 2046);
            com.paypal.pds.components.IconButtonGroupModel[] iconButtonGroupModelArr3 = new com.paypal.pds.components.IconButtonGroupModel[3];
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon4 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon5 = defaultIcon4;
            java.lang.Object rememberedValue4 = composer7.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer5 = composer7;
                composer5.updateRememberedValue(rememberedValue4);
            } else {
                composer5 = composer7;
            }
            iconButtonGroupModelArr3[0] = new com.paypal.pds.components.IconButtonGroupModel(primary, defaultIcon5, "Left", (kotlin.jvm.functions.Function0) rememberedValue4, null, 16, null);
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon6 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon7 = defaultIcon6;
            java.lang.Object rememberedValue5 = composer5.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer5.updateRememberedValue(rememberedValue5);
            }
            iconButtonGroupModelArr3[1] = new com.paypal.pds.components.IconButtonGroupModel(secondary, defaultIcon7, "Center", (kotlin.jvm.functions.Function0) rememberedValue5, null, 16, null);
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon8 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon9 = defaultIcon8;
            java.lang.Object rememberedValue6 = composer5.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer5.updateRememberedValue(rememberedValue6);
            }
            iconButtonGroupModelArr3[2] = new com.paypal.pds.components.IconButtonGroupModel(tertiary, defaultIcon9, "Right", (kotlin.jvm.functions.Function0) rememberedValue6, null, 16, null);
            IconButtonGroup(iconButtonGroupModelArr3, null, null, composer5, 0, 6);
            androidx.compose.runtime.Composer composer8 = composer5;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Four Icon Buttons", null, null, null, null, null, false, 0, 0, null, null, composer5, 6, 0, 2046);
            com.paypal.pds.components.IconButtonGroupModel[] iconButtonGroupModelArr4 = new com.paypal.pds.components.IconButtonGroupModel[4];
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon10 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            java.lang.Object rememberedValue7 = composer8.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2 = composer8;
                composer2.updateRememberedValue(rememberedValue7);
            } else {
                composer2 = composer8;
            }
            iconButtonGroupModelArr4[0] = new com.paypal.pds.components.IconButtonGroupModel(null, defaultIcon10, "1", (kotlin.jvm.functions.Function0) rememberedValue7, null, 17, null);
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon11 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            java.lang.Object rememberedValue8 = composer2.rememberedValue();
            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2.updateRememberedValue(rememberedValue8);
            }
            iconButtonGroupModelArr4[1] = new com.paypal.pds.components.IconButtonGroupModel(null, defaultIcon11, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, (kotlin.jvm.functions.Function0) rememberedValue8, null, 17, null);
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon12 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            java.lang.Object rememberedValue9 = composer2.rememberedValue();
            if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2.updateRememberedValue(rememberedValue9);
            }
            iconButtonGroupModelArr4[2] = new com.paypal.pds.components.IconButtonGroupModel(null, defaultIcon12, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, (kotlin.jvm.functions.Function0) rememberedValue9, null, 17, null);
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon13 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            java.lang.Object rememberedValue10 = composer2.rememberedValue();
            if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2.updateRememberedValue(rememberedValue10);
            }
            iconButtonGroupModelArr4[3] = new com.paypal.pds.components.IconButtonGroupModel(null, defaultIcon13, "4", (kotlin.jvm.functions.Function0) rememberedValue10, null, 17, null);
            IconButtonGroup(iconButtonGroupModelArr4, null, com.paypal.pds.components.ButtonSize.Small.INSTANCE, composer2, 384, 2);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.IconButtonGroupKt.$r8$lambda$MMTsngl6Z9yBtab3hJO_1HYW7pE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_JM8dQ-ltaqoVjNLqihb4RUSNh8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21886$r8$lambda$_JM8dQltaqoVjNLqihb4RUSNh8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1569822381);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1569822381, updateChangedFlags, -1, "com.paypal.pds.components.IconButtonGroupStylesPreview (IconButtonGroup.kt:156)");
            }
            com.paypal.pds.components.IconButtonGroupModel[] iconButtonGroupModelArr = new com.paypal.pds.components.IconButtonGroupModel[3];
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon2 = defaultIcon;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            iconButtonGroupModelArr[0] = new com.paypal.pds.components.IconButtonGroupModel(primary, defaultIcon2, "First Action", (kotlin.jvm.functions.Function0) rememberedValue, null, 16, null);
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon3 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon4 = defaultIcon3;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            iconButtonGroupModelArr[1] = new com.paypal.pds.components.IconButtonGroupModel(secondary, defaultIcon4, "Second Action", (kotlin.jvm.functions.Function0) rememberedValue2, null, 16, null);
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon5 = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon6 = defaultIcon5;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            iconButtonGroupModelArr[2] = new com.paypal.pds.components.IconButtonGroupModel(tertiary, defaultIcon6, "Third Action", (kotlin.jvm.functions.Function0) rememberedValue3, null, 16, null);
            IconButtonGroup(iconButtonGroupModelArr, null, null, startRestartGroup, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.IconButtonGroupKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.IconButtonGroupKt.m21886$r8$lambda$_JM8dQltaqoVjNLqihb4RUSNh8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$eDK-Hn0qf5k3eYoQeSI2FVQKXZA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21887$r8$lambda$eDKHn0qf5k3eYoQeSI2FVQKXZA(com.paypal.pds.components.IconButtonGroupModel[] iconButtonGroupModelArr, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.ButtonSize buttonSize, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        IconButtonGroup(iconButtonGroupModelArr, modifier, buttonSize, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
