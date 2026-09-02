package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class TouchFabricator implements LongPressDispatcher {
    public final LongPressDispatcher evictLayout;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends PanelRevision implements IconExporter {
        public final /* synthetic */ IconExporter connectPatch;
        public /* synthetic */ Object notifyMessage;
        public int reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(IconExporter iconExporter, ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
            this.connectPatch = iconExporter;
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            ActivityMutator activityMutator = new ActivityMutator(this.connectPatch, serviceRegulator);
            activityMutator.notifyMessage = obj;
            return activityMutator;
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        /* renamed from: detachStream, reason: merged with bridge method [inline-methods] */
        public final Object invoke(WrapperQueue wrapperQueue, ServiceRegulator serviceRegulator) {
            return ((ActivityMutator) create(wrapperQueue, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i = this.reduceScope;
            if (i == 0) {
                ColumnForger.growPayload(obj);
                WrapperQueue wrapperQueue = (WrapperQueue) this.notifyMessage;
                IconExporter iconExporter = this.connectPatch;
                this.reduceScope = 1;
                obj = iconExporter.invoke(wrapperQueue, this);
                if (obj == releaseHeader) {
                    return releaseHeader;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ColumnForger.growPayload(obj);
            }
            WrapperQueue wrapperQueue2 = (WrapperQueue) obj;
            Intrinsics.checkNotNull(wrapperQueue2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((AttrSignal) wrapperQueue2).clipOrigin();
            return wrapperQueue2;
        }
    }

    public TouchFabricator(LongPressDispatcher delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.evictLayout = delegate;
    }

    @Override // com.goldenboot.saga.zone.LongPressDispatcher
    public Object evictLayout(IconExporter iconExporter, ServiceRegulator serviceRegulator) {
        return this.evictLayout.evictLayout(new ActivityMutator(iconExporter, null), serviceRegulator);
    }

    @Override // com.goldenboot.saga.zone.LongPressDispatcher
    public CursorKeeper growPayload() {
        return this.evictLayout.growPayload();
    }
}
