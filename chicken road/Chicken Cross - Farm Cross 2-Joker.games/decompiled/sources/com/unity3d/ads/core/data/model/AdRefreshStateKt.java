package com.unity3d.ads.core.data.model;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdRefreshState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"REUSE_RELOADED_INVALIDATION_REASON", "", "REUSE_NO_FILL_INVALIDATION_REASON", "REUSE_ERROR_INVALIDATION_REASON", "REUSE_DURING_RELOAD_INVALIDATION_REASON", "getInvalidationReason", "Lcom/unity3d/ads/core/data/model/AdRefreshState;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdRefreshStateKt {
    private static final String REUSE_DURING_RELOAD_INVALIDATION_REASON = "reuse_during_reload";
    private static final String REUSE_ERROR_INVALIDATION_REASON = "reuse_error";
    private static final String REUSE_NO_FILL_INVALIDATION_REASON = "reuse_no_fill";
    private static final String REUSE_RELOADED_INVALIDATION_REASON = "reuse_reloaded";

    /* compiled from: AdRefreshState.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdRefreshState.values().length];
            try {
                iArr[AdRefreshState.REUSE_RELOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdRefreshState.REUSE_NO_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdRefreshState.REUSE_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdRefreshState.REUSE_DURING_RELOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getInvalidationReason(AdRefreshState adRefreshState) {
        Intrinsics.checkNotNullParameter(adRefreshState, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[adRefreshState.ordinal()];
        if (i == 1) {
            return REUSE_RELOADED_INVALIDATION_REASON;
        }
        if (i == 2) {
            return REUSE_NO_FILL_INVALIDATION_REASON;
        }
        if (i == 3) {
            return REUSE_ERROR_INVALIDATION_REASON;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return REUSE_DURING_RELOAD_INVALIDATION_REASON;
    }
}
