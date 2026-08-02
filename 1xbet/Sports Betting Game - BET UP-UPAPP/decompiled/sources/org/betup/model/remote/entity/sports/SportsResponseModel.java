package org.betup.model.remote.entity.sports;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class SportsResponseModel {

    @SerializedName("sports")
    @Expose
    private List<SportsDataModel> sports = new ArrayList();

    public List<SportsDataModel> getSports() {
        return this.sports;
    }

    public void setSports(List<SportsDataModel> sports) {
        this.sports = sports;
    }
}
