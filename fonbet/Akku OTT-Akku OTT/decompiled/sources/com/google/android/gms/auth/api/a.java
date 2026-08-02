package com.google.android.gms.auth.api;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.a;

/* loaded from: classes4.dex */
public final class a {

    @NonNull
    public static final com.google.android.gms.common.api.a<GoogleSignInOptions> a;

    static {
        new a.g();
        a.g gVar = new a.g();
        new d();
        e eVar = new e();
        com.google.android.gms.common.api.a<c> aVar = b.a;
        a = new com.google.android.gms.common.api.a<>("Auth.GOOGLE_SIGN_IN_API", eVar, gVar);
    }
}
