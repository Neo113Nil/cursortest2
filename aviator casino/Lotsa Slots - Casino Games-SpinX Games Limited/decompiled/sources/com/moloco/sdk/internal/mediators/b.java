package com.moloco.sdk.internal.mediators;

/* loaded from: classes5.dex */
public final class b {
    public static final long a(java.lang.String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 76100) {
                if (hashCode != 63085501) {
                    if (hashCode == 347625656 && str.equals("LevelPlay")) {
                        return kotlin.time.DurationKt.toDuration(8, kotlin.time.DurationUnit.SECONDS);
                    }
                } else if (str.equals(com.google.ads.mediation.moloco.MolocoMediationAdapter.MEDIATION_PLATFORM_NAME)) {
                    return kotlin.time.DurationKt.toDuration(8, kotlin.time.DurationUnit.SECONDS);
                }
            } else if (str.equals("MAX")) {
                return kotlin.time.DurationKt.toDuration(8, kotlin.time.DurationUnit.SECONDS);
            }
        }
        return kotlin.time.DurationKt.toDuration(60, kotlin.time.DurationUnit.SECONDS);
    }

    public static final long b(java.lang.String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 76100) {
                if (hashCode != 63085501) {
                    if (hashCode == 347625656 && str.equals("LevelPlay")) {
                        return kotlin.time.DurationKt.toDuration(26, kotlin.time.DurationUnit.SECONDS);
                    }
                } else if (str.equals(com.google.ads.mediation.moloco.MolocoMediationAdapter.MEDIATION_PLATFORM_NAME)) {
                    return kotlin.time.DurationKt.toDuration(26, kotlin.time.DurationUnit.SECONDS);
                }
            } else if (str.equals("MAX")) {
                return kotlin.time.DurationKt.toDuration(26, kotlin.time.DurationUnit.SECONDS);
            }
        }
        return kotlin.time.DurationKt.toDuration(60, kotlin.time.DurationUnit.SECONDS);
    }

    public static final long c(java.lang.String str) {
        return a(str);
    }

    public static final long d(java.lang.String str) {
        return kotlin.jvm.internal.Intrinsics.areEqual(str, "MAX") ? kotlin.time.DurationKt.toDuration(8, kotlin.time.DurationUnit.SECONDS) : kotlin.jvm.internal.Intrinsics.areEqual(str, com.google.ads.mediation.moloco.MolocoMediationAdapter.MEDIATION_PLATFORM_NAME) ? kotlin.time.DurationKt.toDuration(58, kotlin.time.DurationUnit.SECONDS) : kotlin.time.DurationKt.toDuration(60, kotlin.time.DurationUnit.SECONDS);
    }
}
