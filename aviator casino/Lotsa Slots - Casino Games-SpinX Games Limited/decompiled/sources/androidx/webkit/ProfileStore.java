package androidx.webkit;

/* loaded from: classes2.dex */
public interface ProfileStore {
    boolean deleteProfile(java.lang.String str);

    java.util.List<java.lang.String> getAllProfileNames();

    androidx.webkit.Profile getOrCreateProfile(java.lang.String str);

    androidx.webkit.Profile getProfile(java.lang.String str);

    /* renamed from: androidx.webkit.ProfileStore$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static androidx.webkit.ProfileStore getInstance() {
            if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
                return androidx.webkit.internal.ProfileStoreImpl.getInstance();
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }
}
