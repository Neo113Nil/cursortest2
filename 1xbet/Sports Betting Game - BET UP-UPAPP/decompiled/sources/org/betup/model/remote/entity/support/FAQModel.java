package org.betup.model.remote.entity.support;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import java.util.List;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class FAQModel {

    @SerializedName("response")
    private List<FAQDataModel> items;

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public List<FAQDataModel> getItems() {
        return this.items;
    }

    public void setItems(List<FAQDataModel> items) {
        this.items = items;
    }
}
