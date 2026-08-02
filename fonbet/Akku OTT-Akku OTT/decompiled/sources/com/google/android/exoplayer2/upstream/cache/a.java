package com.google.android.exoplayer2.upstream.cache;

import java.util.Comparator;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        compare = LeastRecentlyUsedCacheEvictor.compare((CacheSpan) obj, (CacheSpan) obj2);
        return compare;
    }
}
