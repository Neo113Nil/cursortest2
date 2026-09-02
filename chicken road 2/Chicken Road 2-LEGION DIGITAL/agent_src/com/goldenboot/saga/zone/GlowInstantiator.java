package com.goldenboot.saga.zone;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class GlowInstantiator implements InterpolatorSnapshot {
    public ScrollCollection evictLayout;
    public final RowVersion growPayload;
    public int injectMetric;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends PanelRevision implements IconExporter {
        public final /* synthetic */ float attachConfig;
        public int connectPatch;
        public final /* synthetic */ ChannelStatus inflateAdapter;
        public Object notifyMessage;
        public Object reduceScope;
        public final /* synthetic */ GlowInstantiator resetDelta;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.GlowInstantiator$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0113ActivityMutator extends Lambda implements TouchRecord {
            public final /* synthetic */ GlowInstantiator attachConfig;
            public final /* synthetic */ Ref.FloatRef connectPatch;
            public final /* synthetic */ ChannelStatus notifyMessage;
            public final /* synthetic */ Ref.FloatRef reduceScope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0113ActivityMutator(Ref.FloatRef floatRef, ChannelStatus channelStatus, Ref.FloatRef floatRef2, GlowInstantiator glowInstantiator) {
                super(1);
                this.reduceScope = floatRef;
                this.notifyMessage = channelStatus;
                this.connectPatch = floatRef2;
                this.attachConfig = glowInstantiator;
            }

            public final void evictLayout(InsetsBeacon insetsBeacon) {
                float floatValue = ((Number) insetsBeacon.releaseHeader()).floatValue() - this.reduceScope.element;
                float evictLayout = this.notifyMessage.evictLayout(floatValue);
                this.reduceScope.element = ((Number) insetsBeacon.releaseHeader()).floatValue();
                this.connectPatch.element = ((Number) insetsBeacon.clipOrigin()).floatValue();
                if (Math.abs(floatValue - evictLayout) > 0.5f) {
                    insetsBeacon.evictLayout();
                }
                GlowInstantiator glowInstantiator = this.attachConfig;
                glowInstantiator.releaseHeader(glowInstantiator.injectMetric() + 1);
            }

            @Override // com.goldenboot.saga.zone.TouchRecord
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                evictLayout((InsetsBeacon) obj);
                return DpadBuilder.evictLayout;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(float f, GlowInstantiator glowInstantiator, ChannelStatus channelStatus, ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
            this.attachConfig = f;
            this.resetDelta = glowInstantiator;
            this.inflateAdapter = channelStatus;
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            return new ActivityMutator(this.attachConfig, this.resetDelta, this.inflateAdapter, serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
            return ((ActivityMutator) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            float f;
            EndpointSource endpointSource;
            Ref.FloatRef floatRef;
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i = this.connectPatch;
            if (i == 0) {
                ColumnForger.growPayload(obj);
                if (Math.abs(this.attachConfig) <= 1.0f) {
                    f = this.attachConfig;
                    return WindowRevision.growPayload(f);
                }
                Ref.FloatRef floatRef2 = new Ref.FloatRef();
                floatRef2.element = this.attachConfig;
                Ref.FloatRef floatRef3 = new Ref.FloatRef();
                EndpointSource injectMetric = ShapeDetector.injectMetric(0.0f, this.attachConfig, 0L, 0L, false, 28, null);
                try {
                    ScrollCollection growPayload = this.resetDelta.growPayload();
                    C0113ActivityMutator c0113ActivityMutator = new C0113ActivityMutator(floatRef3, this.inflateAdapter, floatRef2, this.resetDelta);
                    this.reduceScope = floatRef2;
                    this.notifyMessage = injectMetric;
                    this.connectPatch = 1;
                    endpointSource = injectMetric;
                    try {
                        if (ReceiverSupervisor.updateTimer(endpointSource, growPayload, false, c0113ActivityMutator, this, 2, null) == releaseHeader) {
                            return releaseHeader;
                        }
                        floatRef = floatRef2;
                    } catch (CancellationException unused) {
                        floatRef = floatRef2;
                        floatRef.element = ((Number) endpointSource.notifyMessage()).floatValue();
                        f = floatRef.element;
                        return WindowRevision.growPayload(f);
                    }
                } catch (CancellationException unused2) {
                    endpointSource = injectMetric;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                endpointSource = (EndpointSource) this.notifyMessage;
                floatRef = (Ref.FloatRef) this.reduceScope;
                try {
                    ColumnForger.growPayload(obj);
                } catch (CancellationException unused3) {
                    floatRef.element = ((Number) endpointSource.notifyMessage()).floatValue();
                    f = floatRef.element;
                    return WindowRevision.growPayload(f);
                }
            }
            f = floatRef.element;
            return WindowRevision.growPayload(f);
        }
    }

    public GlowInstantiator(ScrollCollection scrollCollection, RowVersion rowVersion) {
        this.evictLayout = scrollCollection;
        this.growPayload = rowVersion;
    }

    public final void detachStream(ScrollCollection scrollCollection) {
        this.evictLayout = scrollCollection;
    }

    @Override // com.goldenboot.saga.zone.InterpolatorSnapshot
    public Object evictLayout(ChannelStatus channelStatus, float f, ServiceRegulator serviceRegulator) {
        this.injectMetric = 0;
        return LazyStep.clipOrigin(this.growPayload, new ActivityMutator(f, this, channelStatus, null), serviceRegulator);
    }

    public final ScrollCollection growPayload() {
        return this.evictLayout;
    }

    public final int injectMetric() {
        return this.injectMetric;
    }

    public final void releaseHeader(int i) {
        this.injectMetric = i;
    }

    public /* synthetic */ GlowInstantiator(ScrollCollection scrollCollection, RowVersion rowVersion, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(scrollCollection, (i & 2) != 0 ? androidx.compose.foundation.gestures.FeedbackFlow.releaseHeader() : rowVersion);
    }
}
