package org.betup.games.luckyCells.model.rest;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.games.common.remote.GamesErrorCodeModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: StartLuckyCellsGameModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jb\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00061"}, d2 = {"Lorg/betup/games/luckyCells/model/rest/SessionLuckyCellsGameModel;", "", "id", "", "returnAmount", "", "coefficient", "", "userRef", "gameRef", "finished", "", "betAmount", "", "gamesErrorCodeModel", "Lorg/betup/games/common/remote/GamesErrorCodeModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/Integer;DLjava/lang/String;Ljava/lang/String;ZJLorg/betup/games/common/remote/GamesErrorCodeModel;)V", "getId", "()Ljava/lang/String;", "getReturnAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCoefficient", "()D", "getUserRef", "getGameRef", "getFinished", "()Z", "getBetAmount", "()J", "getGamesErrorCodeModel", "()Lorg/betup/games/common/remote/GamesErrorCodeModel;", "setGamesErrorCodeModel", "(Lorg/betup/games/common/remote/GamesErrorCodeModel;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;DLjava/lang/String;Ljava/lang/String;ZJLorg/betup/games/common/remote/GamesErrorCodeModel;)Lorg/betup/games/luckyCells/model/rest/SessionLuckyCellsGameModel;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SessionLuckyCellsGameModel {
    public static final int $stable = 8;
    private final long betAmount;
    private final double coefficient;
    private final boolean finished;
    private final String gameRef;
    private GamesErrorCodeModel gamesErrorCodeModel;
    private final String id;
    private final Integer returnAmount;
    private final String userRef;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getReturnAmount() {
        return this.returnAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final double getCoefficient() {
        return this.coefficient;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUserRef() {
        return this.userRef;
    }

    /* renamed from: component5, reason: from getter */
    public final String getGameRef() {
        return this.gameRef;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getFinished() {
        return this.finished;
    }

    /* renamed from: component7, reason: from getter */
    public final long getBetAmount() {
        return this.betAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final GamesErrorCodeModel getGamesErrorCodeModel() {
        return this.gamesErrorCodeModel;
    }

    public final SessionLuckyCellsGameModel copy(String id, Integer returnAmount, double coefficient, String userRef, String gameRef, boolean finished, long betAmount, GamesErrorCodeModel gamesErrorCodeModel) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userRef, "userRef");
        Intrinsics.checkNotNullParameter(gameRef, "gameRef");
        return new SessionLuckyCellsGameModel(id, returnAmount, coefficient, userRef, gameRef, finished, betAmount, gamesErrorCodeModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionLuckyCellsGameModel)) {
            return false;
        }
        SessionLuckyCellsGameModel sessionLuckyCellsGameModel = (SessionLuckyCellsGameModel) other;
        return Intrinsics.areEqual(this.id, sessionLuckyCellsGameModel.id) && Intrinsics.areEqual(this.returnAmount, sessionLuckyCellsGameModel.returnAmount) && Double.compare(this.coefficient, sessionLuckyCellsGameModel.coefficient) == 0 && Intrinsics.areEqual(this.userRef, sessionLuckyCellsGameModel.userRef) && Intrinsics.areEqual(this.gameRef, sessionLuckyCellsGameModel.gameRef) && this.finished == sessionLuckyCellsGameModel.finished && this.betAmount == sessionLuckyCellsGameModel.betAmount && Intrinsics.areEqual(this.gamesErrorCodeModel, sessionLuckyCellsGameModel.gamesErrorCodeModel);
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        Integer num = this.returnAmount;
        int hashCode2 = (((((((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Double.hashCode(this.coefficient)) * 31) + this.userRef.hashCode()) * 31) + this.gameRef.hashCode()) * 31) + Boolean.hashCode(this.finished)) * 31) + Long.hashCode(this.betAmount)) * 31;
        GamesErrorCodeModel gamesErrorCodeModel = this.gamesErrorCodeModel;
        return hashCode2 + (gamesErrorCodeModel != null ? gamesErrorCodeModel.hashCode() : 0);
    }

    public String toString() {
        return "SessionLuckyCellsGameModel(id=" + this.id + ", returnAmount=" + this.returnAmount + ", coefficient=" + this.coefficient + ", userRef=" + this.userRef + ", gameRef=" + this.gameRef + ", finished=" + this.finished + ", betAmount=" + this.betAmount + ", gamesErrorCodeModel=" + this.gamesErrorCodeModel + ")";
    }

    public SessionLuckyCellsGameModel(String id, Integer num, double d, String userRef, String gameRef, boolean z, long j, GamesErrorCodeModel gamesErrorCodeModel) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userRef, "userRef");
        Intrinsics.checkNotNullParameter(gameRef, "gameRef");
        this.id = id;
        this.returnAmount = num;
        this.coefficient = d;
        this.userRef = userRef;
        this.gameRef = gameRef;
        this.finished = z;
        this.betAmount = j;
        this.gamesErrorCodeModel = gamesErrorCodeModel;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getReturnAmount() {
        return this.returnAmount;
    }

    public final double getCoefficient() {
        return this.coefficient;
    }

    public final String getUserRef() {
        return this.userRef;
    }

    public final String getGameRef() {
        return this.gameRef;
    }

    public final boolean getFinished() {
        return this.finished;
    }

    public final long getBetAmount() {
        return this.betAmount;
    }

    public final GamesErrorCodeModel getGamesErrorCodeModel() {
        return this.gamesErrorCodeModel;
    }

    public final void setGamesErrorCodeModel(GamesErrorCodeModel gamesErrorCodeModel) {
        this.gamesErrorCodeModel = gamesErrorCodeModel;
    }
}
