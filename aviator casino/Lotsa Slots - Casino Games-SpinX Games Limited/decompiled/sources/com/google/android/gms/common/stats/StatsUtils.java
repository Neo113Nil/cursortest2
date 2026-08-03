package com.google.android.gms.common.stats;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@java.lang.Deprecated
/* loaded from: classes3.dex */
public class StatsUtils {
    public static java.lang.String getEventKey(android.os.PowerManager.WakeLock wakeLock, java.lang.String str) {
        java.lang.String valueOf = java.lang.String.valueOf((android.os.Process.myPid() << 32) | java.lang.System.identityHashCode(wakeLock));
        if (true == android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        java.lang.String.valueOf(valueOf);
        java.lang.String.valueOf(str);
        return java.lang.String.valueOf(valueOf).concat(java.lang.String.valueOf(str));
    }
}
