package com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aM\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"GoogleWalletButtonWidth", "", "CardActionsSection", "", "title", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "showGoogleWalletButton", "", "starPayClient", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLcom/paypal/oslo/feature/starpay/api/StarPayClient;Landroidx/compose/runtime/Composer;II)V", "CardActionsSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "CardActionsSectionGoogleWalletPreview", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CardActionsSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardActionsSection(final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, boolean z, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        final com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient2;
        int i6;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z3;
        final com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.internal.ComposableLambda lambda$2056709719$revolvingcredit_servicing_prodRelease;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1367034686);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
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
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    starPayClient2 = starPayClient;
                    i3 |= startRestartGroup.changedInstance(starPayClient2) ? 131072 : 65536;
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((74899 & i6) == 74898, i6 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        starPayClient3 = starPayClient2;
                    } else {
                        androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        final boolean z4 = i4 != 0 ? false : z2;
                        if (i5 != 0) {
                            starPayClient2 = null;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1367034686, i6, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component.CardActionsSection (CardActionsSection.kt:41)");
                        }
                        com.paypal.pds.components.ListAlignment listAlignment = com.paypal.pds.components.ListAlignment.Top;
                        if (z4) {
                            startRestartGroup.startReplaceGroup(-449737753);
                            lambda$2056709719$revolvingcredit_servicing_prodRelease = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-30907648, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component.CardActionsSectionKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component.CardActionsSectionKt.$r8$lambda$YXzkgOeKlePXHw7sQAzGZV0g8Uo(com.paypal.oslo.feature.starpay.api.StarPayClient.this, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, startRestartGroup, 54);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-449269157);
                            startRestartGroup.endReplaceGroup();
                            lambda$2056709719$revolvingcredit_servicing_prodRelease = com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component.ComposableSingletons$CardActionsSectionKt.INSTANCE.getLambda$2056709719$revolvingcredit_servicing_prodRelease();
                        }
                        com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient4 = starPayClient2;
                        boolean z5 = z4;
                        composer2 = startRestartGroup;
                        com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(str, modifier4, str2, null, null, false, false, lambda$2056709719$revolvingcredit_servicing_prodRelease, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2035849527, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component.CardActionsSectionKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component.CardActionsSectionKt.m18582$r8$lambda$Q5zx6k47YpWh2vYOx4BVt0TjtQ(z4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), null, null, null, false, z4 ? null : function0, null, null, null, listAlignment, false, composer2, (i6 & 14) | 100663296 | ((i6 >> 6) & 112) | ((i6 << 3) & 896), 12582912, 384632);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        starPayClient3 = starPayClient4;
                        z3 = z5;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component.CardActionsSectionKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component.CardActionsSectionKt.m18584$r8$lambda$yniIz8_N_qKNSKO4SCZIL8HSmM(str, str2, function0, modifier3, z3, starPayClient3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                starPayClient2 = starPayClient;
                i6 = i3;
                if (startRestartGroup.shouldExecute((74899 & i6) == 74898, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            starPayClient2 = starPayClient;
            i6 = i3;
            if (startRestartGroup.shouldExecute((74899 & i6) == 74898, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        starPayClient2 = starPayClient;
        i6 = i3;
        if (startRestartGroup.shouldExecute((74899 & i6) == 74898, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$Q5zx6k47YpWh2vYOx-4BVt0TjtQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18582$r8$lambda$Q5zx6k47YpWh2vYOx4BVt0TjtQ(boolean z, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2035849527, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component.CardActionsSection.<anonymous> (CardActionsSection.kt:48)");
            }
            com.paypal.pds.components.IconKt.Icon(z ? com.paypal.pds.core.Icon.Mobile.INSTANCE : com.paypal.pds.core.Icon.Card.INSTANCE, null, null, com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer, 27696, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YXzkgOeKlePXHw7sQAzGZV0g8Uo(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-30907648, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component.CardActionsSection.<anonymous> (CardActionsSection.kt:57)");
            }
            androidx.compose.ui.Modifier m1745width3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(140.0f));
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1745width3ABfNKs);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            if (starPayClient == null) {
                composer.startReplaceGroup(1576496433);
                starPayClient = com.paypal.oslo.feature.starpay.api.StarPayClientProviderKt.rememberStarPayClient(composer, 0);
            } else {
                composer.startReplaceGroup(1576495906);
            }
            composer.endReplaceGroup();
            starPayClient.getAddToWalletButtonCondensed(function0).invoke(composer, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$b89wj41vBFONO6o-RFgC3M754m8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18583$r8$lambda$b89wj41vBFONO6oRFgC3M754m8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1584421784);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1584421784, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component.CardActionsSectionGoogleWalletPreview (CardActionsSection.kt:100)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component.CardActionsSectionKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CardActionsSection("Pay on the go", null, (kotlin.jvm.functions.Function0) rememberedValue, null, true, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.preview.FakeStarPayClient.INSTANCE, startRestartGroup, 221622, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component.CardActionsSectionKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component.CardActionsSectionKt.m18583$r8$lambda$b89wj41vBFONO6oRFgC3M754m8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qlQaDBwkhpKsYw3VDcjmiDjnBKo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1660669990);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1660669990, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component.CardActionsSectionPreview (CardActionsSection.kt:85)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component.CardActionsSectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CardActionsSection("Request the PayPal Credit card", "Pay over time for in-store and online purchases", (kotlin.jvm.functions.Function0) rememberedValue, null, false, null, startRestartGroup, 438, 56);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component.CardActionsSectionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.component.CardActionsSectionKt.$r8$lambda$qlQaDBwkhpKsYw3VDcjmiDjnBKo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yniIz8_N_qK-NSKO4SCZIL8HSmM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18584$r8$lambda$yniIz8_N_qKNSKO4SCZIL8HSmM(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, boolean z, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CardActionsSection(str, str2, function0, modifier, z, starPayClient, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
