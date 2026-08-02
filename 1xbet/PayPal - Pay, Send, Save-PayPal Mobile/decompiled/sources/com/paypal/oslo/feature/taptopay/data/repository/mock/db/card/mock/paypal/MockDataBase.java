package com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/MockDataBase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/PayPalMockCardDao;", "paypalMockCardDao", "()Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/PayPalMockCardDao;", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/MockTncDao;", "tncMockDao", "()Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/MockTncDao;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class MockDataBase extends androidx.room.RoomDatabase {
    public static final int $stable = 8;

    public abstract com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao paypalMockCardDao();

    public abstract com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockTncDao tncMockDao();
}
