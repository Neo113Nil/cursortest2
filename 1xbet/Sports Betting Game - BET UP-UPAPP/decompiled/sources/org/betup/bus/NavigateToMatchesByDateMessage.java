package org.betup.bus;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NavigateToMatchesByDateMessage.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001e"}, d2 = {"Lorg/betup/bus/NavigateToMatchesByDateMessage;", "", "leagueId", "", "selectedDate", "", "expandedBets", "", "leagueName", "leaguePhoto", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getLeagueId", "()I", "getSelectedDate", "()Ljava/lang/String;", "getExpandedBets", "()Z", "getLeagueName", "getLeaguePhoto", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NavigateToMatchesByDateMessage {
    public static final int $stable = 0;
    private final boolean expandedBets;
    private final int leagueId;
    private final String leagueName;
    private final String leaguePhoto;
    private final String selectedDate;

    public static /* synthetic */ NavigateToMatchesByDateMessage copy$default(NavigateToMatchesByDateMessage navigateToMatchesByDateMessage, int i, String str, boolean z, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = navigateToMatchesByDateMessage.leagueId;
        }
        if ((i2 & 2) != 0) {
            str = navigateToMatchesByDateMessage.selectedDate;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            z = navigateToMatchesByDateMessage.expandedBets;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            str2 = navigateToMatchesByDateMessage.leagueName;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = navigateToMatchesByDateMessage.leaguePhoto;
        }
        return navigateToMatchesByDateMessage.copy(i, str4, z2, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLeagueId() {
        return this.leagueId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSelectedDate() {
        return this.selectedDate;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getExpandedBets() {
        return this.expandedBets;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLeagueName() {
        return this.leagueName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLeaguePhoto() {
        return this.leaguePhoto;
    }

    public final NavigateToMatchesByDateMessage copy(int leagueId, String selectedDate, boolean expandedBets, String leagueName, String leaguePhoto) {
        Intrinsics.checkNotNullParameter(leagueName, "leagueName");
        Intrinsics.checkNotNullParameter(leaguePhoto, "leaguePhoto");
        return new NavigateToMatchesByDateMessage(leagueId, selectedDate, expandedBets, leagueName, leaguePhoto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigateToMatchesByDateMessage)) {
            return false;
        }
        NavigateToMatchesByDateMessage navigateToMatchesByDateMessage = (NavigateToMatchesByDateMessage) other;
        return this.leagueId == navigateToMatchesByDateMessage.leagueId && Intrinsics.areEqual(this.selectedDate, navigateToMatchesByDateMessage.selectedDate) && this.expandedBets == navigateToMatchesByDateMessage.expandedBets && Intrinsics.areEqual(this.leagueName, navigateToMatchesByDateMessage.leagueName) && Intrinsics.areEqual(this.leaguePhoto, navigateToMatchesByDateMessage.leaguePhoto);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.leagueId) * 31;
        String str = this.selectedDate;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.expandedBets)) * 31) + this.leagueName.hashCode()) * 31) + this.leaguePhoto.hashCode();
    }

    public String toString() {
        return "NavigateToMatchesByDateMessage(leagueId=" + this.leagueId + ", selectedDate=" + this.selectedDate + ", expandedBets=" + this.expandedBets + ", leagueName=" + this.leagueName + ", leaguePhoto=" + this.leaguePhoto + ")";
    }

    public NavigateToMatchesByDateMessage(int i, String str, boolean z, String leagueName, String leaguePhoto) {
        Intrinsics.checkNotNullParameter(leagueName, "leagueName");
        Intrinsics.checkNotNullParameter(leaguePhoto, "leaguePhoto");
        this.leagueId = i;
        this.selectedDate = str;
        this.expandedBets = z;
        this.leagueName = leagueName;
        this.leaguePhoto = leaguePhoto;
    }

    public /* synthetic */ NavigateToMatchesByDateMessage(int i, String str, boolean z, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3);
    }

    public final int getLeagueId() {
        return this.leagueId;
    }

    public final String getSelectedDate() {
        return this.selectedDate;
    }

    public final boolean getExpandedBets() {
        return this.expandedBets;
    }

    public final String getLeagueName() {
        return this.leagueName;
    }

    public final String getLeaguePhoto() {
        return this.leaguePhoto;
    }
}
