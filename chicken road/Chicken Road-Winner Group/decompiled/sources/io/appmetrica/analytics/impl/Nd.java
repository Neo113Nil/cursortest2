package io.appmetrica.analytics.impl;

import android.os.Process;

/* loaded from: classes.dex */
public final class Nd implements InterfaceC0475el {

    /* renamed from: a, reason: collision with root package name */
    public final int f6324a;

    public Nd(int i3) {
        this.f6324a = i3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0475el
    public final boolean a(String str) {
        return this.f6324a != Process.myPid();
    }
}
