package com.paypal.oslo.feature.home.featureflags;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/featureflags/HomeConfigManager;", "", "", "isHomeFeedMockEnabled", "()Z", "isAdInFeedEnabled", "isHomeHapticFeedbackEnabled", "isLightThemeEnabled", "", "getCollectionsCount", "()I", "isSearchIntelligenceEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface HomeConfigManager {
    int getCollectionsCount();

    boolean isAdInFeedEnabled();

    boolean isHomeFeedMockEnabled();

    boolean isHomeHapticFeedbackEnabled();

    boolean isLightThemeEnabled();

    boolean isSearchIntelligenceEnabled();
}
