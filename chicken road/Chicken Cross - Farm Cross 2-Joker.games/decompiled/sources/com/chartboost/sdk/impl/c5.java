package com.chartboost.sdk.impl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public final d5 f4704a;
    public rh b;
    public Function0 c;

    public c5(d5 compositeCloseChipView) {
        Intrinsics.checkNotNullParameter(compositeCloseChipView, "compositeCloseChipView");
        this.f4704a = compositeCloseChipView;
    }

    public static /* synthetic */ void a(c5 c5Var, long j, uh uhVar, String str, String str2, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            uhVar = uh.c;
        }
        c5Var.a(j, uhVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : function0);
    }

    public final rh b() {
        return this.b;
    }

    public final void c() {
        rh rhVar = this.b;
        if (rhVar != null) {
            rhVar.e();
        }
    }

    public final void d() {
        rh rhVar = this.b;
        if (rhVar != null) {
            rhVar.f();
        }
    }

    public final void e() {
        rh rhVar = this.b;
        if (rhVar != null) {
            rhVar.g();
        }
    }

    public final void a(long j, uh mode, String str, String str2, Function0 function0) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.c = function0;
        rh rhVar = this.b;
        if (rhVar != null) {
            rhVar.a();
        }
        rh rhVar2 = new rh(j, this.c, null, 4, null);
        rhVar2.a(this.f4704a.getTimerChipView());
        rhVar2.a(mode, str, str2);
        this.b = rhVar2;
    }

    public final void a() {
        rh rhVar = this.b;
        if (rhVar != null) {
            rhVar.a();
        }
    }
}
