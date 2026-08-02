package com.paypal.oslo.feature.onboarding.signup.ui.component;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/NavDecor;", "", "toItemName", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/NavDecor;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupTopBarAnalyticsKt {
    public static final java.lang.String toItemName(com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor navDecor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDecor, "");
        int i = com.paypal.oslo.feature.onboarding.signup.ui.component.SignupTopBarAnalyticsKt.WhenMappings.$EnumSwitchMapping$0[navDecor.ordinal()];
        if (i == 1) {
            return "home";
        }
        if (i == 2) {
            return "back";
        }
        if (i == 3) {
            return "close";
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "skip";
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor.values().length];
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor.HOME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor.BACK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor.CLOSE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor.SKIP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
