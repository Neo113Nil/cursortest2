package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.u1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4120u1 {

    /* renamed from: a, reason: collision with root package name */
    public final C3935nd f7406a;

    public AbstractC4120u1(C4008q1 adManagerComponent) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        C4036r1 c4036r1 = adManagerComponent.f7316a;
        this.f7406a = AbstractC3907md.a(c4036r1.b.getTimeouts().a0(), c4036r1.f7340a.h, "native", AbstractC3942nk.b);
    }

    public abstract void a();

    public abstract void b();

    public void c() {
    }

    public abstract void d();

    public abstract void e();

    public void f() {
    }
}
