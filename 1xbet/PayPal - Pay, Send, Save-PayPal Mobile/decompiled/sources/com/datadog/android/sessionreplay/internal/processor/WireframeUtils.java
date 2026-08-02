package com.datadog.android.sessionreplay.internal.processor;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/processor/WireframeUtils;", "", "Lcom/datadog/android/sessionreplay/internal/processor/BoundsUtils;", "boundsUtils", "<init>", "(Lcom/datadog/android/sessionreplay/internal/processor/BoundsUtils;)V", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "wireframe", "", "topWireframes", "", "checkWireframeIsCovered$dd_sdk_android_session_replay_release", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;Ljava/util/List;)Z", "checkWireframeIsValid$dd_sdk_android_session_replay_release", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;)Z", "parents", "Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "resolveWireframeClip$dd_sdk_android_session_replay_release", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;Ljava/util/List;)Lcom/datadog/android/sessionreplay/model/MobileSegment$WireframeClip;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/internal/processor/BoundsUtils;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WireframeUtils {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.processor.BoundsUtils getHighSpeedVideoSizes;

    public WireframeUtils(com.datadog.android.sessionreplay.internal.processor.BoundsUtils boundsUtils) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boundsUtils, "");
        this.getHighSpeedVideoSizes = boundsUtils;
    }

    public /* synthetic */ WireframeUtils(com.datadog.android.sessionreplay.internal.processor.BoundsUtils boundsUtils, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.datadog.android.sessionreplay.internal.processor.BoundsUtils.INSTANCE : boundsUtils);
    }

    public final boolean checkWireframeIsCovered$dd_sdk_android_session_replay_release(com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe, java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> topWireframes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wireframe, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topWireframes, "");
        com.datadog.android.sessionreplay.internal.processor.WireframeBounds resolveBounds$dd_sdk_android_session_replay_release = this.getHighSpeedVideoSizes.resolveBounds$dd_sdk_android_session_replay_release(wireframe);
        for (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe2 : topWireframes) {
            if (this.getHighSpeedVideoSizes.isCovering$dd_sdk_android_session_replay_release(this.getHighSpeedVideoSizes.resolveBounds$dd_sdk_android_session_replay_release(wireframe2), resolveBounds$dd_sdk_android_session_replay_release) && com.datadog.android.sessionreplay.internal.utils.WireframeExtKt.hasOpaqueBackground(wireframe2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean checkWireframeIsValid$dd_sdk_android_session_replay_release(com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wireframe, "");
        com.datadog.android.sessionreplay.internal.processor.WireframeBounds resolveBounds$dd_sdk_android_session_replay_release = this.getHighSpeedVideoSizes.resolveBounds$dd_sdk_android_session_replay_release(wireframe);
        if (resolveBounds$dd_sdk_android_session_replay_release.getWidth() <= 0 || resolveBounds$dd_sdk_android_session_replay_release.getHeight() <= 0) {
            return false;
        }
        if (!(wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe)) {
            return true;
        }
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe shapeWireframe = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) wireframe;
        return (shapeWireframe.getShapeStyle() == null && shapeWireframe.getBorder() == null) ? false : true;
    }

    public final com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip resolveWireframeClip$dd_sdk_android_session_replay_release(com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe, java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> parents) {
        com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip;
        java.lang.Long bottom;
        java.lang.Long right;
        java.lang.Long left;
        java.lang.Long top;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wireframe, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parents, "");
        if (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) {
            clip = ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) wireframe).getClip();
        } else if (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe) {
            clip = ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe) wireframe).getClip();
        } else if (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe) {
            clip = ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe) wireframe).getClip();
        } else if (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe) {
            clip = ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe) wireframe).getClip();
        } else {
            if (!(wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            clip = ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe) wireframe).getClip();
        }
        long longValue = (clip == null || (top = clip.getTop()) == null) ? 0L : top.longValue();
        long longValue2 = (clip == null || (left = clip.getLeft()) == null) ? 0L : left.longValue();
        long longValue3 = (clip == null || (right = clip.getRight()) == null) ? 0L : right.longValue();
        long longValue4 = (clip == null || (bottom = clip.getBottom()) == null) ? 0L : bottom.longValue();
        com.datadog.android.sessionreplay.internal.processor.WireframeBounds resolveBounds$dd_sdk_android_session_replay_release = this.getHighSpeedVideoSizes.resolveBounds$dd_sdk_android_session_replay_release(wireframe);
        java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> list = parents;
        java.util.ArrayList<com.datadog.android.sessionreplay.internal.processor.WireframeBounds> arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.getHighSpeedVideoSizes.resolveBounds$dd_sdk_android_session_replay_release((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe) it.next()));
        }
        for (com.datadog.android.sessionreplay.internal.processor.WireframeBounds wireframeBounds : arrayList) {
            longValue = java.lang.Math.max(wireframeBounds.getTop() - resolveBounds$dd_sdk_android_session_replay_release.getTop(), longValue);
            longValue4 = java.lang.Math.max(resolveBounds$dd_sdk_android_session_replay_release.getBottom() - wireframeBounds.getBottom(), longValue4);
            longValue2 = java.lang.Math.max(wireframeBounds.getLeft() - resolveBounds$dd_sdk_android_session_replay_release.getLeft(), longValue2);
            longValue3 = java.lang.Math.max(resolveBounds$dd_sdk_android_session_replay_release.getRight() - wireframeBounds.getRight(), longValue3);
        }
        if (longValue > 0 || longValue4 > 0 || longValue2 > 0 || longValue3 > 0) {
            return new com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip(java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(longValue4), java.lang.Long.valueOf(longValue2), java.lang.Long.valueOf(longValue3));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WireframeUtils() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
