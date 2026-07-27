package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.s9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0825s9 extends Kf {

    /* renamed from: a, reason: collision with root package name */
    public final C0807rh f8295a;

    /* renamed from: b, reason: collision with root package name */
    public final C0859th f8296b;

    /* renamed from: c, reason: collision with root package name */
    public final C0497fh f8297c;

    public C0825s9(C0459e5 c0459e5) {
        this.f8295a = new C0807rh(c0459e5);
        this.f8296b = new C0859th(c0459e5);
        this.f8297c = new C0497fh(c0459e5);
    }

    @Override // io.appmetrica.analytics.impl.Kf
    public final AbstractC0438d9 a(int i3) {
        LinkedList linkedList = new LinkedList();
        int ordinal = EnumC0569ib.a(i3).ordinal();
        if (ordinal == 1) {
            linkedList.add(this.f8295a);
        } else if (ordinal == 3) {
            linkedList.add(this.f8297c);
        } else if (ordinal == 27) {
            linkedList.add(this.f8296b);
            linkedList.add(this.f8295a);
        }
        return new C0412c9(linkedList);
    }
}
