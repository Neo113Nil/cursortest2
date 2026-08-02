package io.sentry.android.core;

import io.sentry.ISpan;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$new$0;
        lambda$new$0 = SpanFrameMetricsCollector.lambda$new$0((ISpan) obj, (ISpan) obj2);
        return lambda$new$0;
    }
}
