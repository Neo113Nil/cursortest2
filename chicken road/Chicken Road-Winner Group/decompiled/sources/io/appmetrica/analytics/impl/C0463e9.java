package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.e9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0463e9 extends Kf {

    /* renamed from: a, reason: collision with root package name */
    public final C0938wi f7229a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7230b;

    /* renamed from: c, reason: collision with root package name */
    public final C0950x4 f7231c;

    public C0463e9(C0459e5 c0459e5) {
        C0938wi c0938wi = new C0938wi(c0459e5);
        this.f7229a = c0938wi;
        this.f7231c = new C0950x4(c0938wi);
        this.f7230b = a();
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0569ib.EVENT_TYPE_ACTIVATION, new C0531h(this.f7229a));
        hashMap.put(EnumC0569ib.EVENT_TYPE_START, new Il(this.f7229a));
        hashMap.put(EnumC0569ib.EVENT_TYPE_REGULAR, new Lg(this.f7229a));
        C0750pb c0750pb = new C0750pb(this.f7229a);
        hashMap.put(EnumC0569ib.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c0750pb);
        hashMap.put(EnumC0569ib.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c0750pb);
        hashMap.put(EnumC0569ib.EVENT_TYPE_SEND_REFERRER, c0750pb);
        hashMap.put(EnumC0569ib.EVENT_TYPE_CUSTOM_EVENT, c0750pb);
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_SET_SESSION_EXTRA;
        C0938wi c0938wi = this.f7229a;
        hashMap.put(enumC0569ib, new Dl(c0938wi, c0938wi.f8589t));
        hashMap.put(EnumC0569ib.EVENT_TYPE_APP_OPEN, new Sg(this.f7229a));
        hashMap.put(EnumC0569ib.EVENT_TYPE_PURGE_BUFFER, new Wf(this.f7229a));
        hashMap.put(EnumC0569ib.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C1002z6(this.f7229a));
        hashMap.put(EnumC0569ib.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new Af(this.f7229a));
        hashMap.put(EnumC0569ib.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Xn(this.f7229a));
        hashMap.put(EnumC0569ib.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new Bf(this.f7229a));
        hashMap.put(EnumC0569ib.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new Wn(this.f7229a));
        hashMap.put(EnumC0569ib.EVENT_TYPE_ANR, c0750pb);
        EnumC0569ib enumC0569ib2 = EnumC0569ib.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C0938wi c0938wi2 = this.f7229a;
        hashMap.put(enumC0569ib2, new Dl(c0938wi2, c0938wi2.f8575e));
        EnumC0569ib enumC0569ib3 = EnumC0569ib.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C0938wi c0938wi3 = this.f7229a;
        hashMap.put(enumC0569ib3, new Dl(c0938wi3, c0938wi3.f));
        hashMap.put(EnumC0569ib.EVENT_TYPE_SEND_USER_PROFILE, c0750pb);
        EnumC0569ib enumC0569ib4 = EnumC0569ib.EVENT_TYPE_SET_USER_PROFILE_ID;
        C0938wi c0938wi4 = this.f7229a;
        hashMap.put(enumC0569ib4, new Dl(c0938wi4, c0938wi4.f8580k));
        hashMap.put(EnumC0569ib.EVENT_TYPE_SEND_REVENUE_EVENT, c0750pb);
        hashMap.put(EnumC0569ib.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c0750pb);
        hashMap.put(EnumC0569ib.EVENT_TYPE_CLEANUP, c0750pb);
        hashMap.put(EnumC0569ib.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c0750pb);
        hashMap.put(EnumC0569ib.EVENT_TYPE_WEBVIEW_SYNC, c0750pb);
        hashMap.put(EnumC0569ib.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new L9(this.f7229a));
        return hashMap;
    }

    public final C0938wi b() {
        return this.f7229a;
    }

    public final void a(EnumC0569ib enumC0569ib, AbstractC0904va abstractC0904va) {
        this.f7230b.put(enumC0569ib, abstractC0904va);
    }

    @Override // io.appmetrica.analytics.impl.Kf
    public final AbstractC0438d9 a(int i3) {
        LinkedList linkedList = new LinkedList();
        EnumC0569ib a3 = EnumC0569ib.a(i3);
        C0950x4 c0950x4 = this.f7231c;
        if (c0950x4 != null) {
            c0950x4.a(a3, linkedList);
        }
        AbstractC0904va abstractC0904va = (AbstractC0904va) this.f7230b.get(a3);
        if (abstractC0904va != null) {
            abstractC0904va.a(linkedList);
        }
        return new C0412c9(linkedList);
    }

    public final AbstractC0904va a(EnumC0569ib enumC0569ib) {
        return (AbstractC0904va) this.f7230b.get(enumC0569ib);
    }
}
