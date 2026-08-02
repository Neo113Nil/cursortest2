package org.betup.games.doubles.model.rest;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SessionDoubleGame.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lorg/betup/games/doubles/model/rest/SessionDoubleGame;", "", "id", "", "returnAmount", "", "betType", "Lorg/betup/games/doubles/model/rest/DoubleBetType;", "ordinal", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;JLorg/betup/games/doubles/model/rest/DoubleBetType;I)V", "getId", "()Ljava/lang/String;", "getReturnAmount", "()J", "getBetType", "()Lorg/betup/games/doubles/model/rest/DoubleBetType;", "getOrdinal", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SessionDoubleGame {
    public static final int $stable = 0;
    private final DoubleBetType betType;
    private final String id;
    private final int ordinal;
    private final long returnAmount;

    public static /* synthetic */ SessionDoubleGame copy$default(SessionDoubleGame sessionDoubleGame, String str, long j, DoubleBetType doubleBetType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sessionDoubleGame.id;
        }
        if ((i2 & 2) != 0) {
            j = sessionDoubleGame.returnAmount;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            doubleBetType = sessionDoubleGame.betType;
        }
        DoubleBetType doubleBetType2 = doubleBetType;
        if ((i2 & 8) != 0) {
            i = sessionDoubleGame.ordinal;
        }
        return sessionDoubleGame.copy(str, j2, doubleBetType2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getReturnAmount() {
        return this.returnAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final DoubleBetType getBetType() {
        return this.betType;
    }

    /* renamed from: component4, reason: from getter */
    public final int getOrdinal() {
        return this.ordinal;
    }

    public final SessionDoubleGame copy(String id, long returnAmount, DoubleBetType betType, int ordinal) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(betType, "betType");
        return new SessionDoubleGame(id, returnAmount, betType, ordinal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionDoubleGame)) {
            return false;
        }
        SessionDoubleGame sessionDoubleGame = (SessionDoubleGame) other;
        return Intrinsics.areEqual(this.id, sessionDoubleGame.id) && this.returnAmount == sessionDoubleGame.returnAmount && this.betType == sessionDoubleGame.betType && this.ordinal == sessionDoubleGame.ordinal;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + Long.hashCode(this.returnAmount)) * 31) + this.betType.hashCode()) * 31) + Integer.hashCode(this.ordinal);
    }

    public String toString() {
        return "SessionDoubleGame(id=" + this.id + ", returnAmount=" + this.returnAmount + ", betType=" + this.betType + ", ordinal=" + this.ordinal + ")";
    }

    public SessionDoubleGame(String id, long j, DoubleBetType betType, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(betType, "betType");
        this.id = id;
        this.returnAmount = j;
        this.betType = betType;
        this.ordinal = i;
    }

    public final String getId() {
        return this.id;
    }

    public final long getReturnAmount() {
        return this.returnAmount;
    }

    public final DoubleBetType getBetType() {
        return this.betType;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }
}
