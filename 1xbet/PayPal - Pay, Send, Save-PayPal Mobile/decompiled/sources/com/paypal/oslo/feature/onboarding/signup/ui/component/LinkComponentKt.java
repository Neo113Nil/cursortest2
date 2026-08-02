package com.paypal.oslo.feature.onboarding.signup.ui.component;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"LinkComponent", "", "componentConfig", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/LinkComponentConfig;", "callbacks", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Link;", "modifier", "Landroidx/compose/ui/Modifier;", "uiState", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Link;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/LinkComponentConfig;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Link;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState$Link;Landroidx/compose/runtime/Composer;II)V", "LinkComponentPreview", "config", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/LinkComponentConfig;Landroidx/compose/runtime/Composer;I)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LinkComponentKt {
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        if ((r15 & 8) != 0) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkComponent(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.LinkComponentConfig linkComponentConfig, final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Link link, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Link link2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(link, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1310326311);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(linkComponentConfig) : startRestartGroup.changedInstance(linkComponentConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(link) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(link2)) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = androidx.compose.ui.Modifier.INSTANCE;
                }
                if ((i2 & 8) != 0) {
                    link2 = new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Link(false, 1, null);
                    i3 &= -7169;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1310326311, i3, -1, "com.paypal.oslo.feature.onboarding.signup.ui.component.LinkComponent (LinkComponent.kt:47)");
                }
                if (link2.isVisible()) {
                    com.paypal.oslo.feature.onboarding.signup.ui.field.SignupLinkFieldKt.SignupLinkField(linkComponentConfig.getLinkField(), link.getOnLinkClick(), androidx.compose.ui.platform.TestTagKt.testTag(modifier, "LinkComponent_".concat(java.lang.String.valueOf(linkComponentConfig.getComponentId()))), startRestartGroup, com.paypal.pds.components.LinkSize.$stable, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                } else {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    final androidx.compose.ui.Modifier modifier2 = modifier;
                    final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Link link3 = link2;
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.LinkComponentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.onboarding.signup.ui.component.LinkComponentKt.$r8$lambda$KN1_kJRDlMPxkfLkuplD2nL3YTE(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.LinkComponentConfig.this, link, modifier2, link3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup.updateScope(function2);
        }
        startRestartGroup.skipToGroupEnd();
        final androidx.compose.ui.Modifier modifier3 = modifier;
        final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Link link4 = link2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.LinkComponentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.component.LinkComponentKt.$r8$lambda$5y791jCWxEbgyecZWt4hDcwdw2k(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.LinkComponentConfig.this, link, modifier3, link4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            };
            endRestartGroup.updateScope(function2);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5y791jCWxEbgyecZWt4hDcwdw2k(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.LinkComponentConfig linkComponentConfig, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Link link, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Link link2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LinkComponent(linkComponentConfig, link, modifier, link2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$834DF93rS-KJz1CCAeBDVKqd6fA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16450$r8$lambda$834DF93rSKJz1CCAeBDVKqd6fA(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.LinkComponentConfig linkComponentConfig, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-96199000, i, -1, "com.paypal.oslo.feature.onboarding.signup.ui.component.LinkComponentPreview.<anonymous> (LinkComponent.kt:105)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.LinkComponentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            LinkComponent(linkComponentConfig, new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Link((kotlin.jvm.functions.Function0) rememberedValue), androidx.compose.ui.Modifier.INSTANCE, null, composer, com.paypal.pds.components.LinkSize.$stable | 384, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$95T7lTNqZQo8mcr1gXTZVQYy8x8(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.LinkComponentConfig linkComponentConfig, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(943400928);
        if ((updateChangedFlags & 6) == 0) {
            i3 = ((updateChangedFlags & 8) == 0 ? startRestartGroup.changed(linkComponentConfig) : startRestartGroup.changedInstance(linkComponentConfig) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(943400928, i3, -1, "com.paypal.oslo.feature.onboarding.signup.ui.component.LinkComponentPreview (LinkComponent.kt:103)");
            }
            com.paypal.oslo.feature.onboarding.signup.ui.PreviewHelpersKt.PreviewWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-96199000, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.LinkComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.component.LinkComponentKt.m16450$r8$lambda$834DF93rSKJz1CCAeBDVKqd6fA(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.LinkComponentConfig.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.LinkComponentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.component.LinkComponentKt.$r8$lambda$95T7lTNqZQo8mcr1gXTZVQYy8x8(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.LinkComponentConfig.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KN1_kJRDlMPxkfLkuplD2nL3YTE(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.LinkComponentConfig linkComponentConfig, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Link link, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Link link2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LinkComponent(linkComponentConfig, link, modifier, link2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
