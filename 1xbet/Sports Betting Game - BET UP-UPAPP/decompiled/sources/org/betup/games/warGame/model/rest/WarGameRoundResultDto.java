package org.betup.games.warGame.model.rest;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: WarGameRoundResultDto.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lorg/betup/games/warGame/model/rest/WarGameRoundResultDto;", "", "warGameResultModel", "Lorg/betup/games/warGame/model/rest/WarGameResultModel;", "finished", "", "opponentCard", "Lorg/betup/games/warGame/model/rest/CardModel;", "playerCard", "sessionRef", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/games/warGame/model/rest/WarGameResultModel;ZLorg/betup/games/warGame/model/rest/CardModel;Lorg/betup/games/warGame/model/rest/CardModel;Ljava/lang/String;)V", "getWarGameResultModel", "()Lorg/betup/games/warGame/model/rest/WarGameResultModel;", "getFinished", "()Z", "getOpponentCard", "()Lorg/betup/games/warGame/model/rest/CardModel;", "getPlayerCard", "getSessionRef", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WarGameRoundResultDto {
    public static final int $stable = 0;

    @SerializedName("isFinished")
    private final boolean finished;

    @SerializedName("opponentCard")
    private final CardModel opponentCard;

    @SerializedName("playerCard")
    private final CardModel playerCard;
    private final String sessionRef;

    @SerializedName("finalResult")
    private final WarGameResultModel warGameResultModel;

    public static /* synthetic */ WarGameRoundResultDto copy$default(WarGameRoundResultDto warGameRoundResultDto, WarGameResultModel warGameResultModel, boolean z, CardModel cardModel, CardModel cardModel2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            warGameResultModel = warGameRoundResultDto.warGameResultModel;
        }
        if ((i & 2) != 0) {
            z = warGameRoundResultDto.finished;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            cardModel = warGameRoundResultDto.opponentCard;
        }
        CardModel cardModel3 = cardModel;
        if ((i & 8) != 0) {
            cardModel2 = warGameRoundResultDto.playerCard;
        }
        CardModel cardModel4 = cardModel2;
        if ((i & 16) != 0) {
            str = warGameRoundResultDto.sessionRef;
        }
        return warGameRoundResultDto.copy(warGameResultModel, z2, cardModel3, cardModel4, str);
    }

    /* renamed from: component1, reason: from getter */
    public final WarGameResultModel getWarGameResultModel() {
        return this.warGameResultModel;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getFinished() {
        return this.finished;
    }

    /* renamed from: component3, reason: from getter */
    public final CardModel getOpponentCard() {
        return this.opponentCard;
    }

    /* renamed from: component4, reason: from getter */
    public final CardModel getPlayerCard() {
        return this.playerCard;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSessionRef() {
        return this.sessionRef;
    }

    public final WarGameRoundResultDto copy(WarGameResultModel warGameResultModel, boolean finished, CardModel opponentCard, CardModel playerCard, String sessionRef) {
        Intrinsics.checkNotNullParameter(warGameResultModel, "warGameResultModel");
        Intrinsics.checkNotNullParameter(sessionRef, "sessionRef");
        return new WarGameRoundResultDto(warGameResultModel, finished, opponentCard, playerCard, sessionRef);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WarGameRoundResultDto)) {
            return false;
        }
        WarGameRoundResultDto warGameRoundResultDto = (WarGameRoundResultDto) other;
        return Intrinsics.areEqual(this.warGameResultModel, warGameRoundResultDto.warGameResultModel) && this.finished == warGameRoundResultDto.finished && Intrinsics.areEqual(this.opponentCard, warGameRoundResultDto.opponentCard) && Intrinsics.areEqual(this.playerCard, warGameRoundResultDto.playerCard) && Intrinsics.areEqual(this.sessionRef, warGameRoundResultDto.sessionRef);
    }

    public int hashCode() {
        int hashCode = ((this.warGameResultModel.hashCode() * 31) + Boolean.hashCode(this.finished)) * 31;
        CardModel cardModel = this.opponentCard;
        int hashCode2 = (hashCode + (cardModel == null ? 0 : cardModel.hashCode())) * 31;
        CardModel cardModel2 = this.playerCard;
        return ((hashCode2 + (cardModel2 != null ? cardModel2.hashCode() : 0)) * 31) + this.sessionRef.hashCode();
    }

    public String toString() {
        return "WarGameRoundResultDto(warGameResultModel=" + this.warGameResultModel + ", finished=" + this.finished + ", opponentCard=" + this.opponentCard + ", playerCard=" + this.playerCard + ", sessionRef=" + this.sessionRef + ")";
    }

    public WarGameRoundResultDto(WarGameResultModel warGameResultModel, boolean z, CardModel cardModel, CardModel cardModel2, String sessionRef) {
        Intrinsics.checkNotNullParameter(warGameResultModel, "warGameResultModel");
        Intrinsics.checkNotNullParameter(sessionRef, "sessionRef");
        this.warGameResultModel = warGameResultModel;
        this.finished = z;
        this.opponentCard = cardModel;
        this.playerCard = cardModel2;
        this.sessionRef = sessionRef;
    }

    public final WarGameResultModel getWarGameResultModel() {
        return this.warGameResultModel;
    }

    public final boolean getFinished() {
        return this.finished;
    }

    public final CardModel getOpponentCard() {
        return this.opponentCard;
    }

    public final CardModel getPlayerCard() {
        return this.playerCard;
    }

    public final String getSessionRef() {
        return this.sessionRef;
    }
}
