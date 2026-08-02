package com.microblink.blinkid.ping;

/* loaded from: classes10.dex */
public class Ping {
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private java.util.HashMap getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
    private final java.lang.String getHighSpeedVideoSizes;

    public Ping(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.microblink.blinkid.ping.Ping ping = (com.microblink.blinkid.ping.Ping) obj;
        java.lang.String str = this.getHighSpeedVideoSizes;
        if (str == null ? ping.getHighSpeedVideoSizes != null : !str.equals(ping.getHighSpeedVideoSizes)) {
            return false;
        }
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        if (str2 == null ? ping.getHighSpeedVideoFpsRanges != null : !str2.equals(ping.getHighSpeedVideoFpsRanges)) {
            return false;
        }
        java.lang.String str3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (str3 == null ? ping.getHighResolutionOutputSizeshNQ4ISI == null : str3.equals(ping.getHighResolutionOutputSizeshNQ4ISI)) {
            return this.getHighSpeedVideoFpsRangesFor.equals(ping.getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.getHighSpeedVideoSizes;
        int hashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        java.util.HashMap hashMap = this.getHighSpeedVideoFpsRangesFor;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (hashMap != null ? hashMap.hashCode() : 0);
    }

    public static com.microblink.blinkid.ping.Ping llIIlIlIIl(org.json.JSONObject jSONObject) {
        com.microblink.blinkid.ping.Ping ping = new com.microblink.blinkid.ping.Ping(jSONObject.getString("payload"), jSONObject.getString("signature"), jSONObject.getString("signatureVersion"));
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("extra");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            hashMap.put(next, jSONObject2.getString(next));
        }
        ping.getHighSpeedVideoFpsRangesFor = hashMap;
        return ping;
    }

    public final void llIIlIlIIl(java.util.HashMap hashMap) {
        this.getHighSpeedVideoFpsRangesFor = hashMap;
    }

    public final org.json.JSONObject llIIlIlIIl() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("payload", this.getHighSpeedVideoSizes);
        jSONObject.put("signature", this.getHighSpeedVideoFpsRanges);
        jSONObject.put("signatureVersion", this.getHighResolutionOutputSizeshNQ4ISI);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        for (java.util.Map.Entry entry : this.getHighSpeedVideoFpsRangesFor.entrySet()) {
            jSONObject2.put((java.lang.String) entry.getKey(), entry.getValue());
        }
        jSONObject.put("extra", jSONObject2);
        return jSONObject;
    }
}
