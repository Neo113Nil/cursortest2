package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ed, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0467ed extends L2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f7237b;

    public C0467ed(String str, InterfaceC0992yl interfaceC0992yl) {
        super(interfaceC0992yl);
        this.f7237b = str;
    }

    @Override // io.appmetrica.analytics.impl.L2
    public final String a(String str) {
        return str + '-' + this.f7237b;
    }
}
