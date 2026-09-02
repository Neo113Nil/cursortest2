package com.goldenboot.saga.zone;

import java.util.Iterator;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class ScopeRing implements CompatCache, SheetFetcher {
    public static final ScopeRing evictLayout = new ScopeRing();

    @Override // com.goldenboot.saga.zone.SheetFetcher
    /* renamed from: growPayload, reason: merged with bridge method [inline-methods] */
    public ScopeRing evictLayout(int i) {
        return evictLayout;
    }

    @Override // com.goldenboot.saga.zone.CompatCache
    public Iterator iterator() {
        return PluginFactory.reduceScope;
    }
}
