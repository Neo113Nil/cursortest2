package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
public abstract class zzbz extends com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse {
    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (java.io.UnsupportedEncodingException e) {
            android.util.Log.e("AUTH", "Error serializing object.", e);
            return null;
        }
    }
}
