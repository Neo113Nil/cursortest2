package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzfw extends com.android.volley.toolbox.JsonObjectRequest {
    final /* synthetic */ java.util.Map zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfw(com.google.android.libraries.places.internal.zzga zzgaVar, int i, java.lang.String str, org.json.JSONObject jSONObject, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorListener, java.util.Map map) {
        super(0, str, null, listener, errorListener);
        this.zza = map;
        java.util.Objects.requireNonNull(zzgaVar);
    }

    @Override // com.android.volley.Request
    public final java.util.Map getHeaders() {
        return this.zza;
    }
}
