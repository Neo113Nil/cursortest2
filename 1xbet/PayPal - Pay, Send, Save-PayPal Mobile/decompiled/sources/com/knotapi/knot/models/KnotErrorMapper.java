package com.knotapi.knot.models;

/* loaded from: classes9.dex */
public class KnotErrorMapper {
    public static com.knotapi.knot.models.KnotError map(java.lang.String str) {
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("errorCode", "Internal_Error");
            switch (optString.hashCode()) {
                case -2006660986:
                    if (optString.equals("Client_ID_Not_Found")) {
                        return com.knotapi.knot.models.KnotError.INVALID_CLIENT_ID;
                    }
                    break;
                case -1878152761:
                    if (optString.equals("INVALID_LOGO_ID")) {
                        return com.knotapi.knot.models.KnotError.INVALID_LOGO_ID;
                    }
                    break;
                case -1693047731:
                    if (optString.equals("Session_Not_Found")) {
                        return com.knotapi.knot.models.KnotError.INVALID_SESSION;
                    }
                    break;
                case 296974834:
                    if (optString.equals("INVALID_CARD_NAME")) {
                        return com.knotapi.knot.models.KnotError.INVALID_CARD_NAME;
                    }
                    break;
                case 605589961:
                    if (optString.equals("MERCHANT_ID_NOT_FOUND")) {
                        return com.knotapi.knot.models.KnotError.MERCHANT_ID_NOT_FOUND;
                    }
                    break;
                case 756623932:
                    if (optString.equals("Session_Expired")) {
                        return com.knotapi.knot.models.KnotError.EXPIRED_SESSION;
                    }
                    break;
                case 1535754724:
                    if (optString.equals("INVALID_CUSTOMER_NAME")) {
                        return com.knotapi.knot.models.KnotError.INVALID_CUSTOMER_NAME;
                    }
                    break;
            }
            return com.knotapi.knot.models.KnotError.INTERNAL_ERROR;
        } catch (org.json.JSONException unused) {
            return com.knotapi.knot.models.KnotError.INTERNAL_ERROR;
        }
    }
}
