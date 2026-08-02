package org.betup.ui.dialogs;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.DisplayFollowersDialogMessage;
import org.betup.bus.NavigateMessage;
import org.betup.bus.ReturnToLastTabMessage;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FollowersDialogStateManager.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u0007J\u0018\u0010\u0010\u001a\u00020\u00072\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0007J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0015H\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lorg/betup/ui/dialogs/FollowersDialogStateManager;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "pendingDialogState", "Lorg/betup/ui/dialogs/FollowersDialogStateManager$DialogState;", "storeDialogState", "", "userId", "", "lastSelectedTabIndex", "isInBattle", "", "clearDialogState", "hasPendingDialog", "restorePendingDialog", "onNavigateToUserDetails", "message", "Lorg/betup/bus/NavigateMessage;", "Lorg/betup/bus/NavigateMessage$Target;", "onReturnToLastTab", "Lorg/betup/bus/ReturnToLastTabMessage;", "DialogState", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FollowersDialogStateManager {
    private static DialogState pendingDialogState;
    public static final FollowersDialogStateManager INSTANCE = new FollowersDialogStateManager();
    public static final int $stable = 8;

    private FollowersDialogStateManager() {
    }

    /* compiled from: FollowersDialogStateManager.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, d2 = {"Lorg/betup/ui/dialogs/FollowersDialogStateManager$DialogState;", "", "userId", "", "lastSelectedTabIndex", "isInBattle", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IIZ)V", "getUserId", "()I", "getLastSelectedTabIndex", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DialogState {
        public static final int $stable = 0;
        private final boolean isInBattle;
        private final int lastSelectedTabIndex;
        private final int userId;

        public static /* synthetic */ DialogState copy$default(DialogState dialogState, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = dialogState.userId;
            }
            if ((i3 & 2) != 0) {
                i2 = dialogState.lastSelectedTabIndex;
            }
            if ((i3 & 4) != 0) {
                z = dialogState.isInBattle;
            }
            return dialogState.copy(i, i2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getUserId() {
            return this.userId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getLastSelectedTabIndex() {
            return this.lastSelectedTabIndex;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsInBattle() {
            return this.isInBattle;
        }

        public final DialogState copy(int userId, int lastSelectedTabIndex, boolean isInBattle) {
            return new DialogState(userId, lastSelectedTabIndex, isInBattle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DialogState)) {
                return false;
            }
            DialogState dialogState = (DialogState) other;
            return this.userId == dialogState.userId && this.lastSelectedTabIndex == dialogState.lastSelectedTabIndex && this.isInBattle == dialogState.isInBattle;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.userId) * 31) + Integer.hashCode(this.lastSelectedTabIndex)) * 31) + Boolean.hashCode(this.isInBattle);
        }

        public String toString() {
            return "DialogState(userId=" + this.userId + ", lastSelectedTabIndex=" + this.lastSelectedTabIndex + ", isInBattle=" + this.isInBattle + ")";
        }

        public DialogState(int i, int i2, boolean z) {
            this.userId = i;
            this.lastSelectedTabIndex = i2;
            this.isInBattle = z;
        }

        public final int getUserId() {
            return this.userId;
        }

        public final int getLastSelectedTabIndex() {
            return this.lastSelectedTabIndex;
        }

        public final boolean isInBattle() {
            return this.isInBattle;
        }
    }

    public final void storeDialogState(int userId, int lastSelectedTabIndex, boolean isInBattle) {
        pendingDialogState = new DialogState(userId, lastSelectedTabIndex, isInBattle);
    }

    public final void clearDialogState() {
        pendingDialogState = null;
    }

    public final boolean hasPendingDialog() {
        return pendingDialogState != null;
    }

    public final void restorePendingDialog() {
        DialogState dialogState = pendingDialogState;
        if (dialogState != null) {
            EventBus.getDefault().post(new DisplayFollowersDialogMessage(dialogState.getUserId(), dialogState.getLastSelectedTabIndex()));
            INSTANCE.clearDialogState();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onNavigateToUserDetails(NavigateMessage<NavigateMessage.Target> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        message.getTarget();
        NavigateMessage.Target target = NavigateMessage.Target.USER_DETAILS;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReturnToLastTab(ReturnToLastTabMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (hasPendingDialog()) {
            restorePendingDialog();
        }
    }
}
