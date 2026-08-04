package M6;

import D6.C0130m;
import D6.I0;
import D6.InterfaceC0129l;
import F2.W0;
import I6.u;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements InterfaceC0129l, I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0130m f4610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f4611b;

    public c(d dVar, C0130m c0130m) {
        this.f4611b = dVar;
        this.f4610a = c0130m;
    }

    @Override // D6.I0
    public final void a(u uVar, int i7) throws IllegalAccessException, InvocationTargetException {
        this.f4610a.a(uVar, i7);
    }

    @Override // D6.InterfaceC0129l
    public final W0 b(Object obj, Function1 function1) {
        d dVar = this.f4611b;
        b bVar = new b(dVar, this, 1);
        W0 w0D = this.f4610a.D((p044f6.i) obj, bVar);
        if (w0D != null) {
            d.f4612g.set(dVar, null);
        }
        return w0D;
    }

    @Override // D6.InterfaceC0129l
    public final void d(Object obj, Function1 function1) throws IllegalAccessException, InvocationTargetException {
        p044f6.i iVar = p044f6.i.f13014a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f4612g;
        d dVar = this.f4611b;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f4610a.d(iVar, new b(dVar, this, 0));
    }

    @Override // D6.InterfaceC0129l
    public final void f(Object obj) {
        this.f4610a.f(obj);
    }

    @Override // p065i6.d
    public final p065i6.i getContext() {
        return this.f4610a.f1858e;
    }

    @Override // p065i6.d
    public final void resumeWith(Object obj) throws IllegalAccessException, InvocationTargetException {
        this.f4610a.resumeWith(obj);
    }
}
