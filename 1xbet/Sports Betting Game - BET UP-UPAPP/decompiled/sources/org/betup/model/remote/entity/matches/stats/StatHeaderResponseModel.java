package org.betup.model.remote.entity.matches.stats;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import java.util.Map;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class StatHeaderResponseModel {

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel meta;

    @SerializedName("response")
    private Map<String, Boolean> response;

    public MetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(MetaModel meta) {
        this.meta = meta;
    }

    public Map<String, Boolean> getResponse() {
        return this.response;
    }

    public void setResponse(Map<String, Boolean> response) {
        this.response = response;
    }
}
