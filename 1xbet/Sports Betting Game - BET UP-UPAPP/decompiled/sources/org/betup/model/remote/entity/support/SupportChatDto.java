package org.betup.model.remote.entity.support;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class SupportChatDto {

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    private Boolean active;

    @SerializedName("category")
    private SupportChatCategoryDto category;

    @SerializedName("chatId")
    private Integer chatId;

    @SerializedName("chatName")
    private String chatName;

    @SerializedName("chatType")
    private String chatType;

    @SerializedName("correspondentId")
    private String correspondentId;

    @SerializedName("correspondentName")
    private String correspondentName;

    @SerializedName("isActive")
    private Boolean isActive;

    @SerializedName("isPriority")
    private Boolean isPriority;

    @SerializedName("isRead")
    private Boolean isRead;

    @SerializedName("lastMessageDate")
    private String lastMessageDate;

    @SerializedName("lastMessageText")
    private String lastMessageText;

    @SerializedName("photoUrl")
    private String photoUrl;

    @SerializedName("priority")
    private Boolean priority;

    @SerializedName("read")
    private Boolean read;

    public String getCorrespondentName() {
        return this.correspondentName;
    }

    public void setCorrespondentName(String correspondentName) {
        this.correspondentName = correspondentName;
    }

    public String getChatName() {
        return this.chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public Integer getChatId() {
        return this.chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public String getChatIdAsString() {
        Integer num = this.chatId;
        return num != null ? num.toString() : "";
    }

    public String getCorrespondentId() {
        return this.correspondentId;
    }

    public void setCorrespondentId(String correspondentId) {
        this.correspondentId = correspondentId;
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

    public String getLastMessageDate() {
        return this.lastMessageDate;
    }

    public void setLastMessageDate(String lastMessageDate) {
        this.lastMessageDate = lastMessageDate;
    }

    public Boolean getRead() {
        Boolean bool = this.read;
        return bool != null ? bool : this.isRead;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    public Boolean getPriority() {
        Boolean bool = this.priority;
        return bool != null ? bool : this.isPriority;
    }

    public void setPriority(Boolean priority) {
        this.priority = priority;
    }

    public Boolean getActive() {
        Boolean bool = this.active;
        return bool != null ? bool : this.isActive;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getIsRead() {
        return getRead();
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
        this.read = isRead;
    }

    public Boolean getIsPriority() {
        return getPriority();
    }

    public void setIsPriority(Boolean isPriority) {
        this.isPriority = isPriority;
        this.priority = isPriority;
    }

    public Boolean getIsActive() {
        return getActive();
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
        this.active = isActive;
    }

    public SupportChatCategoryDto getCategory() {
        return this.category;
    }

    public void setCategory(SupportChatCategoryDto category) {
        this.category = category;
    }
}
