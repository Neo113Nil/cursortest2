package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/trace/internal/DatadogSpanWriterWrapper;", "Lcom/datadog/android/trace/api/span/DatadogSpanWriter;", "Lcom/datadog/trace/common/writer/Writer;", "delegate", "<init>", "(Lcom/datadog/trace/common/writer/Writer;)V", "Lcom/datadog/trace/common/writer/Writer;", "getDelegate$dd_sdk_android_trace_release", "()Lcom/datadog/trace/common/writer/Writer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatadogSpanWriterWrapper implements com.datadog.android.trace.api.span.DatadogSpanWriter {
    private final com.datadog.trace.common.writer.Writer delegate;

    public DatadogSpanWriterWrapper(com.datadog.trace.common.writer.Writer writer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        this.delegate = writer;
    }

    /* renamed from: getDelegate$dd_sdk_android_trace_release, reason: from getter */
    public final com.datadog.trace.common.writer.Writer getDelegate() {
        return this.delegate;
    }
}
