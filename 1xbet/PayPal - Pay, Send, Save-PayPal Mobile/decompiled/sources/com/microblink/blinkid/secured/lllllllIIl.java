package com.microblink.blinkid.secured;

/* loaded from: classes.dex */
public final class lllllllIIl {
    public final com.microblink.blinkid.secured.IlIlIIlIll IlIllIlIIl;
    public final com.microblink.blinkid.secured.IlIlIIlIll IllIIIllII;
    public final double llIIlIlIIl;

    public lllllllIIl(org.json.JSONObject jSONObject, java.lang.String str) {
        this.llIIlIlIIl = 1.0d;
        java.lang.String[] split = str.split("::");
        java.lang.String str2 = split[1];
        java.lang.String str3 = split[0];
        if (jSONObject.has("zeroCopyBufferAllowed")) {
            this.IlIllIlIIl = new com.microblink.blinkid.secured.IlIlIIlIll(jSONObject.getString("zeroCopyBufferAllowed"));
        }
        if (jSONObject.has("eglPbufferNotSupported")) {
            this.IllIIIllII = new com.microblink.blinkid.secured.IlIlIIlIll(jSONObject.getString("eglPbufferNotSupported"));
        }
        if (jSONObject.has("frameQualityFactor")) {
            this.llIIlIlIIl = jSONObject.getDouble("frameQualityFactor");
        }
    }
}
