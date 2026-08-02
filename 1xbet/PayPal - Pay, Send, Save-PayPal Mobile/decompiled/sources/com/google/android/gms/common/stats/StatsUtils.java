package com.google.android.gms.common.stats;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class StatsUtils {
    public static java.lang.String getEventKey(android.os.PowerManager.WakeLock wakeLock, java.lang.String str) {
        java.lang.String valueOf = java.lang.String.valueOf((android.os.Process.myPid() << 32) | java.lang.System.identityHashCode(wakeLock));
        if (true == android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        return java.lang.String.valueOf(valueOf).concat(java.lang.String.valueOf(str));
    }
}
