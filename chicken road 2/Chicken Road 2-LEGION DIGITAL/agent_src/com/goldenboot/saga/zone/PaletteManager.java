package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class PaletteManager {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements IconExporter {
        public final /* synthetic */ ConfigListener notifyMessage;
        public final /* synthetic */ FlexMaterializer reduceScope;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.PaletteManager$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0140ActivityMutator extends Lambda implements IconExporter {
            public final /* synthetic */ TextFetcher notifyMessage;
            public final /* synthetic */ ConfigListener reduceScope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0140ActivityMutator(ConfigListener configListener, TextFetcher textFetcher) {
                super(2);
                this.reduceScope = configListener;
                this.notifyMessage = textFetcher;
            }

            public final void evictLayout(NotificationFence notificationFence, int i) {
                if ((i & 3) == 2 && notificationFence.purgeNode()) {
                    notificationFence.syncScope();
                    return;
                }
                if (MorphPatch.bindBody()) {
                    MorphPatch.formatPosition(-1945019079, i, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                }
                this.reduceScope.invoke(this.notifyMessage, notificationFence, 0);
                if (MorphPatch.bindBody()) {
                    MorphPatch.startResource();
                }
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                evictLayout((NotificationFence) obj, ((Number) obj2).intValue());
                return DpadBuilder.evictLayout;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(FlexMaterializer flexMaterializer, ConfigListener configListener) {
            super(2);
            this.reduceScope = flexMaterializer;
            this.notifyMessage = configListener;
        }

        public final ContentConfigurator evictLayout(ProgressHandler progressHandler, long j) {
            return this.reduceScope.evictLayout(progressHandler, progressHandler.extractPosition(DpadBuilder.evictLayout, IconMaker.growPayload(-1945019079, true, new C0140ActivityMutator(this.notifyMessage, new TextFetcher(progressHandler, j, null)))), j);
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return evictLayout((ProgressHandler) obj, ((PagerPlanner) obj2).getValue());
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends Lambda implements IconExporter {
        public final /* synthetic */ ConfigListener attachConfig;
        public final /* synthetic */ boolean connectPatch;
        public final /* synthetic */ int inflateAdapter;
        public final /* synthetic */ ChannelUploader notifyMessage;
        public final /* synthetic */ androidx.compose.ui.RemoteCallback reduceScope;
        public final /* synthetic */ int resetDelta;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BounceHandler(androidx.compose.ui.RemoteCallback remoteCallback, ChannelUploader channelUploader, boolean z, ConfigListener configListener, int i, int i2) {
            super(2);
            this.reduceScope = remoteCallback;
            this.notifyMessage = channelUploader;
            this.connectPatch = z;
            this.attachConfig = configListener;
            this.resetDelta = i;
            this.inflateAdapter = i2;
        }

        public final void evictLayout(NotificationFence notificationFence, int i) {
            PaletteManager.evictLayout(this.reduceScope, this.notifyMessage, this.connectPatch, this.attachConfig, notificationFence, NavBarImpl.evictLayout(this.resetDelta | 1), this.inflateAdapter);
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            evictLayout((NotificationFence) obj, ((Number) obj2).intValue());
            return DpadBuilder.evictLayout;
        }
    }

    public static final void evictLayout(androidx.compose.ui.RemoteCallback remoteCallback, ChannelUploader channelUploader, boolean z, ConfigListener configListener, NotificationFence notificationFence, int i, int i2) {
        int i3;
        NotificationFence connectPatch = notificationFence.connectPatch(1781813501);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (connectPatch.formatPosition(remoteCallback) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= connectPatch.formatPosition(channelUploader) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= connectPatch.injectMetric(z) ? ContentOperation.RotationX : ContentOperation.SpotShadowColor;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= connectPatch.drawField(configListener) ? 2048 : ContentOperation.RotationZ;
        }
        if ((i3 & 1171) == 1170 && connectPatch.purgeNode()) {
            connectPatch.syncScope();
        } else {
            if (i4 != 0) {
                remoteCallback = androidx.compose.ui.RemoteCallback.INSTANCE;
            }
            if (i5 != 0) {
                channelUploader = ChannelUploader.INSTANCE.syncScope();
            }
            if (i6 != 0) {
                z = false;
            }
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(1781813501, i3, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:64)");
            }
            FlexMaterializer updateTimer = WaveGuard.updateTimer(channelUploader, z);
            boolean formatPosition = ((i3 & 7168) == 2048) | connectPatch.formatPosition(updateTimer);
            Object clipOrigin = connectPatch.clipOrigin();
            if (formatPosition || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
                clipOrigin = new ActivityMutator(updateTimer, configListener);
                connectPatch.bindBody(clipOrigin);
            }
            androidx.compose.ui.layout.PanelSignal.evictLayout(remoteCallback, (IconExporter) clipOrigin, connectPatch, i3 & 14, 0);
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }
        androidx.compose.ui.RemoteCallback remoteCallback2 = remoteCallback;
        ChannelUploader channelUploader2 = channelUploader;
        boolean z2 = z;
        ShapeCounter drawScope = connectPatch.drawScope();
        if (drawScope != null) {
            drawScope.evictLayout(new BounceHandler(remoteCallback2, channelUploader2, z2, configListener, i, i2));
        }
    }
}
