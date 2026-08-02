package com.datadog.android.sessionreplay.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "shapeStyle", "copy", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "", "hasOpaqueBackground", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;)Z", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;)Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WireframeExtKt {
    public static final boolean hasOpaqueBackground(com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wireframe, "");
        if (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe) {
            return false;
        }
        if (!(wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe)) {
            if (!(wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe)) {
                if ((wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe) || (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe)) {
                    return true;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe) wireframe).getShapeStyle();
            return shapeStyle != null && com.datadog.android.sessionreplay.internal.utils.ShapeStyleExtKt.isFullyOpaque(shapeStyle) && com.datadog.android.sessionreplay.internal.utils.ShapeStyleExtKt.hasNonTranslucentColor(shapeStyle);
        }
        com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle2 = ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) wireframe).getShapeStyle();
        return shapeStyle2 != null && com.datadog.android.sessionreplay.internal.utils.ShapeStyleExtKt.isFullyOpaque(shapeStyle2) && com.datadog.android.sessionreplay.internal.utils.ShapeStyleExtKt.hasNonTranslucentColor(shapeStyle2);
    }

    public static final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle(com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wireframe, "");
        if (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe) {
            return ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe) wireframe).getShapeStyle();
        }
        if (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) {
            return ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) wireframe).getShapeStyle();
        }
        if (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe) {
            return ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe) wireframe).getShapeStyle();
        }
        if (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe) {
            return null;
        }
        if (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe) {
            return ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe) wireframe).getShapeStyle();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe copy(com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle) {
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe copy;
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe copy2;
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe copy3;
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe copy4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wireframe, "");
        if (!(wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe)) {
            if (!(wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe)) {
                if (!(wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe)) {
                    if (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe) {
                        return wireframe;
                    }
                    if (!(wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    copy = r2.copy((r32 & 1) != 0 ? r2.id : 0L, (r32 & 2) != 0 ? r2.x : 0L, (r32 & 4) != 0 ? r2.y : 0L, (r32 & 8) != 0 ? r2.width : 0L, (r32 & 16) != 0 ? r2.height : 0L, (r32 & 32) != 0 ? r2.clip : null, (r32 & 64) != 0 ? r2.shapeStyle : shapeStyle, (r32 & 128) != 0 ? r2.border : null, (r32 & 256) != 0 ? r2.slotId : null, (r32 & 512) != 0 ? ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe) wireframe).isVisible : null);
                    return copy;
                }
                copy2 = r2.copy((r34 & 1) != 0 ? r2.id : 0L, (r34 & 2) != 0 ? r2.x : 0L, (r34 & 4) != 0 ? r2.y : 0L, (r34 & 8) != 0 ? r2.width : 0L, (r34 & 16) != 0 ? r2.height : 0L, (r34 & 32) != 0 ? r2.clip : null, (r34 & 64) != 0 ? r2.shapeStyle : shapeStyle, (r34 & 128) != 0 ? r2.border : null, (r34 & 256) != 0 ? r2.base64 : null, (r34 & 512) != 0 ? r2.resourceId : null, (r34 & 1024) != 0 ? r2.mimeType : null, (r34 & 2048) != 0 ? ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe) wireframe).isEmpty : null);
                return copy2;
            }
            copy3 = r2.copy((r28 & 1) != 0 ? r2.id : 0L, (r28 & 2) != 0 ? r2.x : 0L, (r28 & 4) != 0 ? r2.y : 0L, (r28 & 8) != 0 ? r2.width : 0L, (r28 & 16) != 0 ? r2.height : 0L, (r28 & 32) != 0 ? r2.clip : null, (r28 & 64) != 0 ? r2.shapeStyle : shapeStyle, (r28 & 128) != 0 ? ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) wireframe).border : null);
            return copy3;
        }
        copy4 = r2.copy((r33 & 1) != 0 ? r2.id : 0L, (r33 & 2) != 0 ? r2.x : 0L, (r33 & 4) != 0 ? r2.y : 0L, (r33 & 8) != 0 ? r2.width : 0L, (r33 & 16) != 0 ? r2.height : 0L, (r33 & 32) != 0 ? r2.clip : null, (r33 & 64) != 0 ? r2.shapeStyle : shapeStyle, (r33 & 128) != 0 ? r2.border : null, (r33 & 256) != 0 ? r2.text : null, (r33 & 512) != 0 ? r2.textStyle : null, (r33 & 1024) != 0 ? ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe) wireframe).textPosition : null);
        return copy4;
    }
}
