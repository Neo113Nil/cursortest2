package org.betup.model.remote.entity.leagues;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.betup.model.remote.entity.search.SearchResultModel;

/* loaded from: classes2.dex */
public class SearchLeaguesResponseModel implements SearchResultModel<LeaguesDataModel> {

    @SerializedName("leagues")
    @Expose
    private List<LeaguesDataModel> leagues = new ArrayList();

    @SerializedName("count")
    @Expose
    private List<Integer> count = new ArrayList();

    public List<LeaguesDataModel> getLeagues() {
        return this.leagues;
    }

    public void setLeagues(List<LeaguesDataModel> leagues) {
        this.leagues = leagues;
    }

    public List<Integer> getCount() {
        return this.count;
    }

    public void setCount(List<Integer> count) {
        this.count = count;
    }

    @Override // org.betup.model.remote.entity.search.SearchResultModel
    public List<LeaguesDataModel> getItems() {
        return getLeagues();
    }
}
