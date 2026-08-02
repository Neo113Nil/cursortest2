package io.github.sabpaisaandroid.viewmodels;

import io.github.sabpaisaandroid.activity.WebViewActivityLite;
import io.github.sabpaisaandroid.activity.c;
import io.github.sabpaisaandroid.models.EncryptModelResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements io.github.sabpaisaandroid.interfaces.a<EncryptModelResponse> {
    public final /* synthetic */ c a;
    public final /* synthetic */ WebViewActivityLite b;

    public b(c cVar, WebViewActivityLite webViewActivityLite) {
        this.a = cVar;
        this.b = webViewActivityLite;
    }

    @Override // io.github.sabpaisaandroid.interfaces.a
    public final void a(EncryptModelResponse encryptModelResponse) {
        EncryptModelResponse response = encryptModelResponse;
        Intrinsics.checkNotNullParameter(response, "response");
        this.a.a(response);
    }
}
