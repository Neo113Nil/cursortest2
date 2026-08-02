package org.betup.model.local.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class Event {
    private String body;
    private long eventId;
    private List<EventParam> eventParams = new ArrayList();
    private long gotTimestamp;
    private boolean isNew;
    private long sentTimestamp;
    private String title;
    private NotificationType type;
    private String uid;
    private int userId;

    public List<EventParam> getEventParams() {
        return this.eventParams;
    }

    public Map<String, String> getParamsAsMap() {
        HashMap hashMap = new HashMap();
        for (EventParam eventParam : this.eventParams) {
            hashMap.put(eventParam.getKey(), eventParam.getValue());
        }
        return hashMap;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isNew() {
        return this.isNew;
    }

    public void setNew(boolean aNew) {
        this.isNew = aNew;
    }

    public void setEventParams(List<EventParam> eventParams) {
        this.eventParams = eventParams;
    }

    public long getEventId() {
        return this.eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public NotificationType getType() {
        return this.type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }

    public long getSentTimestamp() {
        return this.sentTimestamp;
    }

    public void setSentTimestamp(long sentTimestamp) {
        this.sentTimestamp = sentTimestamp;
    }

    public long getGotTimestamp() {
        return this.gotTimestamp;
    }

    public void setGotTimestamp(long gotTimestamp) {
        this.gotTimestamp = gotTimestamp;
    }
}
