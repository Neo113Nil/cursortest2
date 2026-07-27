package com.onesignal.core.internal.time.impl;

import android.os.Process;
import android.os.SystemClock;
import com.onesignal.core.internal.time.ITime;

/* loaded from: classes.dex */
public final class Time implements ITime {
    @Override // com.onesignal.core.internal.time.ITime
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // com.onesignal.core.internal.time.ITime
    public long getProcessUptimeMillis() {
        return SystemClock.uptimeMillis() - Process.getStartUptimeMillis();
    }
}
