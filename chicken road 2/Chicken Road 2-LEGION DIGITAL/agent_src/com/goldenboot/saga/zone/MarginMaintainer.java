package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/goldenboot/saga/zone/MarginMaintainer;", "Lcom/goldenboot/saga/zone/AnchorState;", "<init>", "()V", "newDelegate", "Lcom/goldenboot/saga/zone/DpadBuilder;", "growPayload", "(Lcom/goldenboot/saga/zone/AnchorState;)V", "Lcom/goldenboot/saga/zone/AnchorState;", "delegate", "Lcom/goldenboot/saga/zone/MorphCreator;", "", "evictLayout", "()Lcom/goldenboot/saga/zone/MorphCreator;", "fontLoaded", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MarginMaintainer implements AnchorState {
    public static final MarginMaintainer evictLayout = new MarginMaintainer();

    /* renamed from: growPayload, reason: from kotlin metadata */
    private static AnchorState delegate = new FadeRepository();
    public static final int injectMetric = 8;

    private MarginMaintainer() {
    }

    @Override // com.goldenboot.saga.zone.AnchorState
    public MorphCreator evictLayout() {
        return delegate.evictLayout();
    }

    public final void growPayload(AnchorState newDelegate) {
        if (newDelegate == null) {
            newDelegate = new FadeRepository();
        }
        delegate = newDelegate;
    }
}
