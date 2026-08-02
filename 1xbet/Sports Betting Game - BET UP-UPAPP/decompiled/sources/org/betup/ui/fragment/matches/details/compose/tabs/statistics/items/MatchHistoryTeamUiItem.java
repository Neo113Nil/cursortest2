package org.betup.ui.fragment.matches.details.compose.tabs.statistics.items;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchHistoryTeamUiItem.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchHistoryTeamUiItem;", "", "id", "", "photoUrl", "", "name", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getPhotoUrl", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MatchHistoryTeamUiItem {
    public static final int $stable = 0;
    private final long id;
    private final String name;
    private final String photoUrl;

    public static /* synthetic */ MatchHistoryTeamUiItem copy$default(MatchHistoryTeamUiItem matchHistoryTeamUiItem, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = matchHistoryTeamUiItem.id;
        }
        if ((i & 2) != 0) {
            str = matchHistoryTeamUiItem.photoUrl;
        }
        if ((i & 4) != 0) {
            str2 = matchHistoryTeamUiItem.name;
        }
        return matchHistoryTeamUiItem.copy(j, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final MatchHistoryTeamUiItem copy(long id, String photoUrl, String name) {
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        return new MatchHistoryTeamUiItem(id, photoUrl, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchHistoryTeamUiItem)) {
            return false;
        }
        MatchHistoryTeamUiItem matchHistoryTeamUiItem = (MatchHistoryTeamUiItem) other;
        return this.id == matchHistoryTeamUiItem.id && Intrinsics.areEqual(this.photoUrl, matchHistoryTeamUiItem.photoUrl) && Intrinsics.areEqual(this.name, matchHistoryTeamUiItem.name);
    }

    public int hashCode() {
        return (((Long.hashCode(this.id) * 31) + this.photoUrl.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "MatchHistoryTeamUiItem(id=" + this.id + ", photoUrl=" + this.photoUrl + ", name=" + this.name + ")";
    }

    public MatchHistoryTeamUiItem(long j, String photoUrl, String name) {
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = j;
        this.photoUrl = photoUrl;
        this.name = name;
    }

    public final long getId() {
        return this.id;
    }

    public /* synthetic */ MatchHistoryTeamUiItem(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? "" : str, str2);
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final String getName() {
        return this.name;
    }
}
