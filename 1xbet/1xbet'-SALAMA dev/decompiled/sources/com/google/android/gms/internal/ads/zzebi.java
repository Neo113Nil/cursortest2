package com.google.android.gms.internal.ads;

import io.sentry.rrweb.RRWebVideoEvent;

/* JADX INFO: loaded from: classes.dex */
public enum zzebi {
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(RRWebVideoEvent.EVENT_TAG);

    private final String zze;

    zzebi(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
