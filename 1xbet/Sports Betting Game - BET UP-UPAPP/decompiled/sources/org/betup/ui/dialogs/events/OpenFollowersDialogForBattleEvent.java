package org.betup.ui.dialogs.events;

import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleEvents.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/dialogs/events/OpenFollowersDialogForBattleEvent;", "", "userId", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(J)V", "getUserId", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OpenFollowersDialogForBattleEvent {
    public static final int $stable = 0;
    private final long userId;

    public static /* synthetic */ OpenFollowersDialogForBattleEvent copy$default(OpenFollowersDialogForBattleEvent openFollowersDialogForBattleEvent, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = openFollowersDialogForBattleEvent.userId;
        }
        return openFollowersDialogForBattleEvent.copy(j);
    }

    /* renamed from: component1, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    public final OpenFollowersDialogForBattleEvent copy(long userId) {
        return new OpenFollowersDialogForBattleEvent(userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OpenFollowersDialogForBattleEvent) && this.userId == ((OpenFollowersDialogForBattleEvent) other).userId;
    }

    public int hashCode() {
        return Long.hashCode(this.userId);
    }

    public String toString() {
        return "OpenFollowersDialogForBattleEvent(userId=" + this.userId + ")";
    }

    public OpenFollowersDialogForBattleEvent(long j) {
        this.userId = j;
    }

    public final long getUserId() {
        return this.userId;
    }
}
