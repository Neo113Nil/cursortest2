package D6;

import F2.W0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: D6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0113c extends AbstractC0126i0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1819y = AtomicReferenceFieldUpdater.newUpdater(C0113c.class, Object.class, "_disposer");
    private volatile Object _disposer;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0130m f1820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public O f1821f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0117e f1822x;

    public C0113c(C0117e c0117e, C0130m c0130m) {
        this.f1822x = c0117e;
        this.f1820e = c0130m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        j((Throwable) obj);
        return p044f6.i.f13014a;
    }

    @Override // D6.AbstractC0126i0
    public final void j(Throwable th) throws IllegalAccessException, InvocationTargetException {
        C0130m c0130m = this.f1820e;
        if (th != null) {
            c0130m.getClass();
            W0 w0D = c0130m.D(new C0138v(false, th), null);
            if (w0D != null) {
                c0130m.f(w0D);
                C0115d c0115d = (C0115d) f1819y.get(this);
                if (c0115d != null) {
                    c0115d.c();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0117e.f1827b;
        C0117e c0117e = this.f1822x;
        if (atomicIntegerFieldUpdater.decrementAndGet(c0117e) == 0) {
            H[] hArr = c0117e.f1828a;
            ArrayList arrayList = new ArrayList(hArr.length);
            for (H h6 : hArr) {
                arrayList.add(h6.getCompleted());
            }
            c0130m.resumeWith(arrayList);
        }
    }
}
