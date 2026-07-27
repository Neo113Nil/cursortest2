package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.ge, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0520ge implements InterfaceC0892uo {

    /* renamed from: a, reason: collision with root package name */
    public final String f7375a;

    public C0520ge(String str) {
        this.f7375a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0892uo
    public final C0840so a(String str) {
        return TextUtils.isEmpty(str) ? new C0840so(this, false, B0.c.l(new StringBuilder(), this.f7375a, " is empty.")) : new C0840so(this, true, "");
    }
}
