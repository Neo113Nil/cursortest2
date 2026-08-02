package org.betup.model.remote.entity.subscription;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class SubscriptionResponseModel {

    @SerializedName("info")
    private PageInfo pageInfo;

    @SerializedName("sportMatches")
    private List<MatchSubscriptionModel> sportMatches;

    public List<MatchSubscriptionModel> getSportMatches() {
        return this.sportMatches;
    }

    public void setSportMatches(List<MatchSubscriptionModel> sportMatches) {
        this.sportMatches = sportMatches;
    }

    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
