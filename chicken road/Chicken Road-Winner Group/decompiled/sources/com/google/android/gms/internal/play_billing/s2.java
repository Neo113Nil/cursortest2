package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f2817a;

    /* renamed from: b, reason: collision with root package name */
    public u2 f2818b;

    /* renamed from: c, reason: collision with root package name */
    public v2 f2819c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2820d;

    public final void finalize() {
        v2 v2Var;
        u2 u2Var = this.f2818b;
        if (u2Var != null) {
            t2 t2Var = u2Var.f2833b;
            if (!t2Var.isDone()) {
                if (r2.f.v(t2Var, null, new C0217p1(new C0180d0("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f2817a)), 2)))) {
                    r2.c(t2Var);
                }
            }
        }
        if (this.f2820d || (v2Var = this.f2819c) == null) {
            return;
        }
        v2Var.h(null);
    }
}
