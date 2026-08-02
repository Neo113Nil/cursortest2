package com.plaid.internal;

/* loaded from: classes16.dex */
public final class I5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Application f5812a;

    @javax.inject.Inject
    public I5(android.app.Application application) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        this.f5812a = application;
    }

    public final java.lang.String a() {
        android.os.Bundle bundle = this.f5812a.getPackageManager().getApplicationInfo(this.f5812a.getPackageName(), 128).metaData;
        java.lang.String string = bundle != null ? bundle.getString("com.plaid.link.react_native") : null;
        if (string != null) {
            java.lang.String string2 = this.f5812a.getString(com.plaid.link.R.string.plaid_user_agent_string_format_react_native, string, com.plaid.link.Plaid.getVERSION_NAME(), this.f5812a.getPackageName(), java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
        java.lang.String string3 = this.f5812a.getString(com.plaid.link.R.string.plaid_user_agent_string_format_android, com.plaid.link.Plaid.getVERSION_NAME(), this.f5812a.getPackageName(), java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
        return string3;
    }
}
