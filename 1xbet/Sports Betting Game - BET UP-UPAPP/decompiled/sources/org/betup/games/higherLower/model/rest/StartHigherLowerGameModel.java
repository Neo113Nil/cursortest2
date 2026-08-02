package org.betup.games.higherLower.model.rest;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.games.common.remote.GamesErrorCodeModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: StartHigherLowerGameModel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JI\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lorg/betup/games/higherLower/model/rest/StartHigherLowerGameModel;", "", "betAmount", "", "highLowBetTypeList", "", "Lorg/betup/games/higherLower/model/rest/HighLowBetType;", "", "firstNumber", "sessionId", "", "gamesErrorCodeModel", "Lorg/betup/games/common/remote/GamesErrorCodeModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/util/Map;ILjava/lang/String;Lorg/betup/games/common/remote/GamesErrorCodeModel;)V", "getBetAmount", "()I", "getHighLowBetTypeList", "()Ljava/util/Map;", "getFirstNumber", "getSessionId", "()Ljava/lang/String;", "getGamesErrorCodeModel", "()Lorg/betup/games/common/remote/GamesErrorCodeModel;", "setGamesErrorCodeModel", "(Lorg/betup/games/common/remote/GamesErrorCodeModel;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StartHigherLowerGameModel {
    public static final int $stable = 8;
    private final int betAmount;
    private final int firstNumber;
    private GamesErrorCodeModel gamesErrorCodeModel;

    @SerializedName("coefs")
    private final Map<HighLowBetType, Double> highLowBetTypeList;
    private final String sessionId;

    public static /* synthetic */ StartHigherLowerGameModel copy$default(StartHigherLowerGameModel startHigherLowerGameModel, int i, Map map, int i2, String str, GamesErrorCodeModel gamesErrorCodeModel, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = startHigherLowerGameModel.betAmount;
        }
        if ((i3 & 2) != 0) {
            map = startHigherLowerGameModel.highLowBetTypeList;
        }
        Map map2 = map;
        if ((i3 & 4) != 0) {
            i2 = startHigherLowerGameModel.firstNumber;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            str = startHigherLowerGameModel.sessionId;
        }
        String str2 = str;
        if ((i3 & 16) != 0) {
            gamesErrorCodeModel = startHigherLowerGameModel.gamesErrorCodeModel;
        }
        return startHigherLowerGameModel.copy(i, map2, i4, str2, gamesErrorCodeModel);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBetAmount() {
        return this.betAmount;
    }

    public final Map<HighLowBetType, Double> component2() {
        return this.highLowBetTypeList;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFirstNumber() {
        return this.firstNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component5, reason: from getter */
    public final GamesErrorCodeModel getGamesErrorCodeModel() {
        return this.gamesErrorCodeModel;
    }

    public final StartHigherLowerGameModel copy(int betAmount, Map<HighLowBetType, Double> highLowBetTypeList, int firstNumber, String sessionId, GamesErrorCodeModel gamesErrorCodeModel) {
        Intrinsics.checkNotNullParameter(highLowBetTypeList, "highLowBetTypeList");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new StartHigherLowerGameModel(betAmount, highLowBetTypeList, firstNumber, sessionId, gamesErrorCodeModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartHigherLowerGameModel)) {
            return false;
        }
        StartHigherLowerGameModel startHigherLowerGameModel = (StartHigherLowerGameModel) other;
        return this.betAmount == startHigherLowerGameModel.betAmount && Intrinsics.areEqual(this.highLowBetTypeList, startHigherLowerGameModel.highLowBetTypeList) && this.firstNumber == startHigherLowerGameModel.firstNumber && Intrinsics.areEqual(this.sessionId, startHigherLowerGameModel.sessionId) && Intrinsics.areEqual(this.gamesErrorCodeModel, startHigherLowerGameModel.gamesErrorCodeModel);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.betAmount) * 31) + this.highLowBetTypeList.hashCode()) * 31) + Integer.hashCode(this.firstNumber)) * 31) + this.sessionId.hashCode()) * 31;
        GamesErrorCodeModel gamesErrorCodeModel = this.gamesErrorCodeModel;
        return hashCode + (gamesErrorCodeModel == null ? 0 : gamesErrorCodeModel.hashCode());
    }

    public String toString() {
        return "StartHigherLowerGameModel(betAmount=" + this.betAmount + ", highLowBetTypeList=" + this.highLowBetTypeList + ", firstNumber=" + this.firstNumber + ", sessionId=" + this.sessionId + ", gamesErrorCodeModel=" + this.gamesErrorCodeModel + ")";
    }

    public StartHigherLowerGameModel(int i, Map<HighLowBetType, Double> highLowBetTypeList, int i2, String sessionId, GamesErrorCodeModel gamesErrorCodeModel) {
        Intrinsics.checkNotNullParameter(highLowBetTypeList, "highLowBetTypeList");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.betAmount = i;
        this.highLowBetTypeList = highLowBetTypeList;
        this.firstNumber = i2;
        this.sessionId = sessionId;
        this.gamesErrorCodeModel = gamesErrorCodeModel;
    }

    public final int getBetAmount() {
        return this.betAmount;
    }

    public final Map<HighLowBetType, Double> getHighLowBetTypeList() {
        return this.highLowBetTypeList;
    }

    public final int getFirstNumber() {
        return this.firstNumber;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final GamesErrorCodeModel getGamesErrorCodeModel() {
        return this.gamesErrorCodeModel;
    }

    public final void setGamesErrorCodeModel(GamesErrorCodeModel gamesErrorCodeModel) {
        this.gamesErrorCodeModel = gamesErrorCodeModel;
    }
}
