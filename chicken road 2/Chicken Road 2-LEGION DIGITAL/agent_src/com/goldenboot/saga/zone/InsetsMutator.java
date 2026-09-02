package com.goldenboot.saga.zone;

import android.R;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class InsetsMutator {
    public static final ViewGroup.LayoutParams evictLayout = new ViewGroup.LayoutParams(-2, -2);

    public static final void evictLayout(ObserverCompiler observerCompiler, WorkerIndex workerIndex, IconExporter iconExporter) {
        View childAt = ((ViewGroup) observerCompiler.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        StartupBeacon startupBeacon = childAt instanceof StartupBeacon ? (StartupBeacon) childAt : null;
        if (startupBeacon != null) {
            startupBeacon.setParentCompositionContext(workerIndex);
            startupBeacon.setContent(iconExporter);
            return;
        }
        StartupBeacon startupBeacon2 = new StartupBeacon(observerCompiler, null, 0, 6, null);
        startupBeacon2.setParentCompositionContext(workerIndex);
        startupBeacon2.setContent(iconExporter);
        injectMetric(observerCompiler);
        observerCompiler.setContentView(startupBeacon2, evictLayout);
    }

    public static /* synthetic */ void growPayload(ObserverCompiler observerCompiler, WorkerIndex workerIndex, IconExporter iconExporter, int i, Object obj) {
        if ((i & 1) != 0) {
            workerIndex = null;
        }
        evictLayout(observerCompiler, workerIndex, iconExporter);
    }

    public static final void injectMetric(ObserverCompiler observerCompiler) {
        View decorView = observerCompiler.getWindow().getDecorView();
        if (PressExecutor.evictLayout(decorView) == null) {
            PressExecutor.growPayload(decorView, observerCompiler);
        }
        if (RuntimeChannel.evictLayout(decorView) == null) {
            RuntimeChannel.growPayload(decorView, observerCompiler);
        }
        if (CursorMaintainer.evictLayout(decorView) == null) {
            CursorMaintainer.growPayload(decorView, observerCompiler);
        }
    }
}
