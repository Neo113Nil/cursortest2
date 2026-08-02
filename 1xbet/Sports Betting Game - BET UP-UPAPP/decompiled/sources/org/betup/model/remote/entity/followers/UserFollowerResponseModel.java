package org.betup.model.remote.entity.followers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class UserFollowerResponseModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private MetaModel meta;

    @SerializedName("response")
    @Expose
    private FollowersModel response;

    public MetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(MetaModel meta) {
        this.meta = meta;
    }

    public FollowersModel getResponse() {
        return this.response;
    }

    public void setResponse(FollowersModel response) {
        this.response = response;
    }
}
