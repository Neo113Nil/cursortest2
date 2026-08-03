package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.rh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0670rh implements io.appmetrica.analytics.impl.InterfaceC0625pn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0455j9 f6731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0748uh f6732b;

    public C0670rh(io.appmetrica.analytics.impl.C0748uh c0748uh, io.appmetrica.analytics.impl.C0455j9 c0455j9) {
        this.f6732b = c0748uh;
        this.f6731a = c0455j9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0625pn
    public final void a(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        io.appmetrica.analytics.impl.C0455j9 c0455j9 = this.f6731a;
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) list)) {
            return;
        }
        c0455j9.f6173d = new io.appmetrica.analytics.impl.C0404h9[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            io.appmetrica.analytics.impl.C0441il c0441il = (io.appmetrica.analytics.impl.C0441il) list.get(i2);
            io.appmetrica.analytics.impl.C0404h9[] c0404h9Arr = c0455j9.f6173d;
            java.util.Map map = io.appmetrica.analytics.impl.Pf.f4838a;
            io.appmetrica.analytics.impl.C0404h9 c0404h9 = new io.appmetrica.analytics.impl.C0404h9();
            java.lang.Integer num = c0441il.f6106a;
            if (num != null) {
                c0404h9.f6043a = num.intValue();
            }
            java.lang.Integer num2 = c0441il.f6107b;
            if (num2 != null) {
                c0404h9.f6044b = num2.intValue();
            }
            if (!android.text.TextUtils.isEmpty(c0441il.f6109d)) {
                c0404h9.f6045c = c0441il.f6109d;
            }
            c0404h9.f6046d = c0441il.f6108c;
            c0404h9Arr[i2] = c0404h9;
            this.f6732b.f6913g += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSizeNoTag(c0455j9.f6173d[i2]);
            this.f6732b.f6913g += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
