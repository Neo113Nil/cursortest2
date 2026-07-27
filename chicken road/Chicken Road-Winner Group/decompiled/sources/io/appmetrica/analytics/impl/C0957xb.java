package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.xb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0957xb implements InterfaceC0892uo {
    @Override // io.appmetrica.analytics.impl.InterfaceC0892uo
    public final C0840so a(String str) {
        return str == null ? new C0840so(this, false, "key is null") : str.startsWith("appmetrica") ? new C0840so(this, false, "key starts with appmetrica") : str.length() > 200 ? new C0840so(this, false, "key length more then 200 characters") : new C0840so(this, true, "");
    }
}
