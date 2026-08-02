package org.betup.ui.fragment.home.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeUiState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/fragment/home/compose/HomeStatsUiState;", "", "Hidden", "Loading", "Visible", "Lorg/betup/ui/fragment/home/compose/HomeStatsUiState$Hidden;", "Lorg/betup/ui/fragment/home/compose/HomeStatsUiState$Loading;", "Lorg/betup/ui/fragment/home/compose/HomeStatsUiState$Visible;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface HomeStatsUiState {

    /* compiled from: HomeUiState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/home/compose/HomeStatsUiState$Hidden;", "Lorg/betup/ui/fragment/home/compose/HomeStatsUiState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Hidden implements HomeStatsUiState {
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
            return -245976032;
        }

        public String toString() {
            return "Hidden";
        }

        private Hidden() {
        }
    }

    /* compiled from: HomeUiState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/home/compose/HomeStatsUiState$Loading;", "Lorg/betup/ui/fragment/home/compose/HomeStatsUiState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loading implements HomeStatsUiState {
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
            return 388733318;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: HomeUiState.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lorg/betup/ui/fragment/home/compose/HomeStatsUiState$Visible;", "Lorg/betup/ui/fragment/home/compose/HomeStatsUiState;", "winRatePercent", "", "globalRankLabel", "", "bestStreak", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;I)V", "getWinRatePercent", "()I", "getGlobalRankLabel", "()Ljava/lang/String;", "getBestStreak", "hasAnyStat", "", "getHasAnyStat", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Visible implements HomeStatsUiState {
        public static final int $stable = 0;
        private final int bestStreak;
        private final String globalRankLabel;
        private final int winRatePercent;

        public static /* synthetic */ Visible copy$default(Visible visible, int i, String str, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = visible.winRatePercent;
            }
            if ((i3 & 2) != 0) {
                str = visible.globalRankLabel;
            }
            if ((i3 & 4) != 0) {
                i2 = visible.bestStreak;
            }
            return visible.copy(i, str, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWinRatePercent() {
            return this.winRatePercent;
        }

        /* renamed from: component2, reason: from getter */
        public final String getGlobalRankLabel() {
            return this.globalRankLabel;
        }

        /* renamed from: component3, reason: from getter */
        public final int getBestStreak() {
            return this.bestStreak;
        }

        public final Visible copy(int winRatePercent, String globalRankLabel, int bestStreak) {
            return new Visible(winRatePercent, globalRankLabel, bestStreak);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Visible)) {
                return false;
            }
            Visible visible = (Visible) other;
            return this.winRatePercent == visible.winRatePercent && Intrinsics.areEqual(this.globalRankLabel, visible.globalRankLabel) && this.bestStreak == visible.bestStreak;
        }

        public final boolean getHasAnyStat() {
            return true;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.winRatePercent) * 31;
            String str = this.globalRankLabel;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.bestStreak);
        }

        public String toString() {
            return "Visible(winRatePercent=" + this.winRatePercent + ", globalRankLabel=" + this.globalRankLabel + ", bestStreak=" + this.bestStreak + ")";
        }

        public Visible(int i, String str, int i2) {
            this.winRatePercent = i;
            this.globalRankLabel = str;
            this.bestStreak = i2;
        }

        public final int getWinRatePercent() {
            return this.winRatePercent;
        }

        public final String getGlobalRankLabel() {
            return this.globalRankLabel;
        }

        public final int getBestStreak() {
            return this.bestStreak;
        }
    }
}
