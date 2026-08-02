package com.paypal.android.taptopay.domain.model.replenishment;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0000*\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/replenishment/ReplenishPaymentKeysParams;", "Landroidx/work/Data;", "toData", "(Lcom/paypal/android/taptopay/domain/model/replenishment/ReplenishPaymentKeysParams;)Landroidx/work/Data;", "", "toErrorData", "(Ljava/lang/String;)Landroidx/work/Data;", "toReplenishPaymentKeysParams", "(Landroidx/work/Data;)Lcom/paypal/android/taptopay/domain/model/replenishment/ReplenishPaymentKeysParams;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExtensionsKt {
    public static final androidx.work.Data toErrorData(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.work.Data build = new androidx.work.Data.Builder().putString("error", str).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public static final androidx.work.Data toData(com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysParams replenishPaymentKeysParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replenishPaymentKeysParams, "");
        androidx.work.Data build = new androidx.work.Data.Builder().putString("tokenized_card_id", replenishPaymentKeysParams.getTokenizedCardId()).putBoolean("force_replenishment", replenishPaymentKeysParams.getForceReplenishment()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public static final com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysParams toReplenishPaymentKeysParams(androidx.work.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.lang.String string = data.getString("tokenized_card_id");
        java.lang.String str = string;
        if (str == null || str.length() == 0 || !data.getKeyValueMap().containsKey("force_replenishment")) {
            return null;
        }
        return new com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysParams(string, data.getBoolean("force_replenishment", false));
    }
}
