package com.paypal.oslo.feature.inappcheckout.ui.card.validation;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "error", "", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "createValidationAlerts", "(Ljava/lang/String;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ValidationAlertUtilsKt {
    public static final java.util.List<com.paypal.pds.components.textinput.ValidationAlert> createValidationAlerts(final java.lang.String str) {
        java.util.List<com.paypal.pds.components.textinput.ValidationAlert> listOf = str != null ? kotlin.collections.CollectionsKt.listOf(com.paypal.pds.components.textinput.ValidationAlert.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.validation.ValidationAlertUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.ui.card.validation.ValidationAlertUtilsKt.m15492$r8$lambda$DX7jWmjZOE7jgDA_3NrVzeNug(str, (java.lang.String) obj);
            }
        })) : null;
        return listOf == null ? kotlin.collections.CollectionsKt.emptyList() : listOf;
    }

    /* renamed from: $r8$lambda$-DX7jWmjZOE7jgDA_3NrVze-Nug, reason: not valid java name */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData m15492$r8$lambda$DX7jWmjZOE7jgDA_3NrVzeNug(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }
}
