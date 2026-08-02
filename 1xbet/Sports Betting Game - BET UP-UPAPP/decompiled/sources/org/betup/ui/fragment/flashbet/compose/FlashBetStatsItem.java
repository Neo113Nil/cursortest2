package org.betup.ui.fragment.flashbet.compose;

import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetStatsItem.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u000fHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\u009d\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001J\u0013\u00105\u001a\u00020\u000b2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001fR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006:"}, d2 = {"Lorg/betup/ui/fragment/flashbet/compose/FlashBetStatsItem;", "", "id", "", "sessionId", "timestamp", "date", "sportName", "sportPhotoUrl", X3.i.j0, "isWin", "", "isPerfectWin", "isNoCorrect", "amount", "", "successRatio", "leagueLogoUrl", "onClick", "Lkotlin/Function0;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZJLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getId", "()Ljava/lang/String;", "getSessionId", "getTimestamp", "getDate", "getSportName", "getSportPhotoUrl", "getEventName", "()Z", "getAmount", "()J", "getSuccessRatio", "getLeagueLogoUrl", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FlashBetStatsItem {
    public static final int $stable = 0;
    private final long amount;
    private final String date;
    private final String eventName;
    private final String id;
    private final boolean isNoCorrect;
    private final boolean isPerfectWin;
    private final boolean isWin;
    private final String leagueLogoUrl;
    private final Function0<Unit> onClick;
    private final String sessionId;
    private final String sportName;
    private final String sportPhotoUrl;
    private final String successRatio;
    private final String timestamp;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsNoCorrect() {
        return this.isNoCorrect;
    }

    /* renamed from: component11, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* renamed from: component12, reason: from getter */
    public final String getSuccessRatio() {
        return this.successRatio;
    }

    /* renamed from: component13, reason: from getter */
    public final String getLeagueLogoUrl() {
        return this.leagueLogoUrl;
    }

    public final Function0<Unit> component14() {
        return this.onClick;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSportName() {
        return this.sportName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSportPhotoUrl() {
        return this.sportPhotoUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsWin() {
        return this.isWin;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsPerfectWin() {
        return this.isPerfectWin;
    }

    public final FlashBetStatsItem copy(String id, String sessionId, String timestamp, String date, String sportName, String sportPhotoUrl, String eventName, boolean isWin, boolean isPerfectWin, boolean isNoCorrect, long amount, String successRatio, String leagueLogoUrl, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(sportName, "sportName");
        Intrinsics.checkNotNullParameter(sportPhotoUrl, "sportPhotoUrl");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(successRatio, "successRatio");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new FlashBetStatsItem(id, sessionId, timestamp, date, sportName, sportPhotoUrl, eventName, isWin, isPerfectWin, isNoCorrect, amount, successRatio, leagueLogoUrl, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashBetStatsItem)) {
            return false;
        }
        FlashBetStatsItem flashBetStatsItem = (FlashBetStatsItem) other;
        return Intrinsics.areEqual(this.id, flashBetStatsItem.id) && Intrinsics.areEqual(this.sessionId, flashBetStatsItem.sessionId) && Intrinsics.areEqual(this.timestamp, flashBetStatsItem.timestamp) && Intrinsics.areEqual(this.date, flashBetStatsItem.date) && Intrinsics.areEqual(this.sportName, flashBetStatsItem.sportName) && Intrinsics.areEqual(this.sportPhotoUrl, flashBetStatsItem.sportPhotoUrl) && Intrinsics.areEqual(this.eventName, flashBetStatsItem.eventName) && this.isWin == flashBetStatsItem.isWin && this.isPerfectWin == flashBetStatsItem.isPerfectWin && this.isNoCorrect == flashBetStatsItem.isNoCorrect && this.amount == flashBetStatsItem.amount && Intrinsics.areEqual(this.successRatio, flashBetStatsItem.successRatio) && Intrinsics.areEqual(this.leagueLogoUrl, flashBetStatsItem.leagueLogoUrl) && Intrinsics.areEqual(this.onClick, flashBetStatsItem.onClick);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((this.id.hashCode() * 31) + this.sessionId.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + this.date.hashCode()) * 31) + this.sportName.hashCode()) * 31) + this.sportPhotoUrl.hashCode()) * 31) + this.eventName.hashCode()) * 31) + Boolean.hashCode(this.isWin)) * 31) + Boolean.hashCode(this.isPerfectWin)) * 31) + Boolean.hashCode(this.isNoCorrect)) * 31) + Long.hashCode(this.amount)) * 31) + this.successRatio.hashCode()) * 31;
        String str = this.leagueLogoUrl;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "FlashBetStatsItem(id=" + this.id + ", sessionId=" + this.sessionId + ", timestamp=" + this.timestamp + ", date=" + this.date + ", sportName=" + this.sportName + ", sportPhotoUrl=" + this.sportPhotoUrl + ", eventName=" + this.eventName + ", isWin=" + this.isWin + ", isPerfectWin=" + this.isPerfectWin + ", isNoCorrect=" + this.isNoCorrect + ", amount=" + this.amount + ", successRatio=" + this.successRatio + ", leagueLogoUrl=" + this.leagueLogoUrl + ", onClick=" + this.onClick + ")";
    }

    public FlashBetStatsItem(String id, String sessionId, String timestamp, String date, String sportName, String sportPhotoUrl, String eventName, boolean z, boolean z2, boolean z3, long j, String successRatio, String str, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(sportName, "sportName");
        Intrinsics.checkNotNullParameter(sportPhotoUrl, "sportPhotoUrl");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(successRatio, "successRatio");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.id = id;
        this.sessionId = sessionId;
        this.timestamp = timestamp;
        this.date = date;
        this.sportName = sportName;
        this.sportPhotoUrl = sportPhotoUrl;
        this.eventName = eventName;
        this.isWin = z;
        this.isPerfectWin = z2;
        this.isNoCorrect = z3;
        this.amount = j;
        this.successRatio = successRatio;
        this.leagueLogoUrl = str;
        this.onClick = onClick;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getSportName() {
        return this.sportName;
    }

    public final String getSportPhotoUrl() {
        return this.sportPhotoUrl;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final boolean isWin() {
        return this.isWin;
    }

    public final boolean isPerfectWin() {
        return this.isPerfectWin;
    }

    public final boolean isNoCorrect() {
        return this.isNoCorrect;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final String getSuccessRatio() {
        return this.successRatio;
    }

    public final String getLeagueLogoUrl() {
        return this.leagueLogoUrl;
    }

    public /* synthetic */ FlashBetStatsItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, long j, String str8, String str9, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, z, z2, z3, j, str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetStatsItem$$ExternalSyntheticLambda0
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
