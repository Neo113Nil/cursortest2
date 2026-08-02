package org.betup.games.flashbet.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetGameMatchDetailsDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, d2 = {"Lorg/betup/games/flashbet/model/FlashBetGameMatchDetailsDto;", "", "id", "", "leagueName", "stadiumName", "startDate", "finalScoreHome", "", "finalScoreAway", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getId", "()Ljava/lang/String;", "getLeagueName", "getStadiumName", "getStartDate", "getFinalScoreHome", "()I", "getFinalScoreAway", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FlashBetGameMatchDetailsDto {
    public static final int $stable = 0;

    @SerializedName("finalScoreAway")
    private final int finalScoreAway;

    @SerializedName("finalScoreHome")
    private final int finalScoreHome;

    @SerializedName("id")
    private final String id;

    @SerializedName("leagueName")
    private final String leagueName;

    @SerializedName("stadiumName")
    private final String stadiumName;

    @SerializedName("startDate")
    private final String startDate;

    public static /* synthetic */ FlashBetGameMatchDetailsDto copy$default(FlashBetGameMatchDetailsDto flashBetGameMatchDetailsDto, String str, String str2, String str3, String str4, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = flashBetGameMatchDetailsDto.id;
        }
        if ((i3 & 2) != 0) {
            str2 = flashBetGameMatchDetailsDto.leagueName;
        }
        String str5 = str2;
        if ((i3 & 4) != 0) {
            str3 = flashBetGameMatchDetailsDto.stadiumName;
        }
        String str6 = str3;
        if ((i3 & 8) != 0) {
            str4 = flashBetGameMatchDetailsDto.startDate;
        }
        String str7 = str4;
        if ((i3 & 16) != 0) {
            i = flashBetGameMatchDetailsDto.finalScoreHome;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = flashBetGameMatchDetailsDto.finalScoreAway;
        }
        return flashBetGameMatchDetailsDto.copy(str, str5, str6, str7, i4, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLeagueName() {
        return this.leagueName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStadiumName() {
        return this.stadiumName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* renamed from: component5, reason: from getter */
    public final int getFinalScoreHome() {
        return this.finalScoreHome;
    }

    /* renamed from: component6, reason: from getter */
    public final int getFinalScoreAway() {
        return this.finalScoreAway;
    }

    public final FlashBetGameMatchDetailsDto copy(String id, String leagueName, String stadiumName, String startDate, int finalScoreHome, int finalScoreAway) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        return new FlashBetGameMatchDetailsDto(id, leagueName, stadiumName, startDate, finalScoreHome, finalScoreAway);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashBetGameMatchDetailsDto)) {
            return false;
        }
        FlashBetGameMatchDetailsDto flashBetGameMatchDetailsDto = (FlashBetGameMatchDetailsDto) other;
        return Intrinsics.areEqual(this.id, flashBetGameMatchDetailsDto.id) && Intrinsics.areEqual(this.leagueName, flashBetGameMatchDetailsDto.leagueName) && Intrinsics.areEqual(this.stadiumName, flashBetGameMatchDetailsDto.stadiumName) && Intrinsics.areEqual(this.startDate, flashBetGameMatchDetailsDto.startDate) && this.finalScoreHome == flashBetGameMatchDetailsDto.finalScoreHome && this.finalScoreAway == flashBetGameMatchDetailsDto.finalScoreAway;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.leagueName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.stadiumName;
        return ((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.startDate.hashCode()) * 31) + Integer.hashCode(this.finalScoreHome)) * 31) + Integer.hashCode(this.finalScoreAway);
    }

    public String toString() {
        return "FlashBetGameMatchDetailsDto(id=" + this.id + ", leagueName=" + this.leagueName + ", stadiumName=" + this.stadiumName + ", startDate=" + this.startDate + ", finalScoreHome=" + this.finalScoreHome + ", finalScoreAway=" + this.finalScoreAway + ")";
    }

    public FlashBetGameMatchDetailsDto(String id, String str, String str2, String startDate, int i, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.id = id;
        this.leagueName = str;
        this.stadiumName = str2;
        this.startDate = startDate;
        this.finalScoreHome = i;
        this.finalScoreAway = i2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLeagueName() {
        return this.leagueName;
    }

    public final String getStadiumName() {
        return this.stadiumName;
    }

    public /* synthetic */ FlashBetGameMatchDetailsDto(String str, String str2, String str3, String str4, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? null : str2, (i3 & 4) == 0 ? str3 : null, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? 0 : i, (i3 & 32) == 0 ? i2 : 0);
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final int getFinalScoreHome() {
        return this.finalScoreHome;
    }

    public final int getFinalScoreAway() {
        return this.finalScoreAway;
    }
}
