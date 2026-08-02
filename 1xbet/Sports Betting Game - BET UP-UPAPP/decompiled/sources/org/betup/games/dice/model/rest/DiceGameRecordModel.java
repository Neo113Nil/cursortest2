package org.betup.games.dice.model.rest;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.games.common.remote.GamesErrorCodeModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DiceGameRecordModel.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\nHÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jy\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020\u0003HÖ\u0001J\t\u0010E\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010\u0017R\u001e\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006F"}, d2 = {"Lorg/betup/games/dice/model/rest/DiceGameRecordModel;", "Ljava/io/Serializable;", "betAmount", "", "createdAt", "", "firstDice", "gameRef", "id", "result", "Lorg/betup/games/dice/model/rest/GameResult;", "betType", "Lorg/betup/games/dice/model/rest/DiceBetType;", "returnAmount", "secondDice", "userRef", "gamesErrorCodeModel", "Lorg/betup/games/common/remote/GamesErrorCodeModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lorg/betup/games/dice/model/rest/GameResult;Lorg/betup/games/dice/model/rest/DiceBetType;IILjava/lang/String;Lorg/betup/games/common/remote/GamesErrorCodeModel;)V", "getBetAmount", "()I", "setBetAmount", "(I)V", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "getFirstDice", "setFirstDice", "getGameRef", "setGameRef", "getId", "setId", "getResult", "()Lorg/betup/games/dice/model/rest/GameResult;", "setResult", "(Lorg/betup/games/dice/model/rest/GameResult;)V", "getBetType", "()Lorg/betup/games/dice/model/rest/DiceBetType;", "setBetType", "(Lorg/betup/games/dice/model/rest/DiceBetType;)V", "getReturnAmount", "setReturnAmount", "getSecondDice", "setSecondDice", "getUserRef", "setUserRef", "getGamesErrorCodeModel", "()Lorg/betup/games/common/remote/GamesErrorCodeModel;", "setGamesErrorCodeModel", "(Lorg/betup/games/common/remote/GamesErrorCodeModel;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DiceGameRecordModel implements Serializable {
    public static final int $stable = 8;

    @SerializedName("betAmount")
    private int betAmount;

    @SerializedName("betType")
    private DiceBetType betType;

    @SerializedName("createdAt")
    private String createdAt;

    @SerializedName("firstDice")
    private int firstDice;

    @SerializedName("gameRef")
    private String gameRef;
    private GamesErrorCodeModel gamesErrorCodeModel;

    @SerializedName("id")
    private String id;

    @SerializedName("result")
    private GameResult result;

    @SerializedName("returnAmount")
    private int returnAmount;

    @SerializedName("secondDice")
    private int secondDice;

    @SerializedName("userRef")
    private String userRef;

    /* renamed from: component1, reason: from getter */
    public final int getBetAmount() {
        return this.betAmount;
    }

    /* renamed from: component10, reason: from getter */
    public final String getUserRef() {
        return this.userRef;
    }

    /* renamed from: component11, reason: from getter */
    public final GamesErrorCodeModel getGamesErrorCodeModel() {
        return this.gamesErrorCodeModel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFirstDice() {
        return this.firstDice;
    }

    /* renamed from: component4, reason: from getter */
    public final String getGameRef() {
        return this.gameRef;
    }

    /* renamed from: component5, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component6, reason: from getter */
    public final GameResult getResult() {
        return this.result;
    }

    /* renamed from: component7, reason: from getter */
    public final DiceBetType getBetType() {
        return this.betType;
    }

    /* renamed from: component8, reason: from getter */
    public final int getReturnAmount() {
        return this.returnAmount;
    }

    /* renamed from: component9, reason: from getter */
    public final int getSecondDice() {
        return this.secondDice;
    }

    public final DiceGameRecordModel copy(int betAmount, String createdAt, int firstDice, String gameRef, String id, GameResult result, DiceBetType betType, int returnAmount, int secondDice, String userRef, GamesErrorCodeModel gamesErrorCodeModel) {
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(gameRef, "gameRef");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(betType, "betType");
        Intrinsics.checkNotNullParameter(userRef, "userRef");
        return new DiceGameRecordModel(betAmount, createdAt, firstDice, gameRef, id, result, betType, returnAmount, secondDice, userRef, gamesErrorCodeModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiceGameRecordModel)) {
            return false;
        }
        DiceGameRecordModel diceGameRecordModel = (DiceGameRecordModel) other;
        return this.betAmount == diceGameRecordModel.betAmount && Intrinsics.areEqual(this.createdAt, diceGameRecordModel.createdAt) && this.firstDice == diceGameRecordModel.firstDice && Intrinsics.areEqual(this.gameRef, diceGameRecordModel.gameRef) && Intrinsics.areEqual(this.id, diceGameRecordModel.id) && this.result == diceGameRecordModel.result && this.betType == diceGameRecordModel.betType && this.returnAmount == diceGameRecordModel.returnAmount && this.secondDice == diceGameRecordModel.secondDice && Intrinsics.areEqual(this.userRef, diceGameRecordModel.userRef) && Intrinsics.areEqual(this.gamesErrorCodeModel, diceGameRecordModel.gamesErrorCodeModel);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((Integer.hashCode(this.betAmount) * 31) + this.createdAt.hashCode()) * 31) + Integer.hashCode(this.firstDice)) * 31) + this.gameRef.hashCode()) * 31) + this.id.hashCode()) * 31) + this.result.hashCode()) * 31) + this.betType.hashCode()) * 31) + Integer.hashCode(this.returnAmount)) * 31) + Integer.hashCode(this.secondDice)) * 31) + this.userRef.hashCode()) * 31;
        GamesErrorCodeModel gamesErrorCodeModel = this.gamesErrorCodeModel;
        return hashCode + (gamesErrorCodeModel == null ? 0 : gamesErrorCodeModel.hashCode());
    }

    public String toString() {
        return "DiceGameRecordModel(betAmount=" + this.betAmount + ", createdAt=" + this.createdAt + ", firstDice=" + this.firstDice + ", gameRef=" + this.gameRef + ", id=" + this.id + ", result=" + this.result + ", betType=" + this.betType + ", returnAmount=" + this.returnAmount + ", secondDice=" + this.secondDice + ", userRef=" + this.userRef + ", gamesErrorCodeModel=" + this.gamesErrorCodeModel + ")";
    }

    public DiceGameRecordModel(int i, String createdAt, int i2, String gameRef, String id, GameResult result, DiceBetType betType, int i3, int i4, String userRef, GamesErrorCodeModel gamesErrorCodeModel) {
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(gameRef, "gameRef");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(betType, "betType");
        Intrinsics.checkNotNullParameter(userRef, "userRef");
        this.betAmount = i;
        this.createdAt = createdAt;
        this.firstDice = i2;
        this.gameRef = gameRef;
        this.id = id;
        this.result = result;
        this.betType = betType;
        this.returnAmount = i3;
        this.secondDice = i4;
        this.userRef = userRef;
        this.gamesErrorCodeModel = gamesErrorCodeModel;
    }

    public final int getBetAmount() {
        return this.betAmount;
    }

    public final void setBetAmount(int i) {
        this.betAmount = i;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final void setCreatedAt(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.createdAt = str;
    }

    public final int getFirstDice() {
        return this.firstDice;
    }

    public final void setFirstDice(int i) {
        this.firstDice = i;
    }

    public final String getGameRef() {
        return this.gameRef;
    }

    public final void setGameRef(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gameRef = str;
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final GameResult getResult() {
        return this.result;
    }

    public final void setResult(GameResult gameResult) {
        Intrinsics.checkNotNullParameter(gameResult, "<set-?>");
        this.result = gameResult;
    }

    public final DiceBetType getBetType() {
        return this.betType;
    }

    public final void setBetType(DiceBetType diceBetType) {
        Intrinsics.checkNotNullParameter(diceBetType, "<set-?>");
        this.betType = diceBetType;
    }

    public final int getReturnAmount() {
        return this.returnAmount;
    }

    public final void setReturnAmount(int i) {
        this.returnAmount = i;
    }

    public final int getSecondDice() {
        return this.secondDice;
    }

    public final void setSecondDice(int i) {
        this.secondDice = i;
    }

    public final String getUserRef() {
        return this.userRef;
    }

    public final void setUserRef(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userRef = str;
    }

    public final GamesErrorCodeModel getGamesErrorCodeModel() {
        return this.gamesErrorCodeModel;
    }

    public final void setGamesErrorCodeModel(GamesErrorCodeModel gamesErrorCodeModel) {
        this.gamesErrorCodeModel = gamesErrorCodeModel;
    }
}
