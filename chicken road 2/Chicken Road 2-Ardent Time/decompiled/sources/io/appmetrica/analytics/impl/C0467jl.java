package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.jl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0467jl implements io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.String simOperator = ((android.telephony.TelephonyManager) obj).getSimOperator();
        java.lang.String substring = !android.text.TextUtils.isEmpty(simOperator) ? simOperator.substring(0, 3) : null;
        if (android.text.TextUtils.isEmpty(substring)) {
            return null;
        }
        return java.lang.Integer.valueOf(java.lang.Integer.parseInt(substring));
    }
}
