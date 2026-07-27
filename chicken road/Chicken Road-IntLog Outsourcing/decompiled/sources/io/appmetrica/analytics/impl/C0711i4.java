package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.i4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0711i4 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8379a;

    /* renamed from: b, reason: collision with root package name */
    public final C0763k5 f8380b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f8381c;

    /* renamed from: d, reason: collision with root package name */
    public final C1079wa f8382d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f8383e;

    /* renamed from: f, reason: collision with root package name */
    public final C0892p4 f8384f;

    public C0711i4(Context context, C0763k5 c0763k5) {
        this(context, c0763k5, new C0892p4());
    }

    public final InterfaceC0814m4 a(X3 x32, C1073w4 c1073w4) {
        InterfaceC0814m4 interfaceC0814m4;
        synchronized (this.f8379a) {
            try {
                interfaceC0814m4 = (InterfaceC0814m4) this.f8381c.get(x32);
                if (interfaceC0814m4 == null) {
                    this.f8384f.getClass();
                    interfaceC0814m4 = C0892p4.a(x32).a(this.f8383e, this.f8380b, x32, c1073w4);
                    this.f8381c.put(x32, interfaceC0814m4);
                    this.f8382d.a(new C0685h4(x32.f7693b, x32.f7694c, x32.f7695d), x32);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0814m4;
    }

    public C0711i4(Context context, C0763k5 c0763k5, C0892p4 c0892p4) {
        this.f8379a = new Object();
        this.f8381c = new HashMap();
        this.f8382d = new C1079wa();
        this.f8383e = context.getApplicationContext();
        this.f8380b = c0763k5;
        this.f8384f = c0892p4;
    }

    public final void a(String str, Integer num, String str2) {
        synchronized (this.f8379a) {
            try {
                C1079wa c1079wa = this.f8382d;
                Collection collection = (Collection) c1079wa.f9514a.remove(new C0685h4(str, num, str2));
                if (!AbstractC0860no.a(collection)) {
                    collection.size();
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC0814m4) this.f8381c.remove((X3) it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC0814m4) it2.next()).a();
                    }
                }
            } finally {
            }
        }
    }
}
