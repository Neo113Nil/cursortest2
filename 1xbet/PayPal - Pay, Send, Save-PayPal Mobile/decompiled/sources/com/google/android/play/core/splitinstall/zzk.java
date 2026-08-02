package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
public final class zzk {
    private final java.util.Map zza;

    public final java.util.Map zza(java.util.Collection collection) {
        java.util.Set unmodifiableSet;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : this.zza.keySet()) {
            if (this.zza.containsKey(str)) {
                java.util.HashSet hashSet = new java.util.HashSet();
                for (java.util.Map.Entry entry : ((java.util.Map) this.zza.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((java.lang.String) entry.getValue());
                    }
                }
                unmodifiableSet = java.util.Collections.unmodifiableSet(hashSet);
            } else {
                unmodifiableSet = java.util.Collections.emptySet();
            }
            hashMap.put(str, unmodifiableSet);
        }
        return hashMap;
    }
}
