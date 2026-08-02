package D6;

import f6.C1116i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* renamed from: D6.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0116d0 extends AbstractC0122g0 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1825f = AtomicIntegerFieldUpdater.newUpdater(C0116d0.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f1826e;

    public C0116d0(Function1 function1) {
        this.f1826e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return C1116i.f13008a;
    }

    @Override // D6.AbstractC0126i0
    public final void j(Throwable th) {
        if (f1825f.compareAndSet(this, 0, 1)) {
            this.f1826e.invoke(th);
        }
    }
}
