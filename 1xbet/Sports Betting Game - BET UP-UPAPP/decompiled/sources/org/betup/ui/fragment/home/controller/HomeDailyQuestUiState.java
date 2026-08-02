package org.betup.ui.fragment.home.controller;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.domain.quest.DailyQuest;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeDailyQuestController.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Hidden", "Loading", "Active", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState$Active;", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState$Hidden;", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState$Loading;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class HomeDailyQuestUiState {
    public static final int $stable = 0;

    public /* synthetic */ HomeDailyQuestUiState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: HomeDailyQuestController.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState$Hidden;", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Hidden extends HomeDailyQuestUiState {
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
            return -1848848298;
        }

        public String toString() {
            return "Hidden";
        }

        private Hidden() {
            super(null);
        }
    }

    private HomeDailyQuestUiState() {
    }

    /* compiled from: HomeDailyQuestController.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState$Loading;", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loading extends HomeDailyQuestUiState {
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
            return -2055666672;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: HomeDailyQuestController.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState$Active;", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState;", "quest", "Lorg/betup/domain/quest/DailyQuest;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/domain/quest/DailyQuest;)V", "getQuest", "()Lorg/betup/domain/quest/DailyQuest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Active extends HomeDailyQuestUiState {
        public static final int $stable = 8;
        private final DailyQuest quest;

        public static /* synthetic */ Active copy$default(Active active, DailyQuest dailyQuest, int i, Object obj) {
            if ((i & 1) != 0) {
                dailyQuest = active.quest;
            }
            return active.copy(dailyQuest);
        }

        /* renamed from: component1, reason: from getter */
        public final DailyQuest getQuest() {
            return this.quest;
        }

        public final Active copy(DailyQuest quest) {
            Intrinsics.checkNotNullParameter(quest, "quest");
            return new Active(quest);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Active) && Intrinsics.areEqual(this.quest, ((Active) other).quest);
        }

        public int hashCode() {
            return this.quest.hashCode();
        }

        public String toString() {
            return "Active(quest=" + this.quest + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Active(DailyQuest quest) {
            super(null);
            Intrinsics.checkNotNullParameter(quest, "quest");
            this.quest = quest;
        }

        public final DailyQuest getQuest() {
            return this.quest;
        }
    }
}
