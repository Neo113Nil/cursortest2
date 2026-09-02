package com.goldenboot.saga.zone;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.goldenboot.saga.zone.ConfigSnapshot;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ConnectionRecovery {
    public static final ActivityMutator decodePath = new ActivityMutator(null);
    public static final int drawScope = 8;
    public static final WeakHashMap expandArgs = new WeakHashMap();
    public static boolean findTask;
    public final TouchLock applyTask;
    public final CachedSerializer attachConfig;
    public final TouchLock clipOrigin;
    public final TapRepository connectJob;
    public final CachedSerializer connectPatch;
    public final TouchLock detachStream;
    public final TapRepository drawField;
    public int drawRequest;
    public final TouchLock evictLayout;
    public final TouchLock flushSample;
    public final SetupBin gatherAdapter;
    public final TouchLock growPayload;
    public final CachedSerializer inflateAdapter;
    public final TouchLock injectMetric;
    public final CachedSerializer notifyMessage;
    public final TapRepository peekRevision;
    public final CachedSerializer popBlueprint;
    public final boolean purgeNode;
    public final CachedSerializer reduceScope;
    public final TouchLock releaseHeader;
    public final CachedSerializer resetDelta;
    public final CachedSerializer serializeOffset;
    public final TouchLock updateTimer;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.ConnectionRecovery$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0096ActivityMutator extends Lambda implements TouchRecord {
            public final /* synthetic */ View notifyMessage;
            public final /* synthetic */ ConnectionRecovery reduceScope;

            /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
            /* renamed from: com.goldenboot.saga.zone.ConnectionRecovery$ActivityMutator$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
            public static final class C0097ActivityMutator implements ChannelArranger {
                public final /* synthetic */ ConnectionRecovery evictLayout;
                public final /* synthetic */ View growPayload;

                public C0097ActivityMutator(ConnectionRecovery connectionRecovery, View view) {
                    this.evictLayout = connectionRecovery;
                    this.growPayload = view;
                }

                @Override // com.goldenboot.saga.zone.ChannelArranger
                public void evictLayout() {
                    this.evictLayout.growPayload(this.growPayload);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0096ActivityMutator(ConnectionRecovery connectionRecovery, View view) {
                super(1);
                this.reduceScope = connectionRecovery;
                this.notifyMessage = view;
            }

            @Override // com.goldenboot.saga.zone.TouchRecord
            /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
            public final ChannelArranger invoke(BounceDelegate bounceDelegate) {
                this.reduceScope.releaseHeader(this.notifyMessage);
                return new C0097ActivityMutator(this.reduceScope, this.notifyMessage);
            }
        }

        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CachedSerializer clipOrigin(ConfigSnapshot configSnapshot, int i, String str) {
            FooterMaintainer footerMaintainer;
            if (configSnapshot == null || (footerMaintainer = configSnapshot.updateTimer(i)) == null) {
                footerMaintainer = FooterMaintainer.releaseHeader;
            }
            return SectionCycle.evictLayout(footerMaintainer, str);
        }

        public final ConnectionRecovery detachStream(View view) {
            ConnectionRecovery connectionRecovery;
            synchronized (ConnectionRecovery.expandArgs) {
                try {
                    WeakHashMap weakHashMap = ConnectionRecovery.expandArgs;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        ConnectionRecovery connectionRecovery2 = new ConnectionRecovery(null, view, false ? 1 : 0);
                        weakHashMap.put(view, connectionRecovery2);
                        obj2 = connectionRecovery2;
                    }
                    connectionRecovery = (ConnectionRecovery) obj2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return connectionRecovery;
        }

        public final ConnectionRecovery injectMetric(NotificationFence notificationFence, int i) {
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(-1366542614, i, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            View view = (View) notificationFence.expandArgs(AndroidCompositionLocals_androidKt.peekRevision());
            ConnectionRecovery detachStream = detachStream(view);
            boolean drawField = notificationFence.drawField(detachStream) | notificationFence.drawField(view);
            Object clipOrigin = notificationFence.clipOrigin();
            if (drawField || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
                clipOrigin = new C0096ActivityMutator(detachStream, view);
                notificationFence.bindBody(clipOrigin);
            }
            InitSet.evictLayout(detachStream, (TouchRecord) clipOrigin, notificationFence, 0);
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
            return detachStream;
        }

        public final TouchLock releaseHeader(ConfigSnapshot configSnapshot, int i, String str) {
            TouchLock touchLock = new TouchLock(i, str);
            if (configSnapshot != null) {
                touchLock.updateTimer(configSnapshot, i);
            }
            return touchLock;
        }

        public ActivityMutator() {
        }
    }

    public /* synthetic */ ConnectionRecovery(ConfigSnapshot configSnapshot, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(configSnapshot, view);
    }

    public static /* synthetic */ void flushSample(ConnectionRecovery connectionRecovery, ConfigSnapshot configSnapshot, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        connectionRecovery.clipOrigin(configSnapshot, i);
    }

    public final void applyTask(ConfigSnapshot configSnapshot) {
        this.resetDelta.clipOrigin(SectionCycle.growPayload(configSnapshot.flushSample(ConfigSnapshot.PanelUtil.detachStream())));
    }

    public final void clipOrigin(ConfigSnapshot configSnapshot, int i) {
        if (findTask) {
            WindowInsets flattenPackage = configSnapshot.flattenPackage();
            Intrinsics.checkNotNull(flattenPackage);
            configSnapshot = ConfigSnapshot.injectConstraint(flattenPackage);
        }
        this.evictLayout.updateTimer(configSnapshot, i);
        this.injectMetric.updateTimer(configSnapshot, i);
        this.growPayload.updateTimer(configSnapshot, i);
        this.releaseHeader.updateTimer(configSnapshot, i);
        this.clipOrigin.updateTimer(configSnapshot, i);
        this.flushSample.updateTimer(configSnapshot, i);
        this.updateTimer.updateTimer(configSnapshot, i);
        this.applyTask.updateTimer(configSnapshot, i);
        this.detachStream.updateTimer(configSnapshot, i);
        if (i == 0) {
            this.serializeOffset.clipOrigin(SectionCycle.growPayload(configSnapshot.updateTimer(ConfigSnapshot.PanelUtil.growPayload())));
            this.reduceScope.clipOrigin(SectionCycle.growPayload(configSnapshot.updateTimer(ConfigSnapshot.PanelUtil.flushSample())));
            this.notifyMessage.clipOrigin(SectionCycle.growPayload(configSnapshot.updateTimer(ConfigSnapshot.PanelUtil.updateTimer())));
            this.connectPatch.clipOrigin(SectionCycle.growPayload(configSnapshot.updateTimer(ConfigSnapshot.PanelUtil.applyTask())));
            this.attachConfig.clipOrigin(SectionCycle.growPayload(configSnapshot.updateTimer(ConfigSnapshot.PanelUtil.drawField())));
            BottomBarProcess clipOrigin = configSnapshot.clipOrigin();
            if (clipOrigin != null) {
                this.popBlueprint.clipOrigin(SectionCycle.growPayload(clipOrigin.clipOrigin()));
            }
        }
        ItemGovernor.releaseHeader.peekRevision();
    }

    public final TouchLock detachStream() {
        return this.flushSample;
    }

    public final void growPayload(View view) {
        int i = this.drawRequest - 1;
        this.drawRequest = i;
        if (i == 0) {
            ItemFacilitator.growCallback(view, null);
            ItemFacilitator.executeRecord(view, null);
            view.removeOnAttachStateChangeListener(this.gatherAdapter);
        }
    }

    public final boolean injectMetric() {
        return this.purgeNode;
    }

    public final void releaseHeader(View view) {
        if (this.drawRequest == 0) {
            ItemFacilitator.growCallback(view, this.gatherAdapter);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.gatherAdapter);
            ItemFacilitator.executeRecord(view, this.gatherAdapter);
        }
        this.drawRequest++;
    }

    public final void updateTimer(ConfigSnapshot configSnapshot) {
        this.inflateAdapter.clipOrigin(SectionCycle.growPayload(configSnapshot.flushSample(ConfigSnapshot.PanelUtil.detachStream())));
    }

    public ConnectionRecovery(ConfigSnapshot configSnapshot, View view) {
        BottomBarProcess clipOrigin;
        FooterMaintainer clipOrigin2;
        ActivityMutator activityMutator = decodePath;
        this.evictLayout = activityMutator.releaseHeader(configSnapshot, ConfigSnapshot.PanelUtil.growPayload(), "captionBar");
        TouchLock releaseHeader = activityMutator.releaseHeader(configSnapshot, ConfigSnapshot.PanelUtil.injectMetric(), "displayCutout");
        this.growPayload = releaseHeader;
        TouchLock releaseHeader2 = activityMutator.releaseHeader(configSnapshot, ConfigSnapshot.PanelUtil.detachStream(), "ime");
        this.injectMetric = releaseHeader2;
        TouchLock releaseHeader3 = activityMutator.releaseHeader(configSnapshot, ConfigSnapshot.PanelUtil.clipOrigin(), "mandatorySystemGestures");
        this.detachStream = releaseHeader3;
        this.releaseHeader = activityMutator.releaseHeader(configSnapshot, ConfigSnapshot.PanelUtil.flushSample(), "navigationBars");
        this.clipOrigin = activityMutator.releaseHeader(configSnapshot, ConfigSnapshot.PanelUtil.updateTimer(), "statusBars");
        TouchLock releaseHeader4 = activityMutator.releaseHeader(configSnapshot, ConfigSnapshot.PanelUtil.applyTask(), "systemBars");
        this.flushSample = releaseHeader4;
        TouchLock releaseHeader5 = activityMutator.releaseHeader(configSnapshot, ConfigSnapshot.PanelUtil.popBlueprint(), "systemGestures");
        this.updateTimer = releaseHeader5;
        TouchLock releaseHeader6 = activityMutator.releaseHeader(configSnapshot, ConfigSnapshot.PanelUtil.drawField(), "tappableElement");
        this.applyTask = releaseHeader6;
        CachedSerializer evictLayout = SectionCycle.evictLayout((configSnapshot == null || (clipOrigin = configSnapshot.clipOrigin()) == null || (clipOrigin2 = clipOrigin.clipOrigin()) == null) ? FooterMaintainer.releaseHeader : clipOrigin2, "waterfall");
        this.popBlueprint = evictLayout;
        TapRepository injectMetric = CardLoader.injectMetric(CardLoader.injectMetric(releaseHeader4, releaseHeader2), releaseHeader);
        this.drawField = injectMetric;
        TapRepository injectMetric2 = CardLoader.injectMetric(CardLoader.injectMetric(CardLoader.injectMetric(releaseHeader6, releaseHeader3), releaseHeader5), evictLayout);
        this.connectJob = injectMetric2;
        this.peekRevision = CardLoader.injectMetric(injectMetric, injectMetric2);
        this.serializeOffset = activityMutator.clipOrigin(configSnapshot, ConfigSnapshot.PanelUtil.growPayload(), "captionBarIgnoringVisibility");
        this.reduceScope = activityMutator.clipOrigin(configSnapshot, ConfigSnapshot.PanelUtil.flushSample(), "navigationBarsIgnoringVisibility");
        this.notifyMessage = activityMutator.clipOrigin(configSnapshot, ConfigSnapshot.PanelUtil.updateTimer(), "statusBarsIgnoringVisibility");
        this.connectPatch = activityMutator.clipOrigin(configSnapshot, ConfigSnapshot.PanelUtil.applyTask(), "systemBarsIgnoringVisibility");
        this.attachConfig = activityMutator.clipOrigin(configSnapshot, ConfigSnapshot.PanelUtil.drawField(), "tappableElementIgnoringVisibility");
        this.resetDelta = activityMutator.clipOrigin(configSnapshot, ConfigSnapshot.PanelUtil.detachStream(), "imeAnimationTarget");
        this.inflateAdapter = activityMutator.clipOrigin(configSnapshot, ConfigSnapshot.PanelUtil.detachStream(), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(TrackballSteward.queryModel) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.purgeNode = bool != null ? bool.booleanValue() : true;
        this.gatherAdapter = new SetupBin(this);
    }
}
