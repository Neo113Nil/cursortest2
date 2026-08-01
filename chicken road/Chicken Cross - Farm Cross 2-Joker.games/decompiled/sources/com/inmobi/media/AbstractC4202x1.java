package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.x1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4202x1 {
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4148v1 a(String placementType, Map map) {
        C4175w1 c4175w1;
        List split$default;
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Map map2 = map != null ? MapsKt.toMap(map) : null;
        if (map2 == null || map2.isEmpty() || !AbstractC3727g4.a((String) map2.get("ab-type")) || !AbstractC3727g4.a((String) map2.get("ab-ad-slot"))) {
            return new C4148v1(map2, null);
        }
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        TimeoutConfigurations.MediationConfig a0 = ((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getTimeouts().a0();
        if (!(Intrinsics.areEqual(placementType, "AB") ? a0.getAb().getBanner().isAdaptiveBannerEnabled((String) map2.get("tp")) : a0.getNonAb().getBanner().isAdaptiveBannerEnabled((String) map2.get("tp")))) {
            Map mutableMap = MapsKt.toMutableMap(map2);
            mutableMap.remove("ab-type");
            mutableMap.remove("ab-ad-slot");
            return new C4148v1(mutableMap, null);
        }
        String str = (String) map2.get("ab-type");
        if (!(Intrinsics.areEqual(str, "inline") || Intrinsics.areEqual(str, "anchored"))) {
            return new C4148v1(map2, null);
        }
        String str2 = (String) map2.get("ab-ad-slot");
        if (str2 != null && (split$default = StringsKt.split$default((CharSequence) str2, new String[]{"x"}, false, 2, 2, (Object) null)) != null) {
            if (split$default.size() != 2) {
                split$default = null;
            }
            if (split$default != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = split$default.iterator();
                while (it.hasNext()) {
                    Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
                    if (intOrNull != null) {
                        arrayList.add(intOrNull);
                    }
                }
                if (arrayList.size() == 2) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (((Number) it2.next()).intValue() > 0) {
                            }
                        }
                    }
                    if (arrayList != null) {
                        c4175w1 = new C4175w1(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue());
                        if (c4175w1 == null) {
                            return new C4148v1(map2, c4175w1);
                        }
                        Map mutableMap2 = MapsKt.toMutableMap(map2);
                        mutableMap2.remove("ab-type");
                        mutableMap2.remove("ab-ad-slot");
                        return new C4148v1(mutableMap2, null);
                    }
                }
                arrayList = null;
                if (arrayList != null) {
                }
            }
        }
        c4175w1 = null;
        if (c4175w1 == null) {
        }
    }
}
