package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/goldenboot/saga/zone/FlexDetector;", "Landroidx/compose/ui/RemoteCallback$FeedbackFlow;", "Lcom/goldenboot/saga/zone/PagerReducer;", "coordinates", "Lcom/goldenboot/saga/zone/DpadBuilder;", "emitStrategy", "(Lcom/goldenboot/saga/zone/PagerReducer;)V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FlexDetector extends RemoteCallback.FeedbackFlow {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator {
        @Deprecated
        public static <R> R detachStream(FlexDetector flexDetector, R r, IconExporter iconExporter) {
            return (R) FlexDetector.super.growPayload(r, iconExporter);
        }

        @Deprecated
        public static boolean evictLayout(FlexDetector flexDetector, TouchRecord touchRecord) {
            return FlexDetector.super.releaseHeader(touchRecord);
        }

        @Deprecated
        public static boolean growPayload(FlexDetector flexDetector, TouchRecord touchRecord) {
            return FlexDetector.super.evictLayout(touchRecord);
        }

        @Deprecated
        public static <R> R injectMetric(FlexDetector flexDetector, R r, IconExporter iconExporter) {
            return (R) FlexDetector.super.injectMetric(r, iconExporter);
        }

        @Deprecated
        public static androidx.compose.ui.RemoteCallback releaseHeader(FlexDetector flexDetector, androidx.compose.ui.RemoteCallback remoteCallback) {
            return FlexDetector.super.serializeOffset(remoteCallback);
        }
    }

    void emitStrategy(PagerReducer coordinates);
}
