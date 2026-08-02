package com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/MockDB;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/MockDataBase;", "getDatabase", "(Landroid/content/Context;)Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/MockDataBase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/MockDataBase;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MockDB {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static volatile com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase getHighSpeedVideoFpsRanges;
    public static final com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDB INSTANCE = new com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDB();
    public static final int $stable = 8;

    private MockDB() {
    }

    public final com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase getDatabase(android.content.Context context) {
        com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase mockDataBase;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase mockDataBase2 = getHighSpeedVideoFpsRanges;
        if (mockDataBase2 != null) {
            return mockDataBase2;
        }
        synchronized (this) {
            mockDataBase = getHighSpeedVideoFpsRanges;
            if (mockDataBase == null) {
                android.content.Context applicationContext = context.getApplicationContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                androidx.room.RoomDatabase build = androidx.room.Room.databaseBuilder(applicationContext, com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase.class, "tap-to-pay-data-paypal-mock-db").build();
                getHighSpeedVideoFpsRanges = (com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase) build;
                mockDataBase = (com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase) build;
            }
        }
        return mockDataBase;
    }
}
