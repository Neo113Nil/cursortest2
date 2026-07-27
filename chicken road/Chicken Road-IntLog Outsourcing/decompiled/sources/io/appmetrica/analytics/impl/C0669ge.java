package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import b2.AbstractC0279e;

/* renamed from: io.appmetrica.analytics.impl.ge, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0669ge implements InterfaceC1041uo {

    /* renamed from: a, reason: collision with root package name */
    public final String f8275a;

    public C0669ge(String str) {
        this.f8275a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1041uo
    public final C0989so a(String str) {
        return TextUtils.isEmpty(str) ? new C0989so(this, false, AbstractC0279e.h(new StringBuilder(), this.f8275a, " is empty.")) : new C0989so(this, true, "");
    }
}
