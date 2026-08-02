package com.plaid.internal.core.networking.models;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002"}, d2 = {"Lcom/plaid/internal/core/networking/models/NetworkException;", "", "a"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class NetworkException extends java.lang.Throwable {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6014a;
    public final java.lang.String b;

    public static final class a {
        public static com.plaid.internal.core.networking.models.NetworkException a(okhttp3.Request request, okhttp3.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            java.lang.String concat = "Request failed - ".concat(java.lang.String.valueOf(request.url().encodedPath()));
            okhttp3.HttpUrl url = request.url();
            int code = response.code();
            okhttp3.ResponseBody body = response.body();
            com.plaid.internal.core.networking.models.a aVar = body != null ? new com.plaid.internal.core.networking.models.a(body) : null;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("\n        \n        \n        Url: ");
            sb.append(url);
            sb.append("\n        Response code: ");
            sb.append(code);
            sb.append("\n        Error message: ");
            sb.append(aVar);
            sb.append("\n        \n        Stacktrace:\n      ");
            return new com.plaid.internal.core.networking.models.NetworkException(concat, kotlin.text.StringsKt.trimIndent(sb.toString()));
        }
    }

    public NetworkException(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.f6014a = str;
        this.b = str2;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.b;
    }
}
