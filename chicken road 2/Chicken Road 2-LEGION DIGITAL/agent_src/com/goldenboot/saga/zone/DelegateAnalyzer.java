package com.goldenboot.saga.zone;

import android.graphics.Path;
import com.goldenboot.saga.zone.ServiceFetcher;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/goldenboot/saga/zone/ServiceFetcher;", "evictLayout", "()Lcom/goldenboot/saga/zone/ServiceFetcher;", "Landroid/graphics/Path;", "detachStream", "(Landroid/graphics/Path;)Lcom/goldenboot/saga/zone/ServiceFetcher;", "injectMetric", "(Lcom/goldenboot/saga/zone/ServiceFetcher;)Landroid/graphics/Path;", "", "message", "Lcom/goldenboot/saga/zone/DpadBuilder;", "releaseHeader", "(Ljava/lang/String;)V", "Lcom/goldenboot/saga/zone/ServiceFetcher$FeedbackFlow;", "Landroid/graphics/Path$Direction;", "clipOrigin", "(Lcom/goldenboot/saga/zone/ServiceFetcher$FeedbackFlow;)Landroid/graphics/Path$Direction;", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DelegateAnalyzer {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class ActivityMutator {
        public static final /* synthetic */ int[] evictLayout;

        static {
            int[] iArr = new int[ServiceFetcher.FeedbackFlow.values().length];
            try {
                iArr[ServiceFetcher.FeedbackFlow.reduceScope.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ServiceFetcher.FeedbackFlow.notifyMessage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            evictLayout = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path.Direction clipOrigin(ServiceFetcher.FeedbackFlow feedbackFlow) {
        int i = ActivityMutator.evictLayout[feedbackFlow.ordinal()];
        if (i == 1) {
            return Path.Direction.CCW;
        }
        if (i == 2) {
            return Path.Direction.CW;
        }
        throw new EndpointArchive();
    }

    public static final ServiceFetcher detachStream(Path path) {
        return new DimenHandler(path);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ServiceFetcher evictLayout() {
        return new DimenHandler(null, 1, 0 == true ? 1 : 0);
    }

    public static final Path injectMetric(ServiceFetcher serviceFetcher) {
        if (serviceFetcher instanceof DimenHandler) {
            return ((DimenHandler) serviceFetcher).getInternalPath();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public static final void releaseHeader(String str) {
        throw new IllegalStateException(str);
    }
}
