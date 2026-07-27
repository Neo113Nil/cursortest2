package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class x9 implements h7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4625a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f4626b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f4627c;

    public x9(Context context, ib ibVar, ib ibVar2) {
        this.f4625a = context;
        this.f4626b = ibVar;
        this.f4627c = ibVar2;
    }

    @Override // com.startapp.sdk.internal.h7
    public final Object a(Object obj, Object obj2, Object obj3) {
        d9 d9Var = (d9) obj;
        g9 g9Var = (g9) obj2;
        n9 n9Var = (n9) obj3;
        if (d9Var == null || g9Var == null) {
            return null;
        }
        return e9.f3622j.equals(d9Var.f3571a) ? new y9(this.f4626b, this.f4627c, d9Var, g9Var, n9Var) : new v9(this.f4625a, d9Var, g9Var, n9Var);
    }
}
