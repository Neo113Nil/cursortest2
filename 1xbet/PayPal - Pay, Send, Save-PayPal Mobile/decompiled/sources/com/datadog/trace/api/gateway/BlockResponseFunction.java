package com.datadog.trace.api.gateway;

/* loaded from: classes8.dex */
public interface BlockResponseFunction {
    boolean tryCommitBlockingResponse(com.datadog.trace.api.internal.TraceSegment traceSegment, int i, com.datadog.trace.appsec.api.blocking.BlockingContentType blockingContentType, java.util.Map<java.lang.String, java.lang.String> map);
}
