package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.ClipboardNegotiator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ConsumerDownloader implements PopupTunnel {
    public final boolean evictLayout;
    public final float growPayload;
    public final MorphCreator injectMetric;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends PanelRevision implements IconExporter {
        public final /* synthetic */ WidgetAction attachConfig;
        public final /* synthetic */ PanelBlock connectPatch;
        public /* synthetic */ Object notifyMessage;
        public int reduceScope;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.ConsumerDownloader$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0099ActivityMutator implements TriggerModerator {
            public final /* synthetic */ ProgressValve notifyMessage;
            public final /* synthetic */ WidgetAction reduceScope;

            public C0099ActivityMutator(WidgetAction widgetAction, ProgressValve progressValve) {
                this.reduceScope = widgetAction;
                this.notifyMessage = progressValve;
            }

            @Override // com.goldenboot.saga.zone.TriggerModerator
            /* renamed from: detachStream, reason: merged with bridge method [inline-methods] */
            public final Object emit(StepperDiff stepperDiff, ServiceRegulator serviceRegulator) {
                if (stepperDiff instanceof ClipboardNegotiator.BounceHandler) {
                    this.reduceScope.growPayload((ClipboardNegotiator.BounceHandler) stepperDiff, this.notifyMessage);
                } else if (stepperDiff instanceof ClipboardNegotiator.FeedbackFlow) {
                    this.reduceScope.detachStream(((ClipboardNegotiator.FeedbackFlow) stepperDiff).evictLayout());
                } else if (stepperDiff instanceof ClipboardNegotiator.ActivityMutator) {
                    this.reduceScope.detachStream(((ClipboardNegotiator.ActivityMutator) stepperDiff).evictLayout());
                } else {
                    this.reduceScope.releaseHeader(stepperDiff, this.notifyMessage);
                }
                return DpadBuilder.evictLayout;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(PanelBlock panelBlock, WidgetAction widgetAction, ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
            this.connectPatch = panelBlock;
            this.attachConfig = widgetAction;
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            ActivityMutator activityMutator = new ActivityMutator(this.connectPatch, this.attachConfig, serviceRegulator);
            activityMutator.notifyMessage = obj;
            return activityMutator;
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
            return ((ActivityMutator) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i = this.reduceScope;
            if (i == 0) {
                ColumnForger.growPayload(obj);
                ProgressValve progressValve = (ProgressValve) this.notifyMessage;
                CursorKeeper growPayload = this.connectPatch.growPayload();
                C0099ActivityMutator c0099ActivityMutator = new C0099ActivityMutator(this.attachConfig, progressValve);
                this.reduceScope = 1;
                if (growPayload.collect(c0099ActivityMutator, this) == releaseHeader) {
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

    public /* synthetic */ ConsumerDownloader(boolean z, float f, MorphCreator morphCreator, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, morphCreator);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumerDownloader)) {
            return false;
        }
        ConsumerDownloader consumerDownloader = (ConsumerDownloader) obj;
        return this.evictLayout == consumerDownloader.evictLayout && InsetsEdge.notifyMessage(this.growPayload, consumerDownloader.growPayload) && Intrinsics.areEqual(this.injectMetric, consumerDownloader.injectMetric);
    }

    @Override // com.goldenboot.saga.zone.PopupTunnel
    public final BaseBucket growPayload(PanelBlock panelBlock, NotificationFence notificationFence, int i) {
        long growPayload;
        notificationFence.resumeSignature(988743187);
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(988743187, i, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:196)");
        }
        ServiceProfiler serviceProfiler = (ServiceProfiler) notificationFence.expandArgs(CompatNotifier.detachStream());
        if (((ContainerSource) this.injectMetric.getValue()).getValue() != 16) {
            notificationFence.resumeSignature(-303571590);
            notificationFence.unlockMessage();
            growPayload = ((ContainerSource) this.injectMetric.getValue()).getValue();
        } else {
            notificationFence.resumeSignature(-303521246);
            growPayload = serviceProfiler.growPayload(notificationFence, 0);
            notificationFence.unlockMessage();
        }
        MorphCreator notifyMessage = BounceReader.notifyMessage(ContainerSource.serializeOffset(growPayload), notificationFence, 0);
        MorphCreator notifyMessage2 = BounceReader.notifyMessage(serviceProfiler.evictLayout(notificationFence, 0), notificationFence, 0);
        int i2 = i & 14;
        WidgetAction injectMetric = injectMetric(panelBlock, this.evictLayout, this.growPayload, notifyMessage, notifyMessage2, notificationFence, i2 | ((i << 12) & 458752));
        boolean drawField = notificationFence.drawField(injectMetric) | (((i2 ^ 6) > 4 && notificationFence.formatPosition(panelBlock)) || (i & 6) == 4);
        Object clipOrigin = notificationFence.clipOrigin();
        if (drawField || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
            clipOrigin = new ActivityMutator(panelBlock, injectMetric, null);
            notificationFence.bindBody(clipOrigin);
        }
        InitSet.releaseHeader(injectMetric, panelBlock, (IconExporter) clipOrigin, notificationFence, (i << 3) & 112);
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        notificationFence.unlockMessage();
        return injectMetric;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.evictLayout) * 31) + InsetsEdge.attachConfig(this.growPayload)) * 31) + this.injectMetric.hashCode();
    }

    public abstract WidgetAction injectMetric(PanelBlock panelBlock, boolean z, float f, MorphCreator morphCreator, MorphCreator morphCreator2, NotificationFence notificationFence, int i);

    public ConsumerDownloader(boolean z, float f, MorphCreator morphCreator) {
        this.evictLayout = z;
        this.growPayload = f;
        this.injectMetric = morphCreator;
    }
}
