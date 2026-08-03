package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.mb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0535mb implements io.appmetrica.analytics.impl.InterfaceC0235al {
    @Override // io.appmetrica.analytics.impl.InterfaceC0235al
    public final boolean a(io.appmetrica.analytics.impl.C0457jb c0457jb) {
        java.lang.Integer num = c0457jb.f6181f;
        return num == null || num.intValue() != android.os.Process.myPid();
    }
}
