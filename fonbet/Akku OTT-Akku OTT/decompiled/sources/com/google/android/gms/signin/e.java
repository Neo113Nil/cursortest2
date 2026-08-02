package com.google.android.gms.signin;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;

/* loaded from: classes4.dex */
public final class e {
    public static final b a;
    public static final com.google.android.gms.common.api.a b;

    static {
        a.g gVar = new a.g();
        new a.g();
        b bVar = new b();
        a = bVar;
        new c();
        new Scope(1, "profile");
        new Scope(1, "email");
        b = new com.google.android.gms.common.api.a("SignIn.API", bVar, gVar);
    }
}
