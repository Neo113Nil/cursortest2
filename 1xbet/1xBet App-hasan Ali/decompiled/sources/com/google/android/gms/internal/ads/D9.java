package com.google.android.gms.internal.ads;

import Q2.InterfaceC0347a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class D9 implements S2.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8175a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0347a f8177c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap f8178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f8179e;

    public D9(boolean z3, InterfaceC0347a interfaceC0347a, HashMap hashMap, Map map) {
        this.f8176b = z3;
        this.f8177c = interfaceC0347a;
        this.f8178d = hashMap;
        this.f8179e = map;
    }

    @Override // S2.a
    public final void A(boolean z3) {
        if (this.f8175a) {
            return;
        }
        InterfaceC0347a interfaceC0347a = this.f8177c;
        if (z3 && this.f8176b) {
            ((Vi) interfaceC0347a).E();
        }
        this.f8175a = true;
        String str = (String) this.f8179e.get("event_id");
        Boolean valueOf = Boolean.valueOf(z3);
        HashMap hashMap = this.f8178d;
        hashMap.put(str, valueOf);
        ((InterfaceC0889da) interfaceC0347a).a("openIntentAsync", hashMap);
    }

    @Override // S2.a
    public final void z(int i) {
    }
}
