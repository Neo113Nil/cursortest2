package com.paypal.oslo.feature.taptopay.data.db.card.paypal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H ¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH ¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H ¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/DeviceWalletDataBase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardIdGroupDao;", "cardIdGroupDao$taptopay_prodRelease", "()Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardIdGroupDao;", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardInfoDao;", "cardInfoDao$taptopay_prodRelease", "()Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardInfoDao;", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardArtDao;", "cardArtDao$taptopay_prodRelease", "()Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardArtDao;", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/TnCDao;", "tncDao$taptopay_prodRelease", "()Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/TnCDao;", "Lcom/paypal/oslo/feature/taptopay/data/db/transaction/paypal/TransactionDao;", "transactionDao$taptopay_prodRelease", "()Lcom/paypal/oslo/feature/taptopay/data/db/transaction/paypal/TransactionDao;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DeviceWalletDataBase extends androidx.room.RoomDatabase {
    public static final int $stable = 8;

    public abstract com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao cardArtDao$taptopay_prodRelease();

    public abstract com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao cardIdGroupDao$taptopay_prodRelease();

    public abstract com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao cardInfoDao$taptopay_prodRelease();

    public abstract com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao tncDao$taptopay_prodRelease();

    public abstract com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao transactionDao$taptopay_prodRelease();
}
