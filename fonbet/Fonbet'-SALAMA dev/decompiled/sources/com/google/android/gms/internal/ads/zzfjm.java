package com.google.android.gms.internal.ads;

import io.sentry.rrweb.RRWebVideoEvent;

/* loaded from: classes.dex */
public enum zzfjm {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(RRWebVideoEvent.EVENT_TAG),
    AUDIO("audio");

    private final String zzg;

    zzfjm(String str) {
        this.zzg = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzg;
    }
}
