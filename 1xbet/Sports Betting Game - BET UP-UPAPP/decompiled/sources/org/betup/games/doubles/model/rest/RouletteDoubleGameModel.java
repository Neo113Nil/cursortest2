package org.betup.games.doubles.model.rest;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: RouletteDoubleGameModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lorg/betup/games/doubles/model/rest/RouletteDoubleGameModel;", "", "betType", "Lorg/betup/games/doubles/model/rest/DoubleBetType;", "ordinal", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/games/doubles/model/rest/DoubleBetType;I)V", "getBetType", "()Lorg/betup/games/doubles/model/rest/DoubleBetType;", "getOrdinal", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RouletteDoubleGameModel {
    public static final int $stable = 0;
    private final DoubleBetType betType;
    private final int ordinal;

    public static /* synthetic */ RouletteDoubleGameModel copy$default(RouletteDoubleGameModel rouletteDoubleGameModel, DoubleBetType doubleBetType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            doubleBetType = rouletteDoubleGameModel.betType;
        }
        if ((i2 & 2) != 0) {
            i = rouletteDoubleGameModel.ordinal;
        }
        return rouletteDoubleGameModel.copy(doubleBetType, i);
    }

    /* renamed from: component1, reason: from getter */
    public final DoubleBetType getBetType() {
        return this.betType;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOrdinal() {
        return this.ordinal;
    }

    public final RouletteDoubleGameModel copy(DoubleBetType betType, int ordinal) {
        Intrinsics.checkNotNullParameter(betType, "betType");
        return new RouletteDoubleGameModel(betType, ordinal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouletteDoubleGameModel)) {
            return false;
        }
        RouletteDoubleGameModel rouletteDoubleGameModel = (RouletteDoubleGameModel) other;
        return this.betType == rouletteDoubleGameModel.betType && this.ordinal == rouletteDoubleGameModel.ordinal;
    }

    public int hashCode() {
        return (this.betType.hashCode() * 31) + Integer.hashCode(this.ordinal);
    }

    public String toString() {
        return "RouletteDoubleGameModel(betType=" + this.betType + ", ordinal=" + this.ordinal + ")";
    }

    public RouletteDoubleGameModel(DoubleBetType betType, int i) {
        Intrinsics.checkNotNullParameter(betType, "betType");
        this.betType = betType;
        this.ordinal = i;
    }

    public final DoubleBetType getBetType() {
        return this.betType;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }
}
