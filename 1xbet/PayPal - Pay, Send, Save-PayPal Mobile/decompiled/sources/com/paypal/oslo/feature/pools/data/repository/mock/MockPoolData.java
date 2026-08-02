package com.paypal.oslo.feature.pools.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0014\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001d\u0010\u000bR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/pools/data/repository/mock/MockPoolData;", "", "<init>", "()V", "", "SIMULATED_NETWORK_DELAY", "J", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "birthdayTripPool", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "getBirthdayTripPool", "()Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "rentPool", "getRentPool", "groceriesPool", "getGroceriesPool", "weddingGiftPool", "getWeddingGiftPool", "charityPool", "getCharityPool", "skiTripPool", "getSkiTripPool", "officePartyPool", "getOfficePartyPool", "babyShowerPool", "getBabyShowerPool", "utilitiesPool", "getUtilitiesPool", "concertTicketsPool", "getConcertTicketsPool", "", "allPools", "Ljava/util/List;", "getAllPools", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockPoolData {
    public static final int $stable;
    public static final com.paypal.oslo.feature.pools.data.repository.mock.MockPoolData INSTANCE = new com.paypal.oslo.feature.pools.data.repository.mock.MockPoolData();
    public static final long SIMULATED_NETWORK_DELAY = 2000;
    private static final java.util.List<com.paypal.oslo.feature.pools.domain.models.Pool> allPools;
    private static final com.paypal.oslo.feature.pools.domain.models.Pool babyShowerPool;
    private static final com.paypal.oslo.feature.pools.domain.models.Pool birthdayTripPool;
    private static final com.paypal.oslo.feature.pools.domain.models.Pool charityPool;
    private static final com.paypal.oslo.feature.pools.domain.models.Pool concertTicketsPool;
    private static final com.paypal.oslo.feature.pools.domain.models.Pool groceriesPool;
    private static final com.paypal.oslo.feature.pools.domain.models.Pool officePartyPool;
    private static final com.paypal.oslo.feature.pools.domain.models.Pool rentPool;
    private static final com.paypal.oslo.feature.pools.domain.models.Pool skiTripPool;
    private static final com.paypal.oslo.feature.pools.domain.models.Pool utilitiesPool;
    private static final com.paypal.oslo.feature.pools.domain.models.Pool weddingGiftPool;

    private MockPoolData() {
    }

    public final com.paypal.oslo.feature.pools.domain.models.Pool getBirthdayTripPool() {
        return birthdayTripPool;
    }

    static {
        com.paypal.oslo.feature.pools.domain.models.Pool pool = new com.paypal.oslo.feature.pools.domain.models.Pool("1", "Adam's Birthday Trip to Cabo", "Adam's turning 30 next week! Let's get him to Mexico with everyone!!!", "https://www.paypalobjects.com/groups/background/generic/default_generic_three_people_from_below.jpg", "John Doe", com.paypal.oslo.feature.pools.domain.models.PoolStatus.ACTIVE, new com.paypal.oslo.feature.pools.domain.models.User("12345", new com.paypal.oslo.feature.pools.domain.models.UserName(null, "John", "Doe", null, null, "John Doe"), "https://example.com/profile1.jpg", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 1000.0f)), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 600.0f), "2025-12-31", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 121.0f), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 121.0f), 20.17f, "https://paypal.me/pool/1", true, true, true, "https://example.com/report/1");
        birthdayTripPool = pool;
        com.paypal.oslo.feature.pools.domain.models.Pool pool2 = new com.paypal.oslo.feature.pools.domain.models.Pool(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "August Rent", "Monthly rent collection for the apartment", "https://www.paypalobjects.com/groups/background/generic/default_generic_three_people_from_below.jpg", "Jodie Myers", com.paypal.oslo.feature.pools.domain.models.PoolStatus.ACTIVE, new com.paypal.oslo.feature.pools.domain.models.User("67890", new com.paypal.oslo.feature.pools.domain.models.UserName(null, "Jodie", "Myers", null, null, "Jodie Myers"), "https://example.com/profile2.jpg", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 500.0f)), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 2000.0f), "2025-08-01", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 2000.0f), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 2000.0f), 100.0f, "https://paypal.me/pool/2", true, false, false, "https://example.com/report/2");
        rentPool = pool2;
        com.paypal.oslo.feature.pools.domain.models.Pool pool3 = new com.paypal.oslo.feature.pools.domain.models.Pool(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "Weekly Groceries Fund", "Shared grocery expenses for the household", "https://www.paypalobjects.com/groups/background/generic/default_generic_three_people_from_below.jpg", "Sarah Chen", com.paypal.oslo.feature.pools.domain.models.PoolStatus.ACTIVE, new com.paypal.oslo.feature.pools.domain.models.User("11111", new com.paypal.oslo.feature.pools.domain.models.UserName(null, "Sarah", "Chen", null, null, "Sarah Chen"), "https://example.com/profile3.jpg", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 750.0f)), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 300.0f), "2025-07-15", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 180.0f), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 180.0f), 60.0f, "https://paypal.me/pool/3", true, true, true, "https://example.com/report/3");
        groceriesPool = pool3;
        com.paypal.oslo.feature.pools.domain.models.Pool pool4 = new com.paypal.oslo.feature.pools.domain.models.Pool("4", "Emma & Michael's Wedding Gift", "Group gift for the happy couple's honeymoon", "https://www.paypalobjects.com/groups/background/generic/default_generic_three_people_from_below.jpg", "David Park", com.paypal.oslo.feature.pools.domain.models.PoolStatus.ACTIVE, new com.paypal.oslo.feature.pools.domain.models.User("22222", new com.paypal.oslo.feature.pools.domain.models.UserName(null, "David", "Park", null, null, "David Park"), "https://example.com/profile4.jpg", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 2000.0f)), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 1500.0f), "2025-09-20", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 1125.0f), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 1125.0f), 75.0f, "https://paypal.me/pool/4", false, true, true, "https://example.com/report/4");
        weddingGiftPool = pool4;
        com.paypal.oslo.feature.pools.domain.models.Pool pool5 = new com.paypal.oslo.feature.pools.domain.models.Pool("5", "Animal Shelter Donation Drive", "Help our local animal shelter with supplies and medical care", "https://www.paypalobjects.com/groups/background/generic/default_generic_three_people_from_below.jpg", "Lisa Anderson", com.paypal.oslo.feature.pools.domain.models.PoolStatus.ACTIVE, new com.paypal.oslo.feature.pools.domain.models.User("33333", new com.paypal.oslo.feature.pools.domain.models.UserName(null, "Lisa", "Anderson", null, null, "Lisa Anderson"), "https://example.com/profile5.jpg", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 300.0f)), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 500.0f), "2025-12-01", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 225.0f), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 225.0f), 45.0f, "https://paypal.me/pool/5", true, true, true, "https://example.com/report/5");
        charityPool = pool5;
        com.paypal.oslo.feature.pools.domain.models.Pool pool6 = new com.paypal.oslo.feature.pools.domain.models.Pool("6", "Colorado Ski Trip 2026", "Annual friends ski trip to Aspen - accommodation and lift tickets", "https://www.paypalobjects.com/groups/background/generic/default_generic_three_people_from_below.jpg", "Mike Johnson", com.paypal.oslo.feature.pools.domain.models.PoolStatus.ACTIVE, new com.paypal.oslo.feature.pools.domain.models.User("44444", new com.paypal.oslo.feature.pools.domain.models.UserName(null, "Mike", "Johnson", null, null, "Mike Johnson"), "https://example.com/profile6.jpg", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 5000.0f)), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 3000.0f), "2026-01-15", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 450.0f), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 450.0f), 15.0f, "https://paypal.me/pool/6", false, true, true, "https://example.com/report/6");
        skiTripPool = pool6;
        com.paypal.oslo.feature.pools.domain.models.Pool pool7 = new com.paypal.oslo.feature.pools.domain.models.Pool("7", "Holiday Office Party", "End of year celebration for the team", "https://www.paypalobjects.com/groups/background/generic/default_generic_three_people_from_below.jpg", "Rachel Green", com.paypal.oslo.feature.pools.domain.models.PoolStatus.CLOSED, new com.paypal.oslo.feature.pools.domain.models.User("55555", new com.paypal.oslo.feature.pools.domain.models.UserName(null, "Rachel", "Green", null, null, "Rachel Green"), "https://example.com/profile7.jpg", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 1200.0f)), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 800.0f), "2024-12-20", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 800.0f), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 800.0f), 100.0f, "https://paypal.me/pool/7", false, false, false, "https://example.com/report/7");
        officePartyPool = pool7;
        com.paypal.oslo.feature.pools.domain.models.Pool pool8 = new com.paypal.oslo.feature.pools.domain.models.Pool("8", "Jessica's Baby Shower", "Group gift for Jessica and the new baby", "https://www.paypalobjects.com/groups/background/generic/default_generic_three_people_from_below.jpg", "Amanda Lee", com.paypal.oslo.feature.pools.domain.models.PoolStatus.ACTIVE, new com.paypal.oslo.feature.pools.domain.models.User("66666", new com.paypal.oslo.feature.pools.domain.models.UserName(null, "Amanda", "Lee", null, null, "Amanda Lee"), "https://example.com/profile8.jpg", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 600.0f)), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 400.0f), "2025-08-10", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 320.0f), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 320.0f), 80.0f, "https://paypal.me/pool/8", true, true, true, "https://example.com/report/8");
        babyShowerPool = pool8;
        com.paypal.oslo.feature.pools.domain.models.Pool pool9 = new com.paypal.oslo.feature.pools.domain.models.Pool("9", "Monthly Utilities Split", "Electric, water, and internet bills for the apartment", "https://www.paypalobjects.com/groups/background/generic/default_generic_three_people_from_below.jpg", "Chris Martinez", com.paypal.oslo.feature.pools.domain.models.PoolStatus.ACTIVE, new com.paypal.oslo.feature.pools.domain.models.User("77777", new com.paypal.oslo.feature.pools.domain.models.UserName(null, "Chris", "Martinez", null, null, "Chris Martinez"), "https://example.com/profile9.jpg", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 800.0f)), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 450.0f), "2025-07-01", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 315.0f), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 315.0f), 70.0f, "https://paypal.me/pool/9", true, true, true, "https://example.com/report/9");
        utilitiesPool = pool9;
        com.paypal.oslo.feature.pools.domain.models.Pool pool10 = new com.paypal.oslo.feature.pools.domain.models.Pool("10", "Taylor Swift Concert Tickets", "Group purchase for concert tickets and transportation", "https://www.paypalobjects.com/groups/background/generic/default_generic_three_people_from_below.jpg", "Emily Davis", com.paypal.oslo.feature.pools.domain.models.PoolStatus.ACTIVE, new com.paypal.oslo.feature.pools.domain.models.User("88888", new com.paypal.oslo.feature.pools.domain.models.UserName(null, "Emily", "Davis", null, null, "Emily Davis"), "https://example.com/profile10.jpg", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 1500.0f)), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 1200.0f), "2025-10-05", new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 1080.0f), new com.paypal.oslo.feature.pools.domain.models.PoolAmount("USD", 1080.0f), 90.0f, "https://paypal.me/pool/10", false, true, true, "https://example.com/report/10");
        concertTicketsPool = pool10;
        allPools = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.pools.domain.models.Pool[]{pool, pool2, pool3, pool4, pool5, pool6, pool7, pool8, pool9, pool10});
        $stable = 8;
    }

    public final com.paypal.oslo.feature.pools.domain.models.Pool getRentPool() {
        return rentPool;
    }

    public final com.paypal.oslo.feature.pools.domain.models.Pool getGroceriesPool() {
        return groceriesPool;
    }

    public final com.paypal.oslo.feature.pools.domain.models.Pool getWeddingGiftPool() {
        return weddingGiftPool;
    }

    public final com.paypal.oslo.feature.pools.domain.models.Pool getCharityPool() {
        return charityPool;
    }

    public final com.paypal.oslo.feature.pools.domain.models.Pool getSkiTripPool() {
        return skiTripPool;
    }

    public final com.paypal.oslo.feature.pools.domain.models.Pool getOfficePartyPool() {
        return officePartyPool;
    }

    public final com.paypal.oslo.feature.pools.domain.models.Pool getBabyShowerPool() {
        return babyShowerPool;
    }

    public final com.paypal.oslo.feature.pools.domain.models.Pool getUtilitiesPool() {
        return utilitiesPool;
    }

    public final com.paypal.oslo.feature.pools.domain.models.Pool getConcertTicketsPool() {
        return concertTicketsPool;
    }

    public final java.util.List<com.paypal.oslo.feature.pools.domain.models.Pool> getAllPools() {
        return allPools;
    }
}
