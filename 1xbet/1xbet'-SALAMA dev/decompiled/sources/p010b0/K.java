package p010b0;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;
import t6.h;
import t6.i;

/* JADX INFO: loaded from: classes.dex */
public final class K extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K f9949a = new K(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        Throwable cancellationException = (Throwable) obj2;
        h.e(a0Var, "msg");
        if (cancellationException == null) {
            cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        a0Var.f10012b.O(cancellationException);
        return p044f6.i.f13014a;
    }
}
