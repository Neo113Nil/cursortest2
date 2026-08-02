package com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00012\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"AddressComponent", "", "componentConfig", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/AddressComponentConfig;", "addressData", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "callbacks", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Address;", "modifier", "Landroidx/compose/ui/Modifier;", "isManualMode", "", "rootComponentRegistry", "Lcom/paypal/oslo/feature/onboarding/signup/ui/registry/RootLevelComponentRegistry;", "componentStateMap", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/AddressComponentConfig;Lcom/paypal/oslo/core/i18n/domain/model/Address;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Address;Landroidx/compose/ui/Modifier;ZLcom/paypal/oslo/feature/onboarding/signup/ui/registry/RootLevelComponentRegistry;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;Landroidx/compose/runtime/Composer;II)V", "AddressComponentPreview", "params", "Lcom/paypal/oslo/feature/onboarding/signup/personalinfo/ui/component/AddressComponentPreviewParams;", "(Lcom/paypal/oslo/feature/onboarding/signup/personalinfo/ui/component/AddressComponentPreviewParams;Landroidx/compose/runtime/Composer;I)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressComponentKt {
    /* JADX WARN: Removed duplicated region for block: B:118:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddressComponent(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.AddressComponentConfig addressComponentConfig, final com.paypal.oslo.core.i18n.domain.model.Address address, final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Address address2, androidx.compose.ui.Modifier modifier, boolean z, com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rootLevelComponentRegistry, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rootLevelComponentRegistry2;
        final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap2;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rootLevelComponentRegistry3;
        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap3;
        androidx.compose.ui.Modifier modifier4;
        com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rootLevelComponentRegistry4;
        int i5;
        boolean z4;
        java.lang.String m16200variantCBRiV3w;
        int i6;
        int i7;
        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap4 = componentStateMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1280788941);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(addressComponentConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(address) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(address2) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        rootLevelComponentRegistry2 = rootLevelComponentRegistry;
                        if (startRestartGroup.changed(rootLevelComponentRegistry2)) {
                            i7 = 131072;
                            i3 |= i7;
                        }
                    } else {
                        rootLevelComponentRegistry2 = rootLevelComponentRegistry;
                    }
                    i7 = 65536;
                    i3 |= i7;
                } else {
                    rootLevelComponentRegistry2 = rootLevelComponentRegistry;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        if ((2097152 & i) == 0 ? startRestartGroup.changed(componentStateMap4) : startRestartGroup.changedInstance(componentStateMap4)) {
                            i6 = 1048576;
                            i3 |= i6;
                        }
                    }
                    i6 = 524288;
                    i3 |= i6;
                }
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        componentStateMap3 = componentStateMap4;
                        i5 = i3;
                        modifier4 = modifier2;
                        z4 = z2;
                        rootLevelComponentRegistry4 = rootLevelComponentRegistry2;
                    } else {
                        androidx.compose.ui.Modifier.Companion companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 32) != 0) {
                            rootLevelComponentRegistry3 = com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistryKt.emptyRootLevelComponentRegistry();
                            i3 &= -458753;
                        } else {
                            rootLevelComponentRegistry3 = rootLevelComponentRegistry2;
                        }
                        if ((i2 & 64) != 0) {
                            componentStateMap4 = com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiStateKt.emptyComponentStateMap();
                            i3 &= -3670017;
                        }
                        componentStateMap3 = componentStateMap4;
                        modifier4 = companion;
                        rootLevelComponentRegistry4 = rootLevelComponentRegistry3;
                        i5 = i3;
                        z4 = z2;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1280788941, i5, -1, "com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponent (AddressComponent.kt:64)");
                    }
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                    if (!z4) {
                        startRestartGroup.startReplaceGroup(-345099857);
                        java.lang.String label = addressComponentConfig.getCompressedField().getLabel();
                        if (label == null) {
                            startRestartGroup.startReplaceGroup(-344789889);
                            startRestartGroup.endReplaceGroup();
                            m16200variantCBRiV3w = null;
                        } else {
                            startRestartGroup.startReplaceGroup(-344789888);
                            m16200variantCBRiV3w = com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.m16200variantCBRiV3w(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(label), new java.lang.Object[0], startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        }
                        java.lang.String str = m16200variantCBRiV3w == null ? "" : m16200variantCBRiV3w;
                        java.lang.String m11248getAddressLine1rVKqk9c = address.m11248getAddressLine1rVKqk9c();
                        if (m11248getAddressLine1rVKqk9c == null) {
                            m11248getAddressLine1rVKqk9c = null;
                        }
                        java.lang.String str2 = m11248getAddressLine1rVKqk9c == null ? "" : m11248getAddressLine1rVKqk9c;
                        kotlin.jvm.functions.Function0<kotlin.Unit> onCompressedAddressClick = address2.getOnCompressedAddressClick();
                        androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentKt.m16387$r8$lambda$AfX7J6g7MjmbYVJKBknfnLO1g((java.lang.String) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        com.paypal.oslo.feature.onboarding.signup.ui.field.SignupTextInputFieldWithIconKt.SignupTextInputFieldWithIcon(str, str2, (kotlin.jvm.functions.Function1) rememberedValue, fillMaxWidth$default2, false, false, onCompressedAddressClick, null, startRestartGroup, 28032, 160);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-344327957);
                        int i9 = i5 >> 3;
                        com.paypal.oslo.feature.onboarding.signup.ui.component.FieldListKt.FieldList(addressComponentConfig.getManualFields(), new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.AddressData(address), address2, null, rootLevelComponentRegistry4, componentStateMap3, startRestartGroup, (i5 & 896) | (57344 & i9) | (i9 & 458752), 8);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z3 = z4;
                    rootLevelComponentRegistry2 = rootLevelComponentRegistry4;
                    componentStateMap2 = componentStateMap3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    componentStateMap2 = componentStateMap4;
                    modifier3 = modifier2;
                    z3 = z2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rootLevelComponentRegistry5 = rootLevelComponentRegistry2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentKt.$r8$lambda$gepTHRCrgIv6vW_jbylVEdWsUWA(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.AddressComponentConfig.this, address, address2, modifier3, z3, rootLevelComponentRegistry5, componentStateMap2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$AfX7J6g7MjmbY-VJKBknfn-LO1g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16387$r8$lambda$AfX7J6g7MjmbYVJKBknfnLO1g(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_faHwjcauexjTFjIs6mtST2xS8k(final com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentPreviewParams addressComponentPreviewParams, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(613019470);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(addressComponentPreviewParams) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(613019470, i3, -1, "com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentPreview (AddressComponent.kt:97)");
            }
            com.paypal.oslo.feature.onboarding.signup.ui.PreviewHelpersKt.PreviewWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1934806406, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentKt.$r8$lambda$rbYeVq2l_QRXD5L8XzWXOwgbAcE(com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentPreviewParams.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentKt.$r8$lambda$_faHwjcauexjTFjIs6mtST2xS8k(com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentPreviewParams.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gepTHRCrgIv6vW_jbylVEdWsUWA(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.AddressComponentConfig addressComponentConfig, com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Address address2, androidx.compose.ui.Modifier modifier, boolean z, com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rootLevelComponentRegistry, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddressComponent(addressComponentConfig, address, address2, modifier, z, rootLevelComponentRegistry, componentStateMap, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rbYeVq2l_QRXD5L8XzWXOwgbAcE(com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentPreviewParams addressComponentPreviewParams, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1934806406, i, -1, "com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentPreview.<anonymous> (AddressComponent.kt:99)");
            }
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.AddressComponentConfig addressComponentConfig = addressComponentPreviewParams.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.core.i18n.domain.model.Address address = addressComponentPreviewParams.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentKt$AddressComponentPreview$1$1$1 rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType, java.lang.String, kotlin.Unit>() { // from class: com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentKt$AddressComponentPreview$1$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType fieldType, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldType.m16558unboximpl(), "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return kotlin.Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            AddressComponent(addressComponentConfig, address, new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Address(function2, (kotlin.jvm.functions.Function0) rememberedValue2, null, 4, null), null, addressComponentPreviewParams.getHighSpeedVideoFpsRanges, null, null, composer, 0, 104);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
