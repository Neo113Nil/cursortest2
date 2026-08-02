package org.betup.ui.fragment.flashbet.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetLeagueCardItem.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003Jk\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000bHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lorg/betup/ui/fragment/flashbet/compose/FlashBetLeagueCardItem;", "", "id", "", "title", "season", "photoUrl", "leagueLogoUrl", "entryFee", "", "playedMatches", "", "totalMatches", "onClick", "Lkotlin/Function0;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIILkotlin/jvm/functions/Function0;)V", "getId", "()Ljava/lang/String;", "getTitle", "getSeason", "getPhotoUrl", "getLeagueLogoUrl", "getEntryFee", "()J", "getPlayedMatches", "()I", "getTotalMatches", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FlashBetLeagueCardItem {
    public static final int $stable = 0;
    private final long entryFee;
    private final String id;
    private final String leagueLogoUrl;
    private final Function0<Unit> onClick;
    private final String photoUrl;
    private final int playedMatches;
    private final String season;
    private final String title;
    private final int totalMatches;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSeason() {
        return this.season;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLeagueLogoUrl() {
        return this.leagueLogoUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final long getEntryFee() {
        return this.entryFee;
    }

    /* renamed from: component7, reason: from getter */
    public final int getPlayedMatches() {
        return this.playedMatches;
    }

    /* renamed from: component8, reason: from getter */
    public final int getTotalMatches() {
        return this.totalMatches;
    }

    public final Function0<Unit> component9() {
        return this.onClick;
    }

    public final FlashBetLeagueCardItem copy(String id, String title, String season, String photoUrl, String leagueLogoUrl, long entryFee, int playedMatches, int totalMatches, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(season, "season");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new FlashBetLeagueCardItem(id, title, season, photoUrl, leagueLogoUrl, entryFee, playedMatches, totalMatches, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashBetLeagueCardItem)) {
            return false;
        }
        FlashBetLeagueCardItem flashBetLeagueCardItem = (FlashBetLeagueCardItem) other;
        return Intrinsics.areEqual(this.id, flashBetLeagueCardItem.id) && Intrinsics.areEqual(this.title, flashBetLeagueCardItem.title) && Intrinsics.areEqual(this.season, flashBetLeagueCardItem.season) && Intrinsics.areEqual(this.photoUrl, flashBetLeagueCardItem.photoUrl) && Intrinsics.areEqual(this.leagueLogoUrl, flashBetLeagueCardItem.leagueLogoUrl) && this.entryFee == flashBetLeagueCardItem.entryFee && this.playedMatches == flashBetLeagueCardItem.playedMatches && this.totalMatches == flashBetLeagueCardItem.totalMatches && Intrinsics.areEqual(this.onClick, flashBetLeagueCardItem.onClick);
    }

    public int hashCode() {
        int hashCode = ((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.season.hashCode()) * 31) + this.photoUrl.hashCode()) * 31;
        String str = this.leagueLogoUrl;
        return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.entryFee)) * 31) + Integer.hashCode(this.playedMatches)) * 31) + Integer.hashCode(this.totalMatches)) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "FlashBetLeagueCardItem(id=" + this.id + ", title=" + this.title + ", season=" + this.season + ", photoUrl=" + this.photoUrl + ", leagueLogoUrl=" + this.leagueLogoUrl + ", entryFee=" + this.entryFee + ", playedMatches=" + this.playedMatches + ", totalMatches=" + this.totalMatches + ", onClick=" + this.onClick + ")";
    }

    public FlashBetLeagueCardItem(String id, String title, String season, String photoUrl, String str, long j, int i, int i2, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(season, "season");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.id = id;
        this.title = title;
        this.season = season;
        this.photoUrl = photoUrl;
        this.leagueLogoUrl = str;
        this.entryFee = j;
        this.playedMatches = i;
        this.totalMatches = i2;
        this.onClick = onClick;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSeason() {
        return this.season;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final String getLeagueLogoUrl() {
        return this.leagueLogoUrl;
    }

    public final long getEntryFee() {
        return this.entryFee;
    }

    public final int getPlayedMatches() {
        return this.playedMatches;
    }

    public final int getTotalMatches() {
        return this.totalMatches;
    }

    public /* synthetic */ FlashBetLeagueCardItem(String str, String str2, String str3, String str4, String str5, long j, int i, int i2, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, j, i, i2, (i3 & 256) != 0 ? new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetLeagueCardItem$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function0);
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }
}
