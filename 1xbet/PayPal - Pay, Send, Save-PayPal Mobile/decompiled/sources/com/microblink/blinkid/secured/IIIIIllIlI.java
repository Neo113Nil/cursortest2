package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIIIIllIlI extends com.microblink.blinkid.secured.llIIlIlIlI {
    public IIIIIllIlI(android.content.Context context) {
        super("com.microblink.blinkid.ping.preferences", context);
    }

    public final java.util.ArrayList llIIlIlIIl() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String string = this.llIIlIlIIl.getString("com.microblink.blinkid.ping.preferences.pingRecords", null);
        if (string == null || string.length() < 3) {
            return arrayList;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(com.microblink.blinkid.ping.Ping.llIIlIlIIl(jSONArray.getJSONObject(i)));
            }
            return arrayList;
        } catch (java.lang.Exception e) {
            com.microblink.blinkid.util.Log.e(this, e, "PingStorage.getStoredPings failed.", new java.lang.Object[0]);
            return new java.util.ArrayList();
        }
    }

    public final void llIIlIlIIl(java.util.ArrayList arrayList) {
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.microblink.blinkid.ping.Ping) it.next()).llIIlIlIIl());
            }
            llIIlIlIIl("com.microblink.blinkid.ping.preferences.pingRecords", jSONArray.toString());
        } catch (java.lang.Exception e) {
            com.microblink.blinkid.util.Log.e(this, e, "PingStorage.storePingData failed.", new java.lang.Object[0]);
        }
    }
}
