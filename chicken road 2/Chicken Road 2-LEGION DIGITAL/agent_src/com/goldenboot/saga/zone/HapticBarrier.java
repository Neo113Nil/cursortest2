package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/HapticBarrier;", "Original", "", "Saveable", "Lcom/goldenboot/saga/zone/PaletteMap;", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface HapticBarrier<Original, Saveable> extends PaletteMap {
    @Override // com.goldenboot.saga.zone.PaletteMap
    /* synthetic */ Object evictLayout(Object obj);

    @Override // com.goldenboot.saga.zone.PaletteMap
    /* synthetic */ Object growPayload(ItemStore itemStore, Object obj);
}
