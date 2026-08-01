package com.moloco.sdk.internal.ortb.model;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.internal.ortb.model.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4785h {

    /* renamed from: a, reason: collision with root package name */
    public static final float f10546a = 0.1f;

    public static final float a(C4782e c4782e) {
        u experimental;
        Float adaptiveBannerBlurGapThreshold;
        Intrinsics.checkNotNullParameter(c4782e, "<this>");
        z zVar = c4782e.getExt().getCom.ironsource.c8.p java.lang.String();
        if (zVar != null && (experimental = zVar.getExperimental()) != null && (adaptiveBannerBlurGapThreshold = experimental.getAdaptiveBannerBlurGapThreshold()) != null) {
            float floatValue = adaptiveBannerBlurGapThreshold.floatValue();
            if (0.0f > floatValue || floatValue > 1.0f) {
                adaptiveBannerBlurGapThreshold = null;
            }
            if (adaptiveBannerBlurGapThreshold != null) {
                return adaptiveBannerBlurGapThreshold.floatValue();
            }
        }
        return 0.1f;
    }

    public static final boolean b(C4782e c4782e) {
        u experimental;
        Intrinsics.checkNotNullParameter(c4782e, "<this>");
        z zVar = c4782e.getExt().getCom.ironsource.c8.p java.lang.String();
        if (zVar == null || (experimental = zVar.getExperimental()) == null) {
            return false;
        }
        return Intrinsics.areEqual(experimental.getAdaptiveBannerBlurBgEnabled(), Boolean.TRUE);
    }

    public static final boolean c(C4782e c4782e) {
        u experimental;
        Intrinsics.checkNotNullParameter(c4782e, "<this>");
        z zVar = c4782e.getExt().getCom.ironsource.c8.p java.lang.String();
        if (zVar == null || (experimental = zVar.getExperimental()) == null) {
            return false;
        }
        return Intrinsics.areEqual(experimental.getComposeRemovalEnabled(), Boolean.TRUE);
    }

    public static final String d(C4782e c4782e) {
        Intrinsics.checkNotNullParameter(c4782e, "<this>");
        String mtid = c4782e.getExt().getMtid();
        return mtid == null ? "UNKNOWN_MTID" : mtid;
    }
}
