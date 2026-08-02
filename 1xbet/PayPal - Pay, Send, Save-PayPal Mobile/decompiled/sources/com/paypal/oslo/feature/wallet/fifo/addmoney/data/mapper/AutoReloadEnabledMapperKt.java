package com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/AutoReloadScheduleType;", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadInput;", "toBalanceAutoReloadInput", "(Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/AutoReloadScheduleType;)Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AutoReloadEnabledMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadInput toBalanceAutoReloadInput(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType autoReloadScheduleType) {
        com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadScheduleType balanceAutoReloadScheduleType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadScheduleType, "");
        int i = com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.AutoReloadEnabledMapperKt.WhenMappings.$EnumSwitchMapping$0[autoReloadScheduleType.ordinal()];
        if (i == 1) {
            balanceAutoReloadScheduleType = com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadScheduleType.AUTO_RELOAD_THRESHOLD;
        } else if (i == 2) {
            balanceAutoReloadScheduleType = com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadScheduleType.AUTO_RELOAD_FREQUENCY;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            balanceAutoReloadScheduleType = com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadScheduleType.SMART_ROUTE_AUTO_RELOAD_THRESHOLD;
        }
        return new com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadInput(balanceAutoReloadScheduleType);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType.AUTO_RELOAD_THRESHOLD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType.AUTO_RELOAD_FREQUENCY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType.SMART_ROUTE_AUTO_RELOAD_THRESHOLD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
