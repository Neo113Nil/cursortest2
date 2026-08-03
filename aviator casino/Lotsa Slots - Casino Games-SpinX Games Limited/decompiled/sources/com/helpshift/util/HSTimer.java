package com.helpshift.util;

/* loaded from: classes5.dex */
public class HSTimer {
    private static final java.util.Map<java.lang.String, java.lang.Long> sourceTimer = new java.util.HashMap();

    private HSTimer() {
    }

    public static void setStartTime(java.lang.String str) {
        sourceTimer.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public static long endTimer(java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.helpshift.util.Utils.isEmpty(str)) {
            return -1L;
        }
        java.util.Map<java.lang.String, java.lang.Long> map = sourceTimer;
        if (map.containsKey(str)) {
            return currentTimeMillis - map.remove(str).longValue();
        }
        return -1L;
    }
}
