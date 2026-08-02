package com.datadog.android.sessionreplay.internal.processor;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u000b\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "clip", "copy", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Source$Companion;", "", "source", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Source;", "tryFromSource", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$Source$Companion;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Source;", "UNKNOWN_MOBILE_SEGMENT_SOURCE_WARNING_MESSAGE_FORMAT", "Ljava/lang/String;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MobileSegmentExtKt {
    public static final java.lang.String UNKNOWN_MOBILE_SEGMENT_SOURCE_WARNING_MESSAGE_FORMAT = "You are using an unknown source %s for MobileSegment.Source enum.";

    public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe copy(com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip wireframeClip) {
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe copy;
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe copy2;
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe copy3;
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe copy4;
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe copy5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wireframe, "");
        if (!(wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe)) {
            if (!(wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe)) {
                if (!(wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe)) {
                    if (!(wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe)) {
                        if (!(wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        copy = r2.copy((r32 & 1) != 0 ? r2.id : 0L, (r32 & 2) != 0 ? r2.x : 0L, (r32 & 4) != 0 ? r2.y : 0L, (r32 & 8) != 0 ? r2.width : 0L, (r32 & 16) != 0 ? r2.height : 0L, (r32 & 32) != 0 ? r2.clip : wireframeClip, (r32 & 64) != 0 ? r2.shapeStyle : null, (r32 & 128) != 0 ? r2.border : null, (r32 & 256) != 0 ? r2.slotId : null, (r32 & 512) != 0 ? ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe) wireframe).isVisible : null);
                        return copy;
                    }
                    copy2 = r2.copy((r26 & 1) != 0 ? r2.id : 0L, (r26 & 2) != 0 ? r2.x : 0L, (r26 & 4) != 0 ? r2.y : 0L, (r26 & 8) != 0 ? r2.width : 0L, (r26 & 16) != 0 ? r2.height : 0L, (r26 & 32) != 0 ? r2.clip : wireframeClip, (r26 & 64) != 0 ? ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe) wireframe).label : null);
                    return copy2;
                }
                copy3 = r2.copy((r34 & 1) != 0 ? r2.id : 0L, (r34 & 2) != 0 ? r2.x : 0L, (r34 & 4) != 0 ? r2.y : 0L, (r34 & 8) != 0 ? r2.width : 0L, (r34 & 16) != 0 ? r2.height : 0L, (r34 & 32) != 0 ? r2.clip : wireframeClip, (r34 & 64) != 0 ? r2.shapeStyle : null, (r34 & 128) != 0 ? r2.border : null, (r34 & 256) != 0 ? r2.base64 : null, (r34 & 512) != 0 ? r2.resourceId : null, (r34 & 1024) != 0 ? r2.mimeType : null, (r34 & 2048) != 0 ? ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe) wireframe).isEmpty : null);
                return copy3;
            }
            copy4 = r2.copy((r33 & 1) != 0 ? r2.id : 0L, (r33 & 2) != 0 ? r2.x : 0L, (r33 & 4) != 0 ? r2.y : 0L, (r33 & 8) != 0 ? r2.width : 0L, (r33 & 16) != 0 ? r2.height : 0L, (r33 & 32) != 0 ? r2.clip : wireframeClip, (r33 & 64) != 0 ? r2.shapeStyle : null, (r33 & 128) != 0 ? r2.border : null, (r33 & 256) != 0 ? r2.text : null, (r33 & 512) != 0 ? r2.textStyle : null, (r33 & 1024) != 0 ? ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe) wireframe).textPosition : null);
            return copy4;
        }
        copy5 = r2.copy((r28 & 1) != 0 ? r2.id : 0L, (r28 & 2) != 0 ? r2.x : 0L, (r28 & 4) != 0 ? r2.y : 0L, (r28 & 8) != 0 ? r2.width : 0L, (r28 & 16) != 0 ? r2.height : 0L, (r28 & 32) != 0 ? r2.clip : wireframeClip, (r28 & 64) != 0 ? r2.shapeStyle : null, (r28 & 128) != 0 ? ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) wireframe).border : null);
        return copy5;
    }

    public static final com.datadog.android.sessionreplay.model.MobileSegment.Source tryFromSource(com.datadog.android.sessionreplay.model.MobileSegment.Source.Companion companion, final java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return companion.fromJson(str);
        } catch (java.util.NoSuchElementException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.processor.MobileSegmentExtKt$tryFromSource$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.sessionreplay.internal.processor.MobileSegmentExtKt.UNKNOWN_MOBILE_SEGMENT_SOURCE_WARNING_MESSAGE_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return com.datadog.android.sessionreplay.model.MobileSegment.Source.ANDROID;
        }
    }
}
