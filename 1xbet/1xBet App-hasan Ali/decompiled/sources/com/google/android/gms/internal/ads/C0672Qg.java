package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Qg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0672Qg implements L5 {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0677Re f11223k;

    /* renamed from: l, reason: collision with root package name */
    public final Executor f11224l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReference f11225m = new AtomicReference();

    public C0672Qg(InterfaceC0677Re interfaceC0677Re, Executor executor) {
        this.f11223k = interfaceC0677Re;
        this.f11224l = executor;
    }

    @Override // com.google.android.gms.internal.ads.L5
    public final synchronized void z0(K5 k5) {
        if (this.f11223k != null) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.gc)).booleanValue()) {
                if (k5.f10128j) {
                    AtomicReference atomicReference = this.f11225m;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        Executor executor = this.f11224l;
                        InterfaceC0677Re interfaceC0677Re = this.f11223k;
                        Objects.requireNonNull(interfaceC0677Re);
                        executor.execute(new RunnableC0658Og(interfaceC0677Re, 0));
                        return;
                    }
                }
                if (!k5.f10128j) {
                    AtomicReference atomicReference2 = this.f11225m;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        Executor executor2 = this.f11224l;
                        InterfaceC0677Re interfaceC0677Re2 = this.f11223k;
                        Objects.requireNonNull(interfaceC0677Re2);
                        executor2.execute(new RunnableC0658Og(interfaceC0677Re2, 1));
                    }
                }
            }
        }
    }
}
