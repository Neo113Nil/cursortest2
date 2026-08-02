package org.betup.model.remote.entity.messaging;

import java.util.Date;

/* loaded from: classes2.dex */
public class MessageModel {
    private int id;
    private String message;
    private Date sendDate;
    private CorrespondentModel user;

    public MessageModel() {
    }

    public MessageModel(int id, CorrespondentModel user, String message) {
        this.id = id;
        this.user = user;
        this.message = message;
    }

    public Date getSendDate() {
        return this.sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CorrespondentModel getUser() {
        return this.user;
    }

    public void setUser(CorrespondentModel user) {
        this.user = user;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
