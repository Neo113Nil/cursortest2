package com.onesignal.session.internal.outcomes.impl;

import b2.AbstractC0279e;
import kotlin.jvm.internal.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class OutcomeEventParams {
    private final String outcomeId;
    private final OutcomeSource outcomeSource;
    private long sessionTime;
    private long timestamp;
    private float weight;

    public OutcomeEventParams(String outcomeId, OutcomeSource outcomeSource, float f3, long j2, long j6) {
        i.e(outcomeId, "outcomeId");
        this.outcomeId = outcomeId;
        this.outcomeSource = outcomeSource;
        this.weight = f3;
        this.sessionTime = j2;
        this.timestamp = j6;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final OutcomeSource getOutcomeSource() {
        return this.outcomeSource;
    }

    public final long getSessionTime() {
        return this.sessionTime;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final boolean isUnattributed() {
        OutcomeSource outcomeSource = this.outcomeSource;
        return outcomeSource == null || (outcomeSource.getDirectBody() == null && this.outcomeSource.getIndirectBody() == null);
    }

    public final void setSessionTime(long j2) {
        this.sessionTime = j2;
    }

    public final void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    public final void setWeight(float f3) {
        this.weight = f3;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put(OutcomeConstants.OUTCOME_ID, this.outcomeId);
        OutcomeSource outcomeSource = this.outcomeSource;
        if (outcomeSource != null) {
            put.put(OutcomeConstants.OUTCOME_SOURCES, outcomeSource.toJSONObject());
        }
        float f3 = this.weight;
        if (f3 > 0.0f) {
            put.put("weight", Float.valueOf(f3));
        }
        long j2 = this.timestamp;
        if (j2 > 0) {
            put.put("timestamp", j2);
        }
        long j6 = this.sessionTime;
        if (j6 > 0) {
            put.put("session_time", j6);
        }
        i.b(put);
        return put;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OutcomeEventParams{outcomeId='");
        sb.append(this.outcomeId);
        sb.append("', outcomeSource=");
        sb.append(this.outcomeSource);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", sessionTime=");
        return AbstractC0279e.g(sb, this.sessionTime, '}');
    }
}
