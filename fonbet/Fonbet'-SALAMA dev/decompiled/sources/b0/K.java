package b0;

import f6.C1116i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class K extends t6.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final K f9949a = new K(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        Throwable th = (Throwable) obj2;
        t6.h.e(a0Var, "msg");
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        a0Var.f10012b.O(th);
        return C1116i.f13008a;
    }
}
