package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class gi implements Runnable, g7 {

    /* renamed from: a, reason: collision with root package name */
    public final ib f3795a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f3796b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3797c;

    /* renamed from: d, reason: collision with root package name */
    public final b9 f3798d;

    /* renamed from: e, reason: collision with root package name */
    public r8 f3799e;
    public Throwable f;

    public gi(ib ibVar, ib ibVar2, String str, b9 b9Var) {
        this.f3795a = ibVar;
        this.f3796b = ibVar2;
        this.f3797c = str;
        this.f3798d = b9Var;
    }

    @Override // com.startapp.sdk.internal.g7
    public final Object a(Object obj) {
        this.f = (Throwable) obj;
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ef efVar = (ef) this.f3795a.a();
            o8 o8Var = (o8) this.f3796b.a();
            String str = this.f3797c;
            hi hiVar = new hi();
            hiVar.f4661J = efVar.a(hiVar);
            n8 n8Var = new n8(o8Var, hiVar.a(str));
            n8Var.f4098e = this;
            n8Var.f4097d = ((HttpClientConfig) o8Var.f.a()).a(hiVar.f4676Z);
            r8 a3 = n8Var.a();
            this.f3799e = a3;
            b9 b9Var = this.f3798d;
            if (b9Var != null) {
                b9Var.a(this.f3797c, a3, this.f);
            }
        } catch (Throwable th) {
            try {
                this.f = th;
                d9.a(th);
            } finally {
                b9 b9Var2 = this.f3798d;
                if (b9Var2 != null) {
                    b9Var2.a(this.f3797c, this.f3799e, this.f);
                }
            }
        }
    }

    public static boolean a(Context context, String str, b9 b9Var) {
        try {
            com.startapp.sdk.components.a a3 = com.startapp.sdk.components.a.a(context);
            ((Executor) a3.f3335A.a()).execute(new gi(a3.f3361i, a3.f3366n, str, b9Var));
            return true;
        } catch (Throwable th) {
            d9.a(th);
            if (b9Var == null) {
                return false;
            }
            b9Var.a(str, (Object) null, th);
            return false;
        }
    }
}
