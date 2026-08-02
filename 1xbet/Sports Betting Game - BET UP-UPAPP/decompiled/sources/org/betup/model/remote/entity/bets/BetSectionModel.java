package org.betup.model.remote.entity.bets;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class BetSectionModel {

    @SerializedName("bets")
    private List<BetGroupSectionModel> groups;

    @SerializedName("match")
    private SubMatchModel section;

    public SubMatchModel getSection() {
        return this.section;
    }

    public void setSection(SubMatchModel section) {
        this.section = section;
    }

    public List<BetGroupSectionModel> getGroups() {
        return this.groups;
    }

    public void setGroups(List<BetGroupSectionModel> groups) {
        this.groups = groups;
    }

    public boolean hasBets() {
        List<BetGroupSectionModel> list = this.groups;
        return list != null && list.size() > 0 && this.groups.get(0).getBets() != null && this.groups.get(0).getBets().size() > 0;
    }

    public BetGroupSectionModel getGroupByIdIfExists(int id) {
        List<BetGroupSectionModel> list = this.groups;
        if (list == null) {
            return null;
        }
        for (BetGroupSectionModel betGroupSectionModel : list) {
            if (betGroupSectionModel.getGroup().getId() == id) {
                return betGroupSectionModel;
            }
        }
        return null;
    }
}
