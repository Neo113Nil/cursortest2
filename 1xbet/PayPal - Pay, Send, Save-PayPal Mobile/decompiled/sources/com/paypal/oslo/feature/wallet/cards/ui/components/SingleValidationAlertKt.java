package com.paypal.oslo.feature.wallet.cards.ui.components;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "error", "", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "singleValidationAlert", "(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SingleValidationAlertKt {
    public static final java.util.List<com.paypal.pds.components.textinput.ValidationAlert> singleValidationAlert(java.lang.Integer num, androidx.compose.runtime.Composer composer, int i) {
        java.util.List<com.paypal.pds.components.textinput.ValidationAlert> emptyList;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1995808068, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.components.singleValidationAlert (SingleValidationAlert.kt:31)");
        }
        if (num != null) {
            composer.startReplaceGroup(-1885808484);
            final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(num.intValue(), composer, i & 14);
            com.paypal.pds.components.textinput.ValidationAlert.Companion companion = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
            boolean changed = composer.changed(stringResource);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.SingleValidationAlertKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.cards.ui.components.SingleValidationAlertKt.$r8$lambda$V4miBtGDr3823_5O5l2MAWU1kZM(stringResource, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            emptyList = kotlin.collections.CollectionsKt.listOf(companion.invoke((kotlin.jvm.functions.Function1) rememberedValue));
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1885577069);
            composer.endReplaceGroup();
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return emptyList;
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$V4miBtGDr3823_5O5l2MAWU1kZM(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }
}
