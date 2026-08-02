package org.betup.ui.fragment.matches.details.compose.tabs.betgorups;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.matches.VarietyBetRestrictionInfoModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupBetsModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchBetGroupsTabContent.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\t\u00100\u001a\u00020\u000fHÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u00105\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0094\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u000f2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\rHÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\"R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006<"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/betgorups/BetGroupsTabs;", "", "title", "", "tabs", "", "Lorg/betup/ui/fragment/matches/details/compose/tabs/betgorups/BetGroupsRows;", "bets", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyGroupBetsModel;", "onClick", "Lkotlin/Function0;", "", "id", "", "isSelected", "", "scoreHome", "scoreAway", "resultRaw", "paramTId", "", "varietyBetRestriction", "Lorg/betup/model/remote/entity/matches/VarietyBetRestrictionInfoModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;IZIILjava/lang/String;Ljava/lang/Long;Lorg/betup/model/remote/entity/matches/VarietyBetRestrictionInfoModel;)V", "getTitle", "()Ljava/lang/String;", "getTabs", "()Ljava/util/List;", "getBets", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getId", "()I", "()Z", "getScoreHome", "getScoreAway", "getResultRaw", "getParamTId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVarietyBetRestriction", "()Lorg/betup/model/remote/entity/matches/VarietyBetRestrictionInfoModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;IZIILjava/lang/String;Ljava/lang/Long;Lorg/betup/model/remote/entity/matches/VarietyBetRestrictionInfoModel;)Lorg/betup/ui/fragment/matches/details/compose/tabs/betgorups/BetGroupsTabs;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BetGroupsTabs {
    public static final int $stable = 8;
    private final List<MatchVarietyGroupBetsModel> bets;
    private final int id;
    private final boolean isSelected;
    private final Function0<Unit> onClick;
    private final Long paramTId;
    private final String resultRaw;
    private final int scoreAway;
    private final int scoreHome;
    private final List<BetGroupsRows> tabs;
    private final String title;
    private final VarietyBetRestrictionInfoModel varietyBetRestriction;

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final Long getParamTId() {
        return this.paramTId;
    }

    /* renamed from: component11, reason: from getter */
    public final VarietyBetRestrictionInfoModel getVarietyBetRestriction() {
        return this.varietyBetRestriction;
    }

    public final List<BetGroupsRows> component2() {
        return this.tabs;
    }

    public final List<MatchVarietyGroupBetsModel> component3() {
        return this.bets;
    }

    public final Function0<Unit> component4() {
        return this.onClick;
    }

    /* renamed from: component5, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component7, reason: from getter */
    public final int getScoreHome() {
        return this.scoreHome;
    }

    /* renamed from: component8, reason: from getter */
    public final int getScoreAway() {
        return this.scoreAway;
    }

    /* renamed from: component9, reason: from getter */
    public final String getResultRaw() {
        return this.resultRaw;
    }

    public final BetGroupsTabs copy(String title, List<BetGroupsRows> tabs, List<MatchVarietyGroupBetsModel> bets, Function0<Unit> onClick, int id, boolean isSelected, int scoreHome, int scoreAway, String resultRaw, Long paramTId, VarietyBetRestrictionInfoModel varietyBetRestriction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(bets, "bets");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new BetGroupsTabs(title, tabs, bets, onClick, id, isSelected, scoreHome, scoreAway, resultRaw, paramTId, varietyBetRestriction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetGroupsTabs)) {
            return false;
        }
        BetGroupsTabs betGroupsTabs = (BetGroupsTabs) other;
        return Intrinsics.areEqual(this.title, betGroupsTabs.title) && Intrinsics.areEqual(this.tabs, betGroupsTabs.tabs) && Intrinsics.areEqual(this.bets, betGroupsTabs.bets) && Intrinsics.areEqual(this.onClick, betGroupsTabs.onClick) && this.id == betGroupsTabs.id && this.isSelected == betGroupsTabs.isSelected && this.scoreHome == betGroupsTabs.scoreHome && this.scoreAway == betGroupsTabs.scoreAway && Intrinsics.areEqual(this.resultRaw, betGroupsTabs.resultRaw) && Intrinsics.areEqual(this.paramTId, betGroupsTabs.paramTId) && Intrinsics.areEqual(this.varietyBetRestriction, betGroupsTabs.varietyBetRestriction);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.title.hashCode() * 31) + this.tabs.hashCode()) * 31) + this.bets.hashCode()) * 31) + this.onClick.hashCode()) * 31) + Integer.hashCode(this.id)) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Integer.hashCode(this.scoreHome)) * 31) + Integer.hashCode(this.scoreAway)) * 31;
        String str = this.resultRaw;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.paramTId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel = this.varietyBetRestriction;
        return hashCode3 + (varietyBetRestrictionInfoModel != null ? varietyBetRestrictionInfoModel.hashCode() : 0);
    }

    public String toString() {
        return "BetGroupsTabs(title=" + this.title + ", tabs=" + this.tabs + ", bets=" + this.bets + ", onClick=" + this.onClick + ", id=" + this.id + ", isSelected=" + this.isSelected + ", scoreHome=" + this.scoreHome + ", scoreAway=" + this.scoreAway + ", resultRaw=" + this.resultRaw + ", paramTId=" + this.paramTId + ", varietyBetRestriction=" + this.varietyBetRestriction + ")";
    }

    public BetGroupsTabs(String title, List<BetGroupsRows> tabs, List<MatchVarietyGroupBetsModel> bets, Function0<Unit> onClick, int i, boolean z, int i2, int i3, String str, Long l, VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(bets, "bets");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.title = title;
        this.tabs = tabs;
        this.bets = bets;
        this.onClick = onClick;
        this.id = i;
        this.isSelected = z;
        this.scoreHome = i2;
        this.scoreAway = i3;
        this.resultRaw = str;
        this.paramTId = l;
        this.varietyBetRestriction = varietyBetRestrictionInfoModel;
    }

    public /* synthetic */ BetGroupsTabs(String str, List list, List list2, Function0 function0, int i, boolean z, int i2, int i3, String str2, Long l, VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, list2, function0, i, (i4 & 32) != 0 ? false : z, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? 0 : i3, (i4 & 256) != 0 ? null : str2, (i4 & 512) != 0 ? null : l, (i4 & 1024) != 0 ? null : varietyBetRestrictionInfoModel);
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<BetGroupsRows> getTabs() {
        return this.tabs;
    }

    public final List<MatchVarietyGroupBetsModel> getBets() {
        return this.bets;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final int getScoreHome() {
        return this.scoreHome;
    }

    public final int getScoreAway() {
        return this.scoreAway;
    }

    public final String getResultRaw() {
        return this.resultRaw;
    }

    public final Long getParamTId() {
        return this.paramTId;
    }

    public final VarietyBetRestrictionInfoModel getVarietyBetRestriction() {
        return this.varietyBetRestriction;
    }
}
