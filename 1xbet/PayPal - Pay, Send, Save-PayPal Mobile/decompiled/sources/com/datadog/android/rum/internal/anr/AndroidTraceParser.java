package com.datadog.android.rum.internal.anr;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/internal/anr/AndroidTraceParser;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "Ljava/io/InputStream;", "traceInputStream", "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "parse$dd_sdk_android_rum_release", "(Ljava/io/InputStream;)Ljava/util/List;", "", "getHighSpeedVideoFpsRanges", "(Ljava/io/InputStream;)Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/InternalLogger;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidTraceParser {
    public static final java.lang.String PARSING_FAILURE_MESSAGE = "Parsing tracing information for the exit reason wasn't successful, no thread dumps were parsed.";
    public static final java.lang.String TRACE_STREAM_READ_FAILURE = "Failed to read crash trace stream.";
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRangesFor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.anr.AndroidTraceParser.Companion INSTANCE = new com.datadog.android.rum.internal.anr.AndroidTraceParser.Companion(null);
    private static final kotlin.text.Regex THREAD_NAME_REGEX = new kotlin.text.Regex("^\"(.+)\".+$");

    public AndroidTraceParser(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoFpsRangesFor = internalLogger;
    }

    public final java.util.List<com.datadog.android.core.feature.event.ThreadDump> parse$dd_sdk_android_rum_release(java.io.InputStream traceInputStream) {
        java.util.List<java.lang.String> groupValues;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceInputStream, "");
        java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(traceInputStream);
        if (kotlin.text.StringsKt.isBlank(highSpeedVideoFpsRanges)) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str = null;
        java.lang.String str2 = null;
        loop0: while (true) {
            boolean z = false;
            for (java.lang.String str3 : kotlin.text.StringsKt.lines(highSpeedVideoFpsRanges)) {
                java.lang.String str4 = str3;
                if (kotlin.text.StringsKt.isBlank(str4) && z) {
                    if (sb.length() > 0 && str != null) {
                        java.util.ArrayList arrayList2 = arrayList;
                        java.lang.String str5 = str2 == null ? "" : str2;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(str5, "TimedWaiting")) {
                            str5 = "Timed_Waiting";
                        }
                        java.util.Locale locale = java.util.Locale.US;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                        java.lang.String lowerCase = str5.toLowerCase(locale);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        java.lang.String obj = sb.toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                        arrayList2.add(new com.datadog.android.core.feature.event.ThreadDump(str, lowerCase, obj, kotlin.jvm.internal.Intrinsics.areEqual(str, "main")));
                    }
                    kotlin.text.StringsKt.clear(sb);
                } else if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str4, (java.lang.CharSequence) " prio=", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str4, (java.lang.CharSequence) " tid=", false, 2, (java.lang.Object) null)) {
                    str2 = (java.lang.String) kotlin.collections.CollectionsKt.lastOrNull(kotlin.text.StringsKt.split$default((java.lang.CharSequence) str4, new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null));
                    kotlin.text.MatchResult matchEntire = THREAD_NAME_REGEX.matchEntire(str4);
                    str = (matchEntire == null || (groupValues = matchEntire.getGroupValues()) == null) ? null : (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(groupValues, 1);
                    z = true;
                } else if (z) {
                    java.lang.String obj2 = kotlin.text.StringsKt.trimStart(str4).toString();
                    if (kotlin.text.StringsKt.startsWith$default(obj2, "at ", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(obj2, "native: ", false, 2, (java.lang.Object) null)) {
                        com.datadog.android.internal.utils.StringBuilderExtKt.appendIfNotEmpty(sb, '\n').append(str3);
                    }
                }
            }
            break loop0;
        }
        if (arrayList.isEmpty()) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.anr.AndroidTraceParser$parse$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.anr.AndroidTraceParser.PARSING_FAILURE_MESSAGE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
        return arrayList;
    }

    private final java.lang.String getHighSpeedVideoFpsRanges(java.io.InputStream inputStream) {
        try {
            java.io.InputStream inputStream2 = inputStream;
            try {
                java.lang.String readText = kotlin.io.TextStreamsKt.readText(new java.io.InputStreamReader(inputStream2, kotlin.text.Charsets.UTF_8));
                kotlin.io.CloseableKt.closeFinally(inputStream2, null);
                return readText;
            } finally {
            }
        } catch (java.io.IOException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.anr.AndroidTraceParser$safeReadText$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.anr.AndroidTraceParser.TRACE_STREAM_READ_FAILURE;
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return "";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/datadog/android/rum/internal/anr/AndroidTraceParser$Companion;", "", "<init>", "()V", "", "PARSING_FAILURE_MESSAGE", "Ljava/lang/String;", "Lkotlin/text/Regex;", "THREAD_NAME_REGEX", "Lkotlin/text/Regex;", "getTHREAD_NAME_REGEX", "()Lkotlin/text/Regex;", "TRACE_STREAM_READ_FAILURE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.text.Regex getTHREAD_NAME_REGEX() {
            return com.datadog.android.rum.internal.anr.AndroidTraceParser.THREAD_NAME_REGEX;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
