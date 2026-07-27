package io.appmetrica.analytics.impl;

import android.os.Process;

/* renamed from: io.appmetrica.analytics.impl.tb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0853tb implements InterfaceC0475el {
    @Override // io.appmetrica.analytics.impl.InterfaceC0475el
    public final boolean a(C0776qb c0776qb) {
        Integer num = c0776qb.f;
        return num == null || num.intValue() != Process.myPid();
    }
}
