package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@ReceiverAdministrator
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00060\tR\u00020\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/goldenboot/saga/zone/FontAllocator;", "Landroidx/compose/ui/RemoteCallback$FeedbackFlow;", "Lcom/goldenboot/saga/zone/ViewPipe;", "Lkotlin/Function1;", "Lcom/goldenboot/saga/zone/CarouselDelegate;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "inspectorInfo", "<init>", "(Lcom/goldenboot/saga/zone/TouchRecord;)V", "Lcom/goldenboot/saga/zone/FontAllocator$ActivityMutator;", "releaseHeader", "Lcom/goldenboot/saga/zone/FontAllocator$ActivityMutator;", "clipRule", "()Lcom/goldenboot/saga/zone/FontAllocator$ActivityMutator;", "end", "ActivityMutator", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontAllocator extends ViewPipe implements RemoteCallback.FeedbackFlow {
    public static final int clipOrigin = 0;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    private final ActivityMutator end;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/FontAllocator$ActivityMutator;", "Landroidx/compose/ui/RemoteCallback$FeedbackFlow;", "<init>", "(Lcom/goldenboot/saga/zone/FontAllocator;)V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ActivityMutator implements RemoteCallback.FeedbackFlow {
        public ActivityMutator() {
        }
    }

    public FontAllocator(TouchRecord touchRecord) {
        super(touchRecord);
        this.end = new ActivityMutator();
    }

    /* renamed from: clipRule, reason: from getter */
    public final ActivityMutator getEnd() {
        return this.end;
    }
}
