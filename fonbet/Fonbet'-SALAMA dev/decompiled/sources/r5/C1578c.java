package r5;

import Q3.o;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.C0747v;
import c2.C0805k;
import com.google.android.gms.common.internal.w;
import d6.C0977k;
import e3.C1023h;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import l.C1373k;
import q5.AbstractActivityC1559c;
import q5.C1562f;
import u5.C1649c;
import v2.p;
import v2.q;
import w5.C1782b;
import w5.InterfaceC1783c;
import x5.InterfaceC1789a;

/* renamed from: r5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1578c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16052a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16053b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16054c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16055d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f16056e;

    /* renamed from: f, reason: collision with root package name */
    public Object f16057f;

    /* renamed from: g, reason: collision with root package name */
    public Object f16058g;

    public C1578c(Looper looper, p pVar, v2.f fVar) {
        this(new CopyOnWriteArraySet(), looper, pVar, fVar);
    }

    public void a(Object obj) {
        if (this.f16052a) {
            return;
        }
        obj.getClass();
        ((CopyOnWriteArraySet) this.f16056e).add(new v2.g(obj));
    }

    public void b(InterfaceC1783c interfaceC1783c) {
        S5.a.b("FlutterEngineConnectionRegistry#add ".concat(interfaceC1783c.getClass().getSimpleName()));
        try {
            Class<?> cls = interfaceC1783c.getClass();
            HashMap hashMap = (HashMap) this.f16053b;
            if (hashMap.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + interfaceC1783c + ") but it was already registered with this FlutterEngine (" + ((C1577b) this.f16055d) + ").");
                Trace.endSection();
                return;
            }
            interfaceC1783c.toString();
            hashMap.put(interfaceC1783c.getClass(), interfaceC1783c);
            interfaceC1783c.onAttachedToEngine((C1782b) this.f16056e);
            if (interfaceC1783c instanceof InterfaceC1789a) {
                InterfaceC1789a interfaceC1789a = (InterfaceC1789a) interfaceC1783c;
                ((HashMap) this.f16054c).put(interfaceC1783c.getClass(), interfaceC1789a);
                if (h()) {
                    interfaceC1789a.onAttachedToActivity((o) this.f16058g);
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void c(AbstractActivityC1559c abstractActivityC1559c, C0747v c0747v) {
        this.f16058g = new o(abstractActivityC1559c, c0747v);
        boolean booleanExtra = abstractActivityC1559c.getIntent() != null ? abstractActivityC1559c.getIntent().getBooleanExtra("enable-software-rendering", false) : false;
        C1577b c1577b = (C1577b) this.f16055d;
        s sVar = c1577b.f16047r;
        sVar.f14205u = booleanExtra;
        if (sVar.f14188c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        sVar.f14188c = abstractActivityC1559c;
        sVar.f14190e = c1577b.f16032b;
        C1373k c1373k = c1577b.f16033c;
        C0977k c0977k = new C0977k(c1373k, 25);
        sVar.f14192g = c0977k;
        c0977k.f12442c = sVar.f14206v;
        r rVar = c1577b.f16048s;
        if (rVar.f14172c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        rVar.f14172c = abstractActivityC1559c;
        w wVar = new w(c1373k, 27);
        rVar.f14176g = wVar;
        wVar.f11336c = rVar.f14184p;
        for (InterfaceC1789a interfaceC1789a : ((HashMap) this.f16054c).values()) {
            if (this.f16052a) {
                interfaceC1789a.onReattachedToActivityForConfigChanges((o) this.f16058g);
            } else {
                interfaceC1789a.onAttachedToActivity((o) this.f16058g);
            }
        }
        this.f16052a = false;
    }

    public void d() {
        if (!h()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        S5.a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = ((HashMap) this.f16054c).values().iterator();
            while (it.hasNext()) {
                ((InterfaceC1789a) it.next()).onDetachedFromActivity();
            }
            e();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void e() {
        C1577b c1577b = (C1577b) this.f16055d;
        s sVar = c1577b.f16047r;
        C0977k c0977k = sVar.f14192g;
        if (c0977k != null) {
            c0977k.f12442c = null;
        }
        sVar.g();
        sVar.f14192g = null;
        sVar.f14188c = null;
        sVar.f14190e = null;
        r rVar = c1577b.f16048s;
        w wVar = rVar.f14176g;
        if (wVar != null) {
            wVar.f11336c = null;
        }
        Surface surface = rVar.f14182n;
        if (surface != null) {
            surface.release();
            rVar.f14182n = null;
            rVar.f14183o = null;
        }
        rVar.f14176g = null;
        rVar.f14172c = null;
        this.f16057f = null;
        this.f16058g = null;
    }

    public void f() {
        if (h()) {
            d();
        }
    }

    public void g() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f16058g;
        if (arrayDeque.isEmpty()) {
            return;
        }
        v2.r rVar = (v2.r) this.f16054c;
        if (!rVar.f17148a.hasMessages(0)) {
            rVar.getClass();
            q b7 = v2.r.b();
            b7.f17146a = rVar.f17148a.obtainMessage(0);
            rVar.getClass();
            Message message = b7.f17146a;
            message.getClass();
            rVar.f17148a.sendMessageAtFrontOfQueue(message);
            b7.a();
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) this.f16057f;
        boolean isEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (isEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public boolean h() {
        return ((C1562f) this.f16057f) != null;
    }

    public void i(int i7, v2.e eVar) {
        ((ArrayDeque) this.f16058g).add(new A0.a(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f16056e), i7, eVar, 4));
    }

    public void j() {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f16056e;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            v2.g gVar = (v2.g) it.next();
            gVar.f17108d = true;
            if (gVar.f17107c) {
                v2.d e7 = gVar.f17106b.e();
                ((v2.f) this.f16055d).c(gVar.f17105a, e7);
            }
        }
        copyOnWriteArraySet.clear();
        this.f16052a = true;
    }

    public void k(int i7, v2.e eVar) {
        i(i7, eVar);
        g();
    }

    public C1578c(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, p pVar, v2.f fVar) {
        this.f16053b = pVar;
        this.f16056e = copyOnWriteArraySet;
        this.f16055d = fVar;
        this.f16057f = new ArrayDeque();
        this.f16058g = new ArrayDeque();
        this.f16054c = pVar.a(looper, new C0805k(this, 1));
    }

    public C1578c(Context context, C1577b c1577b, C1649c c1649c) {
        this.f16053b = new HashMap();
        this.f16054c = new HashMap();
        this.f16052a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f16055d = c1577b;
        this.f16056e = new C1782b(context, c1577b, c1577b.f16033c, c1577b.f16047r.f14186a, new C1023h(c1649c));
    }
}
