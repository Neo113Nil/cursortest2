package com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "rank", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)I", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "createItem", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AccountSnapshotItemFactory {
    com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem createItem(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data);

    int rank(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data);
}
