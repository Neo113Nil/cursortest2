package com.google.android.gms.internal.ads;

import io.sentry.protocol.Request;

/* JADX INFO: loaded from: classes.dex */
public enum zzfjn {
    CTV("ctv"),
    MOBILE("mobile"),
    OTHER(Request.JsonKeys.OTHER);

    private final String zze;

    zzfjn(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
