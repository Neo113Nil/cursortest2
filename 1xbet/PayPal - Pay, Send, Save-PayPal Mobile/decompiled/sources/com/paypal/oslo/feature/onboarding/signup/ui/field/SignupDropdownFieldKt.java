package com.paypal.oslo.feature.onboarding.signup.ui.field;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¥\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00010\r2\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00010\r2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bH\u0001¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"SignupDropdownField", "", "config", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupDropdownFieldConfig;", "selectedItem", "Lcom/paypal/pds/components/MenuItem;", "Lcom/paypal/pds/components/DropdownItem;", "items", "", "isSearchable", "", "isSearchLoading", "onItemSelect", "Lkotlin/Function1;", "onItemDeselect", "onSearchQueryChanged", "", "rootComponentRegistry", "Lcom/paypal/oslo/feature/onboarding/signup/ui/registry/RootLevelComponentRegistry;", "alerts", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupDropdownFieldConfig;Lcom/paypal/pds/components/MenuItem;Ljava/util/List;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/onboarding/signup/ui/registry/RootLevelComponentRegistry;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupDropdownFieldKt {
    public static final void SignupDropdownField(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupDropdownFieldConfig signupDropdownFieldConfig, final com.paypal.pds.components.MenuItem menuItem, final java.util.List<com.paypal.pds.components.MenuItem> list, final boolean z, final boolean z2, final kotlin.jvm.functions.Function1<? super com.paypal.pds.components.MenuItem, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.pds.components.MenuItem, kotlin.Unit> function12, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13, final com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rootLevelComponentRegistry, java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list3;
        androidx.compose.runtime.Composer composer2;
        final java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupDropdownFieldConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootLevelComponentRegistry, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1759114594);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(signupDropdownFieldConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(menuItem) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function13) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= startRestartGroup.changed(rootLevelComponentRegistry) ? 67108864 : 33554432;
        }
        int i4 = i2 & 512;
        if (i4 != 0) {
            i3 |= 805306368;
            list3 = list2;
        } else {
            list3 = list2;
            if ((i & 805306368) == 0) {
                i3 |= startRestartGroup.changedInstance(list3) ? 536870912 : 268435456;
            }
        }
        if (!startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            list4 = list3;
        } else {
            java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> emptyList = i4 != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1759114594, i3, -1, "com.paypal.oslo.feature.onboarding.signup.ui.field.SignupDropdownField (SignupDropdownField.kt:59)");
            }
            final com.paypal.pds.components.DropdownState rememberDropdownState = com.paypal.pds.components.DropdownKt.rememberDropdownState(startRestartGroup, 0);
            java.lang.String m16200variantCBRiV3w = com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.m16200variantCBRiV3w(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(signupDropdownFieldConfig.getLabel()), new java.lang.Object[0], startRestartGroup, 0);
            java.lang.String m16200variantCBRiV3w2 = com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.m16200variantCBRiV3w(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(signupDropdownFieldConfig.getSearchBoxLabelText()), new java.lang.Object[0], startRestartGroup, 0);
            java.lang.String m16200variantCBRiV3w3 = com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.m16200variantCBRiV3w(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(signupDropdownFieldConfig.getSearchNoResultsText()), new java.lang.Object[0], startRestartGroup, 0);
            java.lang.String fieldId = signupDropdownFieldConfig.getFieldId();
            boolean z3 = (234881024 & i3) == 67108864;
            boolean z4 = (i3 & 14) == 4;
            boolean changedInstance = startRestartGroup.changedInstance(rememberDropdownState);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z3 | z4 | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.field.SignupDropdownFieldKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.onboarding.signup.ui.field.SignupDropdownFieldKt.$r8$lambda$PRep3uXOe6C1Zj0VeVtx7sT1LX8(com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry.this, signupDropdownFieldConfig, rememberDropdownState, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(fieldId, rememberDropdownState, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, com.paypal.pds.components.DropdownState.$stable << 3);
            int i5 = i3 >> 6;
            composer2 = startRestartGroup;
            com.paypal.pds.components.DropdownKt.Dropdown(rememberDropdownState, menuItem, list, function1, function12, m16200variantCBRiV3w, z, emptyList, m16200variantCBRiV3w2, m16200variantCBRiV3w3, function13, z2, composer2, com.paypal.pds.components.DropdownState.$stable | (i3 & 112) | (i3 & 896) | (i5 & 7168) | (57344 & i5) | ((i3 << 9) & 3670016) | (i5 & 29360128), ((i3 >> 21) & 14) | ((i3 >> 9) & 112), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            list4 = emptyList;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.field.SignupDropdownFieldKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.field.SignupDropdownFieldKt.$r8$lambda$Joj1CIGvg4Sz6yo3a7J21i83Bdk(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupDropdownFieldConfig.this, menuItem, list, z, z2, function1, function12, function13, rootLevelComponentRegistry, list4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Joj1CIGvg4Sz6yo3a7J21i83Bdk(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupDropdownFieldConfig signupDropdownFieldConfig, com.paypal.pds.components.MenuItem menuItem, java.util.List list, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rootLevelComponentRegistry, java.util.List list2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SignupDropdownField(signupDropdownFieldConfig, menuItem, list, z, z2, function1, function12, function13, rootLevelComponentRegistry, list2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$PRep3uXOe6C1Zj0VeVtx7sT1LX8(final com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rootLevelComponentRegistry, final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupDropdownFieldConfig signupDropdownFieldConfig, com.paypal.pds.components.DropdownState dropdownState, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        rootLevelComponentRegistry.register(signupDropdownFieldConfig.getFieldId(), new com.paypal.oslo.feature.onboarding.signup.ui.model.RootLevelComponentState.Dropdown(dropdownState));
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.field.SignupDropdownFieldKt$SignupDropdownField$lambda$0$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry.this.unregister(signupDropdownFieldConfig.getFieldId());
            }
        };
    }
}
