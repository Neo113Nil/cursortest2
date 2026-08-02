package com.paypal.oslo.feature.home.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "normalizeHexColor", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ColorUtilsKt {
    public static final java.lang.String normalizeHexColor(java.lang.String str) {
        if (str != null) {
            return kotlin.text.StringsKt.startsWith$default(str, "#", false, 2, (java.lang.Object) null) ? str : "#".concat(java.lang.String.valueOf(str));
        }
        return null;
    }
}
