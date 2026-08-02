package org.betup.ui.fragment.home.compose;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeUiState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/fragment/home/compose/HomeMoreMatchesUiState;", "", "Hidden", "Loading", "Visible", "Lorg/betup/ui/fragment/home/compose/HomeMoreMatchesUiState$Hidden;", "Lorg/betup/ui/fragment/home/compose/HomeMoreMatchesUiState$Loading;", "Lorg/betup/ui/fragment/home/compose/HomeMoreMatchesUiState$Visible;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface HomeMoreMatchesUiState {

    /* compiled from: HomeUiState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/home/compose/HomeMoreMatchesUiState$Hidden;", "Lorg/betup/ui/fragment/home/compose/HomeMoreMatchesUiState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Hidden implements HomeMoreMatchesUiState {
        public static final int $stable = 0;
        public static final Hidden INSTANCE = new Hidden();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Hidden)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1641372895;
        }

        public String toString() {
            return "Hidden";
        }

        private Hidden() {
        }
    }

    /* compiled from: HomeUiState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/home/compose/HomeMoreMatchesUiState$Loading;", "Lorg/betup/ui/fragment/home/compose/HomeMoreMatchesUiState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loading implements HomeMoreMatchesUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1232992089;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: HomeUiState.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lorg/betup/ui/fragment/home/compose/HomeMoreMatchesUiState$Visible;", "Lorg/betup/ui/fragment/home/compose/HomeMoreMatchesUiState;", "matches", "", "Lorg/betup/ui/fragment/home/compose/HomeMatchItem;", "isLoadingMore", "", "hasMore", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;ZZ)V", "getMatches", "()Ljava/util/List;", "()Z", "getHasMore", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Visible implements HomeMoreMatchesUiState {
        public static final int $stable = 8;
        private final boolean hasMore;
        private final boolean isLoadingMore;
        private final List<HomeMatchItem> matches;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Visible copy$default(Visible visible, List list, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = visible.matches;
            }
            if ((i & 2) != 0) {
                z = visible.isLoadingMore;
            }
            if ((i & 4) != 0) {
                z2 = visible.hasMore;
            }
            return visible.copy(list, z, z2);
        }

        public final List<HomeMatchItem> component1() {
            return this.matches;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLoadingMore() {
            return this.isLoadingMore;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final Visible copy(List<HomeMatchItem> matches, boolean isLoadingMore, boolean hasMore) {
            Intrinsics.checkNotNullParameter(matches, "matches");
            return new Visible(matches, isLoadingMore, hasMore);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Visible)) {
                return false;
            }
            Visible visible = (Visible) other;
            return Intrinsics.areEqual(this.matches, visible.matches) && this.isLoadingMore == visible.isLoadingMore && this.hasMore == visible.hasMore;
        }

        public int hashCode() {
            return (((this.matches.hashCode() * 31) + Boolean.hashCode(this.isLoadingMore)) * 31) + Boolean.hashCode(this.hasMore);
        }

        public String toString() {
            return "Visible(matches=" + this.matches + ", isLoadingMore=" + this.isLoadingMore + ", hasMore=" + this.hasMore + ")";
        }

        public Visible(List<HomeMatchItem> matches, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(matches, "matches");
            this.matches = matches;
            this.isLoadingMore = z;
            this.hasMore = z2;
        }

        public /* synthetic */ Visible(List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
        }

        public final List<HomeMatchItem> getMatches() {
            return this.matches;
        }

        public final boolean isLoadingMore() {
            return this.isLoadingMore;
        }

        public final boolean getHasMore() {
            return this.hasMore;
        }
    }
}
