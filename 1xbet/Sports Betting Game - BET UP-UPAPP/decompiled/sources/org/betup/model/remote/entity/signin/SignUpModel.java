package org.betup.model.remote.entity.signin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;

/* loaded from: classes2.dex */
public class SignUpModel {

    @SerializedName(Mechanism.JsonKeys.META)
    @Expose
    private SignUpMetaModel meta;

    @SerializedName("response")
    @Expose
    private SignUpResponseModel response;

    public SignUpMetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(SignUpMetaModel meta) {
        this.meta = meta;
    }

    public SignUpResponseModel getResponse() {
        return this.response;
    }

    public void setResponse(SignUpResponseModel response) {
        this.response = response;
    }
}
