package a4;

import b4.EnumC0510a;
import c4.InterfaceC0543d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class j implements c, InterfaceC0543d {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6650l = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "result");

    /* renamed from: k, reason: collision with root package name */
    public final c f6651k;
    private volatile Object result;

    public j(c cVar, EnumC0510a enumC0510a) {
        this.f6651k = cVar;
        this.result = enumC0510a;
    }

    public final Object b() {
        Object obj = this.result;
        EnumC0510a enumC0510a = EnumC0510a.f7290l;
        if (obj == enumC0510a) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6650l;
            EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC0510a, enumC0510a2)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC0510a) {
                    obj = this.result;
                }
            }
            return EnumC0510a.f7289k;
        }
        if (obj == EnumC0510a.f7291m) {
            return EnumC0510a.f7289k;
        }
        if (obj instanceof W3.j) {
            throw ((W3.j) obj).f6038k;
        }
        return obj;
    }

    @Override // c4.InterfaceC0543d
    public final InterfaceC0543d getCallerFrame() {
        c cVar = this.f6651k;
        if (cVar instanceof InterfaceC0543d) {
            return (InterfaceC0543d) cVar;
        }
        return null;
    }

    @Override // a4.c
    public final h getContext() {
        return this.f6651k.getContext();
    }

    @Override // a4.c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC0510a enumC0510a = EnumC0510a.f7290l;
            if (obj2 == enumC0510a) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6650l;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC0510a, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC0510a) {
                        break;
                    }
                }
                return;
            }
            EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
            if (obj2 != enumC0510a2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6650l;
            EnumC0510a enumC0510a3 = EnumC0510a.f7291m;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC0510a2, enumC0510a3)) {
                if (atomicReferenceFieldUpdater2.get(this) != enumC0510a2) {
                    break;
                }
            }
            this.f6651k.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f6651k;
    }
}
