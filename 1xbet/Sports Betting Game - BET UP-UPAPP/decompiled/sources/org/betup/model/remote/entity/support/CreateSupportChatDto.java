package org.betup.model.remote.entity.support;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class CreateSupportChatDto {

    @SerializedName("categoryId")
    private String categoryId;

    @SerializedName("chatName")
    private String chatName;

    @SerializedName("message")
    private String message;

    public CreateSupportChatDto() {
    }

    public CreateSupportChatDto(String chatName, String message, String categoryId) {
        this.chatName = chatName;
        this.message = message;
        this.categoryId = categoryId;
    }

    public String getChatName() {
        return this.chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
