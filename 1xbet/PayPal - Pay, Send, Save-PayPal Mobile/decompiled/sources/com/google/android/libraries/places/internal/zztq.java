package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zztq extends java.lang.Exception {
    zztq(java.lang.Throwable th, com.google.android.libraries.places.internal.zzuf zzufVar, java.lang.StackTraceElement[] stackTraceElementArr) {
        super(zzufVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        return this;
    }
}
