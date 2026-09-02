package com.goldenboot.saga.zone;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class BundleDeserializer {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements IconExporter {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        public ActivityMutator() {
            super(2);
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke(ItemStore itemStore, HeaderVersion headerVersion) {
            return headerVersion.removeCount();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends Lambda implements TouchRecord {
        public final /* synthetic */ Context reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BounceHandler(Context context) {
            super(1);
            this.reduceScope = context;
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final HeaderVersion invoke(Bundle bundle) {
            HeaderVersion injectMetric = BundleDeserializer.injectMetric(this.reduceScope);
            injectMetric.handleFooter(bundle);
            return injectMetric;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class FeedbackFlow extends Lambda implements ElevationNode {
        public final /* synthetic */ Context reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeedbackFlow(Context context) {
            super(0);
            this.reduceScope = context;
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final HeaderVersion invoke() {
            return BundleDeserializer.injectMetric(this.reduceScope);
        }
    }

    public static final HeaderVersion detachStream(DpadNotifier[] dpadNotifierArr, NotificationFence notificationFence, int i) {
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(-312215566, i, -1, "androidx.navigation.compose.rememberNavController (NavHostController.kt:57)");
        }
        Context context = (Context) notificationFence.expandArgs(AndroidCompositionLocals_androidKt.flushSample());
        Object[] copyOf = Arrays.copyOf(dpadNotifierArr, dpadNotifierArr.length);
        PaletteMap evictLayout = evictLayout(context);
        boolean drawField = notificationFence.drawField(context);
        Object clipOrigin = notificationFence.clipOrigin();
        if (drawField || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
            clipOrigin = new FeedbackFlow(context);
            notificationFence.bindBody(clipOrigin);
        }
        HeaderVersion headerVersion = (HeaderVersion) BaseHook.clipOrigin(copyOf, evictLayout, null, (ElevationNode) clipOrigin, notificationFence, 0, 4);
        for (DpadNotifier dpadNotifier : dpadNotifierArr) {
            headerVersion.filterPayload().growPayload(dpadNotifier);
        }
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return headerVersion;
    }

    public static final PaletteMap evictLayout(Context context) {
        return MarginEncoder.releaseHeader(ActivityMutator.reduceScope, new BounceHandler(context));
    }

    public static final HeaderVersion injectMetric(Context context) {
        HeaderVersion headerVersion = new HeaderVersion(context);
        headerVersion.filterPayload().growPayload(new AlphaUpgrade(headerVersion.filterPayload()));
        headerVersion.filterPayload().growPayload(new StreamListener());
        headerVersion.filterPayload().growPayload(new SetupGenerator());
        return headerVersion;
    }
}
