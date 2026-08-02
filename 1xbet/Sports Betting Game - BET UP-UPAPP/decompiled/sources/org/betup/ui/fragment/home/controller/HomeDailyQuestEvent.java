package org.betup.ui.fragment.home.controller;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeDailyQuestController.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeDailyQuestEvent;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ShowError", "ShowClaimableNotification", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestEvent$ShowClaimableNotification;", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestEvent$ShowError;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class HomeDailyQuestEvent {
    public static final int $stable = 0;

    public /* synthetic */ HomeDailyQuestEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: HomeDailyQuestController.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeDailyQuestEvent$ShowError;", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestEvent;", "messageResId", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V", "getMessageResId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShowError extends HomeDailyQuestEvent {
        public static final int $stable = 0;
        private final int messageResId;

        public static /* synthetic */ ShowError copy$default(ShowError showError, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = showError.messageResId;
            }
            return showError.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMessageResId() {
            return this.messageResId;
        }

        public final ShowError copy(int messageResId) {
            return new ShowError(messageResId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowError) && this.messageResId == ((ShowError) other).messageResId;
        }

        public int hashCode() {
            return Integer.hashCode(this.messageResId);
        }

        public String toString() {
            return "ShowError(messageResId=" + this.messageResId + ")";
        }

        public ShowError(int i) {
            super(null);
            this.messageResId = i;
        }

        public final int getMessageResId() {
            return this.messageResId;
        }
    }

    private HomeDailyQuestEvent() {
    }

    /* compiled from: HomeDailyQuestController.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeDailyQuestEvent$ShowClaimableNotification;", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestEvent;", "questId", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "getQuestId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShowClaimableNotification extends HomeDailyQuestEvent {
        public static final int $stable = 0;
        private final String questId;

        public static /* synthetic */ ShowClaimableNotification copy$default(ShowClaimableNotification showClaimableNotification, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showClaimableNotification.questId;
            }
            return showClaimableNotification.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getQuestId() {
            return this.questId;
        }

        public final ShowClaimableNotification copy(String questId) {
            Intrinsics.checkNotNullParameter(questId, "questId");
            return new ShowClaimableNotification(questId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowClaimableNotification) && Intrinsics.areEqual(this.questId, ((ShowClaimableNotification) other).questId);
        }

        public int hashCode() {
            return this.questId.hashCode();
        }

        public String toString() {
            return "ShowClaimableNotification(questId=" + this.questId + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowClaimableNotification(String questId) {
            super(null);
            Intrinsics.checkNotNullParameter(questId, "questId");
            this.questId = questId;
        }

        public final String getQuestId() {
            return this.questId;
        }
    }
}
