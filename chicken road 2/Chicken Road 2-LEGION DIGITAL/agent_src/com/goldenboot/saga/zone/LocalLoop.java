package com.goldenboot.saga.zone;

import androidx.compose.ui.layout.GradientActivator;
import com.goldenboot.saga.zone.ChannelUploader;
import com.goldenboot.saga.zone.FrameIndex;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class LocalLoop implements FlexMaterializer, ClientMigration {
    public final FrameIndex.LayerUseCase evictLayout;
    public final ChannelUploader.FeedbackFlow growPayload;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements TouchRecord {
        public final /* synthetic */ int attachConfig;
        public final /* synthetic */ int connectPatch;
        public final /* synthetic */ LocalLoop notifyMessage;
        public final /* synthetic */ androidx.compose.ui.layout.GradientActivator[] reduceScope;
        public final /* synthetic */ int[] resetDelta;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(androidx.compose.ui.layout.GradientActivator[] gradientActivatorArr, LocalLoop localLoop, int i, int i2, int[] iArr) {
            super(1);
            this.reduceScope = gradientActivatorArr;
            this.notifyMessage = localLoop;
            this.connectPatch = i;
            this.attachConfig = i2;
            this.resetDelta = iArr;
        }

        public final void evictLayout(GradientActivator.ActivityMutator activityMutator) {
            androidx.compose.ui.layout.GradientActivator[] gradientActivatorArr = this.reduceScope;
            LocalLoop localLoop = this.notifyMessage;
            int i = this.connectPatch;
            int i2 = this.attachConfig;
            int[] iArr = this.resetDelta;
            int length = gradientActivatorArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                androidx.compose.ui.layout.GradientActivator gradientActivator = gradientActivatorArr[i3];
                Intrinsics.checkNotNull(gradientActivator);
                GradientActivator.ActivityMutator.updateAction(activityMutator, gradientActivator, iArr[i4], localLoop.connectPatch(gradientActivator, DrawerFormatter.injectMetric(gradientActivator), i, i2), 0.0f, 4, null);
                i3++;
                i4++;
            }
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((GradientActivator.ActivityMutator) obj);
            return DpadBuilder.evictLayout;
        }
    }

    public LocalLoop(FrameIndex.LayerUseCase layerUseCase, ChannelUploader.FeedbackFlow feedbackFlow) {
        this.evictLayout = layerUseCase;
        this.growPayload = feedbackFlow;
    }

    @Override // com.goldenboot.saga.zone.ClientMigration
    public long applyTask(int i, int i2, int i3, int i4, boolean z) {
        return StateSegment.evictLayout(z, i, i2, i3, i4);
    }

    @Override // com.goldenboot.saga.zone.ClientMigration
    public void clipOrigin(int i, int[] iArr, int[] iArr2, androidx.compose.ui.layout.PanelUtil panelUtil) {
        this.evictLayout.injectMetric(panelUtil, i, iArr, panelUtil.getLayoutDirection(), iArr2);
    }

    @Override // com.goldenboot.saga.zone.ClientMigration
    public int connectJob(androidx.compose.ui.layout.GradientActivator gradientActivator) {
        return gradientActivator.getWidth();
    }

    public final int connectPatch(androidx.compose.ui.layout.GradientActivator gradientActivator, FadeFilter fadeFilter, int i, int i2) {
        if (fadeFilter != null) {
            fadeFilter.evictLayout();
        }
        return this.growPayload.evictLayout(0, i - gradientActivator.getHeight());
    }

    @Override // com.goldenboot.saga.zone.FlexMaterializer
    public int detachStream(ProducerRecovery producerRecovery, List list, int i) {
        return DrawerTransformer.evictLayout.detachStream(list, i, producerRecovery.lookupStream(this.evictLayout.evictLayout()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalLoop)) {
            return false;
        }
        LocalLoop localLoop = (LocalLoop) obj;
        return Intrinsics.areEqual(this.evictLayout, localLoop.evictLayout) && Intrinsics.areEqual(this.growPayload, localLoop.growPayload);
    }

    @Override // com.goldenboot.saga.zone.FlexMaterializer
    public ContentConfigurator evictLayout(androidx.compose.ui.layout.PanelUtil panelUtil, List list, long j) {
        ContentConfigurator evictLayout;
        evictLayout = PinchState.evictLayout(this, PagerPlanner.attachConfig(j), PagerPlanner.connectPatch(j), PagerPlanner.notifyMessage(j), PagerPlanner.reduceScope(j), panelUtil.lookupStream(this.evictLayout.evictLayout()), panelUtil, list, new androidx.compose.ui.layout.GradientActivator[list.size()], 0, list.size(), (r28 & ContentOperation.RotationZ) != 0 ? null : null, (r28 & ContentOperation.CameraDistance) != 0 ? 0 : 0);
        return evictLayout;
    }

    @Override // com.goldenboot.saga.zone.FlexMaterializer
    public int growPayload(ProducerRecovery producerRecovery, List list, int i) {
        return DrawerTransformer.evictLayout.evictLayout(list, i, producerRecovery.lookupStream(this.evictLayout.evictLayout()));
    }

    public int hashCode() {
        return (this.evictLayout.hashCode() * 31) + this.growPayload.hashCode();
    }

    @Override // com.goldenboot.saga.zone.FlexMaterializer
    public int injectMetric(ProducerRecovery producerRecovery, List list, int i) {
        return DrawerTransformer.evictLayout.growPayload(list, i, producerRecovery.lookupStream(this.evictLayout.evictLayout()));
    }

    @Override // com.goldenboot.saga.zone.ClientMigration
    public int reduceScope(androidx.compose.ui.layout.GradientActivator gradientActivator) {
        return gradientActivator.getHeight();
    }

    @Override // com.goldenboot.saga.zone.FlexMaterializer
    public int releaseHeader(ProducerRecovery producerRecovery, List list, int i) {
        return DrawerTransformer.evictLayout.injectMetric(list, i, producerRecovery.lookupStream(this.evictLayout.evictLayout()));
    }

    public String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.evictLayout + ", verticalAlignment=" + this.growPayload + ')';
    }

    @Override // com.goldenboot.saga.zone.ClientMigration
    public ContentConfigurator updateTimer(androidx.compose.ui.layout.GradientActivator[] gradientActivatorArr, androidx.compose.ui.layout.PanelUtil panelUtil, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return androidx.compose.ui.layout.PanelUtil.encodeOrigin(panelUtil, i2, i3, null, new ActivityMutator(gradientActivatorArr, this, i3, i, iArr), 4, null);
    }
}
