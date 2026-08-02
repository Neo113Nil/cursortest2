package org.betup.model.remote.entity.error;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;

/* loaded from: classes2.dex */
public class ErrorModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private ErrorMetaDataModel meta;

    public ErrorMetaDataModel getMeta() {
        return this.meta;
    }

    public void setMeta(ErrorMetaDataModel meta) {
        this.meta = meta;
    }
}
