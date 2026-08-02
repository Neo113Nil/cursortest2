package a0;

import X3.B;
import java.util.List;
import kotlin.jvm.internal.l;
import r0.AbstractC2346c;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0448d extends RuntimeException {

    /* renamed from: k, reason: collision with root package name */
    public final List f6366k;

    public C0448d(List list) {
        this.f6366k = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        Y3.c cVar = new Y3.c(10);
        List list = this.f6366k;
        l.f("<this>", list);
        B b3 = new B(list);
        if (b3.c() > 0) {
            ((C0445a) b3.get(0)).getClass();
            throw null;
        }
        Y3.c e3 = AbstractC2346c.e(cVar);
        l.f("<this>", e3);
        B b5 = new B(e3);
        int c5 = b5.c();
        for (int i = 0; i < c5; i++) {
            sb.append("\tat " + ((String) b5.get(i)));
            sb.append('\n');
        }
        String sb2 = sb.toString();
        l.e("toString(...)", sb2);
        return sb2;
    }
}
