package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017JE\u0010\"\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010#J3\u0010$\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'J-\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b*\u0010+"}, d2 = {"Lcom/datadog/android/trace/internal/DatadogPropagationHelper;", "", "<init>", "()V", "", "traceId", "spanId", "", "samplingPriority", "Lcom/datadog/android/trace/api/span/DatadogSpanContext;", "createExtractedContext", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/datadog/android/trace/api/span/DatadogSpanContext;", "Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "tracer", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;", "request", "extractParentContext", "(Lcom/datadog/android/trace/api/tracer/DatadogTracer;Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;)Lcom/datadog/android/trace/api/span/DatadogSpanContext;", "", "extractSamplingDecision", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;)Ljava/lang/Boolean;", "context", "isExtractedContext", "(Lcom/datadog/android/trace/api/span/DatadogSpanContext;)Z", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;", "builder", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "span", "", "Lcom/datadog/android/trace/TracingHeaderType;", "tracingHeaderTypes", "Lcom/datadog/android/trace/TraceContextInjection;", "injectionType", "traceOrigin", "propagateNotSampledHeaders", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;Lcom/datadog/android/trace/api/tracer/DatadogTracer;Lcom/datadog/android/trace/api/span/DatadogSpan;Ljava/util/Set;Lcom/datadog/android/trace/TraceContextInjection;Ljava/lang/String;)Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;", "propagateSampledHeaders", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;Lcom/datadog/android/trace/api/tracer/DatadogTracer;Lcom/datadog/android/trace/api/span/DatadogSpan;Ljava/util/Set;)Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;", "removeAllTracingHeaders", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;)Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;", "requestInfoBuilder", "", "setTraceContext", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;Ljava/lang/String;Ljava/lang/String;I)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatadogPropagationHelper {
    private static final java.util.Set<java.lang.String> ALL_TRACING_HEADERS;
    private static final java.util.Set<java.lang.String> B3M_CODEC_HEADERS;
    public static final java.lang.String B3M_DROP_SAMPLING_DECISION = "0";
    public static final java.lang.String B3_DROP_SAMPLING_DECISION = "0";
    public static final int B3_SAMPLING_DECISION_INDEX = 2;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.trace.internal.DatadogPropagationHelper.Companion INSTANCE = new com.datadog.android.trace.internal.DatadogPropagationHelper.Companion(null);
    private static final java.util.Set<java.lang.String> DATADOG_CODEC_HEADERS;
    public static final java.lang.String DATADOG_DROP_SAMPLING_DECISION = "0";
    private static final java.util.Set<java.lang.String> W3C_CODEC_HEADERS;
    public static final int W3C_PARENT_ID_LENGTH = 16;
    public static final int W3C_SAMPLING_DECISION_INDEX = 3;
    public static final int W3C_TRACE_ID_LENGTH = 32;
    public static final java.lang.String W3C_TRACE_PARENT_DROP_SAMPLING_DECISION = "00-%s-%s-00";
    public static final java.lang.String W3C_TRACE_STATE_DROP_SAMPLING_DECISION = "dd=p:%s;s:0";

    public final boolean isExtractedContext(com.datadog.android.trace.api.span.DatadogSpanContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (context instanceof com.datadog.android.trace.internal.DatadogSpanContextAdapter) {
            return ((com.datadog.android.trace.internal.DatadogSpanContextAdapter) context).getDelegate() instanceof com.datadog.trace.core.propagation.ExtractedContext;
        }
        return false;
    }

    public final void setTraceContext(com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder requestInfoBuilder, java.lang.String traceId, java.lang.String spanId, int samplingPriority) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestInfoBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spanId, "");
        requestInfoBuilder.addTag(com.datadog.android.trace.internal.net.TraceContext.class, new com.datadog.android.trace.internal.net.TraceContext(traceId, spanId, samplingPriority));
    }

    public final com.datadog.android.trace.api.span.DatadogSpanContext createExtractedContext(java.lang.String traceId, java.lang.String spanId, int samplingPriority) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spanId, "");
        return new com.datadog.android.trace.internal.DatadogSpanContextAdapter(new com.datadog.trace.core.propagation.ExtractedContext(com.datadog.trace.api.DDTraceId.fromHexOrDefault(traceId, com.datadog.trace.api.DDTraceId.ZERO), com.datadog.trace.api.DDSpanId.fromHexOrDefault(spanId, 0L), samplingPriority, null, null, null));
    }

    public final com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder propagateSampledHeaders(com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder builder, com.datadog.android.trace.api.tracer.DatadogTracer tracer, com.datadog.android.trace.api.span.DatadogSpan span, final java.util.Set<? extends com.datadog.android.trace.TracingHeaderType> tracingHeaderTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(span, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracingHeaderTypes, "");
        tracer.propagate().inject(span.context(), builder, new kotlin.jvm.functions.Function3<com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder, java.lang.String, java.lang.String, kotlin.Unit>() { // from class: com.datadog.android.trace.internal.DatadogPropagationHelper$propagateSampledHeaders$1$1
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder httpRequestInfoBuilder, java.lang.String str, java.lang.String str2) {
                getHighSpeedVideoSizes(httpRequestInfoBuilder, str, str2);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:10:0x00c0, code lost:
            
                r3.removeHeader(r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
            
                if (r4.equals("x-datadog-trace-id") == false) goto L62;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00d5, code lost:
            
                if (r1.contains(com.datadog.android.trace.TracingHeaderType.DATADOG) == false) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00d7, code lost:
            
                r3.replaceHeader(r4, r5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x00db, code lost:
            
                r3.removeHeader(r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
            
                if (r4.equals("x-datadog-tags") == false) goto L62;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
            
                if (r4.equals("traceparent") == false) goto L62;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
            
                if (r1.contains(com.datadog.android.trace.TracingHeaderType.TRACECONTEXT) == false) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
            
                r3.replaceHeader(r4, r5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
            
                r3.removeHeader(r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
            
                if (r4.equals("tracestate") != false) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
            
                if (r4.equals("x-datadog-sampling-priority") == false) goto L62;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
            
                if (r4.equals("x-datadog-parent-id") == false) goto L62;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
            
                if (r4.equals("X-B3-SpanId") == false) goto L62;
             */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
            
                if (r4.equals("X-B3-Sampled") == false) goto L62;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00b0, code lost:
            
                if (r4.equals("X-B3-TraceId") != false) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x00cb, code lost:
            
                if (r4.equals("x-datadog-origin") != false) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x00ba, code lost:
            
                if (r1.contains(com.datadog.android.trace.TracingHeaderType.B3MULTI) == false) goto L52;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x00bc, code lost:
            
                r3.replaceHeader(r4, r5);
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void getHighSpeedVideoSizes(com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder httpRequestInfoBuilder, java.lang.String str, java.lang.String str2) {
                java.lang.String highSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestInfoBuilder, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                switch (str.hashCode()) {
                    case -1682961930:
                        break;
                    case -1140603879:
                        break;
                    case -344354804:
                        break;
                    case -343637184:
                        if (str.equals("baggage")) {
                            com.datadog.android.trace.internal.DatadogTracingToolkit datadogTracingToolkit = com.datadog.android.trace.internal.DatadogTracingToolkit.INSTANCE;
                            com.datadog.android.trace.internal.DatadogPropagationHelper.Companion companion = com.datadog.android.trace.internal.DatadogPropagationHelper.INSTANCE;
                            highSpeedVideoFpsRanges = com.datadog.android.trace.internal.DatadogPropagationHelper.Companion.getHighSpeedVideoFpsRanges(httpRequestInfoBuilder);
                            httpRequestInfoBuilder.replaceHeader(str, datadogTracingToolkit.mergeBaggage(highSpeedVideoFpsRanges, str2));
                            break;
                        }
                        httpRequestInfoBuilder.replaceHeader(str, str2);
                        break;
                    case 3089:
                        if (str.equals("b3")) {
                            if (!tracingHeaderTypes.contains(com.datadog.android.trace.TracingHeaderType.B3)) {
                                httpRequestInfoBuilder.removeHeader(str);
                                break;
                            } else {
                                httpRequestInfoBuilder.replaceHeader(str, str2);
                                break;
                            }
                        }
                        httpRequestInfoBuilder.replaceHeader(str, str2);
                        break;
                    case 304080974:
                        break;
                    case 762897402:
                        break;
                    case 1006622316:
                        break;
                    case 1037578799:
                        break;
                    case 1316815593:
                        break;
                    case 1767467379:
                        break;
                    case 1791641299:
                        break;
                    default:
                        httpRequestInfoBuilder.replaceHeader(str, str2);
                        break;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }
        });
        return builder;
    }

    public final com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder propagateNotSampledHeaders(com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder builder, com.datadog.android.trace.api.tracer.DatadogTracer tracer, com.datadog.android.trace.api.span.DatadogSpan span, java.util.Set<? extends com.datadog.android.trace.TracingHeaderType> tracingHeaderTypes, com.datadog.android.trace.TraceContextInjection injectionType, java.lang.String traceOrigin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(span, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracingHeaderTypes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(injectionType, "");
        java.util.Iterator<? extends com.datadog.android.trace.TracingHeaderType> it = tracingHeaderTypes.iterator();
        while (it.hasNext()) {
            int i = com.datadog.android.trace.internal.DatadogPropagationHelper.WhenMappings.$EnumSwitchMapping$0[it.next().ordinal()];
            if (i == 1) {
                java.util.Iterator<T> it2 = DATADOG_CODEC_HEADERS.iterator();
                while (it2.hasNext()) {
                    builder.removeHeader((java.lang.String) it2.next());
                }
                if (com.datadog.android.trace.TraceContextInjection.ALL == injectionType) {
                    com.datadog.android.trace.internal.DatadogPropagationHelper.Companion.access$resetDatadogHeaders(INSTANCE, builder, span, tracer);
                }
            } else if (i == 2) {
                builder.removeHeader("b3");
                if (com.datadog.android.trace.TraceContextInjection.ALL == injectionType) {
                    com.datadog.android.trace.internal.DatadogPropagationHelper.Companion.access$resetB3Headers(INSTANCE, builder);
                }
            } else if (i == 3) {
                java.util.Iterator<T> it3 = B3M_CODEC_HEADERS.iterator();
                while (it3.hasNext()) {
                    builder.removeHeader((java.lang.String) it3.next());
                }
                if (com.datadog.android.trace.TraceContextInjection.ALL == injectionType) {
                    com.datadog.android.trace.internal.DatadogPropagationHelper.Companion.access$resetB3MultiHeaders(INSTANCE, builder);
                }
            } else if (i == 4) {
                java.util.Iterator<T> it4 = W3C_CODEC_HEADERS.iterator();
                while (it4.hasNext()) {
                    builder.removeHeader((java.lang.String) it4.next());
                }
                if (com.datadog.android.trace.TraceContextInjection.ALL == injectionType) {
                    com.datadog.android.trace.internal.DatadogPropagationHelper.Companion.access$resetW3CHeaders(INSTANCE, builder, span, traceOrigin);
                }
            }
        }
        return builder;
    }

    public final com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder removeAllTracingHeaders(com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        java.util.Iterator<T> it = ALL_TRACING_HEADERS.iterator();
        while (it.hasNext()) {
            builder.removeHeader((java.lang.String) it.next());
        }
        return builder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e1, code lost:
    
        r2 = java.lang.Boolean.TRUE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Boolean extractSamplingDecision(com.datadog.android.api.instrumentation.network.HttpRequestInfo request) {
        java.lang.Boolean bool;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        com.datadog.android.trace.api.span.DatadogSpan datadogSpan = (com.datadog.android.trace.api.span.DatadogSpan) com.datadog.android.api.instrumentation.network.ExtendedRequestInfoKt.tag(request, com.datadog.android.trace.api.span.DatadogSpan.class);
        java.util.List<java.lang.String> list = request.getHeaders().get("x-datadog-sampling-priority");
        java.lang.Integer intOrNull = (list == null || (str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list)) == null) ? null : kotlin.text.StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            if (intOrNull.intValue() != Integer.MIN_VALUE) {
                bool = java.lang.Boolean.valueOf(intOrNull.intValue() == 2 || intOrNull.intValue() == 1);
            }
        } else {
            java.util.List<java.lang.String> list2 = request.getHeaders().get("X-B3-Sampled");
            java.lang.String str2 = list2 != null ? (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list2) : null;
            if (str2 != null) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "1")) {
                    bool = java.lang.Boolean.TRUE;
                } else {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "0")) {
                        bool = java.lang.Boolean.FALSE;
                    }
                }
            } else {
                java.util.List<java.lang.String> list3 = request.getHeaders().get("b3");
                java.lang.String str3 = list3 != null ? (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list3) : null;
                if (str3 != null) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(str3, "0")) {
                        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str3, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                        if (split$default.size() >= 3) {
                            java.lang.String str4 = (java.lang.String) split$default.get(2);
                            int hashCode = str4.hashCode();
                            if (hashCode != 48) {
                                bool = hashCode != 49 ? null : null;
                            } else {
                                if (str4.equals("0")) {
                                    bool = java.lang.Boolean.FALSE;
                                }
                            }
                        }
                    } else {
                        bool = java.lang.Boolean.FALSE;
                    }
                }
                java.util.List<java.lang.String> list4 = request.getHeaders().get("traceparent");
                java.lang.String str5 = list4 != null ? (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list4) : null;
                if (str5 != null) {
                    java.util.List split$default2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str5, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                    if (split$default2.size() >= 4) {
                        java.lang.Integer intOrNull2 = kotlin.text.StringsKt.toIntOrNull((java.lang.String) split$default2.get(3));
                        if (intOrNull2 != null && intOrNull2.intValue() == 1) {
                            bool = java.lang.Boolean.TRUE;
                        } else if (intOrNull2 != null && intOrNull2.intValue() == 0) {
                            bool = java.lang.Boolean.FALSE;
                        }
                    }
                }
            }
        }
        com.datadog.android.trace.internal.net.TraceContext traceContext = (com.datadog.android.trace.internal.net.TraceContext) com.datadog.android.api.instrumentation.network.ExtendedRequestInfoKt.tag(request, com.datadog.android.trace.internal.net.TraceContext.class);
        java.lang.Integer valueOf = traceContext != null ? java.lang.Integer.valueOf(traceContext.getSamplingPriority()) : null;
        if (bool != null) {
            return bool;
        }
        if (datadogSpan != null) {
            com.datadog.android.trace.internal.DatadogTracingToolkit.INSTANCE.setTracingSamplingPriorityIfNecessary(datadogSpan.context());
            return java.lang.Boolean.valueOf(datadogSpan.context().getSamplingPriority() > 0);
        }
        if ((valueOf == null || valueOf.intValue() != Integer.MIN_VALUE) && valueOf != null) {
            return java.lang.Boolean.valueOf(valueOf.intValue() > 0);
        }
        return null;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00058\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00058\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\u00128\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00128\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00128\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00058\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010R\u0014\u0010\u001e\u001a\u00020\u00058\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010"}, d2 = {"Lcom/datadog/android/trace/internal/DatadogPropagationHelper$Companion;", "", "<init>", "()V", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;", "", "getHighSpeedVideoFpsRanges", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;)Ljava/lang/String;", "", "ALL_TRACING_HEADERS", "Ljava/util/Set;", "getALL_TRACING_HEADERS$dd_sdk_android_trace_release", "()Ljava/util/Set;", "B3M_CODEC_HEADERS", "getB3M_CODEC_HEADERS$dd_sdk_android_trace_release", "B3M_DROP_SAMPLING_DECISION", "Ljava/lang/String;", "B3_DROP_SAMPLING_DECISION", "", "B3_SAMPLING_DECISION_INDEX", com.visa.cbp.getEncExpo.warmup, "DATADOG_CODEC_HEADERS", "getDATADOG_CODEC_HEADERS$dd_sdk_android_trace_release", "DATADOG_DROP_SAMPLING_DECISION", "W3C_CODEC_HEADERS", "getW3C_CODEC_HEADERS$dd_sdk_android_trace_release", "W3C_PARENT_ID_LENGTH", "W3C_SAMPLING_DECISION_INDEX", "W3C_TRACE_ID_LENGTH", "W3C_TRACE_PARENT_DROP_SAMPLING_DECISION", "W3C_TRACE_STATE_DROP_SAMPLING_DECISION"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.Set<java.lang.String> getDATADOG_CODEC_HEADERS$dd_sdk_android_trace_release() {
            return com.datadog.android.trace.internal.DatadogPropagationHelper.DATADOG_CODEC_HEADERS;
        }

        public final java.util.Set<java.lang.String> getB3M_CODEC_HEADERS$dd_sdk_android_trace_release() {
            return com.datadog.android.trace.internal.DatadogPropagationHelper.B3M_CODEC_HEADERS;
        }

        public final java.util.Set<java.lang.String> getW3C_CODEC_HEADERS$dd_sdk_android_trace_release() {
            return com.datadog.android.trace.internal.DatadogPropagationHelper.W3C_CODEC_HEADERS;
        }

        public final java.util.Set<java.lang.String> getALL_TRACING_HEADERS$dd_sdk_android_trace_release() {
            return com.datadog.android.trace.internal.DatadogPropagationHelper.ALL_TRACING_HEADERS;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static java.lang.String getHighSpeedVideoFpsRanges(com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder httpRequestInfoBuilder) {
            try {
                java.util.List<java.lang.String> list = httpRequestInfoBuilder.build().getHeaders().get("baggage");
                if (list == null) {
                    list = kotlin.collections.CollectionsKt.emptyList();
                }
                java.util.Iterator<T> it = list.iterator();
                if (!it.hasNext()) {
                    throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
                }
                java.lang.Object next = it.next();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    next = com.datadog.android.trace.internal.DatadogTracingToolkit.INSTANCE.mergeBaggage((java.lang.String) next, str);
                }
                return (java.lang.String) next;
            } catch (java.lang.IllegalStateException | java.lang.UnsupportedOperationException unused) {
                return null;
            }
        }

        public static final /* synthetic */ void access$resetB3Headers(com.datadog.android.trace.internal.DatadogPropagationHelper.Companion companion, com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder httpRequestInfoBuilder) {
            httpRequestInfoBuilder.addHeader("b3", "0");
        }

        public static final /* synthetic */ void access$resetB3MultiHeaders(com.datadog.android.trace.internal.DatadogPropagationHelper.Companion companion, com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder httpRequestInfoBuilder) {
            httpRequestInfoBuilder.addHeader("X-B3-Sampled", "0");
        }

        public static final /* synthetic */ void access$resetDatadogHeaders(com.datadog.android.trace.internal.DatadogPropagationHelper.Companion companion, com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder httpRequestInfoBuilder, com.datadog.android.trace.api.span.DatadogSpan datadogSpan, com.datadog.android.trace.api.tracer.DatadogTracer datadogTracer) {
            datadogTracer.propagate().inject(datadogSpan.context(), httpRequestInfoBuilder, new kotlin.jvm.functions.Function3<com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder, java.lang.String, java.lang.String, kotlin.Unit>() { // from class: com.datadog.android.trace.internal.DatadogPropagationHelper$Companion$resetDatadogHeaders$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder httpRequestInfoBuilder2, java.lang.String str, java.lang.String str2) {
                    getHighSpeedVideoFpsRangesFor(httpRequestInfoBuilder2, str, str2);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRangesFor(com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder httpRequestInfoBuilder2, java.lang.String str, java.lang.String str2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestInfoBuilder2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                    httpRequestInfoBuilder2.removeHeader(str);
                    if (com.datadog.android.trace.internal.DatadogPropagationHelper.INSTANCE.getDATADOG_CODEC_HEADERS$dd_sdk_android_trace_release().contains(str)) {
                        httpRequestInfoBuilder2.addHeader(str, str2);
                    }
                }
            });
            httpRequestInfoBuilder.replaceHeader("x-datadog-sampling-priority", "0");
        }

        public static final /* synthetic */ void access$resetW3CHeaders(com.datadog.android.trace.internal.DatadogPropagationHelper.Companion companion, com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder httpRequestInfoBuilder, com.datadog.android.trace.api.span.DatadogSpan datadogSpan, java.lang.String str) {
            java.lang.String hexString = datadogSpan.context().getTraceId().toHexString();
            java.lang.String valueOf = java.lang.String.valueOf(datadogSpan.context().getSpanId());
            java.lang.String format = java.lang.String.format("00-%s-%s-00", java.util.Arrays.copyOf(new java.lang.Object[]{kotlin.text.StringsKt.padStart(hexString, 32, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), kotlin.text.StringsKt.padStart(valueOf, 16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)}, 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            httpRequestInfoBuilder.addHeader("traceparent", format);
            java.lang.String format2 = java.lang.String.format("dd=p:%s;s:0", java.util.Arrays.copyOf(new java.lang.Object[]{kotlin.text.StringsKt.padStart(valueOf, 16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
            if (str != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(format2);
                sb.append(";o:");
                sb.append(str);
                format2 = sb.toString();
            }
            httpRequestInfoBuilder.addHeader("tracestate", format2);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.util.Set<java.lang.String> of = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"x-datadog-origin", "x-datadog-parent-id", "x-datadog-trace-id", "x-datadog-tags", "x-datadog-sampling-priority"});
        DATADOG_CODEC_HEADERS = of;
        java.util.Set<java.lang.String> of2 = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"X-B3-TraceId", "X-B3-SpanId", "X-B3-Sampled"});
        B3M_CODEC_HEADERS = of2;
        java.util.Set<java.lang.String> of3 = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"traceparent", "tracestate"});
        W3C_CODEC_HEADERS = of3;
        ALL_TRACING_HEADERS = kotlin.collections.SetsKt.plus((java.util.Set<? extends java.lang.String>) kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus((java.util.Set) of, (java.lang.Iterable) of2), (java.lang.Iterable) of3), "b3");
    }

    public final com.datadog.android.trace.api.span.DatadogSpanContext extractParentContext(com.datadog.android.trace.api.tracer.DatadogTracer tracer, com.datadog.android.api.instrumentation.network.HttpRequestInfo request) {
        com.datadog.android.trace.api.span.DatadogSpanContext createExtractedContext;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        com.datadog.android.trace.api.span.DatadogSpan datadogSpan = (com.datadog.android.trace.api.span.DatadogSpan) com.datadog.android.api.instrumentation.network.ExtendedRequestInfoKt.tag(request, com.datadog.android.trace.api.span.DatadogSpan.class);
        if (datadogSpan == null || (createExtractedContext = datadogSpan.context()) == null) {
            com.datadog.android.trace.internal.net.TraceContext traceContext = (com.datadog.android.trace.internal.net.TraceContext) com.datadog.android.api.instrumentation.network.ExtendedRequestInfoKt.tag(request, com.datadog.android.trace.internal.net.TraceContext.class);
            createExtractedContext = traceContext != null ? createExtractedContext(traceContext.getTraceId(), traceContext.getSpanId(), traceContext.getSamplingPriority()) : null;
        }
        com.datadog.android.trace.api.span.DatadogSpanContext extract = tracer.propagate().extract(request, new kotlin.jvm.functions.Function2<com.datadog.android.api.instrumentation.network.HttpRequestInfo, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, ? extends java.lang.Boolean>, kotlin.Unit>() { // from class: com.datadog.android.trace.internal.DatadogPropagationHelper$extractParentContext$headerContext$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.instrumentation.network.HttpRequestInfo httpRequestInfo, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, ? extends java.lang.Boolean> function2) {
                getHighSpeedVideoSizes(httpRequestInfo, function2);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(com.datadog.android.api.instrumentation.network.HttpRequestInfo httpRequestInfo, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, java.lang.Boolean> function2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers = httpRequestInfo.getHeaders();
                java.util.ArrayList arrayList = new java.util.ArrayList(headers.size());
                for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : headers.entrySet()) {
                    arrayList.add(kotlin.TuplesKt.to(entry.getKey(), kotlin.collections.CollectionsKt.joinToString$default(entry.getValue(), ";", null, null, 0, null, null, 62, null)));
                }
                for (java.util.Map.Entry entry2 : kotlin.collections.MapsKt.toMap(arrayList).entrySet()) {
                    function2.invoke((java.lang.String) entry2.getKey(), (java.lang.String) entry2.getValue());
                }
            }
        });
        return (extract == null || !isExtractedContext(extract)) ? createExtractedContext : extract;
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.datadog.android.trace.TracingHeaderType.values().length];
            try {
                iArr[com.datadog.android.trace.TracingHeaderType.DATADOG.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.datadog.android.trace.TracingHeaderType.B3.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.datadog.android.trace.TracingHeaderType.B3MULTI.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.datadog.android.trace.TracingHeaderType.TRACECONTEXT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
