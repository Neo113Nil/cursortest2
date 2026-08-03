package com.google.android.exoplayer2.drm;

/* loaded from: classes3.dex */
final class ClearKeyUtil {
    private static final java.lang.String TAG = "ClearKeyUtil";

    private ClearKeyUtil() {
    }

    public static byte[] adjustRequestData(byte[] bArr) {
        return com.google.android.exoplayer2.util.Util.SDK_INT >= 27 ? bArr : com.google.android.exoplayer2.util.Util.getUtf8Bytes(base64ToBase64Url(com.google.android.exoplayer2.util.Util.fromUtf8Bytes(bArr)));
    }

    public static byte[] adjustResponseData(byte[] bArr) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 27) {
            return bArr;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.google.android.exoplayer2.util.Util.fromUtf8Bytes(bArr));
            java.lang.StringBuilder sb = new java.lang.StringBuilder("{\"keys\":[");
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME);
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(base64UrlToBase64(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(base64UrlToBase64(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return com.google.android.exoplayer2.util.Util.getUtf8Bytes(sb.toString());
        } catch (org.json.JSONException e) {
            com.google.android.exoplayer2.util.Log.e(TAG, "Failed to adjust response data: " + com.google.android.exoplayer2.util.Util.fromUtf8Bytes(bArr), e);
            return bArr;
        }
    }

    private static java.lang.String base64ToBase64Url(java.lang.String str) {
        return str.replace('+', '-').replace(kotlinx.io.files.FileSystemKt.UnixPathSeparator, '_');
    }

    private static java.lang.String base64UrlToBase64(java.lang.String str) {
        return str.replace('-', '+').replace('_', kotlinx.io.files.FileSystemKt.UnixPathSeparator);
    }
}
