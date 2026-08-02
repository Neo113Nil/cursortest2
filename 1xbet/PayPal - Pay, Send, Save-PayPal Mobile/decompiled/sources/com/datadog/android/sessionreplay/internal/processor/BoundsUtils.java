package com.datadog.android.sessionreplay.internal.processor;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/processor/BoundsUtils;", "", "<init>", "()V", "Lcom/datadog/android/sessionreplay/internal/processor/WireframeBounds;", com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "", "isCovering$dd_sdk_android_session_replay_release", "(Lcom/datadog/android/sessionreplay/internal/processor/WireframeBounds;Lcom/datadog/android/sessionreplay/internal/processor/WireframeBounds;)Z", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "wireframe", "resolveBounds$dd_sdk_android_session_replay_release", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;)Lcom/datadog/android/sessionreplay/internal/processor/WireframeBounds;", "", "p0", "p1", "p2", "p3", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "p4", "getHighSpeedVideoSizes", "(JJJJLcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;)Lcom/datadog/android/sessionreplay/internal/processor/WireframeBounds;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BoundsUtils {
    public static final com.datadog.android.sessionreplay.internal.processor.BoundsUtils INSTANCE = new com.datadog.android.sessionreplay.internal.processor.BoundsUtils();

    private BoundsUtils() {
    }

    public final com.datadog.android.sessionreplay.internal.processor.WireframeBounds resolveBounds$dd_sdk_android_session_replay_release(com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wireframe, "");
        if (!(wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe)) {
            if (!(wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe)) {
                if (!(wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe)) {
                    if (!(wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe)) {
                        if (!(wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe webviewWireframe = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe) wireframe;
                        return getHighSpeedVideoSizes(webviewWireframe.getX(), webviewWireframe.getY(), webviewWireframe.getWidth(), webviewWireframe.getHeight(), webviewWireframe.getClip());
                    }
                    com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe placeholderWireframe = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe) wireframe;
                    return getHighSpeedVideoSizes(placeholderWireframe.getX(), placeholderWireframe.getY(), placeholderWireframe.getWidth(), placeholderWireframe.getHeight(), placeholderWireframe.getClip());
                }
                com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe imageWireframe = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe) wireframe;
                return getHighSpeedVideoSizes(imageWireframe.getX(), imageWireframe.getY(), imageWireframe.getWidth(), imageWireframe.getHeight(), imageWireframe.getClip());
            }
            com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe textWireframe = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe) wireframe;
            return getHighSpeedVideoSizes(textWireframe.getX(), textWireframe.getY(), textWireframe.getWidth(), textWireframe.getHeight(), textWireframe.getClip());
        }
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe shapeWireframe = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) wireframe;
        return getHighSpeedVideoSizes(shapeWireframe.getX(), shapeWireframe.getY(), shapeWireframe.getWidth(), shapeWireframe.getHeight(), shapeWireframe.getClip());
    }

    public final boolean isCovering$dd_sdk_android_session_replay_release(com.datadog.android.sessionreplay.internal.processor.WireframeBounds top, com.datadog.android.sessionreplay.internal.processor.WireframeBounds bottom) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(top, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottom, "");
        return top.getLeft() <= bottom.getLeft() && top.getRight() >= bottom.getRight() && top.getTop() <= bottom.getTop() && top.getBottom() >= bottom.getBottom();
    }

    private static com.datadog.android.sessionreplay.internal.processor.WireframeBounds getHighSpeedVideoSizes(long p0, long p1, long p2, long p3, com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip p4) {
        java.lang.Long bottom;
        java.lang.Long top;
        java.lang.Long right;
        java.lang.Long left;
        long j = 0;
        long longValue = (p4 == null || (left = p4.getLeft()) == null) ? 0L : left.longValue();
        long longValue2 = (p4 == null || (right = p4.getRight()) == null) ? 0L : right.longValue();
        long longValue3 = (p4 == null || (top = p4.getTop()) == null) ? 0L : top.longValue();
        if (p4 != null && (bottom = p4.getBottom()) != null) {
            j = bottom.longValue();
        }
        return new com.datadog.android.sessionreplay.internal.processor.WireframeBounds(longValue + p0, (p0 + p2) - longValue2, p1 + longValue3, (p1 + p3) - j, p2, p3);
    }
}
