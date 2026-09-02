package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ParallelSlot extends RemoteCallback.LayerUseCase {
    public ConfigMerger flattenPackage;
    public AnimOrchestrator injectConstraint;
    public final boolean storeCharset;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends PanelRevision implements IconExporter {
        public final /* synthetic */ InternalBridge attachConfig;
        public final /* synthetic */ StepperDiff connectPatch;
        public final /* synthetic */ ConfigMerger notifyMessage;
        public int reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(ConfigMerger configMerger, StepperDiff stepperDiff, InternalBridge internalBridge, ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
            this.notifyMessage = configMerger;
            this.connectPatch = stepperDiff;
            this.attachConfig = internalBridge;
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            return new ActivityMutator(this.notifyMessage, this.connectPatch, this.attachConfig, serviceRegulator);
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
                ConfigMerger configMerger = this.notifyMessage;
                StepperDiff stepperDiff = this.connectPatch;
                this.reduceScope = 1;
                if (configMerger.evictLayout(stepperDiff, this) == releaseHeader) {
                    return releaseHeader;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ColumnForger.growPayload(obj);
            }
            InternalBridge internalBridge = this.attachConfig;
            if (internalBridge != null) {
                internalBridge.evictLayout();
            }
            return DpadBuilder.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends Lambda implements TouchRecord {
        public final /* synthetic */ StepperDiff notifyMessage;
        public final /* synthetic */ ConfigMerger reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BounceHandler(ConfigMerger configMerger, StepperDiff stepperDiff) {
            super(1);
            this.reduceScope = configMerger;
            this.notifyMessage = stepperDiff;
        }

        public final void evictLayout(Throwable th) {
            this.reduceScope.injectMetric(this.notifyMessage);
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((Throwable) obj);
            return DpadBuilder.evictLayout;
        }
    }

    public ParallelSlot(ConfigMerger configMerger) {
        this.flattenPackage = configMerger;
    }

    private final void evictMessage() {
        AnimOrchestrator animOrchestrator;
        ConfigMerger configMerger = this.flattenPackage;
        if (configMerger != null && (animOrchestrator = this.injectConstraint) != null) {
            configMerger.injectMetric(new ServerCache(animOrchestrator));
        }
        this.injectConstraint = null;
    }

    @Override // androidx.compose.ui.RemoteCallback.LayerUseCase
    /* renamed from: decodeDigest */
    public boolean getShouldAutoInvalidate() {
        return this.storeCharset;
    }

    public final void packSnapshot(ConfigMerger configMerger, StepperDiff stepperDiff) {
        if (!getIsAttached()) {
            configMerger.injectMetric(stepperDiff);
        } else {
            DrawableSynthesizer drawableSynthesizer = (DrawableSynthesizer) trimEntry().getCoroutineContext().evictLayout(DrawableSynthesizer.popBlueprint);
            BottomBarDrain.detachStream(trimEntry(), null, null, new ActivityMutator(configMerger, stepperDiff, drawableSynthesizer != null ? drawableSynthesizer.attachConfig(new BounceHandler(configMerger, stepperDiff)) : null, null), 3, null);
        }
    }

    public final void startBundle(boolean z) {
        ConfigMerger configMerger = this.flattenPackage;
        if (configMerger != null) {
            if (!z) {
                AnimOrchestrator animOrchestrator = this.injectConstraint;
                if (animOrchestrator != null) {
                    packSnapshot(configMerger, new ServerCache(animOrchestrator));
                    this.injectConstraint = null;
                    return;
                }
                return;
            }
            AnimOrchestrator animOrchestrator2 = this.injectConstraint;
            if (animOrchestrator2 != null) {
                packSnapshot(configMerger, new ServerCache(animOrchestrator2));
                this.injectConstraint = null;
            }
            AnimOrchestrator animOrchestrator3 = new AnimOrchestrator();
            packSnapshot(configMerger, animOrchestrator3);
            this.injectConstraint = animOrchestrator3;
        }
    }

    public final void storeCache(ConfigMerger configMerger) {
        if (Intrinsics.areEqual(this.flattenPackage, configMerger)) {
            return;
        }
        evictMessage();
        this.flattenPackage = configMerger;
    }
}
