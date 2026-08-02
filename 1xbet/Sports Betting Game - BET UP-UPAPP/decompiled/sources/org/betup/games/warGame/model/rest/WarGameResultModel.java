package org.betup.games.warGame.model.rest;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.games.dice.model.rest.GameResult;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: WarGameResultModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lorg/betup/games/warGame/model/rest/WarGameResultModel;", "", "coef", "", "gameResult", "Lorg/betup/games/dice/model/rest/GameResult;", "returnAmount", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(DLorg/betup/games/dice/model/rest/GameResult;Ljava/lang/Integer;)V", "getCoef", "()D", "getGameResult", "()Lorg/betup/games/dice/model/rest/GameResult;", "getReturnAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(DLorg/betup/games/dice/model/rest/GameResult;Ljava/lang/Integer;)Lorg/betup/games/warGame/model/rest/WarGameResultModel;", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WarGameResultModel {
    public static final int $stable = 0;
    private final double coef;
    private final GameResult gameResult;
    private final Integer returnAmount;

    public static /* synthetic */ WarGameResultModel copy$default(WarGameResultModel warGameResultModel, double d, GameResult gameResult, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            d = warGameResultModel.coef;
        }
        if ((i & 2) != 0) {
            gameResult = warGameResultModel.gameResult;
        }
        if ((i & 4) != 0) {
            num = warGameResultModel.returnAmount;
        }
        return warGameResultModel.copy(d, gameResult, num);
    }

    /* renamed from: component1, reason: from getter */
    public final double getCoef() {
        return this.coef;
    }

    /* renamed from: component2, reason: from getter */
    public final GameResult getGameResult() {
        return this.gameResult;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getReturnAmount() {
        return this.returnAmount;
    }

    public final WarGameResultModel copy(double coef, GameResult gameResult, Integer returnAmount) {
        Intrinsics.checkNotNullParameter(gameResult, "gameResult");
        return new WarGameResultModel(coef, gameResult, returnAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WarGameResultModel)) {
            return false;
        }
        WarGameResultModel warGameResultModel = (WarGameResultModel) other;
        return Double.compare(this.coef, warGameResultModel.coef) == 0 && this.gameResult == warGameResultModel.gameResult && Intrinsics.areEqual(this.returnAmount, warGameResultModel.returnAmount);
    }

    public int hashCode() {
        int hashCode = ((Double.hashCode(this.coef) * 31) + this.gameResult.hashCode()) * 31;
        Integer num = this.returnAmount;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "WarGameResultModel(coef=" + this.coef + ", gameResult=" + this.gameResult + ", returnAmount=" + this.returnAmount + ")";
    }

    public WarGameResultModel(double d, GameResult gameResult, Integer num) {
        Intrinsics.checkNotNullParameter(gameResult, "gameResult");
        this.coef = d;
        this.gameResult = gameResult;
        this.returnAmount = num;
    }

    public final double getCoef() {
        return this.coef;
    }

    public final GameResult getGameResult() {
        return this.gameResult;
    }

    public final Integer getReturnAmount() {
        return this.returnAmount;
    }
}
