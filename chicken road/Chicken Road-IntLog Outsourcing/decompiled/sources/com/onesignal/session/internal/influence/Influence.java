package com.onesignal.session.internal.influence;

import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Influence {
    public static final Companion Companion = new Companion(null);
    public static final String INFLUENCE_CHANNEL = "influence_channel";
    public static final String INFLUENCE_IDS = "influence_ids";
    public static final String INFLUENCE_TYPE = "influence_type";
    private JSONArray ids;
    private InfluenceChannel influenceChannel;
    private InfluenceType influenceType;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public Influence(String jsonString) {
        i.e(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString);
        String string = jSONObject.getString(INFLUENCE_CHANNEL);
        String string2 = jSONObject.getString(INFLUENCE_TYPE);
        String string3 = jSONObject.getString(INFLUENCE_IDS);
        this.influenceChannel = InfluenceChannel.Companion.fromString(string);
        this.influenceType = InfluenceType.Companion.fromString(string2);
        i.b(string3);
        this.ids = string3.length() == 0 ? null : new JSONArray(string3);
    }

    public final Influence copy() {
        return new Influence(this.influenceChannel, this.influenceType, this.ids);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Influence.class.equals(obj.getClass())) {
            return false;
        }
        Influence influence = (Influence) obj;
        return this.influenceChannel == influence.influenceChannel && this.influenceType == influence.influenceType;
    }

    public final String getDirectId() {
        JSONArray jSONArray = this.ids;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        return jSONArray.getString(0);
    }

    public final JSONArray getIds() {
        return this.ids;
    }

    public final InfluenceChannel getInfluenceChannel() {
        return this.influenceChannel;
    }

    public final InfluenceType getInfluenceType() {
        return this.influenceType;
    }

    public int hashCode() {
        return this.influenceType.hashCode() + (this.influenceChannel.hashCode() * 31);
    }

    public final void setIds(JSONArray jSONArray) {
        this.ids = jSONArray;
    }

    public final void setInfluenceType(InfluenceType influenceType) {
        i.e(influenceType, "<set-?>");
        this.influenceType = influenceType;
    }

    public final String toJSONString() {
        JSONObject put = new JSONObject().put(INFLUENCE_CHANNEL, this.influenceChannel.toString()).put(INFLUENCE_TYPE, this.influenceType.toString());
        JSONArray jSONArray = this.ids;
        String jSONObject = put.put(INFLUENCE_IDS, jSONArray != null ? String.valueOf(jSONArray) : "").toString();
        i.d(jSONObject, "toString(...)");
        return jSONObject;
    }

    public String toString() {
        return "SessionInfluence{influenceChannel=" + this.influenceChannel + ", influenceType=" + this.influenceType + ", ids=" + this.ids + '}';
    }

    public Influence(InfluenceChannel influenceChannel, InfluenceType influenceType, JSONArray jSONArray) {
        i.e(influenceChannel, "influenceChannel");
        i.e(influenceType, "influenceType");
        this.influenceChannel = influenceChannel;
        this.influenceType = influenceType;
        this.ids = jSONArray;
    }
}
