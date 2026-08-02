package com.google.android.gms.internal.ads;

import io.sentry.MeasurementUnit;
import io.sentry.protocol.SentryStackFrame;

/* loaded from: classes.dex */
public enum zzfjt {
    NATIVE(SentryStackFrame.JsonKeys.NATIVE),
    JAVASCRIPT("javascript"),
    NONE(MeasurementUnit.NONE);

    private final String zze;

    zzfjt(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
