package com.google.android.datatransport.runtime.time;

/* loaded from: classes3.dex */
public class WallTimeClock implements com.google.android.datatransport.runtime.time.Clock {
    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return java.lang.System.currentTimeMillis();
    }
}
