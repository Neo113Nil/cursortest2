package com.google.android.gms.internal.ads;

import io.sentry.protocol.SentryStackFrame;

/* loaded from: classes.dex */
public enum zzfjk {
    HTML("html"),
    NATIVE(SentryStackFrame.JsonKeys.NATIVE),
    JAVASCRIPT("javascript");

    private final String zze;

    zzfjk(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
