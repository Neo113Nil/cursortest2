package org.betup.ui.fragment.matches.details.compose.tabs.statistics.items;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchStatisticsUiTeamItem.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsItemValueUnit;", "", "sufix", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "getSufix", "()Ljava/lang/String;", "None", "Int", "Float", "Percentage", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsItemValueUnit$Float;", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsItemValueUnit$Int;", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsItemValueUnit$None;", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsItemValueUnit$Percentage;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class MatchStatsItemValueUnit {
    public static final int $stable = 0;
    private final String sufix;

    public /* synthetic */ MatchStatsItemValueUnit(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* compiled from: MatchStatisticsUiTeamItem.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsItemValueUnit$None;", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsItemValueUnit;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class None extends MatchStatsItemValueUnit {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof None)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 266893818;
        }

        public String toString() {
            return "None";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private None() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    private MatchStatsItemValueUnit(String str) {
        this.sufix = str;
    }

    public /* synthetic */ MatchStatsItemValueUnit(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, null);
    }

    public final String getSufix() {
        return this.sufix;
    }

    /* compiled from: MatchStatisticsUiTeamItem.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsItemValueUnit$Int;", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsItemValueUnit;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Int extends MatchStatsItemValueUnit {
        public static final int $stable = 0;
        public static final Int INSTANCE = new Int();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Int)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 285699309;
        }

        public String toString() {
            return "Int";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Int() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: MatchStatisticsUiTeamItem.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsItemValueUnit$Float;", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsItemValueUnit;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Float extends MatchStatsItemValueUnit {
        public static final int $stable = 0;
        public static final Float INSTANCE = new Float();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Float)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -323702822;
        }

        public String toString() {
            return "Float";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Float() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: MatchStatisticsUiTeamItem.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsItemValueUnit$Percentage;", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsItemValueUnit;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Percentage extends MatchStatsItemValueUnit {
        public static final int $stable = 0;
        public static final Percentage INSTANCE = new Percentage();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Percentage)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 50078684;
        }

        public String toString() {
            return "Percentage";
        }

        private Percentage() {
            super("%", null);
        }
    }
}
