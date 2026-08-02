package org.betup.games.flashbet.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetGameMatchTeamDetailsDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lorg/betup/games/flashbet/model/FlashBetGameMatchTeamDetailsDto;", "", "homeTeam", "", "awayTeam", "homeTeamLogoUrl", "awayTeamLogoUrl", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHomeTeam", "()Ljava/lang/String;", "getAwayTeam", "getHomeTeamLogoUrl", "getAwayTeamLogoUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FlashBetGameMatchTeamDetailsDto {
    public static final int $stable = 0;

    @SerializedName("awayTeam")
    private final String awayTeam;

    @SerializedName("awayTeamLogoUrl")
    private final String awayTeamLogoUrl;

    @SerializedName("homeTeam")
    private final String homeTeam;

    @SerializedName("homeTeamLogoUrl")
    private final String homeTeamLogoUrl;

    public static /* synthetic */ FlashBetGameMatchTeamDetailsDto copy$default(FlashBetGameMatchTeamDetailsDto flashBetGameMatchTeamDetailsDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flashBetGameMatchTeamDetailsDto.homeTeam;
        }
        if ((i & 2) != 0) {
            str2 = flashBetGameMatchTeamDetailsDto.awayTeam;
        }
        if ((i & 4) != 0) {
            str3 = flashBetGameMatchTeamDetailsDto.homeTeamLogoUrl;
        }
        if ((i & 8) != 0) {
            str4 = flashBetGameMatchTeamDetailsDto.awayTeamLogoUrl;
        }
        return flashBetGameMatchTeamDetailsDto.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHomeTeam() {
        return this.homeTeam;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAwayTeam() {
        return this.awayTeam;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHomeTeamLogoUrl() {
        return this.homeTeamLogoUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAwayTeamLogoUrl() {
        return this.awayTeamLogoUrl;
    }

    public final FlashBetGameMatchTeamDetailsDto copy(String homeTeam, String awayTeam, String homeTeamLogoUrl, String awayTeamLogoUrl) {
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(homeTeamLogoUrl, "homeTeamLogoUrl");
        Intrinsics.checkNotNullParameter(awayTeamLogoUrl, "awayTeamLogoUrl");
        return new FlashBetGameMatchTeamDetailsDto(homeTeam, awayTeam, homeTeamLogoUrl, awayTeamLogoUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashBetGameMatchTeamDetailsDto)) {
            return false;
        }
        FlashBetGameMatchTeamDetailsDto flashBetGameMatchTeamDetailsDto = (FlashBetGameMatchTeamDetailsDto) other;
        return Intrinsics.areEqual(this.homeTeam, flashBetGameMatchTeamDetailsDto.homeTeam) && Intrinsics.areEqual(this.awayTeam, flashBetGameMatchTeamDetailsDto.awayTeam) && Intrinsics.areEqual(this.homeTeamLogoUrl, flashBetGameMatchTeamDetailsDto.homeTeamLogoUrl) && Intrinsics.areEqual(this.awayTeamLogoUrl, flashBetGameMatchTeamDetailsDto.awayTeamLogoUrl);
    }

    public int hashCode() {
        return (((((this.homeTeam.hashCode() * 31) + this.awayTeam.hashCode()) * 31) + this.homeTeamLogoUrl.hashCode()) * 31) + this.awayTeamLogoUrl.hashCode();
    }

    public String toString() {
        return "FlashBetGameMatchTeamDetailsDto(homeTeam=" + this.homeTeam + ", awayTeam=" + this.awayTeam + ", homeTeamLogoUrl=" + this.homeTeamLogoUrl + ", awayTeamLogoUrl=" + this.awayTeamLogoUrl + ")";
    }

    public FlashBetGameMatchTeamDetailsDto(String homeTeam, String awayTeam, String homeTeamLogoUrl, String awayTeamLogoUrl) {
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(homeTeamLogoUrl, "homeTeamLogoUrl");
        Intrinsics.checkNotNullParameter(awayTeamLogoUrl, "awayTeamLogoUrl");
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamLogoUrl = homeTeamLogoUrl;
        this.awayTeamLogoUrl = awayTeamLogoUrl;
    }

    public /* synthetic */ FlashBetGameMatchTeamDetailsDto(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public final String getHomeTeam() {
        return this.homeTeam;
    }

    public final String getAwayTeam() {
        return this.awayTeam;
    }

    public final String getHomeTeamLogoUrl() {
        return this.homeTeamLogoUrl;
    }

    public final String getAwayTeamLogoUrl() {
        return this.awayTeamLogoUrl;
    }
}
