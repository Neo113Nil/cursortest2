package com.moloco.sdk.internal.utils;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f7333a = "[ERROR_CODE]";
    public static final java.lang.String b = "[HAPPENED_AT_TS]";
    public static final java.lang.String c = "[SECONDS_LEFT]";

    public static final java.lang.String a(java.lang.String str, java.lang.String errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        return kotlin.text.StringsKt.replace$default(str, "[ERROR_CODE]", errorCode, false, 4, (java.lang.Object) null);
    }

    public static final java.lang.String b(java.lang.String str, java.lang.String str2) {
        java.lang.String replace$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return (str2 == null || (replace$default = kotlin.text.StringsKt.replace$default(str, "[MTID]", str2, false, 4, (java.lang.Object) null)) == null) ? str : replace$default;
    }

    public static final java.lang.String a(java.lang.String str, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.StringsKt.replace$default(str, "[HAPPENED_AT_TS]", java.lang.String.valueOf(j), false, 4, (java.lang.Object) null);
    }

    public static final java.lang.String a(java.lang.String str, java.lang.String errorCode, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        return a(a(str, errorCode), j);
    }

    public static final java.lang.String a(java.lang.String substituteCountDownTimeLeftMacro, int i) {
        java.lang.String m10868m;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(substituteCountDownTimeLeftMacro, "$this$substituteCountDownTimeLeftMacro");
        m10868m = kotlin.UByte$$ExternalSyntheticBackport0.m10868m(i, 10);
        return kotlin.text.StringsKt.replace$default(substituteCountDownTimeLeftMacro, c, m10868m, false, 4, (java.lang.Object) null);
    }
}
