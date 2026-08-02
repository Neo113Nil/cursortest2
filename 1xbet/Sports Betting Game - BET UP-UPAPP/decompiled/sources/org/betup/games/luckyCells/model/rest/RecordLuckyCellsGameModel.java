package org.betup.games.luckyCells.model.rest;

import io.bidmachine.media3.exoplayer.upstream.CmcdData;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.games.common.remote.GamesErrorCodeModel;
import org.betup.games.dice.model.rest.GameResult;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: StartLuckyCellsGameModel.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001<Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\t\u00103\u001a\u00020\u0010HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0080\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0005HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006="}, d2 = {"Lorg/betup/games/luckyCells/model/rest/RecordLuckyCellsGameModel;", "", "id", "", "coordinateX", "", "coordinateY", "sessionRef", "cellType", "Lorg/betup/games/luckyCells/model/rest/RecordLuckyCellsGameModel$CellType;", "userRef", "gameRef", "betAmount", "", "returnAmount", "result", "Lorg/betup/games/dice/model/rest/GameResult;", "gamesErrorCodeModel", "Lorg/betup/games/common/remote/GamesErrorCodeModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IILjava/lang/String;Lorg/betup/games/luckyCells/model/rest/RecordLuckyCellsGameModel$CellType;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Lorg/betup/games/dice/model/rest/GameResult;Lorg/betup/games/common/remote/GamesErrorCodeModel;)V", "getId", "()Ljava/lang/String;", "getCoordinateX", "()I", "getCoordinateY", "getSessionRef", "getCellType", "()Lorg/betup/games/luckyCells/model/rest/RecordLuckyCellsGameModel$CellType;", "getUserRef", "getGameRef", "getBetAmount", "()J", "getReturnAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResult", "()Lorg/betup/games/dice/model/rest/GameResult;", "getGamesErrorCodeModel", "()Lorg/betup/games/common/remote/GamesErrorCodeModel;", "setGamesErrorCodeModel", "(Lorg/betup/games/common/remote/GamesErrorCodeModel;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;IILjava/lang/String;Lorg/betup/games/luckyCells/model/rest/RecordLuckyCellsGameModel$CellType;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Lorg/betup/games/dice/model/rest/GameResult;Lorg/betup/games/common/remote/GamesErrorCodeModel;)Lorg/betup/games/luckyCells/model/rest/RecordLuckyCellsGameModel;", "equals", "", "other", "hashCode", "toString", "CellType", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecordLuckyCellsGameModel {
    public static final int $stable = 8;
    private final long betAmount;
    private final CellType cellType;
    private final int coordinateX;
    private final int coordinateY;
    private final String gameRef;
    private GamesErrorCodeModel gamesErrorCodeModel;
    private final String id;
    private final GameResult result;
    private final Integer returnAmount;
    private final String sessionRef;
    private final String userRef;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final GameResult getResult() {
        return this.result;
    }

    /* renamed from: component11, reason: from getter */
    public final GamesErrorCodeModel getGamesErrorCodeModel() {
        return this.gamesErrorCodeModel;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCoordinateX() {
        return this.coordinateX;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCoordinateY() {
        return this.coordinateY;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSessionRef() {
        return this.sessionRef;
    }

    /* renamed from: component5, reason: from getter */
    public final CellType getCellType() {
        return this.cellType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUserRef() {
        return this.userRef;
    }

    /* renamed from: component7, reason: from getter */
    public final String getGameRef() {
        return this.gameRef;
    }

    /* renamed from: component8, reason: from getter */
    public final long getBetAmount() {
        return this.betAmount;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getReturnAmount() {
        return this.returnAmount;
    }

    public final RecordLuckyCellsGameModel copy(String id, int coordinateX, int coordinateY, String sessionRef, CellType cellType, String userRef, String gameRef, long betAmount, Integer returnAmount, GameResult result, GamesErrorCodeModel gamesErrorCodeModel) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sessionRef, "sessionRef");
        Intrinsics.checkNotNullParameter(cellType, "cellType");
        Intrinsics.checkNotNullParameter(userRef, "userRef");
        Intrinsics.checkNotNullParameter(gameRef, "gameRef");
        Intrinsics.checkNotNullParameter(result, "result");
        return new RecordLuckyCellsGameModel(id, coordinateX, coordinateY, sessionRef, cellType, userRef, gameRef, betAmount, returnAmount, result, gamesErrorCodeModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordLuckyCellsGameModel)) {
            return false;
        }
        RecordLuckyCellsGameModel recordLuckyCellsGameModel = (RecordLuckyCellsGameModel) other;
        return Intrinsics.areEqual(this.id, recordLuckyCellsGameModel.id) && this.coordinateX == recordLuckyCellsGameModel.coordinateX && this.coordinateY == recordLuckyCellsGameModel.coordinateY && Intrinsics.areEqual(this.sessionRef, recordLuckyCellsGameModel.sessionRef) && this.cellType == recordLuckyCellsGameModel.cellType && Intrinsics.areEqual(this.userRef, recordLuckyCellsGameModel.userRef) && Intrinsics.areEqual(this.gameRef, recordLuckyCellsGameModel.gameRef) && this.betAmount == recordLuckyCellsGameModel.betAmount && Intrinsics.areEqual(this.returnAmount, recordLuckyCellsGameModel.returnAmount) && this.result == recordLuckyCellsGameModel.result && Intrinsics.areEqual(this.gamesErrorCodeModel, recordLuckyCellsGameModel.gamesErrorCodeModel);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.id.hashCode() * 31) + Integer.hashCode(this.coordinateX)) * 31) + Integer.hashCode(this.coordinateY)) * 31) + this.sessionRef.hashCode()) * 31) + this.cellType.hashCode()) * 31) + this.userRef.hashCode()) * 31) + this.gameRef.hashCode()) * 31) + Long.hashCode(this.betAmount)) * 31;
        Integer num = this.returnAmount;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.result.hashCode()) * 31;
        GamesErrorCodeModel gamesErrorCodeModel = this.gamesErrorCodeModel;
        return hashCode2 + (gamesErrorCodeModel != null ? gamesErrorCodeModel.hashCode() : 0);
    }

    public String toString() {
        return "RecordLuckyCellsGameModel(id=" + this.id + ", coordinateX=" + this.coordinateX + ", coordinateY=" + this.coordinateY + ", sessionRef=" + this.sessionRef + ", cellType=" + this.cellType + ", userRef=" + this.userRef + ", gameRef=" + this.gameRef + ", betAmount=" + this.betAmount + ", returnAmount=" + this.returnAmount + ", result=" + this.result + ", gamesErrorCodeModel=" + this.gamesErrorCodeModel + ")";
    }

    public RecordLuckyCellsGameModel(String id, int i, int i2, String sessionRef, CellType cellType, String userRef, String gameRef, long j, Integer num, GameResult result, GamesErrorCodeModel gamesErrorCodeModel) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sessionRef, "sessionRef");
        Intrinsics.checkNotNullParameter(cellType, "cellType");
        Intrinsics.checkNotNullParameter(userRef, "userRef");
        Intrinsics.checkNotNullParameter(gameRef, "gameRef");
        Intrinsics.checkNotNullParameter(result, "result");
        this.id = id;
        this.coordinateX = i;
        this.coordinateY = i2;
        this.sessionRef = sessionRef;
        this.cellType = cellType;
        this.userRef = userRef;
        this.gameRef = gameRef;
        this.betAmount = j;
        this.returnAmount = num;
        this.result = result;
        this.gamesErrorCodeModel = gamesErrorCodeModel;
    }

    public final String getId() {
        return this.id;
    }

    public final int getCoordinateX() {
        return this.coordinateX;
    }

    public final int getCoordinateY() {
        return this.coordinateY;
    }

    public final String getSessionRef() {
        return this.sessionRef;
    }

    public /* synthetic */ RecordLuckyCellsGameModel(String str, int i, int i2, String str2, CellType cellType, String str3, String str4, long j, Integer num, GameResult gameResult, GamesErrorCodeModel gamesErrorCodeModel, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, str2, (i3 & 16) != 0 ? CellType.NONE : cellType, str3, str4, j, num, gameResult, gamesErrorCodeModel);
    }

    public final CellType getCellType() {
        return this.cellType;
    }

    public final String getUserRef() {
        return this.userRef;
    }

    public final String getGameRef() {
        return this.gameRef;
    }

    public final long getBetAmount() {
        return this.betAmount;
    }

    public final Integer getReturnAmount() {
        return this.returnAmount;
    }

    public final GameResult getResult() {
        return this.result;
    }

    public final GamesErrorCodeModel getGamesErrorCodeModel() {
        return this.gamesErrorCodeModel;
    }

    public final void setGamesErrorCodeModel(GamesErrorCodeModel gamesErrorCodeModel) {
        this.gamesErrorCodeModel = gamesErrorCodeModel;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StartLuckyCellsGameModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lorg/betup/games/luckyCells/model/rest/RecordLuckyCellsGameModel$CellType;", "", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;II)V", "NONE", "TRAP", "PRIZE", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CellType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CellType[] $VALUES;
        public static final CellType NONE = new CellType("NONE", 0, 0);
        public static final CellType TRAP = new CellType("TRAP", 1, 1);
        public static final CellType PRIZE = new CellType("PRIZE", 2, 2);

        private static final /* synthetic */ CellType[] $values() {
            return new CellType[]{NONE, TRAP, PRIZE};
        }

        public static EnumEntries<CellType> getEntries() {
            return $ENTRIES;
        }

        private CellType(String str, int i, int i2) {
        }

        static {
            CellType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static CellType valueOf(String str) {
            return (CellType) Enum.valueOf(CellType.class, str);
        }

        public static CellType[] values() {
            return (CellType[]) $VALUES.clone();
        }
    }
}
