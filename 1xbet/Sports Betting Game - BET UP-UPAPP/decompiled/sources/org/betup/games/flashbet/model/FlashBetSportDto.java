package org.betup.games.flashbet.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetSportDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, d2 = {"Lorg/betup/games/flashbet/model/FlashBetSportDto;", "", "id", "", "name", "", "photoUrl", "playedMatches", "", "totalmatches", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;II)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getPhotoUrl", "getPlayedMatches", "()I", "getTotalmatches", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FlashBetSportDto {
    public static final int $stable = 0;

    @SerializedName("id")
    private final long id;

    @SerializedName("name")
    private final String name;

    @SerializedName("photoUrl")
    private final String photoUrl;

    @SerializedName("playedMatches")
    private final int playedMatches;

    @SerializedName("totalmatches")
    private final int totalmatches;

    public static /* synthetic */ FlashBetSportDto copy$default(FlashBetSportDto flashBetSportDto, long j, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = flashBetSportDto.id;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            str = flashBetSportDto.name;
        }
        String str3 = str;
        if ((i3 & 4) != 0) {
            str2 = flashBetSportDto.photoUrl;
        }
        String str4 = str2;
        if ((i3 & 8) != 0) {
            i = flashBetSportDto.playedMatches;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = flashBetSportDto.totalmatches;
        }
        return flashBetSportDto.copy(j2, str3, str4, i4, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPlayedMatches() {
        return this.playedMatches;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTotalmatches() {
        return this.totalmatches;
    }

    public final FlashBetSportDto copy(long id, String name, String photoUrl, int playedMatches, int totalmatches) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        return new FlashBetSportDto(id, name, photoUrl, playedMatches, totalmatches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashBetSportDto)) {
            return false;
        }
        FlashBetSportDto flashBetSportDto = (FlashBetSportDto) other;
        return this.id == flashBetSportDto.id && Intrinsics.areEqual(this.name, flashBetSportDto.name) && Intrinsics.areEqual(this.photoUrl, flashBetSportDto.photoUrl) && this.playedMatches == flashBetSportDto.playedMatches && this.totalmatches == flashBetSportDto.totalmatches;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.photoUrl.hashCode()) * 31) + Integer.hashCode(this.playedMatches)) * 31) + Integer.hashCode(this.totalmatches);
    }

    public String toString() {
        return "FlashBetSportDto(id=" + this.id + ", name=" + this.name + ", photoUrl=" + this.photoUrl + ", playedMatches=" + this.playedMatches + ", totalmatches=" + this.totalmatches + ")";
    }

    public FlashBetSportDto(long j, String name, String photoUrl, int i, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        this.id = j;
        this.name = name;
        this.photoUrl = photoUrl;
        this.playedMatches = i;
        this.totalmatches = i2;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final int getPlayedMatches() {
        return this.playedMatches;
    }

    public final int getTotalmatches() {
        return this.totalmatches;
    }
}
