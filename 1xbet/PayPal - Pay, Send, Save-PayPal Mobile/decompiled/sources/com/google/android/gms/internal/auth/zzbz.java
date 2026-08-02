package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
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
