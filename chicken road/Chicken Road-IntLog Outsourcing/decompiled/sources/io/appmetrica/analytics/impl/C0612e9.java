package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.e9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0612e9 extends Kf {

    /* renamed from: a, reason: collision with root package name */
    public final C1087wi f8123a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8124b;

    /* renamed from: c, reason: collision with root package name */
    public final C1099x4 f8125c;

    public C0612e9(C0608e5 c0608e5) {
        C1087wi c1087wi = new C1087wi(c0608e5);
        this.f8123a = c1087wi;
        this.f8125c = new C1099x4(c1087wi);
        this.f8124b = a();
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0718ib.EVENT_TYPE_ACTIVATION, new C0680h(this.f8123a));
        hashMap.put(EnumC0718ib.EVENT_TYPE_START, new Il(this.f8123a));
        hashMap.put(EnumC0718ib.EVENT_TYPE_REGULAR, new Lg(this.f8123a));
        C0899pb c0899pb = new C0899pb(this.f8123a);
        hashMap.put(EnumC0718ib.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c0899pb);
        hashMap.put(EnumC0718ib.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c0899pb);
        hashMap.put(EnumC0718ib.EVENT_TYPE_SEND_REFERRER, c0899pb);
        hashMap.put(EnumC0718ib.EVENT_TYPE_CUSTOM_EVENT, c0899pb);
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_SET_SESSION_EXTRA;
        C1087wi c1087wi = this.f8123a;
        hashMap.put(enumC0718ib, new Dl(c1087wi, c1087wi.f9548t));
        hashMap.put(EnumC0718ib.EVENT_TYPE_APP_OPEN, new Sg(this.f8123a));
        hashMap.put(EnumC0718ib.EVENT_TYPE_PURGE_BUFFER, new Wf(this.f8123a));
        hashMap.put(EnumC0718ib.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C1151z6(this.f8123a));
        hashMap.put(EnumC0718ib.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new Af(this.f8123a));
        hashMap.put(EnumC0718ib.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Xn(this.f8123a));
        hashMap.put(EnumC0718ib.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new Bf(this.f8123a));
        hashMap.put(EnumC0718ib.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new Wn(this.f8123a));
        hashMap.put(EnumC0718ib.EVENT_TYPE_ANR, c0899pb);
        EnumC0718ib enumC0718ib2 = EnumC0718ib.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C1087wi c1087wi2 = this.f8123a;
        hashMap.put(enumC0718ib2, new Dl(c1087wi2, c1087wi2.f9533e));
        EnumC0718ib enumC0718ib3 = EnumC0718ib.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C1087wi c1087wi3 = this.f8123a;
        hashMap.put(enumC0718ib3, new Dl(c1087wi3, c1087wi3.f9534f));
        hashMap.put(EnumC0718ib.EVENT_TYPE_SEND_USER_PROFILE, c0899pb);
        EnumC0718ib enumC0718ib4 = EnumC0718ib.EVENT_TYPE_SET_USER_PROFILE_ID;
        C1087wi c1087wi4 = this.f8123a;
        hashMap.put(enumC0718ib4, new Dl(c1087wi4, c1087wi4.f9539k));
        hashMap.put(EnumC0718ib.EVENT_TYPE_SEND_REVENUE_EVENT, c0899pb);
        hashMap.put(EnumC0718ib.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c0899pb);
        hashMap.put(EnumC0718ib.EVENT_TYPE_CLEANUP, c0899pb);
        hashMap.put(EnumC0718ib.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c0899pb);
        hashMap.put(EnumC0718ib.EVENT_TYPE_WEBVIEW_SYNC, c0899pb);
        hashMap.put(EnumC0718ib.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new L9(this.f8123a));
        return hashMap;
    }

    public final C1087wi b() {
        return this.f8123a;
    }

    public final void a(EnumC0718ib enumC0718ib, AbstractC1053va abstractC1053va) {
        this.f8124b.put(enumC0718ib, abstractC1053va);
    }

    @Override // io.appmetrica.analytics.impl.Kf
    public final AbstractC0587d9 a(int i2) {
        LinkedList linkedList = new LinkedList();
        EnumC0718ib a6 = EnumC0718ib.a(i2);
        C1099x4 c1099x4 = this.f8125c;
        if (c1099x4 != null) {
            c1099x4.a(a6, linkedList);
        }
        AbstractC1053va abstractC1053va = (AbstractC1053va) this.f8124b.get(a6);
        if (abstractC1053va != null) {
            abstractC1053va.a(linkedList);
        }
        return new C0561c9(linkedList);
    }

    public final AbstractC1053va a(EnumC0718ib enumC0718ib) {
        return (AbstractC1053va) this.f8124b.get(enumC0718ib);
    }
}
