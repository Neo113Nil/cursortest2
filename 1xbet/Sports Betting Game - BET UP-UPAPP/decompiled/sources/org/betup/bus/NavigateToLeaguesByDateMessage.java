package org.betup.bus;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NavigateToLeaguesByDateMessage.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lorg/betup/bus/NavigateToLeaguesByDateMessage;", "", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "", "selectedDate", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;)V", "getSportId", "()I", "getSelectedDate", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NavigateToLeaguesByDateMessage {
    public static final int $stable = 0;
    private final String selectedDate;
    private final int sportId;

    public static /* synthetic */ NavigateToLeaguesByDateMessage copy$default(NavigateToLeaguesByDateMessage navigateToLeaguesByDateMessage, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = navigateToLeaguesByDateMessage.sportId;
        }
        if ((i2 & 2) != 0) {
            str = navigateToLeaguesByDateMessage.selectedDate;
        }
        return navigateToLeaguesByDateMessage.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSportId() {
        return this.sportId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSelectedDate() {
        return this.selectedDate;
    }

    public final NavigateToLeaguesByDateMessage copy(int sportId, String selectedDate) {
        return new NavigateToLeaguesByDateMessage(sportId, selectedDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigateToLeaguesByDateMessage)) {
            return false;
        }
        NavigateToLeaguesByDateMessage navigateToLeaguesByDateMessage = (NavigateToLeaguesByDateMessage) other;
        return this.sportId == navigateToLeaguesByDateMessage.sportId && Intrinsics.areEqual(this.selectedDate, navigateToLeaguesByDateMessage.selectedDate);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.sportId) * 31;
        String str = this.selectedDate;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "NavigateToLeaguesByDateMessage(sportId=" + this.sportId + ", selectedDate=" + this.selectedDate + ")";
    }

    public NavigateToLeaguesByDateMessage(int i, String str) {
        this.sportId = i;
        this.selectedDate = str;
    }

    public /* synthetic */ NavigateToLeaguesByDateMessage(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str);
    }

    public final int getSportId() {
        return this.sportId;
    }

    public final String getSelectedDate() {
        return this.selectedDate;
    }
}
