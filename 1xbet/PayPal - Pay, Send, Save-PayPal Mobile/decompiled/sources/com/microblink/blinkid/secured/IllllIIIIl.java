package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IllllIIIIl {
    public final com.microblink.blinkid.secured.IlIlIIlIll IIlIIIllIl;
    public final java.lang.String IlIllIlIIl;
    public final com.microblink.blinkid.secured.IlIlIIlIll IlIllIlllI;
    public final int IllIIIIllI;
    public final com.microblink.blinkid.secured.IIIllIIlIl IllIIIllII;
    public final com.microblink.blinkid.secured.IlIlIIlIll IllIIlIIII;
    public final com.microblink.blinkid.secured.IlIlIIlIll lIIIIIlIlI;
    public final com.microblink.blinkid.secured.IlIlIIlIll lIIIIIllll;
    public final double lIlIIIIlIl;
    public final com.microblink.blinkid.secured.IIIllIIlIl llIIIlllll;
    public final double llIIlIIlll;
    public final java.lang.String llIIlIlIIl;
    public final com.microblink.blinkid.secured.IlIlIIlIll lllIIIlIlI;
    public final com.microblink.blinkid.secured.IlIlIIlIll lllIlIlIIl;

    public IllllIIIIl(java.lang.String str, java.lang.String str2) {
        this.IllIIIIllI = -1;
        this.lIlIIIIlIl = 0.0d;
        this.llIIlIIlll = 1.0d;
        if (str == null || str2 == null) {
            throw new java.lang.IllegalArgumentException("Device and Model cannot be null");
        }
        this.llIIlIlIIl = str;
        this.IlIllIlIIl = str2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceInfo{mDevice='");
        sb.append(this.llIIlIlIIl);
        sb.append("', mModel='");
        sb.append(this.IlIllIlIIl);
        sb.append("'}");
        return sb.toString();
    }

    public IllllIIIIl(org.json.JSONObject jSONObject, java.lang.String str) {
        this.IllIIIIllI = -1;
        this.lIlIIIIlIl = 0.0d;
        this.llIIlIIlll = 1.0d;
        java.lang.String[] split = str.split("::");
        this.IlIllIlIIl = split[1];
        this.llIIlIlIIl = split[0];
        if (jSONObject.has("backFacingPreviewSize")) {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("backFacingPreviewSize");
            this.IllIIIllII = new com.microblink.blinkid.secured.IIIllIIlIl(jSONArray.getInt(0), jSONArray.getInt(1));
        }
        if (jSONObject.has("frontFacingPreviewSize")) {
            org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("frontFacingPreviewSize");
            this.llIIIlllll = new com.microblink.blinkid.secured.IIIllIIlIl(jSONArray2.getInt(0), jSONArray2.getInt(1));
        }
        if (jSONObject.has("cameraInitDelayMs")) {
            this.IllIIIIllI = jSONObject.getInt("cameraInitDelayMs");
        }
        if (jSONObject.has("minZoomLevel")) {
            this.lIlIIIIlIl = jSONObject.getDouble("minZoomLevel");
        }
        if (jSONObject.has("maxZoomLevel")) {
            this.llIIlIIlll = jSONObject.getDouble("maxZoomLevel");
        }
        if (jSONObject.has("displayOrientationNotWorking")) {
            this.IIlIIIllIl = new com.microblink.blinkid.secured.IlIlIIlIll(jSONObject.getString("displayOrientationNotWorking"));
        }
        if (jSONObject.has("naturalOrientationIsLandscapeLeft")) {
            this.lIIIIIllll = new com.microblink.blinkid.secured.IlIlIIlIll(jSONObject.getString("naturalOrientationIsLandscapeLeft"));
        }
        if (jSONObject.has("focusUntrusty")) {
            this.lllIIIlIlI = new com.microblink.blinkid.secured.IlIlIIlIll(jSONObject.getString("focusUntrusty"));
        }
        if (jSONObject.has("meteringNotWorking")) {
            this.IlIllIlllI = new com.microblink.blinkid.secured.IlIlIIlIll(jSONObject.getString("meteringNotWorking"));
        }
        if (jSONObject.has("phaseAutoFocusSupported")) {
            this.lllIlIlIIl = new com.microblink.blinkid.secured.IlIlIIlIll(jSONObject.getString("phaseAutoFocusSupported"));
        }
        if (jSONObject.has("forceUseLegacyCamera")) {
            this.IllIIlIIII = new com.microblink.blinkid.secured.IlIlIIlIll(jSONObject.getString("forceUseLegacyCamera"));
        }
        if (jSONObject.has("preferTextureView")) {
            this.lIIIIIlIlI = new com.microblink.blinkid.secured.IlIlIIlIll(jSONObject.getString("preferTextureView"));
        }
    }
}
