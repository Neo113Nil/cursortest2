package com.goldenboot.saga.zone;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class TooltipRouter {
    public final RestoreStreamer evictLayout;

    public TooltipRouter(RestoreStreamer restoreStreamer) {
        this.evictLayout = restoreStreamer;
    }

    public static TooltipRouter growPayload(RestoreStreamer restoreStreamer) {
        return new TooltipRouter((RestoreStreamer) GroupBroadcaster.updateTimer(restoreStreamer, "callbacks == null"));
    }

    public void applyTask() {
        this.evictLayout.resetDelta.prepareTask();
    }

    public void clipOrigin() {
        this.evictLayout.resetDelta.syncScope();
    }

    public androidx.fragment.app.RestoreToggle connectJob() {
        return this.evictLayout.resetDelta;
    }

    public boolean detachStream(MenuItem menuItem) {
        return this.evictLayout.resetDelta.expandArgs(menuItem);
    }

    public boolean drawField() {
        return this.evictLayout.resetDelta.resetValue(true);
    }

    public void evictLayout(androidx.fragment.app.LayerUseCase layerUseCase) {
        RestoreStreamer restoreStreamer = this.evictLayout;
        restoreStreamer.resetDelta.connectJob(restoreStreamer, restoreStreamer, layerUseCase);
    }

    public void flushSample() {
        this.evictLayout.resetDelta.bindBody();
    }

    public void injectMetric() {
        this.evictLayout.resetDelta.gatherAdapter();
    }

    public void peekRevision() {
        this.evictLayout.resetDelta.prependArchive();
    }

    public void popBlueprint() {
        this.evictLayout.resetDelta.connectComponent();
    }

    public void releaseHeader() {
        this.evictLayout.resetDelta.findTask();
    }

    public View serializeOffset(View view, String str, Context context, AttributeSet attributeSet) {
        return this.evictLayout.resetDelta.closePayload().onCreateView(view, str, context, attributeSet);
    }

    public void updateTimer() {
        this.evictLayout.resetDelta.attachCallback();
    }
}
