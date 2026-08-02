package com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a/\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/DropdownComponentConfig;", "config", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Dropdown;", "uiState", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Dropdown;", "callbacks", "Lcom/paypal/oslo/feature/onboarding/signup/ui/registry/RootLevelComponentRegistry;", "rootComponentRegistry", "", "DropdownComponent", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/DropdownComponentConfig;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Dropdown;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Dropdown;Lcom/paypal/oslo/feature/onboarding/signup/ui/registry/RootLevelComponentRegistry;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DropdownComponentKt {
    public static final void DropdownComponent(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.DropdownComponentConfig dropdownComponentConfig, final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Dropdown dropdown, final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Dropdown dropdown2, final com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rootLevelComponentRegistry, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dropdownComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dropdown, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dropdown2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootLevelComponentRegistry, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2137949063);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(dropdownComponentConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(dropdown) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(dropdown2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(rootLevelComponentRegistry) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2137949063, i2, -1, "com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.DropdownComponent (DropdownComponent.kt:42)");
            }
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.onboarding.signup.ui.field.SignupDropdownFieldKt.SignupDropdownField(dropdownComponentConfig.getField(), dropdown.getSelectedItem(), dropdown.getItems(), dropdown.isSearchable(), dropdown.isSearchLoading(), dropdown2.getOnItemSelect(), dropdown2.getOnItemDeselect(), dropdown2.getOnSearchQueryChanged(), rootLevelComponentRegistry, null, startRestartGroup, (i2 << 15) & 234881024, 512);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.DropdownComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.DropdownComponentKt.m16388$r8$lambda$bDGZEu9421JKOI4ZGI4bCNz4h0(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.DropdownComponentConfig.this, dropdown, dropdown2, rootLevelComponentRegistry, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$bDGZEu9421JKOI4Z-GI4bCNz4h0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16388$r8$lambda$bDGZEu9421JKOI4ZGI4bCNz4h0(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.DropdownComponentConfig dropdownComponentConfig, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Dropdown dropdown, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Dropdown dropdown2, com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rootLevelComponentRegistry, int i, androidx.compose.runtime.Composer composer, int i2) {
        DropdownComponent(dropdownComponentConfig, dropdown, dropdown2, rootLevelComponentRegistry, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
