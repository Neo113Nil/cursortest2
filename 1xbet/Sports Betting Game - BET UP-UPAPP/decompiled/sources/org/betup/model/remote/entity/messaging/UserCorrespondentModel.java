package org.betup.model.remote.entity.messaging;

/* loaded from: classes2.dex */
public class UserCorrespondentModel {
    private int unreadMessages;
    private CorrespondentModel user;

    public CorrespondentModel getUser() {
        return this.user;
    }

    public void setUser(CorrespondentModel user) {
        this.user = user;
    }

    public int getUnreadMessages() {
        return this.unreadMessages;
    }

    public void setUnreadMessages(int unreadMessages) {
        this.unreadMessages = unreadMessages;
    }
}
