package com.inmobi.media;

import com.inmobi.ads.core.BannerDetachConfig;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.ads.BuildConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.x2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4203x2 {
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        if (r5 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4176w2 a(String str) {
        Object obj;
        Object obj2;
        Boolean enabled;
        boolean z;
        Boolean observe;
        long j;
        Long l;
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        List<BannerDetachConfig> bannerDetachConfig$media_release = ((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getViewability().getBannerDetachConfig$media_release();
        Iterator<T> it = bannerDetachConfig$media_release.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((BannerDetachConfig) obj).getType(), str == null ? "direct" : str)) {
                break;
            }
        }
        BannerDetachConfig bannerDetachConfig = (BannerDetachConfig) obj;
        Iterator<T> it2 = bannerDetachConfig$media_release.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (Intrinsics.areEqual(((BannerDetachConfig) obj2).getType(), BuildConfig.FLAVOR)) {
                break;
            }
        }
        BannerDetachConfig bannerDetachConfig2 = (BannerDetachConfig) obj2;
        boolean z2 = false;
        if (bannerDetachConfig == null || (enabled = bannerDetachConfig.getEnabled()) == null) {
            enabled = bannerDetachConfig2 != null ? bannerDetachConfig2.getEnabled() : null;
            if (enabled == null) {
                z = false;
                if (bannerDetachConfig != null || (observe = bannerDetachConfig.getObserve()) == null) {
                    observe = bannerDetachConfig2 == null ? bannerDetachConfig2.getObserve() : null;
                }
                z2 = observe.booleanValue();
                if (bannerDetachConfig == null || (l = bannerDetachConfig.getDelayMillis()) == null) {
                    Long delayMillis = bannerDetachConfig2 != null ? bannerDetachConfig2.getDelayMillis() : null;
                    if (delayMillis == null) {
                        j = 3000;
                        return new C4176w2(z, z2, j);
                    }
                    l = delayMillis;
                }
                j = l.longValue();
                return new C4176w2(z, z2, j);
            }
        }
        z = enabled.booleanValue();
        if (bannerDetachConfig != null) {
        }
        if (bannerDetachConfig2 == null) {
        }
    }
}
