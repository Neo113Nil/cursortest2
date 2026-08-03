package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255bf implements io.appmetrica.analytics.impl.InterfaceC0264bo {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5579a;

    public C0255bf(io.appmetrica.analytics.impl.C0307df c0307df) {
        boolean z2;
        java.util.List<io.appmetrica.analytics.impl.C0281cf> list = c0307df.f5727b;
        if (list == null || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((io.appmetrica.analytics.impl.C0281cf) it.next()).f5658c == io.appmetrica.analytics.impl.S7.f4954c) {
                    z2 = false;
                    break;
                }
            }
        }
        z2 = true;
        this.f5579a = z2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0264bo, s1.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.List<io.appmetrica.analytics.impl.C0281cf> invoke(java.util.List<? extends io.appmetrica.analytics.impl.C0281cf> list, io.appmetrica.analytics.impl.C0643qf c0643qf) {
        io.appmetrica.analytics.impl.C0281cf c0281cf = new io.appmetrica.analytics.impl.C0281cf(c0643qf.f6687a, c0643qf.f6688b, c0643qf.f6691e);
        if (list == null || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((io.appmetrica.analytics.impl.C0281cf) it.next()).f5658c == c0643qf.f6691e) {
                    if (c0281cf.f5658c == io.appmetrica.analytics.impl.S7.f4954c && this.f5579a) {
                        return i1.AbstractC0190i.S(list, c0281cf);
                    }
                    return null;
                }
            }
        }
        return i1.AbstractC0190i.S(list, c0281cf);
    }
}
