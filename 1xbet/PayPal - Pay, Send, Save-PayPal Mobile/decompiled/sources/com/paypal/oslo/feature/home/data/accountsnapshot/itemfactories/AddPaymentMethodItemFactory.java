package com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AddPaymentMethodItemFactory;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "Lcom/paypal/oslo/feature/home/data/ResourceStringProvider;", "stringResourceProvider", "<init>", "(Lcom/paypal/oslo/feature/home/data/ResourceStringProvider;)V", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "rank", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)I", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "createItem", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/home/data/ResourceStringProvider;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddPaymentMethodItemFactory implements com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.data.ResourceStringProvider getHighSpeedVideoSizes;

    @javax.inject.Inject
    public AddPaymentMethodItemFactory(com.paypal.oslo.feature.home.data.ResourceStringProvider resourceStringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceStringProvider, "");
        this.getHighSpeedVideoSizes = resourceStringProvider;
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory
    public final int rank(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return (com.paypal.oslo.feature.home.data.accountsnapshot.balance.UtilsKt.hasAnyFiTile(data) || !com.paypal.oslo.feature.home.data.accountsnapshot.balance.UtilsKt.isPayPalBalanceZero(data)) ? Integer.MAX_VALUE : 0;
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory
    public final com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem createItem(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AddPaymentMethodItemFactoryKt.AddPaymentMethodSnapshotId, com.paypal.oslo.feature.home.api.AccountSnapshotType.AddPaymentMethod.INSTANCE, com.paypal.oslo.feature.home.domain.model.BackgroundColors.Black.INSTANCE, this.getHighSpeedVideoSizes.getBanksAndCardsText(), null, null, null, null, this.getHighSpeedVideoSizes.getAddPaymentMethodsText(), null, com.paypal.oslo.feature.home.domain.model.HomeIcon.Add, null, kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.home.domain.model.HomeIcon[]{com.paypal.oslo.feature.home.domain.model.HomeIcon.Bank, com.paypal.oslo.feature.home.domain.model.HomeIcon.Card}), null, 16448, null);
    }
}
