package org.betup.model.remote.entity.user.video;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class VideoResponseModel {

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    @SerializedName("response")
    VideoResponseDataModel videoResponseDataModel;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public VideoResponseDataModel getVideoResponseDataModel() {
        return this.videoResponseDataModel;
    }

    public void setVideoResponseDataModel(VideoResponseDataModel videoResponseDataModel) {
        this.videoResponseDataModel = videoResponseDataModel;
    }
}
