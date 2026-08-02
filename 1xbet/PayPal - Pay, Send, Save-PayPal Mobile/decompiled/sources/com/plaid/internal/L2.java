package com.plaid.internal;

/* loaded from: classes3.dex */
public final class L2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static com.plaid.link.result.LinkExit b(java.lang.Throwable th, java.lang.String str) {
        return new com.plaid.link.result.LinkExit(a(th, str), null, 2, 0 == true ? 1 : 0);
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{\"error_code\":\"");
        sb.append(str);
        sb.append("\",\"error_message\":\"");
        sb.append(str2);
        sb.append("\",\"display_message\":\"");
        sb.append(str3);
        sb.append("\"}");
        return sb.toString();
    }

    public static com.plaid.link.result.LinkError a(java.lang.Throwable th, java.lang.String str) {
        java.lang.String str2;
        if (th instanceof com.plaid.internal.B2) {
            com.plaid.internal.C0452a6.a.a(com.plaid.internal.C0452a6.f5996a, th);
            if (str != null && str.length() != 0) {
                str2 = "Link has exited unexpectedly please report this to support via https://dashboard.plaid.com/support with the session id if it persists\n".concat(java.lang.String.valueOf(str));
            } else {
                str2 = "Link has exited unexpectedly please report this to support via https://dashboard.plaid.com/support with the session id if it persists";
            }
            return com.plaid.link.result.LinkError.INSTANCE.fromException$link_sdk_release(new com.plaid.link.exception.LinkException(str2));
        }
        return com.plaid.link.result.LinkError.INSTANCE.fromException$link_sdk_release(th);
    }

    public static com.plaid.link.result.LinkExitMetadata a(int i, java.lang.String str) {
        if ((i & 8) != 0) {
            str = null;
        }
        return new com.plaid.link.result.LinkExitMetadata(null, null, null, str, null);
    }

    public static com.plaid.link.result.LinkSuccess a(java.lang.String str, com.plaid.link.result.LinkSuccessMetadata linkSuccessMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkSuccessMetadata, "");
        return new com.plaid.link.result.LinkSuccess(str, linkSuccessMetadata);
    }

    public static com.plaid.link.result.LinkSuccess a(java.util.LinkedHashMap linkedHashMap, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return com.plaid.link.result.LinkSuccess.INSTANCE.fromMap$link_sdk_release(linkedHashMap, list);
    }

    public static com.plaid.link.result.LinkSuccessMetadata a(java.util.ArrayList arrayList, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        return new com.plaid.link.result.LinkSuccessMetadata((str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? null : new com.plaid.link.result.LinkInstitution(str, str2), arrayList, str3, str4);
    }

    public static com.plaid.link.result.LinkAccount a(com.plaid.internal.D1 d1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d1, "");
        return com.plaid.link.result.LinkAccount.INSTANCE.fromResponse$link_sdk_release(d1);
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{\"link_session_id\":\"");
        sb.append(str);
        sb.append("\",\"request_id\":\"");
        sb.append(str2);
        sb.append("\"}");
        return sb.toString();
    }
}
