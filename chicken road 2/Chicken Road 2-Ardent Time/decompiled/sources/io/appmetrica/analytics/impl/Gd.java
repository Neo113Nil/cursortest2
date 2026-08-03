package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Gd implements io.appmetrica.analytics.impl.InterfaceC0235al {

    /* renamed from: a, reason: collision with root package name */
    public final int f4328a;

    public Gd(int i2) {
        this.f4328a = i2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0235al
    public final boolean a(java.lang.String str) {
        return this.f4328a != android.os.Process.myPid();
    }
}
