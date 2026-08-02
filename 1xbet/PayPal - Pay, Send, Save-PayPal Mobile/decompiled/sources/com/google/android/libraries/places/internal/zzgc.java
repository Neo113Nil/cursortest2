package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzgc extends com.android.volley.toolbox.ImageRequest {
    final /* synthetic */ java.util.Map zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgc(com.google.android.libraries.places.internal.zzgg zzggVar, java.lang.String str, com.android.volley.Response.Listener listener, int i, int i2, android.widget.ImageView.ScaleType scaleType, android.graphics.Bitmap.Config config, com.android.volley.Response.ErrorListener errorListener, java.util.Map map) {
        super(str, listener, 0, 0, scaleType, config, errorListener);
        this.zza = map;
        java.util.Objects.requireNonNull(zzggVar);
    }

    @Override // com.android.volley.Request
    public final java.util.Map getHeaders() {
        return this.zza;
    }
}
