package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.i4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562i4 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7473a;

    /* renamed from: b, reason: collision with root package name */
    public final C0614k5 f7474b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7475c;

    /* renamed from: d, reason: collision with root package name */
    public final C0930wa f7476d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f7477e;
    public final C0743p4 f;

    public C0562i4(Context context, C0614k5 c0614k5) {
        this(context, c0614k5, new C0743p4());
    }

    public final InterfaceC0665m4 a(X3 x3, C0924w4 c0924w4) {
        InterfaceC0665m4 interfaceC0665m4;
        synchronized (this.f7473a) {
            try {
                interfaceC0665m4 = (InterfaceC0665m4) this.f7475c.get(x3);
                if (interfaceC0665m4 == null) {
                    this.f.getClass();
                    interfaceC0665m4 = C0743p4.a(x3).a(this.f7477e, this.f7474b, x3, c0924w4);
                    this.f7475c.put(x3, interfaceC0665m4);
                    this.f7476d.a(new C0536h4(x3.f6818b, x3.f6819c, x3.f6820d), x3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0665m4;
    }

    public C0562i4(Context context, C0614k5 c0614k5, C0743p4 c0743p4) {
        this.f7473a = new Object();
        this.f7475c = new HashMap();
        this.f7476d = new C0930wa();
        this.f7477e = context.getApplicationContext();
        this.f7474b = c0614k5;
        this.f = c0743p4;
    }

    public final void a(String str, Integer num, String str2) {
        synchronized (this.f7473a) {
            try {
                C0930wa c0930wa = this.f7476d;
                Collection collection = (Collection) c0930wa.f8557a.remove(new C0536h4(str, num, str2));
                if (!AbstractC0711no.a(collection)) {
                    collection.size();
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC0665m4) this.f7475c.remove((X3) it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC0665m4) it2.next()).a();
                    }
                }
            } finally {
            }
        }
    }
}
