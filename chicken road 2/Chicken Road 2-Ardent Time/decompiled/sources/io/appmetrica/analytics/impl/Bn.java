package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Bn implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Thread thread = (java.lang.Thread) obj;
        java.lang.Thread thread2 = (java.lang.Thread) obj2;
        if (thread == thread2) {
            return 0;
        }
        return io.appmetrica.analytics.coreutils.internal.StringUtils.compare(thread.getName(), thread2.getName());
    }
}
