package com.plaid.internal;

/* renamed from: com.plaid.internal.s1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0636s1 {
    public static final boolean a(com.plaid.internal.AbstractC0550i4.a<java.lang.Object> aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "");
        java.lang.Object obj = aVar.f6438a;
        if (!(obj instanceof com.google.gson.internal.LinkedTreeMap)) {
            return false;
        }
        java.lang.String upperCase = java.lang.String.valueOf(((java.util.Map) obj).get(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE)).toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return aVar.b == 400 && kotlin.jvm.internal.Intrinsics.areEqual("INVALID_CHANNEL_ID", upperCase);
    }
}
