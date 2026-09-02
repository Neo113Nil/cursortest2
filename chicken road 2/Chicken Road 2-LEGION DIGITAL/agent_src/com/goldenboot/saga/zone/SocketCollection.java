package com.goldenboot.saga.zone;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class SocketCollection extends CoreController {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public static final ActivityMutator evictLayout = new ActivityMutator();
        public static final Integer growPayload;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                growPayload = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            growPayload = num2;
        }
    }

    private final boolean detachStream(int i) {
        Integer num = ActivityMutator.growPayload;
        return num == null || num.intValue() >= i;
    }

    @Override // com.goldenboot.saga.zone.CoreController
    public void evictLayout(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (detachStream(19)) {
            cause.addSuppressed(exception);
        } else {
            super.evictLayout(cause, exception);
        }
    }

    @Override // com.goldenboot.saga.zone.CoreController
    public List injectMetric(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (!detachStream(19)) {
            return super.injectMetric(exception);
        }
        Throwable[] suppressed = exception.getSuppressed();
        Intrinsics.checkNotNullExpressionValue(suppressed, "getSuppressed(...)");
        return InsetsReader.detachStream(suppressed);
    }
}
