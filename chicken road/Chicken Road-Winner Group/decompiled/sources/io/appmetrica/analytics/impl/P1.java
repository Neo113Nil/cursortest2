package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class P1 implements InterfaceC0577ik {

    /* renamed from: b, reason: collision with root package name */
    public static final O1 f6378b = new O1();

    /* renamed from: c, reason: collision with root package name */
    public static final int f6379c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0816s0 f6380a;

    public P1(InterfaceC0816s0 interfaceC0816s0) {
        this.f6380a = interfaceC0816s0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0577ik
    public final void reportData(int i3, Bundle bundle) {
        ((M1) this.f6380a).a(bundle);
    }
}
