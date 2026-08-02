package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IlIIIlIlII {
    public java.lang.String llIIlIlIIl = "https://ping.microblink.com/api/v2/ping";
    public java.lang.String IlIllIlIIl = "https://ping.microblink.com/api/v2/ping;multi";

    public final com.microblink.blinkid.secured.IllIlllIll llIIlIlIIl(com.microblink.blinkid.secured.lIllIIlIII lilliiliii) {
        com.microblink.blinkid.secured.IIIIlIlIll llIIlIlIIl = com.microblink.blinkid.secured.IIIIlIlIll.llIIlIlIIl(this.IlIllIlIIl);
        llIIlIlIIl.llIIlIlIIl().setConnectTimeout(10000);
        java.util.List list = lilliiliii.llIIlIlIIl;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((com.microblink.blinkid.ping.Ping) it.next()).llIIlIlIIl());
        }
        llIIlIlIIl.llIIlIlIIl().setRequestProperty("Content-Type", com.statsig.androidsdk.HttpUtils.CONTENT_TYPE_HEADER_VALUE);
        llIIlIlIIl.llIIlIlIIl().setRequestProperty("Accept", "application/json");
        llIIlIlIIl.IllIIIllII();
        if (llIIlIlIIl.IlIllIlIIl == null) {
            throw new com.microblink.blinkid.secured.llllIIIllI(new java.lang.NullPointerException("outputStream == null"));
        }
        try {
            byte[] bytes = jSONArray.toString().getBytes("UTF-8");
            llIIlIlIIl.IlIllIlIIl.write(bytes, 0, bytes.length);
            return new com.microblink.blinkid.secured.IllIlllIll(llIIlIlIIl.IlIllIlIIl());
        } catch (java.lang.Exception e) {
            throw new com.microblink.blinkid.secured.llllIIIllI(e);
        }
    }
}
