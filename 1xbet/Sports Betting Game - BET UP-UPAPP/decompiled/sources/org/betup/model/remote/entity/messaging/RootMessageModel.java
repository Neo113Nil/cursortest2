package org.betup.model.remote.entity.messaging;

/* loaded from: classes2.dex */
public class RootMessageModel {
    private int commentCount;
    private MessageModel message;

    public MessageModel getMessage() {
        return this.message;
    }

    public void setMessage(MessageModel message) {
        this.message = message;
    }

    public int getCommentCount() {
        return this.commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
}
