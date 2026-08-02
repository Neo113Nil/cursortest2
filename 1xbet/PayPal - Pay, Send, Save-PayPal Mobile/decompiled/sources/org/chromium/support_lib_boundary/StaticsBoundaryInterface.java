package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public interface StaticsBoundaryInterface {
    int getRendererLibraryPrefetchMode();

    android.net.Uri getSafeBrowsingPrivacyPolicyUrl();

    java.lang.String getVariationsHeader();

    void initSafeBrowsing(android.content.Context context, android.webkit.ValueCallback<java.lang.Boolean> valueCallback);

    boolean isMultiProcessEnabled();

    void setDefaultTrafficStatsTag(int i);

    void setDefaultTrafficStatsUid(int i);

    void setRendererLibraryPrefetchMode(int i);

    void setSafeBrowsingAllowlist(java.util.Set<java.lang.String> set, android.webkit.ValueCallback<java.lang.Boolean> valueCallback);

    void setSafeBrowsingWhitelist(java.util.List<java.lang.String> list, android.webkit.ValueCallback<java.lang.Boolean> valueCallback);
}
