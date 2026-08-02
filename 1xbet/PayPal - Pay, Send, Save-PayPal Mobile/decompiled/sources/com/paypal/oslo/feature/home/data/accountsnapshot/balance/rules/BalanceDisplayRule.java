package com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/BalanceDisplayRule;", "", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "draftItem", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "evaluate", "(Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "", "getPriority", "()I", "priority"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface BalanceDisplayRule {
    com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem evaluate(com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem draftItem, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data);

    int getPriority();
}
