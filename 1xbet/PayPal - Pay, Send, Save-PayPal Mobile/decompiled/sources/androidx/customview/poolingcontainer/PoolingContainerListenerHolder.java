package androidx.customview.poolingcontainer;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R$\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/customview/poolingcontainer/PoolingContainerListenerHolder;", "", "<init>", "()V", "", "Camera2StreamConfigurationMap", "Ljava/util/ArrayList;", "Landroidx/customview/poolingcontainer/PoolingContainerListener;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/ArrayList;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PoolingContainerListenerHolder {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final java.util.ArrayList<androidx.customview.poolingcontainer.PoolingContainerListener> getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();

    public final void Camera2StreamConfigurationMap() {
        for (int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(this.getHighSpeedVideoFpsRanges); lastIndex >= 0; lastIndex--) {
            this.getHighSpeedVideoFpsRanges.get(lastIndex).onRelease();
        }
    }
}
