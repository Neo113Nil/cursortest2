package org.betup.model.remote.entity.competitions;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewCompetitionsResponseModel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0097\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00102\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001eR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018¨\u00067"}, d2 = {"Lorg/betup/model/remote/entity/competitions/NewCompetitionModel;", "", "id", "", "name", "", "sport", "Lorg/betup/model/remote/entity/competitions/NewCompetitionSportModel;", "enterFee", "prizePool", "jackPot", "isParticipant", "", "matches", "", "closeDate", "date", "betGroupIds", "backgroundUrl", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Lorg/betup/model/remote/entity/competitions/NewCompetitionSportModel;JJJZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getSport", "()Lorg/betup/model/remote/entity/competitions/NewCompetitionSportModel;", "getEnterFee", "getPrizePool", "getJackPot", "()Z", "getMatches", "()Ljava/util/List;", "getCloseDate", "getDate", "getBetGroupIds", "getBackgroundUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewCompetitionModel {
    public static final int $stable = 8;

    @SerializedName("backgroundUrl")
    private final String backgroundUrl;

    @SerializedName("betGroupIds")
    private final List<Object> betGroupIds;

    @SerializedName("close_date")
    private final String closeDate;

    @SerializedName("date")
    private final String date;

    @SerializedName("enter_fee")
    private final long enterFee;

    @SerializedName("id")
    private final long id;

    @SerializedName("isParticipant")
    private final boolean isParticipant;

    @SerializedName("jack_pot")
    private final long jackPot;

    @SerializedName("matches")
    private final List<Object> matches;

    @SerializedName("name")
    private final String name;

    @SerializedName("prize_pool")
    private final long prizePool;

    @SerializedName("sport")
    private final NewCompetitionSportModel sport;

    public NewCompetitionModel() {
        this(0L, null, null, 0L, 0L, 0L, false, null, null, null, null, null, 4095, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public final List<Object> component11() {
        return this.betGroupIds;
    }

    /* renamed from: component12, reason: from getter */
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final NewCompetitionSportModel getSport() {
        return this.sport;
    }

    /* renamed from: component4, reason: from getter */
    public final long getEnterFee() {
        return this.enterFee;
    }

    /* renamed from: component5, reason: from getter */
    public final long getPrizePool() {
        return this.prizePool;
    }

    /* renamed from: component6, reason: from getter */
    public final long getJackPot() {
        return this.jackPot;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsParticipant() {
        return this.isParticipant;
    }

    public final List<Object> component8() {
        return this.matches;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCloseDate() {
        return this.closeDate;
    }

    public final NewCompetitionModel copy(long id, String name, NewCompetitionSportModel sport, long enterFee, long prizePool, long jackPot, boolean isParticipant, List<? extends Object> matches, String closeDate, String date, List<? extends Object> betGroupIds, String backgroundUrl) {
        Intrinsics.checkNotNullParameter(matches, "matches");
        Intrinsics.checkNotNullParameter(betGroupIds, "betGroupIds");
        return new NewCompetitionModel(id, name, sport, enterFee, prizePool, jackPot, isParticipant, matches, closeDate, date, betGroupIds, backgroundUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewCompetitionModel)) {
            return false;
        }
        NewCompetitionModel newCompetitionModel = (NewCompetitionModel) other;
        return this.id == newCompetitionModel.id && Intrinsics.areEqual(this.name, newCompetitionModel.name) && Intrinsics.areEqual(this.sport, newCompetitionModel.sport) && this.enterFee == newCompetitionModel.enterFee && this.prizePool == newCompetitionModel.prizePool && this.jackPot == newCompetitionModel.jackPot && this.isParticipant == newCompetitionModel.isParticipant && Intrinsics.areEqual(this.matches, newCompetitionModel.matches) && Intrinsics.areEqual(this.closeDate, newCompetitionModel.closeDate) && Intrinsics.areEqual(this.date, newCompetitionModel.date) && Intrinsics.areEqual(this.betGroupIds, newCompetitionModel.betGroupIds) && Intrinsics.areEqual(this.backgroundUrl, newCompetitionModel.backgroundUrl);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        NewCompetitionSportModel newCompetitionSportModel = this.sport;
        int hashCode3 = (((((((((((hashCode2 + (newCompetitionSportModel == null ? 0 : newCompetitionSportModel.hashCode())) * 31) + Long.hashCode(this.enterFee)) * 31) + Long.hashCode(this.prizePool)) * 31) + Long.hashCode(this.jackPot)) * 31) + Boolean.hashCode(this.isParticipant)) * 31) + this.matches.hashCode()) * 31;
        String str2 = this.closeDate;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.date;
        int hashCode5 = (((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.betGroupIds.hashCode()) * 31;
        String str4 = this.backgroundUrl;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "NewCompetitionModel(id=" + this.id + ", name=" + this.name + ", sport=" + this.sport + ", enterFee=" + this.enterFee + ", prizePool=" + this.prizePool + ", jackPot=" + this.jackPot + ", isParticipant=" + this.isParticipant + ", matches=" + this.matches + ", closeDate=" + this.closeDate + ", date=" + this.date + ", betGroupIds=" + this.betGroupIds + ", backgroundUrl=" + this.backgroundUrl + ")";
    }

    public NewCompetitionModel(long j, String str, NewCompetitionSportModel newCompetitionSportModel, long j2, long j3, long j4, boolean z, List<? extends Object> matches, String str2, String str3, List<? extends Object> betGroupIds, String str4) {
        Intrinsics.checkNotNullParameter(matches, "matches");
        Intrinsics.checkNotNullParameter(betGroupIds, "betGroupIds");
        this.id = j;
        this.name = str;
        this.sport = newCompetitionSportModel;
        this.enterFee = j2;
        this.prizePool = j3;
        this.jackPot = j4;
        this.isParticipant = z;
        this.matches = matches;
        this.closeDate = str2;
        this.date = str3;
        this.betGroupIds = betGroupIds;
        this.backgroundUrl = str4;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final NewCompetitionSportModel getSport() {
        return this.sport;
    }

    public final long getEnterFee() {
        return this.enterFee;
    }

    public final long getPrizePool() {
        return this.prizePool;
    }

    public final long getJackPot() {
        return this.jackPot;
    }

    public final boolean isParticipant() {
        return this.isParticipant;
    }

    public final List<Object> getMatches() {
        return this.matches;
    }

    public /* synthetic */ NewCompetitionModel(long j, String str, NewCompetitionSportModel newCompetitionSportModel, long j2, long j3, long j4, boolean z, List list, String str2, String str3, List list2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : newCompetitionSportModel, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? 0L : j3, (i & 32) == 0 ? j4 : 0L, (i & 64) != 0 ? false : z, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? CollectionsKt.emptyList() : list2, (i & 2048) != 0 ? null : str4);
    }

    public final String getCloseDate() {
        return this.closeDate;
    }

    public final String getDate() {
        return this.date;
    }

    public final List<Object> getBetGroupIds() {
        return this.betGroupIds;
    }

    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }
}
