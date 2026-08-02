package org.betup.model.remote.entity.support;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class ChatReadStatusDto {

    @SerializedName("chatId")
    private Long chatId;

    @SerializedName("userReadStatus")
    private Boolean userReadStatus;

    public Long getChatId() {
        return this.chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public Boolean getUserReadStatus() {
        return this.userReadStatus;
    }

    public void setUserReadStatus(Boolean userReadStatus) {
        this.userReadStatus = userReadStatus;
    }
}
