package org.betup.model.remote.api.rest.shop;

import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SellBetInteractor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lorg/betup/model/remote/api/rest/shop/SellBetParams;", "", "betlistId", "", "sellCoefficient", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JD)V", "getBetlistId", "()J", "getSellCoefficient", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SellBetParams {
    public static final int $stable = 0;
    private final long betlistId;
    private final double sellCoefficient;

    public static /* synthetic */ SellBetParams copy$default(SellBetParams sellBetParams, long j, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sellBetParams.betlistId;
        }
        if ((i & 2) != 0) {
            d = sellBetParams.sellCoefficient;
        }
        return sellBetParams.copy(j, d);
    }

    /* renamed from: component1, reason: from getter */
    public final long getBetlistId() {
        return this.betlistId;
    }

    /* renamed from: component2, reason: from getter */
    public final double getSellCoefficient() {
        return this.sellCoefficient;
    }

    public final SellBetParams copy(long betlistId, double sellCoefficient) {
        return new SellBetParams(betlistId, sellCoefficient);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellBetParams)) {
            return false;
        }
        SellBetParams sellBetParams = (SellBetParams) other;
        return this.betlistId == sellBetParams.betlistId && Double.compare(this.sellCoefficient, sellBetParams.sellCoefficient) == 0;
    }

    public int hashCode() {
        return (Long.hashCode(this.betlistId) * 31) + Double.hashCode(this.sellCoefficient);
    }

    public String toString() {
        return "SellBetParams(betlistId=" + this.betlistId + ", sellCoefficient=" + this.sellCoefficient + ")";
    }

    public SellBetParams(long j, double d) {
        this.betlistId = j;
        this.sellCoefficient = d;
    }

    public final long getBetlistId() {
        return this.betlistId;
    }

    public final double getSellCoefficient() {
        return this.sellCoefficient;
    }
}
