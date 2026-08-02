package org.betup.ui.fragment.home.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeUiState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lorg/betup/ui/fragment/home/compose/HomeActiveOfferUiState;", "", "title", "", "betcoins", "", "expirationMs", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IJ)V", "getTitle", "()Ljava/lang/String;", "getBetcoins", "()I", "getExpirationMs", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HomeActiveOfferUiState {
    public static final int $stable = 0;
    private final int betcoins;
    private final long expirationMs;
    private final String title;

    public HomeActiveOfferUiState() {
        this(null, 0, 0L, 7, null);
    }

    public static /* synthetic */ HomeActiveOfferUiState copy$default(HomeActiveOfferUiState homeActiveOfferUiState, String str, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = homeActiveOfferUiState.title;
        }
        if ((i2 & 2) != 0) {
            i = homeActiveOfferUiState.betcoins;
        }
        if ((i2 & 4) != 0) {
            j = homeActiveOfferUiState.expirationMs;
        }
        return homeActiveOfferUiState.copy(str, i, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBetcoins() {
        return this.betcoins;
    }

    /* renamed from: component3, reason: from getter */
    public final long getExpirationMs() {
        return this.expirationMs;
    }

    public final HomeActiveOfferUiState copy(String title, int betcoins, long expirationMs) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new HomeActiveOfferUiState(title, betcoins, expirationMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeActiveOfferUiState)) {
            return false;
        }
        HomeActiveOfferUiState homeActiveOfferUiState = (HomeActiveOfferUiState) other;
        return Intrinsics.areEqual(this.title, homeActiveOfferUiState.title) && this.betcoins == homeActiveOfferUiState.betcoins && this.expirationMs == homeActiveOfferUiState.expirationMs;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + Integer.hashCode(this.betcoins)) * 31) + Long.hashCode(this.expirationMs);
    }

    public String toString() {
        return "HomeActiveOfferUiState(title=" + this.title + ", betcoins=" + this.betcoins + ", expirationMs=" + this.expirationMs + ")";
    }

    public HomeActiveOfferUiState(String title, int i, long j) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.betcoins = i;
        this.expirationMs = j;
    }

    public /* synthetic */ HomeActiveOfferUiState(String str, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? 0L : j);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getBetcoins() {
        return this.betcoins;
    }

    public final long getExpirationMs() {
        return this.expirationMs;
    }
}
