package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class EncodedPolyline implements com.google.android.libraries.places.api.model.Polyline {
    public static com.google.android.libraries.places.api.model.EncodedPolyline newInstance(java.lang.String str) {
        com.google.common.base.Preconditions.checkArgument(!android.text.TextUtils.isEmpty(str), "Encoded polyline must not contain empty values.");
        return new com.google.android.libraries.places.api.model.zzdk(str);
    }

    public abstract java.lang.String getEncodedPolyline();
}
