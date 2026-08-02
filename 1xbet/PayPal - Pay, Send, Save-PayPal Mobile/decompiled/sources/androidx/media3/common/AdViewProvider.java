package androidx.media3.common;

/* loaded from: classes7.dex */
public interface AdViewProvider {
    android.view.ViewGroup getAdViewGroup();

    default java.util.List<androidx.media3.common.AdOverlayInfo> getAdOverlayInfos() {
        return com.google.common.collect.ImmutableList.of();
    }
}
