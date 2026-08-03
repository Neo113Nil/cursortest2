package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218a4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f5454a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0297d5 f5455b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f5456c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0612pa f5457d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f5458e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0425i4 f5459f;

    public C0218a4(android.content.Context context, io.appmetrica.analytics.impl.C0297d5 c0297d5) {
        this(context, c0297d5, new io.appmetrica.analytics.impl.C0425i4());
    }

    public final io.appmetrica.analytics.impl.InterfaceC0347f4 a(io.appmetrica.analytics.impl.P3 p3, io.appmetrica.analytics.impl.C0606p4 c0606p4) {
        io.appmetrica.analytics.impl.InterfaceC0347f4 interfaceC0347f4;
        synchronized (this.f5454a) {
            try {
                interfaceC0347f4 = (io.appmetrica.analytics.impl.InterfaceC0347f4) this.f5456c.get(p3);
                if (interfaceC0347f4 == null) {
                    this.f5459f.getClass();
                    interfaceC0347f4 = io.appmetrica.analytics.impl.C0425i4.a(p3).a(this.f5458e, this.f5455b, p3, c0606p4);
                    this.f5456c.put(p3, interfaceC0347f4);
                    this.f5457d.a(new io.appmetrica.analytics.impl.Z3(p3.f4809b, p3.f4810c, p3.f4811d), p3);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return interfaceC0347f4;
    }

    public C0218a4(android.content.Context context, io.appmetrica.analytics.impl.C0297d5 c0297d5, io.appmetrica.analytics.impl.C0425i4 c0425i4) {
        this.f5454a = new java.lang.Object();
        this.f5456c = new java.util.HashMap();
        this.f5457d = new io.appmetrica.analytics.impl.C0612pa();
        this.f5458e = context.getApplicationContext();
        this.f5455b = c0297d5;
        this.f5459f = c0425i4;
    }

    public final void a(java.lang.String str, java.lang.Integer num, java.lang.String str2) {
        synchronized (this.f5454a) {
            try {
                io.appmetrica.analytics.impl.C0612pa c0612pa = this.f5457d;
                java.util.Collection collection = (java.util.Collection) c0612pa.f6642a.remove(new io.appmetrica.analytics.impl.Z3(str, num, str2));
                if (!io.appmetrica.analytics.impl.AbstractC0522lo.a(collection)) {
                    collection.size();
                    java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
                    java.util.Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add((io.appmetrica.analytics.impl.InterfaceC0347f4) this.f5456c.remove((io.appmetrica.analytics.impl.P3) it.next()));
                    }
                    java.util.Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((io.appmetrica.analytics.impl.InterfaceC0347f4) it2.next()).a();
                    }
                }
            } finally {
            }
        }
    }
}
