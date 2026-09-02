package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class TileDiff extends RemoteCallback.LayerUseCase implements LayoutBlock {
    public TouchRecord flattenPackage;
    public final Object injectConstraint = storeCharset;
    public static final ActivityMutator storeCharset = new ActivityMutator(null);
    public static final int filterPayload = 8;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public ActivityMutator() {
        }
    }

    public TileDiff(TouchRecord touchRecord) {
        this.flattenPackage = touchRecord;
    }

    public final void evictMessage(PagerReducer pagerReducer) {
        this.flattenPackage.invoke(pagerReducer);
        TileDiff tileDiff = (TileDiff) GlowToggle.growPayload(this);
        if (tileDiff != null) {
            tileDiff.evictMessage(pagerReducer);
        }
    }

    @Override // com.goldenboot.saga.zone.LayoutBlock
    /* renamed from: saveSnapshot */
    public Object getTraverseKey() {
        return this.injectConstraint;
    }
}
