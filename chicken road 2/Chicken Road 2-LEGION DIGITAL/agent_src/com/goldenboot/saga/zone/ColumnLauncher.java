package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.AttrSemaphore;
import com.goldenboot.saga.zone.NotificationFence;
import com.goldenboot.saga.zone.PluginStreamer;
import com.goldenboot.saga.zone.PluginStreamer.ActivityMutator;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ColumnLauncher {
    public static final TouchRecord evictLayout = BounceHandler.reduceScope;
    public static final LayoutSynthesizer growPayload = InternalPropagator.growPayload(BundleChannel.connectPatch, ActivityMutator.reduceScope);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements ElevationNode {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.ColumnLauncher$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0094ActivityMutator extends Lambda implements TouchRecord {
            public static final C0094ActivityMutator reduceScope = new C0094ActivityMutator();

            public C0094ActivityMutator() {
                super(1);
            }

            public final void evictLayout(ElevationNode elevationNode) {
                elevationNode.invoke();
            }

            @Override // com.goldenboot.saga.zone.TouchRecord
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                evictLayout((ElevationNode) obj);
                return DpadBuilder.evictLayout;
            }
        }

        public ActivityMutator() {
            super(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final FocusSupervisor invoke() {
            FocusSupervisor focusSupervisor = new FocusSupervisor(C0094ActivityMutator.reduceScope);
            focusSupervisor.connectPatch();
            return focusSupervisor;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends Lambda implements TouchRecord {
        public static final BounceHandler reduceScope = new BounceHandler();

        public BounceHandler() {
            super(1);
        }

        public final void evictLayout(GestureFlag gestureFlag) {
            gestureFlag.dispatchTimezone();
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((GestureFlag) obj);
            return DpadBuilder.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class EndpointList extends PanelRevision implements IconExporter {
        public final /* synthetic */ TextMeter attachConfig;
        public int connectPatch;
        public Object notifyMessage;
        public Object reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EndpointList(TextMeter textMeter, ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
            this.attachConfig = textMeter;
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            return new EndpointList(this.attachConfig, serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
            return ((EndpointList) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            RowFacilitator rowFacilitator;
            TextMeter textMeter;
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i = this.connectPatch;
            if (i == 0) {
                ColumnForger.growPayload(obj);
                ((GestureFlag) this.attachConfig).bindBody();
                RowFacilitator inflateEdge = ((GestureFlag) this.attachConfig).inflateEdge();
                TextMeter textMeter2 = this.attachConfig;
                this.reduceScope = inflateEdge;
                this.notifyMessage = textMeter2;
                this.connectPatch = 1;
                if (inflateEdge.injectMetric(null, this) == releaseHeader) {
                    return releaseHeader;
                }
                rowFacilitator = inflateEdge;
                textMeter = textMeter2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                textMeter = (TextMeter) this.notifyMessage;
                rowFacilitator = (RowFacilitator) this.reduceScope;
                ColumnForger.growPayload(obj);
            }
            try {
                ((GestureFlag) textMeter).connectComponent(textMeter.growPayload());
                GroupSegment filterPayload = ((GestureFlag) textMeter).filterPayload();
                if (filterPayload != null) {
                    AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
                    filterPayload.resumeWith(AttrSemaphore.growPayload(textMeter.growPayload()));
                }
                ((GestureFlag) textMeter).startResource(null);
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                rowFacilitator.growPayload(null);
                return DpadBuilder.evictLayout;
            } catch (Throwable th) {
                rowFacilitator.growPayload(null);
                throw th;
            }
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class FeedbackFlow extends Lambda implements TouchRecord {
        public final /* synthetic */ PluginStreamer notifyMessage;
        public final /* synthetic */ PluginStreamer reduceScope;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public static final class ActivityMutator implements ChannelArranger {
            public final /* synthetic */ PluginStreamer evictLayout;
            public final /* synthetic */ PluginStreamer growPayload;

            public ActivityMutator(PluginStreamer pluginStreamer, PluginStreamer pluginStreamer2) {
                this.evictLayout = pluginStreamer;
                this.growPayload = pluginStreamer2;
            }

            @Override // com.goldenboot.saga.zone.ChannelArranger
            public void evictLayout() {
                this.evictLayout.flattenPackage(this.growPayload);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeedbackFlow(PluginStreamer pluginStreamer, PluginStreamer pluginStreamer2) {
            super(1);
            this.reduceScope = pluginStreamer;
            this.notifyMessage = pluginStreamer2;
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final ChannelArranger invoke(BounceDelegate bounceDelegate) {
            this.reduceScope.detachStream(this.notifyMessage);
            return new ActivityMutator(this.reduceScope, this.notifyMessage);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class LayerUseCase extends Lambda implements TouchRecord {
        public final /* synthetic */ PluginStreamer.ActivityMutator notifyMessage;
        public final /* synthetic */ PluginStreamer reduceScope;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public static final class ActivityMutator implements ChannelArranger {
            public final /* synthetic */ PluginStreamer evictLayout;
            public final /* synthetic */ PluginStreamer.ActivityMutator growPayload;

            public ActivityMutator(PluginStreamer pluginStreamer, PluginStreamer.ActivityMutator activityMutator) {
                this.evictLayout = pluginStreamer;
                this.growPayload = activityMutator;
            }

            @Override // com.goldenboot.saga.zone.ChannelArranger
            public void evictLayout() {
                this.evictLayout.mergeLocale(this.growPayload);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayerUseCase(PluginStreamer pluginStreamer, PluginStreamer.ActivityMutator activityMutator) {
            super(1);
            this.reduceScope = pluginStreamer;
            this.notifyMessage = activityMutator;
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final ChannelArranger invoke(BounceDelegate bounceDelegate) {
            return new ActivityMutator(this.reduceScope, this.notifyMessage);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ScopedMigration extends Lambda implements TouchRecord {
        public final /* synthetic */ PluginStreamer reduceScope;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public static final class ActivityMutator implements ChannelArranger {
            public final /* synthetic */ PluginStreamer evictLayout;

            public ActivityMutator(PluginStreamer pluginStreamer) {
                this.evictLayout = pluginStreamer;
            }

            @Override // com.goldenboot.saga.zone.ChannelArranger
            public void evictLayout() {
                this.evictLayout.gatherAdapter();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScopedMigration(PluginStreamer pluginStreamer) {
            super(1);
            this.reduceScope = pluginStreamer;
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final ChannelArranger invoke(BounceDelegate bounceDelegate) {
            return new ActivityMutator(this.reduceScope);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class StylusConverter extends Lambda implements TouchRecord {
        public final /* synthetic */ PluginStreamer reduceScope;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public static final class ActivityMutator implements ChannelArranger {
            public final /* synthetic */ PluginStreamer evictLayout;

            public ActivityMutator(PluginStreamer pluginStreamer) {
                this.evictLayout = pluginStreamer;
            }

            @Override // com.goldenboot.saga.zone.ChannelArranger
            public void evictLayout() {
                this.evictLayout.gatherAdapter();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StylusConverter(PluginStreamer pluginStreamer) {
            super(1);
            this.reduceScope = pluginStreamer;
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final ChannelArranger invoke(BounceDelegate bounceDelegate) {
            return new ActivityMutator(this.reduceScope);
        }
    }

    public static final PluginStreamer clipOrigin(Object obj, String str, NotificationFence notificationFence, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(2029166765, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:91)");
        }
        Object clipOrigin = notificationFence.clipOrigin();
        NotificationFence.ActivityMutator activityMutator = NotificationFence.evictLayout;
        if (clipOrigin == activityMutator.evictLayout()) {
            clipOrigin = new PluginStreamer(obj, str);
            notificationFence.bindBody(clipOrigin);
        }
        PluginStreamer pluginStreamer = (PluginStreamer) clipOrigin;
        pluginStreamer.releaseHeader(obj, notificationFence, (i & 8) | 48 | (i & 14));
        Object clipOrigin2 = notificationFence.clipOrigin();
        if (clipOrigin2 == activityMutator.evictLayout()) {
            clipOrigin2 = new ScopedMigration(pluginStreamer);
            notificationFence.bindBody(clipOrigin2);
        }
        InitSet.evictLayout(pluginStreamer, (TouchRecord) clipOrigin2, notificationFence, 54);
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return pluginStreamer;
    }

    public static final FocusSupervisor detachStream() {
        return (FocusSupervisor) growPayload.getValue();
    }

    public static final PluginStreamer growPayload(PluginStreamer pluginStreamer, Object obj, Object obj2, String str, NotificationFence notificationFence, int i) {
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(-198307638, i, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1825)");
        }
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && notificationFence.formatPosition(pluginStreamer)) || (i & 6) == 4;
        Object clipOrigin = notificationFence.clipOrigin();
        if (z2 || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
            clipOrigin = new PluginStreamer(new ListenerOrchestrator(obj), pluginStreamer, pluginStreamer.drawField() + " > " + str);
            notificationFence.bindBody(clipOrigin);
        }
        PluginStreamer pluginStreamer2 = (PluginStreamer) clipOrigin;
        if ((i2 <= 4 || !notificationFence.formatPosition(pluginStreamer)) && (i & 6) != 4) {
            z = false;
        }
        boolean formatPosition = notificationFence.formatPosition(pluginStreamer2) | z;
        Object clipOrigin2 = notificationFence.clipOrigin();
        if (formatPosition || clipOrigin2 == NotificationFence.evictLayout.evictLayout()) {
            clipOrigin2 = new FeedbackFlow(pluginStreamer, pluginStreamer2);
            notificationFence.bindBody(clipOrigin2);
        }
        InitSet.evictLayout(pluginStreamer2, (TouchRecord) clipOrigin2, notificationFence, 0);
        if (pluginStreamer.purgeNode()) {
            pluginStreamer2.filterPayload(obj, obj2, pluginStreamer.connectJob());
        } else {
            pluginStreamer2.updateAction(obj2);
            pluginStreamer2.unlockMessage(false);
        }
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return pluginStreamer2;
    }

    public static final PluginStreamer.ActivityMutator injectMetric(PluginStreamer pluginStreamer, GestureInitializer gestureInitializer, String str, NotificationFence notificationFence, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(-1714122528, i, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1779)");
        }
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && notificationFence.formatPosition(pluginStreamer)) || (i & 6) == 4;
        Object clipOrigin = notificationFence.clipOrigin();
        if (z2 || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
            clipOrigin = pluginStreamer.new ActivityMutator(gestureInitializer, str);
            notificationFence.bindBody(clipOrigin);
        }
        PluginStreamer.ActivityMutator activityMutator = (PluginStreamer.ActivityMutator) clipOrigin;
        if ((i3 <= 4 || !notificationFence.formatPosition(pluginStreamer)) && (i & 6) != 4) {
            z = false;
        }
        boolean drawField = notificationFence.drawField(activityMutator) | z;
        Object clipOrigin2 = notificationFence.clipOrigin();
        if (drawField || clipOrigin2 == NotificationFence.evictLayout.evictLayout()) {
            clipOrigin2 = new LayerUseCase(pluginStreamer, activityMutator);
            notificationFence.bindBody(clipOrigin2);
        }
        InitSet.evictLayout(activityMutator, (TouchRecord) clipOrigin2, notificationFence, 0);
        if (pluginStreamer.purgeNode()) {
            activityMutator.detachStream();
        }
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return activityMutator;
    }

    public static final PluginStreamer releaseHeader(TextMeter textMeter, String str, NotificationFence notificationFence, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(1643203617, i, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:820)");
        }
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && notificationFence.formatPosition(textMeter)) || (i & 6) == 4;
        Object clipOrigin = notificationFence.clipOrigin();
        if (z2 || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
            clipOrigin = new PluginStreamer(textMeter, str);
            notificationFence.bindBody(clipOrigin);
        }
        PluginStreamer pluginStreamer = (PluginStreamer) clipOrigin;
        if (textMeter instanceof GestureFlag) {
            notificationFence.resumeSignature(1030413636);
            Object evictLayout2 = textMeter.evictLayout();
            Object growPayload2 = textMeter.growPayload();
            if ((i3 <= 4 || !notificationFence.formatPosition(textMeter)) && (i & 6) != 4) {
                z = false;
            }
            Object clipOrigin2 = notificationFence.clipOrigin();
            if (z || clipOrigin2 == NotificationFence.evictLayout.evictLayout()) {
                clipOrigin2 = new EndpointList(textMeter, null);
                notificationFence.bindBody(clipOrigin2);
            }
            InitSet.releaseHeader(evictLayout2, growPayload2, (IconExporter) clipOrigin2, notificationFence, 0);
            notificationFence.unlockMessage();
        } else {
            notificationFence.resumeSignature(1030875195);
            pluginStreamer.releaseHeader(textMeter.growPayload(), notificationFence, 0);
            notificationFence.unlockMessage();
        }
        boolean formatPosition = notificationFence.formatPosition(pluginStreamer);
        Object clipOrigin3 = notificationFence.clipOrigin();
        if (formatPosition || clipOrigin3 == NotificationFence.evictLayout.evictLayout()) {
            clipOrigin3 = new StylusConverter(pluginStreamer);
            notificationFence.bindBody(clipOrigin3);
        }
        InitSet.evictLayout(pluginStreamer, (TouchRecord) clipOrigin3, notificationFence, 0);
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return pluginStreamer;
    }
}
