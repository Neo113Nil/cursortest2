package org.betup.model.remote.entity.user.homescreen;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class HomeScreenModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private MetaModel meta;

    @SerializedName("response")
    @Expose
    private HomeScreenResponseModel response;

    public MetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(MetaModel meta) {
        this.meta = meta;
    }

    public HomeScreenResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(HomeScreenResponseModel response) {
        this.response = response;
    }
}
