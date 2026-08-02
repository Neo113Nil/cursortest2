package org.betup.model.remote.entity.support;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class MessageWithReactionsDto {

    @SerializedName("commentCount")
    private Integer commentCount;

    @SerializedName("message")
    private MessageExposeDto message;

    @SerializedName("reacted")
    private Boolean reacted;

    @SerializedName("reactions")
    private List<ReactionWithCountDto> reactions;

    public MessageExposeDto getMessage() {
        return this.message;
    }

    public void setMessage(MessageExposeDto message) {
        this.message = message;
    }

    public Integer getCommentCount() {
        return this.commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public List<ReactionWithCountDto> getReactions() {
        return this.reactions;
    }

    public void setReactions(List<ReactionWithCountDto> reactions) {
        this.reactions = reactions;
    }

    public Boolean getReacted() {
        return this.reacted;
    }

    public void setReacted(Boolean reacted) {
        this.reacted = reacted;
    }
}
