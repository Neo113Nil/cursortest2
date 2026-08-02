package org.betup.model.local.entity;

/* loaded from: classes2.dex */
public class EventParam {
    private long eventId;
    private long eventParamId;
    private String key;
    private String value;

    public EventParam() {
    }

    public EventParam(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public void setEventParamId(long eventParamId) {
        this.eventParamId = eventParamId;
    }

    public long getEventId() {
        return this.eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public long getEventParamId() {
        return this.eventParamId;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
