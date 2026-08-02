package com.paypal.oslo.feature.settings.closeaccount.domain.builder;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/domain/builder/AccountClosureDataBuilder;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountUserInput;", "userInput", "", "buildCloseAccountReason", "(Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountUserInput;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountUserProfile;", "userProfile", "reason", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/AccountActivityLog;", "buildAccountActivityLog", "(Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountUserProfile;Ljava/lang/String;Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountUserInput;)Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/AccountActivityLog;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccountClosureDataBuilder {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.builder.AccountClosureDataBuilder INSTANCE = new com.paypal.oslo.feature.settings.closeaccount.domain.builder.AccountClosureDataBuilder();

    private AccountClosureDataBuilder() {
    }

    public final java.lang.String buildCloseAccountReason(com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput userInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInput, "");
        if (!userInput.getSelectedReasons().isEmpty()) {
            java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(userInput.getSelectedReasons(), ", ", null, null, 0, null, null, 62, null);
            if (!kotlin.text.StringsKt.isBlank(userInput.getReasonForClosing())) {
                java.lang.String reasonForClosing = userInput.getReasonForClosing();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
                sb.append(joinToString$default);
                sb.append("] - (");
                sb.append(reasonForClosing);
                sb.append(")");
                return sb.toString();
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[");
            sb2.append(joinToString$default);
            sb2.append("]");
            return sb2.toString();
        }
        if (kotlin.text.StringsKt.isBlank(userInput.getFeedback())) {
            return null;
        }
        return userInput.getFeedback();
    }

    public final com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog buildAccountActivityLog(com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile userProfile, java.lang.String reason, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput userInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfile, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInput, "");
        java.lang.String userEmail = userProfile.getUserEmail();
        if (userEmail == null) {
            userEmail = "UNKNOWN_USER";
        }
        java.lang.String str = userEmail;
        java.lang.String userEmail2 = userProfile.getUserEmail();
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId("ACCOUNT_CLOSURE", "CRITICAL_USER_ACTION"));
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        java.lang.String str2 = reason;
        if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
            createListBuilder.add("Reason: ".concat(java.lang.String.valueOf(reason)));
        }
        if (!userInput.getSelectedReasons().isEmpty()) {
            createListBuilder.add("Selected Reasons: ".concat(java.lang.String.valueOf(kotlin.collections.CollectionsKt.joinToString$default(userInput.getSelectedReasons(), ", ", null, null, 0, null, null, 62, null))));
        }
        if (!kotlin.text.StringsKt.isBlank(userInput.getReasonForClosing())) {
            createListBuilder.add("Comments: ".concat(java.lang.String.valueOf(userInput.getReasonForClosing())));
        }
        java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
        com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty[] dataPropertyArr = new com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty[3];
        dataPropertyArr[0] = new com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty("accountType", userProfile.getAccountType());
        java.lang.String userCountry = userProfile.getUserCountry();
        if (userCountry == null) {
            userCountry = "UNKNOWN";
        }
        dataPropertyArr[1] = new com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty("userCountry", userCountry);
        dataPropertyArr[2] = new com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty("timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        return new com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog("ACCOUNT_CLOSURE", "Account Closure", str, com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.CONSUMER, userEmail2, listOf, build, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) dataPropertyArr));
    }
}
