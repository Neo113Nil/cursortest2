package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzbh extends java.lang.RuntimeException {
    public zzbh(java.lang.String str) {
        super(str);
    }

    public zzbh(java.lang.String str, java.lang.Throwable th) {
        super("Failed to initialize FileStorage", th);
    }
}
