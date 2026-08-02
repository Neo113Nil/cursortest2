package com.plaid.internal;

/* loaded from: classes16.dex */
public final class F3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources f5785a;

    public final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5786a;

        static {
            int[] iArr = new int[com.plaid.internal.H3.values().length];
            try {
                iArr[com.plaid.internal.H3.NETWORK_ERROR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.plaid.internal.H3.SESSION_EXPIRED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.plaid.internal.H3.INITIALIZATION_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.plaid.internal.H3.HTTP_ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.plaid.internal.H3.UNKNOWN_ERROR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            f5786a = iArr;
        }
    }

    @javax.inject.Inject
    public F3(android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        this.f5785a = resources;
    }

    public final com.plaid.internal.N2.i a() {
        com.plaid.internal.r8.c cVar = com.plaid.internal.r8.CREATOR;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("unknown", "");
        com.plaid.internal.r8 r8Var = new com.plaid.internal.r8("unknown", "error_pane_id", "local_error_pane");
        com.plaid.internal.H3 h3 = com.plaid.internal.H3.INITIALIZATION_ERROR;
        return new com.plaid.internal.N2.i("unknown", r8Var, "", a(h3), com.plaid.link.result.LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE.getJson(), kotlin.collections.CollectionsKt.emptyList(), "", h3);
    }

    public final java.lang.String a(com.plaid.internal.H3 h3) {
        int i = com.plaid.internal.F3.a.f5786a[h3.ordinal()];
        if (i == 1) {
            java.lang.String string = this.f5785a.getString(com.plaid.link.R.string.plaid_error_no_network_connection_content);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        if (i == 2) {
            java.lang.String string2 = this.f5785a.getString(com.plaid.link.R.string.plaid_error_session_expired_content);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
        if (i == 3) {
            java.lang.String string3 = this.f5785a.getString(com.plaid.link.R.string.plaid_error_initialization_content);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
            return string3;
        }
        if (i == 4) {
            java.lang.String string4 = this.f5785a.getString(com.plaid.link.R.string.plaid_error_internal_server_error_try_again_later);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
            return string4;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String string5 = this.f5785a.getString(com.plaid.link.R.string.plaid_error_fallback_content);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "");
        return string5;
    }
}
