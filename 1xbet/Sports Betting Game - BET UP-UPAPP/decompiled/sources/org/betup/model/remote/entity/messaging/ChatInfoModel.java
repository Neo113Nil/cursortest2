package org.betup.model.remote.entity.messaging;

/* loaded from: classes2.dex */
public class ChatInfoModel {
    private int id;
    private int messageCount;
    private String name;
    private int publicId;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicId() {
        return this.publicId;
    }

    public void setPublicId(int publicId) {
        this.publicId = publicId;
    }

    public int getMessageCount() {
        return this.messageCount;
    }

    public void setMessageCount(int messageCount) {
        this.messageCount = messageCount;
    }
}
