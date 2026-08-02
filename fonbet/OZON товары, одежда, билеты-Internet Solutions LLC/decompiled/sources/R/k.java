package R;

import B90.C2601c;
import B90.C2603e;
import B90.b0;
import E.InterfaceC2894j;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C5090e0;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.Q;
import com.google.common.util.concurrent.m;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class k extends C5090e0 {

    /* renamed from: c, reason: collision with root package name */
    private final b0 f23890c;

    k(@NonNull E e11, @NonNull b0 b0Var) {
        super(e11);
        this.f23890c = b0Var;
    }

    public static m p(k kVar, List list) {
        kVar.getClass();
        Object obj = 100;
        try {
            obj = ((A0) ((Q) list.get(0)).f()).a(Q.f38178j);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) obj;
        Objects.requireNonNull(num);
        int intValue = num.intValue();
        Object obj2 = 0;
        try {
            obj2 = ((A0) ((Q) list.get(0)).f()).a(Q.f38177i);
        } catch (IllegalArgumentException unused2) {
        }
        Integer num2 = (Integer) obj2;
        Objects.requireNonNull(num2);
        return c.W((c) kVar.f23890c.f3137b, intValue, num2.intValue());
    }

    @Override // androidx.camera.core.impl.C5090e0, androidx.camera.core.impl.E
    @NonNull
    public final m j(int i11, int i12, @NonNull final List list) {
        x2.i.a("Only support one capture config.", list.size() == 1);
        m<InterfaceC2894j> n11 = n(i11, i12);
        I.d b11 = I.d.b(n11);
        C2601c c2601c = new C2601c(n11);
        Executor b12 = H.c.b();
        b11.getClass();
        return I.k.c(Collections.singletonList((I.d) I.k.n((I.d) I.k.n((I.d) I.k.n(b11, c2601c, b12), new I.a() { // from class: R.j
            @Override // I.a, qc.o
            public final m apply(Object obj) {
                return k.p(k.this, list);
            }
        }, H.c.b()), new C2603e(n11), H.c.b())));
    }
}
