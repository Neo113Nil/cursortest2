package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class E4 implements La, Ul, Na {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5882a;

    /* renamed from: b, reason: collision with root package name */
    public final X4 f5883b;

    /* renamed from: c, reason: collision with root package name */
    public final Em f5884c;

    /* renamed from: d, reason: collision with root package name */
    public final Eh f5885d;

    /* renamed from: e, reason: collision with root package name */
    public final L4 f5886e;
    public final C0736on f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f5887g;

    /* renamed from: h, reason: collision with root package name */
    public final Y4 f5888h;

    /* renamed from: i, reason: collision with root package name */
    public final C0781qg f5889i;

    /* renamed from: j, reason: collision with root package name */
    public final C0381b4 f5890j;

    /* renamed from: k, reason: collision with root package name */
    public final C0910vg f5891k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f5892l;

    public E4(Context context, Ll ll, X4 x4, C0924w4 c0924w4, C0781qg c0781qg) {
        this(context, ll, x4, c0924w4, new Eh(c0924w4.f8541b), c0781qg, new Y4(), new G4(), new C0910vg());
    }

    public static void b(C0924w4 c0924w4) {
        C0878ua.f8414H.c().b(!Boolean.FALSE.equals(c0924w4.f8541b.f8485n));
    }

    @Override // io.appmetrica.analytics.impl.La
    public final void a(C0898v4 c0898v4) {
        Eh eh = this.f5885d;
        eh.f5912a = eh.f5912a.mergeFrom(c0898v4);
    }

    @Override // io.appmetrica.analytics.impl.La
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    public final C0898v4 d() {
        return this.f5885d.f5912a;
    }

    public final C0781qg e() {
        return this.f5889i;
    }

    @Override // io.appmetrica.analytics.impl.La
    public final Context getContext() {
        return this.f5882a;
    }

    public E4(Context context, Ll ll, X4 x4, C0924w4 c0924w4, Eh eh, C0781qg c0781qg, Y4 y4, G4 g4, C0910vg c0910vg) {
        this.f5887g = new ArrayList();
        this.f5892l = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f5882a = applicationContext;
        this.f5883b = x4;
        this.f5885d = eh;
        this.f5888h = y4;
        this.f5886e = G4.a(this);
        b(c0924w4);
        Em a3 = ll.a(applicationContext, x4, c0924w4.f8540a);
        this.f5884c = a3;
        this.f5890j = AbstractC0407c4.a(a3, C0878ua.k().c());
        this.f = g4.a(this, a3);
        this.f5889i = c0781qg;
        this.f5891k = c0910vg;
        ll.a(x4, this);
    }

    public final synchronized void a(B4 b4) {
        this.f5888h.f6848a.add(b4);
        I6.a(b4.f5752c, this.f5890j.a(Jm.a(this.f5884c.e().f7652l)));
    }

    public final synchronized void b(B4 b4) {
        this.f5888h.f6848a.remove(b4);
    }

    @Override // io.appmetrica.analytics.impl.La
    public final X4 b() {
        return this.f5883b;
    }

    public final void a(W5 w5, B4 b4) {
        L4 l4 = this.f5886e;
        l4.getClass();
        l4.a(w5, new K4(b4));
    }

    @Override // io.appmetrica.analytics.impl.Ul
    public final void a(Nl nl, C0605jm c0605jm) {
        synchronized (this.f5892l) {
            try {
                Iterator it = this.f5887g.iterator();
                while (it.hasNext()) {
                    C0465eb c0465eb = (C0465eb) it.next();
                    I6.a(c0465eb.f7232a, nl, this.f5890j.a(c0465eb.f7234c));
                }
                this.f5887g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ul
    public final void a(C0605jm c0605jm) {
        synchronized (this.f5892l) {
            try {
                Iterator it = this.f5888h.f6848a.iterator();
                while (it.hasNext()) {
                    B4 b4 = (B4) it.next();
                    I6.a(b4.f5752c, this.f5890j.a(Jm.a(c0605jm.f7652l)));
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.f5887g.iterator();
                while (it2.hasNext()) {
                    C0465eb c0465eb = (C0465eb) it2.next();
                    if (AbstractC0528gm.a(c0605jm, c0465eb.f7233b, c0465eb.f7234c, new C0414cb())) {
                        I6.a(c0465eb.f7232a, this.f5890j.a(c0465eb.f7234c));
                    } else {
                        arrayList.add(c0465eb);
                    }
                }
                this.f5887g = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(C0465eb c0465eb) {
        ResultReceiver resultReceiver;
        HashMap hashMap;
        List<String> list;
        HashMap hashMap2 = new HashMap();
        if (c0465eb != null) {
            list = c0465eb.f7233b;
            resultReceiver = c0465eb.f7232a;
            hashMap = c0465eb.f7234c;
        } else {
            resultReceiver = null;
            hashMap = hashMap2;
            list = null;
        }
        boolean a3 = this.f5884c.a(list, hashMap);
        if (!a3) {
            I6.a(resultReceiver, this.f5890j.a(hashMap));
        }
        if (!this.f5884c.g()) {
            if (a3) {
                I6.a(resultReceiver, this.f5890j.a(hashMap));
                return;
            }
            return;
        }
        synchronized (this.f5892l) {
            if (a3 && c0465eb != null) {
                try {
                    this.f5887g.add(c0465eb);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f.c();
    }

    public final void a(ResultReceiver resultReceiver) {
        this.f5891k.a(new D4(resultReceiver));
    }

    public final C0381b4 a() {
        return this.f5890j;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(C0924w4 c0924w4) {
        this.f5884c.a(c0924w4.f8540a);
        a(c0924w4.f8541b);
    }
}
