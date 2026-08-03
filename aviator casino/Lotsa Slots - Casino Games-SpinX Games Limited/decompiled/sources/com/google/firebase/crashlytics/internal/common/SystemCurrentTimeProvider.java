package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes3.dex */
public class SystemCurrentTimeProvider implements com.google.firebase.crashlytics.internal.common.CurrentTimeProvider {
    @Override // com.google.firebase.crashlytics.internal.common.CurrentTimeProvider
    public long getCurrentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }
}
