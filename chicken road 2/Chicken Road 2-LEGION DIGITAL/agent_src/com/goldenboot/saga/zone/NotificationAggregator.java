package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import com.goldenboot.saga.zone.ClipboardNegotiator;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class NotificationAggregator implements ReceiverState {
    public static final NotificationAggregator evictLayout = new NotificationAggregator();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends RemoteCallback.LayerUseCase implements DpadFormer {
        public boolean filterPayload;
        public final PanelBlock flattenPackage;
        public boolean injectConstraint;
        public boolean storeCharset;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.NotificationAggregator$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0132ActivityMutator extends PanelRevision implements IconExporter {
            public int reduceScope;

            /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
            /* renamed from: com.goldenboot.saga.zone.NotificationAggregator$ActivityMutator$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
            public static final class C0133ActivityMutator implements TriggerModerator {
                public final /* synthetic */ ActivityMutator attachConfig;
                public final /* synthetic */ Ref.IntRef connectPatch;
                public final /* synthetic */ Ref.IntRef notifyMessage;
                public final /* synthetic */ Ref.IntRef reduceScope;

                public C0133ActivityMutator(Ref.IntRef intRef, Ref.IntRef intRef2, Ref.IntRef intRef3, ActivityMutator activityMutator) {
                    this.reduceScope = intRef;
                    this.notifyMessage = intRef2;
                    this.connectPatch = intRef3;
                    this.attachConfig = activityMutator;
                }

                @Override // com.goldenboot.saga.zone.TriggerModerator
                /* renamed from: detachStream, reason: merged with bridge method [inline-methods] */
                public final Object emit(StepperDiff stepperDiff, ServiceRegulator serviceRegulator) {
                    boolean z = true;
                    if (stepperDiff instanceof ClipboardNegotiator.BounceHandler) {
                        this.reduceScope.element++;
                    } else if (stepperDiff instanceof ClipboardNegotiator.FeedbackFlow) {
                        Ref.IntRef intRef = this.reduceScope;
                        intRef.element--;
                    } else if (stepperDiff instanceof ClipboardNegotiator.ActivityMutator) {
                        Ref.IntRef intRef2 = this.reduceScope;
                        intRef2.element--;
                    } else if (stepperDiff instanceof PatternLoader) {
                        this.notifyMessage.element++;
                    } else if (stepperDiff instanceof ToastShard) {
                        Ref.IntRef intRef3 = this.notifyMessage;
                        intRef3.element--;
                    } else if (stepperDiff instanceof AnimOrchestrator) {
                        this.connectPatch.element++;
                    } else if (stepperDiff instanceof ServerCache) {
                        Ref.IntRef intRef4 = this.connectPatch;
                        intRef4.element--;
                    }
                    boolean z2 = false;
                    boolean z3 = this.reduceScope.element > 0;
                    boolean z4 = this.notifyMessage.element > 0;
                    boolean z5 = this.connectPatch.element > 0;
                    if (this.attachConfig.injectConstraint != z3) {
                        this.attachConfig.injectConstraint = z3;
                        z2 = true;
                    }
                    if (this.attachConfig.storeCharset != z4) {
                        this.attachConfig.storeCharset = z4;
                        z2 = true;
                    }
                    if (this.attachConfig.filterPayload != z5) {
                        this.attachConfig.filterPayload = z5;
                    } else {
                        z = z2;
                    }
                    if (z) {
                        ParallelArray.evictLayout(this.attachConfig);
                    }
                    return DpadBuilder.evictLayout;
                }
            }

            public C0132ActivityMutator(ServiceRegulator serviceRegulator) {
                super(2, serviceRegulator);
            }

            @Override // com.goldenboot.saga.zone.ConfigValidator
            public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
                return ActivityMutator.this.new C0132ActivityMutator(serviceRegulator);
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
                return ((C0132ActivityMutator) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
            }

            @Override // com.goldenboot.saga.zone.ConfigValidator
            public final Object invokeSuspend(Object obj) {
                Object releaseHeader = RotateReceiver.releaseHeader();
                int i = this.reduceScope;
                if (i == 0) {
                    ColumnForger.growPayload(obj);
                    Ref.IntRef intRef = new Ref.IntRef();
                    Ref.IntRef intRef2 = new Ref.IntRef();
                    Ref.IntRef intRef3 = new Ref.IntRef();
                    CursorKeeper growPayload = ActivityMutator.this.flattenPackage.growPayload();
                    C0133ActivityMutator c0133ActivityMutator = new C0133ActivityMutator(intRef, intRef2, intRef3, ActivityMutator.this);
                    this.reduceScope = 1;
                    if (growPayload.collect(c0133ActivityMutator, this) == releaseHeader) {
                        return releaseHeader;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ColumnForger.growPayload(obj);
                }
                return DpadBuilder.evictLayout;
            }
        }

        public ActivityMutator(PanelBlock panelBlock) {
            this.flattenPackage = panelBlock;
        }

        @Override // androidx.compose.ui.RemoteCallback.LayerUseCase
        public void scatterCounter() {
            BottomBarDrain.detachStream(trimEntry(), null, null, new C0132ActivityMutator(null), 3, null);
        }

        @Override // com.goldenboot.saga.zone.DpadFormer
        public void unlockMessage(PublisherSegment publisherSegment) {
            publisherSegment.compressPrefs();
            if (this.injectConstraint) {
                StepperAdministrator.injectAsset(publisherSegment, ContainerSource.gatherAdapter(ContainerSource.INSTANCE.evictLayout(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, publisherSegment.releaseHeader(), 0.0f, null, null, 0, 122, null);
            } else if (this.storeCharset || this.filterPayload) {
                StepperAdministrator.injectAsset(publisherSegment, ContainerSource.gatherAdapter(ContainerSource.INSTANCE.evictLayout(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, publisherSegment.releaseHeader(), 0.0f, null, null, 0, 122, null);
            }
        }
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.goldenboot.saga.zone.ReceiverState
    public CachedDeserializer evictLayout(PanelBlock panelBlock) {
        return new ActivityMutator(panelBlock);
    }

    public int hashCode() {
        return -1;
    }
}
