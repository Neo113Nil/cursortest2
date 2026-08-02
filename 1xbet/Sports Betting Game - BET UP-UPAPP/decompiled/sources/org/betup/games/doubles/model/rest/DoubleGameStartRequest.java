package org.betup.games.doubles.model.rest;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DoubleGameStartRequest.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lorg/betup/games/doubles/model/rest/DoubleGameStartRequest;", "", "betAmount", "", "betType", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JI)V", "getBetAmount", "()J", "getBetType", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DoubleGameStartRequest {
    public static final int $stable = 0;

    @SerializedName("betAmount")
    private final long betAmount;

    @SerializedName("betType")
    private final int betType;

    public static /* synthetic */ DoubleGameStartRequest copy$default(DoubleGameStartRequest doubleGameStartRequest, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = doubleGameStartRequest.betAmount;
        }
        if ((i2 & 2) != 0) {
            i = doubleGameStartRequest.betType;
        }
        return doubleGameStartRequest.copy(j, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getBetAmount() {
        return this.betAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBetType() {
        return this.betType;
    }

    public final DoubleGameStartRequest copy(long betAmount, int betType) {
        return new DoubleGameStartRequest(betAmount, betType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DoubleGameStartRequest)) {
            return false;
        }
        DoubleGameStartRequest doubleGameStartRequest = (DoubleGameStartRequest) other;
        return this.betAmount == doubleGameStartRequest.betAmount && this.betType == doubleGameStartRequest.betType;
    }

    public int hashCode() {
        return (Long.hashCode(this.betAmount) * 31) + Integer.hashCode(this.betType);
    }

    public String toString() {
        return "DoubleGameStartRequest(betAmount=" + this.betAmount + ", betType=" + this.betType + ")";
    }

    public DoubleGameStartRequest(long j, int i) {
        this.betAmount = j;
        this.betType = i;
    }

    public final long getBetAmount() {
        return this.betAmount;
    }

    public final int getBetType() {
        return this.betType;
    }
}
