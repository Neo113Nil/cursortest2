package com.paypal.oslo.feature.directdeposit.ui.summary.composable;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/summary/composable/AccountNumberFormatter;", "", "<init>", "()V", "", "number", "formatNumber", "(Ljava/lang/String;)Ljava/lang/String;", com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, "", "needSplitAccountNumber", "(Ljava/lang/String;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountNumberFormatter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountNumberFormatter INSTANCE = new com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountNumberFormatter();

    private AccountNumberFormatter() {
    }

    public final java.lang.String formatNumber(java.lang.String number) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
        return number.length() == 0 ? number : kotlin.collections.CollectionsKt.joinToString$default(kotlin.text.StringsKt.chunked(kotlin.text.StringsKt.replace$default(number, " ", "", false, 4, (java.lang.Object) null), 4), " ", null, null, 0, null, null, 62, null);
    }

    public final boolean needSplitAccountNumber(java.lang.String accountNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountNumber, "");
        return kotlin.text.StringsKt.replace$default(accountNumber, " ", "", false, 4, (java.lang.Object) null).length() > 12;
    }
}
