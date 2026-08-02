package androidx.camera.view;

import C.InterfaceC2694n;
import C.S;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.InterfaceC5129y0;
import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.b;
import androidx.lifecycle.V;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p.InterfaceC8822a;

/* loaded from: classes8.dex */
final class f implements InterfaceC5129y0.a<I.a> {

    /* renamed from: a, reason: collision with root package name */
    private final H f38528a;

    /* renamed from: b, reason: collision with root package name */
    private final V<PreviewView.e> f38529b;

    /* renamed from: c, reason: collision with root package name */
    private PreviewView.e f38530c;

    /* renamed from: d, reason: collision with root package name */
    private final k f38531d;

    /* renamed from: e, reason: collision with root package name */
    I.d f38532e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f38533f = false;

    f(H h11, V<PreviewView.e> v11, k kVar) {
        this.f38528a = h11;
        this.f38529b = v11;
        this.f38531d = kVar;
        synchronized (this) {
            this.f38530c = v11.getValue();
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5129y0.a
    public final void a(I.a aVar) {
        I.a aVar2 = aVar;
        if (aVar2 == I.a.CLOSING || aVar2 == I.a.CLOSED || aVar2 == I.a.RELEASING || aVar2 == I.a.RELEASED) {
            c(PreviewView.e.IDLE);
            if (this.f38533f) {
                this.f38533f = false;
                I.d dVar = this.f38532e;
                if (dVar != null) {
                    dVar.cancel(false);
                    this.f38532e = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((aVar2 == I.a.OPENING || aVar2 == I.a.OPEN || aVar2 == I.a.PENDING_OPEN) && !this.f38533f) {
            c(PreviewView.e.IDLE);
            final ArrayList arrayList = new ArrayList();
            final H h11 = this.f38528a;
            I.d b11 = I.d.b(androidx.concurrent.futures.b.a(new b.c() { // from class: androidx.camera.view.c
                @Override // androidx.concurrent.futures.b.c
                public final Object c(b.a aVar3) {
                    this.getClass();
                    InterfaceC2694n interfaceC2694n = h11;
                    e eVar = new e(aVar3, interfaceC2694n);
                    arrayList.add(eVar);
                    ((H) interfaceC2694n).d(H.c.b(), eVar);
                    return "waitForCaptureResult";
                }
            }));
            I.a aVar3 = new I.a() { // from class: androidx.camera.view.a
                @Override // I.a, qc.o
                public final com.google.common.util.concurrent.m apply(Object obj) {
                    com.google.common.util.concurrent.m g10;
                    g10 = f.this.f38531d.g();
                    return g10;
                }
            };
            Executor b12 = H.c.b();
            b11.getClass();
            I.d dVar2 = (I.d) I.k.m((I.d) I.k.n(b11, aVar3, b12), new InterfaceC8822a() { // from class: androidx.camera.view.b
                @Override // p.InterfaceC8822a
                public final Object apply(Object obj) {
                    f.this.c(PreviewView.e.STREAMING);
                    return null;
                }
            }, H.c.b());
            this.f38532e = dVar2;
            I.k.b(dVar2, new d(h11, this, arrayList), H.c.b());
            this.f38533f = true;
        }
    }

    final void c(PreviewView.e eVar) {
        synchronized (this) {
            try {
                if (this.f38530c.equals(eVar)) {
                    return;
                }
                this.f38530c = eVar;
                S.a("StreamStateObserver", "Update Preview stream state to " + eVar);
                this.f38529b.postValue(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5129y0.a
    public final void onError(@NonNull Throwable th2) {
        I.d dVar = this.f38532e;
        if (dVar != null) {
            dVar.cancel(false);
            this.f38532e = null;
        }
        c(PreviewView.e.IDLE);
    }
}
