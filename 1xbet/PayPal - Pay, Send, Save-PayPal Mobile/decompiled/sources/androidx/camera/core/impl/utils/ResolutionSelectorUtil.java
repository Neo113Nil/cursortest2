package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
public class ResolutionSelectorUtil {
    private ResolutionSelectorUtil() {
    }

    public static androidx.camera.core.resolutionselector.ResolutionSelector overrideResolutionSelectors(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector, androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector2) {
        if (resolutionSelector2 == null) {
            return resolutionSelector;
        }
        if (resolutionSelector == null) {
            return resolutionSelector2;
        }
        androidx.camera.core.resolutionselector.ResolutionSelector.Builder fromResolutionSelector = androidx.camera.core.resolutionselector.ResolutionSelector.Builder.fromResolutionSelector(resolutionSelector);
        if (resolutionSelector2.getAspectRatioStrategy() != null) {
            fromResolutionSelector.setAspectRatioStrategy(resolutionSelector2.getAspectRatioStrategy());
        }
        if (resolutionSelector2.getResolutionStrategy() != null) {
            fromResolutionSelector.setResolutionStrategy(resolutionSelector2.getResolutionStrategy());
        }
        if (resolutionSelector2.getResolutionFilter() != null) {
            fromResolutionSelector.setResolutionFilter(resolutionSelector2.getResolutionFilter());
        }
        if (resolutionSelector2.getAllowedResolutionMode() != 0) {
            fromResolutionSelector.setAllowedResolutionMode(resolutionSelector2.getAllowedResolutionMode());
        }
        return fromResolutionSelector.build();
    }
}
