package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import com.vk.sdk.api.model.VKApiCommunityFull;
import java.io.Serializable;
import org.betup.model.remote.entity.CompetitionPrizeType;

/* loaded from: classes2.dex */
public class CompetitionPrizeModel implements Serializable {

    @SerializedName(VKApiCommunityFull.PLACE)
    private CompetitionPrizeType competitionPrizeType;

    @SerializedName("id")
    private int id;

    @SerializedName("prize")
    private long prize;

    @SerializedName("type")
    private int type;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPrize() {
        return this.prize;
    }

    public void setPrize(long prize) {
        this.prize = prize;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public CompetitionPrizeType getCompetitionPrizeType() {
        return this.competitionPrizeType;
    }

    public void setCompetitionPrizeType(CompetitionPrizeType competitionPrizeType) {
        this.competitionPrizeType = competitionPrizeType;
    }
}
