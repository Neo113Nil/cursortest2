package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class ProfileStoreImpl implements androidx.webkit.ProfileStore {
    private static androidx.webkit.ProfileStore getHighResolutionOutputSizeshNQ4ISI;
    private final org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface getHighSpeedVideoSizes;

    private ProfileStoreImpl(org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.getHighSpeedVideoSizes = profileStoreBoundaryInterface;
    }

    private ProfileStoreImpl() {
        this.getHighSpeedVideoSizes = null;
    }

    public static androidx.webkit.ProfileStore getInstance() {
        if (getHighResolutionOutputSizeshNQ4ISI == null) {
            getHighResolutionOutputSizeshNQ4ISI = new androidx.webkit.internal.ProfileStoreImpl(androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getProfileStore());
        }
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.webkit.ProfileStore
    public androidx.webkit.Profile getOrCreateProfile(java.lang.String str) {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return new androidx.webkit.internal.ProfileImpl((org.chromium.support_lib_boundary.ProfileBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ProfileBoundaryInterface.class, this.getHighSpeedVideoSizes.getOrCreateProfile(str)));
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ProfileStore
    public androidx.webkit.Profile getProfile(java.lang.String str) {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            java.lang.reflect.InvocationHandler profile = this.getHighSpeedVideoSizes.getProfile(str);
            if (profile != null) {
                return new androidx.webkit.internal.ProfileImpl((org.chromium.support_lib_boundary.ProfileBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ProfileBoundaryInterface.class, profile));
            }
            return null;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ProfileStore
    public java.util.List<java.lang.String> getAllProfileNames() {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return this.getHighSpeedVideoSizes.getAllProfileNames();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ProfileStore
    public boolean deleteProfile(java.lang.String str) throws java.lang.IllegalStateException {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return this.getHighSpeedVideoSizes.deleteProfile(str);
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
