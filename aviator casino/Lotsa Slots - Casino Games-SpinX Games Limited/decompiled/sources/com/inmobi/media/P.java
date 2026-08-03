package com.inmobi.media;

/* loaded from: classes5.dex */
public final class P implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.inmobi.media.J6 j6 = (com.inmobi.media.J6) obj2;
        com.inmobi.media.J6 j62 = (com.inmobi.media.J6) obj;
        return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(j6.c * j6.d), java.lang.Integer.valueOf(j62.c * j62.d));
    }
}
