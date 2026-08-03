package com.inmobi.media;

/* renamed from: com.inmobi.media.uc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2802uc {
    public static com.inmobi.media.C2828vc a(com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.MediationConfig mediationConfig, java.lang.String placementType, java.lang.String adTypes, java.lang.String str) {
        com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdNonABConfig banner;
        com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdPreloadConfig banner2;
        com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdABConfig banner3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationConfig, "mediationConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementType, "placementType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTypes, "adTypes");
        if (placementType.equals("AB")) {
            com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.ABConfig ab = mediationConfig.getAb();
            int hashCode = adTypes.hashCode();
            if (hashCode == -1396342996) {
                if (adTypes.equals("banner")) {
                    banner3 = ab.getBanner();
                }
                banner3 = ab.getBanner();
            } else if (hashCode == -1052618729) {
                if (adTypes.equals("native")) {
                    banner3 = ab.getNative();
                }
                banner3 = ab.getBanner();
            } else if (hashCode != 104431) {
                if (hashCode == 93166550 && adTypes.equals("audio")) {
                    banner3 = ab.getAudio();
                }
                banner3 = ab.getBanner();
            } else {
                if (adTypes.equals("int")) {
                    banner3 = ab.getInt();
                }
                banner3 = ab.getBanner();
            }
            return new com.inmobi.media.C2828vc(a(str, banner3.getLoadRetryInterval()), a(str, banner3.getMaxLoadRetries()), a(str, banner3.getLoadTimeout()), (java.lang.Integer) null, 24);
        }
        if (placementType.equals("Preload")) {
            com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.PreloadConfig preload = mediationConfig.getPreload();
            int hashCode2 = adTypes.hashCode();
            if (hashCode2 == -1396342996) {
                if (adTypes.equals("banner")) {
                    banner2 = preload.getBanner();
                }
                banner2 = preload.getBanner();
            } else if (hashCode2 == -1052618729) {
                if (adTypes.equals("native")) {
                    banner2 = preload.getNative();
                }
                banner2 = preload.getBanner();
            } else if (hashCode2 != 104431) {
                if (hashCode2 == 93166550 && adTypes.equals("audio")) {
                    banner2 = preload.getAudio();
                }
                banner2 = preload.getBanner();
            } else {
                if (adTypes.equals("int")) {
                    banner2 = preload.getInt();
                }
                banner2 = preload.getBanner();
            }
            return new com.inmobi.media.C2828vc(a(str, banner2.getLoadRetryInterval()), a(str, banner2.getMaxLoadRetries()), a(str, banner2.getLoadTimeout()), java.lang.Integer.valueOf(a(str, banner2.getMuttTimeout())), java.lang.Integer.valueOf(a(str, banner2.getPreloadTimeout())));
        }
        com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.NonABConfig nonAb = mediationConfig.getNonAb();
        int hashCode3 = adTypes.hashCode();
        if (hashCode3 == -1396342996) {
            if (adTypes.equals("banner")) {
                banner = nonAb.getBanner();
            }
            banner = nonAb.getBanner();
        } else if (hashCode3 == -1052618729) {
            if (adTypes.equals("native")) {
                banner = nonAb.getNative();
            }
            banner = nonAb.getBanner();
        } else if (hashCode3 != 104431) {
            if (hashCode3 == 93166550 && adTypes.equals("audio")) {
                banner = nonAb.getAudio();
            }
            banner = nonAb.getBanner();
        } else {
            if (adTypes.equals("int")) {
                banner = nonAb.getInt();
            }
            banner = nonAb.getBanner();
        }
        return new com.inmobi.media.C2828vc(a(str, banner.getLoadRetryInterval()), a(str, banner.getMaxLoadRetries()), a(str, banner.getLoadTimeout()), java.lang.Integer.valueOf(a(str, banner.getMuttTimeout())), 16);
    }

    public static int a(java.lang.String str, org.json.JSONObject jSONObject) {
        if (str != null && jSONObject.has(str)) {
            return jSONObject.getInt(str);
        }
        return jSONObject.optInt(com.unity3d.ads.BuildConfig.FLAVOR, 0);
    }
}
