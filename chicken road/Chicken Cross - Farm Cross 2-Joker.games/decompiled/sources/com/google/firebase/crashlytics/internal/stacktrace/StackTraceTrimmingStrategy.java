package com.google.firebase.crashlytics.internal.stacktrace;

/* loaded from: classes8.dex */
public interface StackTraceTrimmingStrategy {
    StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr);
}
