package com.applovin.impl.sdk;

import com.applovin.impl.c5;
import com.applovin.impl.m7;
import com.applovin.impl.sdk.a;
import com.applovin.impl.u1;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final l f4458a;
    private final WeakReference b;
    private final WeakReference c;
    private m7 d;

    private b(u1 u1Var, a.InterfaceC0082a interfaceC0082a, l lVar) {
        this.b = new WeakReference(u1Var);
        this.c = new WeakReference(interfaceC0082a);
        this.f4458a = lVar;
    }

    public static b a(u1 u1Var, a.InterfaceC0082a interfaceC0082a, l lVar) {
        b bVar = new b(u1Var, interfaceC0082a, lVar);
        bVar.a(u1Var.getTimeToLiveMillis());
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.f4458a.f().a(this);
    }

    public u1 b() {
        return (u1) this.b.get();
    }

    public void d() {
        a();
        u1 b = b();
        if (b == null) {
            return;
        }
        b.setExpired();
        a.InterfaceC0082a interfaceC0082a = (a.InterfaceC0082a) this.c.get();
        if (interfaceC0082a == null) {
            return;
        }
        interfaceC0082a.onAdExpired(b);
    }

    public void a(long j) {
        a();
        if (((Boolean) this.f4458a.a(c5.g1)).booleanValue() || !this.f4458a.o0().isApplicationPaused()) {
            this.d = m7.a(j, this.f4458a, new Runnable() { // from class: com.applovin.impl.sdk.b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.c();
                }
            });
        }
    }

    public void a() {
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.a();
            this.d = null;
        }
    }
}
