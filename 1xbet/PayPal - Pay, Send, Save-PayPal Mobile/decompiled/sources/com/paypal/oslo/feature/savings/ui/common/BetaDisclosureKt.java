package com.paypal.oslo.feature.savings.ui.common;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"BetaOptOutLinkTag", "", "BetaDisclosure", "", "onOptOutLinkClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BetaDisclosureKt {
    public static final void BetaDisclosure(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-510307388);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-510307388, i3, -1, "com.paypal.oslo.feature.savings.ui.common.BetaDisclosure (BetaDisclosure.kt:27)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_beta_disclosure_content, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_beta_unenroll_message, startRestartGroup, 0);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(stringResource);
            sb.append(" ");
            sb.append(stringResource2);
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(com.paypal.pds.components.LegalConsentItem.Companion.implicit$default(com.paypal.pds.components.LegalConsentItem.INSTANCE, com.paypal.pds.core.RichTextKt.toRichText(sb.toString(), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(stringResource2, "beta_opt_out_link"))), (com.paypal.pds.core.AnalyticsScope) null, 2, (java.lang.Object) null));
            boolean z = (i3 & 14) == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.savings.ui.common.BetaDisclosureKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.savings.ui.common.BetaDisclosureKt.$r8$lambda$gyR6nc20R0dF8ef1ouww5C8HGfU(kotlin.jvm.functions.Function0.this, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2, (java.lang.String) obj3);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.LegalConsentKt.LegalConsent(listOf, modifier, null, (kotlin.jvm.functions.Function3) rememberedValue, null, startRestartGroup, com.paypal.pds.components.LegalConsentItem.$stable | (i3 & 112), 20);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.common.BetaDisclosureKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.common.BetaDisclosureKt.$r8$lambda$Cep0yvH5a5EnHu1ULAjwidv1tEg(kotlin.jvm.functions.Function0.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Cep0yvH5a5EnHu1ULAjwidv1tEg(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BetaDisclosure(function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gyR6nc20R0dF8ef1ouww5C8HGfU(kotlin.jvm.functions.Function0 function0, int i, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "beta_opt_out_link")) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }
}
