package org.betup.model.remote.entity.matches.stats.h2h;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class Head2HeadSubResponseModel {

    @SerializedName("h2h")
    private Head2HeadResponseDataModel h2h;

    public Head2HeadResponseDataModel getH2h() {
        return this.h2h;
    }

    public void setH2h(Head2HeadResponseDataModel h2h) {
        this.h2h = h2h;
    }
}
