package org.betup.bus;

/* loaded from: classes2.dex */
public class DisplayFollowersDialogMessage {
    private final int lastSelectedTabIndex;
    private final int userId;

    public DisplayFollowersDialogMessage(int userId, int lastSelectedTabIndex) {
        this.userId = userId;
        this.lastSelectedTabIndex = lastSelectedTabIndex;
    }

    public int getUserId() {
        return this.userId;
    }

    public int getLastSelectedTabIndex() {
        return this.lastSelectedTabIndex;
    }
}
