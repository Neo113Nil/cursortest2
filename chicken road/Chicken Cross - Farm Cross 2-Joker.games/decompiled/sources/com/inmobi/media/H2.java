package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class H2 implements Ok, InterfaceC3722g {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4120u1 f6593a;
    public final InterfaceC3620c9 b;
    public final Ad c;

    public H2(AbstractC4120u1 abstractC4120u1, InterfaceC3620c9 adManagerComponent, Ad stateMachine) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f6593a = abstractC4120u1;
        this.b = adManagerComponent;
        this.c = stateMachine;
    }

    @Override // com.inmobi.media.Ok
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC3722g
    public final void j() {
        this.c.a(new S5(this.b), this);
    }
}
