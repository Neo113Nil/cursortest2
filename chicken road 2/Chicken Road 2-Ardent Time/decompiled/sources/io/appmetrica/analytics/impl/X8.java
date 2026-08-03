package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class X8 extends io.appmetrica.analytics.impl.Ff {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0671ri f5292a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f5293b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0632q4 f5294c;

    public X8(io.appmetrica.analytics.impl.X4 x4) {
        io.appmetrica.analytics.impl.C0671ri c0671ri = new io.appmetrica.analytics.impl.C0671ri(x4);
        this.f5292a = c0671ri;
        this.f5294c = new io.appmetrica.analytics.impl.C0632q4(c0671ri);
        this.f5293b = a();
    }

    public final java.util.HashMap a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_ACTIVATION, new io.appmetrica.analytics.impl.C0394h(this.f5292a));
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_START, new io.appmetrica.analytics.impl.El(this.f5292a));
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_REGULAR, new io.appmetrica.analytics.impl.Gg(this.f5292a));
        io.appmetrica.analytics.impl.C0432ib c0432ib = new io.appmetrica.analytics.impl.C0432ib(this.f5292a);
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c0432ib);
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c0432ib);
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_REFERRER, c0432ib);
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_CUSTOM_EVENT, c0432ib);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SET_SESSION_EXTRA;
        io.appmetrica.analytics.impl.C0671ri c0671ri = this.f5292a;
        hashMap.put(enumC0251bb, new io.appmetrica.analytics.impl.C0882zl(c0671ri, c0671ri.t));
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_APP_OPEN, new io.appmetrica.analytics.impl.Ng(this.f5292a));
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_PURGE_BUFFER, new io.appmetrica.analytics.impl.Rf(this.f5292a));
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new io.appmetrica.analytics.impl.C0685s6(this.f5292a));
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new io.appmetrica.analytics.impl.C0772vf(this.f5292a));
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new io.appmetrica.analytics.impl.Vn(this.f5292a));
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new io.appmetrica.analytics.impl.C0798wf(this.f5292a));
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new io.appmetrica.analytics.impl.Un(this.f5292a));
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_ANR, c0432ib);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb2 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        io.appmetrica.analytics.impl.C0671ri c0671ri2 = this.f5292a;
        hashMap.put(enumC0251bb2, new io.appmetrica.analytics.impl.C0882zl(c0671ri2, c0671ri2.f6737e));
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb3 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        io.appmetrica.analytics.impl.C0671ri c0671ri3 = this.f5292a;
        hashMap.put(enumC0251bb3, new io.appmetrica.analytics.impl.C0882zl(c0671ri3, c0671ri3.f6738f));
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_USER_PROFILE, c0432ib);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb4 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SET_USER_PROFILE_ID;
        io.appmetrica.analytics.impl.C0671ri c0671ri4 = this.f5292a;
        hashMap.put(enumC0251bb4, new io.appmetrica.analytics.impl.C0882zl(c0671ri4, c0671ri4.f6743k));
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_REVENUE_EVENT, c0432ib);
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c0432ib);
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_CLEANUP, c0432ib);
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c0432ib);
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_WEBVIEW_SYNC, c0432ib);
        hashMap.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new io.appmetrica.analytics.impl.E9(this.f5292a));
        return hashMap;
    }

    public final io.appmetrica.analytics.impl.C0671ri b() {
        return this.f5292a;
    }

    public final void a(io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb, io.appmetrica.analytics.impl.AbstractC0586oa abstractC0586oa) {
        this.f5293b.put(enumC0251bb, abstractC0586oa);
    }

    @Override // io.appmetrica.analytics.impl.Ff
    public final io.appmetrica.analytics.impl.W8 a(int i2) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        io.appmetrica.analytics.impl.EnumC0251bb a2 = io.appmetrica.analytics.impl.EnumC0251bb.a(i2);
        io.appmetrica.analytics.impl.C0632q4 c0632q4 = this.f5294c;
        if (c0632q4 != null) {
            c0632q4.a(a2, linkedList);
        }
        io.appmetrica.analytics.impl.AbstractC0586oa abstractC0586oa = (io.appmetrica.analytics.impl.AbstractC0586oa) this.f5293b.get(a2);
        if (abstractC0586oa != null) {
            abstractC0586oa.a(linkedList);
        }
        return new io.appmetrica.analytics.impl.V8(linkedList);
    }

    public final io.appmetrica.analytics.impl.AbstractC0586oa a(io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb) {
        return (io.appmetrica.analytics.impl.AbstractC0586oa) this.f5293b.get(enumC0251bb);
    }
}
