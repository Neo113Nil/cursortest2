package org.betup.ui.fragment.competitions.compose.items;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewCompetitionUiItem.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0081\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010-\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u00062"}, d2 = {"Lorg/betup/ui/fragment/competitions/compose/items/NewCompetitionUiItem;", "", "id", "", "uniqueLocalId", "", "name", "sport", "Lorg/betup/ui/fragment/competitions/compose/items/NewCompetitionSportUiItem;", "enterFee", "prizePool", "jackPot", "isParticipant", "", "closeDate", "date", "backgroundUrl", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;Lorg/betup/ui/fragment/competitions/compose/items/NewCompetitionSportUiItem;JJJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getUniqueLocalId", "()Ljava/lang/String;", "getName", "getSport", "()Lorg/betup/ui/fragment/competitions/compose/items/NewCompetitionSportUiItem;", "getEnterFee", "getPrizePool", "getJackPot", "()Z", "getCloseDate", "getDate", "getBackgroundUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NewCompetitionUiItem {
    public static final int $stable = 0;
    private final String backgroundUrl;
    private final String closeDate;
    private final String date;
    private final long enterFee;
    private final long id;
    private final boolean isParticipant;
    private final long jackPot;
    private final String name;
    private final long prizePool;
    private final NewCompetitionSportUiItem sport;
    private final String uniqueLocalId;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component11, reason: from getter */
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUniqueLocalId() {
        return this.uniqueLocalId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final NewCompetitionSportUiItem getSport() {
        return this.sport;
    }

    /* renamed from: component5, reason: from getter */
    public final long getEnterFee() {
        return this.enterFee;
    }

    /* renamed from: component6, reason: from getter */
    public final long getPrizePool() {
        return this.prizePool;
    }

    /* renamed from: component7, reason: from getter */
    public final long getJackPot() {
        return this.jackPot;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsParticipant() {
        return this.isParticipant;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCloseDate() {
        return this.closeDate;
    }

    public final NewCompetitionUiItem copy(long id, String uniqueLocalId, String name, NewCompetitionSportUiItem sport, long enterFee, long prizePool, long jackPot, boolean isParticipant, String closeDate, String date, String backgroundUrl) {
        Intrinsics.checkNotNullParameter(uniqueLocalId, "uniqueLocalId");
        return new NewCompetitionUiItem(id, uniqueLocalId, name, sport, enterFee, prizePool, jackPot, isParticipant, closeDate, date, backgroundUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewCompetitionUiItem)) {
            return false;
        }
        NewCompetitionUiItem newCompetitionUiItem = (NewCompetitionUiItem) other;
        return this.id == newCompetitionUiItem.id && Intrinsics.areEqual(this.uniqueLocalId, newCompetitionUiItem.uniqueLocalId) && Intrinsics.areEqual(this.name, newCompetitionUiItem.name) && Intrinsics.areEqual(this.sport, newCompetitionUiItem.sport) && this.enterFee == newCompetitionUiItem.enterFee && this.prizePool == newCompetitionUiItem.prizePool && this.jackPot == newCompetitionUiItem.jackPot && this.isParticipant == newCompetitionUiItem.isParticipant && Intrinsics.areEqual(this.closeDate, newCompetitionUiItem.closeDate) && Intrinsics.areEqual(this.date, newCompetitionUiItem.date) && Intrinsics.areEqual(this.backgroundUrl, newCompetitionUiItem.backgroundUrl);
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.id) * 31) + this.uniqueLocalId.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        NewCompetitionSportUiItem newCompetitionSportUiItem = this.sport;
        int hashCode3 = (((((((((hashCode2 + (newCompetitionSportUiItem == null ? 0 : newCompetitionSportUiItem.hashCode())) * 31) + Long.hashCode(this.enterFee)) * 31) + Long.hashCode(this.prizePool)) * 31) + Long.hashCode(this.jackPot)) * 31) + Boolean.hashCode(this.isParticipant)) * 31;
        String str2 = this.closeDate;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.date;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backgroundUrl;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "NewCompetitionUiItem(id=" + this.id + ", uniqueLocalId=" + this.uniqueLocalId + ", name=" + this.name + ", sport=" + this.sport + ", enterFee=" + this.enterFee + ", prizePool=" + this.prizePool + ", jackPot=" + this.jackPot + ", isParticipant=" + this.isParticipant + ", closeDate=" + this.closeDate + ", date=" + this.date + ", backgroundUrl=" + this.backgroundUrl + ")";
    }

    public NewCompetitionUiItem(long j, String uniqueLocalId, String str, NewCompetitionSportUiItem newCompetitionSportUiItem, long j2, long j3, long j4, boolean z, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(uniqueLocalId, "uniqueLocalId");
        this.id = j;
        this.uniqueLocalId = uniqueLocalId;
        this.name = str;
        this.sport = newCompetitionSportUiItem;
        this.enterFee = j2;
        this.prizePool = j3;
        this.jackPot = j4;
        this.isParticipant = z;
        this.closeDate = str2;
        this.date = str3;
        this.backgroundUrl = str4;
    }

    public final long getId() {
        return this.id;
    }

    public final String getUniqueLocalId() {
        return this.uniqueLocalId;
    }

    public final String getName() {
        return this.name;
    }

    public final NewCompetitionSportUiItem getSport() {
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

    public final String getCloseDate() {
        return this.closeDate;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }
}
