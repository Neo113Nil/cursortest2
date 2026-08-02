package org.betup.model.remote.entity.support;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class V7SupportMessageWithReactionsDto {

    @SerializedName("commentCount")
    private Integer commentCount;

    @SerializedName("message")
    private V7SupportMessageDto message;

    @SerializedName("reacted")
    private Boolean reacted;

    @SerializedName("reactions")
    private List<V7SupportReactionDto> reactions;

    public V7SupportMessageDto getMessage() {
        return this.message;
    }

    public void setMessage(V7SupportMessageDto message) {
        this.message = message;
    }

    public Integer getCommentCount() {
        return this.commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public List<V7SupportReactionDto> getReactions() {
        return this.reactions;
    }

    public void setReactions(List<V7SupportReactionDto> reactions) {
        this.reactions = reactions;
    }

    public Boolean getReacted() {
        return this.reacted;
    }

    public void setReacted(Boolean reacted) {
        this.reacted = reacted;
    }
}
