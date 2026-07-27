package io.appmetrica.analytics.impl;

import android.os.Process;

/* loaded from: classes.dex */
public final class Nd implements InterfaceC0624el {

    /* renamed from: a, reason: collision with root package name */
    public final int f7181a;

    public Nd(int i2) {
        this.f7181a = i2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0624el
    public final boolean a(String str) {
        return this.f7181a != Process.myPid();
    }
}
