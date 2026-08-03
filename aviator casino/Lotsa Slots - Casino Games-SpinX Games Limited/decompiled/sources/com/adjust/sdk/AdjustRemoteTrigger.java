package com.adjust.sdk;

/* loaded from: classes2.dex */
public class AdjustRemoteTrigger {
    private final java.lang.String label;
    private final org.json.JSONObject payload;

    public AdjustRemoteTrigger(java.lang.String str, org.json.JSONObject jSONObject) {
        this.label = str;
        this.payload = jSONObject;
    }

    public java.lang.String getLabel() {
        return this.label;
    }

    public org.json.JSONObject getPayload() {
        return this.payload;
    }

    public java.lang.String toString() {
        return "AdjustRemoteTrigger{label='" + this.label + "', payload=" + this.payload + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ;
    }
}
