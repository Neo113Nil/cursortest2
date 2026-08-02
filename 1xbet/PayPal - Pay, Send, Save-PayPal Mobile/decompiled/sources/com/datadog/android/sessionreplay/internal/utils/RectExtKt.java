package com.datadog.android.sessionreplay.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/graphics/Rect;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "toWireframeClip", "(Landroid/graphics/Rect;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RectExtKt {
    public static final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip toWireframeClip(android.graphics.Rect rect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
        return new com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip(java.lang.Long.valueOf(rect.top), java.lang.Long.valueOf(rect.bottom), java.lang.Long.valueOf(rect.left), java.lang.Long.valueOf(rect.right));
    }
}
