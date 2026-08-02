package com.paypal.oslo.feature.bnplacquisition.ui.address.overview;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressOverviewScreenKt$AddressOverviewSuccessContent$$inlined$ConstraintLayout$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function1 $Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.node.Ref $getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState $getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.channels.Channel $getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState $getHighSpeedVideoSizes;
    final /* synthetic */ androidx.constraintlayout.compose.ConstraintLayoutScope $getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiModel $getInputFormats;
    final /* synthetic */ androidx.compose.runtime.MutableState $getOutputMinFrameDuration;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        invoke(composer, num.intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.runtime.Composer composer, int i) {
        com.paypal.pds.components.SelectionCardModel create;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
            }
            this.$getHighSpeedVideoFpsRanges.setValue(kotlin.Unit.INSTANCE);
            if (this.$getHighResolutionOutputSizeshNQ4ISI.getValue() == androidx.constraintlayout.compose.CompositionSource.Unknown) {
                this.$getHighResolutionOutputSizeshNQ4ISI.setValue(androidx.constraintlayout.compose.CompositionSource.Content);
            }
            this.$getHighSpeedVideoSizesFor.reset();
            androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope = this.$getHighSpeedVideoSizesFor;
            composer.startReplaceGroup(928347935);
            androidx.constraintlayout.compose.ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope.createRefs();
            androidx.constraintlayout.compose.ConstrainedLayoutReference component1 = createRefs.component1();
            androidx.constraintlayout.compose.ConstrainedLayoutReference component2 = createRefs.component2();
            androidx.constraintlayout.compose.ConstrainedLayoutReference component3 = createRefs.component3();
            androidx.constraintlayout.compose.ConstrainedLayoutReference createRef = constraintLayoutScope.createRef();
            androidx.constraintlayout.compose.ConstrainedLayoutReference createRef2 = constraintLayoutScope.createRef();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function1) com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$1$1$1.getHighResolutionOutputSizeshNQ4ISI;
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier statusBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(constraintLayoutScope.constrainAs(companion, component1, (kotlin.jvm.functions.Function1) rememberedValue), com.paypal.pds.core.ConstantsKt.getSpacing16()));
            java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(this.$getInputFormats.getToolBarContent().getBackButtonLabel(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(this.$getInputFormats.getToolBarContent().getCloseButtonLabel(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            boolean changed = composer.changed(this.$Camera2StreamConfigurationMap);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function0) new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$1$2$1(this.$Camera2StreamConfigurationMap);
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarKt.ToolBar(value, value2, statusBarsPadding, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, false, composer, 0, 88);
            java.lang.String value3 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(this.$getInputFormats.getTitle(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed2 = composer.changed(component1);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function1) new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$1$3$1(component1);
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.pds.components.HeaderKt.Header(value3, androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(constraintLayoutScope.constrainAs(companion2, component2, (kotlin.jvm.functions.Function1) rememberedValue3), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing12()), (java.lang.String) null, (java.lang.String) null, (com.paypal.pds.components.HeaderContentAlignment) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed3 = composer.changed(component2);
            boolean changed4 = composer.changed(createRef);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if ((changed3 | changed4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function1) new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$1$4$1(component2, createRef);
                composer.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(constraintLayoutScope.constrainAs(companion3, component3, (kotlin.jvm.functions.Function1) rememberedValue4), com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing20(), 0.0f, 0.0f, 13, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
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
            boolean changed5 = composer.changed(this.$getInputFormats.getAddresses());
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (changed5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                for (com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel addressItemUiModel : this.$getInputFormats.getAddresses()) {
                    create = com.paypal.pds.components.SelectionCardModel.INSTANCE.create(addressItemUiModel.getId(), (r18 & 2) != 0 ? null : addressItemUiModel.getStreetAddress(), (r18 & 4) != 0 ? null : addressItemUiModel.getCityStateZip(), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) ((r18 & 8) != 0 ? null : null), (r18 & 16) != 0 ? false : addressItemUiModel.isSelected(), (r18 & 32) == 0 ? null : null, (r18 & 64) != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : null, (r18 & 128) != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : null, (r18 & 256) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : null);
                    createListBuilder.add(create);
                }
                rememberedValue5 = kotlin.collections.CollectionsKt.build(createListBuilder);
                composer.updateRememberedValue(rememberedValue5);
            }
            java.util.List list = (java.util.List) rememberedValue5;
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 0.0f, 13, null);
            com.paypal.pds.components.SelectionCardConfig.Vertical vertical = new com.paypal.pds.components.SelectionCardConfig.Vertical(false, 1, null);
            boolean changed6 = composer.changed(this.$Camera2StreamConfigurationMap);
            java.lang.Object rememberedValue6 = composer.rememberedValue();
            if (changed6 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$1$5$1$1(this.$Camera2StreamConfigurationMap);
                composer.updateRememberedValue(rememberedValue6);
            }
            com.paypal.pds.components.SelectionCardKt.SelectionCard(vertical, list, (kotlin.jvm.functions.Function2) rememberedValue6, m1710paddingqDBjuR0$default, null, false, null, composer, com.paypal.pds.components.SelectionCardConfig.Vertical.$stable, 112);
            composer.endNode();
            androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed7 = composer.changed(createRef2);
            java.lang.Object rememberedValue7 = composer.rememberedValue();
            if (changed7 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = (kotlin.jvm.functions.Function1) new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$1$6$1(createRef2);
                composer.updateRememberedValue(rememberedValue7);
            }
            androidx.compose.ui.Modifier constrainAs = constraintLayoutScope.constrainAs(companion4, createRef, (kotlin.jvm.functions.Function1) rememberedValue7);
            boolean changed8 = composer.changed(this.$Camera2StreamConfigurationMap);
            java.lang.Object rememberedValue8 = composer.rememberedValue();
            if (changed8 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = (kotlin.jvm.functions.Function0) new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$1$7$1(this.$Camera2StreamConfigurationMap);
                composer.updateRememberedValue(rememberedValue8);
            }
            androidx.compose.ui.Modifier m1709paddingqDBjuR0 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(constrainAs, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue8, composer, 0, 31), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing12(), com.paypal.pds.core.ConstantsKt.getSpacing12(), com.paypal.pds.core.ConstantsKt.getSpacing12());
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1709paddingqDBjuR0);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.NoIcon.INSTANCE, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, composer, 27702, 4);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(this.$getInputFormats.getAddNewAddressButtonText(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable), null, com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8504getVisiblegIe3tQ8()), false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, composer, 196992, 6, 970);
            composer.endNode();
            java.lang.String value4 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(this.$getInputFormats.getDoneButtonText(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion5 = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue9 = composer.rememberedValue();
            if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = (kotlin.jvm.functions.Function1) com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$1$9$1.getHighSpeedVideoFpsRangesFor;
                composer.updateRememberedValue(rememberedValue9);
            }
            androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(constraintLayoutScope.constrainAs(companion5, createRef2, (kotlin.jvm.functions.Function1) rememberedValue9), 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing32(), 0.0f, 0.0f, 13, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing8());
            boolean changed9 = composer.changed(this.$Camera2StreamConfigurationMap);
            java.lang.Object rememberedValue10 = composer.rememberedValue();
            if (changed9 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = (kotlin.jvm.functions.Function0) new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$1$10$1(this.$Camera2StreamConfigurationMap);
                composer.updateRememberedValue(rememberedValue10);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue10, value4, m1707paddingVpY3zN4, null, null, primary, large, false, false, composer, 1769472, 408);
            composer.endReplaceGroup();
            boolean changedInstance = composer.changedInstance(this.$getHighSpeedVideoSizesFor);
            boolean changedInstance2 = composer.changedInstance(this.$getHighSpeedVideoFpsRangesFor);
            final androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope2 = this.$getHighSpeedVideoSizesFor;
            final androidx.compose.runtime.MutableState mutableState = this.$getOutputMinFrameDuration;
            final androidx.compose.runtime.MutableState mutableState2 = this.$getHighSpeedVideoSizes;
            final kotlinx.coroutines.channels.Channel channel = this.$getHighSpeedVideoFpsRangesFor;
            java.lang.Object rememberedValue11 = composer.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$$inlined$ConstraintLayout$1.1
                    @Override // kotlin.jvm.functions.Function0
                    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        androidx.constraintlayout.compose.RawConstraintSet rawConstraintSet = new androidx.constraintlayout.compose.RawConstraintSet(androidx.constraintlayout.compose.ConstraintLayoutScope.this.getContainerObject().mo9053clone());
                        if (mutableState.getValue() == null || mutableState2.getValue() == null) {
                            mutableState.setValue(rawConstraintSet);
                            mutableState2.setValue(mutableState.getValue());
                        } else {
                            channel.mo9266trySendJP2dKIU(rawConstraintSet);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composer.updateRememberedValue(rememberedValue11);
            }
            androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue11, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressOverviewScreenKt$AddressOverviewSuccessContent$$inlined$ConstraintLayout$1(androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.node.Ref ref, androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope, kotlinx.coroutines.channels.Channel channel, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiModel addressOverviewUiModel, kotlin.jvm.functions.Function1 function1) {
        super(2);
        this.$getHighSpeedVideoFpsRanges = mutableState;
        this.$getHighResolutionOutputSizeshNQ4ISI = ref;
        this.$getHighSpeedVideoSizesFor = constraintLayoutScope;
        this.$getHighSpeedVideoFpsRangesFor = channel;
        this.$getOutputMinFrameDuration = mutableState2;
        this.$getHighSpeedVideoSizes = mutableState3;
        this.$getInputFormats = addressOverviewUiModel;
        this.$Camera2StreamConfigurationMap = function1;
    }
}
