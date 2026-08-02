package org.betup.model.remote.entity.search;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;

/* loaded from: classes2.dex */
public class MatchSearchResultModel implements SearchResultModel<MatchDetailsDataModel> {

    @SerializedName("matches")
    private List<MatchDetailsDataModel> matches;

    public List<MatchDetailsDataModel> getMatches() {
        return this.matches;
    }

    public void setMatches(List<MatchDetailsDataModel> matches) {
        this.matches = matches;
    }

    @Override // org.betup.model.remote.entity.search.SearchResultModel
    public List<MatchDetailsDataModel> getItems() {
        return getMatches();
    }
}
