package com.goldenboot.saga.zone;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.insets.ProtectionLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class EndpointOverseer extends ApplicationFlow {
    @Override // com.goldenboot.saga.zone.RailController, com.goldenboot.saga.zone.FlexDiff, com.goldenboot.saga.zone.ConsumerAllocator
    public void evictLayout(FlexFormatter statusBarStyle, FlexFormatter navigationBarStyle, Window window, View view, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        LabelVersion.growPayload(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int detachStream = statusBarStyle.detachStream(z);
        int detachStream2 = navigationBarStyle.detachStream(z2);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            Iterator it = WrapperGate.evictLayout(viewGroup).iterator();
            while (true) {
                if (it.hasNext()) {
                    Object tag = ((View) it.next()).getTag();
                    if (tag instanceof List) {
                        List list = (List) tag;
                        if (list.size() == 4 && (list.get(0) instanceof ConnectionArbitrator)) {
                            for (Object obj : (Iterable) tag) {
                                if ((obj instanceof ConnectionArbitrator ? (ConnectionArbitrator) obj : null) != null) {
                                    ConnectionArbitrator connectionArbitrator = (ConnectionArbitrator) obj;
                                    int releaseHeader = connectionArbitrator.releaseHeader();
                                    if (releaseHeader == 1) {
                                        connectionArbitrator.notifyMessage(detachStream2);
                                    } else if (releaseHeader == 2) {
                                        connectionArbitrator.notifyMessage(detachStream);
                                    } else if (releaseHeader == 4) {
                                        connectionArbitrator.notifyMessage(detachStream2);
                                    } else if (releaseHeader == 8) {
                                        connectionArbitrator.notifyMessage(detachStream2);
                                    }
                                }
                            }
                        }
                    }
                } else if (detachStream != 0 || detachStream2 != 0) {
                    List notifyMessage = CursorBuilder.notifyMessage(new ConnectionArbitrator(2, detachStream), new ConnectionArbitrator(1, detachStream2), new ConnectionArbitrator(4, detachStream2), new ConnectionArbitrator(8, detachStream2));
                    ProtectionLayout protectionLayout = new ProtectionLayout(((ViewGroup) view).getContext(), notifyMessage);
                    protectionLayout.setTag(notifyMessage);
                    viewGroup.addView(protectionLayout);
                }
            }
        }
        window.setNavigationBarContrastEnforced(navigationBarStyle.growPayload() == 0);
        StatePort statePort = new StatePort(window, view);
        statePort.detachStream(!z);
        statePort.injectMetric(!z2);
    }
}
