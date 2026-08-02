package org.betup.games.flashbet.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetGameScoreUpdateDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lorg/betup/games/flashbet/model/FlashBetGameScoreUpdateDto;", "", "minute", "", "scoreHome", "scoreAway", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(III)V", "getMinute", "()I", "getScoreHome", "getScoreAway", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FlashBetGameScoreUpdateDto {
    public static final int $stable = 0;

    @SerializedName("minute")
    private final int minute;

    @SerializedName("scoreAway")
    private final int scoreAway;

    @SerializedName("scoreHome")
    private final int scoreHome;

    public static /* synthetic */ FlashBetGameScoreUpdateDto copy$default(FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = flashBetGameScoreUpdateDto.minute;
        }
        if ((i4 & 2) != 0) {
            i2 = flashBetGameScoreUpdateDto.scoreHome;
        }
        if ((i4 & 4) != 0) {
            i3 = flashBetGameScoreUpdateDto.scoreAway;
        }
        return flashBetGameScoreUpdateDto.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMinute() {
        return this.minute;
    }

    /* renamed from: component2, reason: from getter */
    public final int getScoreHome() {
        return this.scoreHome;
    }

    /* renamed from: component3, reason: from getter */
    public final int getScoreAway() {
        return this.scoreAway;
    }

    public final FlashBetGameScoreUpdateDto copy(int minute, int scoreHome, int scoreAway) {
        return new FlashBetGameScoreUpdateDto(minute, scoreHome, scoreAway);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashBetGameScoreUpdateDto)) {
            return false;
        }
        FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto = (FlashBetGameScoreUpdateDto) other;
        return this.minute == flashBetGameScoreUpdateDto.minute && this.scoreHome == flashBetGameScoreUpdateDto.scoreHome && this.scoreAway == flashBetGameScoreUpdateDto.scoreAway;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.minute) * 31) + Integer.hashCode(this.scoreHome)) * 31) + Integer.hashCode(this.scoreAway);
    }

    public String toString() {
        return "FlashBetGameScoreUpdateDto(minute=" + this.minute + ", scoreHome=" + this.scoreHome + ", scoreAway=" + this.scoreAway + ")";
    }

    public FlashBetGameScoreUpdateDto(int i, int i2, int i3) {
        this.minute = i;
        this.scoreHome = i2;
        this.scoreAway = i3;
    }

    public final int getMinute() {
        return this.minute;
    }

    public final int getScoreHome() {
        return this.scoreHome;
    }

    public final int getScoreAway() {
        return this.scoreAway;
    }
}
