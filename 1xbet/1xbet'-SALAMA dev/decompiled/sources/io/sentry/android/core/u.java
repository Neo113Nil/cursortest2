package io.sentry.android.core;

import io.sentry.ISpan;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return SpanFrameMetricsCollector.lambda$new$0((ISpan) obj, (ISpan) obj2);
    }
}
