package com.paypal.oslo.feature.onboarding.shared.utils;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a4\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0010\b\u0000\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "", "defaultValue", "enumValueOfOrNull", "(Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EnumExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Enum enumValueOfOrNull$default(java.lang.String str, java.lang.Enum r2, int i, java.lang.Object obj) {
        java.lang.Enum r1;
        if ((i & 1) != 0) {
            r2 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String str2 = str;
            java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(5, "T");
            r1 = kotlin.Result.m23436constructorimpl(java.lang.Enum.valueOf(null, upperCase));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            r1 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23439exceptionOrNullimpl(r1) == null) {
            r2 = r1;
        }
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T extends java.lang.Enum<T>> T enumValueOfOrNull(java.lang.String str, T t) {
        T t2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String str2 = str;
            java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(5, "T");
            t2 = kotlin.Result.m23436constructorimpl(java.lang.Enum.valueOf(null, upperCase));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            t2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23439exceptionOrNullimpl(t2) == null) {
            t = t2;
        }
        return t;
    }
}
