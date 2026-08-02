package org.betup.model.remote.entity.leagues;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import java.util.List;

/* loaded from: classes2.dex */
public class LeaguesInfoModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private LeaguesMetaModel meta;

    @SerializedName("response")
    @Expose
    private List<LeaguesDataModel> response;

    public List<LeaguesDataModel> getResponse() {
        return this.response;
    }

    public LeaguesMetaModel getMeta() {
        return this.meta;
    }
}
