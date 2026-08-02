package org.betup.model.remote.entity.matches;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class MatchesResponseModel {

    @SerializedName("sports")
    @Expose
    private List<MatchesSportModel> sports = new ArrayList();

    public List<MatchesSportModel> getSports() {
        return this.sports;
    }

    public void setSports(List<MatchesSportModel> sports) {
        this.sports = sports;
    }
}
