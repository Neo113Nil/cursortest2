package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\"\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"WalletInstrumentLock", "", "instrument", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managewallet/model/WalletInstrument;", "onClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "shouldLock", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/managewallet/model/WalletInstrument;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "previewSampleInstrument", "WalletInstrumentLockPreview", "(Landroidx/compose/runtime/Composer;I)V", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WalletInstrumentLockKt {
    private static final com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument("test-123", "DIGITIZATION_TOKEN", "2241", com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState.ACTIVE, com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.DISPLAY_PRODUCT_NAME, "PayPal Business Debit Mastercard", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation[]{com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.ACTIVATE, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.CLOSE}), null);

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WalletInstrumentLock(final com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument walletInstrument, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletInstrument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1400827820);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(walletInstrument) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1400827820, i4, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations.WalletInstrumentLock (WalletInstrumentLock.kt:48)");
                }
                com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_manage_wallet_lock, startRestartGroup, 0), modifier3, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_manage_wallet_lock_description, new java.lang.Object[]{com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.GOOGLE_PAY}, startRestartGroup, 0), null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1765540734, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations.WalletInstrumentLockKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations.WalletInstrumentLockKt.$r8$lambda$OXEKsoiSklWuUNVMUe8o5VIxXdE(com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument.this, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations.ComposableSingletons$WalletInstrumentLockKt.INSTANCE.getLambda$2102156833$debit_card_prodRelease(), null, null, null, false, null, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSize0()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSize0()), null, com.paypal.pds.components.ListAlignment.Top, false, startRestartGroup, ((i4 >> 3) & 112) | 113246208, 12582912, 343672);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations.WalletInstrumentLockKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations.WalletInstrumentLockKt.$r8$lambda$OMTKNNCUlwgMJMMoL13zdml0aHY(com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument.this, function1, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2CDzC8GGzCVSvbvQA1q5HVy6cr0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-286730754);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-286730754, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations.WalletInstrumentLockPreview (WalletInstrumentLock.kt:92)");
            }
            com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument walletInstrument = getHighSpeedVideoFpsRanges;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations.WalletInstrumentLockKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Boolean) obj).booleanValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            WalletInstrumentLock(walletInstrument, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations.WalletInstrumentLockKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations.WalletInstrumentLockKt.$r8$lambda$2CDzC8GGzCVSvbvQA1q5HVy6cr0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OMTKNNCUlwgMJMMoL13zdml0aHY(com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument walletInstrument, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        WalletInstrumentLock(walletInstrument, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OXEKsoiSklWuUNVMUe8o5VIxXdE(com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument walletInstrument, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1765540734, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.walletoperations.WalletInstrumentLock.<anonymous> (WalletInstrumentLock.kt:64)");
            }
            com.paypal.pds.components.SwitchKt.Switch(walletInstrument.getLifecycleState() == com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState.DEACTIVATED, function1, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.DEBIT_CARD_WALLET_MANAGEMENT_LOCK_SWITCH), false, composer, 384, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
