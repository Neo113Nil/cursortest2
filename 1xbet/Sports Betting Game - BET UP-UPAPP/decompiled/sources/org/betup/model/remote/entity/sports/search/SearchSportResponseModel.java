package org.betup.model.remote.entity.sports.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.vk.sdk.api.VKApiConst;
import java.util.ArrayList;
import java.util.List;
import org.betup.model.remote.entity.teams.TeamsDataModel;

/* loaded from: classes2.dex */
public class SearchSportResponseModel {

    @SerializedName(VKApiConst.Q)
    @Expose
    private String q;

    @SerializedName("sports")
    @Expose
    private List<TeamsDataModel> sports = new ArrayList();

    public List<TeamsDataModel> getSports() {
        return this.sports;
    }

    public void setSports(List<TeamsDataModel> sports) {
        this.sports = sports;
    }

    public String getQ() {
        return this.q;
    }

    public void setQ(String q) {
        this.q = q;
    }
}
