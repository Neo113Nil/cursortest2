package p128r5;

import Q3.o;
import S5.a;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.C0726v;
import com.google.android.gms.common.internal.w;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p018c2.C0765k;
import p033e3.h;
import p078l.k;
import p151v2.d;
import p151v2.e;
import p151v2.f;
import p151v2.g;
import p151v2.p;
import p151v2.q;
import p159w5.b;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f16062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f16063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f16064g;

    public c(Looper looper, p pVar, f fVar) {
        this(new CopyOnWriteArraySet(), looper, pVar, fVar);
    }

    public void a(Object obj) {
        if (this.f16058a) {
            return;
        }
        obj.getClass();
        ((CopyOnWriteArraySet) this.f16062e).add(new g(obj));
    }

    public void b(p159w5.c cVar) {
        a.b("FlutterEngineConnectionRegistry#add ".concat(cVar.getClass().getSimpleName()));
        try {
            Class<?> cls = cVar.getClass();
            HashMap map = (HashMap) this.f16059b;
            if (map.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + cVar + ") but it was already registered with this FlutterEngine (" + ((b) this.f16061d) + ").");
                Trace.endSection();
                return;
            }
            cVar.toString();
            map.put(cVar.getClass(), cVar);
            cVar.onAttachedToEngine((b) this.f16062e);
            if (cVar instanceof p164x5.a) {
                p164x5.a aVar = (p164x5.a) cVar;
                ((HashMap) this.f16060c).put(cVar.getClass(), aVar);
                if (h()) {
                    aVar.onAttachedToActivity((o) this.f16064g);
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

    public void c(p121q5.c cVar, C0726v c0726v) {
        this.f16064g = new o(cVar, c0726v);
        boolean booleanExtra = cVar.getIntent() != null ? cVar.getIntent().getBooleanExtra("enable-software-rendering", false) : false;
        b bVar = (b) this.f16061d;
        s sVar = bVar.f16053r;
        sVar.f14211u = booleanExtra;
        if (sVar.f14194c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        sVar.f14194c = cVar;
        sVar.f14196e = bVar.f16038b;
        k kVar = bVar.f16039c;
        p028d6.k kVar2 = new p028d6.k(kVar, 25);
        sVar.f14198g = kVar2;
        kVar2.f12448c = sVar.f14212v;
        r rVar = bVar.f16054s;
        if (rVar.f14178c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        rVar.f14178c = cVar;
        w wVar = new w(kVar, 27);
        rVar.f14182g = wVar;
        wVar.f11336c = rVar.f14190p;
        for (p164x5.a aVar : ((HashMap) this.f16060c).values()) {
            if (this.f16058a) {
                aVar.onReattachedToActivityForConfigChanges((o) this.f16064g);
            } else {
                aVar.onAttachedToActivity((o) this.f16064g);
            }
        }
        this.f16058a = false;
    }

    public void d() {
        if (!h()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = ((HashMap) this.f16060c).values().iterator();
            while (it.hasNext()) {
                ((p164x5.a) it.next()).onDetachedFromActivity();
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
        b bVar = (b) this.f16061d;
        s sVar = bVar.f16053r;
        p028d6.k kVar = sVar.f14198g;
        if (kVar != null) {
            kVar.f12448c = null;
        }
        sVar.g();
        sVar.f14198g = null;
        sVar.f14194c = null;
        sVar.f14196e = null;
        r rVar = bVar.f16054s;
        w wVar = rVar.f14182g;
        if (wVar != null) {
            wVar.f11336c = null;
        }
        Surface surface = rVar.f14188n;
        if (surface != null) {
            surface.release();
            rVar.f14188n = null;
            rVar.f14189o = null;
        }
        rVar.f14182g = null;
        rVar.f14178c = null;
        this.f16063f = null;
        this.f16064g = null;
    }

    public void f() {
        if (h()) {
            d();
        }
    }

    public void g() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f16064g;
        if (arrayDeque.isEmpty()) {
            return;
        }
        p151v2.r rVar = (p151v2.r) this.f16060c;
        if (!rVar.f17154a.hasMessages(0)) {
            rVar.getClass();
            q qVarB = p151v2.r.b();
            qVarB.f17152a = rVar.f17154a.obtainMessage(0);
            rVar.getClass();
            Message message = qVarB.f17152a;
            message.getClass();
            rVar.f17154a.sendMessageAtFrontOfQueue(message);
            qVarB.a();
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) this.f16063f;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public boolean h() {
        return ((p121q5.f) this.f16063f) != null;
    }

    public void i(int i7, e eVar) {
        ((ArrayDeque) this.f16064g).add(new A0.a(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f16062e), i7, eVar, 4));
    }

    public void j() {
        CopyOnWriteArraySet<g> copyOnWriteArraySet = (CopyOnWriteArraySet) this.f16062e;
        for (g gVar : copyOnWriteArraySet) {
            gVar.f17114d = true;
            if (gVar.f17113c) {
                d dVarE = gVar.f17112b.e();
                ((f) this.f16061d).c(gVar.f17111a, dVarE);
            }
        }
        copyOnWriteArraySet.clear();
        this.f16058a = true;
    }

    public void k(int i7, e eVar) {
        i(i7, eVar);
        g();
    }

    public c(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, p pVar, f fVar) {
        this.f16059b = pVar;
        this.f16062e = copyOnWriteArraySet;
        this.f16061d = fVar;
        this.f16063f = new ArrayDeque();
        this.f16064g = new ArrayDeque();
        this.f16060c = pVar.a(looper, new C0765k(this, 1));
    }

    public c(Context context, b bVar, p148u5.c cVar) {
        this.f16059b = new HashMap();
        this.f16060c = new HashMap();
        this.f16058a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f16061d = bVar;
        this.f16062e = new b(context, bVar, bVar.f16039c, bVar.f16053r.f14192a, new h(cVar));
    }
}
