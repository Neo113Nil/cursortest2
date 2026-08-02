package org.betup.games.doubles.model.rest;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SessionHistoryDoubleGame.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lorg/betup/games/doubles/model/rest/SessionHistoryDoubleGame;", "", "id", "", "betType", "Lorg/betup/games/doubles/model/rest/DoubleBetType;", "ordinal", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Lorg/betup/games/doubles/model/rest/DoubleBetType;I)V", "getId", "()Ljava/lang/String;", "getBetType", "()Lorg/betup/games/doubles/model/rest/DoubleBetType;", "getOrdinal", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SessionHistoryDoubleGame {
    public static final int $stable = 0;
    private final DoubleBetType betType;
    private final String id;
    private final int ordinal;

    public static /* synthetic */ SessionHistoryDoubleGame copy$default(SessionHistoryDoubleGame sessionHistoryDoubleGame, String str, DoubleBetType doubleBetType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sessionHistoryDoubleGame.id;
        }
        if ((i2 & 2) != 0) {
            doubleBetType = sessionHistoryDoubleGame.betType;
        }
        if ((i2 & 4) != 0) {
            i = sessionHistoryDoubleGame.ordinal;
        }
        return sessionHistoryDoubleGame.copy(str, doubleBetType, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final DoubleBetType getBetType() {
        return this.betType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getOrdinal() {
        return this.ordinal;
    }

    public final SessionHistoryDoubleGame copy(String id, DoubleBetType betType, int ordinal) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(betType, "betType");
        return new SessionHistoryDoubleGame(id, betType, ordinal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionHistoryDoubleGame)) {
            return false;
        }
        SessionHistoryDoubleGame sessionHistoryDoubleGame = (SessionHistoryDoubleGame) other;
        return Intrinsics.areEqual(this.id, sessionHistoryDoubleGame.id) && this.betType == sessionHistoryDoubleGame.betType && this.ordinal == sessionHistoryDoubleGame.ordinal;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.betType.hashCode()) * 31) + Integer.hashCode(this.ordinal);
    }

    public String toString() {
        return "SessionHistoryDoubleGame(id=" + this.id + ", betType=" + this.betType + ", ordinal=" + this.ordinal + ")";
    }

    public SessionHistoryDoubleGame(String id, DoubleBetType betType, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(betType, "betType");
        this.id = id;
        this.betType = betType;
        this.ordinal = i;
    }

    public final DoubleBetType getBetType() {
        return this.betType;
    }

    public final String getId() {
        return this.id;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }
}
