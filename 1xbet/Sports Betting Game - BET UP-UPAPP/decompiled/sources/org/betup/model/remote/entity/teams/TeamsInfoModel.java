package org.betup.model.remote.entity.teams;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import java.util.List;

/* loaded from: classes2.dex */
public class TeamsInfoModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private TeamsMetaModel meta;

    @SerializedName("response")
    @Expose
    private List<TeamsDataModel> response;

    public List<TeamsDataModel> getResponse() {
        return this.response;
    }

    public TeamsMetaModel getMeta() {
        return this.meta;
    }
}
