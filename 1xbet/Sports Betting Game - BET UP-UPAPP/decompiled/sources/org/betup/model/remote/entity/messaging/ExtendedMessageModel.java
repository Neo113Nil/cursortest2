package org.betup.model.remote.entity.messaging;

import java.util.List;

/* loaded from: classes2.dex */
public class ExtendedMessageModel {
    private int commentCount;
    private MessageModel message;
    private boolean reacted;
    private List<ReactionWithCountModel> reactions;

    public boolean isReacted() {
        return this.reacted;
    }

    public void setReacted(boolean reacted) {
        this.reacted = reacted;
    }

    public MessageModel getMessage() {
        return this.message;
    }

    public void setMessage(MessageModel message) {
        this.message = message;
    }

    public List<ReactionWithCountModel> getReactions() {
        return this.reactions;
    }

    public void setReactions(List<ReactionWithCountModel> reactions) {
        this.reactions = reactions;
    }

    public int getCommentCount() {
        return this.commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
}
