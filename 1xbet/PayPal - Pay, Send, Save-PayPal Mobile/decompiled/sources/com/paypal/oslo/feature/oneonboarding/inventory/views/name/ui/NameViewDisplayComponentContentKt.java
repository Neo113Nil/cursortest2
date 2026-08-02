package com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"NameViewDisplayComponentContent", "", "config", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameViewComponentConfig;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/ui/NameViewDisplayComponentViewModel;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameViewComponentConfig;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/ui/NameViewDisplayComponentViewModel;Landroidx/compose/runtime/Composer;II)V", "NameViewComponentContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease", "formattedName", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NameViewDisplayComponentContentKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NameViewDisplayComponentContent(final com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig nameViewComponentConfig, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel nameViewDisplayComponentViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel nameViewDisplayComponentViewModel2;
        androidx.compose.ui.Modifier modifier3;
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel nameViewDisplayComponentViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel nameViewDisplayComponentViewModel4;
        boolean changedInstance;
        boolean changedInstance2;
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentContentKt$NameViewDisplayComponentContent$1$1 rememberedValue;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameViewComponentConfig, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1581333050);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(nameViewComponentConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    nameViewDisplayComponentViewModel2 = nameViewDisplayComponentViewModel;
                    if (startRestartGroup.changedInstance(nameViewDisplayComponentViewModel2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    nameViewDisplayComponentViewModel2 = nameViewDisplayComponentViewModel;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                nameViewDisplayComponentViewModel2 = nameViewDisplayComponentViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier4 = modifier2;
                } else {
                    modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                        if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                            empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                        }
                        com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel nameViewDisplayComponentViewModel5 = (com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i4 = i3 & (-897);
                        modifier3 = modifier4;
                        nameViewDisplayComponentViewModel4 = nameViewDisplayComponentViewModel5;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1581333050, i4, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentContent (NameViewDisplayComponentContent.kt:56)");
                        }
                        androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(nameViewDisplayComponentViewModel4.getFormattedName(), null, startRestartGroup, 0, 1);
                        com.paypal.oslo.core.i18n.domain.model.PersonName prefilledValue = nameViewComponentConfig.getPrefilledValue();
                        changedInstance = startRestartGroup.changedInstance(nameViewDisplayComponentViewModel4);
                        changedInstance2 = startRestartGroup.changedInstance(nameViewComponentConfig);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!(changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentContentKt$NameViewDisplayComponentContent$1$1(nameViewDisplayComponentViewModel4, nameViewComponentConfig, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(prefilledValue, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
                        androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        nameViewDisplayComponentViewModel3 = nameViewDisplayComponentViewModel4;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_name_label, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 384, 6, 1018);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4((java.lang.String) collectAsState.getValue(), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                }
                i4 = i3;
                modifier3 = modifier4;
                nameViewDisplayComponentViewModel4 = nameViewDisplayComponentViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(nameViewDisplayComponentViewModel4.getFormattedName(), null, startRestartGroup, 0, 1);
                com.paypal.oslo.core.i18n.domain.model.PersonName prefilledValue2 = nameViewComponentConfig.getPrefilledValue();
                changedInstance = startRestartGroup.changedInstance(nameViewDisplayComponentViewModel4);
                changedInstance2 = startRestartGroup.changedInstance(nameViewComponentConfig);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | changedInstance2)) {
                }
                rememberedValue = new com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentContentKt$NameViewDisplayComponentContent$1$1(nameViewDisplayComponentViewModel4, nameViewComponentConfig, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(prefilledValue2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
                androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                nameViewDisplayComponentViewModel3 = nameViewDisplayComponentViewModel4;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_name_label, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 384, 6, 1018);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4((java.lang.String) collectAsState2.getValue(), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                nameViewDisplayComponentViewModel3 = nameViewDisplayComponentViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                final com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel nameViewDisplayComponentViewModel6 = nameViewDisplayComponentViewModel3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentContentKt.$r8$lambda$zdVETSDF63l0mMNsrnwEJP4xEPw(com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig.this, modifier5, nameViewDisplayComponentViewModel6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ikECg2mvVaHs0_KsI6HF0mqixaQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-277721899);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-277721899, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentPreview (NameViewDisplayComponentContent.kt:86)");
            }
            NameViewDisplayComponentContent(new com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("name-component"), com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameVariant.PRIMARY_USER, false, new com.paypal.oslo.core.i18n.domain.model.PersonName(com.paypal.oslo.core.i18n.domain.model.GivenName.m11414constructorimpl("John"), com.paypal.oslo.core.i18n.domain.model.MiddleName.m11429constructorimpl("A."), com.paypal.oslo.core.i18n.domain.model.Surname.m11523constructorimpl("Doe"), (java.lang.String) null, (kotlin.jvm.internal.DefaultConstructorMarker) null), (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, startRestartGroup, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentContentKt.$r8$lambda$ikECg2mvVaHs0_KsI6HF0mqixaQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zdVETSDF63l0mMNsrnwEJP4xEPw(com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig nameViewComponentConfig, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel nameViewDisplayComponentViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        NameViewDisplayComponentContent(nameViewComponentConfig, modifier, nameViewDisplayComponentViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
