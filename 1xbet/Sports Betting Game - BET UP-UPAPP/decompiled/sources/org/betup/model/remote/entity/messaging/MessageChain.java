package org.betup.model.remote.entity.messaging;

/* loaded from: classes2.dex */
public class MessageChain {
    private CorrespondentModel correspondent;
    private boolean isRead;
    private MessageModel message;

    public MessageChain() {
    }

    public MessageChain(CorrespondentModel correspondent, MessageModel message, boolean isRead) {
        this.correspondent = correspondent;
        this.message = message;
        this.isRead = isRead;
    }

    public boolean isRead() {
        return this.isRead;
    }

    public void setRead(boolean read) {
        this.isRead = read;
    }

    public CorrespondentModel getCorrespondent() {
        return this.correspondent;
    }

    public void setCorrespondent(CorrespondentModel correspondent) {
        this.correspondent = correspondent;
    }

    public MessageModel getMessage() {
        return this.message;
    }

    public void setMessage(MessageModel message) {
        this.message = message;
    }
}
