package org.betup.domain.quest;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.NavigateMessage;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DailyQuestTaskNavigation.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lorg/betup/domain/quest/DailyQuestDestination;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Navigate", "ShowDailyBonus", "TriggerVideoReward", "None", "Lorg/betup/domain/quest/DailyQuestDestination$Navigate;", "Lorg/betup/domain/quest/DailyQuestDestination$None;", "Lorg/betup/domain/quest/DailyQuestDestination$ShowDailyBonus;", "Lorg/betup/domain/quest/DailyQuestDestination$TriggerVideoReward;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class DailyQuestDestination {
    public static final int $stable = 0;

    public /* synthetic */ DailyQuestDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DailyQuestTaskNavigation.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lorg/betup/domain/quest/DailyQuestDestination$Navigate;", "Lorg/betup/domain/quest/DailyQuestDestination;", "target", "Lorg/betup/bus/NavigateMessage$Target;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/bus/NavigateMessage$Target;)V", "getTarget", "()Lorg/betup/bus/NavigateMessage$Target;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Navigate extends DailyQuestDestination {
        public static final int $stable = 0;
        private final NavigateMessage.Target target;

        public static /* synthetic */ Navigate copy$default(Navigate navigate, NavigateMessage.Target target, int i, Object obj) {
            if ((i & 1) != 0) {
                target = navigate.target;
            }
            return navigate.copy(target);
        }

        /* renamed from: component1, reason: from getter */
        public final NavigateMessage.Target getTarget() {
            return this.target;
        }

        public final Navigate copy(NavigateMessage.Target target) {
            Intrinsics.checkNotNullParameter(target, "target");
            return new Navigate(target);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Navigate) && this.target == ((Navigate) other).target;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            return "Navigate(target=" + this.target + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Navigate(NavigateMessage.Target target) {
            super(null);
            Intrinsics.checkNotNullParameter(target, "target");
            this.target = target;
        }

        public final NavigateMessage.Target getTarget() {
            return this.target;
        }
    }

    private DailyQuestDestination() {
    }

    /* compiled from: DailyQuestTaskNavigation.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/domain/quest/DailyQuestDestination$ShowDailyBonus;", "Lorg/betup/domain/quest/DailyQuestDestination;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShowDailyBonus extends DailyQuestDestination {
        public static final int $stable = 0;
        public static final ShowDailyBonus INSTANCE = new ShowDailyBonus();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowDailyBonus)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1366435562;
        }

        public String toString() {
            return "ShowDailyBonus";
        }

        private ShowDailyBonus() {
            super(null);
        }
    }

    /* compiled from: DailyQuestTaskNavigation.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/domain/quest/DailyQuestDestination$TriggerVideoReward;", "Lorg/betup/domain/quest/DailyQuestDestination;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TriggerVideoReward extends DailyQuestDestination {
        public static final int $stable = 0;
        public static final TriggerVideoReward INSTANCE = new TriggerVideoReward();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TriggerVideoReward)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 42665445;
        }

        public String toString() {
            return "TriggerVideoReward";
        }

        private TriggerVideoReward() {
            super(null);
        }
    }

    /* compiled from: DailyQuestTaskNavigation.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/domain/quest/DailyQuestDestination$None;", "Lorg/betup/domain/quest/DailyQuestDestination;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class None extends DailyQuestDestination {
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
            return -2108218453;
        }

        public String toString() {
            return "None";
        }

        private None() {
            super(null);
        }
    }
}
