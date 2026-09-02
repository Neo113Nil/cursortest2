package com.goldenboot.saga.zone;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.goldenboot.saga.zone.ContainerSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlin/Function0;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "content", "injectMetric", "(Lcom/goldenboot/saga/zone/IconExporter;Lcom/goldenboot/saga/zone/NotificationFence;I)V", "Lcom/goldenboot/saga/zone/LocalLogger;", "evictLayout", "Lcom/goldenboot/saga/zone/LocalLogger;", "GoldenbootColors", "app_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeyframeTrigger {
    private static final LocalLogger evictLayout = NativeList.releaseHeader(DrawerSemaphore.injectMetric(), DrawerSemaphore.attachConfig(), DrawerSemaphore.reduceScope(), DrawerSemaphore.attachConfig(), 0, DrawerSemaphore.detachStream(), DrawerSemaphore.popBlueprint(), DrawerSemaphore.connectJob(), DrawerSemaphore.attachConfig(), DrawerSemaphore.flushSample(), DrawerSemaphore.popBlueprint(), 0, 0, DrawerSemaphore.applyTask(), DrawerSemaphore.attachConfig(), DrawerSemaphore.drawField(), DrawerSemaphore.attachConfig(), DrawerSemaphore.connectJob(), DrawerSemaphore.resetDelta(), 0, 0, 0, DrawerSemaphore.inflateAdapter(), DrawerSemaphore.attachConfig(), 0, 0, BoxSaver.detachStream(4282145436L), 0, 0, 0, 0, 0, 0, 0, 0, 0, -80209904, 15, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final DpadBuilder detachStream(View view) {
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        Window window = ((Activity) context).getWindow();
        ContainerSource.Companion companion = ContainerSource.INSTANCE;
        window.setStatusBarColor(BoxSaver.inflateAdapter(companion.resetDelta()));
        window.setNavigationBarColor(BoxSaver.inflateAdapter(companion.resetDelta()));
        StatePort evictLayout2 = LabelVersion.evictLayout(window, view);
        evictLayout2.detachStream(false);
        evictLayout2.injectMetric(false);
        return DpadBuilder.evictLayout;
    }

    public static final void injectMetric(IconExporter content, NotificationFence notificationFence, final int i) {
        int i2;
        final IconExporter iconExporter;
        Intrinsics.checkNotNullParameter(content, "content");
        NotificationFence connectPatch = notificationFence.connectPatch(-140683077);
        if ((i & 6) == 0) {
            i2 = (connectPatch.drawField(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && connectPatch.purgeNode()) {
            connectPatch.syncScope();
            iconExporter = content;
        } else {
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(-140683077, i2, -1, "com.goldenboot.saga.zone.ui.theme.GoldenbootTheme (Theme.kt:35)");
            }
            final View view = (View) connectPatch.expandArgs(AndroidCompositionLocals_androidKt.peekRevision());
            connectPatch.resumeSignature(710833202);
            if (!view.isInEditMode()) {
                connectPatch.resumeSignature(710834591);
                boolean drawField = connectPatch.drawField(view);
                Object clipOrigin = connectPatch.clipOrigin();
                if (drawField || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
                    clipOrigin = new ElevationNode() { // from class: com.goldenboot.saga.zone.CoreGovernor
                        @Override // com.goldenboot.saga.zone.ElevationNode
                        public final Object invoke() {
                            DpadBuilder detachStream;
                            detachStream = KeyframeTrigger.detachStream(view);
                            return detachStream;
                        }
                    };
                    connectPatch.bindBody(clipOrigin);
                }
                connectPatch.unlockMessage();
                InitSet.flushSample((ElevationNode) clipOrigin, connectPatch, 0);
            }
            connectPatch.unlockMessage();
            iconExporter = content;
            WatcherRegulator.evictLayout(evictLayout, null, GradientReporter.evictLayout(), iconExporter, connectPatch, ((i2 << 9) & 7168) | 390, 2);
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }
        ShapeCounter drawScope = connectPatch.drawScope();
        if (drawScope != null) {
            drawScope.evictLayout(new IconExporter() { // from class: com.goldenboot.saga.zone.ProxyAction
                @Override // com.goldenboot.saga.zone.IconExporter
                public final Object invoke(Object obj, Object obj2) {
                    DpadBuilder releaseHeader;
                    releaseHeader = KeyframeTrigger.releaseHeader(IconExporter.this, i, (NotificationFence) obj, ((Integer) obj2).intValue());
                    return releaseHeader;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DpadBuilder releaseHeader(IconExporter iconExporter, int i, NotificationFence notificationFence, int i2) {
        injectMetric(iconExporter, notificationFence, NavBarImpl.evictLayout(i | 1));
        return DpadBuilder.evictLayout;
    }
}
