package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.e3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0457e3 extends Hi {
    public C0457e3(Context context, String str) {
        super(context, str, "bool");
    }

    @Override // io.appmetrica.analytics.impl.Hi
    public final Object a(int i3) {
        return Boolean.valueOf(this.f6035a.getResources().getBoolean(i3));
    }

    public final Boolean b(int i3) {
        return Boolean.valueOf(this.f6035a.getResources().getBoolean(i3));
    }
}
