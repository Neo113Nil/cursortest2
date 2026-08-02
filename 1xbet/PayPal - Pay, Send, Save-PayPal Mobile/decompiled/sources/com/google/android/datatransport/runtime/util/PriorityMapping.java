package com.google.android.datatransport.runtime.util;

/* loaded from: classes3.dex */
public final class PriorityMapping {
    private static java.util.HashMap<com.google.android.datatransport.Priority, java.lang.Integer> PRIORITY_INT_MAP;
    private static android.util.SparseArray<com.google.android.datatransport.Priority> PRIORITY_MAP = new android.util.SparseArray<>();

    static {
        java.util.HashMap<com.google.android.datatransport.Priority, java.lang.Integer> hashMap = new java.util.HashMap<>();
        PRIORITY_INT_MAP = hashMap;
        hashMap.put(com.google.android.datatransport.Priority.DEFAULT, 0);
        PRIORITY_INT_MAP.put(com.google.android.datatransport.Priority.VERY_LOW, 1);
        PRIORITY_INT_MAP.put(com.google.android.datatransport.Priority.HIGHEST, 2);
        for (com.google.android.datatransport.Priority priority : PRIORITY_INT_MAP.keySet()) {
            PRIORITY_MAP.append(PRIORITY_INT_MAP.get(priority).intValue(), priority);
        }
    }

    public static com.google.android.datatransport.Priority valueOf(int i) {
        com.google.android.datatransport.Priority priority = PRIORITY_MAP.get(i);
        if (priority != null) {
            return priority;
        }
        throw new java.lang.IllegalArgumentException("Unknown Priority for value ".concat(java.lang.String.valueOf(i)));
    }

    public static int toInt(com.google.android.datatransport.Priority priority) {
        java.lang.Integer num = PRIORITY_INT_MAP.get(priority);
        if (num == null) {
            throw new java.lang.IllegalStateException("PriorityMapping is missing known Priority value ".concat(java.lang.String.valueOf(priority)));
        }
        return num.intValue();
    }
}
