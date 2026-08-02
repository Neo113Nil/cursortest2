package org.betup.model.remote.entity.matches.like;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class LikeModel {

    @SerializedName("response")
    private LikeResponseModel likeResponseModel;

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public LikeResponseModel getLikeResponseModel() {
        return this.likeResponseModel;
    }

    public void setLikeResponseModel(LikeResponseModel likeResponseModel) {
        this.likeResponseModel = likeResponseModel;
    }
}
