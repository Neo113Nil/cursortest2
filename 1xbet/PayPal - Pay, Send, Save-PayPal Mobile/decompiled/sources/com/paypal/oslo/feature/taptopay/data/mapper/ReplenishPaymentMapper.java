package com.paypal.oslo.feature.taptopay.data.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u00020\u0005*\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b*\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/mapper/ReplenishPaymentMapper;", "", "<init>", "()V", "", "Landroidx/work/Data;", "toErrorData", "(Ljava/lang/String;)Landroidx/work/Data;", "Lcom/paypal/oslo/feature/taptopay/domain/model/replenishment/ReplenishPaymentKeysParams;", "toData", "(Lcom/paypal/oslo/feature/taptopay/domain/model/replenishment/ReplenishPaymentKeysParams;)Landroidx/work/Data;", "toReplenishPaymentKeysParams", "(Landroidx/work/Data;)Lcom/paypal/oslo/feature/taptopay/domain/model/replenishment/ReplenishPaymentKeysParams;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReplenishPaymentMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taptopay.data.mapper.ReplenishPaymentMapper INSTANCE = new com.paypal.oslo.feature.taptopay.data.mapper.ReplenishPaymentMapper();

    private ReplenishPaymentMapper() {
    }

    public final androidx.work.Data toErrorData(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new androidx.work.Data.Builder().putString("error", str).build();
    }

    public final androidx.work.Data toData(com.paypal.oslo.feature.taptopay.domain.model.replenishment.ReplenishPaymentKeysParams replenishPaymentKeysParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replenishPaymentKeysParams, "");
        return new androidx.work.Data.Builder().putString("tokenized_card_id", replenishPaymentKeysParams.getTokenizedCardId()).putBoolean("force_replenishment", replenishPaymentKeysParams.getForceReplenishment()).build();
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.replenishment.ReplenishPaymentKeysParams toReplenishPaymentKeysParams(androidx.work.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.lang.String string = data.getString("tokenized_card_id");
        java.lang.String str = string;
        if (str == null || str.length() == 0 || !data.getKeyValueMap().containsKey("force_replenishment")) {
            return null;
        }
        return new com.paypal.oslo.feature.taptopay.domain.model.replenishment.ReplenishPaymentKeysParams(string, data.getBoolean("force_replenishment", false));
    }
}
