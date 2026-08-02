package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"AccountSummarySectionPartialError", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "onTryAgainClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AccountSummarySectionPartialErrorPreview", "(Landroidx/compose/runtime/Composer;I)V", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccountSummarySectionPartialErrorKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSummarySectionPartialError(final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1022221387);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(uiString) ? 4 : 2) | i;
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
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1022221387, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionPartialError (AccountSummarySectionPartialError.kt:46)");
                }
                com.paypal.pds.components.CardKt.Card(modifier3, null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1844446351, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionPartialErrorKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionPartialErrorKt.m18181$r8$lambda$5b2PHznixiPl1icyYeWaYN6xQ4(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.this, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i3 >> 6) & 14) | 805306368 | (com.paypal.pds.components.CardStyle.Outlined.$stable << 9), 502);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionPartialErrorKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionPartialErrorKt.$r8$lambda$n3pEIhkxr7HpsSrHgIbW96twOiU(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.this, function0, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$5b2PHznixiPl1icyYeWaYN6x-Q4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18181$r8$lambda$5b2PHznixiPl1icyYeWaYN6xQ4(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1844446351, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionPartialError.<anonymous> (AccountSummarySectionPartialError.kt:51)");
            }
            com.paypal.pds.components.EmptyStateKt.EmptyState(com.paypal.pds.core.Icon.Warning.INSTANCE, androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32(), com.paypal.pds.core.ConstantsKt.getSpacing36()), null, null, uiString.asString(composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_try_again, composer, 0), function0, composer, 3078, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ql64RKcunKZs5eWqPEP-CHok3S8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18182$r8$lambda$Ql64RKcunKZs5eWqPEPCHok3S8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1648643233);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1648643233, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionPartialErrorPreview (AccountSummarySectionPartialError.kt:64)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString uiString = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("We can't show your financing plans right now.");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionPartialErrorKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AccountSummarySectionPartialError(uiString, (kotlin.jvm.functions.Function0) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionPartialErrorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummarySectionPartialErrorKt.m18182$r8$lambda$Ql64RKcunKZs5eWqPEPCHok3S8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n3pEIhkxr7HpsSrHgIbW96twOiU(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AccountSummarySectionPartialError(uiString, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
