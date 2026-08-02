package org.betup.model.remote.entity.support;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class V7SupportReactionDto {

    @SerializedName("count")
    private Long count;

    @SerializedName("reaction")
    private V7SupportReactionInfoDto reaction;

    public Long getCount() {
        return this.count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public V7SupportReactionInfoDto getReaction() {
        return this.reaction;
    }

    public void setReaction(V7SupportReactionInfoDto reaction) {
        this.reaction = reaction;
    }
}
