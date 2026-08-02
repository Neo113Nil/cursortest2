package org.betup.model.remote.entity.messaging;

import java.util.Date;

/* loaded from: classes2.dex */
public class ChatModel {
    private Long chatId;
    private String chatType;
    private Long correspondentId;
    private Date lastMessageDate;
    private String lastMessageText;
    private String name;
    private String photoUrl;
    private boolean read;

    public Long getChatId() {
        return this.chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public Long getCorrespondentId() {
        return this.correspondentId;
    }

    public void setCorrespondentId(Long correspondentId) {
        this.correspondentId = correspondentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChatType() {
        return this.chatType;
    }

    public void setChatType(String chatType) {
        this.chatType = chatType;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getLastMessageText() {
        return this.lastMessageText;
    }

    public void setLastMessageText(String lastMessageText) {
        this.lastMessageText = lastMessageText;
    }

    public Date getLastMessageDate() {
        return this.lastMessageDate;
    }

    public void setLastMessageDate(Date lastMessageDate) {
        this.lastMessageDate = lastMessageDate;
    }

    public boolean isRead() {
        return this.read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
}
