package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/goldenboot/saga/zone/DrawerRollback;", "", "", "name", "", "coins", "price", "bonus", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "evictLayout", "()Ljava/lang/String;", "growPayload", "()I", "injectMetric", "detachStream", "releaseHeader", "(Ljava/lang/String;IILjava/lang/String;)Lcom/goldenboot/saga/zone/DrawerRollback;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "applyTask", "I", "updateTimer", "popBlueprint", "flushSample", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.DrawerRollback, reason: from toString */
/* loaded from: classes.dex */
final /* data */ class CoinBundle {

    /* renamed from: detachStream, reason: from kotlin metadata and from toString */
    private final String bonus;

    /* renamed from: evictLayout, reason: from kotlin metadata and from toString */
    private final String name;

    /* renamed from: growPayload, reason: from kotlin metadata and from toString */
    private final int coins;

    /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
    private final int price;

    public CoinBundle(String name, int i, int i2, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.coins = i;
        this.price = i2;
        this.bonus = str;
    }

    public static /* synthetic */ CoinBundle clipOrigin(CoinBundle coinBundle, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = coinBundle.name;
        }
        if ((i3 & 2) != 0) {
            i = coinBundle.coins;
        }
        if ((i3 & 4) != 0) {
            i2 = coinBundle.price;
        }
        if ((i3 & 8) != 0) {
            str2 = coinBundle.bonus;
        }
        return coinBundle.releaseHeader(str, i, i2, str2);
    }

    /* renamed from: applyTask, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: detachStream, reason: from getter */
    public final String getBonus() {
        return this.bonus;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoinBundle)) {
            return false;
        }
        CoinBundle coinBundle = (CoinBundle) other;
        return Intrinsics.areEqual(this.name, coinBundle.name) && this.coins == coinBundle.coins && this.price == coinBundle.price && Intrinsics.areEqual(this.bonus, coinBundle.bonus);
    }

    public final String evictLayout() {
        return this.name;
    }

    public final String flushSample() {
        return this.bonus;
    }

    /* renamed from: growPayload, reason: from getter */
    public final int getCoins() {
        return this.coins;
    }

    public int hashCode() {
        int hashCode = ((((this.name.hashCode() * 31) + Integer.hashCode(this.coins)) * 31) + Integer.hashCode(this.price)) * 31;
        String str = this.bonus;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: injectMetric, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    public final int popBlueprint() {
        return this.price;
    }

    public final CoinBundle releaseHeader(String name, int coins, int price, String bonus) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new CoinBundle(name, coins, price, bonus);
    }

    public String toString() {
        return "CoinBundle(name=" + this.name + ", coins=" + this.coins + ", price=" + this.price + ", bonus=" + this.bonus + ")";
    }

    public final int updateTimer() {
        return this.coins;
    }

    public /* synthetic */ CoinBundle(String str, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 8) != 0 ? null : str2);
    }
}
