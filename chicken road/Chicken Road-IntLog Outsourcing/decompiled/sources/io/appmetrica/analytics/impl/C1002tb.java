package io.appmetrica.analytics.impl;

import android.os.Process;

/* renamed from: io.appmetrica.analytics.impl.tb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1002tb implements InterfaceC0624el {
    @Override // io.appmetrica.analytics.impl.InterfaceC0624el
    public final boolean a(C0925qb c0925qb) {
        Integer num = c0925qb.f9087f;
        return num == null || num.intValue() != Process.myPid();
    }
}
