package org.betup.model.remote.entity.support;

import com.google.gson.annotations.SerializedName;
import io.sentry.SentryBaseEvent;

/* loaded from: classes2.dex */
public class V7SupportMessageDto {

    @SerializedName("id")
    private Long id;

    @SerializedName("message")
    private String message;

    @SerializedName("sendDate")
    private String sendDate;

    @SerializedName(SentryBaseEvent.JsonKeys.USER)
    private V7SupportMessageUserDto user;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public V7SupportMessageUserDto getUser() {
        return this.user;
    }

    public void setUser(V7SupportMessageUserDto user) {
        this.user = user;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSendDate() {
        return this.sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }
}
