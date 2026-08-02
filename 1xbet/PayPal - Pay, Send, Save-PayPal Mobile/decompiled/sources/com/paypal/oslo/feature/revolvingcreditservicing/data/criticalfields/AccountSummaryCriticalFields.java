package com.paypal.oslo.feature.revolvingcreditservicing.data.criticalfields;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/criticalfields/AccountSummaryCriticalFields;", "", "<init>", "()V", "", "registerAll"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccountSummaryCriticalFields {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.data.criticalfields.AccountSummaryCriticalFields INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.data.criticalfields.AccountSummaryCriticalFields();

    private AccountSummaryCriticalFields() {
    }

    public final void registerAll() {
        com.paypal.oslo.core.network.graphql.error.CriticalFieldsRegistry.INSTANCE.register(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Data.class), com.paypal.oslo.feature.revolvingcreditservicing.data.criticalfields.AccountSummaryCriticalFieldsKt.getPpccAccountSummaryCriticalFields());
        com.paypal.oslo.core.network.graphql.error.CriticalFieldsRegistry.INSTANCE.register(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.Data.class), com.paypal.oslo.feature.revolvingcreditservicing.data.criticalfields.AccountSummaryCriticalFieldsKt.getCbmcAccountSummaryCriticalFields());
        com.paypal.oslo.core.network.graphql.error.CriticalFieldsRegistry.INSTANCE.register(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.Data.class), com.paypal.oslo.feature.revolvingcreditservicing.data.criticalfields.AccountSummaryCriticalFieldsKt.getPpcukAccountSummaryCriticalFields());
    }
}
