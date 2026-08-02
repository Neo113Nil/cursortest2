package com.paypal.oslo.core.navigation.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"AccountSwitchButton", "", "avatarSource", "Lcom/paypal/pds/components/AvatarSource;", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/pds/components/AvatarSource;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AccountSwitchButtonInitialsPreview", "(Landroidx/compose/runtime/Composer;I)V", "AccountSwitchButtonImagePreview", "navigation_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AccountSwitchButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSwitchButton(final com.paypal.pds.components.AvatarSource avatarSource, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(622054657);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(avatarSource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(622054657, i3, -1, "com.paypal.oslo.core.navigation.ui.AccountSwitchButton (AccountSwitchButton.kt:55)");
                }
                final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.core.navigation.R.string.core_navigation_account_switch_content_description, startRestartGroup, 0);
                boolean changed = startRestartGroup.changed(stringResource);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.navigation.ui.AccountSwitchButtonKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.core.navigation.ui.AccountSwitchButtonKt.$r8$lambda$pOoG95Zokbom34U2wVuIodRtqvE(stringResource, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(modifier3, true, (kotlin.jvm.functions.Function1) rememberedValue), null, null, false, null, null, function0, startRestartGroup, (i3 << 15) & 3670016, 31);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m22100clickable_mRqjOc);
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
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.AvatarKt.Avatar(avatarSource, null, com.paypal.pds.components.AvatarSize.XSmall.INSTANCE, null, null, null, startRestartGroup, (i3 & 14) | (com.paypal.pds.components.AvatarSize.XSmall.$stable << 6), 58);
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.ChevronDown.INSTANCE, null, null, com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 27702, 4);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.AccountSwitchButtonKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.core.navigation.ui.AccountSwitchButtonKt.$r8$lambda$MumEho9PnTKLZ46qynqp0yxo1Lo(com.paypal.pds.components.AvatarSource.this, function0, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-Y38BtiqTYuzO7rkM0IKDErFEwY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11622$r8$lambda$Y38BtiqTYuzO7rkM0IKDErFEwY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-348337769);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-348337769, updateChangedFlags, -1, "com.paypal.oslo.core.navigation.ui.AccountSwitchButtonImagePreview (AccountSwitchButton.kt:95)");
            }
            com.paypal.pds.components.AvatarSource.Image image = new com.paypal.pds.components.AvatarSource.Image(new androidx.compose.ui.graphics.painter.ColorPainter(androidx.compose.ui.graphics.Color.INSTANCE.m6023getBlue0d7_KjU(), null), null, 2, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.AccountSwitchButtonKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AccountSwitchButton(image, (kotlin.jvm.functions.Function0) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.AccountSwitchButtonKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.ui.AccountSwitchButtonKt.m11622$r8$lambda$Y38BtiqTYuzO7rkM0IKDErFEwY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MumEho9PnTKLZ46qynqp0yxo1Lo(com.paypal.pds.components.AvatarSource avatarSource, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AccountSwitchButton(avatarSource, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pOoG95Zokbom34U2wVuIodRtqvE(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7801getDropdownListo7Vup1c());
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pXysqbYV-5N1__ojGrwbDpB4aM0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11623$r8$lambda$pXysqbYV5N1__ojGrwbDpB4aM0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1159944235);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1159944235, updateChangedFlags, -1, "com.paypal.oslo.core.navigation.ui.AccountSwitchButtonInitialsPreview (AccountSwitchButton.kt:86)");
            }
            com.paypal.pds.components.AvatarSource.Initials initials = new com.paypal.pds.components.AvatarSource.Initials("Robert Kim");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.AccountSwitchButtonKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AccountSwitchButton(initials, (kotlin.jvm.functions.Function0) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.AccountSwitchButtonKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.ui.AccountSwitchButtonKt.m11623$r8$lambda$pXysqbYV5N1__ojGrwbDpB4aM0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
