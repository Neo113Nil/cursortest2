package com.ironsource;

/* loaded from: classes5.dex */
public class Ld {
    private static com.ironsource.Ld b;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.model.NetworkSettings> f5816a = new java.util.concurrent.ConcurrentHashMap<>();

    private Ld() {
    }

    public static synchronized com.ironsource.Ld c() {
        com.ironsource.Ld ld;
        synchronized (com.ironsource.Ld.class) {
            if (b == null) {
                b = new com.ironsource.Ld();
            }
            ld = b;
        }
        return ld;
    }

    public void a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        if (networkSettings == null || android.text.TextUtils.isEmpty(networkSettings.getProviderName())) {
            return;
        }
        this.f5816a.put(networkSettings.getProviderName(), networkSettings);
    }

    public com.ironsource.mediationsdk.model.NetworkSettings b(java.lang.String str) {
        com.ironsource.mediationsdk.model.NetworkSettings networkSettings = this.f5816a.get(str);
        if (networkSettings != null) {
            return networkSettings;
        }
        com.ironsource.mediationsdk.model.NetworkSettings networkSettings2 = new com.ironsource.mediationsdk.model.NetworkSettings(str);
        a(networkSettings2);
        return networkSettings2;
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.model.NetworkSettings> d() {
        return this.f5816a;
    }

    public void a() {
        this.f5816a.clear();
    }

    public java.util.HashSet<java.lang.String> a(java.lang.String str, java.lang.String str2) {
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
        try {
            for (com.ironsource.mediationsdk.model.NetworkSettings networkSettings : this.f5816a.values()) {
                if (networkSettings.getProviderTypeForReflection().equals(str)) {
                    if (networkSettings.getRewardedVideoSettings() != null && networkSettings.getRewardedVideoSettings().length() > 0 && !android.text.TextUtils.isEmpty(networkSettings.getRewardedVideoSettings().optString(str2))) {
                        hashSet.add(networkSettings.getRewardedVideoSettings().optString(str2));
                    }
                    if (networkSettings.getInterstitialSettings() != null && networkSettings.getInterstitialSettings().length() > 0 && !android.text.TextUtils.isEmpty(networkSettings.getInterstitialSettings().optString(str2))) {
                        hashSet.add(networkSettings.getInterstitialSettings().optString(str2));
                    }
                    if (networkSettings.getBannerSettings() != null && networkSettings.getBannerSettings().length() > 0 && !android.text.TextUtils.isEmpty(networkSettings.getBannerSettings().optString(str2))) {
                        hashSet.add(networkSettings.getBannerSettings().optString(str2));
                    }
                    if (networkSettings.getNativeAdSettings() != null && networkSettings.getNativeAdSettings().length() > 0 && !android.text.TextUtils.isEmpty(networkSettings.getNativeAdSettings().optString(str2))) {
                        hashSet.add(networkSettings.getNativeAdSettings().optString(str2));
                    }
                }
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
        }
        return hashSet;
    }

    public com.ironsource.mediationsdk.model.NetworkSettings c(java.lang.String str) {
        for (com.ironsource.mediationsdk.model.NetworkSettings networkSettings : this.f5816a.values()) {
            if ("IronSource".equals(networkSettings.getProviderTypeForReflection()) && str.equalsIgnoreCase(networkSettings.getSubProviderId())) {
                return networkSettings;
            }
        }
        return new com.ironsource.mediationsdk.model.NetworkSettings(str);
    }

    public void b() {
        for (com.ironsource.mediationsdk.model.NetworkSettings networkSettings : this.f5816a.values()) {
            if (networkSettings.isMultipleInstances() && !android.text.TextUtils.isEmpty(networkSettings.getProviderTypeForReflection())) {
                com.ironsource.mediationsdk.model.NetworkSettings b2 = b(networkSettings.getProviderDefaultInstance());
                networkSettings.setApplicationSettings(com.ironsource.mediationsdk.utils.IronSourceUtils.b(networkSettings.getApplicationSettings(), b2.getApplicationSettings()));
                networkSettings.setInterstitialSettings(com.ironsource.mediationsdk.utils.IronSourceUtils.b(networkSettings.getInterstitialSettings(), b2.getInterstitialSettings()));
                networkSettings.setRewardedVideoSettings(com.ironsource.mediationsdk.utils.IronSourceUtils.b(networkSettings.getRewardedVideoSettings(), b2.getRewardedVideoSettings()));
                networkSettings.setBannerSettings(com.ironsource.mediationsdk.utils.IronSourceUtils.b(networkSettings.getBannerSettings(), b2.getBannerSettings()));
                networkSettings.setNativeAdSettings(com.ironsource.mediationsdk.utils.IronSourceUtils.b(networkSettings.getNativeAdSettings(), b2.getNativeAdSettings()));
            }
        }
    }

    public boolean a(java.lang.String str) {
        return this.f5816a.containsKey(str);
    }
}
