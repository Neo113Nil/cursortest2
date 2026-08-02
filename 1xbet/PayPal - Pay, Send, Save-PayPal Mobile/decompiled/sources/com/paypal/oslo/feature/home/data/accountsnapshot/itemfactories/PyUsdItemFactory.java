package com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/PyUsdItemFactory;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "Lcom/paypal/oslo/feature/home/domain/StringProvider;", "stringProvider", "<init>", "(Lcom/paypal/oslo/feature/home/domain/StringProvider;)V", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "rank", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)I", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "createItem", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/home/domain/StringProvider;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PyUsdItemFactory implements com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.domain.StringProvider getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PyUsdItemFactory(com.paypal.oslo.feature.home.domain.StringProvider stringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        this.getHighSpeedVideoSizes = stringProvider;
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory
    public final int rank(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return 6;
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory
    public final com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem createItem(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return null;
    }
}
