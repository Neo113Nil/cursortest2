package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class cd {

    /* renamed from: a, reason: collision with root package name */
    public Context f4710a;
    public boolean b;
    public ua c;
    public ua d;

    public cd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4710a = context;
        this.c = new ua(0, 0, 0, 0, 15, null);
        this.d = new ua(0, 0, 0, 0, 15, null);
    }

    public final boolean a() {
        if (!this.b) {
            return false;
        }
        this.b = false;
        return true;
    }

    public final ua b() {
        return this.d;
    }

    public String toString() {
        return "width: " + this.d.b() + " height: " + this.d.a() + " + x: " + this.d.c() + " y: " + this.d.d();
    }

    public final void a(int i, int i2) {
        if (this.c.b() == i && this.c.a() == i2) {
            return;
        }
        ua uaVar = this.c;
        uaVar.c(0);
        uaVar.d(0);
        uaVar.b(i);
        uaVar.a(i2);
        a(this.c, this.d);
        this.b = true;
    }

    public final void a(int i, int i2, int i3, int i4) {
        if (Intrinsics.areEqual(new ua(i, i2, i3, i4), this.c)) {
            return;
        }
        ua uaVar = this.c;
        uaVar.c(i);
        uaVar.d(i2);
        uaVar.b(i3);
        uaVar.a(i4);
        a(this.c, this.d);
        this.b = true;
    }

    public final void a(ua uaVar, ua uaVar2) {
        n6 n6Var = n6.f4889a;
        uaVar2.c(n6Var.a(uaVar.c(), this.f4710a));
        uaVar2.d(n6Var.a(uaVar.d(), this.f4710a));
        uaVar2.b(n6Var.a(uaVar.b(), this.f4710a));
        uaVar2.a(n6Var.a(uaVar.a(), this.f4710a));
    }
}
