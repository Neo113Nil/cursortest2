package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/goldenboot/saga/zone/ScopedFilter;", "Lcom/goldenboot/saga/zone/KeyboardWatcher;", "Lcom/goldenboot/saga/zone/PlatformBroadcaster;", "observerNode", "<init>", "(Lcom/goldenboot/saga/zone/PlatformBroadcaster;)V", "reduceScope", "Lcom/goldenboot/saga/zone/PlatformBroadcaster;", "growPayload", "()Lcom/goldenboot/saga/zone/PlatformBroadcaster;", "", "connectPool", "()Z", "isValidOwnerScope", "notifyMessage", "BounceHandler", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScopedFilter implements KeyboardWatcher {

    /* renamed from: reduceScope, reason: from kotlin metadata */
    private final PlatformBroadcaster observerNode;

    /* renamed from: notifyMessage, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int connectPatch = 8;
    private static final TouchRecord attachConfig = ActivityMutator.reduceScope;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/ScopedFilter;", "it", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/ScopedFilter;)V"}, k = 3, mv = {2, 0, 0})
    public static final class ActivityMutator extends Lambda implements TouchRecord {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        public ActivityMutator() {
            super(1);
        }

        public final void evictLayout(ScopedFilter scopedFilter) {
            if (scopedFilter.connectPool()) {
                scopedFilter.getObserverNode().fetchOptions();
            }
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((ScopedFilter) obj);
            return DpadBuilder.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/goldenboot/saga/zone/ScopedFilter$BounceHandler;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/goldenboot/saga/zone/ScopedFilter;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "OnObserveReadsChanged", "Lcom/goldenboot/saga/zone/TouchRecord;", "evictLayout", "()Lcom/goldenboot/saga/zone/TouchRecord;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.ScopedFilter$BounceHandler, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TouchRecord evictLayout() {
            return ScopedFilter.attachConfig;
        }

        private Companion() {
        }
    }

    public ScopedFilter(PlatformBroadcaster platformBroadcaster) {
        this.observerNode = platformBroadcaster;
    }

    @Override // com.goldenboot.saga.zone.KeyboardWatcher
    public boolean connectPool() {
        return this.observerNode.getNode().getIsAttached();
    }

    /* renamed from: growPayload, reason: from getter */
    public final PlatformBroadcaster getObserverNode() {
        return this.observerNode;
    }
}
