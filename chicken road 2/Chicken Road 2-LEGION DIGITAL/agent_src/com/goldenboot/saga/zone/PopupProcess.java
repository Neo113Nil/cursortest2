package com.goldenboot.saga.zone;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.PluginInterpreter;
import com.goldenboot.saga.zone.PopupProcess;
import com.goldenboot.saga.zone.ShadowImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class PopupProcess {
    public final LayoutSynthesizer detachStream;
    public final Runnable evictLayout;
    public final WrapperValve growPayload;
    public boolean injectMetric;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public final class ActivityMutator extends ProgressPipe {
        public final BadgeSwitch injectMetric;

        public ActivityMutator() {
            BadgeSwitch badgeSwitch = new BadgeSwitch(new NativeNode() { // from class: com.goldenboot.saga.zone.BorderReporter
                @Override // com.goldenboot.saga.zone.NativeNode
                public final void evictLayout() {
                    PopupProcess.ActivityMutator.reduceScope(PopupProcess.this);
                }
            });
            badgeSwitch.injectMetric(this);
            this.injectMetric = badgeSwitch;
        }

        public static final void reduceScope(PopupProcess popupProcess) {
            Runnable runnable = popupProcess.evictLayout;
            if (runnable != null) {
                runnable.run();
            }
        }

        public final BadgeSwitch notifyMessage() {
            return this.injectMetric;
        }

        @Override // com.goldenboot.saga.zone.ProgressPipe
        public void popBlueprint(boolean z) {
            PopupProcess.this.injectMetric = z;
            WrapperValve wrapperValve = PopupProcess.this.growPayload;
            if (wrapperValve != null) {
                wrapperValve.accept(Boolean.valueOf(z));
            }
        }

        public final void serializeOffset() {
            growPayload();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler implements androidx.lifecycle.HeaderUtil {
        public final /* synthetic */ androidx.lifecycle.PluginInterpreter connectPatch;
        public final /* synthetic */ PopupProcess notifyMessage;
        public final /* synthetic */ ShadowImpl.ActivityMutator reduceScope;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public static final /* synthetic */ class ActivityMutator {
            public static final /* synthetic */ int[] evictLayout;

            static {
                int[] iArr = new int[PluginInterpreter.ActivityMutator.values().length];
                try {
                    iArr[PluginInterpreter.ActivityMutator.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PluginInterpreter.ActivityMutator.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PluginInterpreter.ActivityMutator.ON_DESTROY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                evictLayout = iArr;
            }
        }

        public BounceHandler(ShadowImpl.ActivityMutator activityMutator, PopupProcess popupProcess, androidx.lifecycle.PluginInterpreter pluginInterpreter) {
            this.reduceScope = activityMutator;
            this.notifyMessage = popupProcess;
            this.connectPatch = pluginInterpreter;
        }

        @Override // androidx.lifecycle.HeaderUtil
        public void updateAction(IconRing source, PluginInterpreter.ActivityMutator event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            int i = ActivityMutator.evictLayout[event.ordinal()];
            if (i == 1) {
                if (JoystickMonitor.growPayload) {
                    this.reduceScope.findTask(true);
                    return;
                } else {
                    BadgeSwitch.growPayload(this.notifyMessage.popBlueprint(), this.reduceScope, 0, 2, null);
                    return;
                }
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.reduceScope.gatherAdapter();
                this.connectPatch.detachStream(this);
                return;
            }
            if (JoystickMonitor.growPayload) {
                this.reduceScope.findTask(false);
            } else {
                this.reduceScope.gatherAdapter();
            }
        }
    }

    public PopupProcess(Runnable runnable, WrapperValve wrapperValve) {
        this.evictLayout = runnable;
        this.growPayload = wrapperValve;
        this.detachStream = InternalPropagator.evictLayout(new ElevationNode() { // from class: com.goldenboot.saga.zone.ProgressEntry
            @Override // com.goldenboot.saga.zone.ElevationNode
            public final Object invoke() {
                PopupProcess.ActivityMutator applyTask;
                applyTask = PopupProcess.applyTask(PopupProcess.this);
                return applyTask;
            }
        });
    }

    public static final ActivityMutator applyTask(PopupProcess popupProcess) {
        return popupProcess.new ActivityMutator();
    }

    public static final void updateTimer(androidx.lifecycle.PluginInterpreter pluginInterpreter, BounceHandler bounceHandler) {
        pluginInterpreter.detachStream(bounceHandler);
    }

    public final void clipOrigin(IconRing owner, ShadowImpl onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        final androidx.lifecycle.PluginInterpreter lifecycle = owner.getLifecycle();
        if (lifecycle.growPayload() == PluginInterpreter.BounceHandler.reduceScope) {
            return;
        }
        ShadowImpl.ActivityMutator growPayload = onBackPressedCallback.growPayload(new ApplicationGraph(onBackPressedCallback, owner));
        if (JoystickMonitor.growPayload) {
            growPayload.findTask(false);
            BadgeSwitch.growPayload(popBlueprint(), growPayload, 0, 2, null);
        }
        final BounceHandler bounceHandler = new BounceHandler(growPayload, this, lifecycle);
        lifecycle.evictLayout(bounceHandler);
        onBackPressedCallback.evictLayout(new AutoCloseable() { // from class: com.goldenboot.saga.zone.ColumnComposer
            @Override // java.lang.AutoCloseable
            public final void close() {
                PopupProcess.updateTimer(androidx.lifecycle.PluginInterpreter.this, bounceHandler);
            }
        });
    }

    public final void connectJob() {
        drawField().serializeOffset();
    }

    public final ActivityMutator drawField() {
        return (ActivityMutator) this.detachStream.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void flushSample(ShadowImpl onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        BadgeSwitch.growPayload(popBlueprint(), onBackPressedCallback.growPayload(new ApplicationGraph(onBackPressedCallback, null, 2, 0 == true ? 1 : 0)), 0, 2, null);
    }

    public final void peekRevision(OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        popBlueprint().detachStream(new JoystickNormalizer(invoker), 1);
        popBlueprint().detachStream(new ConsumerGuard(invoker), 0);
    }

    public final BadgeSwitch popBlueprint() {
        return drawField().notifyMessage();
    }

    public PopupProcess(Runnable runnable) {
        this(runnable, null);
    }
}
