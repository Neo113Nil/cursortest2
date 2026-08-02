package com.paypal.oslo.feature.ads.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/paypal/pds/core/BaseColor;", "toBaseColor", "(Ljava/lang/String;)Lcom/paypal/pds/core/BaseColor;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ColorExtKt {
    public static final com.paypal.pds.core.BaseColor toBaseColor(java.lang.String str) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.lang.Integer.valueOf(android.graphics.Color.parseColor(str)));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        java.lang.Integer num = (java.lang.Integer) m23436constructorimpl;
        if (num != null) {
            return com.paypal.pds.core.BaseColorKt.m22097toBaseColor8_81llA(androidx.compose.ui.graphics.ColorKt.Color(num.intValue()));
        }
        return null;
    }
}
