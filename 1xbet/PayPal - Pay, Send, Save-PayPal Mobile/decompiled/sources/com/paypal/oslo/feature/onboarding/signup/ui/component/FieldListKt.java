package com.paypal.oslo.feature.onboarding.signup.ui.component;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"FieldList", "", "fields", "", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/FieldConfig;", "signupUiData", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData;", "callbacks", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;", "fieldModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "rootComponentRegistry", "Lcom/paypal/oslo/feature/onboarding/signup/ui/registry/RootLevelComponentRegistry;", "componentStateMap", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;", "(Ljava/util/List;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/onboarding/signup/ui/registry/RootLevelComponentRegistry;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;Landroidx/compose/runtime/Composer;II)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FieldListKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0141 A[LOOP:0: B:72:0x013b->B:74:0x0141, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FieldList(final java.util.List<? extends com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig> list, final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData signupFormData, final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks componentCallbacks, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig, ? extends androidx.compose.ui.Modifier> function1, com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rootLevelComponentRegistry, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig, ? extends androidx.compose.ui.Modifier> function12;
        com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rootLevelComponentRegistry2;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig, ? extends androidx.compose.ui.Modifier> function13;
        final com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rootLevelComponentRegistry3;
        final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig, ? extends androidx.compose.ui.Modifier> function14;
        com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rootLevelComponentRegistry4;
        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap3;
        com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rootLevelComponentRegistry5;
        int i3;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig, ? extends androidx.compose.ui.Modifier> function15;
        int i4;
        int i5;
        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap4 = componentStateMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupFormData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(115248199);
        int i6 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= (i & 64) == 0 ? startRestartGroup.changed(signupFormData) : startRestartGroup.changedInstance(signupFormData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= (i & 512) == 0 ? startRestartGroup.changed(componentCallbacks) : startRestartGroup.changedInstance(componentCallbacks) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i6 |= 3072;
        } else if ((i & 3072) == 0) {
            function12 = function1;
            i6 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    rootLevelComponentRegistry2 = rootLevelComponentRegistry;
                    if (startRestartGroup.changed(rootLevelComponentRegistry2)) {
                        i5 = 16384;
                        i6 |= i5;
                    }
                } else {
                    rootLevelComponentRegistry2 = rootLevelComponentRegistry;
                }
                i5 = 8192;
                i6 |= i5;
            } else {
                rootLevelComponentRegistry2 = rootLevelComponentRegistry;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    if ((262144 & i) == 0 ? startRestartGroup.changed(componentStateMap4) : startRestartGroup.changedInstance(componentStateMap4)) {
                        i4 = 131072;
                        i6 |= i4;
                    }
                }
                i4 = 65536;
                i6 |= i4;
            }
            if (!startRestartGroup.shouldExecute((74899 & i6) == 74898, i6 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i7 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.FieldListKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.onboarding.signup.ui.component.FieldListKt.m16449$r8$lambda$AENhHFE6C9pzBR0drfhto5GEAE((com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function14 = function12;
                    }
                    if ((i2 & 16) != 0) {
                        rootLevelComponentRegistry4 = com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistryKt.emptyRootLevelComponentRegistry();
                        i6 &= -57345;
                    } else {
                        rootLevelComponentRegistry4 = rootLevelComponentRegistry2;
                    }
                    if ((i2 & 32) != 0) {
                        componentStateMap4 = com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiStateKt.emptyComponentStateMap();
                    }
                    componentStateMap3 = componentStateMap4;
                    i3 = i6;
                    function15 = function14;
                    rootLevelComponentRegistry5 = rootLevelComponentRegistry4;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(115248199, i3, -1, "com.paypal.oslo.feature.onboarding.signup.ui.component.FieldList (FieldList.kt:44)");
                    }
                    for (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig fieldConfig : list) {
                        startRestartGroup.startMovableGroup(2002895131, fieldConfig.getFieldId());
                        com.paypal.oslo.feature.onboarding.signup.ui.factory.StepFieldKt.StepField(fieldConfig, signupFormData, componentCallbacks, function15.invoke(fieldConfig), rootLevelComponentRegistry5, componentStateMap3, startRestartGroup, i3 & 517104, 0);
                        startRestartGroup.endMovableGroup();
                        i3 = i3;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function13 = function15;
                    rootLevelComponentRegistry3 = rootLevelComponentRegistry5;
                    componentStateMap2 = componentStateMap3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i6 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        function14 = function12;
                        rootLevelComponentRegistry4 = rootLevelComponentRegistry2;
                    } else {
                        componentStateMap3 = componentStateMap4;
                        i3 = i6;
                        function15 = function12;
                        rootLevelComponentRegistry5 = rootLevelComponentRegistry2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        while (r17.hasNext()) {
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        function13 = function15;
                        rootLevelComponentRegistry3 = rootLevelComponentRegistry5;
                        componentStateMap2 = componentStateMap3;
                    }
                }
                i6 &= -458753;
                componentStateMap3 = componentStateMap4;
                i3 = i6;
                function15 = function14;
                rootLevelComponentRegistry5 = rootLevelComponentRegistry4;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                while (r17.hasNext()) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                function13 = function15;
                rootLevelComponentRegistry3 = rootLevelComponentRegistry5;
                componentStateMap2 = componentStateMap3;
            } else {
                startRestartGroup.skipToGroupEnd();
                function13 = function12;
                rootLevelComponentRegistry3 = rootLevelComponentRegistry2;
                componentStateMap2 = componentStateMap4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.FieldListKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.ui.component.FieldListKt.$r8$lambda$umVy3BfAbz2mQ3zb_Q3omgE0w8U(list, signupFormData, componentCallbacks, function13, rootLevelComponentRegistry3, componentStateMap2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i6) == 74898, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$AE-NhHFE6C9pzBR0drfhto5GEAE, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m16449$r8$lambda$AENhHFE6C9pzBR0drfhto5GEAE(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig fieldConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldConfig, "");
        return androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$umVy3BfAbz2mQ3zb_Q3omgE0w8U(java.util.List list, com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData signupFormData, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks componentCallbacks, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rootLevelComponentRegistry, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FieldList(list, signupFormData, componentCallbacks, function1, rootLevelComponentRegistry, componentStateMap, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
