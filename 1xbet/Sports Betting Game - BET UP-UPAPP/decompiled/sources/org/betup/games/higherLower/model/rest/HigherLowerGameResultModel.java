package org.betup.games.higherLower.model.rest;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.games.common.remote.GamesErrorCodeModel;
import org.betup.games.dice.model.rest.GameResult;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HigherLowerGameResultModel.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jo\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0016\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00066"}, d2 = {"Lorg/betup/games/higherLower/model/rest/HigherLowerGameResultModel;", "", "betAmount", "", "betType", "Lorg/betup/games/higherLower/model/rest/HighLowBetType;", "coef", "", "firstNumber", "gameRef", "", "result", "Lorg/betup/games/dice/model/rest/GameResult;", "returnAmount", "secondNumber", "userRef", "gamesErrorCodeModel", "Lorg/betup/games/common/remote/GamesErrorCodeModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILorg/betup/games/higherLower/model/rest/HighLowBetType;DILjava/lang/String;Lorg/betup/games/dice/model/rest/GameResult;IILjava/lang/String;Lorg/betup/games/common/remote/GamesErrorCodeModel;)V", "getBetAmount", "()I", "getBetType", "()Lorg/betup/games/higherLower/model/rest/HighLowBetType;", "getCoef", "()D", "getFirstNumber", "getGameRef", "()Ljava/lang/String;", "getResult", "()Lorg/betup/games/dice/model/rest/GameResult;", "getReturnAmount", "getSecondNumber", "getUserRef", "getGamesErrorCodeModel", "()Lorg/betup/games/common/remote/GamesErrorCodeModel;", "setGamesErrorCodeModel", "(Lorg/betup/games/common/remote/GamesErrorCodeModel;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HigherLowerGameResultModel {
    public static final int $stable = 8;

    @SerializedName("betAmount")
    private final int betAmount;

    @SerializedName("betType")
    private final HighLowBetType betType;

    @SerializedName("coef")
    private final double coef;

    @SerializedName("firstNumber")
    private final int firstNumber;

    @SerializedName("gameRef")
    private final String gameRef;
    private GamesErrorCodeModel gamesErrorCodeModel;

    @SerializedName("result")
    private final GameResult result;

    @SerializedName("returnAmount")
    private final int returnAmount;

    @SerializedName("secondNumber")
    private final int secondNumber;

    @SerializedName("userRef")
    private final String userRef;

    /* renamed from: component1, reason: from getter */
    public final int getBetAmount() {
        return this.betAmount;
    }

    /* renamed from: component10, reason: from getter */
    public final GamesErrorCodeModel getGamesErrorCodeModel() {
        return this.gamesErrorCodeModel;
    }

    /* renamed from: component2, reason: from getter */
    public final HighLowBetType getBetType() {
        return this.betType;
    }

    /* renamed from: component3, reason: from getter */
    public final double getCoef() {
        return this.coef;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFirstNumber() {
        return this.firstNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final String getGameRef() {
        return this.gameRef;
    }

    /* renamed from: component6, reason: from getter */
    public final GameResult getResult() {
        return this.result;
    }

    /* renamed from: component7, reason: from getter */
    public final int getReturnAmount() {
        return this.returnAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final int getSecondNumber() {
        return this.secondNumber;
    }

    /* renamed from: component9, reason: from getter */
    public final String getUserRef() {
        return this.userRef;
    }

    public final HigherLowerGameResultModel copy(int betAmount, HighLowBetType betType, double coef, int firstNumber, String gameRef, GameResult result, int returnAmount, int secondNumber, String userRef, GamesErrorCodeModel gamesErrorCodeModel) {
        Intrinsics.checkNotNullParameter(betType, "betType");
        Intrinsics.checkNotNullParameter(gameRef, "gameRef");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(userRef, "userRef");
        return new HigherLowerGameResultModel(betAmount, betType, coef, firstNumber, gameRef, result, returnAmount, secondNumber, userRef, gamesErrorCodeModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HigherLowerGameResultModel)) {
            return false;
        }
        HigherLowerGameResultModel higherLowerGameResultModel = (HigherLowerGameResultModel) other;
        return this.betAmount == higherLowerGameResultModel.betAmount && this.betType == higherLowerGameResultModel.betType && Double.compare(this.coef, higherLowerGameResultModel.coef) == 0 && this.firstNumber == higherLowerGameResultModel.firstNumber && Intrinsics.areEqual(this.gameRef, higherLowerGameResultModel.gameRef) && this.result == higherLowerGameResultModel.result && this.returnAmount == higherLowerGameResultModel.returnAmount && this.secondNumber == higherLowerGameResultModel.secondNumber && Intrinsics.areEqual(this.userRef, higherLowerGameResultModel.userRef) && Intrinsics.areEqual(this.gamesErrorCodeModel, higherLowerGameResultModel.gamesErrorCodeModel);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((Integer.hashCode(this.betAmount) * 31) + this.betType.hashCode()) * 31) + Double.hashCode(this.coef)) * 31) + Integer.hashCode(this.firstNumber)) * 31) + this.gameRef.hashCode()) * 31) + this.result.hashCode()) * 31) + Integer.hashCode(this.returnAmount)) * 31) + Integer.hashCode(this.secondNumber)) * 31) + this.userRef.hashCode()) * 31;
        GamesErrorCodeModel gamesErrorCodeModel = this.gamesErrorCodeModel;
        return hashCode + (gamesErrorCodeModel == null ? 0 : gamesErrorCodeModel.hashCode());
    }

    public String toString() {
        return "HigherLowerGameResultModel(betAmount=" + this.betAmount + ", betType=" + this.betType + ", coef=" + this.coef + ", firstNumber=" + this.firstNumber + ", gameRef=" + this.gameRef + ", result=" + this.result + ", returnAmount=" + this.returnAmount + ", secondNumber=" + this.secondNumber + ", userRef=" + this.userRef + ", gamesErrorCodeModel=" + this.gamesErrorCodeModel + ")";
    }

    public HigherLowerGameResultModel(int i, HighLowBetType betType, double d, int i2, String gameRef, GameResult result, int i3, int i4, String userRef, GamesErrorCodeModel gamesErrorCodeModel) {
        Intrinsics.checkNotNullParameter(betType, "betType");
        Intrinsics.checkNotNullParameter(gameRef, "gameRef");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(userRef, "userRef");
        this.betAmount = i;
        this.betType = betType;
        this.coef = d;
        this.firstNumber = i2;
        this.gameRef = gameRef;
        this.result = result;
        this.returnAmount = i3;
        this.secondNumber = i4;
        this.userRef = userRef;
        this.gamesErrorCodeModel = gamesErrorCodeModel;
    }

    public final int getBetAmount() {
        return this.betAmount;
    }

    public final HighLowBetType getBetType() {
        return this.betType;
    }

    public final double getCoef() {
        return this.coef;
    }

    public final int getFirstNumber() {
        return this.firstNumber;
    }

    public final String getGameRef() {
        return this.gameRef;
    }

    public final GameResult getResult() {
        return this.result;
    }

    public final int getReturnAmount() {
        return this.returnAmount;
    }

    public final int getSecondNumber() {
        return this.secondNumber;
    }

    public final String getUserRef() {
        return this.userRef;
    }

    public final GamesErrorCodeModel getGamesErrorCodeModel() {
        return this.gamesErrorCodeModel;
    }

    public final void setGamesErrorCodeModel(GamesErrorCodeModel gamesErrorCodeModel) {
        this.gamesErrorCodeModel = gamesErrorCodeModel;
    }
}
