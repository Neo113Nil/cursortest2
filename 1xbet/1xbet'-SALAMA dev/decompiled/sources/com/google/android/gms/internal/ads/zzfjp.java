package com.google.android.gms.internal.ads;

import io.sentry.protocol.Request;

/* JADX INFO: loaded from: classes.dex */
public enum zzfjp {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER(Request.JsonKeys.OTHER);

    private final String zzj;

    zzfjp(String str) {
        this.zzj = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzj;
    }
}
