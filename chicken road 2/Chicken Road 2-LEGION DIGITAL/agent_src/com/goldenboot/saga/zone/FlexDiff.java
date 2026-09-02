package com.goldenboot.saga.zone;

import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class FlexDiff extends MarginWriter {
    @Override // com.goldenboot.saga.zone.ConsumerAllocator
    public void evictLayout(FlexFormatter statusBarStyle, FlexFormatter navigationBarStyle, Window window, View view, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        LabelVersion.growPayload(window, false);
        window.setStatusBarColor(statusBarStyle.injectMetric(z));
        window.setNavigationBarColor(navigationBarStyle.injectMetric(z2));
        StatePort statePort = new StatePort(window, view);
        statePort.detachStream(!z);
        statePort.injectMetric(!z2);
    }
}
