package androidx.test.platform.tracing;

import androidx.annotation.NonNull;
import androidx.test.platform.tracing.Tracer;
import androidx.tracing.Trace;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
class AndroidXTracer implements Tracer {
    private static final int MAX_SECTION_NAME_LEN = 127;
    private static final String TAG = "AndroidXTracer";

    public static class AndroidXTracerSpan implements Tracer.Span {
        private final ArrayDeque<AndroidXTracerSpan> nestedSpans;

        @Override // androidx.test.platform.tracing.Tracer.Span
        @NonNull
        public Tracer.Span beginChildSpan(@NonNull String str) {
            Trace.beginSection(AndroidXTracer.sanitizeSpanName(str));
            AndroidXTracerSpan androidXTracerSpan = new AndroidXTracerSpan();
            this.nestedSpans.add(androidXTracerSpan);
            return androidXTracerSpan;
        }

        @Override // androidx.test.platform.tracing.Tracer.Span, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            while (true) {
                AndroidXTracerSpan pollLast = this.nestedSpans.pollLast();
                if (pollLast == null) {
                    Trace.endSection();
                    return;
                }
                pollLast.close();
            }
        }

        private AndroidXTracerSpan() {
            this.nestedSpans = new ArrayDeque<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static String sanitizeSpanName(@NonNull String str) {
        return str.length() > 127 ? str.substring(0, 127) : str;
    }

    @Override // androidx.test.platform.tracing.Tracer
    @NonNull
    public Tracer.Span beginSpan(@NonNull String str) {
        Trace.beginSection(sanitizeSpanName(str));
        return new AndroidXTracerSpan();
    }
}
