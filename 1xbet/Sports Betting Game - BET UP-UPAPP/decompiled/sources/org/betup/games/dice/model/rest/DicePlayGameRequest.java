package org.betup.games.dice.model.rest;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DicePlayGameRequest.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lorg/betup/games/dice/model/rest/DicePlayGameRequest;", "Ljava/io/Serializable;", "betAmount", "", "diceGameBetType", "Lorg/betup/games/dice/model/rest/DiceBetType;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILorg/betup/games/dice/model/rest/DiceBetType;)V", "getBetAmount", "()I", "setBetAmount", "(I)V", "getDiceGameBetType", "()Lorg/betup/games/dice/model/rest/DiceBetType;", "setDiceGameBetType", "(Lorg/betup/games/dice/model/rest/DiceBetType;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DicePlayGameRequest implements Serializable {
    public static final int $stable = 8;

    @SerializedName("betAmount")
    private int betAmount;

    @SerializedName("diceGameBetType")
    private DiceBetType diceGameBetType;

    public static /* synthetic */ DicePlayGameRequest copy$default(DicePlayGameRequest dicePlayGameRequest, int i, DiceBetType diceBetType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dicePlayGameRequest.betAmount;
        }
        if ((i2 & 2) != 0) {
            diceBetType = dicePlayGameRequest.diceGameBetType;
        }
        return dicePlayGameRequest.copy(i, diceBetType);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBetAmount() {
        return this.betAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final DiceBetType getDiceGameBetType() {
        return this.diceGameBetType;
    }

    public final DicePlayGameRequest copy(int betAmount, DiceBetType diceGameBetType) {
        Intrinsics.checkNotNullParameter(diceGameBetType, "diceGameBetType");
        return new DicePlayGameRequest(betAmount, diceGameBetType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DicePlayGameRequest)) {
            return false;
        }
        DicePlayGameRequest dicePlayGameRequest = (DicePlayGameRequest) other;
        return this.betAmount == dicePlayGameRequest.betAmount && this.diceGameBetType == dicePlayGameRequest.diceGameBetType;
    }

    public int hashCode() {
        return (Integer.hashCode(this.betAmount) * 31) + this.diceGameBetType.hashCode();
    }

    public String toString() {
        return "DicePlayGameRequest(betAmount=" + this.betAmount + ", diceGameBetType=" + this.diceGameBetType + ")";
    }

    public DicePlayGameRequest(int i, DiceBetType diceGameBetType) {
        Intrinsics.checkNotNullParameter(diceGameBetType, "diceGameBetType");
        this.betAmount = i;
        this.diceGameBetType = diceGameBetType;
    }

    public final int getBetAmount() {
        return this.betAmount;
    }

    public final void setBetAmount(int i) {
        this.betAmount = i;
    }

    public final DiceBetType getDiceGameBetType() {
        return this.diceGameBetType;
    }

    public final void setDiceGameBetType(DiceBetType diceBetType) {
        Intrinsics.checkNotNullParameter(diceBetType, "<set-?>");
        this.diceGameBetType = diceBetType;
    }
}
