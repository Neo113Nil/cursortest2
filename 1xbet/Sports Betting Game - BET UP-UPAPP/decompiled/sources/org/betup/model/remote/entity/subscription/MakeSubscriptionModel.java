package org.betup.model.remote.entity.subscription;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class MakeSubscriptionModel {

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    @SerializedName("response")
    private SubscriptionModel subscription;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public SubscriptionModel getSubscription() {
        return this.subscription;
    }

    public void setSubscription(SubscriptionModel subscription) {
        this.subscription = subscription;
    }
}
