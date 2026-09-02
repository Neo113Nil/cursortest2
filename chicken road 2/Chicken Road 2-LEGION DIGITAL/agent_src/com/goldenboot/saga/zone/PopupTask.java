package com.goldenboot.saga.zone;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class PopupTask {
    public static final PopupTask evictLayout = new PopupTask();
    public static final SelectionHub growPayload = CellAllocator.updateTimer(null, new ElevationNode() { // from class: com.goldenboot.saga.zone.TextSnapshot
        @Override // com.goldenboot.saga.zone.ElevationNode
        public final Object invoke() {
            GestureOrganizer growPayload2;
            growPayload2 = PopupTask.growPayload();
            return growPayload2;
        }
    }, 1, null);

    public static final GestureOrganizer growPayload() {
        return null;
    }

    public final GestureOrganizer injectMetric(NotificationFence notificationFence, int i) {
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(-2068013981, i, -1, "androidx.activity.compose.LocalOnBackPressedDispatcherOwner.<get-current> (BackHandler.kt:59)");
        }
        GestureOrganizer gestureOrganizer = (GestureOrganizer) notificationFence.expandArgs(growPayload);
        if (gestureOrganizer == null) {
            notificationFence.resumeSignature(1208426157);
            gestureOrganizer = FocusConductor.evictLayout((View) notificationFence.expandArgs(AndroidCompositionLocals_androidKt.peekRevision()));
        } else {
            notificationFence.resumeSignature(1208423708);
        }
        notificationFence.unlockMessage();
        if (gestureOrganizer == null) {
            notificationFence.resumeSignature(1208428160);
            Object obj = (Context) notificationFence.expandArgs(AndroidCompositionLocals_androidKt.flushSample());
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof GestureOrganizer) {
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            gestureOrganizer = (GestureOrganizer) obj;
        } else {
            notificationFence.resumeSignature(1208423789);
        }
        notificationFence.unlockMessage();
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return gestureOrganizer;
    }
}
