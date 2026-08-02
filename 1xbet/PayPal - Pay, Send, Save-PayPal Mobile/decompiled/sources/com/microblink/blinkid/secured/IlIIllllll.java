package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class IlIIllllll {
    public static org.json.JSONObject llIIlIlIIl(android.content.Context context, com.microblink.blinkid.secured.IlIIIllIII ilIIIllIII) {
        java.lang.String obj;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        llIIlIlIIl(jSONObject, "licenseId", com.microblink.blinkid.recognition.RightsManager.IlIllIlIIl());
        llIIlIlIIl(jSONObject, "licensee", com.microblink.blinkid.recognition.RightsManager.IllIIIllII());
        try {
            jSONObject.put("applicationIds", com.microblink.blinkid.recognition.RightsManager.llIIlIlIIl());
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
        llIIlIlIIl(jSONObject, com.visa.cbp.ConsumerInfo.setSignature, context.getPackageName());
        com.microblink.blinkid.secured.IIlIIllIII IllIIIllII = com.microblink.blinkid.settings.NativeLibraryInfo.IllIIIllII();
        llIIlIlIIl(jSONObject, "product", com.microblink.blinkid.secured.lIIllllllI.llIIlIlIIl(IllIIIllII.llIIlIlIIl));
        llIIlIlIIl(jSONObject, "productVersion", IllIIIllII.IlIllIlIIl);
        com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.ClassInfo classInfo = ilIIIllIII.llIIlIlIIl;
        if (classInfo.getIsoAlpha2CountryCode().isEmpty()) {
            obj = "unknown";
        } else {
            java.lang.String isoAlpha2CountryCode = classInfo.getIsoAlpha2CountryCode();
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = isoAlpha2CountryCode.toLowerCase(locale);
            java.lang.String lowerCase2 = classInfo.getRegion().toString().toLowerCase(locale);
            java.lang.String lowerCase3 = classInfo.getType().toString().toLowerCase(locale);
            if (lowerCase2.isEmpty() || classInfo.getRegion() == com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region.NONE) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(lowerCase);
                sb.append("-");
                sb.append(lowerCase3);
                obj = sb.toString();
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(lowerCase);
                sb2.append("-");
                sb2.append(lowerCase2);
                sb2.append("-");
                sb2.append(lowerCase3);
                obj = sb2.toString();
            }
        }
        llIIlIlIIl(jSONObject, com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.VerificationConstants.ClassInfo, obj);
        llIIlIlIIl(jSONObject, "resultState", ilIIIllIII.IlIllIlIIl.toString());
        llIIlIlIIl(jSONObject, "type", ilIIIllIII.llIIlIlIIl.getType().toString());
        llIIlIlIIl(jSONObject, com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, ilIIIllIII.llIIlIlIIl.getIsoAlpha2CountryCode());
        llIIlIlIIl(jSONObject, "processingStatus", ilIIIllIII.IllIIIllII.toString());
        llIIlIlIIl(jSONObject, com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.VerificationConstants.RecognitionMode, ilIIIllIII.llIIIlllll.toString());
        return jSONObject;
    }

    public static void llIIlIlIIl(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }
}
