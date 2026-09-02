package com.goldenboot.saga.zone;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class CoreRollback extends ConsumerDownloader {
    public /* synthetic */ CoreRollback(boolean z, float f, MorphCreator morphCreator, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, morphCreator);
    }

    @Override // com.goldenboot.saga.zone.ConsumerDownloader
    public WidgetAction injectMetric(PanelBlock panelBlock, boolean z, float f, MorphCreator morphCreator, MorphCreator morphCreator2, NotificationFence notificationFence, int i) {
        ViewGroup releaseHeader;
        notificationFence.resumeSignature(331259447);
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(331259447, i, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:92)");
        }
        releaseHeader = HeaderHolder.releaseHeader((View) notificationFence.expandArgs(AndroidCompositionLocals_androidKt.peekRevision()));
        boolean formatPosition = ((((i & 14) ^ 6) > 4 && notificationFence.formatPosition(panelBlock)) || (i & 6) == 4) | ((((458752 & i) ^ 196608) > 131072 && notificationFence.formatPosition(this)) || (i & 196608) == 131072) | notificationFence.formatPosition(releaseHeader);
        Object clipOrigin = notificationFence.clipOrigin();
        if (formatPosition || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
            Object receiverLoader = new ReceiverLoader(z, f, morphCreator, morphCreator2, releaseHeader, null);
            notificationFence.bindBody(receiverLoader);
            clipOrigin = receiverLoader;
        }
        ReceiverLoader receiverLoader2 = (ReceiverLoader) clipOrigin;
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        notificationFence.unlockMessage();
        return receiverLoader2;
    }

    public CoreRollback(boolean z, float f, MorphCreator morphCreator) {
        super(z, f, morphCreator, null);
    }
}
