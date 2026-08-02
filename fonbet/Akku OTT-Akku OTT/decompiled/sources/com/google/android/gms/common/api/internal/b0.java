package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.InterfaceC0869k;
import java.util.Set;

/* loaded from: classes4.dex */
public final class b0 implements Runnable {
    public final /* synthetic */ com.google.android.gms.signin.internal.k a;
    public final /* synthetic */ c0 b;

    public b0(c0 c0Var, com.google.android.gms.signin.internal.k kVar) {
        this.b = c0Var;
        this.a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0869k q0Var;
        com.google.android.gms.signin.internal.k kVar = this.a;
        C0852b c0852b = kVar.b;
        boolean m = c0852b.m();
        c0 c0Var = this.b;
        if (m) {
            com.google.android.gms.common.internal.M m2 = kVar.c;
            C0875q.g(m2);
            C0852b c0852b2 = m2.c;
            if (!c0852b2.m()) {
                String valueOf = String.valueOf(c0852b2);
                new Exception();
                "Sign-in succeeded with resolve account failure: ".concat(valueOf);
                c0Var.p.b(c0852b2);
                c0Var.f.disconnect();
                return;
            }
            N n = c0Var.p;
            IBinder iBinder = m2.b;
            if (iBinder == null) {
                q0Var = null;
            } else {
                int i = InterfaceC0869k.a.a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                q0Var = queryLocalInterface instanceof InterfaceC0869k ? (InterfaceC0869k) queryLocalInterface : new com.google.android.gms.common.internal.q0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            Set<Scope> set = c0Var.d;
            n.getClass();
            if (q0Var == null || set == null) {
                new Exception();
                n.b(new C0852b(4));
            } else {
                n.c = q0Var;
                n.d = set;
                if (n.e) {
                    n.a.getRemoteService(q0Var, set);
                }
            }
        } else {
            c0Var.p.b(c0852b);
        }
        c0Var.f.disconnect();
    }
}
