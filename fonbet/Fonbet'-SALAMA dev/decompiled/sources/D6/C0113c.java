package D6;

import F2.W0;
import f6.C1116i;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: D6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0113c extends AbstractC0126i0 {

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1819y = AtomicReferenceFieldUpdater.newUpdater(C0113c.class, Object.class, "_disposer");
    private volatile Object _disposer;

    /* renamed from: e, reason: collision with root package name */
    public final C0130m f1820e;

    /* renamed from: f, reason: collision with root package name */
    public O f1821f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0117e f1822x;

    public C0113c(C0117e c0117e, C0130m c0130m) {
        this.f1822x = c0117e;
        this.f1820e = c0130m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return C1116i.f13008a;
    }

    @Override // D6.AbstractC0126i0
    public final void j(Throwable th) {
        C0130m c0130m = this.f1820e;
        if (th != null) {
            c0130m.getClass();
            W0 D7 = c0130m.D(new C0138v(false, th), null);
            if (D7 != null) {
                c0130m.f(D7);
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
