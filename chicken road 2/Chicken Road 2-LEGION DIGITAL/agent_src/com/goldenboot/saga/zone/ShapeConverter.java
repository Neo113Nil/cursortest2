package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.MotionTunnel;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ShapeConverter implements MotionTunnel, RestoreReader {
    public static final BounceHandler attachConfig = new BounceHandler(null);
    public final Set connectPatch;
    public final SlotDispatcher notifyMessage;
    public final MotionTunnel reduceScope;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements TouchRecord {
        public final /* synthetic */ MotionTunnel reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(MotionTunnel motionTunnel) {
            super(1);
            this.reduceScope = motionTunnel;
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            MotionTunnel motionTunnel = this.reduceScope;
            return Boolean.valueOf(motionTunnel != null ? motionTunnel.evictLayout(obj) : true);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler {

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public static final class ActivityMutator extends Lambda implements IconExporter {
            public static final ActivityMutator reduceScope = new ActivityMutator();

            public ActivityMutator() {
                super(2);
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
            public final Map invoke(ItemStore itemStore, ShapeConverter shapeConverter) {
                Map growPayload = shapeConverter.growPayload();
                if (growPayload.isEmpty()) {
                    return null;
                }
                return growPayload;
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.ShapeConverter$BounceHandler$BounceHandler, reason: collision with other inner class name */
        public static final class C0156BounceHandler extends Lambda implements TouchRecord {
            public final /* synthetic */ MotionTunnel reduceScope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0156BounceHandler(MotionTunnel motionTunnel) {
                super(1);
                this.reduceScope = motionTunnel;
            }

            @Override // com.goldenboot.saga.zone.TouchRecord
            /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
            public final ShapeConverter invoke(Map map) {
                return new ShapeConverter(this.reduceScope, map);
            }
        }

        public /* synthetic */ BounceHandler(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PaletteMap evictLayout(MotionTunnel motionTunnel) {
            return MarginEncoder.releaseHeader(ActivityMutator.reduceScope, new C0156BounceHandler(motionTunnel));
        }

        public BounceHandler() {
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class FeedbackFlow extends Lambda implements TouchRecord {
        public final /* synthetic */ Object notifyMessage;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public static final class ActivityMutator implements ChannelArranger {
            public final /* synthetic */ ShapeConverter evictLayout;
            public final /* synthetic */ Object growPayload;

            public ActivityMutator(ShapeConverter shapeConverter, Object obj) {
                this.evictLayout = shapeConverter;
                this.growPayload = obj;
            }

            @Override // com.goldenboot.saga.zone.ChannelArranger
            public void evictLayout() {
                this.evictLayout.connectPatch.add(this.growPayload);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeedbackFlow(Object obj) {
            super(1);
            this.notifyMessage = obj;
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final ChannelArranger invoke(BounceDelegate bounceDelegate) {
            ShapeConverter.this.connectPatch.remove(this.notifyMessage);
            return new ActivityMutator(ShapeConverter.this, this.notifyMessage);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class LayerUseCase extends Lambda implements IconExporter {
        public final /* synthetic */ int attachConfig;
        public final /* synthetic */ IconExporter connectPatch;
        public final /* synthetic */ Object notifyMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayerUseCase(Object obj, IconExporter iconExporter, int i) {
            super(2);
            this.notifyMessage = obj;
            this.connectPatch = iconExporter;
            this.attachConfig = i;
        }

        public final void evictLayout(NotificationFence notificationFence, int i) {
            ShapeConverter.this.detachStream(this.notifyMessage, this.connectPatch, notificationFence, NavBarImpl.evictLayout(this.attachConfig | 1));
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            evictLayout((NotificationFence) obj, ((Number) obj2).intValue());
            return DpadBuilder.evictLayout;
        }
    }

    public ShapeConverter(MotionTunnel motionTunnel) {
        this.reduceScope = motionTunnel;
        this.notifyMessage = StylusDetector.releaseHeader(null, null, 2, null);
        this.connectPatch = new LinkedHashSet();
    }

    public final void applyTask(RestoreReader restoreReader) {
        this.notifyMessage.setValue(restoreReader);
    }

    @Override // com.goldenboot.saga.zone.MotionTunnel
    public MotionTunnel.ActivityMutator clipOrigin(String str, ElevationNode elevationNode) {
        return this.reduceScope.clipOrigin(str, elevationNode);
    }

    @Override // com.goldenboot.saga.zone.RestoreReader
    public void detachStream(Object obj, IconExporter iconExporter, NotificationFence notificationFence, int i) {
        int i2;
        NotificationFence connectPatch = notificationFence.connectPatch(-697180401);
        if ((i & 6) == 0) {
            i2 = (connectPatch.drawField(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= connectPatch.drawField(iconExporter) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= connectPatch.drawField(this) ? ContentOperation.RotationX : ContentOperation.SpotShadowColor;
        }
        if ((i2 & 147) == 146 && connectPatch.purgeNode()) {
            connectPatch.syncScope();
        } else {
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(-697180401, i2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
            }
            RestoreReader updateTimer = updateTimer();
            if (updateTimer == null) {
                throw new IllegalArgumentException("null wrappedHolder");
            }
            int i3 = i2 & 14;
            updateTimer.detachStream(obj, iconExporter, connectPatch, i2 & 126);
            boolean drawField = connectPatch.drawField(this) | connectPatch.drawField(obj);
            Object clipOrigin = connectPatch.clipOrigin();
            if (drawField || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
                clipOrigin = new FeedbackFlow(obj);
                connectPatch.bindBody(clipOrigin);
            }
            InitSet.evictLayout(obj, (TouchRecord) clipOrigin, connectPatch, i3);
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }
        ShapeCounter drawScope = connectPatch.drawScope();
        if (drawScope != null) {
            drawScope.evictLayout(new LayerUseCase(obj, iconExporter, i));
        }
    }

    @Override // com.goldenboot.saga.zone.MotionTunnel
    public boolean evictLayout(Object obj) {
        return this.reduceScope.evictLayout(obj);
    }

    @Override // com.goldenboot.saga.zone.MotionTunnel
    public Map growPayload() {
        RestoreReader updateTimer = updateTimer();
        if (updateTimer != null) {
            Iterator it = this.connectPatch.iterator();
            while (it.hasNext()) {
                updateTimer.releaseHeader(it.next());
            }
        }
        return this.reduceScope.growPayload();
    }

    @Override // com.goldenboot.saga.zone.MotionTunnel
    public Object injectMetric(String str) {
        return this.reduceScope.injectMetric(str);
    }

    @Override // com.goldenboot.saga.zone.RestoreReader
    public void releaseHeader(Object obj) {
        RestoreReader updateTimer = updateTimer();
        if (updateTimer == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        updateTimer.releaseHeader(obj);
    }

    public final RestoreReader updateTimer() {
        return (RestoreReader) this.notifyMessage.getValue();
    }

    public ShapeConverter(MotionTunnel motionTunnel, Map map) {
        this(SetupCompiler.injectMetric(map, new ActivityMutator(motionTunnel)));
    }
}
