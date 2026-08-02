package com.paypal.oslo.feature.businesscustomers.ui.customerprofile.components;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ao\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"PersonalInfoItem", "", "text", "", "icon", "Lcom/paypal/pds/core/Icon;", "itemTitle", "", "modifier", "Landroidx/compose/ui/Modifier;", "copyTracking", "Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement;", "typography", "Lcom/paypal/pds/core/Typography;", "onCopyClick", "Lkotlin/Function1;", "onItemClick", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/paypal/pds/core/Icon;ILandroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement;Lcom/paypal/pds/core/Typography;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CustomerProfilePersonalInfoItemPreview", "(Landroidx/compose/runtime/Composer;I)V", "business-customers_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoItemKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PersonalInfoItem(final java.lang.String str, final com.paypal.pds.core.Icon icon, final int i, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement trackedElement, com.paypal.pds.core.Typography typography, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        final androidx.compose.ui.Modifier modifier2;
        int i5;
        int i6;
        int i7;
        int i8;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement trackedElement2;
        final com.paypal.pds.core.Typography typography2;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement trackedElement3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1810631159);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(icon) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i4 |= (32768 & i2) == 0 ? startRestartGroup.changed(trackedElement) : startRestartGroup.changedInstance(trackedElement) ? 16384 : 8192;
            }
            i6 = i3 & 32;
            if (i6 == 0) {
                i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i2) == 0) {
                i4 |= startRestartGroup.changed(typography) ? 131072 : 65536;
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i4 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                }
                if (!startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    trackedElement2 = trackedElement;
                    typography2 = typography;
                    function12 = function1;
                    function02 = function0;
                } else {
                    if (i9 != 0) {
                        modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                    }
                    com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement trackedElement4 = i5 != 0 ? null : trackedElement;
                    com.paypal.pds.core.Typography typography3 = i6 != 0 ? com.paypal.pds.core.Typography.BodyMedium.INSTANCE : typography;
                    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13 = i7 != 0 ? null : function1;
                    if (i8 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.components.PersonalInfoItemKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function03 = (kotlin.jvm.functions.Function0) rememberedValue;
                    } else {
                        function03 = function0;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1810631159, i4, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.components.PersonalInfoItem (PersonalInfoItem.kt:48)");
                    }
                    androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(modifier2, 0.0f, com.paypal.pds.core.ConstantsKt.getSize4(), 1, null);
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSize16()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
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
                    int i10 = i4 >> 3;
                    int i11 = i4;
                    androidx.compose.ui.Modifier modifier3 = modifier2;
                    com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement trackedElement5 = trackedElement4;
                    com.paypal.pds.components.IconKt.Icon(icon, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, (i10 & 14) | 27696, 4);
                    androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSize4()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(i, startRestartGroup, (i11 >> 6) & 14), null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 0, 0, 2046);
                    int i12 = i11 & 14;
                    final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14 = function13;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.ui.Modifier.INSTANCE, null, null, false, null, null, function03, startRestartGroup, (i10 & 3670016) | 6, 31), com.paypal.pds.core.Color.ContentFaint.INSTANCE, null, null, null, false, 0, 0, null, typography3, startRestartGroup, i12 | 384, (i11 >> 15) & 14, 1016);
                    startRestartGroup.endNode();
                    if (function14 == null) {
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(912478701);
                        composer2.endReplaceGroup();
                        trackedElement3 = trackedElement5;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(912478702);
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_copy_title, composer2, 0);
                        com.paypal.pds.components.LinkSize.Large large = com.paypal.pds.components.LinkSize.Large.INSTANCE;
                        trackedElement3 = trackedElement5;
                        androidx.compose.ui.Modifier tracked = com.paypal.oslo.feature.businesscustomers.ui.utils.AnalyticsUtilsKt.tracked(androidx.compose.ui.Modifier.INSTANCE, trackedElement3);
                        boolean z = (i11 & 3670016) == 1048576;
                        boolean z2 = i12 == 4;
                        java.lang.Object rememberedValue2 = composer2.rememberedValue();
                        if ((z | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.components.PersonalInfoItemKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.components.PersonalInfoItemKt.$r8$lambda$SybycyqE9iHyTi_vh1hK8QM68dg(kotlin.jvm.functions.Function1.this, str);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        com.paypal.pds.components.LinkKt.Link(stringResource, tracked, (kotlin.jvm.functions.Function0) rememberedValue2, large, composer2, com.paypal.pds.components.LinkSize.Large.$stable << 9, 0);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        composer2.endReplaceGroup();
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function12 = function14;
                    trackedElement2 = trackedElement3;
                    typography2 = typography3;
                    function02 = function03;
                    modifier2 = modifier3;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.components.PersonalInfoItemKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.components.PersonalInfoItemKt.$r8$lambda$RsGK2y_XVUq9_EGc_LkXVkw3svo(str, icon, i, modifier2, trackedElement2, typography2, function12, function02, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void CustomerProfilePersonalInfoItemPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1573623732);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1573623732, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.components.CustomerProfilePersonalInfoItemPreview (PersonalInfoItem.kt:87)");
            }
            int i2 = com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_email_title;
            com.paypal.pds.core.Icon.NoIcon noIcon = com.paypal.pds.core.Icon.NoIcon.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.components.PersonalInfoItemKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.components.PersonalInfoItemKt.$r8$lambda$H6OBiTSTlBHHJTWN1UIKh7PE5j0((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PersonalInfoItem("+1 123 456 7890", noIcon, i2, null, null, null, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 1572918, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.components.PersonalInfoItemKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.components.PersonalInfoItemKt.$r8$lambda$grY2LnkyU8SKvNRb_C4XAJOS1ro(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H6OBiTSTlBHHJTWN1UIKh7PE5j0(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RsGK2y_XVUq9_EGc_LkXVkw3svo(java.lang.String str, com.paypal.pds.core.Icon icon, int i, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement trackedElement, com.paypal.pds.core.Typography typography, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        PersonalInfoItem(str, icon, i, modifier, trackedElement, typography, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SybycyqE9iHyTi_vh1hK8QM68dg(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$grY2LnkyU8SKvNRb_C4XAJOS1ro(int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomerProfilePersonalInfoItemPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
