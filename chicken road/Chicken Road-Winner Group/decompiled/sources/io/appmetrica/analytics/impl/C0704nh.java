package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.nh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0704nh extends T5 {

    /* renamed from: b, reason: collision with root package name */
    public final C0459e5 f7938b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0678mh f7939c;

    /* renamed from: d, reason: collision with root package name */
    public final K3 f7940d;

    public C0704nh(C0459e5 c0459e5, InterfaceC0678mh interfaceC0678mh) {
        this(c0459e5, interfaceC0678mh, new K3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.T5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C0756ph load(S5 s5) {
        C0756ph c0756ph = (C0756ph) super.load(s5);
        c0756ph.f8079m = ((C0626kh) s5.componentArguments).f7703a;
        c0756ph.f8084r = this.f7938b.f7211t.a();
        c0756ph.f8089w = this.f7938b.f7208q.a();
        C0626kh c0626kh = (C0626kh) s5.componentArguments;
        c0756ph.f8071d = c0626kh.f7704b;
        c0756ph.f8072e = c0626kh.f7705c;
        c0756ph.f = c0626kh.f7706d;
        c0756ph.f8075i = c0626kh.f7707e;
        c0756ph.f8073g = c0626kh.f;
        c0756ph.f8074h = c0626kh.f7708g;
        Boolean valueOf = Boolean.valueOf(c0626kh.f7709h);
        InterfaceC0678mh interfaceC0678mh = this.f7939c;
        c0756ph.f8076j = valueOf;
        c0756ph.f8077k = interfaceC0678mh;
        C0626kh c0626kh2 = (C0626kh) s5.componentArguments;
        c0756ph.f8088v = c0626kh2.f7711j;
        C0605jm c0605jm = s5.f6552a;
        C0820s4 c0820s4 = c0605jm.f7654n;
        c0756ph.f8080n = c0820s4.f8282a;
        De de = c0605jm.f7659s;
        if (de != null) {
            c0756ph.f8085s = de.f5846a;
            c0756ph.f8086t = de.f5847b;
        }
        c0756ph.f8081o = c0820s4.f8283b;
        c0756ph.f8083q = c0605jm.f7646e;
        c0756ph.f8082p = c0605jm.f7651k;
        K3 k3 = this.f7940d;
        Map<String, String> map = c0626kh2.f7710i;
        H3 f = C0878ua.f8414H.f();
        k3.getClass();
        c0756ph.f8087u = K3.a(map, c0605jm, f);
        c0756ph.f8090x = this.f7938b.f7213v.f8607e.keySet();
        return c0756ph;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C0756ph(this.f7938b);
    }

    public C0704nh(C0459e5 c0459e5, InterfaceC0678mh interfaceC0678mh, K3 k3) {
        super(c0459e5.getContext(), c0459e5.b().c());
        this.f7938b = c0459e5;
        this.f7939c = interfaceC0678mh;
        this.f7940d = k3;
    }

    public final C0756ph a() {
        return new C0756ph(this.f7938b);
    }
}
