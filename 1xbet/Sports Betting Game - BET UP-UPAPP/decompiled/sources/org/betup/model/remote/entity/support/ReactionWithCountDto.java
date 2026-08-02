package org.betup.model.remote.entity.support;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class ReactionWithCountDto {

    @SerializedName("count")
    private Integer count;

    @SerializedName("reaction")
    private String reaction;

    public String getReaction() {
        return this.reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
